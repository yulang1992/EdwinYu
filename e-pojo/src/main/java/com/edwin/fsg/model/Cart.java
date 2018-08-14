package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 购物车基本信息表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 用户ID
     */
    private Long buyerUserId;
    /**
     * 总数量
     */
    private Integer totalCount;
    /**
     * 总价格
     */
    //("total_price")
    private Double totalPrice;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    
    public String toString() {
        return "Cart{" +
        "Id=" + Id +
        ", buyerUserId=" + buyerUserId +
        ", totalCount=" + totalCount +
        ", totalPrice=" + totalPrice +
        "}";
    }
}
