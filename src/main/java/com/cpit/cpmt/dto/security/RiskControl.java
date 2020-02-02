package com.cpit.cpmt.dto.security;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.system.Area;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class RiskControl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer riskId;

    private String operatorId;

    private String operatorName;

    private String stationId;

    private String stationStreet;

    private String stationName;

    private String equipmentId;

    private String equipmentName;

    private Integer alarmLevel;

    private String alarmCode;

    private Integer alarmType;

    private String alarmDesc;

    @JsonFormat(pattern = TimeConvertor.FORMAT_MINUS_24HOUR, timezone = "GMT+8")
    private Date alarmTime;

    private Integer alarmStatus;

    private Integer dealResult;

    private String dealStep;

    @JsonFormat(pattern = TimeConvertor.FORMAT_MINUS_24HOUR, timezone = "GMT+8")
    private Date dealTime;

    private String dealPerson;

    private Integer affirm;

    @JsonFormat(pattern = TimeConvertor.FORMAT_MINUS_24HOUR, timezone = "GMT+8")
    private Date affirmTime;

    private String affirmPerson;

    private Date inTime;

    @JsonFormat(pattern = TimeConvertor.FORMAT_MINUS_24HOUR, timezone = "GMT+8")
    private Date startTime;

    @JsonFormat(pattern = TimeConvertor.FORMAT_MINUS_24HOUR, timezone = "GMT+8")
    private Date endTime;

    private String areaCode;

    private List<Area> areaList;

    private String equipmentFaceName;

    private String equipmentFaceId;

    private String account;

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode == null ? null : alarmCode.trim();
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc == null ? null : alarmDesc.trim();
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getDealResult() {
        return dealResult;
    }

    public void setDealResult(Integer dealResult) {
        this.dealResult = dealResult;
    }

    public String getDealStep() {
        return dealStep;
    }

    public void setDealStep(String dealStep) {
        this.dealStep = dealStep == null ? null : dealStep.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
    }

    public Integer getAffirm() {
        return affirm;
    }

    public void setAffirm(Integer affirm) {
        this.affirm = affirm;
    }

    public Date getAffirmTime() {
        return affirmTime;
    }

    public void setAffirmTime(Date affirmTime) {
        this.affirmTime = affirmTime;
    }

    public String getAffirmPerson() {
        return affirmPerson;
    }

    public void setAffirmPerson(String affirmPerson) {
        this.affirmPerson = affirmPerson == null ? null : affirmPerson.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    public String getEquipmentFaceName() {
        return equipmentFaceName;
    }

    public void setEquipmentFaceName(String equipmentFaceName) {
        this.equipmentFaceName = equipmentFaceName;
    }

    public String getEquipmentFaceId() {
        return equipmentFaceId;
    }

    public void setEquipmentFaceId(String equipmentFaceId) {
        this.equipmentFaceId = equipmentFaceId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getStationStreet() {
        return stationStreet;
    }

    public void setStationStreet(String stationStreet) {
        this.stationStreet = stationStreet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiskControl that = (RiskControl) o;
        return Objects.equals(riskId, that.riskId) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(operatorName, that.operatorName) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(stationStreet, that.stationStreet) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(equipmentId, that.equipmentId) &&
                Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(alarmLevel, that.alarmLevel) &&
                Objects.equals(alarmCode, that.alarmCode) &&
                Objects.equals(alarmType, that.alarmType) &&
                Objects.equals(alarmDesc, that.alarmDesc) &&
                Objects.equals(alarmTime, that.alarmTime) &&
                Objects.equals(alarmStatus, that.alarmStatus) &&
                Objects.equals(dealResult, that.dealResult) &&
                Objects.equals(dealStep, that.dealStep) &&
                Objects.equals(dealTime, that.dealTime) &&
                Objects.equals(dealPerson, that.dealPerson) &&
                Objects.equals(affirm, that.affirm) &&
                Objects.equals(affirmTime, that.affirmTime) &&
                Objects.equals(affirmPerson, that.affirmPerson) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(areaList, that.areaList) &&
                Objects.equals(equipmentFaceName, that.equipmentFaceName) &&
                Objects.equals(equipmentFaceId, that.equipmentFaceId) &&
                Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskId, operatorId, operatorName, stationId, stationStreet, stationName, equipmentId, equipmentName, alarmLevel, alarmCode, alarmType, alarmDesc, alarmTime, alarmStatus, dealResult, dealStep, dealTime, dealPerson, affirm, affirmTime, affirmPerson, inTime, startTime, endTime, areaCode, areaList, equipmentFaceName, equipmentFaceId, account);
    }

    @Override
    public String toString() {
        return "RiskControl{" +
                "riskId=" + riskId +
                ", operatorId='" + operatorId + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", stationId='" + stationId + '\'' +
                ", stationStreet='" + stationStreet + '\'' +
                ", stationName='" + stationName + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", alarmLevel=" + alarmLevel +
                ", alarmCode='" + alarmCode + '\'' +
                ", alarmType=" + alarmType +
                ", alarmDesc='" + alarmDesc + '\'' +
                ", alarmTime=" + alarmTime +
                ", alarmStatus=" + alarmStatus +
                ", dealResult=" + dealResult +
                ", dealStep='" + dealStep + '\'' +
                ", dealTime=" + dealTime +
                ", dealPerson='" + dealPerson + '\'' +
                ", affirm=" + affirm +
                ", affirmTime=" + affirmTime +
                ", affirmPerson='" + affirmPerson + '\'' +
                ", inTime=" + inTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", areaCode='" + areaCode + '\'' +
                ", areaList=" + areaList +
                ", equipmentFaceName='" + equipmentFaceName + '\'' +
                ", equipmentFaceId='" + equipmentFaceId + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

}