package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlOrder;
import com.masha.service.Impl.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "订单管理")
@RestController
@RequestMapping("/Order")
public class OrderController extends BaseController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/getTlOerderList", method = RequestMethod.POST)
    @ApiOperation(value = "订单列表")
    public Object getTlOerderList(Page page  ,Integer ver, Integer user_id, Integer is_app , String sql){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        //query.select("pay_status");
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



}

