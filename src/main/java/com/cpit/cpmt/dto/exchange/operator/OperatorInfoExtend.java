package com.cpit.cpmt.dto.exchange.operator;

import java.util.Date;
import java.util.List;

import com.cpit.cpmt.dto.exchange.basic.OperatorInfo;

public class OperatorInfoExtend extends OperatorInfo {

	private static final long serialVersionUID = 1L;
	
	//运营商状态
	public final static int STATUS_CD_TINGYUN = 0;//停运
	public final static int STATUS_CD_HUOYUE = 1;//活跃
	public final static int STATUS_CD_AUDIT_FAIL = 2;//审核不通过
	public final static int STATUS_CD_DAISHENHE = 3;//待审核

	
	//运营商来源
	public final static int ACCEPT_WAY_REGISTER = 1;//注册
	public final static int ACCEPT_WAY_ADMIN_ADD = 2;//管理员添加
	
	//监管人员
	public static final int TYPE_MANGER = 2;

	//区域编码
	private String areaCode;
	
	//街道
	private String streetName;

	//法定代表人
    private String legalPerson;

    //法定代表人电话
    private String legalPersonTel;

    //法定代表人邮件
    private String legalPersonEmail;

    //成立日期
    private Date foundDate;

    //联系人
    private String contactPerson;

    //联系人电话
    private String contactTel;

    //联系人邮件
    private String contactEmail;

    //注册资本
    private Integer regCapital;

    //公司规模
    private Integer companySize;

    //企业类型
    private Integer companyType;

    //经营状态:待定
    private Integer busStatus;

    //运营商录入时间
    private Date connectionTime;

    //运营商状态:0停运,1活跃,2审核不通过
    private Integer statusCd;

    //运营商来源:1注册2管理员添加
    private Integer acceptWay;
    
    private Integer stationCount;
    
    private Integer equipmentCount;
    
    //审核意见
    private String auditNote;
    
    //审核时间
    private Date auditDate;
    
    //区域名称
    private String areaName;
    
    //开始日期
    private String startTime;
    
    //总充电量
    private String totalElectric;
    
    //装机功率
    private String totalPower;
    
    //可管区域
    private List areaList;
    
    //操作人
    private String operatePerson;

    //操作类型 1：新增 2修改
    private String operateType;
    
    //操作渠道 1:地标，2：系统自动 3：新增  4：修改
    private Integer operateChannel;
    
    //运营商秘钥
    private String secretKey;
    
    private List operatorList;
    
    private Integer userType;
    
    //总充电桩
    private String totalEquipment;
    
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
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
    
	public Integer getStationCount() {
		return stationCount;
	}

	public void setStationCount(Integer stationCount) {
		this.stationCount = stationCount;
	}

	public Integer getEquipmentCount() {
		return equipmentCount;
	}

	public void setEquipmentCount(Integer equipmentCount) {
		this.equipmentCount = equipmentCount;
	}
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAuditNote() {
		return auditNote;
	}

	public void setAuditNote(String auditNote) {
		this.auditNote = auditNote;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTotalElectric() {
		return totalElectric;
	}

	public void setTotalElectric(String totalElectric) {
		this.totalElectric = totalElectric;
	}

	public String getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(String totalPower) {
		this.totalPower = totalPower;
	}
	
	public List getAreaList() {
		return areaList;
	}

	public void setAreaList(List areaList) {
		this.areaList = areaList;
	}
	
	public String getOperatePerson() {
		return operatePerson;
	}

	public void setOperatePerson(String operatePerson) {
		this.operatePerson = operatePerson;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	
	public Integer getOperateChannel() {
		return operateChannel;
	}

	public void setOperateChannel(Integer operatorChannel) {
		this.operateChannel = operatorChannel;
	}
	
	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	public List getOperatorList() {
		return operatorList;
	}

	public void setOperatorList(List operatorList) {
		this.operatorList = operatorList;
	}
	
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	public String getTotalEquipment() {
		return totalEquipment;
	}

	public void setTotalEquipment(String totalEquipment) {
		this.totalEquipment = totalEquipment;
	}

	@Override
	public String toString() {
		return "OperatorInfoExtend [areaCode=" + areaCode + ", streetName=" + streetName + ", legalPerson="
				+ legalPerson + ", legalPersonTel=" + legalPersonTel + ", legalPersonEmail=" + legalPersonEmail
				+ ", foundDate=" + foundDate + ", contactPerson=" + contactPerson + ", contactTel=" + contactTel
				+ ", contactEmail=" + contactEmail + ", regCapital=" + regCapital + ", companySize=" + companySize
				+ ", companyType=" + companyType + ", busStatus=" + busStatus + ", connectionTime=" + connectionTime
				+ ", statusCd=" + statusCd + ", acceptWay=" + acceptWay + ", stationCount=" + stationCount
				+ ", equipmentCount=" + equipmentCount + ", auditNote=" + auditNote + ", auditDate=" + auditDate
				+ ", areaName=" + areaName + ", startTime=" + startTime + ", totalElectric=" + totalElectric
				+ ", totalPower=" + totalPower + ", areaList=" + areaList + ", operatePerson=" + operatePerson
				+ ", operateType=" + operateType + ", operateChannel=" + operateChannel + ", secretKey=" + secretKey
				+ ", operatorList=" + operatorList + ", userType=" + userType + ", totalEquipment=" + totalEquipment
				+ "]";
	}

}