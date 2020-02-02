package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StationChargeStatsInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String sid;
	
	@JsonProperty
    private String operatorID;

 

	private String stationID;

  

	private String startTime;

    private String endTime;

    private String stationChargeElectricity;

    private String recTime;
    
    private String inTime;
    
    public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	private List<EquipmentChargeStatsInfo> equipmentChargeStatsInfos;

    public List<EquipmentChargeStatsInfo> getEquipmentChargeStatsInfos() {
		return equipmentChargeStatsInfos;
	}

	public void setEquipmentChargeStatsInfos(List<EquipmentChargeStatsInfo> equipmentChargeStatsInfos) {
		this.equipmentChargeStatsInfos = equipmentChargeStatsInfos;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStationID() {
  		return stationID;
  	}

  	public void setStationID(String stationID) {
  		this.stationID = stationID;
  	}
  	@JsonIgnore
    public String getOperatorID() {
 		return operatorID;
 	}

 	public void setOperatorID(String operatorID) {
 		this.operatorID = operatorID;
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

    public String getStationChargeElectricity() {
        return stationChargeElectricity;
    }

    public void setStationChargeElectricity(String stationChargeElectricity) {
        this.stationChargeElectricity = stationChargeElectricity == null ? null : stationChargeElectricity.trim();
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

	@Override
	public String toString() {
		return "StationChargeStatsInfo [id=" + id + ", operatorID=" + operatorID + ", stationID=" + stationID
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", stationChargeElectricity="
				+ stationChargeElectricity + ", recTime=" + recTime + ", inTime=" + inTime
				+ ", equipmentChargeStatsInfos=" + equipmentChargeStatsInfos + "]";
	}
}