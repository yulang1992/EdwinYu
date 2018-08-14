package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * banner广告表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_banner")
public class MPjBanner implements Serializable {

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

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MPjBanner{" +
        "id=" + id +
        ", bannerOrder=" + bannerOrder +
        ", bannerContent=" + bannerContent +
        ", name=" + name +
        ", url=" + url +
        "}";
    }
}
