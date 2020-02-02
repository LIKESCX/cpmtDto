package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

/**
 * @author 
 */
public class UncolloectInfo implements Serializable {
    /**
     * 主键 id
     */
    private Integer id;

    /**
     * 充电站ID
     */
    private String stationID;

    /**
     * 运营商ID
     */
    private String operatorID;

    /**
     * 设备编码
     */
    private String equipmentID;

    /**
     * 补采接口名称
     */
    private String infName;

    /**
     * 接口版本号
     */
    private String versionNum;

    /**
     * 时间戳 格式为yyyyMMddHHmmss
     */
    private String timeStamp;

    /**
     * 补采原因
     */
    private String reason;

    /**
     * 是否已补采 0 未补采 1已补采
     */
    private Integer ifColloected;

    /**
     * 是否已补采成功  0 补采成功 1补采失败
     */
    private Integer ifSuccess;

    /**
     * 补采条数
     */
    private Integer sumCount;

    /**
     * 补采时间 格式为yyyyMMddHHmmss
     */
    private Integer colletcedTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationId) {
        this.stationID = stationId;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorId) {
        this.operatorID = operatorId;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentId) {
        this.equipmentID = equipmentId;
    }

    public String getInfName() {
        return infName;
    }

    public void setInfName(String infName) {
        this.infName = infName;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getIfColloected() {
        return ifColloected;
    }

    public void setIfColloected(Integer ifColloected) {
        this.ifColloected = ifColloected;
    }

    public Integer getIfSuccess() {
        return ifSuccess;
    }

    public void setIfSuccess(Integer ifSuccess) {
        this.ifSuccess = ifSuccess;
    }

    public Integer getSumCount() {
        return sumCount;
    }

    public void setSumCount(Integer sumCount) {
        this.sumCount = sumCount;
    }

    public Integer getColletcedTime() {
        return colletcedTime;
    }

    public void setColletcedTime(Integer colletcedTime) {
        this.colletcedTime = colletcedTime;
    }

	@Override
	public String toString() {
		return "UncolloectInfo [id=" + id + ", stationID=" + stationID + ", operatorID=" + operatorID + ", equipmentID="
				+ equipmentID + ", infName=" + infName + ", versionNum=" + versionNum + ", timeStamp=" + timeStamp
				+ ", reason=" + reason + ", ifColloected=" + ifColloected + ", ifSuccess=" + ifSuccess + ", sumCount="
				+ sumCount + ", colletcedTime=" + colletcedTime + "]";
	}
}