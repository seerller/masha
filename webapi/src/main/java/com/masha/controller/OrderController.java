package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlOrder;
import com.masha.model.TlOrderBack;
import com.masha.model.TlOrderGoods;
import com.masha.service.Impl.OrderBackService;
import com.masha.service.Impl.OrderGoodsService;
import com.masha.service.Impl.OrderService;
import com.masha.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "订单管理")
@RequestMapping("/Order")
public class OrderController extends BaseController {
    @Autowired
    OrderService orderService;

    @Autowired
    OrderBackService orderBackService;

    @Autowired
    OrderGoodsService orderGoodsService;

    @RequestMapping(value = "/getTlOerderList", method = RequestMethod.POST)
    @ApiOperation(value = "订单列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="payStatus", dataType = "Integer", required = true , value = "付款状态"),
            @ApiImplicitParam(paramType = "query", name="shippingStatus", dataType = "Integer", required = true , value = "发货状态")
    })
    public Object getTlOrderList(Page page  ,Integer ver, Integer user_id, Integer is_app , String sql){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        //query.select("pay_status");
        return resultSuccess(orderService.page(page , query));
    }

    @RequestMapping(value = "/getTlOerderList", method = RequestMethod.POST)
    @ApiOperation(value = "订单列表（待付款）")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="payStatus", dataType = "Integer", required = true , value = "付款状态")
    })
    public Object getTlOrderList3(Page page  ,Integer ver, Integer user_id, Integer is_app , String sql){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.eq("payStatus", 0);
        return resultSuccess(orderService.page(page , query));
    }


    @RequestMapping(value = "/getTlOerderList", method = RequestMethod.POST)
    @ApiOperation(value = "订单列表(未发货)")
    @ApiImplicitParams({

            @ApiImplicitParam(paramType = "query", name="shippingStatus", dataType = "Integer", required = true , value = "发货状态")
    })
    public Object getTlOrderList1(Page page  ,Integer ver, Integer user_id, Integer is_app , String sql){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.eq("shippingStatus", 0);
        return resultSuccess(orderService.page(page , query));
    }

    @RequestMapping(value = "/getTlOerderList", method = RequestMethod.POST)
    @ApiOperation(value = "订单列表（待收货）")
    @ApiImplicitParams({

            @ApiImplicitParam(paramType = "query", name="shippingStatus", dataType = "Integer", required = true , value = "发货状态")
    })
    public Object getTlOrderList2(Page page  ,Integer ver, Integer user_id, Integer is_app , String sql){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.eq("shippingStatus", 1);
        return resultSuccess(orderService.page(page , query));
    }

    @RequestMapping(value = "/getTlOrderById", method = RequestMethod.POST)
    @ApiOperation(value = "订单详情", notes = "根据订单id查询订单详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id")
    })
    public Object getTlOrderById(Integer orderId){
        return resultSuccess(orderService.getTlOrderById(orderId));
    }

    @RequestMapping(value = "/deleteTlOrderById", method = RequestMethod.POST)
    @ApiOperation(value = "删除订单", notes = "根据主键删除订单")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id")
    })
    public MessageBean deleteTlOrderById(Integer orderId){
        return resultSuccess(orderService.removeById(orderId));
    }

    @RequestMapping(value = "/add_back",method = RequestMethod.POST)
    @ApiOperation(value = "退货")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id"),
            @ApiImplicitParam(paramType = "query", name="content", dataType = "String", required = true , value = "退货原因"),
            @ApiImplicitParam(paramType = "query", name="type", dataType = "Short", required = true , value = "退货类型")
    })
    public MessageBean add_back(Integer orderId , String content , String back_img , Short type){
        TlOrderBack orderBack=new TlOrderBack();
        orderBack.setOrderId(orderId);
        orderBack.setContent(content);
        //orderBack.setStatus(back_img);
        orderBack.setType(type);
        return resultSuccess(orderBackService.save(orderBack));
    }

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    @ApiOperation(value = "订单商品评价")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id"),
            @ApiImplicitParam(paramType = "query", name="goodsId", dataType = "Integer", required = true , value = "商品id"),
            @ApiImplicitParam(paramType = "query", name="commentStar", dataType = "Integer", required = true , value = "评分"),
            @ApiImplicitParam(paramType = "query", name="content", dataType = "String", required = true , value = "评价内容"),
            @ApiImplicitParam(paramType = "query", name="Img", dataType = "String", required = true , value = "图片"),
    })
    public MessageBean addComment(Integer orderId, Integer goodsId, Integer commentStar , String content, String Img){
        TlOrderGoods orderGoods=new TlOrderGoods();
        orderGoods.setOrderId(orderId);
        orderGoods.setGoodsId(goodsId);
        orderGoods.setCommentStar(commentStar);
        orderGoods.setContent(content);
        orderGoods.setImg(Img);
        orderGoods.setCommentStatus(1);
        return resultSuccess(orderGoodsService.save(orderGoods));
    }

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    @ApiOperation(value = "新增订单")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id")
    })
    public MessageBean addOrder(Short addressId, Integer orderId){
        TlOrder order = new TlOrder();
        order.setAddressId(addressId);
        orderService.getTlOrderById(orderId);
        return resultSuccess(orderService.save(order));
    }



}

