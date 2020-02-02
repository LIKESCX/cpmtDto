package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

public class PublishAuditHis implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer policyHisId;

    private Integer processId;

    private String auditPerson;

    private Integer auditStatus;

    private Date auditDate;

    private String auditNote;

    public Integer getPolicyHisId() {
        return policyHisId;
    }

    public void setPolicyHisId(Integer policyHisId) {
        this.policyHisId = policyHisId;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
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
		return "PublishAuditHis [policyHisId=" + policyHisId + ", processId=" + processId + ", auditPerson="
				+ auditPerson + ", auditStatus=" + auditStatus + ", auditDate=" + auditDate + ", auditNote=" + auditNote
				+ "]";
	}
    
}