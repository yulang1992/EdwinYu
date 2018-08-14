package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * ÉÏ¿ÎÑ§Ô±¹ÜÀí±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_study_people")
public class SyStudyPeople implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学习人ID
     */
    
    private Long id;
    /**
     * ¿Î³ÌID
     */
    //("course_id")
    private Long courseId;
    /**
     * ÆóÒµÑ§Ô±ID£¨¹«Ë¾£©
     */
    //("member_id")
    private Long memberId;
    /**
     * Éí·ÝÖ¤ºÅ
     */
    //("identity_num")
    private String identityNum;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 姓名
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 微信号
     */
    private String weixin;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 新增人
     */
    //("create_admin")
    private Long createAdmin;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getCreateAdmin() {
        return createAdmin;
    }

    public void setCreateAdmin(Long createAdmin) {
        this.createAdmin = createAdmin;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyStudyPeople{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", memberId=" + memberId +
        ", identityNum=" + identityNum +
        ", phone=" + phone +
        ", name=" + name +
        ", position=" + position +
        ", sex=" + sex +
        ", weixin=" + weixin +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", createAdmin=" + createAdmin +
        "}";
    }
}
