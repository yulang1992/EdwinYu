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
//("sy_appointment")
public class SyAppointment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Ô¤Ô¼±íID
     */
    
    private Long id;
    /**
     * Ñ§Ô±ID
     */
    //("member_id")
    private Long memberId;
    /**
     * ¿Î³ÌID
     */
    //("course_id")
    private Long courseId;
    /**
     * Ô¤Ô¼µÄÈËIDÁÐ±í£¬¸ñÊ½Èç£º1001,1002,1003
     */
    //("stu_ids")
    private String stuIds;
    /**
     * Ô¤Ô¼ÈËÊý
     */
    private Integer number;
    /**
     * ±¸×¢
     */
    private String remark;
    //("start_time")
    private Integer startTime;
    /**
     * ÐÂÔöÈË
     */
    //("create_admin")
    private Long createAdmin;
    //("create_time")
    private Integer createTime;
    /**
     * ÐÞ¸Ä ÈË
     */
    //("update_admin")
    private Long updateAdmin;
    /**
     * ÐÞ¸ÄÊ±¼ä
     */
    //("update_time")
    private Integer updateTime;


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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getStuIds() {
        return stuIds;
    }

    public void setStuIds(String stuIds) {
        this.stuIds = stuIds;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Long getCreateAdmin() {
        return createAdmin;
    }

    public void setCreateAdmin(Long createAdmin) {
        this.createAdmin = createAdmin;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Long updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyAppointment{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", courseId=" + courseId +
        ", stuIds=" + stuIds +
        ", number=" + number +
        ", remark=" + remark +
        ", startTime=" + startTime +
        ", createAdmin=" + createAdmin +
        ", createTime=" + createTime +
        ", updateAdmin=" + updateAdmin +
        ", updateTime=" + updateTime +
        "}";
    }
}
