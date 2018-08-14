package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 内容位内容表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_content_detail")
public class MContentDetail implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 内容位ID
     */
    //("content_id")
    private Long contentId;
    /**
     * 排序位置
     */
    //("detail_order")
    private String detailOrder;
    /**
     * 内容
     */
    //("detail_content")
    private String detailContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(String detailOrder) {
        this.detailOrder = detailOrder;
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MContentDetail{" +
        "id=" + id +
        ", contentId=" + contentId +
        ", detailOrder=" + detailOrder +
        ", detailContent=" + detailContent +
        "}";
    }
}
