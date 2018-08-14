package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 资源权限表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_resource")
public class MResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 资源名称
     */
    //("resource_name")
    private String resourceName;
    /**
     * 资源路径
     */
    //("resource_url")
    private String resourceUrl;
    /**
     * 资源图标
     */
    //("resource_icon")
    private String resourceIcon;
    /**
     * 父ID
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
        return "MResource{" +
        "id=" + id +
        ", resourceName=" + resourceName +
        ", resourceUrl=" + resourceUrl +
        ", resourceIcon=" + resourceIcon +
        ", parentId=" + parentId +
        "}";
    }
}
