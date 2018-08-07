package com.neusoft.bean;

public class UserAdministrators {
    private Integer uAdministrators;

    private String uAdministratorsName;

    private String uAdministratorsPwd;

    private String uAdministratorsRealname;

    private Integer uAdministratorsPhone;

    private String uAdministratorsWork;

    public Integer getuAdministrators() {
        return uAdministrators;
    }

    public void setuAdministrators(Integer uAdministrators) {
        this.uAdministrators = uAdministrators;
    }

    public String getuAdministratorsName() {
        return uAdministratorsName;
    }

    public void setuAdministratorsName(String uAdministratorsName) {
        this.uAdministratorsName = uAdministratorsName == null ? null : uAdministratorsName.trim();
    }

    public String getuAdministratorsPwd() {
        return uAdministratorsPwd;
    }

    public void setuAdministratorsPwd(String uAdministratorsPwd) {
        this.uAdministratorsPwd = uAdministratorsPwd == null ? null : uAdministratorsPwd.trim();
    }

    public String getuAdministratorsRealname() {
        return uAdministratorsRealname;
    }

    public void setuAdministratorsRealname(String uAdministratorsRealname) {
        this.uAdministratorsRealname = uAdministratorsRealname == null ? null : uAdministratorsRealname.trim();
    }

    public Integer getuAdministratorsPhone() {
        return uAdministratorsPhone;
    }

    public void setuAdministratorsPhone(Integer uAdministratorsPhone) {
        this.uAdministratorsPhone = uAdministratorsPhone;
    }

    public String getuAdministratorsWork() {
        return uAdministratorsWork;
    }

    public void setuAdministratorsWork(String uAdministratorsWork) {
        this.uAdministratorsWork = uAdministratorsWork == null ? null : uAdministratorsWork.trim();
    }
}