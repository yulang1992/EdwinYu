package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 内容位定义表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_content_define")
public class MContentDefine implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 内容位名称
     */
    //("content_name")
    private String contentName;
    /**
     * 内容位数据条数
     */
    //("content_count")
    private Integer contentCount;
    /**
     * 内容所属组
     */
    //("content_group")
    private String contentGroup;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public Integer getContentCount() {
        return contentCount;
    }

    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    public String getContentGroup() {
        return contentGroup;
    }

    public void setContentGroup(String contentGroup) {
        this.contentGroup = contentGroup;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MContentDefine{" +
        "id=" + id +
        ", contentName=" + contentName +
        ", contentCount=" + contentCount +
        ", contentGroup=" + contentGroup +
        "}";
    }
}
