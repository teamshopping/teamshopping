package com.neusoft.bean;

public class Help {
    private Integer helpId;

    private String helpStep;

    private String helpContent;

    private byte[] helpPicture;

    public Integer getHelpId() {
        return helpId;
    }

    public void setHelpId(Integer helpId) {
        this.helpId = helpId;
    }

    public String getHelpStep() {
        return helpStep;
    }

    public void setHelpStep(String helpStep) {
        this.helpStep = helpStep == null ? null : helpStep.trim();
    }

    public String getHelpContent() {
        return helpContent;
    }

    public void setHelpContent(String helpContent) {
        this.helpContent = helpContent == null ? null : helpContent.trim();
    }

    public byte[] getHelpPicture() {
        return helpPicture;
    }

    public void setHelpPicture(byte[] helpPicture) {
        this.helpPicture = helpPicture;
    }
}