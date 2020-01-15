package com.masha.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masha.mapper.TlUserMapper;
import com.masha.model.TlUser;
import com.masha.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<TlUserMapper, TlUser> implements IUserService {
}
