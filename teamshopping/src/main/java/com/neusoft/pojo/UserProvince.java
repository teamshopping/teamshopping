package com.neusoft.pojo;

public class UserProvince {
    private Integer uProvinceId;

    private String uProvinceName;

    public Integer getuProvinceId() {
        return uProvinceId;
    }

    public void setuProvinceId(Integer uProvinceId) {
        this.uProvinceId = uProvinceId;
    }

    public String getuProvinceName() {
        return uProvinceName;
    }

    public void setuProvinceName(String uProvinceName) {
        this.uProvinceName = uProvinceName == null ? null : uProvinceName.trim();
    }
}