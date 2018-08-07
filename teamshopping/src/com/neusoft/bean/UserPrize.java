package com.neusoft.bean;

public class UserPrize {
    private Integer sPrizeId;

    private String sPrizeName;

    private String sPrizeRemarks;

    public Integer getsPrizeId() {
        return sPrizeId;
    }

    public void setsPrizeId(Integer sPrizeId) {
        this.sPrizeId = sPrizeId;
    }

    public String getsPrizeName() {
        return sPrizeName;
    }

    public void setsPrizeName(String sPrizeName) {
        this.sPrizeName = sPrizeName == null ? null : sPrizeName.trim();
    }

    public String getsPrizeRemarks() {
        return sPrizeRemarks;
    }

    public void setsPrizeRemarks(String sPrizeRemarks) {
        this.sPrizeRemarks = sPrizeRemarks == null ? null : sPrizeRemarks.trim();
    }
}