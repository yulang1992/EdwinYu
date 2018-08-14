package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 角色_资源表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_role_resource")
public class MRoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 角色ID
     */
    //("role_id")
    private Long roleId;
    /**
     * 资源ID
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
        return "MRoleResource{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", resourceId=" + resourceId +
        "}";
    }
}
