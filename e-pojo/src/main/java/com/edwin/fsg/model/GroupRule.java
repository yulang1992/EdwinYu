package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 数量，折扣率关系表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("group_rule")
public class GroupRule implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 参加团购最低数量
     */
    //("product_count")
    private Integer productCount;
    /**
     * 折扣率
     */
    private Double discount;
    /**
     * 团购主表id
     */
    //("group_buying_id")
    private Long groupBuyingId;
    /**
     * 单次团量
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

    public Long getGroupBuyingId() {
        return groupBuyingId;
    }

    public void setGroupBuyingId(Long groupBuyingId) {
        this.groupBuyingId = groupBuyingId;
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
        return "GroupRule{" +
        "id=" + id +
        ", productCount=" + productCount +
        ", discount=" + discount +
        ", groupBuyingId=" + groupBuyingId +
        ", onceMaxCount=" + onceMaxCount +
        "}";
    }
}
