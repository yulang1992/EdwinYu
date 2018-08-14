package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单类型:1,一般订单;2,团购订单;3,秒杀订单
     */
      
    private Long Id;
    /**
     * 子订单IDS
     */
    //("suborder_ids")
    private String suborderIds;
    /**
     * 商品IDS
     */
    //("product_ids")
    private String productIds;
    /**
     * 商品名称
     */
    private String names;
    /**
     * 商品价格
     */
    //("product_prices")
    private String productPrices;
    /**
     * 商品总价格
     */
    //("total_price")
    private Double totalPrice;
    /**
     * 商品总数量
     */
    //("total_count")
    private Integer totalCount;
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
     * 物流运费
     */
    //("logistics_price")
    private Double logisticsPrice;
    /**
     * 送货地址
     */
    private String address;
    /**
     * 配送商
     */
    private String distributor;
    /**
     * 配送单号
     */
    //("express_number")
    private String expressNumber;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 支付ID
     */
    //("pay_id")
    private Long payId;
    /**
     * 备注
     */
    private String remark;
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
     * 订单来源
     */
    private Integer source;
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 收件人电话
     */
    //("receiver_tel")
    private String receiverTel;
    /**
     * 拒绝备注
     */
    //("refund_remark")
    private String refundRemark;
    /**
     * 1,一般订单;2,团购订单;3,秒杀订单;4,众筹订单
     */
    private Integer type;
    /**
     * 未付款失效时间(单位为秒)
     */
    //("unpay_expiry_time")
    private Integer unpayExpiryTime;
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
    /**
     * 第三方支付交易流水号
     */
    //("trade_no")
    private String tradeNo;
    /**
     * 订单确认发货 (0:平台未确认，1：平台已确认)
     */
    //("is_shipments")
    private Long isShipments;
    /**
     * 支付方式：1支付宝、2公司转账、3微信支付、4网银在线支付、5易宝支付
     */
    private Integer payment;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getSuborderIds() {
        return suborderIds;
    }

    public void setSuborderIds(String suborderIds) {
        this.suborderIds = suborderIds;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(String productPrices) {
        this.productPrices = productPrices;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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

    public Double getLogisticsPrice() {
        return logisticsPrice;
    }

    public void setLogisticsPrice(Double logisticsPrice) {
        this.logisticsPrice = logisticsPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUnpayExpiryTime() {
        return unpayExpiryTime;
    }

    public void setUnpayExpiryTime(Integer unpayExpiryTime) {
        this.unpayExpiryTime = unpayExpiryTime;
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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Long getIsShipments() {
        return isShipments;
    }

    public void setIsShipments(Long isShipments) {
        this.isShipments = isShipments;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Order{" +
        "Id=" + Id +
        ", suborderIds=" + suborderIds +
        ", productIds=" + productIds +
        ", names=" + names +
        ", productPrices=" + productPrices +
        ", totalPrice=" + totalPrice +
        ", totalCount=" + totalCount +
        ", sellerUserId=" + sellerUserId +
        ", buyerUserId=" + buyerUserId +
        ", logisticsPrice=" + logisticsPrice +
        ", address=" + address +
        ", distributor=" + distributor +
        ", expressNumber=" + expressNumber +
        ", status=" + status +
        ", payId=" + payId +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", source=" + source +
        ", receiver=" + receiver +
        ", receiverTel=" + receiverTel +
        ", refundRemark=" + refundRemark +
        ", type=" + type +
        ", unpayExpiryTime=" + unpayExpiryTime +
        ", activityId=" + activityId +
        ", isClosed=" + isClosed +
        ", tradeNo=" + tradeNo +
        ", isShipments=" + isShipments +
        ", payment=" + payment +
        "}";
    }
}
