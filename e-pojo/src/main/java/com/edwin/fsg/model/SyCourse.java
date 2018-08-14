package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 课程表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_course")
public class SyCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 课程系列ID
     */
    //("course_series_id")
    private Long courseSeriesId;
    /**
     * 关联编号
     */
    private String name;
    /**
     * 课程描述
     */
    private String description;
    /**
     * 适合人群
     */
    //("suit_people")
    private String suitPeople;
    /**
     * 讲课地点
     */
    private String address;
    /**
     * 主讲人
     */
    private String teacher;
    /**
     * 课程价格
     */
    private Double price;
    /**
     * 会员价格
     */
    //("vip_price")
    private Double vipPrice;
    /**
     * 课程课时
     */
    private String lesson;
    /**
     * 课时别名
     */
    //("lesson_alias")
    private String lessonAlias;
    /**
     * 开始时间
     */
    //("start_time")
    private Integer startTime;
    /**
     * 结束时间
     */
    //("end_time")
    private Integer endTime;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 修改时间
     */
    //("update_time")
    private Integer updateTime;
    /**
     * 创建/修改操作人
     */
    //("update_admin")
    private Long updateAdmin;
    /**
     * 课程价值 
     */
    private String worth;
    /**
     * 课程目标 
     */
    private String aim;
    /**
     * 报名须知
     */
    private String notice;
    /**
     * 讲师ID
     */
    //("teacher_id")
    private Long teacherId;
    /**
     * 课程次数  单位：（人次）
     */
    //("number_of_times")
    private Integer numberOfTimes;
    /**
     * 通知类型  0：普通（默认） 1：最热课程
     */
    //("inform_type")
    private Integer informType;
    /**
     * 课程通知内容
     */
    //("inform_content")
    private String informContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseSeriesId() {
        return courseSeriesId;
    }

    public void setCourseSeriesId(Long courseSeriesId) {
        this.courseSeriesId = courseSeriesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuitPeople() {
        return suitPeople;
    }

    public void setSuitPeople(String suitPeople) {
        this.suitPeople = suitPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLessonAlias() {
        return lessonAlias;
    }

    public void setLessonAlias(String lessonAlias) {
        this.lessonAlias = lessonAlias;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Long updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    public String getWorth() {
        return worth;
    }

    public void setWorth(String worth) {
        this.worth = worth;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getNumberOfTimes() {
        return numberOfTimes;
    }

    public void setNumberOfTimes(Integer numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    public Integer getInformType() {
        return informType;
    }

    public void setInformType(Integer informType) {
        this.informType = informType;
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyCourse{" +
        "id=" + id +
        ", courseSeriesId=" + courseSeriesId +
        ", name=" + name +
        ", description=" + description +
        ", suitPeople=" + suitPeople +
        ", address=" + address +
        ", teacher=" + teacher +
        ", price=" + price +
        ", vipPrice=" + vipPrice +
        ", lesson=" + lesson +
        ", lessonAlias=" + lessonAlias +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", updateAdmin=" + updateAdmin +
        ", worth=" + worth +
        ", aim=" + aim +
        ", notice=" + notice +
        ", teacherId=" + teacherId +
        ", numberOfTimes=" + numberOfTimes +
        ", informType=" + informType +
        ", informContent=" + informContent +
        "}";
    }
}
