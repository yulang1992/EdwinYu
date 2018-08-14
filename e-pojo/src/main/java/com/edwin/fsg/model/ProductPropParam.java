package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 商品属性参数
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("product_prop_param")
public class ProductPropParam implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    //(value = "prop_param_id", type = IdType.AUTO)
    private Long propParamId;
    /**
     * 标签编号
     */
    //("prop_lable_id")
    private Long propLableId;
    /**
     * 参数名称
     */
    //("prop_param_name")
    private String propParamName;


    public Long getPropParamId() {
        return propParamId;
    }

    public void setPropParamId(Long propParamId) {
        this.propParamId = propParamId;
    }

    public Long getPropLableId() {
        return propLableId;
    }

    public void setPropLableId(Long propLableId) {
        this.propLableId = propLableId;
    }

    public String getPropParamName() {
        return propParamName;
    }

    public void setPropParamName(String propParamName) {
        this.propParamName = propParamName;
    }

    
    protected Serializable pkVal() {
        return this.propParamId;
    }

    
    public String toString() {
        return "ProductPropParam{" +
        "propParamId=" + propParamId +
        ", propLableId=" + propLableId +
        ", propParamName=" + propParamName +
        "}";
    }
}
