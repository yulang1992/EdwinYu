package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * app°æ±¾ÈÕÖ¾(°üº¬ÉÌ³ÇºÍÊéÔº)
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class AppVersionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * °æ±¾id
     */
    
    private Long id;
    /**
     * ÀàÐÍ£¬1:·äËÙ¹ºÉÌ³Ç£¬2£º¹úÉÌÊéÔº
     */
    private Integer type;
    /**
     * °æ±¾ºÅ
     */
    private String version;
    /**
     * °æ±¾ÈÕÖ¾
     */
    private String versionLog;
    /**
     * °æ±¾×´Ì¬£¬1£º×îÐÂ°æ£¬2£ºÀúÊ·°æ±¾
     */
    private Integer status;
    /**
     * appÎÄ¼þÂ·¾¶
     */
    private String path;
    /**
     * ´´½¨Ê±¼ä
     */
    private Integer createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionLog() {
        return versionLog;
    }

    public void setVersionLog(String versionLog) {
        this.versionLog = versionLog;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

   

    
    public String toString() {
        return "AppVersionLog{" +
        "id=" + id +
        ", type=" + type +
        ", version=" + version +
        ", versionLog=" + versionLog +
        ", status=" + status +
        ", path=" + path +
        ", createTime=" + createTime +
        "}";
    }
}
