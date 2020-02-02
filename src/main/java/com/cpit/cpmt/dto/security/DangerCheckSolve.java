package com.cpit.cpmt.dto.security;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DangerCheckSolve implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//1:特别重大I级2:重大II级3:较大III级 4:一般IV级
	public static final int DANGER_LEVEL_TEBIE = 1;
	public static final int DANGER_LEVEL_ZHONGDA = 2;
	public static final int DANGER_LEVEL_JIAODA = 3;
	public static final int DANGER_LEVEL_YIBAN = 4;
	
	//1未整改2申请整改3责令整改4无法整改5制定整改计划6上传整改结果7待审核8审核中9已整改10审核不通过
	public static final int DANGER_STATUS_NOCHECKSOLVE = 1;
	public static final int DANGER_STATUS_APPLY = 2;
	public static final int DANGER_STATUS_ORDER = 3;
	public static final int DANGER_STATUS_UNABLE = 4;
	public static final int DANGER_STATUS_DRAWPLAN= 5;
	public static final int DANGER_STATUS_UPLOADRESULT= 6;
	public static final int DANGER_STATUS_DAISHENHE = 7;
	public static final int DANGER_STATUS_SHENHEZHONG = 8;
	public static final int DANGER_STATUS_YIZHENGGAI = 9;
	public static final int DANGER_STATUS_SHENHEBUTONGGUO = 10;
	
	//是否警告：0：否  1：是
	public static final int IF_ALARM_NO = 0;
	public static final int IF_ALARM_YES = 1;
	
	//是否处罚：0：否  1：是
	public static final int IF_PUNISH_NO = 0;
	public static final int IF_PUNISH_YES = 1;
		
	private Integer dangerId;

    private String operatorId;

    private String operatorName;

    private String stationId;

    private String stationName;

    private String equipmentId;

    private String equipmentName;

    private String areaCode;

    private Integer dangerType;

    private String dangerDesc;

    private Integer dangerLevel;

    private Integer dangerStatus;

    private String dependArea;

    private String dependPerson;

    private String tradeArea;

    private String tradePerson;

    private String mainUnit;

    private String mainPerson;

    private String dutyPerson;

    private String dangerCommit;

    private Integer ifAlarm;

    private Integer ifPunish;

    private String punishAmount;

    private String dangerCheckPoint;

    private String sendPerson;

    private String sendCar;
    
    private String reportPerson;

    private String dealStep;

    private Date operateTime;

    private Date inTime;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime;
    
    private List areaList;
    
    private String auditPerson;
    
    private String auditNote;

    public Integer getDangerId() {
        return dangerId;
    }

    public void setDangerId(Integer dangerId) {
        this.dangerId = dangerId;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Integer getDangerType() {
        return dangerType;
    }

    public void setDangerType(Integer dangerType) {
        this.dangerType = dangerType;
    }

    public String getDangerDesc() {
        return dangerDesc;
    }

    public void setDangerDesc(String dangerDesc) {
        this.dangerDesc = dangerDesc == null ? null : dangerDesc.trim();
    }

    public Integer getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(Integer dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public Integer getDangerStatus() {
        return dangerStatus;
    }

    public void setDangerStatus(Integer dangerStatus) {
        this.dangerStatus = dangerStatus;
    }

    public String getDependArea() {
        return dependArea;
    }

    public void setDependArea(String dependArea) {
        this.dependArea = dependArea == null ? null : dependArea.trim();
    }

    public String getDependPerson() {
        return dependPerson;
    }

    public void setDependPerson(String dependPerson) {
        this.dependPerson = dependPerson == null ? null : dependPerson.trim();
    }

    public String getTradeArea() {
        return tradeArea;
    }

    public void setTradeArea(String tradeArea) {
        this.tradeArea = tradeArea == null ? null : tradeArea.trim();
    }

    public String getTradePerson() {
        return tradePerson;
    }

    public void setTradePerson(String tradePerson) {
        this.tradePerson = tradePerson == null ? null : tradePerson.trim();
    }

    public String getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit == null ? null : mainUnit.trim();
    }

    public String getMainPerson() {
        return mainPerson;
    }

    public void setMainPerson(String mainPerson) {
        this.mainPerson = mainPerson == null ? null : mainPerson.trim();
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson == null ? null : dutyPerson.trim();
    }

    public String getDangerCommit() {
        return dangerCommit;
    }

    public void setDangerCommit(String dangerCommit) {
        this.dangerCommit = dangerCommit == null ? null : dangerCommit.trim();
    }

    public Integer getIfAlarm() {
        return ifAlarm;
    }

    public void setIfAlarm(Integer ifAlarm) {
        this.ifAlarm = ifAlarm;
    }

    public Integer getIfPunish() {
        return ifPunish;
    }

    public void setIfPunish(Integer ifPunish) {
        this.ifPunish = ifPunish;
    }

    public String getPunishAmount() {
        return punishAmount;
    }

    public void setPunishAmount(String punishAmount) {
        this.punishAmount = punishAmount == null ? null : punishAmount.trim();
    }

    public String getDangerCheckPoint() {
        return dangerCheckPoint;
    }

    public void setDangerCheckPoint(String dangerCheckPoint) {
        this.dangerCheckPoint = dangerCheckPoint == null ? null : dangerCheckPoint.trim();
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson == null ? null : sendPerson.trim();
    }

    public String getSendCar() {
        return sendCar;
    }

    public void setSendCar(String sendCar) {
        this.sendCar = sendCar == null ? null : sendCar.trim();
    }

    public String getDealStep() {
        return dealStep;
    }

    public void setDealStep(String dealStep) {
        this.dealStep = dealStep == null ? null : dealStep.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
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

	public List getAreaList() {
		return areaList;
	}

	public void setAreaList(List areaList) {
		this.areaList = areaList;
	}
	
	public String getReportPerson() {
		return reportPerson;
	}

	public void setReportPerson(String reportPerson) {
		this.reportPerson = reportPerson;
	}
	
	public String getAuditPerson() {
		return auditPerson;
	}

	public void setAuditPerson(String auditPerson) {
		this.auditPerson = auditPerson;
	}

	public String getAuditNote() {
		return auditNote;
	}

	public void setAuditNote(String auditNote) {
		this.auditNote = auditNote;
	}

	@Override
	public String toString() {
		return "DangerCheckSolve [dangerId=" + dangerId + ", operatorId=" + operatorId + ", operatorName="
				+ operatorName + ", stationId=" + stationId + ", stationName=" + stationName + ", equipmentId="
				+ equipmentId + ", equipmentName=" + equipmentName + ", areaCode=" + areaCode + ", dangerType="
				+ dangerType + ", dangerDesc=" + dangerDesc + ", dangerLevel=" + dangerLevel + ", dangerStatus="
				+ dangerStatus + ", dependArea=" + dependArea + ", dependPerson=" + dependPerson + ", tradeArea="
				+ tradeArea + ", tradePerson=" + tradePerson + ", mainUnit=" + mainUnit + ", mainPerson=" + mainPerson
				+ ", dutyPerson=" + dutyPerson + ", dangerCommit=" + dangerCommit + ", ifAlarm=" + ifAlarm
				+ ", ifPunish=" + ifPunish + ", punishAmount=" + punishAmount + ", dangerCheckPoint=" + dangerCheckPoint
				+ ", sendPerson=" + sendPerson + ", sendCar=" + sendCar + ", reportPerson=" + reportPerson
				+ ", dealStep=" + dealStep + ", operateTime=" + operateTime + ", inTime=" + inTime + ", startTime="
				+ startTime + ", endTime=" + endTime + ", areaList=" + areaList + ", auditPerson=" + auditPerson
				+ ", auditNote=" + auditNote + "]";
	}
}