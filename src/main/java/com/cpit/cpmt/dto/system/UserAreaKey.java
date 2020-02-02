package com.cpit.cpmt.dto.system;

import java.io.Serializable;

/**
 * sys_user_area
 * @author 
 */
public class UserAreaKey implements Serializable {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 所属运营商id
     */
    private String areaCode;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
        UserAreaKey other = (UserAreaKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}