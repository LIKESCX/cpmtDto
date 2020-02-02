package com.cpit.cpmt.dto.monitor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class BmsEvaluateResult implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 判定最终依据 1.过程参数 2.故障率
     */
    private String aveId;

    /**
     * 阈值范围id
     */
    private String rangeId;

    /**
     * 运营商id
     */
    private String operatorId;

    /**
     * 设备编码
     */
    private String equipmentId;

    /**
     * 记录评估项
     */
    private String recordEvalute;

    /**
     * 评估依据
     */
    private String evaluteBasis;

    /**
     * 评估结论
     */
    private String evaluteResult;

    /**
     * 入库时间
     */
    private Date inTime;

    /*
    * 使用寿命估计
    * */
    private Double chargerLifeTime;

    private static final long serialVersionUID = 1L;

    public Double getChargerLifeTime() {
        return chargerLifeTime;
    }

    public void setChargerLifeTime(Double chargerLifeTime) {
        this.chargerLifeTime = chargerLifeTime;
    }

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

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getRecordEvalute() {
        return recordEvalute;
    }

    public void setRecordEvalute(String recordEvalute) {
        this.recordEvalute = recordEvalute;
    }

    public String getEvaluteBasis() {
        return evaluteBasis;
    }

    public void setEvaluteBasis(String evaluteBasis) {
        this.evaluteBasis = evaluteBasis;
    }

    public String getEvaluteResult() {
        return evaluteResult;
    }

    public void setEvaluteResult(String evaluteResult) {
        this.evaluteResult = evaluteResult;
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
        BmsEvaluateResult other = (BmsEvaluateResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAveId() == null ? other.getAveId() == null : this.getAveId().equals(other.getAveId()))
                && (this.getRangeId() == null ? other.getRangeId() == null : this.getRangeId().equals(other.getRangeId()))
                && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
                && (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
                && (this.getRecordEvalute() == null ? other.getRecordEvalute() == null : this.getRecordEvalute().equals(other.getRecordEvalute()))
                && (this.getEvaluteBasis() == null ? other.getEvaluteBasis() == null : this.getEvaluteBasis().equals(other.getEvaluteBasis()))
                && (this.getEvaluteResult() == null ? other.getEvaluteResult() == null : this.getEvaluteResult().equals(other.getEvaluteResult()))
                && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAveId() == null) ? 0 : getAveId().hashCode());
        result = prime * result + ((getRangeId() == null) ? 0 : getRangeId().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getRecordEvalute() == null) ? 0 : getRecordEvalute().hashCode());
        result = prime * result + ((getEvaluteBasis() == null) ? 0 : getEvaluteBasis().hashCode());
        result = prime * result + ((getEvaluteResult() == null) ? 0 : getEvaluteResult().hashCode());
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
        sb.append(", rangeId=").append(rangeId);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", recordEvalute=").append(recordEvalute);
        sb.append(", evaluteBasis=").append(evaluteBasis);
        sb.append(", evaluteResult=").append(evaluteResult);
        sb.append(", inTime=").append(inTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
