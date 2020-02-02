package com.cpit.cpmt.dto.battery;

import java.io.Serializable;
import java.util.Date;

public class AnaBmsManyChargesDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * BMS编码
     */
    private String bmsCode;

    /**
     * 运营商唯一id
     */
    private String operatorId;

 
    
    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;
    
    /**
     * 设备接口编码
     */
    private String connectorId;
    
    /**
     * 充电次数
     */
    private Integer chargeTimes;

    /**
     * 字符串类型时间 标识
     */
    private String flagTime;

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

	public String getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public Integer getChargeTimes() {
		return chargeTimes;
	}

	public void setChargeTimes(Integer chargeTimes) {
		this.chargeTimes = chargeTimes;
	}

	public String getFlagTime() {
		return flagTime;
	}

	public void setFlagTime(String flagTime) {
		this.flagTime = flagTime;
	}

	@Override
	public String toString() {
		return "AnaBmsManyChargesDto [bmsCode=" + bmsCode + ", operatorId=" + operatorId + ", stationId=" + stationId
				+ ", equipmentId=" + equipmentId + ", connectorId=" + connectorId + ", chargeTimes=" + chargeTimes
				+ ", flagTime=" + flagTime + "]";
	}
}
