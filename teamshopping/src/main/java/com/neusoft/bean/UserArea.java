package com.neusoft.bean;

public class UserArea {
    private Integer uAreaId;

    private String uAreaName;

    private Integer uAreaCid;

    public Integer getuAreaId() {
        return uAreaId;
    }

    public void setuAreaId(Integer uAreaId) {
        this.uAreaId = uAreaId;
    }

    public String getuAreaName() {
        return uAreaName;
    }

    public void setuAreaName(String uAreaName) {
        this.uAreaName = uAreaName == null ? null : uAreaName.trim();
    }

    public Integer getuAreaCid() {
        return uAreaCid;
    }

    public void setuAreaCid(Integer uAreaCid) {
        this.uAreaCid = uAreaCid;
    }
}