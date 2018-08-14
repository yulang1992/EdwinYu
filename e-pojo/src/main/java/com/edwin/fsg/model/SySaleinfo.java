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
//("sy_saleinfo")
public class SySaleinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String wxName;
    private String cardNumber;
    private Integer storefrontNumber;
    private Integer annualSalesNumber;
    private String city;
    private String imgUrl;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getStorefrontNumber() {
        return storefrontNumber;
    }

    public void setStorefrontNumber(Integer storefrontNumber) {
        this.storefrontNumber = storefrontNumber;
    }

    public Integer getAnnualSalesNumber() {
        return annualSalesNumber;
    }

    public void setAnnualSalesNumber(Integer annualSalesNumber) {
        this.annualSalesNumber = annualSalesNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
        return "SySaleinfo{" +
        "id=" + id +
        ", name=" + name +
        ", phone=" + phone +
        ", email=" + email +
        ", wxName=" + wxName +
        ", cardNumber=" + cardNumber +
        ", storefrontNumber=" + storefrontNumber +
        ", annualSalesNumber=" + annualSalesNumber +
        ", city=" + city +
        ", imgUrl=" + imgUrl +
        ", createTime=" + createTime +
        "}";
    }
}
