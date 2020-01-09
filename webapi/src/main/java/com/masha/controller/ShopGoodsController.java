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

    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    @ApiOperation(value = "新增地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="addressId", dataType = "Short", required = true , value = "地址id"),
            @ApiImplicitParam(paramType = "query", name="addressName", dataType = "String", required = true , value = "姓名"),
            @ApiImplicitParam(paramType = "query", name="addressPhone", dataType = "String", required = true , value = "手机号码"),
            @ApiImplicitParam(paramType = "query", name="addressProvinceId", dataType = "Integer", required = true , value = "省份ID"),
            @ApiImplicitParam(paramType = "query", name="addressAreaId", dataType = "Integer", required = true , value = "地区ID"),
            @ApiImplicitParam(paramType = "query", name="addressCityId", dataType = "Integer", required = true , value = "城市ID"),
            @ApiImplicitParam(paramType = "query", name="addressStreetId", dataType = "Integer", required = true , value = "街道ID"),
            @ApiImplicitParam(paramType = "query", name="addressParams", dataType = "String", required = true , value = "地址详情")
    })
    public MessageBean addAddress(Short addressId, String addressName, String addressPhone,
                                  Integer addressProvinceId,Integer addressCityId,Integer addressAreaId,
                                  Integer addressStreetId,String addressParams){
        TlOrder order = new TlOrder();
        order.setAddressId(addressId);
        order.setAddressName(addressName);
        order.setAddressPhone(addressPhone);
        order.setAddressProvinceId(addressProvinceId);
        order.setAddressAreaId(addressAreaId);
        order.setAddressCityId(addressCityId);
        order.setAddressStreetId(addressStreetId);
        order.setAddressParams(addressParams);
        return resultSuccess(orderService.save(order));
    }


}
