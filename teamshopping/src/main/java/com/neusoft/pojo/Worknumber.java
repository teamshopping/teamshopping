package com.neusoft.pojo;

public class Worknumber {
    private Integer worknumberId;

    private String worknumberNumber;

    public Integer getWorknumberId() {
        return worknumberId;
    }

    public void setWorknumberId(Integer worknumberId) {
        this.worknumberId = worknumberId;
    }

    public String getWorknumberNumber() {
        return worknumberNumber;
    }

    public void setWorknumberNumber(String worknumberNumber) {
        this.worknumberNumber = worknumberNumber == null ? null : worknumberNumber.trim();
    }
}