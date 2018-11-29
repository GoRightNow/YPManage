package com.dao.mapper;

import com.entity.Sending;
import com.entity.Storage;
import org.springframework.stereotype.Repository;

/**
 * Created by RedLee on 2018/11/29.
 * Save表操作接口
 */
@Repository
public interface SaveMapper {

    public Integer saveStorage(Storage storage);

    public Integer saveSending(Sending sending);
}
