package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Objects;

public class ConnectorInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String connectorID;
	
	private String operatorID;
	
	private String equipmentID;

    private String connectorName;

    private Integer connectorType;

    private Integer voltageUpperLimits;

    private Integer voltageLowerLimits;

    private Integer current;

    private Double power;

    private String parkNo;

    private Integer voltage;

    private Integer bMSPowerType;

    public String getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public Integer getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(Integer connectorType) {
        this.connectorType = connectorType;
    }

    public Integer getVoltageUpperLimits() {
        return voltageUpperLimits;
    }

    public void setVoltageUpperLimits(Integer voltageUpperLimits) {
        this.voltageUpperLimits = voltageUpperLimits;
    }

    public Integer getVoltageLowerLimits() {
        return voltageLowerLimits;
    }

    public void setVoltageLowerLimits(Integer voltageLowerLimits) {
        this.voltageLowerLimits = voltageLowerLimits;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getParkNo() {
        return parkNo;
    }

    public void setParkNo(String parkNo) {
        this.parkNo = parkNo;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getBMSPowerType() {
        return bMSPowerType;
    }

    public void setBMSPowerType(Integer bMSPowerType) {
        this.bMSPowerType = bMSPowerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectorInfo)) return false;
        ConnectorInfo that = (ConnectorInfo) o;
        return Objects.equals(connectorID, that.connectorID) &&
                Objects.equals(operatorID, that.operatorID) &&
                Objects.equals(equipmentID, that.equipmentID) &&
                Objects.equals(connectorName, that.connectorName) &&
                Objects.equals(connectorType, that.connectorType) &&
                Objects.equals(voltageUpperLimits, that.voltageUpperLimits) &&
                Objects.equals(voltageLowerLimits, that.voltageLowerLimits) &&
                Objects.equals(current, that.current) &&
                Objects.equals(power, that.power) &&
                Objects.equals(parkNo, that.parkNo) &&
                Objects.equals(voltage, that.voltage) &&
                Objects.equals(bMSPowerType, that.bMSPowerType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(connectorID, operatorID, equipmentID, connectorName, connectorType, voltageUpperLimits, voltageLowerLimits, current, power, parkNo, voltage, bMSPowerType);
    }

    @Override
    public String toString() {
        return "ConnectorInfo{" +
                "connectorID='" + connectorID + '\'' +
                ", operatorID='" + operatorID + '\'' +
                ", equipmentID='" + equipmentID + '\'' +
                ", connectorName='" + connectorName + '\'' +
                ", connectorType=" + connectorType +
                ", voltageUpperLimits=" + voltageUpperLimits +
                ", voltageLowerLimits=" + voltageLowerLimits +
                ", current=" + current +
                ", power=" + power +
                ", parkNo='" + parkNo + '\'' +
                ", voltage=" + voltage +
                ", bMSPowerType=" + bMSPowerType +
                '}';
    }
}