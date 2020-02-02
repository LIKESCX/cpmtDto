package com.cpit.cpmt.dto.system;

import java.io.Serializable;

/**
 * @author
 */
public class RolePower implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色编号
	 */
	private String roleId;

	/**
	 * 权限id
	 */
	private Integer powerId;

	// 是否有添加 0:无,1:有
	private Integer hasAdd;

	// 是否有添加 0:无,1:有
	private Integer hasDel;

	// 是否有添加 0:无,1:有
	private Integer hasUpdate;

	// 是否有添加 0:无,1:有
	private Integer hasQuery;

	// 是否有添加 0:无,1:有
	private Integer hasCheck;

	// 是否有添加 0:无,1:有
	private Integer hasOther;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
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
		RolePower other = (RolePower) that;
		return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
				&& (this.getPowerId() == null ? other.getPowerId() == null
						: this.getPowerId().equals(other.getPowerId()));
	}

	@Override
	public int hashCode() {
		final Integer prime = 31;
		Integer result = 1;
		result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
		result = prime * result + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "RolePowerKey [roleId=" + roleId + ", powerId=" + powerId + ", hasAdd=" + hasAdd + ", hasDel=" + hasDel
				+ ", hasUpdate=" + hasUpdate + ", hasQuery=" + hasQuery + ", hasCheck=" + hasCheck + ", hasOther="
				+ hasOther + "]";
	}

}