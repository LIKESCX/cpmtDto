package com.cpit.cpmt.dto.monitor;

import java.io.Serializable;

import com.cpit.cpmt.dto.exchange.operator.StationInfoShow;

/**
 * 充电站运行情况 - 告警次数，充电次数
 *
 */
public class StationRunning implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private StationInfoShow station = null;
	
	private int num = 0;//告警次数, 充电次数

	public StationInfoShow getStation() {
		return station;
	}

	public void setStation(StationInfoShow station) {
		this.station = station;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "StationRunning [station=" + (station == null?"":station.getStationID()) + ", num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + ((station == null) ? 0 : station.hashCode());
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
		StationRunning other = (StationRunning) obj;
		if (num != other.num)
			return false;
		if (station == null) {
			if (other.station != null)
				return false;
		} else if (!station.equals(other.station))
			return false;
		return true;
	}
	
	

	
}
