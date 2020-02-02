package com.cpit.cpmt.dto.measure;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ConnectorCharge implements Serializable{

	private static final long serialVersionUID = 1L;


	private int  id; 	//序列id
	private String  operatorId;  //运营商id
	private String   stationId;  //充电站id
	private String  equipmentId;  //充电设备id
	private String  connectorId;  //充电设备id
	
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")    
	private Date  inTime; //统计日期
	private double   chargeElectricity = -1; //接口充电量
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public double getChargeElectricity() {
		return chargeElectricity;
	}
	public void setChargeElectricity(double chargeElectricity) {
		this.chargeElectricity = chargeElectricity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConnectorCharge other = (ConnectorCharge) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ConnectorCharge [id=" + id + ", operatorId=" + operatorId + ", stationId=" + stationId
				+ ", equipmentId=" + equipmentId + ", connectorId=" + connectorId + ", inTime=" + inTime
				+ ", chargeElectricity=" + chargeElectricity + "]";
	}

	
	
}
