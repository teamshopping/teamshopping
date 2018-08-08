package com.neusoft.pojo;

public class TeamshoppingGame {
    private Integer tsGameId;

    private String tsGameName;

    private String tsGameType;

    private String tsGameEdition;

    private String tsGameCompany;

    private String tsGameCode;

    private Integer tsGameCurrency;

    private String tsGamePicture;

    private Integer tsGameNumber;

    private Double tsGameMoney;

    private String tsGameIntroduce;

    private String tsGameState;

    public Integer getTsGameId() {
        return tsGameId;
    }

    public void setTsGameId(Integer tsGameId) {
        this.tsGameId = tsGameId;
    }

    public String getTsGameName() {
        return tsGameName;
    }

    public void setTsGameName(String tsGameName) {
        this.tsGameName = tsGameName == null ? null : tsGameName.trim();
    }

    public String getTsGameType() {
        return tsGameType;
    }

    public void setTsGameType(String tsGameType) {
        this.tsGameType = tsGameType == null ? null : tsGameType.trim();
    }

    public String getTsGameEdition() {
        return tsGameEdition;
    }

    public void setTsGameEdition(String tsGameEdition) {
        this.tsGameEdition = tsGameEdition == null ? null : tsGameEdition.trim();
    }

    public String getTsGameCompany() {
        return tsGameCompany;
    }

    public void setTsGameCompany(String tsGameCompany) {
        this.tsGameCompany = tsGameCompany == null ? null : tsGameCompany.trim();
    }

    public String getTsGameCode() {
        return tsGameCode;
    }

    public void setTsGameCode(String tsGameCode) {
        this.tsGameCode = tsGameCode == null ? null : tsGameCode.trim();
    }

    public Integer getTsGameCurrency() {
        return tsGameCurrency;
    }

    public void setTsGameCurrency(Integer tsGameCurrency) {
        this.tsGameCurrency = tsGameCurrency;
    }

    public String getTsGamePicture() {
        return tsGamePicture;
    }

    public void setTsGamePicture(String tsGamePicture) {
        this.tsGamePicture = tsGamePicture == null ? null : tsGamePicture.trim();
    }

    public Integer getTsGameNumber() {
        return tsGameNumber;
    }

    public void setTsGameNumber(Integer tsGameNumber) {
        this.tsGameNumber = tsGameNumber;
    }

    public Double getTsGameMoney() {
        return tsGameMoney;
    }

    public void setTsGameMoney(Double tsGameMoney) {
        this.tsGameMoney = tsGameMoney;
    }

    public String getTsGameIntroduce() {
        return tsGameIntroduce;
    }

    public void setTsGameIntroduce(String tsGameIntroduce) {
        this.tsGameIntroduce = tsGameIntroduce == null ? null : tsGameIntroduce.trim();
    }

    public String getTsGameState() {
        return tsGameState;
    }

    public void setTsGameState(String tsGameState) {
        this.tsGameState = tsGameState == null ? null : tsGameState.trim();
    }
}