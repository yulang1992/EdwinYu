package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 购物车详情表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("cart_item")
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 购物车ID
     */
    //("cart_id")
    private Long cartId;
    /**
     * 商品ID
     */
    //("product_id")
    private Long productId;
    /**
     * 卖方
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 数量
     */
    private Integer count;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    
    public String toString() {
        return "CartItem{" +
        "Id=" + Id +
        ", cartId=" + cartId +
        ", productId=" + productId +
        ", sellerUserId=" + sellerUserId +
        ", count=" + count +
        "}";
    }
}
