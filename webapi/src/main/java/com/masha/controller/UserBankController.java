package com.masha.controller;

import com.masha.controller.commen.BaseController;
import com.masha.service.Impl.UserBankService;
import com.masha.tools.MessageBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "用户银行卡")
@RequestMapping("/UserBank")
public class UserBankController extends BaseController {
    @Autowired
    UserBankService userBankService;

    public MessageBean add(String bankCark, String truename, String shenfenzheng, String phone, String code ,String bankname){

    }
}
