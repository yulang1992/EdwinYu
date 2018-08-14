package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 图片类型表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_photo_type")
public class SyPhotoType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 图片类型名称
     */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyPhotoType{" +
        "id=" + id +
        ", name=" + name +
        "}";
    }
}
