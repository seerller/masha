package com.masha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masha.model.TlOrder;

import java.util.List;

public interface IOrderService extends IService<TlOrder> {
    /**
     * 查询订单列表
     * @param param
     * @return
     */
    List<TlOrder> getTlOerderList(String param);

    /**
     * 根据主键查询订单详情
     * @param orderId
     * @return
     */
    TlOrder getTlOrderById(Integer orderId);
}
