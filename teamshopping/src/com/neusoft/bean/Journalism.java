package com.neusoft.bean;

public class Journalism {
    private Integer journalismId;

    private String journalismTitle;

    private String journalismArticle;

    private byte[] journalismPicture;

    public Integer getJournalismId() {
        return journalismId;
    }

    public void setJournalismId(Integer journalismId) {
        this.journalismId = journalismId;
    }

    public String getJournalismTitle() {
        return journalismTitle;
    }

    public void setJournalismTitle(String journalismTitle) {
        this.journalismTitle = journalismTitle == null ? null : journalismTitle.trim();
    }

    public String getJournalismArticle() {
        return journalismArticle;
    }

    public void setJournalismArticle(String journalismArticle) {
        this.journalismArticle = journalismArticle == null ? null : journalismArticle.trim();
    }

    public byte[] getJournalismPicture() {
        return journalismPicture;
    }

    public void setJournalismPicture(byte[] journalismPicture) {
        this.journalismPicture = journalismPicture;
    }
}