package com.masha.controller;

import com.masha.controller.commen.BaseController;
import com.masha.model.TlUser;
import com.masha.service.Impl.UserService;
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
@Api(description = "用户")
@RequestMapping("/User")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping(value ="/detail", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="userId", dataType = "Integer", required = true , value = "用户id")
    })
    public MessageBean detail(Integer userId){
        return resultSuccess(userService.getById(userId));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name="userId", dataType = "Integer", required = true , value = "用户id"),
            @ApiImplicitParam(paramType = "query", name="username", dataType = "String", required = false , value = "用户名"),
            @ApiImplicitParam(paramType = "query", name="wxNum", dataType = "Integer", required = false , value = "微信号"),
            @ApiImplicitParam(paramType = "query", name="shenfengzheng", dataType = "String", required = false , value = "身份证"),
            @ApiImplicitParam(paramType = "query", name="truename", dataType = "String", required = false , value = "真实姓名")
    })
    public MessageBean update(String username,Integer wxNum, String shenfengzheng, String truename){
        TlUser user = new TlUser();
        user.setUsername(username);
        user.setWxNum(wxNum);
        user.setShenfengzheng(shenfengzheng);
        user.setTruename(truename);
        return resultSuccess(userService.updateById(user));
    }
}
