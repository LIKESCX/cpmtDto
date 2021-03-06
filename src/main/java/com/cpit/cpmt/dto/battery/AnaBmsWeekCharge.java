package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBmsWeekCharge implements Serializable {
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
     * 对应的日期所在的周日(以结束时间为准)
     */
    private String statisticalWeek;
    
	/**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

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

	public String getStatisticalWeek() {
		return statisticalWeek;
	}

	public void setStatisticalWeek(String statisticalWeek) {
		this.statisticalWeek = statisticalWeek;
	}
	

	@Override
	public String toString() {
		return "AnaBmsWeekCharge [bmsCode=" + bmsCode + ", operatorId=" + operatorId + ", connectorId=" + connectorId
				+ ", statisticalWeek=" + statisticalWeek + ", stationId=" + stationId + ", equipmentId=" + equipmentId
				+ ", bmsVer=" + bmsVer + ", statisticsTimes=" + statisticsTimes + "]";
	}
}