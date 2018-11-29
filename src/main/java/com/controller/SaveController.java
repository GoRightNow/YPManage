package com.controller;

import com.entity.Sending;
import com.entity.Storage;
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

    @RequestMapping(value = "/saveStorage",method = RequestMethod.POST)
    public Storage saveStorage(@RequestBody Storage storage){
        return this.saveService.saveStorage(storage);
    }

    @RequestMapping(value = "/saveSending",method = RequestMethod.POST)
    public Sending saveSending(@RequestBody Sending sending){
        return this.saveService.saveSending(sending);
    }
}
