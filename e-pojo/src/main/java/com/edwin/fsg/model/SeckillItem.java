package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 秒杀商品信息
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("seckill_item")
public class SeckillItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    
    private Long id;
    /**
     * 秒杀表主键
     */
    //("seckill_id")
    private Long seckillId;
    /**
     * 卖家id
     */
    //("seller_id")
    private Long sellerId;
    /**
     * 商品id
     */
    //("product_id")
    private Long productId;
    /**
     * 参加秒杀的商品数
     */
    //("product_count")
    private Integer productCount;
    /**
     * 秒杀价
     */
    //("seckill_price")
    private Double seckillPrice;
    /**
     * 一次购买商品最大个数(目前为1)
     */
    //("once_max_count")
    private Integer onceMaxCount;
    /**
     * 秒杀状态 1：未审核 2：审核未通过 3：审核通过
     */
    private Integer status;
    /**
     * 审核未通过原因
     */
    private String reason;
    /**
     * 审核时间
     */
    //("update_time")
    private Integer updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Double seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getOnceMaxCount() {
        return onceMaxCount;
    }

    public void setOnceMaxCount(Integer onceMaxCount) {
        this.onceMaxCount = onceMaxCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SeckillItem{" +
        "id=" + id +
        ", seckillId=" + seckillId +
        ", sellerId=" + sellerId +
        ", productId=" + productId +
        ", productCount=" + productCount +
        ", seckillPrice=" + seckillPrice +
        ", onceMaxCount=" + onceMaxCount +
        ", status=" + status +
        ", reason=" + reason +
        ", updateTime=" + updateTime +
        "}";
    }
}
