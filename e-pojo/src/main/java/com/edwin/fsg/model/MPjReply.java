package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息回复表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_reply")
public class MPjReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 评论表ID
     */
    //("appraise_id")
    private Long appraiseId;
    /**
     * 回复内容
     */
    private String content;
    /**
     * 回复用户
     */
    //("user_id")
    private Long userId;
    /**
     * 回复时间
     */
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(Long appraiseId) {
        this.appraiseId = appraiseId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MPjReply{" +
        "id=" + id +
        ", appraiseId=" + appraiseId +
        ", content=" + content +
        ", userId=" + userId +
        ", createTime=" + createTime +
        "}";
    }
}
