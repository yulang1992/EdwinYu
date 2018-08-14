package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息评论表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_appraise")
public class MPjAppraise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 咨询表ID
     */
    //("consult_id")
    private Long consultId;
    /**
     * 评价内容
     */
    private String content;
    /**
     * 评价用户
     */
    //("user_id")
    private Long userId;
    /**
     * 评论时间
     */
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultId() {
        return consultId;
    }

    public void setConsultId(Long consultId) {
        this.consultId = consultId;
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
        return "MPjAppraise{" +
        "id=" + id +
        ", consultId=" + consultId +
        ", content=" + content +
        ", userId=" + userId +
        ", createTime=" + createTime +
        "}";
    }
}
