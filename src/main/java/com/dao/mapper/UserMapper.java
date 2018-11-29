package com.dao.mapper;

import org.springframework.stereotype.Repository;

/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface UserMapper{
    //根据名字查找用户
    public String findUser(String name);
}