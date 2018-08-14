package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 分类品牌关系表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("category_brand")
public class CategoryBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类-品牌关系表
     */
    
    private Long id;
    /**
     * 品牌ID
     */
    private Long brandId;
    /**
     * 分类ID
     */
    private Long categoryId;
    /**
     * 分类层级
     */
    private Integer categoryLayer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryLayer() {
        return categoryLayer;
    }

    public void setCategoryLayer(Integer categoryLayer) {
        this.categoryLayer = categoryLayer;
    }

    

    
    public String toString() {
        return "CategoryBrand{" +
        "id=" + id +
        ", brandId=" + brandId +
        ", categoryId=" + categoryId +
        ", categoryLayer=" + categoryLayer +
        "}";
    }
}
