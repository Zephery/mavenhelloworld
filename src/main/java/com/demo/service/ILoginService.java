package com.demo.service;

import com.demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Zephery on 2016/5/28.
 */

public interface ILoginService {
    public User validate(String username,String password);
}
