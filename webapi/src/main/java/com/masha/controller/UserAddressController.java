package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlAddress;
import com.masha.service.Impl.AddressService;
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
    AddressService addressService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加地址")
    @ApiImplicitParams({
            //@ApiImplicitParam(paramType = "query", name="userId", dataType = "Integer", required = true , value = "用户"),
            @ApiImplicitParam(paramType = "query", name="id", dataType = "Integer", required = true , value = "地址ID"),
            @ApiImplicitParam(paramType = "query", name="province", dataType = "String", required = true , value = "省份id"),
            @ApiImplicitParam(paramType = "query", name="city", dataType = "String", required = true , value = "城市id"),
            @ApiImplicitParam(paramType = "query", name="area", dataType = "String", required = true , value = "地区id"),
            @ApiImplicitParam(paramType = "query", name="detailsSite", dataType = "String", required = true , value = "地址详情"),
            @ApiImplicitParam(paramType = "query", name="name", dataType = "String", required = true , value = "姓名"),
            @ApiImplicitParam(paramType = "query", name="phone", dataType = "String", required = true , value = "电话"),
            @ApiImplicitParam(paramType = "query", name="type", dataType = "Integer", required = true , value = "类型")
    })
    public MessageBean add(Integer id, String province,String city,String area,
                           String detailsSite, String name,String phone,Integer type){
        TlAddress address = new TlAddress();
        address.setId(id);
        address.setProvince(province);
        address.setCity(city);
        address.setArea(area);
        address.setDetailsSite(detailsSite);
        address.setName(name);
        address.setPhone(phone);
        address.setType(type);
        return resultSuccess(addressService.save(address));
    }

    @RequestMapping(value = "/lists",method = RequestMethod.POST)
    @ApiOperation(value = "地址列表")
    public Object lists(){
        QueryWrapper<TlAddress> query = Wrappers.<TlAddress>query();
        query.select("id","province","city",
                "area","details_site", "name","phone","type");
        return resultSuccess(addressService.list(query));
    }

    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    @ApiOperation(value = "地址详情",notes = "根据id查询地址详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="id", dataType = "Integer", required = true , value = "地址ID")
    })
    public Object detail(Integer addressId){
        QueryWrapper<TlAddress> query = Wrappers.<TlAddress>query();
        query.select("id","province","city",
                "area","details_site", "name","phone","type");
        return resultSuccess(addressService.getById(query(addressId)));
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除地址",notes = "根据id删除地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="id", dataType = "Integer", required = true , value = "地址ID")
    })
    public MessageBean delete(Integer addressId){
        QueryWrapper<TlAddress> query = Wrappers.<TlAddress>query();
        query.select("id","province","city",
                "area","details_site", "name","phone","type");
        return resultSuccess(addressService.removeById(query(addressId)));
    }

    @RequestMapping(value = "/setdefult", method = RequestMethod.POST)
    @ApiOperation(value = "设置默认地址",notes = "根据id设置默认地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="id", dataType = "Integer", required = true , value = "地址ID"),
            @ApiImplicitParam(paramType = "query", name="type", dataType = "Integer", required = true , value = "地址类型")
    })
    public MessageBean setdefult(Integer id,Integer type){
        TlAddress address = new TlAddress();
        address.setType(1);
        return resultSuccess(addressService.save(address));
    }

}
