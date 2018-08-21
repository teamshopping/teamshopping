package com.neusoft.pojo;

public class UserAddress {
    private Integer uAddressId;

    private String uAddressProvince;

    private String uAddressCity;

    private String uAddressArea;

    private String uAddressDetailed;

    private Integer uAddressMid;

    public Integer getuAddressId() {
        return uAddressId;
    }

    public void setuAddressId(Integer uAddressId) {
        this.uAddressId = uAddressId;
    }

    public String getuAddressProvince() {
        return uAddressProvince;
    }

    public void setuAddressProvince(String uAddressProvince) {
        this.uAddressProvince = uAddressProvince == null ? null : uAddressProvince.trim();
    }

    public String getuAddressCity() {
        return uAddressCity;
    }

    public void setuAddressCity(String uAddressCity) {
        this.uAddressCity = uAddressCity == null ? null : uAddressCity.trim();
    }

    public String getuAddressArea() {
        return uAddressArea;
    }

    public void setuAddressArea(String uAddressArea) {
        this.uAddressArea = uAddressArea == null ? null : uAddressArea.trim();
    }

    public String getuAddressDetailed() {
        return uAddressDetailed;
    }

    public void setuAddressDetailed(String uAddressDetailed) {
        this.uAddressDetailed = uAddressDetailed == null ? null : uAddressDetailed.trim();
    }

    public Integer getuAddressMid() {
        return uAddressMid;
    }

    public void setuAddressMid(Integer uAddressMid) {
        this.uAddressMid = uAddressMid;
    }
}