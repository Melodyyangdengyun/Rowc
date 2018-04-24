package com.ydy.service;

import com.ydy.dao.ClothesDao;
import com.ydy.entity.Clothes;
import com.ydy.parent.CrudService;

import com.ydy.utils.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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

    public String getId(String s) {
        System.out.println(s);
        return dao.getId(s);
    }

    public List<Map<String,Object>> findListAll() {
        return dao.findListAll();
    }

    public Page<Clothes> findPage(Page<Clothes> page, Clothes clothes) {
        return super.findPage(page,clothes);
    }
}
