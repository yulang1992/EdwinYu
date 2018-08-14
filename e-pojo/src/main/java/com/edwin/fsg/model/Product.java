package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
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
     * 商品属性 商品属性键值对
     */
    private String properties;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 规格参数 规格参数键值对
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
     * 商品状态 1：待上架 2：待审核 3：审核通过 4：审核不通过 5：已下架 6：已删除
     */
    private Integer status;
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
     * 市场指导价
     */
    //("market_price")
    private Double marketPrice;
    /**
     * 是否开启免运费规则   0：不开启 1：开启
     */
    //("free_rule")
    private Integer freeRule;
    /**
     * 商品多少数量起送   0为始终需要运费
     */
    //("free_size")
    private Integer freeSize;
    /**
     * 起批量
     */
    //("predict_sell_size")
    private Integer predictSellSize;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getFreeRule() {
        return freeRule;
    }

    public void setFreeRule(Integer freeRule) {
        this.freeRule = freeRule;
    }

    public Integer getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
    }

    public Integer getPredictSellSize() {
        return predictSellSize;
    }

    public void setPredictSellSize(Integer predictSellSize) {
        this.predictSellSize = predictSellSize;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Product{" +
        "Id=" + Id +
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
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", marketPrice=" + marketPrice +
        ", freeRule=" + freeRule +
        ", freeSize=" + freeSize +
        ", predictSellSize=" + predictSellSize +
        "}";
    }
}
