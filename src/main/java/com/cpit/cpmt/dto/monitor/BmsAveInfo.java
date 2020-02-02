package com.cpit.cpmt.dto.monitor;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author 
 */
public class BmsAveInfo implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 运营商id
     */
    private String operatorId;

    /**
     * 设备编码
     */
    private String equipmentId;

    /**
     * 总电压
     */
    private Double tatalVoltageAve;

    /**
     * 总电流
     */
    private Double totalCurrentAve;

    /**
     * 荷电状态
     */
    private Integer socAve;

    /**
     * 单体最高电压
     */
    private Double voltageHAve;

    /**
     * 单体最低电压
     */
    private Double voltageLAve;

    /**
     * 单体最高温度
     */
    private Integer temptureHAve;

    /**
     * 单体最低温度
     */
    private Integer temptureLAve;

    /**
     * 总电压阈值容器
     */
    private String tatalVoltageAveContainer;

    /**
     * 总电流阈值容器
     */
    private String totalCurrentAveContainer;

    /**
     * 荷电状态阈值容器
     */
    private String socAveContainer;

    /**
     * 单体最高电压阈值容器
     */
    private String voltageHAveContainer;

    /**
     * 单体最低电压阈值容器
     */
    private String voltageLAveContainer;

    /**
     * 单体最高温度阈值容器
     */
    private String temptureHAveContainer;

    /**
     * 单体最低温度阈值容器
     */
    private String temptureLAveContainer;

    /**
     * 故障率
     */
    private Double faultRate;

    /**
     * 统计结果概况
     */
    private String copareResult;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date inTime;

    /**
     * 开始时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date beginTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date endTime;


    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getTatalVoltageAve() {
        return tatalVoltageAve;
    }

    public void setTatalVoltageAve(Double tatalVoltageAve) {
        this.tatalVoltageAve = tatalVoltageAve;
    }

    public Double getTotalCurrentAve() {
        return totalCurrentAve;
    }

    public void setTotalCurrentAve(Double totalCurrentAve) {
        this.totalCurrentAve = totalCurrentAve;
    }

    public Integer getSocAve() {
        return socAve;
    }

    public void setSocAve(Integer socAve) {
        this.socAve = socAve;
    }

    public Double getVoltageHAve() {
        return voltageHAve;
    }

    public void setVoltageHAve(Double voltageHAve) {
        this.voltageHAve = voltageHAve;
    }

    public Double getVoltageLAve() {
        return voltageLAve;
    }

    public void setVoltageLAve(Double voltageLAve) {
        this.voltageLAve = voltageLAve;
    }

    public Integer getTemptureHAve() {
        return temptureHAve;
    }

    public void setTemptureHAve(Integer temptureHAve) {
        this.temptureHAve = temptureHAve;
    }

    public Integer getTemptureLAve() {
        return temptureLAve;
    }

    public void setTemptureLAve(Integer temptureLAve) {
        this.temptureLAve = temptureLAve;
    }

    public String getTatalVoltageAveContainer() {
        return tatalVoltageAveContainer;
    }

    public void setTatalVoltageAveContainer(String tatalVoltageAveContainer) {
        this.tatalVoltageAveContainer = tatalVoltageAveContainer;
    }

    public String getTotalCurrentAveContainer() {
        return totalCurrentAveContainer;
    }

    public void setTotalCurrentAveContainer(String totalCurrentAveContainer) {
        this.totalCurrentAveContainer = totalCurrentAveContainer;
    }

    public String getSocAveContainer() {
        return socAveContainer;
    }

    public void setSocAveContainer(String socAveContainer) {
        this.socAveContainer = socAveContainer;
    }

    public String getVoltageHAveContainer() {
        return voltageHAveContainer;
    }

    public void setVoltageHAveContainer(String voltageHAveContainer) {
        this.voltageHAveContainer = voltageHAveContainer;
    }

    public String getVoltageLAveContainer() {
        return voltageLAveContainer;
    }

    public void setVoltageLAveContainer(String voltageLAveContainer) {
        this.voltageLAveContainer = voltageLAveContainer;
    }

    public String getTemptureHAveContainer() {
        return temptureHAveContainer;
    }

    public void setTemptureHAveContainer(String temptureHAveContainer) {
        this.temptureHAveContainer = temptureHAveContainer;
    }

    public String getTemptureLAveContainer() {
        return temptureLAveContainer;
    }

    public void setTemptureLAveContainer(String temptureLAveContainer) {
        this.temptureLAveContainer = temptureLAveContainer;
    }

    public Double getFaultRate() {
        return faultRate;
    }

    public void setFaultRate(Double faultRate) {
        this.faultRate = faultRate;
    }

    public String getCopareResult() {
        return copareResult;
    }

    public void setCopareResult(String copareResult) {
        this.copareResult = copareResult;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BmsAveInfo)) return false;
        BmsAveInfo that = (BmsAveInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(equipmentId, that.equipmentId) &&
                Objects.equals(tatalVoltageAve, that.tatalVoltageAve) &&
                Objects.equals(totalCurrentAve, that.totalCurrentAve) &&
                Objects.equals(socAve, that.socAve) &&
                Objects.equals(voltageHAve, that.voltageHAve) &&
                Objects.equals(voltageLAve, that.voltageLAve) &&
                Objects.equals(temptureHAve, that.temptureHAve) &&
                Objects.equals(temptureLAve, that.temptureLAve) &&
                Objects.equals(tatalVoltageAveContainer, that.tatalVoltageAveContainer) &&
                Objects.equals(totalCurrentAveContainer, that.totalCurrentAveContainer) &&
                Objects.equals(socAveContainer, that.socAveContainer) &&
                Objects.equals(voltageHAveContainer, that.voltageHAveContainer) &&
                Objects.equals(voltageLAveContainer, that.voltageLAveContainer) &&
                Objects.equals(temptureHAveContainer, that.temptureHAveContainer) &&
                Objects.equals(temptureLAveContainer, that.temptureLAveContainer) &&
                Objects.equals(faultRate, that.faultRate) &&
                Objects.equals(copareResult, that.copareResult) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, operatorId, equipmentId, tatalVoltageAve, totalCurrentAve, socAve, voltageHAve, voltageLAve, temptureHAve, temptureLAve, tatalVoltageAveContainer, totalCurrentAveContainer, socAveContainer, voltageHAveContainer, voltageLAveContainer, temptureHAveContainer, temptureLAveContainer, faultRate, copareResult, inTime, beginTime, endTime);
    }

    @Override
    public String toString() {
        return "BmsAveInfo{" +
                "id='" + id + '\'' +
                ", operatorId='" + operatorId + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", tatalVoltageAve=" + tatalVoltageAve +
                ", totalCurrentAve=" + totalCurrentAve +
                ", socAve=" + socAve +
                ", voltageHAve=" + voltageHAve +
                ", voltageLAve=" + voltageLAve +
                ", temptureHAve=" + temptureHAve +
                ", temptureLAve=" + temptureLAve +
                ", tatalVoltageAveContainer='" + tatalVoltageAveContainer + '\'' +
                ", totalCurrentAveContainer='" + totalCurrentAveContainer + '\'' +
                ", socAveContainer='" + socAveContainer + '\'' +
                ", voltageHAveContainer='" + voltageHAveContainer + '\'' +
                ", voltageLAveContainer='" + voltageLAveContainer + '\'' +
                ", temptureHAveContainer='" + temptureHAveContainer + '\'' +
                ", temptureLAveContainer='" + temptureLAveContainer + '\'' +
                ", faultRate=" + faultRate +
                ", copareResult='" + copareResult + '\'' +
                ", inTime=" + inTime +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}