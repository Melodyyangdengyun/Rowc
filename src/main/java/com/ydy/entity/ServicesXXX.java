package com.ydy.entity;

import java.util.List;

/**
 * @author ydy
 * Create By ydy on 2018/4/4
 */
public class ServicesXXX {
    private List<ServicesXX> serviceCount ;
    private int useCount;
    private int usePrice;
    private double useProfit;

    public void setServiceCount(List<ServicesXX> serviceCount){
        this.serviceCount = serviceCount;
    }
    public List<ServicesXX> getServiceCount(){
        return this.serviceCount;
    }
    public void setUseCount(int useCount){
        this.useCount = useCount;
    }
    public int getUseCount(){
        return this.useCount;
    }
    public void setUsePrice(int usePrice){
        this.usePrice = usePrice;
    }
    public int getUsePrice(){
        return this.usePrice;
    }
    public void setUseProfit(double useProfit){
        this.useProfit = useProfit;
    }
    public double getUseProfit(){
        return this.useProfit;
    }
}
