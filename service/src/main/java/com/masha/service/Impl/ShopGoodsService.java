package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlShopGoodsMapper;
import com.masha.model.TlShopGoods;
import com.masha.service.IShopGoodsService;
import org.springframework.stereotype.Service;

@Service
public class ShopGoodsService extends ServiceImpl<TlShopGoodsMapper, TlShopGoods> implements IShopGoodsService {
}
