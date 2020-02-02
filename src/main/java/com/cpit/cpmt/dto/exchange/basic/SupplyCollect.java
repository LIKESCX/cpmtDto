package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

/*
 * 用于封装前台传到后台的参数
 */
public class SupplyCollect implements Serializable {
	
	private static final long serialVersionUID = -1416974453693013932L;

	private String operatorID;//运营商Id
	
	private String stationID;//充电站Id
	
	private String equipmentID;//设备Id
	
	private String versionNum;//接口版本号
	
	private String startTime;//开始时间
	
	private String endTime;//结束时间
	
	private String interfaceName;//接口类型
	

	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorId) {
		this.operatorID = operatorId;
	}

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationId) {
		this.stationID = stationId;
	}

	public String getVersionNum() {
		return versionNum;
	}

	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	
	
	public String getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(String equipmentId) {
		this.equipmentID = equipmentId;
	}

	@Override
	public String toString() {
		return "SupplyCollect [operatorID=" + operatorID + ", stationID=" + stationID + ", equipmentID="
				+ equipmentID + ", versionNum=" + versionNum + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", interfaceName=" + interfaceName + "]";
	}
}
