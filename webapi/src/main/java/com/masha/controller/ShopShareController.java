package com.masha.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.masha.controller.commen.BaseController;
import com.masha.model.TlOrder;
import com.masha.service.Impl.ShopShareService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "分销商中心")
@RequestMapping("/ShopShare")
public class ShopShareController extends BaseController {
    @Autowired
    ShopShareService shopShareService;

     public Object getShopShareUserList(){
         QueryWrapper<TlOrder> query = Wrappers.<TlOrder>query();
         query.select("user_id","point","cash", "cash_all","");
         return resultSuccess(shopShareService.query());
     }

}

