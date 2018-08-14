package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 商品快照表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("product_snapshot")
public class ProductSnapshot implements Serializable{

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
     * 商品名称
     */
    private String name;
    /**
     * 副标题
     */
    private String subtitle;
    /**
     * 商品分类
     */
    //("category_id")
    private Long categoryId;
    /**
     * 商品品牌
     */
    //("brand_id")
    private Long brandId;
    /**
     * 计量单位
     */
    //("units_id")
    private Long unitsId;
    /**
     * 商品组标识
     */
    //("group_id")
    private Long groupId;
    /**
     * 图片
     */
    //("image_url")
    private String imageUrl;
    /**
     * 销售价
     */
    //("sale_price")
    private Double salePrice;
    /**
     * 促销价
     */
    //("promotion_price")
    private Double promotionPrice;
    /**
     * 成本价
     */
    //("cost_price")
    private Double costPrice;
    /**
     * 邮费
     */
    private Double postage;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * 商品属性
     */
    private String properties;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 规格参数
     */
    private String arguments;
    /**
     * 所属用户
     */
    //("seller_user_id")
    private Long sellerUserId;
    /**
     * 商品所在地
     */
    //("product_address")
    private String productAddress;
    /**
     * 创建时间
     */
    //("create_time")
    private Integer createTime;
    /**
     * 市场指导价
     */
    //("market_price")
    private Double marketPrice;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(Long unitsId) {
        this.unitsId = unitsId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(Double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "ProductSnapshot{" +
        "Id=" + Id +
        ", productId=" + productId +
        ", name=" + name +
        ", subtitle=" + subtitle +
        ", categoryId=" + categoryId +
        ", brandId=" + brandId +
        ", unitsId=" + unitsId +
        ", groupId=" + groupId +
        ", imageUrl=" + imageUrl +
        ", salePrice=" + salePrice +
        ", promotionPrice=" + promotionPrice +
        ", costPrice=" + costPrice +
        ", postage=" + postage +
        ", stock=" + stock +
        ", properties=" + properties +
        ", description=" + description +
        ", arguments=" + arguments +
        ", sellerUserId=" + sellerUserId +
        ", productAddress=" + productAddress +
        ", createTime=" + createTime +
        ", marketPrice=" + marketPrice +
        "}";
    }
}
