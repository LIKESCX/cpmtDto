package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

public class ConnectorOnlineInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String onlineInfoID;
	
	
	private String connectorID;

	private String stationID;

	private String equipmentID;
	private String operatorID;
	
	private Date onlineStartTime;

	private Date onlineEndTime;
	private Double onlineLastTime;
	private String inTime;//insert db time
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
	
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	
	public Date getOnlineStartTime() {
		return onlineStartTime;
	}
	public void setOnlineStartTime(Date onlineStartTime) {
		this.onlineStartTime = onlineStartTime;
	}
	public Date getOnlineEndTime() {
		return onlineEndTime;
	}
	public void setOnlineEndTime(Date onlineEndTime) {
		this.onlineEndTime = onlineEndTime;
	}
	public Double getOnlineLastTime() {
		return onlineLastTime;
	}
	public void setOnlineLastTime(Double onlineLastTime) {
		this.onlineLastTime = onlineLastTime;
	}
	public String getOnlineInfoID() {
		return onlineInfoID;
	}
	public void setOnlineInfoID(String onlineInfoID) {
		this.onlineInfoID = onlineInfoID;
	}
	@Override
	public String toString() {
		return "ConnectorOnlineInfo [connectorID=" + connectorID + ", stationID=" + stationID + ", equipmentID="
				+ equipmentID + ", operatorID=" + operatorID + ", onlineStartTime=" + onlineStartTime
				+ ", onlineEndTime=" + onlineEndTime + ", onlineLastTime=" + onlineLastTime + ", inTime=" + inTime
				+ "]";
	}


}
