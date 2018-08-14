package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 众筹数据明细表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("crowd_product")
public class CrowdProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 众筹规则表id
     */
    //("crowd_rule_id")
    private Long crowdRuleId;
    /**
     * 商品ID
     */
    //("product_id")
    private Long productId;
    /**
     * 众筹价格
     */
    //("crowd_price")
    private Double crowdPrice;
    /**
     * 参加众筹最低数量
     */
    //("product_count")
    private Integer productCount;
    /**
     * 所属用户
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 众筹状态  1：未审核  2：审核未通过  3：审核通过 
     */
    private Integer status;
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

    public Long getCrowdRuleId() {
        return crowdRuleId;
    }

    public void setCrowdRuleId(Long crowdRuleId) {
        this.crowdRuleId = crowdRuleId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getCrowdPrice() {
        return crowdPrice;
    }

    public void setCrowdPrice(Double crowdPrice) {
        this.crowdPrice = crowdPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "CrowdProduct{" +
        "id=" + id +
        ", crowdRuleId=" + crowdRuleId +
        ", productId=" + productId +
        ", crowdPrice=" + crowdPrice +
        ", productCount=" + productCount +
        ", sellerUserId=" + sellerUserId +
        ", status=" + status +
        ", updateTime=" + updateTime +
        "}";
    }
}
