package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * exc_connector_history_power_info表记录设备接口状态变化时上报的各个相位电流与相应电压之积的和所得的功率 ，
 * 此表只添加不更新
 */
public class ConnectorHistoryPowerInfo implements Serializable {
    private String id;//数据量较大的话，不建议用Integer类型10位

    /**
     * 运营商ID
     */
    private String operatorId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * 设备接口编码
     */
    private String connectorId;
    /**
     * 充电站编码
     */
    private String stationId;

    /**
     * 设备接口功率
     */
    private Double power;
    
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
    /**
     * 已充电电能
     */
    private String chargeElectricity;

    /**
     * 已放电电能
     */
    private String dischargeElectricity;

    /**
     * 收到时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date receivedTime;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date inTime;

    /**
     * 预留字段
     */
    private String remark1;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
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

	@Override
	public String toString() {
		return "ConnectorHistoryPowerInfo [id=" + id + ", operatorId=" + operatorId + ", equipmentId=" + equipmentId
				+ ", connectorId=" + connectorId + ", stationId=" + stationId + ", power=" + power + ", status="
				+ status + ", parkStatus=" + parkStatus + ", lockStatus=" + lockStatus + ", currentA=" + currentA
				+ ", currentB=" + currentB + ", currentC=" + currentC + ", voltageA=" + voltageA + ", voltageB="
				+ voltageB + ", voltageC=" + voltageC + ", sOC=" + sOC + ", connectorTemp=" + connectorTemp
				+ ", equipmentTemp=" + equipmentTemp + ", connectorLock=" + connectorLock + ", chargeElectricity="
				+ chargeElectricity + ", dischargeElectricity=" + dischargeElectricity + ", receivedTime="
				+ receivedTime + ", inTime=" + inTime + ", remark1=" + remark1 + "]";
	}
}