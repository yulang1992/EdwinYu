package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 支付类型表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("payment_type")
public class PaymentType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 支付类型编号
     */
    private String code;
    /**
     * 支付类型名称
     */
    private String name;
    /**
     * 支付类型图标
     */
    private String icon;
    /**
     * 状态 1：开通 2：未开通
     */
    private Integer status;


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

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "PaymentType{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", icon=" + icon +
        ", status=" + status +
        "}";
    }
}
