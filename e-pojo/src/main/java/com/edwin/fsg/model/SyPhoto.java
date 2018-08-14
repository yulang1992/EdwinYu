package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 图片表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_photo")
public class SyPhoto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 图片名称
     */
    private String name;
    /**
     * 课程系列ID
     */
    //("course_series_id")
    private Long courseSeriesId;
    /**
     * 图片地址
     */
    private String url;
    /**
     * 图片类型ID
     */
    //("photo_type_id")
    private Long photoTypeId;
    /**
     * 图片跳转链接
     */
    //("link_url")
    private String linkUrl;


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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getPhotoTypeId() {
        return photoTypeId;
    }

    public void setPhotoTypeId(Long photoTypeId) {
        this.photoTypeId = photoTypeId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyPhoto{" +
        "id=" + id +
        ", name=" + name +
        ", courseSeriesId=" + courseSeriesId +
        ", url=" + url +
        ", photoTypeId=" + photoTypeId +
        ", linkUrl=" + linkUrl +
        "}";
    }
}
