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
//("sy_role")
public class SyRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ±àºÅ

     */
    
    private Long id;
    /**
     * ½ÇÉ«Ãû³Æ

     */
    //("role_name")
    private String roleName;
    /**
     * ½ÇÉ«ÃèÊö
     */
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        return "SyRole{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", description=" + description +
        "}";
    }
}
