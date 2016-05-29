package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("loginServiceImpl")
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User validate(String username,String password) {
        return userMapper.login(username,password);

    }
}
