package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 内容位属性定义表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_content_property_define")
public class MContentPropertyDefine implements Serializable {

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
     * 属性名称
     */
    //("property_name")
    private String propertyName;
    /**
     * 属性唯一标识
     */
    //("property_code")
    private String propertyCode;
    /**
     * 属性类型
     */
    //("property_type")
    private Integer propertyType;
    /**
     * 属性顺序
     */
    //("property_order")
    private String propertyOrder;


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

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public Integer getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyOrder() {
        return propertyOrder;
    }

    public void setPropertyOrder(String propertyOrder) {
        this.propertyOrder = propertyOrder;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MContentPropertyDefine{" +
        "id=" + id +
        ", contentId=" + contentId +
        ", propertyName=" + propertyName +
        ", propertyCode=" + propertyCode +
        ", propertyType=" + propertyType +
        ", propertyOrder=" + propertyOrder +
        "}";
    }
}
