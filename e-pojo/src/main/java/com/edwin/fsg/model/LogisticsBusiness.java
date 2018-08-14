package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 物流商表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("logistics_business")
public class LogisticsBusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 物流公司编号
     */
    private String code;
    /**
     * 物流公司名称
     */
    private String name;
    /**
     * 物流公司图标
     */
    private String icon;
    /**
     * 状态 1：开通 2：未开通
     */
    private Integer status;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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
        return this.Id;
    }

    
    public String toString() {
        return "LogisticsBusiness{" +
        "Id=" + Id +
        ", code=" + code +
        ", name=" + name +
        ", icon=" + icon +
        ", status=" + status +
        "}";
    }
}
