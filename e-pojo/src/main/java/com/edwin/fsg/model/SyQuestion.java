package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 题目表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_question")
public class SyQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 试卷ID
     */
    //("test_paper_id")
    private Long testPaperId;
    /**
     * 题目标题
     */
    private String name;
    /**
     * 正确选项ID
     */
    //("correct_option_id")
    private Long correctOptionId;
    /**
     * 题目分数
     */
    private Integer score;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Long testPaperId) {
        this.testPaperId = testPaperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCorrectOptionId() {
        return correctOptionId;
    }

    public void setCorrectOptionId(Long correctOptionId) {
        this.correctOptionId = correctOptionId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyQuestion{" +
        "id=" + id +
        ", testPaperId=" + testPaperId +
        ", name=" + name +
        ", correctOptionId=" + correctOptionId +
        ", score=" + score +
        "}";
    }
}
