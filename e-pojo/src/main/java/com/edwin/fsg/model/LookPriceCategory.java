package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 不需要价格可见的分类    没有后台需要手动维护
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("look_price_category")
public class LookPriceCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 分类ID
     */
    //("category_id")
    private Long categoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "LookPriceCategory{" +
        "id=" + id +
        ", categoryId=" + categoryId +
        "}";
    }
}
