package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 联邦集团官网文本表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_gw_consult")
public class MGwConsult implements Serializable {

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
     * 副标题
     */
    private String subhead;
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
     * 文本内容
     */
    private String content;
    /**
     * 文本类型    1:联邦半月刊  2：最新热刊  3：联邦会员  4：联邦招聘 5 : 公司简介 6:联邦集团背景 7:联邦集团服务支撑  8: 联邦集团核心团队 9：七星手机连锁 10：七星的由来 11：七星梦 12：企业文化 13：连锁店训  14：疑难解答  
     */
    private Integer status;
    /**
     * 发布人
     */
    private String publisher;


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

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MGwConsult{" +
        "id=" + id +
        ", name=" + name +
        ", provenance=" + provenance +
        ", subhead=" + subhead +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", imageUrl=" + imageUrl +
        ", synopsis=" + synopsis +
        ", content=" + content +
        ", status=" + status +
        ", publisher=" + publisher +
        "}";
    }
}
