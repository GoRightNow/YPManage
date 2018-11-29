package com.serviceImpl;

import com.dao.mapper.SaveMapper;
import com.service.SaveService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class SaveServiceImpl implements SaveService {
    private final SaveMapper saveMapper;

    public SaveServiceImpl(SaveMapper saveMapper) {
        this.saveMapper = saveMapper;
    }
}
