package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 收藏夹表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Favorite implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 用户ID
     */
    //("user_id")
    private Long userId;
    /**
     * 商品ID
     */
    //("product_id")
    private Long productId;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Favorite{" +
        "Id=" + Id +
        ", userId=" + userId +
        ", productId=" + productId +
        ", createTime=" + createTime +
        "}";
    }
}
