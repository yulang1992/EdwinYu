package com.edwin.fsg.model;




import java.io.Serializable;

/**
 * <p>
 * 公司性质表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Nature implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
      
    private Long Id;
    /**
     * 名称
     */
    private String name;


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

    
    protected Serializable pkVal() {
        return this.Id;
    }

    
    public String toString() {
        return "Nature{" +
        "Id=" + Id +
        ", name=" + name +
        "}";
    }
}
