package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 选项表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_option")
public class SyOption implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 题目ID
     */
    //("question_id")
    private Long questionId;
    /**
     * 选项内容
     */
    private String name;
    /**
     * 选项顺序
     */
    private Integer sort;
    /**
     * 是否是正确选项：1是，0不是
     */
    //("is_correct")
    private Integer isCorrect;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyOption{" +
        "id=" + id +
        ", questionId=" + questionId +
        ", name=" + name +
        ", sort=" + sort +
        ", isCorrect=" + isCorrect +
        "}";
    }
}
