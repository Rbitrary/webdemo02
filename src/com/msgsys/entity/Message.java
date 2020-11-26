package com.msgsys.entity;

/**
 * 作者: Fu YuHang
 * 日期: 2020/11/26 15:55
 * 描述:
 */
public class Message {
    private String id;
    private String formUid;
    private Integer toUid;
    private String mTitle;
    private String mContent;
    private Integer isRead;
    private String createTime;

    public Message() {
    }

    public Message(String id, String formUid, Integer toUid, String mTitle, String mContent, Integer isRead, String createTime) {
        this.id = id;
        this.formUid = formUid;
        this.toUid = toUid;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.isRead = isRead;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormUid() {
        return formUid;
    }

    public void setFormUid(String formUid) {
        this.formUid = formUid;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
