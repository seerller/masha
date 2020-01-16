package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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

import static com.baomidou.mybatisplus.core.toolkit.Wrappers.query;

@RestController
@Api(description = "用户地址")
@RequestMapping("/UserAddress")
public class UserAddressController extends BaseController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="addressId", dataType = "Integer", required = true , value = "地址ID"),
            @ApiImplicitParam(paramType = "query", name="addressProvinceId", dataType = "Integer", required = true , value = "省份id"),
            @ApiImplicitParam(paramType = "query", name="addressCityId", dataType = "Integer", required = true , value = "城市id"),
            @ApiImplicitParam(paramType = "query", name="addressAreaId", dataType = "Integer", required = true , value = "地区id"),
            @ApiImplicitParam(paramType = "query", name="address", dataType = "Integer", required = true , value = "地址"),
            @ApiImplicitParam(paramType = "query", name="addressName", dataType = "Integer", required = true , value = "姓名"),
            @ApiImplicitParam(paramType = "query", name="addressPhone", dataType = "Integer", required = true , value = "电话"),
            @ApiImplicitParam(paramType = "query", name="type", dataType = "Integer", required = true , value = "类型")
    })
    public MessageBean add(Short addressId, Integer addressProvinceId,Integer addressCityId,Integer addressAreaId,
                           String address, String addressName, String addressPhone,Integer type){
        TlOrder order = new TlOrder();
        order.setAddressId(addressId);
        order.setAddressProvinceId(addressProvinceId);
        order.setAddressCityId(addressCityId);
        order.setAddressAreaId(addressAreaId);
        order.setAddress(address);
        order.setAddressName(addressName);
        order.setAddressPhone(addressPhone);
        order.setType(type);
        return resultSuccess(orderService.save(order));
    }

    @RequestMapping(value = "/lists",method = RequestMethod.POST)
    @ApiOperation(value = "地址列表")
    public Object lists(){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.select("address_id","address_province_id","address_city_id",
                "address_area_id","address", "address_name","address_phone","type");
        return resultSuccess(orderService.list(query));
    }

    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    @ApiOperation(value = "地址详情",notes = "根据id查询地址详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="addressId", dataType = "Integer", required = true , value = "地址ID")
    })
    public Object detail(Integer addressId){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.select("address_id","address_province_id","address_city_id",
                "address_area_id","address", "address_name","address_phone","type");
        return resultSuccess(orderService.getById(query(addressId)));
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除地址",notes = "根据id删除地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="addressId", dataType = "Integer", required = true , value = "地址ID")
    })
    public MessageBean delete(Integer addressId){
        QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
        query.select("address_id","address_province_id","address_city_id",
                "address_area_id","address", "address_name","address_phone","type");
        return resultSuccess(orderService.removeById(query(addressId)));
    }

}
