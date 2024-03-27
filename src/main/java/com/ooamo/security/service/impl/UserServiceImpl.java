package com.ooamo.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ooamo.security.entity.User;
import com.ooamo.security.mapper.UserMapper;
import com.ooamo.security.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
