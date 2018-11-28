package com.serviceImpl;

import com.dao.mapper.UserMapper;
import com.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String findUser(String name) {
        return userMapper.findUser(name);
    }
}
