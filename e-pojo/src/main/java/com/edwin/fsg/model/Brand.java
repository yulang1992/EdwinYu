package com.edwin.fsg.model;




import java.io.Serializable;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public class Brand  implements Serializable {

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


    
    public String toString() {
        return "Brand{" +
        "Id=" + Id +
        ", name=" + name +
        "}";
    }
}
