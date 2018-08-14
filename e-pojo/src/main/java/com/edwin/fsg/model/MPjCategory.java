package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 配件信息分类表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_pj_category")
public class MPjCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 分类名称
     */
    private String name;
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
     * 是否启用 1：启用 2：禁用
     */
    //("is_enable")
    private Integer isEnable;


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
        return this.id;
    }

    
    public String toString() {
        return "MPjCategory{" +
        "id=" + id +
        ", name=" + name +
        ", parentCategoryId=" + parentCategoryId +
        ", layer=" + layer +
        ", isEnable=" + isEnable +
        "}";
    }
}
