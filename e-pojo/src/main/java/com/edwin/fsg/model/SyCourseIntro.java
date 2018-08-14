package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 课程详情表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_course_intro")
public class SyCourseIntro implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 课程id
     */
    //("course_id")
    private Long courseId;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;


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

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyCourseIntro{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", content=" + content +
        ", createTime=" + createTime +
        "}";
    }
}
