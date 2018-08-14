package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 视频表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class SyVideo  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;
    /**
     * 视频名称
     */
    private String name;
    /**
     * 课程系列ID
     */
    private Long courseSeriesId;
    /**
     * 发布人 
     */
    private String publisher;
    /**
     * 视频简介
     */
    private String description;
    /**
     * 视频时长
     */
    private Integer duration;
    /**
     * 创建时间
     */
    private Integer createTime;
    /**
     * 视频地址
     */
    private String url;
    /**
     * 视频类型：1课堂实录、2名师授课、3互动现场、4学员采访、5课程感言  、10：pop教学视频、 11：企业舞蹈视频、  12：士气展示视频、13：魔法气球教学视频 、14：沙盘演练视频
     */
    private Integer type;
    /**
     * 视频首帧图片
     */
    private String photo;


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

    public Long getCourseSeriesId() {
        return courseSeriesId;
    }

    public void setCourseSeriesId(Long courseSeriesId) {
        this.courseSeriesId = courseSeriesId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    

    
    public String toString() {
        return "SyVideo{" +
        "id=" + id +
        ", name=" + name +
        ", courseSeriesId=" + courseSeriesId +
        ", publisher=" + publisher +
        ", description=" + description +
        ", duration=" + duration +
        ", createTime=" + createTime +
        ", url=" + url +
        ", type=" + type +
        ", photo=" + photo +
        "}";
    }
}
