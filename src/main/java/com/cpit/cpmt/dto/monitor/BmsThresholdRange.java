package com.cpit.cpmt.dto.monitor;


import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class BmsThresholdRange implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 阈值id
     */
    private String aveId;

    /**
     * 风险等级 1.低风险 2.一般风险 3.较大风险 4.重大风险
     */
    private Integer riskLevel;

    /**
     * 总电压概率范围
     */
    private String tatalVoltageRange;

    /**
     * 总电流概率范围
     */
    private String totalCurrentRange;

    /**
     * 荷电状态概率范围
     */
    private String socRange;

    /**
     * 单体最高电压小于阈值概率范围
     */
    private String voltageHMin;

    /**
     * 单体最高电压大于阈值概率范围
     */
    private String voltageHMax;

    /**
     * 单体最低电压小于阈值概率范围
     */
    private String voltageLMin;

    /**
     * 单体最低电压大于阈值概率范围
     */
    private String voltageLMax;

    /**
     * 单体最高温度小于阈值概率范围
     */
    private String temptureHMin;

    /**
     * 单体最高温度大于阈值概率范围
     */
    private String temptureHMax;

    /**
     * 单体最低温度小于阈值概率范围
     */
    private String temptureLMin;

    /**
     * 单体最低温度大于阈值概率范围
     */
    private String temptureLMax;

    /**
     * 故障率范围
     */
    private String faultRateMin;

    /**
     * 入库时间
     */
    private Date inTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAveId() {
        return aveId;
    }

    public void setAveId(String aveId) {
        this.aveId = aveId;
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getTatalVoltageRange() {
        return tatalVoltageRange;
    }

    public void setTatalVoltageRange(String tatalVoltageRange) {
        this.tatalVoltageRange = tatalVoltageRange;
    }

    public String getTotalCurrentRange() {
        return totalCurrentRange;
    }

    public void setTotalCurrentRange(String totalCurrentRange) {
        this.totalCurrentRange = totalCurrentRange;
    }

    public String getSocRange() {
        return socRange;
    }

    public void setSocRange(String socRange) {
        this.socRange = socRange;
    }

    public String getVoltageHMin() {
        return voltageHMin;
    }

    public void setVoltageHMin(String voltageHMin) {
        this.voltageHMin = voltageHMin;
    }

    public String getVoltageHMax() {
        return voltageHMax;
    }

    public void setVoltageHMax(String voltageHMax) {
        this.voltageHMax = voltageHMax;
    }

    public String getVoltageLMin() {
        return voltageLMin;
    }

    public void setVoltageLMin(String voltageLMin) {
        this.voltageLMin = voltageLMin;
    }

    public String getVoltageLMax() {
        return voltageLMax;
    }

    public void setVoltageLMax(String voltageLMax) {
        this.voltageLMax = voltageLMax;
    }

    public String getTemptureHMin() {
        return temptureHMin;
    }

    public void setTemptureHMin(String temptureHMin) {
        this.temptureHMin = temptureHMin;
    }

    public String getTemptureHMax() {
        return temptureHMax;
    }

    public void setTemptureHMax(String temptureHMax) {
        this.temptureHMax = temptureHMax;
    }

    public String getTemptureLMin() {
        return temptureLMin;
    }

    public void setTemptureLMin(String temptureLMin) {
        this.temptureLMin = temptureLMin;
    }

    public String getTemptureLMax() {
        return temptureLMax;
    }

    public void setTemptureLMax(String temptureLMax) {
        this.temptureLMax = temptureLMax;
    }

    public String getFaultRateMin() {
        return faultRateMin;
    }

    public void setFaultRateMin(String faultRateMin) {
        this.faultRateMin = faultRateMin;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
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
        BmsThresholdRange other = (BmsThresholdRange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAveId() == null ? other.getAveId() == null : this.getAveId().equals(other.getAveId()))
                && (this.getRiskLevel() == null ? other.getRiskLevel() == null : this.getRiskLevel().equals(other.getRiskLevel()))
                && (this.getTatalVoltageRange() == null ? other.getTatalVoltageRange() == null : this.getTatalVoltageRange().equals(other.getTatalVoltageRange()))
                && (this.getTotalCurrentRange() == null ? other.getTotalCurrentRange() == null : this.getTotalCurrentRange().equals(other.getTotalCurrentRange()))
                && (this.getSocRange() == null ? other.getSocRange() == null : this.getSocRange().equals(other.getSocRange()))
                && (this.getVoltageHMin() == null ? other.getVoltageHMin() == null : this.getVoltageHMin().equals(other.getVoltageHMin()))
                && (this.getVoltageHMax() == null ? other.getVoltageHMax() == null : this.getVoltageHMax().equals(other.getVoltageHMax()))
                && (this.getVoltageLMin() == null ? other.getVoltageLMin() == null : this.getVoltageLMin().equals(other.getVoltageLMin()))
                && (this.getVoltageLMax() == null ? other.getVoltageLMax() == null : this.getVoltageLMax().equals(other.getVoltageLMax()))
                && (this.getTemptureHMin() == null ? other.getTemptureHMin() == null : this.getTemptureHMin().equals(other.getTemptureHMin()))
                && (this.getTemptureHMax() == null ? other.getTemptureHMax() == null : this.getTemptureHMax().equals(other.getTemptureHMax()))
                && (this.getTemptureLMin() == null ? other.getTemptureLMin() == null : this.getTemptureLMin().equals(other.getTemptureLMin()))
                && (this.getTemptureLMax() == null ? other.getTemptureLMax() == null : this.getTemptureLMax().equals(other.getTemptureLMax()))
                && (this.getFaultRateMin() == null ? other.getFaultRateMin() == null : this.getFaultRateMin().equals(other.getFaultRateMin()))
                && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAveId() == null) ? 0 : getAveId().hashCode());
        result = prime * result + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        result = prime * result + ((getTatalVoltageRange() == null) ? 0 : getTatalVoltageRange().hashCode());
        result = prime * result + ((getTotalCurrentRange() == null) ? 0 : getTotalCurrentRange().hashCode());
        result = prime * result + ((getSocRange() == null) ? 0 : getSocRange().hashCode());
        result = prime * result + ((getVoltageHMin() == null) ? 0 : getVoltageHMin().hashCode());
        result = prime * result + ((getVoltageHMax() == null) ? 0 : getVoltageHMax().hashCode());
        result = prime * result + ((getVoltageLMin() == null) ? 0 : getVoltageLMin().hashCode());
        result = prime * result + ((getVoltageLMax() == null) ? 0 : getVoltageLMax().hashCode());
        result = prime * result + ((getTemptureHMin() == null) ? 0 : getTemptureHMin().hashCode());
        result = prime * result + ((getTemptureHMax() == null) ? 0 : getTemptureHMax().hashCode());
        result = prime * result + ((getTemptureLMin() == null) ? 0 : getTemptureLMin().hashCode());
        result = prime * result + ((getTemptureLMax() == null) ? 0 : getTemptureLMax().hashCode());
        result = prime * result + ((getFaultRateMin() == null) ? 0 : getFaultRateMin().hashCode());
        result = prime * result + ((getInTime() == null) ? 0 : getInTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", aveId=").append(aveId);
        sb.append(", riskLevel=").append(riskLevel);
        sb.append(", tatalVoltageRange=").append(tatalVoltageRange);
        sb.append(", totalCurrentRange=").append(totalCurrentRange);
        sb.append(", socRange=").append(socRange);
        sb.append(", voltageHMin=").append(voltageHMin);
        sb.append(", voltageHMax=").append(voltageHMax);
        sb.append(", voltageLMin=").append(voltageLMin);
        sb.append(", voltageLMax=").append(voltageLMax);
        sb.append(", temptureHMin=").append(temptureHMin);
        sb.append(", temptureHMax=").append(temptureHMax);
        sb.append(", temptureLMin=").append(temptureLMin);
        sb.append(", temptureLMax=").append(temptureLMax);
        sb.append(", faultRateMin=").append(faultRateMin);
        sb.append(", inTime=").append(inTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}