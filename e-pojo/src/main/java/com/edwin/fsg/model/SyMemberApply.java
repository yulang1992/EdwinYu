package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 公司申请卡表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_member_apply")
public class SyMemberApply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请ID
     */
    
    private Long id;
    /**
     * 卡ID
     */
    //("card_id")
    private String cardId;
    /**
     * 公司
     */
    private String company;
    /**
     * 联系人姓名
     */
    private String name;
    /**
     * 头像
     */
    private String photo;
    /**
     * 联系人邮箱
     */
    private String email;
    /**
     * 联系人电话
     */
    private String phone;
    /**
     * 联系人微信号
     */
    private String weixin;
    /**
     * 添加时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 修改时间
     */
    //("update_time")
    private Integer updateTime;
    /**
     * 添加/修改操作人微信号
     */
    //("update_admin")
    private String updateAdmin;
    /**
     * 所在省
     */
    //("address_pro")
    private String addressPro;
    /**
     * 所在市
     */
    //("address_city")
    private String addressCity;
    /**
     * 公司面积
     */
    //("business_area")
    private String businessArea;
    /**
     * 店面数量
     */
    //("business_sl")
    private String businessSl;
    /**
     * 年稍售额
     */
    //("annual_sales")
    private String annualSales;
    /**
     * 年稍售数量
     */
    //("annual_sl")
    private String annualSl;
    /**
     * 是否复核  0否、1是
     */
    //("is_review")
    private Integer isReview;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(String updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    public String getAddressPro() {
        return addressPro;
    }

    public void setAddressPro(String addressPro) {
        this.addressPro = addressPro;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getBusinessSl() {
        return businessSl;
    }

    public void setBusinessSl(String businessSl) {
        this.businessSl = businessSl;
    }

    public String getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(String annualSales) {
        this.annualSales = annualSales;
    }

    public String getAnnualSl() {
        return annualSl;
    }

    public void setAnnualSl(String annualSl) {
        this.annualSl = annualSl;
    }

    public Integer getIsReview() {
        return isReview;
    }

    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyMemberApply{" +
        "id=" + id +
        ", cardId=" + cardId +
        ", company=" + company +
        ", name=" + name +
        ", photo=" + photo +
        ", email=" + email +
        ", phone=" + phone +
        ", weixin=" + weixin +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", updateAdmin=" + updateAdmin +
        ", addressPro=" + addressPro +
        ", addressCity=" + addressCity +
        ", businessArea=" + businessArea +
        ", businessSl=" + businessSl +
        ", annualSales=" + annualSales +
        ", annualSl=" + annualSl +
        ", isReview=" + isReview +
        "}";
    }
}
