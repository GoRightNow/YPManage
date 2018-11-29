package com.controller;

import com.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by RedLee on 2018/11/29.
 * Save控制层
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/save")
public class SaveController {
    private SaveService saveService;

    @Autowired
    public SaveController(SaveService saveService) {
        this.saveService = saveService;
    }
}
