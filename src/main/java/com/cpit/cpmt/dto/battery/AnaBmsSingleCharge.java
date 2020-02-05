package com.cpit.cpmt.dto.battery;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 
 */
public class AnaBmsSingleCharge implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * BMS编码
     */
    private String bMSCode;

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
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime;
    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * BMS版本
     */
    private String bMSVer;

    /**
     * 电池内阻估算
     */
    private Integer estiR;

    /**
     * 电池剩余容量
     */
    private Integer remainCapacity;

    /**
     * 充电时间长度，单位秒
     */
    private Integer chargeTime;

    /**
     * 电池健康度
     */
    private Integer sOH;

    /**
     * 综合评估
     */
    private String remark1;

    /**
     * 荷电状态
     */
    private Integer soc;

    /**
     * 单体最高电压
     */
    private Float voltageH;

    /**
     * 单体最低电压
     */
    private Float voltageL;

    /**
     * 单体最高温度
     */
    private Integer temptureH;

    /**
     * 单体最低温度
     */
    private Integer temptureL;

    /**
     * 充电前soc值
     */
    private Integer beforeSoc;

    /**
     * 充电后soc值
     */
    private Integer afterSoc;
    
    /**
     * 统计次数  按小时汇总时用
     */
    
    private String statisticalTimes;
    /**
     * 统计次数  按小时汇总时用
     */
    private String statisticalHour;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDate;
    
    /**
     * 对应的日期(以结束时间,所在的周日为准)
     */
    private String statisticalWeek;

    /**
     * 对应的月份(以结束时间为准)
     */
    private String statisticalMonth;

    /**
     * 对应的季度(以结束时间为准)
     */
    private String statisticalSeason;

	public String getbMSCode() {
		return bMSCode;
	}



	public void setbMSCode(String bMSCode) {
		this.bMSCode = bMSCode;
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



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	public String getStationId() {
		return stationId;
	}



	public void setStationId(String stationId) {
		this.stationId = stationId;
	}



	public String getEquipmentId() {
		return equipmentId;
	}



	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}



	public String getbMSVer() {
		return bMSVer;
	}



	public void setbMSVer(String bMSVer) {
		this.bMSVer = bMSVer;
	}



	public Integer getEstiR() {
		return estiR;
	}



	public void setEstiR(Integer estiR) {
		this.estiR = estiR;
	}



	public Integer getRemainCapacity() {
		return remainCapacity;
	}



	public void setRemainCapacity(Integer remainCapacity) {
		this.remainCapacity = remainCapacity;
	}



	public Integer getChargeTime() {
		return chargeTime;
	}



	public void setChargeTime(Integer chargeTime) {
		this.chargeTime = chargeTime;
	}



	public Integer getsOH() {
		return sOH;
	}



	public void setsOH(Integer sOH) {
		this.sOH = sOH;
	}



	public String getRemark1() {
		return remark1;
	}



	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}



	public Integer getSoc() {
		return soc;
	}



	public void setSoc(Integer soc) {
		this.soc = soc;
	}



	public Float getVoltageH() {
		return voltageH;
	}



	public void setVoltageH(Float voltageH) {
		this.voltageH = voltageH;
	}



	public Float getVoltageL() {
		return voltageL;
	}



	public void setVoltageL(Float voltageL) {
		this.voltageL = voltageL;
	}



	public Integer getTemptureH() {
		return temptureH;
	}



	public void setTemptureH(Integer temptureH) {
		this.temptureH = temptureH;
	}



	public Integer getTemptureL() {
		return temptureL;
	}



	public void setTemptureL(Integer temptureL) {
		this.temptureL = temptureL;
	}



	public Integer getBeforeSoc() {
		return beforeSoc;
	}



	public void setBeforeSoc(Integer beforeSoc) {
		this.beforeSoc = beforeSoc;
	}



	public Integer getAfterSoc() {
		return afterSoc;
	}



	public void setAfterSoc(Integer afterSoc) {
		this.afterSoc = afterSoc;
	}



	public String getStatisticalDate() {
		return statisticalDate;
	}



	public void setStatisticalDate(String statisticalDate) {
		this.statisticalDate = statisticalDate;
	}



	public String getStatisticalWeek() {
		return statisticalWeek;
	}



	public void setStatisticalWeek(String statisticalWeek) {
		this.statisticalWeek = statisticalWeek;
	}



	public String getStatisticalMonth() {
		return statisticalMonth;
	}



	public void setStatisticalMonth(String statisticalMonth) {
		this.statisticalMonth = statisticalMonth;
	}



	public String getStatisticalSeason() {
		return statisticalSeason;
	}



	public void setStatisticalSeason(String statisticalSeason) {
		this.statisticalSeason = statisticalSeason;
	}



	public String getStatisticalTimes() {
		return statisticalTimes;
	}



	public void setStatisticalTimes(String statisticalTimes) {
		this.statisticalTimes = statisticalTimes;
	}

	public String getStatisticalHour() {
		return statisticalHour;
	}

	public void setStatisticalHour(String statisticalHour) {
		this.statisticalHour = statisticalHour;
	}

	@Override
	public String toString() {
		return "AnaBmsSingleCharge [bMSCode=" + bMSCode + ", operatorId=" + operatorId + ", connectorId=" + connectorId
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", stationId=" + stationId + ", equipmentId="
				+ equipmentId + ", bMSVer=" + bMSVer + ", estiR=" + estiR + ", remainCapacity=" + remainCapacity
				+ ", chargeTime=" + chargeTime + ", sOH=" + sOH + ", remark1=" + remark1 + ", soc=" + soc
				+ ", voltageH=" + voltageH + ", voltageL=" + voltageL + ", temptureH=" + temptureH + ", temptureL="
				+ temptureL + ", beforeSoc=" + beforeSoc + ", afterSoc=" + afterSoc + ", statisticalTimes="
				+ statisticalTimes + ", statisticalHour=" + statisticalHour + ", statisticalDate=" + statisticalDate
				+ ", statisticalWeek=" + statisticalWeek + ", statisticalMonth=" + statisticalMonth
				+ ", statisticalSeason=" + statisticalSeason + "]";
	}
	
}