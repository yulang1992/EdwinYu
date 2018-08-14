package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 分享表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_share")
public class SyShare implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 标题
     */
    private String title;
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
        return "SyShare{" +
        "id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", createTime=" + createTime +
        "}";
    }
}
