package com.ydy.parent;

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
    public T get(String id);

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    public T get(T entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    public void insert(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(T entity);
}
