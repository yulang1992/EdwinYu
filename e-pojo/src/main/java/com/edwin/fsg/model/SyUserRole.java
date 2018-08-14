package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * ÓÃ»§_½ÇÉ«±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class SyUserRole  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    private Long id;
    /**
     * 角色id
     */
    private Long userId;
    /**
     * 权限id
     */
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


    
    public String toString() {
        return "SyUserRole{" +
        "id=" + id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
