package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 
 */
public class DisEquipmentStatusInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 充电站id
     */
    private String stationID;

    /**
     * 运营商唯一id
     */
    private String operatorID;

    /**
     * 配电设备编码 设备唯一编码,对同一运营商,保证唯一
     */
    private String disequipmentID;

    /**
     *  (当前)正向有功总电能 单位：kWh
     */
    private Double foPEnergy;

    /**
     * (当前)反向有功总电能 单位： kWh
     */
    private Double rePEnergy;

    /**
     * (当前)正向无功总电能 单位：kWh
     */
    private Double foQEnergy;

    /**
     * (当前)反向无功总电能 kWh
     */
    private Double reQEnergy;

    /**
     * A相电压 单位：V
     */
    private Double aVoltage;

    /**
     * B相电压 单位：V
     */
    private Double bVoltage;

    /**
     * C相电压 单位：V
     */
    private Double cVoltage;

    /**
     * A相电流 单位：A
     */
    private Double aCurrent;

    /**
     * B相电流 单位：A
     */
    private Double bCurrent;

    /**
     * C相电流 单位：A
     */
    private Double cCurrent;

    /**
     * 瞬时有功功率单位：kW
     */
    private Double curPPower;

    /**
     * 瞬时无功功率单位：kVar
     */
    private Double curQPower;

    /**
     * 总功率因数 数据范围：-1~1
     */
    private Double factor;

    /**
     * 视在功率 单位：KVA
     */
    private Double curSPower;

    /**
     * 频率 单位：Hz
     */
    private Double frequency;

    /**
     * 交流馈线开关状态 N:0-断开 1-闭合
     */
    private String feedState;

    /**
     * 环境温度1 单位：℃
     */
    private Integer envTemp1;

    /**
     * 环境温度2 单位：℃
     */
    private Integer envTemp2;

    /**
     * 环境湿度1 单位：%
     */
    private Integer envHumi1;

    /**
     * 环境湿度2 单位：%
     */
    private Integer envHumi2;

    /**
     * 烟感报警1  0-正常 1-告警
     */
    private Integer smokAlam1;

    /**
     * 烟感报警2  0-正常 1-告警
     */
    private Integer smokAlam2;

    /**
     * 变压器过温告警  0-正常 1-告警
     */
    private Integer tranOverTemAlam;

    /**
     * 中心平台收到时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date receivedTime;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date inTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getDisequipmentID() {
        return disequipmentID;
    }

    public void setDisequipmentID(String disequipmentID) {
        this.disequipmentID = disequipmentID;
    }

    public Double getFoPEnergy() {
        return foPEnergy;
    }

    public void setFoPEnergy(Double foPEnergy) {
        this.foPEnergy = foPEnergy;
    }

    public Double getRePEnergy() {
        return rePEnergy;
    }

    public void setRePEnergy(Double rePEnergy) {
        this.rePEnergy = rePEnergy;
    }

    public Double getFoQEnergy() {
        return foQEnergy;
    }

    public void setFoQEnergy(Double foQEnergy) {
        this.foQEnergy = foQEnergy;
    }

    public Double getReQEnergy() {
        return reQEnergy;
    }

    public void setReQEnergy(Double reQEnergy) {
        this.reQEnergy = reQEnergy;
    }

    public Double getAVoltage() {
        return aVoltage;
    }

    public void setAVoltage(Double aVoltage) {
        this.aVoltage = aVoltage;
    }

    public Double getBVoltage() {
        return bVoltage;
    }

    public void setBVoltage(Double bVoltage) {
        this.bVoltage = bVoltage;
    }

    public Double getCVoltage() {
        return cVoltage;
    }

    public void setCVoltage(Double cVoltage) {
        this.cVoltage = cVoltage;
    }

    public Double getACurrent() {
        return aCurrent;
    }

    public void setACurrent(Double aCurrent) {
        this.aCurrent = aCurrent;
    }

    public Double getBCurrent() {
        return bCurrent;
    }

    public void setBCurrent(Double bCurrent) {
        this.bCurrent = bCurrent;
    }

    public Double getCCurrent() {
        return cCurrent;
    }

    public void setCCurrent(Double cCurrent) {
        this.cCurrent = cCurrent;
    }

    public Double getCurPPower() {
        return curPPower;
    }

    public void setCurPPower(Double curPPower) {
        this.curPPower = curPPower;
    }

    public Double getCurQPower() {
        return curQPower;
    }

    public void setCurQPower(Double curQPower) {
        this.curQPower = curQPower;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Double getCurSPower() {
        return curSPower;
    }

    public void setCurSPower(Double curSPower) {
        this.curSPower = curSPower;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public String getFeedState() {
        return feedState;
    }

    public void setFeedState(String feedState) {
        this.feedState = feedState;
    }

    public Integer getEnvTemp1() {
        return envTemp1;
    }

    public void setEnvTemp1(Integer envTemp1) {
        this.envTemp1 = envTemp1;
    }

    public Integer getEnvTemp2() {
        return envTemp2;
    }

    public void setEnvTemp2(Integer envTemp2) {
        this.envTemp2 = envTemp2;
    }

    public Integer getEnvHumi1() {
        return envHumi1;
    }

    public void setEnvHumi1(Integer envHumi1) {
        this.envHumi1 = envHumi1;
    }

    public Integer getEnvHumi2() {
        return envHumi2;
    }

    public void setEnvHumi2(Integer envHumi2) {
        this.envHumi2 = envHumi2;
    }

    public Integer getSmokAlam1() {
        return smokAlam1;
    }

    public void setSmokAlam1(Integer smokAlam1) {
        this.smokAlam1 = smokAlam1;
    }

    public Integer getSmokAlam2() {
        return smokAlam2;
    }

    public void setSmokAlam2(Integer smokAlam2) {
        this.smokAlam2 = smokAlam2;
    }

    public Integer getTranOverTemAlam() {
        return tranOverTemAlam;
    }

    public void setTranOverTemAlam(Integer tranOverTemAlam) {
        this.tranOverTemAlam = tranOverTemAlam;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

	@Override
	public String toString() {
		return "DisEquipmentStatusInfo [id=" + id + ", stationID=" + stationID + ", operatorID=" + operatorID
				+ ", disequipmentID=" + disequipmentID + ", foPEnergy=" + foPEnergy + ", rePEnergy=" + rePEnergy
				+ ", foQEnergy=" + foQEnergy + ", reQEnergy=" + reQEnergy + ", aVoltage=" + aVoltage + ", bVoltage="
				+ bVoltage + ", cVoltage=" + cVoltage + ", aCurrent=" + aCurrent + ", bCurrent=" + bCurrent
				+ ", cCurrent=" + cCurrent + ", curPPower=" + curPPower + ", curQPower=" + curQPower + ", factor="
				+ factor + ", curSPower=" + curSPower + ", frequency=" + frequency + ", feedState=" + feedState
				+ ", envTemp1=" + envTemp1 + ", envTemp2=" + envTemp2 + ", envHumi1=" + envHumi1 + ", envHumi2="
				+ envHumi2 + ", smokAlam1=" + smokAlam1 + ", smokAlam2=" + smokAlam2 + ", tranOverTemAlam="
				+ tranOverTemAlam + ", receivedTime=" + receivedTime + ", inTime=" + inTime + "]";
	}
}