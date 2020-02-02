package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.List;

/**
 * @author 
 */
public class Role implements Serializable {
    /**
     * 角色编号
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    //可管权限列表
    private List<Power> powers;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Power> getPowers() {
		return powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", powers=").append(powers==null?0:powers.size());
        sb.append("]");
        return sb.toString();
    }
}