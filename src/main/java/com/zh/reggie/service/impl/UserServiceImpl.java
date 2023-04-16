package com.zh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.reggie.entity.User;
import com.zh.reggie.mapper.UserMapper;
import com.zh.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * @create 2023-04-16-10:48
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
