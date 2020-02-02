package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class StationStatusInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
 * 充电站ID
 */
	private String stationID;
	
	private String[] stationIDs;//方便传递参数构造此字段
	
	public String[] getStationIDs() {
		return stationIDs;
	}
	public void setStationIDs(String[] stationIDs) {
		this.stationIDs = stationIDs;
	}
	/**
	 * 设备接口状态列表
	 */
	private List<ConnectorStatusInfo> connectorStatusInfos ;
	public String getStationID() {
		return stationID;
	}
	public void setStationID(String stationId) {
		this.stationID = stationId;
	}
	public List<ConnectorStatusInfo> getConnectorStatusInfos() {
		return connectorStatusInfos;
	}
	public void setConnectorStatusInfos(List<ConnectorStatusInfo> connectorStatusInfos) {
		this.connectorStatusInfos = connectorStatusInfos;
	}
	
	@Override
	public String toString() {
		return "StationStatusInfo [stationID=" + stationID + ", stationIDs=" + Arrays.toString(stationIDs)
				+ ", connectorStatusInfos=" + connectorStatusInfos + "]";
	}
}
