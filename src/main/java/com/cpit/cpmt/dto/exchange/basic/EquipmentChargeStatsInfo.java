package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.List;

public class EquipmentChargeStatsInfo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String equipmentID;

   
    private String stationOrder;
    
    private String eid;

    private String equipmentChargeElectricity;
    private List<ConnectorChargeStatsInfo> connectorChargeStatsInfos;
    public List<ConnectorChargeStatsInfo> getConnectorChargeStatsInfos() {
		return connectorChargeStatsInfos;
	}

	public void setConnectorChargeStatsInfos(List<ConnectorChargeStatsInfo> connectorChargeStatsInfos) {
		this.connectorChargeStatsInfos = connectorChargeStatsInfos;
	}

	public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID == null ? null : equipmentID.trim();
    }

    public String getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(String stationOrder) {
        this.stationOrder = stationOrder == null ? null : stationOrder.trim();
    }

    public String getEquipmentChargeElectricity() {
        return equipmentChargeElectricity;
    }

    public void setEquipmentChargeElectricity(String equipmentChargeElectricity) {
        this.equipmentChargeElectricity = equipmentChargeElectricity == null ? null : equipmentChargeElectricity.trim();
    }

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}
}