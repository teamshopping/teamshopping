package com.neusoft.bean;

public class UserMember {
    private Integer uMemberId;

    private String uMemberName;

    private String uMemberPwd;

    private String uMemberReale;

    private Boolean uMemberSex;

    private Integer uMemberPhone;

    private String uMemberEmail;

    private Integer uMemberIntegral;

    private Integer uMemberPid;

    private Integer uMemberCid;

    private Integer uMemberAid;

    private byte[] uMemberImage;

    public Integer getuMemberId() {
        return uMemberId;
    }

    public void setuMemberId(Integer uMemberId) {
        this.uMemberId = uMemberId;
    }

    public String getuMemberName() {
        return uMemberName;
    }

    public void setuMemberName(String uMemberName) {
        this.uMemberName = uMemberName == null ? null : uMemberName.trim();
    }

    public String getuMemberPwd() {
        return uMemberPwd;
    }

    public void setuMemberPwd(String uMemberPwd) {
        this.uMemberPwd = uMemberPwd == null ? null : uMemberPwd.trim();
    }

    public String getuMemberReale() {
        return uMemberReale;
    }

    public void setuMemberReale(String uMemberReale) {
        this.uMemberReale = uMemberReale == null ? null : uMemberReale.trim();
    }

    public Boolean getuMemberSex() {
        return uMemberSex;
    }

    public void setuMemberSex(Boolean uMemberSex) {
        this.uMemberSex = uMemberSex;
    }

    public Integer getuMemberPhone() {
        return uMemberPhone;
    }

    public void setuMemberPhone(Integer uMemberPhone) {
        this.uMemberPhone = uMemberPhone;
    }

    public String getuMemberEmail() {
        return uMemberEmail;
    }

    public void setuMemberEmail(String uMemberEmail) {
        this.uMemberEmail = uMemberEmail == null ? null : uMemberEmail.trim();
    }

    public Integer getuMemberIntegral() {
        return uMemberIntegral;
    }

    public void setuMemberIntegral(Integer uMemberIntegral) {
        this.uMemberIntegral = uMemberIntegral;
    }

    public Integer getuMemberPid() {
        return uMemberPid;
    }

    public void setuMemberPid(Integer uMemberPid) {
        this.uMemberPid = uMemberPid;
    }

    public Integer getuMemberCid() {
        return uMemberCid;
    }

    public void setuMemberCid(Integer uMemberCid) {
        this.uMemberCid = uMemberCid;
    }

    public Integer getuMemberAid() {
        return uMemberAid;
    }

    public void setuMemberAid(Integer uMemberAid) {
        this.uMemberAid = uMemberAid;
    }

    public byte[] getuMemberImage() {
        return uMemberImage;
    }

    public void setuMemberImage(byte[] uMemberImage) {
        this.uMemberImage = uMemberImage;
    }
}