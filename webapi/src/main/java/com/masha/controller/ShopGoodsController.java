package com.masha.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlShopGoods;
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

    public MessageBean addorder(){
        return resultSuccess();
    }

}
