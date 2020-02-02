package com.cpit.cpmt.dto.security;

import java.io.Serializable;

public class MessageRemind implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer remindId;

    private Integer remindLevel;

    private String areaCode;

    private String remindName;

    private String phoneNumber;
    
    private String areaName;
    
    private Integer ifReceive;

    public Integer getRemindId() {
        return remindId;
    }

    public void setRemindId(Integer remindId) {
        this.remindId = remindId;
    }

    public Integer getRemindLevel() {
        return remindLevel;
    }

    public void setRemindLevel(Integer remindLevel) {
        this.remindLevel = remindLevel;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getRemindName() {
        return remindName;
    }

    public void setRemindName(String remindName) {
        this.remindName = remindName == null ? null : remindName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }
    
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getIfReceive() {
		return ifReceive;
	}

	public void setIfReceive(Integer ifReceive) {
		this.ifReceive = ifReceive;
	}

	@Override
	public String toString() {
		return "MessageRemind [remindId=" + remindId + ", remindLevel=" + remindLevel + ", areaCode=" + areaCode
				+ ", remindName=" + remindName + ", phoneNumber=" + phoneNumber + ", areaName=" + areaName
				+ ", ifReceive=" + ifReceive + "]";
	}

}