package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 书院-PPT保存文件
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_ppt")
public class SyPpt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * PPT名称
     */
    private String name;
    /**
     * 课程系列ID
     */
    //("course_series_id")
    private Long courseSeriesId;
    /**
     * PPT地址
     */
    private String url;
    /**
     * ppt类型  1:门店管理课件  2:销售终端课件 3: 配件销售课件  4:手机相关课件
     */
    private Long type;
    /**
     * 图片
     */
    //("image_url")
    private String imageUrl;


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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyPpt{" +
        "id=" + id +
        ", name=" + name +
        ", courseSeriesId=" + courseSeriesId +
        ", url=" + url +
        ", type=" + type +
        ", imageUrl=" + imageUrl +
        "}";
    }
}
