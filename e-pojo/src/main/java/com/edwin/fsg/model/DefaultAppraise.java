package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 默认评价表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("default_appraise")
public class DefaultAppraise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Integer id;
    /**
     * 评价默认内容
     */
    private String content;
    private Long type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "DefaultAppraise{" +
        "id=" + id +
        ", content=" + content +
        ", type=" + type +
        "}";
    }
}
