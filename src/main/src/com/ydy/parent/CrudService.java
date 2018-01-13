package com.ydy.parent;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ydy
 * @version 2018/1/13  15:18
 */
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService {
    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public T get(String id) {
        return dao.get(id);
    }

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    public T get(T entity) {
        return dao.get(entity);
    }
}
