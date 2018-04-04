package com.ydy.entity;

import java.util.List;

/**
 * @author ydy
 * Create By ydy on 2018/4/4
 */
public class ServicesXX {
    private int userId;

    private String carnum;

    private String carOwner;

    private String carPhone;

    private List<ServicesX> services ;

    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getUserId(){
        return this.userId;
    }
    public void setCarnum(String carnum){
        this.carnum = carnum;
    }
    public String getCarnum(){
        return this.carnum;
    }
    public void setCarOwner(String carOwner){
        this.carOwner = carOwner;
    }
    public String getCarOwner(){
        return this.carOwner;
    }
    public void setCarPhone(String carPhone){
        this.carPhone = carPhone;
    }
    public String getCarPhone(){
        return this.carPhone;
    }

    public List<ServicesX> getServices() {
        return services;
    }

    public void setServices(List<ServicesX> services) {
        this.services = services;
    }
}
