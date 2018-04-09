package com.ydy.entity;

/**
 * @author ydy
 * Create By ydy on 2018/4/4
 */
public class Services {
    private double profits;
    private int count;
    private String carnum;
    private int goodModelId;
    private int userId;
    private String phone;
    private int price;
    private String name;
    private int serviceTypeId;
    private int serviceId;
    private String serviceTypeName;
    private String goodsName;
    private int usedCard;

    public double getProfits() {
        return profits;
    }

    public void setProfits(double profits) {
        this.profits = profits;
    }

    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public void setCarnum(String carnum){
        this.carnum = carnum;
    }
    public String getCarnum(){
        return this.carnum;
    }
    public void setGoodModelId(int goodModelId){
        this.goodModelId = goodModelId;
    }
    public int getGoodModelId(){
        return this.goodModelId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getUserId(){
        return this.userId;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setServiceTypeId(int serviceTypeId){
        this.serviceTypeId = serviceTypeId;
    }
    public int getServiceTypeId(){
        return this.serviceTypeId;
    }
    public void setServiceId(int serviceId){
        this.serviceId = serviceId;
    }
    public int getServiceId(){
        return this.serviceId;
    }
    public void setServiceTypeName(String serviceTypeName){
        this.serviceTypeName = serviceTypeName;
    }
    public String getServiceTypeName(){
        return this.serviceTypeName;
    }
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }
    public String getGoodsName(){
        return this.goodsName;
    }
    public void setUsedCard(int usedCard){
        this.usedCard = usedCard;
    }
    public int getUsedCard(){
        return this.usedCard;
    }
}
