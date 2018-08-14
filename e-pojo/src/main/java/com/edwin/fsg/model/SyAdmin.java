package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_admin")
public class SyAdmin implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ¹ÜÀíÔ±ID
     */
    
    private Long id;
    private String phone;
    private String name;
    private String password;
    /**
     * ¼¶±ð
     */
    private Integer level;
    /**
     * ×´Ì¬
     */
    private Integer status;
    /**
     * ´´½¨Ê±¼ä
     */
    //("create_time")
    private Integer createTime;
    /**
     * °´Å¥È¨ÏÞ 1£ºÓÐ³äÖµÈ¨ÏÞ£»2£ºÎÞ³äÖµÈ¨ÏÞ
     */
    //("permissions_button")
    private String permissionsButton;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getPermissionsButton() {
        return permissionsButton;
    }

    public void setPermissionsButton(String permissionsButton) {
        this.permissionsButton = permissionsButton;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyAdmin{" +
        "id=" + id +
        ", phone=" + phone +
        ", name=" + name +
        ", password=" + password +
        ", level=" + level +
        ", status=" + status +
        ", createTime=" + createTime +
        ", permissionsButton=" + permissionsButton +
        "}";
    }
}
