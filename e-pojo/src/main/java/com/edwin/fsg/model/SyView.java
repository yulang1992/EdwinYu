package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 观点表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class SyView  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 图标
     */
    private String icon;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private Integer createTime;
    /**
     * 发布人ID
     */
    private Long publisherId;
    /**
     * 发布人类型：1老师、2用户（学员）
     */
    private Integer publisherType;
    /**
     * 课程系列ID
     */
    private Long courseSeriesId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getPublisherType() {
        return publisherType;
    }

    public void setPublisherType(Integer publisherType) {
        this.publisherType = publisherType;
    }

    public Long getCourseSeriesId() {
        return courseSeriesId;
    }

    public void setCourseSeriesId(Long courseSeriesId) {
        this.courseSeriesId = courseSeriesId;
    }


    
    public String toString() {
        return "SyView{" +
        "id=" + id +
        ", title=" + title +
        ", icon=" + icon +
        ", content=" + content +
        ", createTime=" + createTime +
        ", publisherId=" + publisherId +
        ", publisherType=" + publisherType +
        ", courseSeriesId=" + courseSeriesId +
        "}";
    }
}
