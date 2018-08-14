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
//("sy_praise")
public class SyPraise implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;
    /**
     * 用户id
     */
    //("member_id")
    private Long memberId;
    /**
     * 点赞对象id
     */
    //("pra_object_id")
    private Long praObjectId;
    /**
     * 点赞类型：1视频、2文章 、3评论、4图片
     */
    //("pra_object")
    private Integer praObject;
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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getPraObjectId() {
        return praObjectId;
    }

    public void setPraObjectId(Long praObjectId) {
        this.praObjectId = praObjectId;
    }

    public Integer getPraObject() {
        return praObject;
    }

    public void setPraObject(Integer praObject) {
        this.praObject = praObject;
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
        return "SyPraise{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", praObjectId=" + praObjectId +
        ", praObject=" + praObject +
        ", phone=" + phone +
        "}";
    }
}
