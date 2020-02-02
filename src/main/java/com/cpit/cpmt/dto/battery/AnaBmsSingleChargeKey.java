package com.cpit.cpmt.dto.battery;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AnaBmsSingleChargeKey implements Serializable {
    /**
     * BMS编码
     */
    private String bmsCode;

    /**
     * 运营商唯一id
     */
    private String operatorId;

    /**
     * 设备接口编码
     */
    private String connectorId;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    private static final long serialVersionUID = 1L;

    public String getBmsCode() {
        return bmsCode;
    }

    public void setBmsCode(String bmsCode) {
        this.bmsCode = bmsCode;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
        AnaBmsSingleChargeKey other = (AnaBmsSingleChargeKey) that;
        return (this.getBmsCode() == null ? other.getBmsCode() == null : this.getBmsCode().equals(other.getBmsCode()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getConnectorId() == null ? other.getConnectorId() == null : this.getConnectorId().equals(other.getConnectorId()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBmsCode() == null) ? 0 : getBmsCode().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bmsCode=").append(bmsCode);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", connectorId=").append(connectorId);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}