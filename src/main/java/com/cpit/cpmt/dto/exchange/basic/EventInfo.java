package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 
 */
public class EventInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

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
     * 事件类型
     */
    private String eventType;

    /**
     * 事件编码
     */
    private String eventCode;

    /**
     * 事件发生时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date eventTime;

    /**
     * 事件备注
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
    private Date inTime;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public String getEventType() {
		return eventType;
	}


	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


	public String getEventCode() {
		return eventCode;
	}


	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}


	public Date getEventTime() {
		return eventTime;
	}


	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
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


	@Override
	public String toString() {
		return "EventInfo [id=" + id + ", stationID=" + stationID + ", operatorID=" + operatorID + ", equipmentOwnerID="
				+ equipmentOwnerID + ", stationName=" + stationName + ", eventType=" + eventType + ", eventCode="
				+ eventCode + ", eventTime=" + eventTime + ", noteString=" + noteString + ", receivedTime="
				+ receivedTime + ", inTime=" + inTime + "]";
	}
}