package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.List;

public class EquipmentDischargeStatsInfo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String equipmentID;

    private String stationOrder;
    private String eid;

    private String equipmentDischargeElectricity;
    private List<ConnectorDischargeStatsInfo> connectorDischargeStatsInfos;
 

    public List<ConnectorDischargeStatsInfo> getConnectorDischargeStatsInfos() {
		return connectorDischargeStatsInfos;
	}

	public void setConnectorDischargeStatsInfos(List<ConnectorDischargeStatsInfo> connectorDischargeStatsInfos) {
		this.connectorDischargeStatsInfos = connectorDischargeStatsInfos;
	}

	public String getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(String equipmentID) {
		this.equipmentID = equipmentID;
	}

	public String getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(String stationOrder) {
        this.stationOrder = stationOrder == null ? null : stationOrder.trim();
    }

    public String getEquipmentDischargeElectricity() {
        return equipmentDischargeElectricity;
    }

    public void setEquipmentDischargeElectricity(String equipmentDischargeElectricity) {
        this.equipmentDischargeElectricity = equipmentDischargeElectricity == null ? null : equipmentDischargeElectricity.trim();
    }

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "EquipmentDischargeStatsInfo [equipmentID=" + equipmentID + ", stationOrder=" + stationOrder
				+ ", equipmentDischargeElectricity=" + equipmentDischargeElectricity + "]";
	}
    
    
}