package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_msg_verification_log")
public class SyMsgVerificationLog <SyMsgVerificationLog> {

    private static final long serialVersionUID = 1L;

    
    private Long id;
    private String cellphone;
    /**
     * 短信验证码
     */
    private String code;
    //("create_time")
    private Integer createTime;
    /**
     * 0:有效1：无效
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
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
        return "SyMsgVerificationLog{" +
        "id=" + id +
        ", cellphone=" + cellphone +
        ", code=" + code +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
