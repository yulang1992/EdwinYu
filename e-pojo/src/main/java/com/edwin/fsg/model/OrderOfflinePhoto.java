package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 订单线下转账打款截图表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("order_offline_photo")
public class OrderOfflinePhoto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 订单ID
     */
    //("order_id")
    private Long orderId;
    /**
     * 图片地址
     */
    private String url;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 订单状态
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "OrderOfflinePhoto{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", url=" + url +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
