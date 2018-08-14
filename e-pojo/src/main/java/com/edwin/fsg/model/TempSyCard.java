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
public class TempSyCard  implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * ¿¨ID
     */
    private String cardId;
    /**
     * Ñ§Ô±ID
     */
    private Long memberId;
    /**
     */
    private Integer status;
    private Integer createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

 

    
    public String toString() {
        return "TempSyCard{" +
        "id=" + id +
        ", cardId=" + cardId +
        ", memberId=" + memberId +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
