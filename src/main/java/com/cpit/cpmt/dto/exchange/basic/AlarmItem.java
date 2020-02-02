package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

/**
 * @author 
 */
public class AlarmItem  implements Serializable {
	private static final long serialVersionUID = 1L;
    
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
     * 告警备注
     */
    private String noteString;

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

	public String getNoteString() {
		return noteString;
	}

	public void setNoteString(String noteString) {
		this.noteString = noteString;
	}

	@Override
	public String toString() {
		return "AlarmItem [alarmCode=" + alarmCode + ", alarmType=" + alarmType + ", alarmLevel=" + alarmLevel
				+ ", noteString=" + noteString + "]";
	}
}