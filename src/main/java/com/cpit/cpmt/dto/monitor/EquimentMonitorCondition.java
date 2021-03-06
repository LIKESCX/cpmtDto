package com.cpit.cpmt.dto.monitor;

import java.io.Serializable;

/*充电设施实时运行状态监控 查询条件dao*/
public class EquimentMonitorCondition implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String operatorID;//运营商ID
	
	private String operatorName;//运营商名称

	private String areaCode;//充电站行政区
	
	private String areaName;//充电站行政区
	
	private String streetId;//充电站街道ID
	
	private String streetName;//充电站街道名称
	
	private String stationID;//充电站ID
	
	private String stationName;//充电站名称
		
	private String equipmentID;//充电设施ID
	
	private String equipmentName;//充电设施名称
	
	private String connectorID;//设备接口ID
	
	private String connectorName;//设备接口名称
	
	private Integer type;//类型,1是列表页面 2是详情页面
	
	//private List<EquimentMonitorConditionShow> connectorRealInfoList;
	
	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}



	public String getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(String equipmentID) {
		this.equipmentID = equipmentID;
	}
	
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getStreetId() {
		return streetId;
	}

	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getConnectorName() {
		return connectorName;
	}

	public void setConnectorName(String connectorName) {
		this.connectorName = connectorName;
	}

	public String getConnectorID() {
		return connectorID;
	}

	public void setConnectorID(String connectorID) {
		this.connectorID = connectorID;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EquimentMonitorCondition [operatorID=" + operatorID + ", operatorName=" + operatorName + ", areaCode="
				+ areaCode + ", areaName=" + areaName + ", streetId=" + streetId + ", streetName=" + streetName
				+ ", stationID=" + stationID + ", stationName=" + stationName + ", equipmentID=" + equipmentID
				+ ", equipmentName=" + equipmentName + ", connectorID=" + connectorID + ", connectorName="
				+ connectorName + ", type=" + type + "]";
	}
}
