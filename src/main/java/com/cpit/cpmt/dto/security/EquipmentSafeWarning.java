package com.cpit.cpmt.dto.security;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * sec_equipment_safe_warning
 * @author 
 */
public class EquipmentSafeWarning implements Serializable {
    /**
     * 预警id
     */
    private Integer warningId;

    /**
     * 运营商id
     */
    private String operatorId;

    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 充电设施ID
     */
    private String equipmentId;

    /**
     * 运行风险评估结果
     */
    private String riskAssessmentResult;

    /**
     * 隐患排查情况
     */
    private String screeningResult;

    /**
     * 预警级别: 1:重大 2:较大 3:一般 4:低
     */
    private Integer warningLevel;

    /**
     * 短信接收人json信息
     */
    private String smsReceiver;

    /**
     * 预警时间
     */
    private Date warningTime;


    /**
     * 发送状态: 0:未发送 1:已发送
     */
    private Integer sendSmsStatus = 0;

    /**
     *  运营商名称
     */
    private String operatorName;

    /**
     *  充电站名称
     */
    private String stationName;

    /**
     *  区域编码
     */
    private String areaCode;

    /**
     *  街道编码
     */
    private String stationStreet;

    /**
     *  区域编码
     */
    private String areaName;

    /**
     *  街道编码
     */
    private String stationStreetName;

    /**
     *  设备名称
     */
    private String equipmentName;

    private Date startTime;

    private Date endTime;

    private Date sendTime;


    private static final long serialVersionUID = 1L;

    public Integer getWarningId() {
        return warningId;
    }

    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }

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

    public String getRiskAssessmentResult() {
        return riskAssessmentResult;
    }

    public void setRiskAssessmentResult(String riskAssessmentResult) {
        this.riskAssessmentResult = riskAssessmentResult;
    }

    public String getScreeningResult() {
        return screeningResult;
    }

    public void setScreeningResult(String screeningResult) {
        this.screeningResult = screeningResult;
    }

    public Integer getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
    }

    public String getSmsReceiver() {
        return smsReceiver;
    }

    public void setSmsReceiver(String smsReceiver) {
        this.smsReceiver = smsReceiver;
    }

    public Date getWarningTime() {
        return warningTime;
    }

    public void setWarningTime(Date warningTime) {
        this.warningTime = warningTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getStationStreet() {
        return stationStreet;
    }

    public void setStationStreet(String stationStreet) {
        this.stationStreet = stationStreet;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStationStreetName() {
        return stationStreetName;
    }

    public void setStationStreetName(String stationStreetName) {
        this.stationStreetName = stationStreetName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getSendSmsStatus() {
        return sendSmsStatus;
    }

    public void setSendSmsStatus(Integer sendSmsStatus) {
        this.sendSmsStatus = sendSmsStatus;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentSafeWarning that = (EquipmentSafeWarning) o;
        return Objects.equals(warningId, that.warningId) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(equipmentId, that.equipmentId) &&
                Objects.equals(riskAssessmentResult, that.riskAssessmentResult) &&
                Objects.equals(screeningResult, that.screeningResult) &&
                Objects.equals(warningLevel, that.warningLevel) &&
                Objects.equals(smsReceiver, that.smsReceiver) &&
                Objects.equals(warningTime, that.warningTime) &&
                Objects.equals(sendSmsStatus, that.sendSmsStatus) &&
                Objects.equals(operatorName, that.operatorName) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(stationStreet, that.stationStreet) &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(stationStreetName, that.stationStreetName) &&
                Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(sendTime, that.sendTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warningId, operatorId, stationId, equipmentId, riskAssessmentResult, screeningResult, warningLevel, smsReceiver, warningTime, sendSmsStatus, operatorName, stationName, areaCode, stationStreet, areaName, stationStreetName, equipmentName, startTime, endTime, sendTime);
    }

    @Override
    public String toString() {
        return "EquipmentSafeWarning{" +
                "warningId=" + warningId +
                ", operatorId='" + operatorId + '\'' +
                ", stationId='" + stationId + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", riskAssessmentResult='" + riskAssessmentResult + '\'' +
                ", screeningResult='" + screeningResult + '\'' +
                ", warningLevel=" + warningLevel +
                ", smsReceiver='" + smsReceiver + '\'' +
                ", warningTime=" + warningTime +
                ", sendSmsStatus=" + sendSmsStatus +
                ", operatorName='" + operatorName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", stationStreet='" + stationStreet + '\'' +
                ", areaName='" + areaName + '\'' +
                ", stationStreetName='" + stationStreetName + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", sendTime=" + sendTime +
                '}';
    }
}