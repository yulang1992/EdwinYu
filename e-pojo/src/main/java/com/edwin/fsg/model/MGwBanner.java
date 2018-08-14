package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 联邦官网广告表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_gw_banner")
public class MGwBanner implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * banne排序位置
     */
    //("banner_order")
    private String bannerOrder;
    /**
     * banner内容
     */
    //("banner_content")
    private String bannerContent;
    /**
     * 广告名称
     */
    private String name;
    /**
     * 对应的地址
     */
    private String url;
    /**
     * 广告类型  1:首页  2：集团简介  3：集团简介子图  4：七星手机连锁 5 : 半月刊 6:加入我们
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerOrder() {
        return bannerOrder;
    }

    public void setBannerOrder(String bannerOrder) {
        this.bannerOrder = bannerOrder;
    }

    public String getBannerContent() {
        return bannerContent;
    }

    public void setBannerContent(String bannerContent) {
        this.bannerContent = bannerContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "MGwBanner{" +
        "id=" + id +
        ", bannerOrder=" + bannerOrder +
        ", bannerContent=" + bannerContent +
        ", name=" + name +
        ", url=" + url +
        ", status=" + status +
        "}";
    }
}
