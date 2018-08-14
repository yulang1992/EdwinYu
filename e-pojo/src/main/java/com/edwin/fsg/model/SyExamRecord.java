package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 考试记录表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_exam_record")
public class SyExamRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 学员ID
     */
    //("member_id")
    private Long memberId;
    /**
     * 试卷ID
     */
    //("test_paper_id")
    private Long testPaperId;
    /**
     * 题目ID 
     */
    //("question_id")
    private Long questionId;
    /**
     * 答案选项ID
     */
    //("answer_option_id")
    private Long answerOptionId;
    /**
     * 题目得分
     */
    private Integer score;
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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Long testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getAnswerOptionId() {
        return answerOptionId;
    }

    public void setAnswerOptionId(Long answerOptionId) {
        this.answerOptionId = answerOptionId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
        return "SyExamRecord{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", testPaperId=" + testPaperId +
        ", questionId=" + questionId +
        ", answerOptionId=" + answerOptionId +
        ", score=" + score +
        ", createTime=" + createTime +
        "}";
    }
}
