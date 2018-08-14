package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 城市级联表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long Id;
    /**
     * 名称
     */
    private String name;
    /**
     * 父ID
     */
    private Long parentId;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }


    
    public String toString() {
        return "Address{" +
        "Id=" + Id +
        ", name=" + name +
        ", parentId=" + parentId +
        "}";
    }
}
