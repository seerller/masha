package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlOrder;
import com.masha.model.TlOrderGoods;
import com.masha.model.TlShopGoods;
import com.masha.service.Impl.OrderGoodsService;
import com.masha.service.Impl.OrderService;
import com.masha.service.Impl.ShopGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "商品管理")
@RequestMapping("/ShopGoods")
public class ShopGoodsController extends BaseController {
    @Autowired
    ShopGoodsService shopGoodsService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderGoodsService orderGoodsService;

    @ApiOperation(value = "商品列表")
    @RequestMapping(value = "/ShopGoods", method = RequestMethod.GET)
    public Object getShopGoodsList(Page page){
        //QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        return resultSuccess(shopGoodsService.page(page,Wrappers.<TlShopGoods>query()));
    }

    @RequestMapping(value = "/getShopGood", method = RequestMethod.POST)
    @ApiOperation(value = "商品详情", notes = "根据商品id查询商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="goodsId", dataType = "Integer", required = true , value = "商品id")
    })
    public Object getShopGoodsById(Integer goodsId){
        return resultSuccess(shopGoodsService.getById(goodsId));
    }

    @RequestMapping(value = "/getShopGoodsCommentList",method = RequestMethod.POST)
    @ApiOperation(value = "评价详情", notes = "根据商品ID获取评价列表" +
            "")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="goodsId", dataType = "Integer", required = true , value = "商品id")
    })
    public Object getShopGoodsCommentList(Page page){
        return resultSuccess(orderGoodsService.page(page,Wrappers.<TlOrderGoods>query().select("goodsId")));
    }

    @RequestMapping(value = "/getAddressListById",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户收货地址", notes = "根据用户ID获取用户收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="userId", dataType = "Integer", required = true , value = "用户id")
    })
    public Object getAddressListById(Integer userId){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.select("address", "address_name","address_phone").eq("user_Id",userId);
        return resultSuccess(orderService.query());
    }


}
