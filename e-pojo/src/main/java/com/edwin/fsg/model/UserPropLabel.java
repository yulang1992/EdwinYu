package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 客户属性标签
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class UserPropLabel  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long propLableId;
    /**
     * 标签名称
     */
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


    
    public String toString() {
        return "UserPropLabel{" +
        "propLableId=" + propLableId +
        ", propLableName=" + propLableName +
        "}";
    }
}
