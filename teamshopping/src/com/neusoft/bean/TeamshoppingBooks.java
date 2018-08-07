package com.neusoft.bean;

public class TeamshoppingBooks {
    private Integer tsBooksId;

    private String tsBooksName;

    private String tsBooksType;

    private String tsBooksAuthor;

    private String tsBooksPress;

    private String tsBooksPicture;

    private Integer tsBooksNumber;

    private Double tsBooksMoney;

    private String tsBooksIntroduce;

    private String tsBooksState;

    public Integer getTsBooksId() {
        return tsBooksId;
    }

    public void setTsBooksId(Integer tsBooksId) {
        this.tsBooksId = tsBooksId;
    }

    public String getTsBooksName() {
        return tsBooksName;
    }

    public void setTsBooksName(String tsBooksName) {
        this.tsBooksName = tsBooksName == null ? null : tsBooksName.trim();
    }

    public String getTsBooksType() {
        return tsBooksType;
    }

    public void setTsBooksType(String tsBooksType) {
        this.tsBooksType = tsBooksType == null ? null : tsBooksType.trim();
    }

    public String getTsBooksAuthor() {
        return tsBooksAuthor;
    }

    public void setTsBooksAuthor(String tsBooksAuthor) {
        this.tsBooksAuthor = tsBooksAuthor == null ? null : tsBooksAuthor.trim();
    }

    public String getTsBooksPress() {
        return tsBooksPress;
    }

    public void setTsBooksPress(String tsBooksPress) {
        this.tsBooksPress = tsBooksPress == null ? null : tsBooksPress.trim();
    }

    public String getTsBooksPicture() {
        return tsBooksPicture;
    }

    public void setTsBooksPicture(String tsBooksPicture) {
        this.tsBooksPicture = tsBooksPicture == null ? null : tsBooksPicture.trim();
    }

    public Integer getTsBooksNumber() {
        return tsBooksNumber;
    }

    public void setTsBooksNumber(Integer tsBooksNumber) {
        this.tsBooksNumber = tsBooksNumber;
    }

    public Double getTsBooksMoney() {
        return tsBooksMoney;
    }

    public void setTsBooksMoney(Double tsBooksMoney) {
        this.tsBooksMoney = tsBooksMoney;
    }

    public String getTsBooksIntroduce() {
        return tsBooksIntroduce;
    }

    public void setTsBooksIntroduce(String tsBooksIntroduce) {
        this.tsBooksIntroduce = tsBooksIntroduce == null ? null : tsBooksIntroduce.trim();
    }

    public String getTsBooksState() {
        return tsBooksState;
    }

    public void setTsBooksState(String tsBooksState) {
        this.tsBooksState = tsBooksState == null ? null : tsBooksState.trim();
    }
}