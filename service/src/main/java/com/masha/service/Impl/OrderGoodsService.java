package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlOrderGoodsMapper;
import com.masha.model.TlOrderGoods;
import com.masha.service.IOrderGoodsService;
import org.springframework.stereotype.Service;

@Service
public class OrderGoodsService extends ServiceImpl<TlOrderGoodsMapper, TlOrderGoods> implements IOrderGoodsService {
}
