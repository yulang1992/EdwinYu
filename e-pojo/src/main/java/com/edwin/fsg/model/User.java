package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class User  implements Serializable{


	private static final long serialVersionUID = 5314834051900248086L;
	/**
     * 编号
     */
    private Long Id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户类型 1：买家 2：卖家
     */
    private Integer userType;
    /**
     * 用户状态 1：可用 2：禁用
     */
    private Integer status;
    /**
     * 国商学员ID
     */
    private Long memberId;
    /**
     * 父用户ID
     */
    private Long parentUserId;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
    }


    
    public String toString() {
        return "User{" +
        "Id=" + Id +
        ", username=" + username +
        ", password=" + password +
        ", userType=" + userType +
        ", status=" + status +
        ", memberId=" + memberId +
        ", parentUserId=" + parentUserId +
        "}";
    }
}
