package com.ydy.test;

/**
 * @author ydy
 * Create By ydy on 2018/4/9
 */
public class Dog {
    private String id;
    private String title;
    private String size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dog(String id, String title, String size) {
        this.id = id;
        this.title = title;
        this.size = size;
    }

    public Dog() {
    }
}
