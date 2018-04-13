package com.ydy.parent;

import com.ydy.utils.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
     *
     * @param id
     * @return
     */
    public T get(String id) {
        return dao.get(id);
    }

    /**
     * 获取单条数据
     *
     * @param entity
     * @return
     */
    public T get(T entity) {
        return dao.get(entity);
    }

    /**
     * 获取所有数据
     * @return
     */
    public List<T> findList() {
        return dao.findList();
    }

    /**
     * 获取所有数据 如果缓存中有,则使用缓存数据
     * @return
     */
    public List<T> findList(String entity) {
        if (CacheUtils.get(entity) != null) {
            List<T> findList = (List<T>)CacheUtils.get(entity);
            return findList;
        }else {
            List<T> list = dao.findList();
            CacheUtils.put(entity,list);
            return list;
        }
    }

    /**
     * 保存数据（插入或更新）
     *
     * @param entity
     */
    @Transactional(readOnly = false)
    public void save(T entity) {
        if (entity.getIsNewRecord()) {
            entity.preInsert();
            dao.insert(entity);
        } else {
            entity.preUpdate();
            dao.update(entity);
        }
        CacheUtils.remove("listDataCache",entity.toString());
    }

    @Transactional(readOnly = false)
    public void update(T entity) {
        entity.preUpdate();
        dao.update(entity);
        CacheUtils.remove("listDataCache",entity.toString());
    }
}
