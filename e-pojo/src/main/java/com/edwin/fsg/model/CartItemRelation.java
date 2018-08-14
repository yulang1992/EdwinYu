package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("cart_item_relation")
public class CartItemRelation implements Serializable{

    private static final long serialVersionUID = 1L;

    
    private Long id;
    /**
     * 进货单id
     */
    //("cart_id")
    private Long cartId;
    /**
     * 进货单列表id
     */
    //("cart_item_id")
    private Long cartItemId;
    /**
     * 商品id
     */
    //("product_id")
    private Long productId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "CartItemRelation{" +
        "id=" + id +
        ", cartId=" + cartId +
        ", cartItemId=" + cartItemId +
        ", productId=" + productId +
        "}";
    }
}
