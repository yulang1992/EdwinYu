package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * ½ÇÉ«_×ÊÔ´±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_role_resource")
public class SyRoleResource implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    
    private Long id;
    /**
     * ½ÇÉ«ID
     */
    //("role_id")
    private Long roleId;
    /**
     * ×ÊÔ´ID
     */
    //("resource_id")
    private Long resourceId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyRoleResource{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", resourceId=" + resourceId +
        "}";
    }
}
