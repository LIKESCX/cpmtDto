package com.cpit.cpmt.dto.system;

import java.io.Serializable;

/**
 * sys_user_operator
 * @author 
 */
public class UserOperatorKey implements Serializable {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 所属运营商id
     */
    private String operatorId;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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
        UserOperatorKey other = (UserOperatorKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}