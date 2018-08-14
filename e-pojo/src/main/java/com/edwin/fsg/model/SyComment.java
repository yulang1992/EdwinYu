package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_comment")
public class SyComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 学员ID
     */
    //("member_id")
    private Long memberId;
    /**
     * 评论对像：1视频、2案例、3观点、4日记、5文章、6评论
     */
    //("com_object")
    private Integer comObject;
    /**
     * 评论对象ID
     */
    //("com_object_id")
    private Long comObjectId;
    /**
     * 点赞数
     */
    private Integer praise;
    /**
     * 手机号
     */
    private String phone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getComObject() {
        return comObject;
    }

    public void setComObject(Integer comObject) {
        this.comObject = comObject;
    }

    public Long getComObjectId() {
        return comObjectId;
    }

    public void setComObjectId(Long comObjectId) {
        this.comObjectId = comObjectId;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyComment{" +
        "id=" + id +
        ", content=" + content +
        ", createTime=" + createTime +
        ", memberId=" + memberId +
        ", comObject=" + comObject +
        ", comObjectId=" + comObjectId +
        ", praise=" + praise +
        ", phone=" + phone +
        "}";
    }
}
