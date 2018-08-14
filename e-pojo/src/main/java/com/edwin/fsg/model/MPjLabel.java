package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息标签表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_label")
public class MPjLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 标签内容
     */
    private String content;
    /**
     * 配件咨询表ID
     */
    //("consult_id")
    private Long consultId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getConsultId() {
        return consultId;
    }

    public void setConsultId(Long consultId) {
        this.consultId = consultId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MPjLabel{" +
        "id=" + id +
        ", content=" + content +
        ", consultId=" + consultId +
        "}";
    }
}
