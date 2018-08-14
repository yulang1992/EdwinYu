package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 学员上课记录
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_study_record")
public class SyStudyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    
    private Long id;
    /**
     * 课程ID
     */
    //("course_id")
    private Long courseId;
    /**
     * 学员ID
     */
    //("member_id")
    private Long memberId;
    /**
     * 学习人数
     */
    private Integer number;
    /**
     * 扣款金额
     */
    //("deduct_money")
    private Double deductMoney;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 更新时间
     */
    //("update_time")
    private Integer updateTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 缴费类型  1:刷卡交易;2:现金交易
     */
    //("cash_type")
    private Integer cashType;
    /**
     * 会员卡号
     */
    //("card_id")
    private String cardId;
    /**
     * 报名方式：1PDA、2网站、3微信
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getDeductMoney() {
        return deductMoney;
    }

    public void setDeductMoney(Double deductMoney) {
        this.deductMoney = deductMoney;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCashType() {
        return cashType;
    }

    public void setCashType(Integer cashType) {
        this.cashType = cashType;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyStudyRecord{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", memberId=" + memberId +
        ", number=" + number +
        ", deductMoney=" + deductMoney +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        ", cashType=" + cashType +
        ", cardId=" + cardId +
        ", type=" + type +
        "}";
    }
}
