package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 子订单
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Suborder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 商品快照ID
     */
    //("product_snapshot_id")
    private Long productSnapshotId;
    /**
     * 商品总价格 商品单价x总数量
     */
    //("total_price")
    private Double totalPrice;
    /**
     * 卖方
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 买方
     */
    //("buyer_user_id")
    private Long buyerUserId;
    /**
     * 商品总数量
     */
    //("total_count")
    private Integer totalCount;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 订单类型:1,一般订单;2,团购订单;3,秒杀订单;4,众筹订单
     */
    private Integer type;
    /**
     * 团购id|秒杀id|众筹id
     */
    //("activity_id")
    private Long activityId;
    /**
     * 是否已经结算(1:已结算,0:未结算)
     */
    //("is_closed")
    private Integer isClosed;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getProductSnapshotId() {
        return productSnapshotId;
    }

    public void setProductSnapshotId(Long productSnapshotId) {
        this.productSnapshotId = productSnapshotId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Long getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(Long buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Integer getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Integer isClosed) {
        this.isClosed = isClosed;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Suborder{" +
        "Id=" + Id +
        ", productSnapshotId=" + productSnapshotId +
        ", totalPrice=" + totalPrice +
        ", sellerUserId=" + sellerUserId +
        ", buyerUserId=" + buyerUserId +
        ", totalCount=" + totalCount +
        ", status=" + status +
        ", createTime=" + createTime +
        ", type=" + type +
        ", activityId=" + activityId +
        ", isClosed=" + isClosed +
        "}";
    }
}
