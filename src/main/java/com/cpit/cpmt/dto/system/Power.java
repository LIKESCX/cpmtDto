package com.cpit.cpmt.dto.system;

import java.io.Serializable;

/**
 * @author 
 */
public class Power implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final Integer IS_LEAF_YES = 1;
	public static final Integer IS_LEAF_NO = 0;

	
	/**
     * id
     */
    private Integer id;

    /**
     * 权限
     */
    private String power;

    /**
     * 名称
     */
    private String name;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * 是否叶节点,0:否，1:是
     */
    private Integer isLeaf;
    
    
	// 是否有添加 0:无,1:有
	private Integer hasAdd;

	// 是否有删除 0:无,1:有
	private Integer hasDel;

	// 是否有修改 0:无,1:有
	private Integer hasUpdate;

	// 是否有查询 0:无,1:有
	private Integer hasQuery;

	// 是否有审核 0:无,1:有
	private Integer hasCheck;

	// 是否有其他（做扩展用） 0:无,1:有
	private Integer hasOther;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }



	public Integer getHasAdd() {
		return hasAdd;
	}

	public void setHasAdd(Integer hasAdd) {
		this.hasAdd = hasAdd;
	}

	public Integer getHasDel() {
		return hasDel;
	}

	public void setHasDel(Integer hasDel) {
		this.hasDel = hasDel;
	}

	public Integer getHasUpdate() {
		return hasUpdate;
	}

	public void setHasUpdate(Integer hasUpdate) {
		this.hasUpdate = hasUpdate;
	}

	public Integer getHasQuery() {
		return hasQuery;
	}

	public void setHasQuery(Integer hasQuery) {
		this.hasQuery = hasQuery;
	}

	public Integer getHasCheck() {
		return hasCheck;
	}

	public void setHasCheck(Integer hasCheck) {
		this.hasCheck = hasCheck;
	}

	public Integer getHasOther() {
		return hasOther;
	}

	public void setHasOther(Integer hasOther) {
		this.hasOther = hasOther;
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
        Power other = (Power) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        		;
    }

    @Override
    public int hashCode() {
        final Integer prime = 31;
        Integer result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", power=").append(power);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", hasAdd=").append(hasAdd);
        sb.append(", hasDel=").append(hasDel);
        sb.append(", hasUpdate=").append(hasUpdate);
        sb.append(", hasQuery=").append(hasQuery);
        sb.append(", hasCheck=").append(hasCheck);
        sb.append(", hasOther=").append(hasOther);
        sb.append("]");
        return sb.toString();
    }
}