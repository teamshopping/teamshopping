package com.neusoft.pojo;

import java.util.Date;

public class TeamshoppingTravel {
    private Integer tsTravelId;

    private String tsTravelTeamname;

    private String tsTravelGuide;

    private String tsTravelStyle;

    private String tsTravelDestination;

    private String tsTravelGoland;

    private Date tsTravelGotime;

    private Integer tsTravelPlaytime;

    private String tsTravelRoute;

    private String tsTravelPicture;

    private Integer tsTravelNumber;

    private Double tsTravelMoney;

    private String tsTravelIntroduce;

    private String tsTravelState;

    public Integer getTsTravelId() {
        return tsTravelId;
    }

    public void setTsTravelId(Integer tsTravelId) {
        this.tsTravelId = tsTravelId;
    }

    public String getTsTravelTeamname() {
        return tsTravelTeamname;
    }

    public void setTsTravelTeamname(String tsTravelTeamname) {
        this.tsTravelTeamname = tsTravelTeamname == null ? null : tsTravelTeamname.trim();
    }

    public String getTsTravelGuide() {
        return tsTravelGuide;
    }

    public void setTsTravelGuide(String tsTravelGuide) {
        this.tsTravelGuide = tsTravelGuide == null ? null : tsTravelGuide.trim();
    }

    public String getTsTravelStyle() {
        return tsTravelStyle;
    }

    public void setTsTravelStyle(String tsTravelStyle) {
        this.tsTravelStyle = tsTravelStyle == null ? null : tsTravelStyle.trim();
    }

    public String getTsTravelDestination() {
        return tsTravelDestination;
    }

    public void setTsTravelDestination(String tsTravelDestination) {
        this.tsTravelDestination = tsTravelDestination == null ? null : tsTravelDestination.trim();
    }

    public String getTsTravelGoland() {
        return tsTravelGoland;
    }

    public void setTsTravelGoland(String tsTravelGoland) {
        this.tsTravelGoland = tsTravelGoland == null ? null : tsTravelGoland.trim();
    }

    public Date getTsTravelGotime() {
        return tsTravelGotime;
    }

    public void setTsTravelGotime(Date tsTravelGotime) {
        this.tsTravelGotime = tsTravelGotime;
    }

    public Integer getTsTravelPlaytime() {
        return tsTravelPlaytime;
    }

    public void setTsTravelPlaytime(Integer tsTravelPlaytime) {
        this.tsTravelPlaytime = tsTravelPlaytime;
    }

    public String getTsTravelRoute() {
        return tsTravelRoute;
    }

    public void setTsTravelRoute(String tsTravelRoute) {
        this.tsTravelRoute = tsTravelRoute == null ? null : tsTravelRoute.trim();
    }

    public String getTsTravelPicture() {
        return tsTravelPicture;
    }

    public void setTsTravelPicture(String tsTravelPicture) {
        this.tsTravelPicture = tsTravelPicture == null ? null : tsTravelPicture.trim();
    }

    public Integer getTsTravelNumber() {
        return tsTravelNumber;
    }

    public void setTsTravelNumber(Integer tsTravelNumber) {
        this.tsTravelNumber = tsTravelNumber;
    }

    public Double getTsTravelMoney() {
        return tsTravelMoney;
    }

    public void setTsTravelMoney(Double tsTravelMoney) {
        this.tsTravelMoney = tsTravelMoney;
    }

    public String getTsTravelIntroduce() {
        return tsTravelIntroduce;
    }

    public void setTsTravelIntroduce(String tsTravelIntroduce) {
        this.tsTravelIntroduce = tsTravelIntroduce == null ? null : tsTravelIntroduce.trim();
    }

    public String getTsTravelState() {
        return tsTravelState;
    }

    public void setTsTravelState(String tsTravelState) {
        this.tsTravelState = tsTravelState == null ? null : tsTravelState.trim();
    }
}