package com.edwin.fsg.model;





import java.io.Serializable;

/**
 * <p>
 * 讲师表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
//("sy_teacher")
public class SyTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 人物描述
     */
    private String description;


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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    protected Serializable pkVal() {
        return this.id;
    }

    
    public String toString() {
        return "SyTeacher{" +
        "id=" + id +
        ", name=" + name +
        ", icon=" + icon +
        ", description=" + description +
        "}";
    }
}
