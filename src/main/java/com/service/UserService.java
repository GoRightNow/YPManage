package com.service;

import com.dao.mapper.UserMapper;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Song on 2017/2/15.
 * User业务逻辑
 */
public interface UserService {
    //根据名字查找用户
    public String findUser(String name);
}