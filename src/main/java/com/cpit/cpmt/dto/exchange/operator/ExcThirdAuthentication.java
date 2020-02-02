package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpit.common.CustomDateTimeSerializer;
import com.cpit.common.DeserializeDateTime;
import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
/**
 * (交互接口权限控制)鉴权信息表-->有可能作为参数配置表使用
 * @author zcp
 *
 */
public class ExcThirdAuthentication implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 主键唯一标识
	 */
	private Integer authId;
	/**
	 * ip
	 */
    private String thirdIp;
	/**
	 * 端口
	 */
    private String thirdPort;
	/**
	 * 秘钥
	 */
    private String secretKey;
	/**
	 * 证书路径
	 */
    private String secretCertificate;
	/**
	 * 鉴权方式：0.http 1.https
	 */
    private Byte authMethod;
	/**
	 * 描述
	 */
    private String authDesc;
	/**
	 * 最新跟新时间
	 */
    private Date uptdate;
	/**
	 * 是否可用1，可用0，不可用
	 */  
    private Byte statusCd;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startDate;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endDate;
    
	/**
	 * 权限接口列表
	 */
    private List<ExcThirdInteractive> exInteractionList;
    /**
     * 权限接口id
     */
    private List<Integer> interFaceList;
    
    
    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getThirdIp() {
        return thirdIp;
    }

    public void setThirdIp(String thirdIp) {
        this.thirdIp = thirdIp == null ? null : thirdIp.trim();
    }

    public String getThirdPort() {
        return thirdPort;
    }

    public void setThirdPort(String thirdPort) {
        this.thirdPort = thirdPort == null ? null : thirdPort.trim();
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public String getSecretCertificate() {
        return secretCertificate;
    }

    public void setSecretCertificate(String secretCertificate) {
        this.secretCertificate = secretCertificate == null ? null : secretCertificate.trim();
    }

    public Byte getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(Byte authMethod) {
        this.authMethod = authMethod;
    }

    public String getAuthDesc() {
        return authDesc;
    }

    public void setAuthDesc(String authDesc) {
        this.authDesc = authDesc == null ? null : authDesc.trim();
    }

    public Date getUptdate() {
        return uptdate;
    }

    public void setUptdate(Date uptdate) {
        this.uptdate = uptdate;
    }

	public List<ExcThirdInteractive> getExInteractionList() {
		return exInteractionList;
	}

	public void setExInteractionList(List<ExcThirdInteractive> exInteractionList) {
		this.exInteractionList = exInteractionList;
	}

	public List<Integer> getInterFaceList() {
		return interFaceList;
	}

	public void setInterFaceList(List<Integer> interFaceList) {
		this.interFaceList = interFaceList;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Byte getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(Byte statusCd) {
		this.statusCd = statusCd;
	}

	
    
}