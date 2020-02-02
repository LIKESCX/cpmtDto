package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.monitor.EquimentMonitorCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 
 */
public class AlarmInfo extends EquimentMonitorCondition implements Serializable {
	private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Integer id;
    
    /**
     * cid
     */
    private String cid;
    /**
     * eid
     */
    private String eid;
    /**
     * 充电站ID
     */
    private String stationID;

    /**
     * 运营商ID
     */
    private String operatorID;

    /**
     * 设备所属方ID
     */
    private String equipmentOwnerID;

    /**
     * 充电站名称
     */
    private String stationName;

    /**
     * 设备编码
     */
    private String equipmentID;
    /**
     * 设备类型
     */
    private Integer equipmentType;

    /**
     * 设备接口编码
     */
    private String connectorID;

    /**
     * 告警状态
     */
    private String alarmStatus;

    /**
     * 告警代码
     */
    private String alarmCode;

    /**
     * 告警类型
     */
    private String alarmType;

    /**
     * 告警级别
     */
    private String alarmLevel;
    
    /**
     * 每种告警级别的告警次数
     */
    private Integer alarmCount;
    /**
     * 告警总次数
     */
    private Integer alarmSumCount;
    
    /**
     * 告警时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date alarmTime;

    /**
     * 告警备注
     */
    private String noteString;

    /**
     * 中心平台收到时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date receivedTime;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date  inTime;
    
    /**
     * 车辆充放电过程信息对象
     */
    private BmsInfo bmsInfo;
    
    

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCid() {
		return cid;
	}



	public void setCid(String cid) {
		this.cid = cid;
	}



	public String getEid() {
		return eid;
	}



	public void setEid(String eid) {
		this.eid = eid;
	}



	public String getStationID() {
		return stationID;
	}



	public void setStationID(String stationID) {
		this.stationID = stationID;
	}



	public String getOperatorID() {
		return operatorID;
	}



	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}



	public String getEquipmentOwnerID() {
		return equipmentOwnerID;
	}



	public void setEquipmentOwnerID(String equipmentOwnerID) {
		this.equipmentOwnerID = equipmentOwnerID;
	}



	public String getStationName() {
		return stationName;
	}



	public void setStationName(String stationName) {
		this.stationName = stationName;
	}



	public String getEquipmentID() {
		return equipmentID;
	}



	public void setEquipmentID(String equipmentID) {
		this.equipmentID = equipmentID;
	}



	public String getConnectorID() {
		return connectorID;
	}



	public void setConnectorID(String connectorID) {
		this.connectorID = connectorID;
	}



	public String getAlarmStatus() {
		return alarmStatus;
	}



	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
	}



	public String getAlarmCode() {
		return alarmCode;
	}



	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}



	public String getAlarmType() {
		return alarmType;
	}



	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}



	public String getAlarmLevel() {
		return alarmLevel;
	}



	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}



	public Integer getAlarmCount() {
		return alarmCount;
	}



	public void setAlarmCount(Integer alarmCount) {
		this.alarmCount = alarmCount;
	}



	public Date getAlarmTime() {
		return alarmTime;
	}



	public void setAlarmTime(Date alarmTime) {
		this.alarmTime = alarmTime;
	}



	public String getNoteString() {
		return noteString;
	}



	public void setNoteString(String noteString) {
		this.noteString = noteString;
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



	public BmsInfo getBmsInfo() {
		return bmsInfo;
	}



	public void setBmsInfo(BmsInfo bmsInfo) {
		this.bmsInfo = bmsInfo;
	}



	public Integer getAlarmSumCount() {
		return alarmSumCount;
	}



	public void setAlarmSumCount(Integer alarmSumCount) {
		this.alarmSumCount = alarmSumCount;
	}
	
	public Integer getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(Integer equipmentType) {
		this.equipmentType = equipmentType;
	}



	@Override
	public String toString() {
		return "AlarmInfo [id=" + id + ", cid=" + cid + ", eid=" + eid + ", stationID=" + stationID + ", operatorID="
				+ operatorID + ", equipmentOwnerID=" + equipmentOwnerID + ", stationName=" + stationName
				+ ", equipmentID=" + equipmentID + ", equipmentType=" + equipmentType + ", connectorID=" + connectorID
				+ ", alarmStatus=" + alarmStatus + ", alarmCode=" + alarmCode + ", alarmType=" + alarmType
				+ ", alarmLevel=" + alarmLevel + ", alarmCount=" + alarmCount + ", alarmSumCount=" + alarmSumCount
				+ ", alarmTime=" + alarmTime + ", noteString=" + noteString + ", receivedTime=" + receivedTime
				+ ", inTime=" + inTime + ", bmsInfo=" + bmsInfo + "]";
	}
}