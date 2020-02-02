package com.cpit.cpmt.dto.monitor;

import java.io.Serializable;

import com.cpit.cpmt.dto.exchange.operator.StationInfoShow;

/**
 * 充电站运行情况 - 通报
 *
 */
public class Announce implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id; //编号
	private StationInfoShow station;
	private int notifyStatus = -1; //通知状态，1：已通知，0：未通知
	private String question; //共性问题
	private String event; //重大事故
	
	public static final int NOTIFY_STATUS_SENT = 1; //已发
	public static final int NOTIFY_STATUS_NONE = 0; //未发
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StationInfoShow getStation() {
		return station;
	}
	public void setStation(StationInfoShow station) {
		this.station = station;
	}
	public int getNotifyStatus() {
		return notifyStatus;
	}
	public void setNotifyStatus(int notifyStatus) {
		this.notifyStatus = notifyStatus;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Announce other = (Announce) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Announce [id=" + id + ", station=" + (station == null?"":station.getStationID()) + ", notifyStatus=" + notifyStatus + ", question="
				+ question + ", event=" + event + "]";
	}
	
}
