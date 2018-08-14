package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 用户属性参数
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class UserPropParam  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long propParamId;
    /**
     * 标签编号
     */
    private Long propLableId;
    /**
     * 参数名称
     */
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


    
    public String toString() {
        return "UserPropParam{" +
        "propParamId=" + propParamId +
        ", propLableId=" + propLableId +
        ", propParamName=" + propParamName +
        "}";
    }
}
