package com.masha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masha.model.TlOrderBack;

public interface IOrderBackService extends IService<TlOrderBack> {
    /**
     * 退货
     */
    void add_back(String content , String back_img , Short type);
}
