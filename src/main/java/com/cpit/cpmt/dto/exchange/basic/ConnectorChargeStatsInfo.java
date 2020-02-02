package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

public class ConnectorChargeStatsInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cid;
	
	private String connectorID;

    private String stationOrder;

    private String equipmentID;

    private String connectorChargeElectricity;

    public String getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID == null ? null : connectorID.trim();
    }

    public String getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(String stationOrder) {
        this.stationOrder = stationOrder == null ? null : stationOrder.trim();
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID == null ? null : equipmentID.trim();
    }

    public String getConnectorChargeElectricity() {
        return connectorChargeElectricity;
    }

    public void setConnectorChargeElectricity(String connectorChargeElectricity) {
        this.connectorChargeElectricity = connectorChargeElectricity == null ? null : connectorChargeElectricity.trim();
    }

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "ConnectorChargeStatsInfo [cid=" + cid + ", connectorID=" + connectorID + ", stationOrder="
				+ stationOrder + ", equipmentID=" + equipmentID + ", connectorChargeElectricity="
				+ connectorChargeElectricity + "]";
	}
	
	
}