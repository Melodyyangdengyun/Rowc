package com.ydy.entity;

import java.util.List;

/**
 * @author ydy
 * Create By ydy on 2018/4/4
 */
public class ServicesX {
    private String serviceTypeId;

    private String serviceTypeName;

    private List<Services> services ;

    public void setServiceTypeId(String serviceTypeId){
        this.serviceTypeId = serviceTypeId;
    }
    public String getServiceTypeId(){
        return this.serviceTypeId;
    }
    public void setServiceTypeName(String serviceTypeName){
        this.serviceTypeName = serviceTypeName;
    }
    public String getServiceTypeName(){
        return this.serviceTypeName;
    }
    public void setServices(List<Services> services){
        this.services = services;
    }
    public List<Services> getServices(){
        return this.services;
    }

}
