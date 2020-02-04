package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBmsDayCharge implements Serializable {
    
	private static final long serialVersionUID = 1L;
    /**
     * BMS编码
     */
    private String bmsCode;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDay;

	/**
     * 运营商唯一id
     */
    private String operatorId;

    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * 设备接口编码
     */
    private String connectorId;

    /**
     * BMS版本
     */
    private String bmsVer;

    /**
     * 统计次数
     */
    private Integer statisticsTimes;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

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

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
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

    public String getStatisticalDay() {
        return statisticalDay;
    }

    public void setStatisticalDay(String statisticalDay) {
        this.statisticalDay = statisticalDay;
    }

	@Override
	public String toString() {
		return "AnaBmsDayCharge [bmsCode=" + bmsCode + ", statisticalDay=" + statisticalDay + ", operatorId="
				+ operatorId + ", stationId=" + stationId + ", equipmentId=" + equipmentId + ", connectorId="
				+ connectorId + ", bmsVer=" + bmsVer + ", statisticsTimes=" + statisticsTimes + "]";
	}
   
}