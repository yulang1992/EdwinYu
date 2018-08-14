package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_article")
public class SyArticle implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 类型：1学习日记、2精彩分享、3、成功案例、4、疑难解答、5名师观点、6经典案例、7课堂案例、8热门新闻
     */
    private Integer type;
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
    //("create_time")
    private Integer createTime;
    /**
     * 发布人
     */
    private String publisher;
    /**
     * 课程系列ID
     */
    //("course_series_id")
    private Long courseSeriesId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getCourseSeriesId() {
        return courseSeriesId;
    }

    public void setCourseSeriesId(Long courseSeriesId) {
        this.courseSeriesId = courseSeriesId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyArticle{" +
        "id=" + id +
        ", type=" + type +
        ", title=" + title +
        ", icon=" + icon +
        ", content=" + content +
        ", createTime=" + createTime +
        ", publisher=" + publisher +
        ", courseSeriesId=" + courseSeriesId +
        "}";
    }
}
