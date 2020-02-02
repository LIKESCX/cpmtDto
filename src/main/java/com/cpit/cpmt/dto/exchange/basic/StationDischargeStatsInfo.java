package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.List;

public class StationDischargeStatsInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String id;
    private String sid;

    private String operatorID;

    private String stationID;

    private String startTime;

    private String endTime;

    private String stationDischargeElectricity;

    private String recTime;
    
    private String inTime;
    
    public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	private List<EquipmentDischargeStatsInfo> equipmentDischargeStatsInfos;

    public List<EquipmentDischargeStatsInfo> getEquipmentDischargeStatsInfos() {
		return equipmentDischargeStatsInfos;
	}

	public void setEquipmentDischargeStatsInfos(List<EquipmentDischargeStatsInfo> equipmentDischargeStatsInfos) {
		this.equipmentDischargeStatsInfos = equipmentDischargeStatsInfos;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

  

    public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getStationDischargeElectricity() {
        return stationDischargeElectricity;
    }

    public void setStationDischargeElectricity(String stationDischargeElectricity) {
        this.stationDischargeElectricity = stationDischargeElectricity == null ? null : stationDischargeElectricity.trim();
    }

    public String getRecTime() {
        return recTime;
    }

    public void setRecTime(String recTime) {
        this.recTime = recTime == null ? null : recTime.trim();
    }

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
}