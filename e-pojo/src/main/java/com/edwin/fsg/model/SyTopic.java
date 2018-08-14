package com.edwin.fsg.model;






import java.io.Serializable;

/**
 * <p>
 * ¿Î³ÌÃ÷Ï¸±í
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_topic")
public class SyTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    
    private Long id;
    /**
     * ¹ØÁª±àºÅ

     */
    private String title;
    /**
     * ¿Î³ÌÃèÊö
     */
    private String summary;
    /**
     * ÊÊºÏÈËÈº
     */
    //("suit_people")
    private String suitPeople;
    /**
     * ¿ªÊ¼Ê±¼ä
     */
    //("start_time")
    private Integer startTime;
    /**
     * ´´½¨Ê±¼ä
     */
    //("create_time")
    private Integer createTime;
    /**
     * ÐÞ¸ÄÊ±¼ä
     */
    //("update_time")
    private Integer updateTime;
    /**
     * ´´½¨/ÐÞ¸Ä²Ù×÷ÈË
     */
    //("update_admin")
    private Long updateAdmin;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSuitPeople() {
        return suitPeople;
    }

    public void setSuitPeople(String suitPeople) {
        this.suitPeople = suitPeople;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Long updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyTopic{" +
        "id=" + id +
        ", title=" + title +
        ", summary=" + summary +
        ", suitPeople=" + suitPeople +
        ", startTime=" + startTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", updateAdmin=" + updateAdmin +
        "}";
    }
}
