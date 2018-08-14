package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 用户扩展表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class UserExt  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long Id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 公司名称
     */
    private String company;
    /**
     * 所在地
     */
    private String site;
    /**
     * 地址
     */
    private String address;
    /**
     * 公司法人
     */
    private String corporate;
    /**
     * 行业
     */
    private String vocation;
    /**
     * 公司性质
     */
    private String nature;
    /**
     * 法人身份证
     */
    private String identityCard;
    /**
     * 营业执照
     */
    private String businessLicense;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 手机
     */
    private String cellphone;
    /**
     * 法人电话
     */
    private String legalPhone;
    /**
     * 卖家属性
     */
    private String properties;
    /**
     * 是否开启免运费规则   0：不开启 1：开启
     */
    private Integer freeRule;
    /**
     * 商品多少数量起送   0为始终需要运费
     */
    private Integer freeSize;
    /**
     * 开户银行
     */
    private String depositBank;
    /**
     * 银行帐号
     */
    private String bankAccount;
    /**
     * 银行开户许可证
     */
    private String bankLicense;
    /**
     * 邮箱
     */
    private String email;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Integer getFreeRule() {
        return freeRule;
    }

    public void setFreeRule(Integer freeRule) {
        this.freeRule = freeRule;
    }

    public Integer getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankLicense() {
        return bankLicense;
    }

    public void setBankLicense(String bankLicense) {
        this.bankLicense = bankLicense;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
    public String toString() {
        return "UserExt{" +
        "Id=" + Id +
        ", userId=" + userId +
        ", company=" + company +
        ", site=" + site +
        ", address=" + address +
        ", corporate=" + corporate +
        ", vocation=" + vocation +
        ", nature=" + nature +
        ", identityCard=" + identityCard +
        ", businessLicense=" + businessLicense +
        ", contacts=" + contacts +
        ", cellphone=" + cellphone +
        ", legalPhone=" + legalPhone +
        ", properties=" + properties +
        ", freeRule=" + freeRule +
        ", freeSize=" + freeSize +
        ", depositBank=" + depositBank +
        ", bankAccount=" + bankAccount +
        ", bankLicense=" + bankLicense +
        ", email=" + email +
        "}";
    }
}
