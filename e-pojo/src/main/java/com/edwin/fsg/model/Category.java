package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 商品分类表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类属性
     */
    private String property;
    /**
     * 规格参数
     */
    private String parameter;
    /**
     * 父分类ID
     */
    //("parent_category_id")
    private Long parentCategoryId;
    /**
     * 层级
     */
    private Integer layer;
    /**
     * 商城是否启用 1：启用 2：禁用
     */
    //("is_enable")
    private Integer isEnable;


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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Category{" +
        "Id=" + Id +
        ", name=" + name +
        ", property=" + property +
        ", parameter=" + parameter +
        ", parentCategoryId=" + parentCategoryId +
        ", layer=" + layer +
        ", isEnable=" + isEnable +
        "}";
    }
}
