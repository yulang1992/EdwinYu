package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 商品评价
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("comment_product")
public class CommentProduct  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 商品ID
     */
    //("product_id")
    private Long productId;
    /**
     * 评价内容
     */
    private String content;
    /**
     * 商品评分
     */
    //("product_score")
    private Integer productScore;
    /**
     * 服务评分
     */
    //("service_score")
    private Integer serviceScore;
    /**
     * 物流评分
     */
    //("logistics_score")
    private Integer logisticsScore;
    /**
     * 订单ID
     */
    //("order_id")
    private Long orderId;
    /**
     * 评价用户
     */
    //("comment_user_id")
    private Long commentUserId;
    //("create_time")
    private Integer createTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getProductScore() {
        return productScore;
    }

    public void setProductScore(Integer productScore) {
        this.productScore = productScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getLogisticsScore() {
        return logisticsScore;
    }

    public void setLogisticsScore(Integer logisticsScore) {
        this.logisticsScore = logisticsScore;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Long commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    
    public String toString() {
        return "CommentProduct{" +
        "Id=" + Id +
        ", productId=" + productId +
        ", content=" + content +
        ", productScore=" + productScore +
        ", serviceScore=" + serviceScore +
        ", logisticsScore=" + logisticsScore +
        ", orderId=" + orderId +
        ", commentUserId=" + commentUserId +
        ", createTime=" + createTime +
        "}";
    }
}
