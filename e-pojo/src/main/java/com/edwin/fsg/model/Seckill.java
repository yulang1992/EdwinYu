package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 秒杀主表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Seckill implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    
    private Long id;
    /**
     * 开始时间
     */
    //("start_time")
    private Integer startTime;
    /**
     * 结束时间
     */
    //("end_time")
    private Integer endTime;
    /**
     * 秒杀订单未付款失效时间 单位(秒)
     */
    //("order_expiry_time")
    private Integer orderExpiryTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getOrderExpiryTime() {
        return orderExpiryTime;
    }

    public void setOrderExpiryTime(Integer orderExpiryTime) {
        this.orderExpiryTime = orderExpiryTime;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "Seckill{" +
        "id=" + id +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", orderExpiryTime=" + orderExpiryTime +
        "}";
    }
}
