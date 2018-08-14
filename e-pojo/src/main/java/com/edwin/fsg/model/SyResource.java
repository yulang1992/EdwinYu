package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * ×ÊÔ´È¨ÏÞ±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_resource")
public class SyResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    
    private Long id;
    /**
     * ×ÊÔ´Ãû³Æ

     */
    //("resource_name")
    private String resourceName;
    /**
     * ×ÊÔ´Â·¾¶
     */
    //("resource_url")
    private String resourceUrl;
    /**
     * ×ÊÔ´Í¼±ê
     */
    //("resource_icon")
    private String resourceIcon;
    /**
     * ¸¸ID
     */
    //("parent_id")
    private Long parentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceIcon() {
        return resourceIcon;
    }

    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyResource{" +
        "id=" + id +
        ", resourceName=" + resourceName +
        ", resourceUrl=" + resourceUrl +
        ", resourceIcon=" + resourceIcon +
        ", parentId=" + parentId +
        "}";
    }
}
