package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 团购数据明细表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("group_product")
public class GroupProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 团购规则表id
     */
    //("group_rule_id")
    private Long groupRuleId;
    /**
     * 商品ID
     */
    //("product_id")
    private Long productId;
    /**
     * 团购价格
     */
    //("group_price")
    private Double groupPrice;
    /**
     * 参加团购最低数量
     */
    //("product_count")
    private Integer productCount;
    /**
     * 所属用户
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 团购状态  1：未审核  2：审核未通过  3：审核通过 
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

    public Long getGroupRuleId() {
        return groupRuleId;
    }

    public void setGroupRuleId(Long groupRuleId) {
        this.groupRuleId = groupRuleId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Double groupPrice) {
        this.groupPrice = groupPrice;
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
        return "GroupProduct{" +
        "id=" + id +
        ", groupRuleId=" + groupRuleId +
        ", productId=" + productId +
        ", groupPrice=" + groupPrice +
        ", productCount=" + productCount +
        ", sellerUserId=" + sellerUserId +
        ", status=" + status +
        ", updateTime=" + updateTime +
        "}";
    }
}
