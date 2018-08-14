package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息咨询表（主表）
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_consult")
public class MPjConsult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 标题
     */
    private String name;
    /**
     * 出处
     */
    private String provenance;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 更新时间
     */
    //("update_time")
    private Integer updateTime;
    /**
     * 图片路径
     */
    //("image_url")
    private String imageUrl;
    /**
     * 简介
     */
    private String synopsis;
    /**
     * 咨询内容
     */
    private String content;
    /**
     *  咨询类型    1:最新测评  2：本周推荐  3：新品上市  4：配件导购 5：配件测评 6：配件解答
     */
    private Integer status;
    /**
     * 分类ID
     */
    //("category_id")
    private Long categoryId;
    /**
     * 评论表ID
     */
    private Long appraise;
    /**
     * 喜欢数
     */
    //("like_count")
    private Integer likeCount;
    /**
     * 不喜欢数
     */
    //("no_like_count")
    private Integer noLikeCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getAppraise() {
        return appraise;
    }

    public void setAppraise(Long appraise) {
        this.appraise = appraise;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getNoLikeCount() {
        return noLikeCount;
    }

    public void setNoLikeCount(Integer noLikeCount) {
        this.noLikeCount = noLikeCount;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MPjConsult{" +
        "id=" + id +
        ", name=" + name +
        ", provenance=" + provenance +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", imageUrl=" + imageUrl +
        ", synopsis=" + synopsis +
        ", content=" + content +
        ", status=" + status +
        ", categoryId=" + categoryId +
        ", appraise=" + appraise +
        ", likeCount=" + likeCount +
        ", noLikeCount=" + noLikeCount +
        "}";
    }
}
