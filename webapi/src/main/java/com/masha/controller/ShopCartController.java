package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlShopCart;
import com.masha.service.Impl.ShopCartService;
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
@Api(description = "购物车")
@RequestMapping("/ShopCart")
public class ShopCartController extends BaseController {
    @Autowired
    ShopCartService shopCartService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="goodsId", dataType = "Integer", required = false , value = "商品id"),
            @ApiImplicitParam(paramType = "query", name="attr", dataType = "String", required = false , value = "属性"),
            @ApiImplicitParam(paramType = "query", name="amount", dataType = "Integer", required = false , value = "数量"),
            @ApiImplicitParam(paramType = "query", name="cartId", dataType = "Integer", required = false , value = "购物车id")
    })
    public MessageBean add(Integer goodsId, String attr, Integer amount, Integer cartId ){
        TlShopCart shopCart = new TlShopCart();
        try{
            shopCart.setGoodsId(goodsId);
            shopCart.setAttr(attr);
            shopCart.setAmount(amount);
            shopCart.setCartId(cartId);
            return resultSuccess(shopCartService.save(shopCart));
        }catch(Exception e){
            return resultFailed();
        }
    }

    @RequestMapping(value = "/lists" , method = RequestMethod.POST)
    @ApiOperation(value = "购物车列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="cartId", dataType = "Integer", required = true , value = "购物车id")
    })
    public Object lists(Integer cartId){
        QueryWrapper<TlShopCart> query = Wrappers.<TlShopCart>query();
        query.eq("car_id",cartId);
        return resultSuccess(shopCartService.list(query));
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.POST)
    @ApiOperation(value = "删除购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="cartId", dataType = "Integer", required = true , value = "购物车id")
    })
    public MessageBean delete(Integer cartId){
        return resultSuccess(shopCartService.removeById(cartId));
    }



}
