package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InterfacePublish implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static int STATUS_CD_WEIFABU = 1;//未申请发布
	public final static int STATUS_CD_IN_AUDIT = 2;//申请中
	public final static int STATUS_CD_AUDIT_PASS = 3;//审核通过
	public final static int STATUS_CD_AUDIT_REFUSE= 4;//审核不通过

	private Integer faceId;

    private String interfaceName;

    private String interfaceAddress;

    private String versionNum;

    private Integer statusCd;

    private Date inTime;

    private Date publishTime;

    private Date statusDate;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime;
    
    private String auditPerson;

    public Integer getFaceId() {
        return faceId;
    }

    public void setFaceId(Integer faceId) {
        this.faceId = faceId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress == null ? null : interfaceAddress.trim();
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    public Integer getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
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
	
	public String getAuditPerson() {
		return auditPerson;
	}

	public void setAuditPerson(String auditPerson) {
		this.auditPerson = auditPerson;
	}

	@Override
	public String toString() {
		return "InterfacePublish [faceId=" + faceId + ", interfaceName=" + interfaceName + ", interfaceAddress="
				+ interfaceAddress + ", versionNum=" + versionNum + ", statusCd=" + statusCd + ", inTime=" + inTime
				+ ", publishTime=" + publishTime + ", statusDate=" + statusDate + "]";
	}
    
}