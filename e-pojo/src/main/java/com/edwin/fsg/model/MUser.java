package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_user")
public class MUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    //("real_name")
    private String realName;
    /**
     * 手机
     */
    //("mobile_phone")
    private String mobilePhone;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MUser{" +
        "id=" + id +
        ", name=" + name +
        ", password=" + password +
        ", realName=" + realName +
        ", mobilePhone=" + mobilePhone +
        ", sex=" + sex +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
