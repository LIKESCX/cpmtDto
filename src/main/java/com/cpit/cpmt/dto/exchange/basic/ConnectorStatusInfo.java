package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ConnectorStatusInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String operatorID;

   

	private String connectorID;
	
	private String stationID;

    private String status;

    private String parkStatus;

    private String lockStatus;

    private String currentA;

    private String currentB;
    
    private String currentC;

    //private String currentV;

    private String voltageA;

    private String voltageB;

    private String voltageC;

    private String sOC;

    private String connectorTemp;

    private String equipmentTemp;

    private String connectorLock;

    private String chargeElectricity;

    private String dischargeElectricity;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date receivedTime;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date inTime;

    private String remark1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParkStatus() {
		return parkStatus;
	}

	public void setParkStatus(String parkStatus) {
		this.parkStatus = parkStatus;
	}

	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	public String getCurrentA() {
		return currentA;
	}

	public void setCurrentA(String currentA) {
		this.currentA = currentA;
	}

	public String getCurrentB() {
		return currentB;
	}

	public void setCurrentB(String currentB) {
		this.currentB = currentB;
	}

	public String getCurrentC() {
		return currentC;
	}

	public void setCurrentC(String currentC) {
		this.currentC = currentC;
	}

	public String getVoltageA() {
		return voltageA;
	}

	public void setVoltageA(String voltageA) {
		this.voltageA = voltageA;
	}

	public String getVoltageB() {
		return voltageB;
	}

	public void setVoltageB(String voltageB) {
		this.voltageB = voltageB;
	}

	public String getVoltageC() {
		return voltageC;
	}

	public void setVoltageC(String voltageC) {
		this.voltageC = voltageC;
	}

	public String getsOC() {
		return sOC;
	}

	public void setsOC(String sOC) {
		this.sOC = sOC;
	}

	public String getConnectorTemp() {
		return connectorTemp;
	}

	public void setConnectorTemp(String connectorTemp) {
		this.connectorTemp = connectorTemp;
	}

	public String getEquipmentTemp() {
		return equipmentTemp;
	}

	public void setEquipmentTemp(String equipmentTemp) {
		this.equipmentTemp = equipmentTemp;
	}

	public String getConnectorLock() {
		return connectorLock;
	}

	public void setConnectorLock(String connectorLock) {
		this.connectorLock = connectorLock;
	}

	public String getChargeElectricity() {
		return chargeElectricity;
	}

	public void setChargeElectricity(String chargeElectricity) {
		this.chargeElectricity = chargeElectricity;
	}

	public String getDischargeElectricity() {
		return dischargeElectricity;
	}

	public void setDischargeElectricity(String dischargeElectricity) {
		this.dischargeElectricity = dischargeElectricity;
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

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	@Override
	public String toString() {
		return "ConnectorStatusInfo [id=" + id + ", operatorID=" + operatorID + ", connectorID=" + connectorID
				+ ", stationID=" + stationID + ", status=" + status + ", parkStatus=" + parkStatus + ", lockStatus="
				+ lockStatus + ", currentA=" + currentA + ", currentB=" + currentB + ", currentC=" + currentC
				+ ", voltageA=" + voltageA + ", voltageB=" + voltageB + ", voltageC=" + voltageC + ", sOC=" + sOC
				+ ", connectorTemp=" + connectorTemp + ", equipmentTemp=" + equipmentTemp + ", connectorLock="
				+ connectorLock + ", chargeElectricity=" + chargeElectricity + ", dischargeElectricity="
				+ dischargeElectricity + ", receivedTime=" + receivedTime + ", inTime=" + inTime + ", remark1="
				+ remark1 + "]";
	}
}