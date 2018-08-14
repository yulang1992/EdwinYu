package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 订单操作日志 用于标示订单的所有详细操作记录
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("order_log")
public class OrderLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 操作人ID
     */
    //("operater_user_id")
    private Long operaterUserId;
    /**
     * 操作类型
     */
    //("operate_type")
    private String operateType;
    /**
     * 订单ID
     */
    //("order_id")
    private Long orderId;
    /**
     * 子订单ID
     */
    //("suborder_id")
    private Long suborderId;
    /**
     * 买家
     */
    //("buyer_user_id")
    private Long buyerUserId;
    /**
     * 卖家
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 订单状态
     */
    //("order_status")
    private Integer orderStatus;
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

    public Long getOperaterUserId() {
        return operaterUserId;
    }

    public void setOperaterUserId(Long operaterUserId) {
        this.operaterUserId = operaterUserId;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSuborderId() {
        return suborderId;
    }

    public void setSuborderId(Long suborderId) {
        this.suborderId = suborderId;
    }

    public Long getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(Long buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
        return "OrderLog{" +
        "Id=" + Id +
        ", operaterUserId=" + operaterUserId +
        ", operateType=" + operateType +
        ", orderId=" + orderId +
        ", suborderId=" + suborderId +
        ", buyerUserId=" + buyerUserId +
        ", sellerUserId=" + sellerUserId +
        ", orderStatus=" + orderStatus +
        ", createTime=" + createTime +
        "}";
    }
}
