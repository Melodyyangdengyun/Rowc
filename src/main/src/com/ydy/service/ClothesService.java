package com.ydy.service;

import com.ydy.dao.ClothesDao;
import com.ydy.entity.Clothes;
import com.ydy.parent.CrudService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 服装登记Service
 * @author ydy
 * @version 2018/1/13  15:15
 */
@Service
@Transactional(readOnly = true)
public class ClothesService extends CrudService<ClothesDao,Clothes> {
    public Clothes get(String id) {
        return super.get(id);
    }

    public Clothes getId(String s) {
        System.out.println(s);
        return dao.getId(s);
    }
}
