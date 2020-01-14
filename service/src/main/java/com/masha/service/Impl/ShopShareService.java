package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlShopShareUserMapper;
import com.masha.model.TlShopShareUser;
import com.masha.service.IShopShareService;
import org.springframework.stereotype.Service;

@Service
public class ShopShareService extends ServiceImpl<TlShopShareUserMapper,TlShopShareUser> implements IShopShareService {
}
