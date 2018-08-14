package com.edwin.fsg.model;

import java.io.Serializable;

/**
 * <p>
 * 版本更新
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Version implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 版本号
     */
    private Integer number;
    /**
     * 创建时间
     */
    private Integer createTime;
    /**
     * 版本号名称
     */
    private String name;
    /**
     * 更新后的地址
     */
    private String url;
    /**
     * 更新的内容
     */
    private String content;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    
    public String toString() {
        return "Version{" +
        "id=" + id +
        ", number=" + number +
        ", createTime=" + createTime +
        ", name=" + name +
        ", url=" + url +
        ", content=" + content +
        "}";
    }
}
