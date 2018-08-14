package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息收藏夹表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_favorite")
public class MPjFavorite implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 用户ID
     */
    //("user_id")
    private Long userId;
    /**
     * 配件信息主表ID
     */
    //("consult_id")
    private Long consultId;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 喜欢还是不喜欢    0:喜欢      1:不喜欢
     */
    //("like_or_no")
    private Integer likeOrNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getConsultId() {
        return consultId;
    }

    public void setConsultId(Long consultId) {
        this.consultId = consultId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getLikeOrNo() {
        return likeOrNo;
    }

    public void setLikeOrNo(Integer likeOrNo) {
        this.likeOrNo = likeOrNo;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MPjFavorite{" +
        "id=" + id +
        ", userId=" + userId +
        ", consultId=" + consultId +
        ", createTime=" + createTime +
        ", likeOrNo=" + likeOrNo +
        "}";
    }
}
