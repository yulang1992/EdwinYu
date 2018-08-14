package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * ¿Î³ÌÏµÁÐ±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_course_series")
public class SyCourseSeries implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    
    private Long id;
    /**
     * 系列名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 授课对象
     */
    //("suit_people")
    private String suitPeople;
    /**
     * 讲师
     */
    private String teacher;
    /**
     * 价格
     */
    private Double price;
    /**
     * 会员价格
     */
    //("vip_price")
    private Double vipPrice;
    /**
     * 修改时间
     */
    //("update_time")
    private Integer updateTime;
    /**
     * 修改人
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
     * 讲师ID
     */
    //("teacher_id")
    private Long teacherId;
    /**
     * 报名须知
     */
    private String notice;
    //("course_order")
    private String courseOrder;
    /**
     * 路径缩写
     */
    //("short_url")
    private String shortUrl;
    /**
     * 前台是否显示
     */
    //("is_show")
    private Integer isShow;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getCourseOrder() {
        return courseOrder;
    }

    public void setCourseOrder(String courseOrder) {
        this.courseOrder = courseOrder;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyCourseSeries{" +
        "id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", suitPeople=" + suitPeople +
        ", teacher=" + teacher +
        ", price=" + price +
        ", vipPrice=" + vipPrice +
        ", updateTime=" + updateTime +
        ", updateAdmin=" + updateAdmin +
        ", worth=" + worth +
        ", aim=" + aim +
        ", teacherId=" + teacherId +
        ", notice=" + notice +
        ", courseOrder=" + courseOrder +
        ", shortUrl=" + shortUrl +
        ", isShow=" + isShow +
        "}";
    }
}
