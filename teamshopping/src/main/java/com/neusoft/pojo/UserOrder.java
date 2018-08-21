package com.neusoft.pojo;

import java.util.Date;

public class UserOrder {
    private Integer uOrderId;

    private String uOrderNumber;

    private Date uOrderTime;

    private String uOrderMode;

    private String uOrderBusiness;

    private String uOrderMember;

    private String uOrderBusinessname;

    private Double uOrderPrice;

    public Integer getuOrderId() {
        return uOrderId;
    }

    public void setuOrderId(Integer uOrderId) {
        this.uOrderId = uOrderId;
    }

    public String getuOrderNumber() {
        return uOrderNumber;
    }

    public void setuOrderNumber(String uOrderNumber) {
        this.uOrderNumber = uOrderNumber == null ? null : uOrderNumber.trim();
    }

    public Date getuOrderTime() {
        return uOrderTime;
    }

    public void setuOrderTime(Date uOrderTime) {
        this.uOrderTime = uOrderTime;
    }

    public String getuOrderMode() {
        return uOrderMode;
    }

    public void setuOrderMode(String uOrderMode) {
        this.uOrderMode = uOrderMode == null ? null : uOrderMode.trim();
    }

    public String getuOrderBusiness() {
        return uOrderBusiness;
    }

    public void setuOrderBusiness(String uOrderBusiness) {
        this.uOrderBusiness = uOrderBusiness == null ? null : uOrderBusiness.trim();
    }

    public String getuOrderMember() {
        return uOrderMember;
    }

    public void setuOrderMember(String uOrderMember) {
        this.uOrderMember = uOrderMember == null ? null : uOrderMember.trim();
    }

    public String getuOrderBusinessname() {
        return uOrderBusinessname;
    }

    public void setuOrderBusinessname(String uOrderBusinessname) {
        this.uOrderBusinessname = uOrderBusinessname == null ? null : uOrderBusinessname.trim();
    }

    public Double getuOrderPrice() {
        return uOrderPrice;
    }

    public void setuOrderPrice(Double uOrderPrice) {
        this.uOrderPrice = uOrderPrice;
    }
}