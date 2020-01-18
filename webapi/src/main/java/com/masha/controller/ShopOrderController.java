package com.masha.controller;

import com.masha.controller.commen.BaseController;
import com.masha.model.TlOrder;
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

import java.math.BigDecimal;

@RestController
@Api(description = "订单")
@RequestMapping("/ShopOrder")
public class ShopOrderController extends BaseController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/kuaidi_ditail",method = RequestMethod.POST)
    @ApiOperation(value = "快递物流详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id")
    })
    public MessageBean kuaidi_ditail(Integer orderId){
        return resultSuccess(orderService.getById(orderId));
    }

    @RequestMapping(value = "/order_back_address",method = RequestMethod.POST)
    @ApiOperation(value = "填写退货信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="orderId", dataType = "Integer", required = true , value = "订单id"),
            @ApiImplicitParam(paramType = "query", name="backShippingId", dataType = "String", required = true , value = "退货物流单号"),
            @ApiImplicitParam(paramType = "query", name="backShippingCode", dataType = "String", required = true , value = "退货物流公司")
    })
    public MessageBean order_back_address(Integer orderId, String backShippingId,String backShippingCode){
        TlOrder order = new TlOrder();
        order.setOrderId(orderId);
        order.setBackShippingId(backShippingId);
        order.setBackShippingCode(backShippingCode);
        return resultSuccess(orderService.save(order));
    }

    public MessageBean pay(Integer LogId, Integer orderId, Integer payStyle,String app,Integer goodsId,String shareCode ){
        TlOrder order = new TlOrder();

    }
}
