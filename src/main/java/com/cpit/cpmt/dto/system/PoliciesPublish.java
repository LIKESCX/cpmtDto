package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class PoliciesPublish implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int STATUS_CD_WEIFABU = 1;//未申请发布
	public final static int STATUS_CD_IN_AUDIT = 2;//申请中
	public final static int STATUS_CD_AUDIT_PASS = 3;//审核通过
	public final static int STATUS_CD_AUDIT_REFUSE= 4;//审核不通过
	
	private Integer policyId;

    private String policyName;

    private Integer policyType;

    private Integer policyLevel;

    private Integer proCapital;

    private Integer cityCode;

    private Integer statusCd;

    private String auditNote;

    private String policyPerson;

    private Date inTime;

    private Date publishTime;

    private String policyContent;
    
    private Date statusDate;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime;
    
    private String provinceName;
    
    private String cityName;
    
    private String auditPerson;
    
    private Integer acceptWay;

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName == null ? null : policyName.trim();
    }

    public Integer getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Integer policyType) {
        this.policyType = policyType;
    }

    public Integer getPolicyLevel() {
        return policyLevel;
    }

    public void setPolicyLevel(Integer policyLevel) {
        this.policyLevel = policyLevel;
    }

    public Integer getProCapital() {
        return proCapital;
    }

    public void setProCapital(Integer proCapital) {
        this.proCapital = proCapital;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote == null ? null : auditNote.trim();
    }

    public String getPolicyPerson() {
        return policyPerson;
    }

    public void setPolicyPerson(String policyPerson) {
        this.policyPerson = policyPerson == null ? null : policyPerson.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent == null ? null : policyContent.trim();
    }
    
	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
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
	
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getAuditPerson() {
		return auditPerson;
	}

	public void setAuditPerson(String auditPerson) {
		this.auditPerson = auditPerson;
	}
	
	public Integer getAcceptWay() {
		return acceptWay;
	}

	public void setAcceptWay(Integer acceptWay) {
		this.acceptWay = acceptWay;
	}

	@Override
	public String toString() {
		return "PoliciesPublish [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", policyLevel=" + policyLevel + ", proCapital=" + proCapital + ", cityCode=" + cityCode
				+ ", statusCd=" + statusCd + ", auditNote=" + auditNote + ", policyPerson=" + policyPerson + ", inTime="
				+ inTime + ", publishTime=" + publishTime + ", policyContent=" + policyContent + ", statusDate="
				+ statusDate + ", startTime=" + startTime + ", endTime=" + endTime + ", provinceName=" + provinceName
				+ ", cityName=" + cityName + ", auditPerson=" + auditPerson + ", acceptWay=" + acceptWay + "]";
	}

}