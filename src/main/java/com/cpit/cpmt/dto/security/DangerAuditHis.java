package com.cpit.cpmt.dto.security;

import java.io.Serializable;
import java.util.Date;

public class DangerAuditHis implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//1：审核通过 2：审核不通过
	public static final int STATUS_TONGGUO = 1;
	public static final int STATUS_BUTONGGUO = 2;

	private Integer dangerHisId;

    private Integer dangerId;

    private String auditPerson;

    private Integer auditStatus;

    private Date auditDate;

    private String auditNote;

    public Integer getDangerHisId() {
        return dangerHisId;
    }

    public void setDangerHisId(Integer dangerHisId) {
        this.dangerHisId = dangerHisId;
    }

    public Integer getDangerId() {
        return dangerId;
    }

    public void setDangerId(Integer dangerId) {
        this.dangerId = dangerId;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
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

	@Override
	public String toString() {
		return "DangerAuditHis [dangerHisId=" + dangerHisId + ", dangerId=" + dangerId + ", auditPerson=" + auditPerson
				+ ", auditStatus=" + auditStatus + ", auditDate=" + auditDate + ", auditNote=" + auditNote + "]";
	}
}