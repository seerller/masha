package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlShopCartMapper;
import com.masha.model.TlShopCart;
import com.masha.service.IShopCartService;
import org.springframework.stereotype.Service;

@Service
public class ShopCartService extends ServiceImpl<TlShopCartMapper , TlShopCart> implements IShopCartService {
}
