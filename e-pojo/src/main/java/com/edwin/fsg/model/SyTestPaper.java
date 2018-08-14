package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 试卷表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_test_paper")
public class SyTestPaper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 试卷名称
     */
    private String name;
    /**
     * 课程系列ID
     */
    //("course_series_id")
    private Long courseSeriesId;
    /**
     * 老师ID
     */
    //("teacher_id")
    private Long teacherId;
    /**
     * 卷面分数
     */
    private Integer score;
    /**
     * 答题时长（分）
     */
    //("answer_duration")
    private Integer answerDuration;
    /**
     * 试卷难度 
     */
    //("difficulty_level")
    private String difficultyLevel;
    /**
     * 试卷形式
     */
    //("paper_style")
    private String paperStyle;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 类型：1每日一练、2新入职员工考试
     */
    private Integer type;


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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAnswerDuration() {
        return answerDuration;
    }

    public void setAnswerDuration(Integer answerDuration) {
        this.answerDuration = answerDuration;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getPaperStyle() {
        return paperStyle;
    }

    public void setPaperStyle(String paperStyle) {
        this.paperStyle = paperStyle;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyTestPaper{" +
        "id=" + id +
        ", name=" + name +
        ", courseSeriesId=" + courseSeriesId +
        ", teacherId=" + teacherId +
        ", score=" + score +
        ", answerDuration=" + answerDuration +
        ", difficultyLevel=" + difficultyLevel +
        ", paperStyle=" + paperStyle +
        ", createTime=" + createTime +
        ", type=" + type +
        "}";
    }
}
