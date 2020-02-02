package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

public class InterfaceAuditHis implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer hisId;

    private Integer faceId;

    private String auditPerson;

    private Integer operateType;

    private Integer auditStatus;

    private Date auditDate;

    private String auditNote;

    public Integer getHisId() {
        return hisId;
    }

    public void setHisId(Integer hisId) {
        this.hisId = hisId;
    }

    public Integer getFaceId() {
        return faceId;
    }

    public void setFaceId(Integer faceId) {
        this.faceId = faceId;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote == null ? null : auditNote.trim();
    }
}