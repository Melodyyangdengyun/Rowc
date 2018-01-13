package com.ydy.dao;

import com.ydy.annotation.MyBatisDao;
import com.ydy.entity.Clothes;
import com.ydy.parent.CrudDao;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author ydy
 * @version 2018/1/13  14:19
 */
@MyBatisDao
public interface ClothesDao extends CrudDao<Clothes> {
    Clothes getId(String id);
}
