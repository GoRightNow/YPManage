package com.controller;

import com.entity.JSONResult;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public JSONResult show(@RequestParam(value = "name")String name){
        JSONResult<String> result = new JSONResult<String>();
        String findResult = userService.findUser("ddd");
        System.out.println(findResult);
        String test = "dddd";
        result.setData(test);
        return result;
    }
}