package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OperatorChangeHis implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static int OPERATOR_TYPE_ADD = 1;//新增
	
	public final static int OPERATOR_TYPE_UPDATE = 2;//修改

	private Integer changeId;

    private String operatorId;

    private String operatorName;

    private String operatorTel1;

    private String operatorTel2;

    private String operatorRegAddress;

    private String operatorNote;

    private String areaCode;

    private String streetName;

    private String legalPerson;

    private String legalPersonTel;

    private String legalPersonEmail;

    private Date foundDate;

    private String contactPerson;

    private String contactTel;

    private String contactEmail;

    private Integer regCapital;

    private Integer companySize;

    private Integer companyType;

    private Integer busStatus;

    private Date connectionTime;

    private Integer statusCd;

    private Integer acceptWay;

    private Date changeDate;
    
    private OperatorInfoExtend operatorInfoExtend;
    
    //操作人
    private String operatePerson;

    //操作类型 1：新增 2修改
    private Integer operateType;
    
    //操作渠道 1:地标，2：系统自动 3：新增  4：修改
    private Integer operateChannel;
    
    private Date startTime;
    
    private Date endTime;
    
    //可管区域
    private List areaList;

    public Integer getChangeId() {
        return changeId;
    }

    public void setChangeId(Integer changeId) {
        this.changeId = changeId;
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

    public String getOperatorTel1() {
        return operatorTel1;
    }

    public void setOperatorTel1(String operatorTel1) {
        this.operatorTel1 = operatorTel1 == null ? null : operatorTel1.trim();
    }

    public String getOperatorTel2() {
        return operatorTel2;
    }

    public void setOperatorTel2(String operatorTel2) {
        this.operatorTel2 = operatorTel2 == null ? null : operatorTel2.trim();
    }

    public String getOperatorRegAddress() {
        return operatorRegAddress;
    }

    public void setOperatorRegAddress(String operatorRegAddress) {
        this.operatorRegAddress = operatorRegAddress == null ? null : operatorRegAddress.trim();
    }

    public String getOperatorNote() {
        return operatorNote;
    }

    public void setOperatorNote(String operatorNote) {
        this.operatorNote = operatorNote == null ? null : operatorNote.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getLegalPersonTel() {
        return legalPersonTel;
    }

    public void setLegalPersonTel(String legalPersonTel) {
        this.legalPersonTel = legalPersonTel == null ? null : legalPersonTel.trim();
    }

    public String getLegalPersonEmail() {
        return legalPersonEmail;
    }

    public void setLegalPersonEmail(String legalPersonEmail) {
        this.legalPersonEmail = legalPersonEmail == null ? null : legalPersonEmail.trim();
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public Integer getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(Integer regCapital) {
        this.regCapital = regCapital;
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public Integer getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(Integer busStatus) {
        this.busStatus = busStatus;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public Integer getAcceptWay() {
        return acceptWay;
    }

    public void setAcceptWay(Integer acceptWay) {
        this.acceptWay = acceptWay;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

	public OperatorInfoExtend getOperatorInfoExtend() {
		return operatorInfoExtend;
	}

	public void setOperatorInfoExtend(OperatorInfoExtend operatorInfoExtend) {
		this.operatorInfoExtend = operatorInfoExtend;
	}

	public String getOperatePerson() {
		return operatePerson;
	}

	public void setOperatePerson(String operatePerson) {
		this.operatePerson = operatePerson;
	}

	public Integer getOperateType() {
		return operateType;
	}

	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}

	public Integer getOperateChannel() {
		return operateChannel;
	}

	public void setOperateChannel(Integer operateChannel) {
		this.operateChannel = operateChannel;
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

	@Override
	public String toString() {
		return "OperatorChangeHis [changeId=" + changeId + ", operatorId=" + operatorId + ", operatorName="
				+ operatorName + ", operatorTel1=" + operatorTel1 + ", operatorTel2=" + operatorTel2
				+ ", operatorRegAddress=" + operatorRegAddress + ", operatorNote=" + operatorNote + ", areaCode="
				+ areaCode + ", streetName=" + streetName + ", legalPerson=" + legalPerson + ", legalPersonTel="
				+ legalPersonTel + ", legalPersonEmail=" + legalPersonEmail + ", foundDate=" + foundDate
				+ ", contactPerson=" + contactPerson + ", contactTel=" + contactTel + ", contactEmail=" + contactEmail
				+ ", regCapital=" + regCapital + ", companySize=" + companySize + ", companyType=" + companyType
				+ ", busStatus=" + busStatus + ", connectionTime=" + connectionTime + ", statusCd=" + statusCd
				+ ", acceptWay=" + acceptWay + ", changeDate=" + changeDate + ", operatorInfoExtend="
				+ operatorInfoExtend + "]";
	}
    
}