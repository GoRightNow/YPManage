package com.service;

import com.entity.Sending;
import com.entity.Storage;

/**
 * Created by RedLee on 2018/11/29.
 * Save业务逻辑
 */
public interface SaveService {

    public Storage saveStorage(Storage storage);

    public Sending saveSending(Sending sending);
}
