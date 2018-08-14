package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 老师简介表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_teacher_intro")
public class SyTeacherIntro implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 老师ID
     */
    //("teacher_id")
    private Long teacherId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyTeacherIntro{" +
        "id=" + id +
        ", teacherId=" + teacherId +
        ", title=" + title +
        ", content=" + content +
        "}";
    }
}
