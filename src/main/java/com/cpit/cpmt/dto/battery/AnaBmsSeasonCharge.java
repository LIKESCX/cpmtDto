package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBmsSeasonCharge implements Serializable {

    private static final long serialVersionUID = 1L;
	/**
     * BMS编码
     */
    private String bmsCode;

    /**
     * 运营商唯一id
     */
    private String operatorId;

    /**
     * 设备接口编码
     */
    private String connectorId;

    /**
     * 对应的季度(以结束时间为准)
     */
    private String statisticalSeason;
	/**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * 充电站街道
     */
    private String stationStreet;

    /**
     * BMS版本
     */
    private String bmsVer;

    /**
     * 统计次数
     */
    private Integer statisticsTimes;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getStationStreet() {
        return stationStreet;
    }

    public void setStationStreet(String stationStreet) {
        this.stationStreet = stationStreet;
    }

    public String getBmsVer() {
        return bmsVer;
    }

    public void setBmsVer(String bmsVer) {
        this.bmsVer = bmsVer;
    }

    public Integer getStatisticsTimes() {
        return statisticsTimes;
    }

    public void setStatisticsTimes(Integer statisticsTimes) {
        this.statisticsTimes = statisticsTimes;
    }
    
	public String getBmsCode() {
		return bmsCode;
	}

	public void setBmsCode(String bmsCode) {
		this.bmsCode = bmsCode;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getStatisticalSeason() {
		return statisticalSeason;
	}

	public void setStatisticalSeason(String statisticalSeason) {
		this.statisticalSeason = statisticalSeason;
	}

	@Override
	public String toString() {
		return "AnaBmsSeasonCharge [bmsCode=" + bmsCode + ", operatorId=" + operatorId + ", connectorId=" + connectorId
				+ ", statisticalSeason=" + statisticalSeason + ", stationId=" + stationId + ", equipmentId="
				+ equipmentId + ", stationStreet=" + stationStreet + ", bmsVer=" + bmsVer + ", statisticsTimes="
				+ statisticsTimes + "]";
	}
}