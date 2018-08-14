package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 众筹数量，折扣率关系表（众筹规则表）
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("crowd_rule")
public class CrowdRule implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 参加众筹最低数量
     */
    //("product_count")
    private Integer productCount;
    /**
     * 折扣率
     */
    private Double discount;
    /**
     * 众筹主表id
     */
    //("crowd_funding_id")
    private Long crowdFundingId;
    /**
     * 单次众筹数量
     */
    //("once_max_count")
    private Integer onceMaxCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getCrowdFundingId() {
        return crowdFundingId;
    }

    public void setCrowdFundingId(Long crowdFundingId) {
        this.crowdFundingId = crowdFundingId;
    }

    public Integer getOnceMaxCount() {
        return onceMaxCount;
    }

    public void setOnceMaxCount(Integer onceMaxCount) {
        this.onceMaxCount = onceMaxCount;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "CrowdRule{" +
        "id=" + id +
        ", productCount=" + productCount +
        ", discount=" + discount +
        ", crowdFundingId=" + crowdFundingId +
        ", onceMaxCount=" + onceMaxCount +
        "}";
    }
}
