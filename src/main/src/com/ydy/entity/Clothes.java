package com.ydy.entity;

import com.ydy.parent.DataEntity;
import java.util.Date;

/**
 * @author ydy
 * @version 2018/1/13  14:30
 */
public class Clothes extends DataEntity<Clothes>{

    private static final long serialVersionUID = 1L;

    /**
     *登记日期
     */
    private Date registerDate;
    /**
     * 颜色
     */
    private String colour;
    /**
     * 款式
     */
    private String style;
    /**
     * 尺码
     */
    private String sized;
    /**
     * 长度
     */
    private String lengthd;
    /**
     * 单位/件套
     */
    private String company;
    /**
     * 总价
     */
    private String total;
    /**
     * 付款情况
     */
    private String paymentState;
    /**
     * 发放部门
     */
    private String office;
    /**
     * 负责人
     */
    private String head;
    /**
     * 经办人
     */
    private String managers;
    /**
     * 电话
     */
    private String phone;

    /**
     * 数量
     */
    private String numberd;
    /**
     * 单价
     */
    private String price;



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSized() {
        return sized;
    }

    public void setSized(String sized) {
        this.sized = sized;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getLengthd() {
        return lengthd;
    }

    public void setLengthd(String lengthd) {
        this.lengthd = lengthd;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    public String getNumberd() {
        return numberd;
    }

    public void setNumberd(String numberd) {
        this.numberd = numberd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
