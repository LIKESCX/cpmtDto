package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class LoginSession implements Serializable{
	private static final long serialVersionUID = 1L;

	private String sessionId;
	 
	private String userLoginName;
	
	private String userName;
	
	private String ip;
	 
	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
	private Date loginTime;
	 
	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date logoutTime;
	
	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startTime; //查询条件用,for loginTime

	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endTime; //查询条件用，for loginTime
	
	public LoginSession(){
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}



	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((sessionId == null) ? 0 : sessionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginSession other = (LoginSession) obj;
		if (sessionId == null) {
			if (other.sessionId != null)
				return false;
		} else if (!sessionId.equals(other.sessionId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "LoginSession [sessionId=" + sessionId + ", userLoginName=" + userLoginName + ", userName=" + userName
				+ ", ip=" + ip + ", loginTime=" + loginTime + ", logoutTime=" + logoutTime + "]";
	}	
	 
}
 
