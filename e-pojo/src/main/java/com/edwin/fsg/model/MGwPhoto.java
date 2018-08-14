package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 联邦官网合作伙伴图标表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("m_gw_photo")
public class MGwPhoto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 合作伙伴编号
     */
    private String code;
    /**
     * 合作伙伴名称
     */
    private String name;
    /**
     * 合作伙伴图标
     */
    private String icon;
    /**
     * 状态 1：开通 2：未开通
     */
    private Integer status;
    /**
     * 类型  1:联邦集团战略合作伙伴   2:  联邦集团合作厂家
     */
    private Long type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "MGwPhoto{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", icon=" + icon +
        ", status=" + status +
        ", type=" + type +
        "}";
    }
}
