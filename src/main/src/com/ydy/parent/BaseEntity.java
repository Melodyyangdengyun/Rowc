package com.ydy.parent;

import java.io.Serializable;

/**
 * Entity支持类
 * @author ydy
 * @version 2018/1/13  14:34
 */
public abstract class BaseEntity<T> implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 实体编号（唯一标识）
     */
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 删除标记（0：正常；1：删除）
     */
    public static final String DEL_FLAG_NORMAL = "0";
    public static final String DEL_FLAG_DELETE = "1";
}
