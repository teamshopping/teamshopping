package com.neusoft.pojo;

public class UserConvertibility {
    private Integer uConvertibilityId;

    private String uConvertibilityName;

    private String uConvertibilityEffect;

    private Integer uConvertibilityUid;

    public Integer getuConvertibilityId() {
        return uConvertibilityId;
    }

    public void setuConvertibilityId(Integer uConvertibilityId) {
        this.uConvertibilityId = uConvertibilityId;
    }

    public String getuConvertibilityName() {
        return uConvertibilityName;
    }

    public void setuConvertibilityName(String uConvertibilityName) {
        this.uConvertibilityName = uConvertibilityName == null ? null : uConvertibilityName.trim();
    }

    public String getuConvertibilityEffect() {
        return uConvertibilityEffect;
    }

    public void setuConvertibilityEffect(String uConvertibilityEffect) {
        this.uConvertibilityEffect = uConvertibilityEffect == null ? null : uConvertibilityEffect.trim();
    }

    public Integer getuConvertibilityUid() {
        return uConvertibilityUid;
    }

    public void setuConvertibilityUid(Integer uConvertibilityUid) {
        this.uConvertibilityUid = uConvertibilityUid;
    }
}