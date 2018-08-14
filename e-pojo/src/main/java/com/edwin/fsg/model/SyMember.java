package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 公司卡表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_member")
public class SyMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学员卡ID
     */
    
    private Long id;
    /**
     * 公司
     */
    private String company;
    /**
     * 卡余额
     */
    private Double money;
    /**
     * 联系人姓名
     */
    private String name;
    /**
     * 联系人职位
     */
    private String position;
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
     * 添加/修改操作人
     */
    //("update_admin")
    private Long updateAdmin;
    /**
     * 是否注册  0否、1是
     */
    //("is_register")
    private Integer isRegister;
    /**
     * 类型：1预约、2报名
     */
    private Integer type;
    /**
     * 打款截图
     */
    private String printscreen;
    /**
     * 有效期（开始日期）
     */
    //("effective_date_begin")
    private Integer effectiveDateBegin;
    /**
     * 有效期（结束日期）
     */
    //("effective_date_end")
    private Integer effectiveDateEnd;
    /**
     * 所在城市
     */
    private String address;
    /**
     * 公司面积
     */
    //("business_area")
    private String businessArea;
    /**
     * 年稍售额
     */
    //("annual_sales")
    private String annualSales;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Long getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Long updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    public Integer getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Integer isRegister) {
        this.isRegister = isRegister;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPrintscreen() {
        return printscreen;
    }

    public void setPrintscreen(String printscreen) {
        this.printscreen = printscreen;
    }

    public Integer getEffectiveDateBegin() {
        return effectiveDateBegin;
    }

    public void setEffectiveDateBegin(Integer effectiveDateBegin) {
        this.effectiveDateBegin = effectiveDateBegin;
    }

    public Integer getEffectiveDateEnd() {
        return effectiveDateEnd;
    }

    public void setEffectiveDateEnd(Integer effectiveDateEnd) {
        this.effectiveDateEnd = effectiveDateEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(String annualSales) {
        this.annualSales = annualSales;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyMember{" +
        "id=" + id +
        ", company=" + company +
        ", money=" + money +
        ", name=" + name +
        ", position=" + position +
        ", phone=" + phone +
        ", weixin=" + weixin +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", updateAdmin=" + updateAdmin +
        ", isRegister=" + isRegister +
        ", type=" + type +
        ", printscreen=" + printscreen +
        ", effectiveDateBegin=" + effectiveDateBegin +
        ", effectiveDateEnd=" + effectiveDateEnd +
        ", address=" + address +
        ", businessArea=" + businessArea +
        ", annualSales=" + annualSales +
        "}";
    }
}
