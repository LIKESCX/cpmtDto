package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

public class ConnectorDischargeStatsInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String connectorID;

    private String stationOrder;

    private String equipmentID;

    private String connectorDischargeElectricity;

   
    public String getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(String stationOrder) {
        this.stationOrder = stationOrder == null ? null : stationOrder.trim();
    }

  

    public String getConnectorDischargeElectricity() {
        return connectorDischargeElectricity;
    }

    public void setConnectorDischargeElectricity(String connectorDischargeElectricity) {
        this.connectorDischargeElectricity = connectorDischargeElectricity == null ? null : connectorDischargeElectricity.trim();
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

	@Override
	public String toString() {
		return "ConnectorDischargeStatsInfo [connectorID=" + connectorID + ", stationOrder=" + stationOrder
				+ ", equipmentID=" + equipmentID + ", connectorDischargeElectricity=" + connectorDischargeElectricity
				+ "]";
	}
	
	
}