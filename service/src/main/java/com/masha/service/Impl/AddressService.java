package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlAddressMapper;
import com.masha.model.TlAddress;
import com.masha.service.IAddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends ServiceImpl<TlAddressMapper , TlAddress> implements IAddressService {
}
