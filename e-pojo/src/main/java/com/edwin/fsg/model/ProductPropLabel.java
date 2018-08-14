package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 商品属性标签
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("product_prop_label")
public class ProductPropLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    //(value = "prop_lable_id", type = IdType.AUTO)
    private Long propLableId;
    /**
     * 标签名称
     */
    //("prop_lable_name")
    private String propLableName;


    public Long getPropLableId() {
        return propLableId;
    }

    public void setPropLableId(Long propLableId) {
        this.propLableId = propLableId;
    }

    public String getPropLableName() {
        return propLableName;
    }

    public void setPropLableName(String propLableName) {
        this.propLableName = propLableName;
    }

    
    protected Serializable pkVal() {
        return this.propLableId;
    }

    
    public String toString() {
        return "ProductPropLabel{" +
        "propLableId=" + propLableId +
        ", propLableName=" + propLableName +
        "}";
    }
}
