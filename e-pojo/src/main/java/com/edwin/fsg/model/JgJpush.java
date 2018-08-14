package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("jg_jpush")
public class JgJpush implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;
    /**
     * 通知内容标题
     */
    //("notification_title")
    private String notificationTitle;
    /**
     * 消息内容标题
     */
    //("msg_title")
    private String msgTitle;
    /**
     * 消息内容
     */
    //("msg_content")
    private String msgContent;
    //("create_time")
    private Integer createTime;
    /**
     * 1 是发送给所有人 ， 2 是发送给 个人
     */
    //("send_type")
    private Integer sendType;
    /**
     * 当前用户
     */
    //("user_id")
    private Long userId;
    /**
     * 状态（1.评价后推送）
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "JgJpush{" +
        "id=" + id +
        ", notificationTitle=" + notificationTitle +
        ", msgTitle=" + msgTitle +
        ", msgContent=" + msgContent +
        ", createTime=" + createTime +
        ", sendType=" + sendType +
        ", userId=" + userId +
        ", status=" + status +
        "}";
    }
}
