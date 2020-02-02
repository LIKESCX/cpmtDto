package com.cpit.cpmt.dto.battery;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.exchange.basic.OperatorInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
//2.2.	电池数据跟踪评估 查询条件实体类
public class BatteryDataTrackingAssessmentConditions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 运营商Id
	 */
	private String operatorId;

	/**
	 * 运营商列表
	 */
	private List<OperatorInfo> operatorInfos;
	
	/**
	 * 运营商是否全选标识符 0 为单选 1为全选
	 */
	private Integer allOperators;
	/**
     * 充电站编码
     */
    private String stationId;
	/**
	 * 充电站是否全选标识符  0 为单选 1为全选
	 */
	private Integer allStations;
	 /**
     * 设备编码Id
     */
    private String equipmentId;
	/**
	 * 充电桩是否全选标识符  0 为单选 1为全选
	 */
	private Integer allEquipments;
    /**
     * 时间粒度
     */
    private Integer timeGranularity; //1.小时、2.天、3.周、4.月、5.季
    /**
     * 车辆电池的bMSCode
     */
    private String bMSCode;
    /**
     * 统计开始时间
     * yyyy-mm-dd hh:mm:ss
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime;
    /**
     * 统计结束时间
     * yyyy-mm-dd hh:mm:ss
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime;
    
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public List<OperatorInfo> getOperatorInfos() {
		return operatorInfos;
	}
	public void setOperatorInfos(List<OperatorInfo> operatorInfos) {
		this.operatorInfos = operatorInfos;
	}
	public Integer getAllOperators() {
		return allOperators;
	}
	public void setAllOperators(Integer allOperators) {
		this.allOperators = allOperators;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public Integer getAllStations() {
		return allStations;
	}
	public void setAllStations(Integer allStations) {
		this.allStations = allStations;
	}
	public String getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	public Integer getAllEquipments() {
		return allEquipments;
	}
	public void setAllEquipments(Integer allEquipments) {
		this.allEquipments = allEquipments;
	}
	public Integer getTimeGranularity() {
		return timeGranularity;
	}
	public void setTimeGranularity(Integer timeGranularity) {
		this.timeGranularity = timeGranularity;
	}
	public String getbMSCode() {
		return bMSCode;
	}
	public void setbMSCode(String bMSCode) {
		this.bMSCode = bMSCode;
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
	@Override
	public String toString() {
		return "BatteryDataTrackingAssessmentConditions [operatorId=" + operatorId + ", operatorInfos=" + operatorInfos
				+ ", allOperators=" + allOperators + ", stationId=" + stationId + ", allStations=" + allStations
				+ ", equipmentId=" + equipmentId + ", allEquipments=" + allEquipments + ", timeGranularity="
				+ timeGranularity + ", bMSCode=" + bMSCode + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
}