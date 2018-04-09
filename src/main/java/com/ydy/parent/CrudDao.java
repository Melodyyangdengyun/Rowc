package com.ydy.parent;

import java.util.List;
import java.util.Map;

/**
 * DAO支持类实现
 * @author ydy
 * @version 2018/1/13  15:06
 */
public interface CrudDao<T> extends BaseDao{
    /**
     * 获取单条数据
     * @param id
     * @return
     */
     T get(String id);

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
     T get(T entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    void insert(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 查询所有表数据
     * @return
     */
    List<Map<String,Object>> findListAll();

    /**
     * 查询所有数据
     * @return
     */
    List<T> findList();
}
