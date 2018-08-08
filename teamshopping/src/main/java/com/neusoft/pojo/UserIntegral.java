package com.neusoft.pojo;

public class UserIntegral {
    private Integer uIntegralId;

    private String uIntegralName;

    private Integer uIntegralNumber;

    private String uIntegralState;

    public Integer getuIntegralId() {
        return uIntegralId;
    }

    public void setuIntegralId(Integer uIntegralId) {
        this.uIntegralId = uIntegralId;
    }

    public String getuIntegralName() {
        return uIntegralName;
    }

    public void setuIntegralName(String uIntegralName) {
        this.uIntegralName = uIntegralName == null ? null : uIntegralName.trim();
    }

    public Integer getuIntegralNumber() {
        return uIntegralNumber;
    }

    public void setuIntegralNumber(Integer uIntegralNumber) {
        this.uIntegralNumber = uIntegralNumber;
    }

    public String getuIntegralState() {
        return uIntegralState;
    }

    public void setuIntegralState(String uIntegralState) {
        this.uIntegralState = uIntegralState == null ? null : uIntegralState.trim();
    }
}