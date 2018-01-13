package com.ydy.parent;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;
import java.util.Date;

/**
 * @author ydy
 * @version 2018/1/13  14:34
 */
public abstract class DataEntity<T> extends BaseEntity<T>{
    private static final long serialVersionUID = 1L;

    /**
     * 创建日期
     */
    protected Date createDate;
    /**
     * 更新日期
     */
    protected Date updateDate;
    /**
     * 删除标记（0：正常；1：删除；)
     */
    protected String state;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @JsonIgnore
    @Length(min=1, max=1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
