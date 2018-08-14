package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 收货地址表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("shipping_address")
public class ShippingAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 所在地区
     */
    private String site;
    /**
     * 地址
     */
    private String address;
    /**
     * 手机
     */
    private String cellphone;
    /**
     * 用户ID
     */
    //("user_id")
    private Long userId;
    /**
     * 是否为默认地址 1：是 2：否
     */
    //("is_default")
    private Integer isDefault;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "ShippingAddress{" +
        "Id=" + Id +
        ", contacts=" + contacts +
        ", site=" + site +
        ", address=" + address +
        ", cellphone=" + cellphone +
        ", userId=" + userId +
        ", isDefault=" + isDefault +
        "}";
    }
}
