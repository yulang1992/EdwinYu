package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 支付记录表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("pay_log")
public class PayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 支付方
     */
    //("sender_user_id")
    private Long senderUserId;
    /**
     * 第三方支付流水ID
     */
    //("three_party_pay_id")
    private String threePartyPayId;
    /**
     * 收取方
     */
    //("receiver_user_id")
    private Long receiverUserId;
    /**
     * 订单ID
     */
    //("order_id")
    private Long orderId;
    /**
     * 支付方式
     */
    private Integer payment;
    /**
     * 价格
     */
    private Double price;
    /**
     * 支付状态  1：未支付 2：已支付
     */
    private Integer status;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public String getThreePartyPayId() {
        return threePartyPayId;
    }

    public void setThreePartyPayId(String threePartyPayId) {
        this.threePartyPayId = threePartyPayId;
    }

    public Long getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(Long receiverUserId) {
        this.receiverUserId = receiverUserId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        return this.Id;
    }

    
    public String toString() {
        return "PayLog{" +
        "Id=" + Id +
        ", senderUserId=" + senderUserId +
        ", threePartyPayId=" + threePartyPayId +
        ", receiverUserId=" + receiverUserId +
        ", orderId=" + orderId +
        ", payment=" + payment +
        ", price=" + price +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
