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
//("sy_card")
public class SyCard implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 学员卡
     */
    
    private Long id;
    /**
     * 卡ID
     */
    //("card_id")
    private String cardId;
    /**
     * 学员ID
     */
    //("member_id")
    private Long memberId;
    /**
     * 卡状态，1：正常，2：挂失中，3：已注销
     */
    private Integer status;
    /**
     * 添加时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 类型：1普通卡、2联邦V卡
     */
    private Integer type;


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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
        return "SyCard{" +
        "id=" + id +
        ", cardId=" + cardId +
        ", memberId=" + memberId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", type=" + type +
        "}";
    }
}
