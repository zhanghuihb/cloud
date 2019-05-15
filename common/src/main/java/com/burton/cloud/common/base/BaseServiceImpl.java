package com.burton.cloud.common.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: 大瞳小沐
 * Date: 2019/3/20
 * Time: 23:11
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T>{

    @Autowired
    private BaseRepository baseRepository;

    @Override
    public T findById(Integer id) {
        return (T) baseRepository.findOne(id);
    }
}
