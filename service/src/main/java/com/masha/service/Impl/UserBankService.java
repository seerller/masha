package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlUserBankMapper;
import com.masha.model.TlUserBank;
import com.masha.service.IUserBankService;
import org.springframework.stereotype.Service;

@Service
public class UserBankService extends ServiceImpl<TlUserBankMapper, TlUserBank> implements IUserBankService {
}
