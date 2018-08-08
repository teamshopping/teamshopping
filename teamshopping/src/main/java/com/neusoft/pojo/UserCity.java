package com.neusoft.pojo;

public class UserCity {
    private Integer uCityId;

    private String uCityName;

    private Integer uCityPid;

    public Integer getuCityId() {
        return uCityId;
    }

    public void setuCityId(Integer uCityId) {
        this.uCityId = uCityId;
    }

    public String getuCityName() {
        return uCityName;
    }

    public void setuCityName(String uCityName) {
        this.uCityName = uCityName == null ? null : uCityName.trim();
    }

    public Integer getuCityPid() {
        return uCityPid;
    }

    public void setuCityPid(Integer uCityPid) {
        this.uCityPid = uCityPid;
    }
}