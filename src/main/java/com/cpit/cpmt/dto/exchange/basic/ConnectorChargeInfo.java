package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

/**
 * 充电接口充电信息
 * 
 * @author admin
 *
 */
public class ConnectorChargeInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String chargeID;

	
	private String connectorID;

	private String stationID;

	private String equipmentID;
	private String operatorID;
	private String bmsCode;
	private Date chargeStartTime;
	private Date chargeEndTime;
	private Double chargeLastTime;
	private String inTime;
	public String getChargeID() {
		return chargeID;
	}
	public void setChargeID(String chargeID) {
		this.chargeID = chargeID;
	}
	public String getConnectorID() {
		return connectorID;
	}
	public void setConnectorID(String connectorID) {
		this.connectorID = connectorID;
	}
	public String getStationID() {
		return stationID;
	}
	public void setStationID(String stationID) {
		this.stationID = stationID;
	}
	public String getEquipmentID() {
		return equipmentID;
	}
	public void setEquipmentID(String equipmentID) {
		this.equipmentID = equipmentID;
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getBmsCode() {
		return bmsCode;
	}
	public void setBmsCode(String bmsCode) {
		this.bmsCode = bmsCode;
	}
	public Date getChargeStartTime() {
		return chargeStartTime;
	}
	public void setChargeStartTime(Date chargeStartTime) {
		this.chargeStartTime = chargeStartTime;
	}
	public Date getChargeEndTime() {
		return chargeEndTime;
	}
	public void setChargeEndTime(Date chargeEndTime) {
		this.chargeEndTime = chargeEndTime;
	}
	public Double getChargeLastTime() {
		return chargeLastTime;
	}
	public void setChargeLastTime(Double chargeLastTime) {
		this.chargeLastTime = chargeLastTime;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	@Override
	public String toString() {
		return "ConnectorChargeInfo [connectorID=" + connectorID + ", stationID=" + stationID + ", equipmentID="
				+ equipmentID + ", operatorID=" + operatorID + ", bmsCode=" + bmsCode + ", chargeStartTime="
				+ chargeStartTime + ", chargeEndTime=" + chargeEndTime + ", chargeLastTime=" + chargeLastTime
				+ ", inTime=" + inTime + "]";
	}
	
	
}
