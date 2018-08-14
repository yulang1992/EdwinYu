package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 用户_角色表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_user_role")
public class MUserRole implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 用户ID
     */
    //("user_id")
    private Long userId;
    /**
     * 角色ID
     */
    //("role_id")
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MUserRole{" +
        "id=" + id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
