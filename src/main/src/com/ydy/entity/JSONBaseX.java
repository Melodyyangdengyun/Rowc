package com.ydy.entity;

import java.util.List;

/**
 * @author ydy
 * Create By ydy on 2018/4/4
 */
public class JSONBaseX {
    private List<JSONBase> list;

    private int pageCount;

    public List<JSONBase> getList() {
        return list;
    }

    public void setList(List<JSONBase> list) {
        this.list = list;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return this.pageCount;
    }
}
