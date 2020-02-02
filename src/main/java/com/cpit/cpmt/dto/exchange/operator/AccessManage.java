package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AccessManage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public final static int IFACCESS_OFF = 0;//关
	public final static int IFACCESS_ON = 1;//开
	
	//运营商id
    private String operatorID;
    
    //运营商名称
    private String operatorName;

    //区域编码
    private String areaCode;

    //秘钥
    private String secretKey;

    //token地址
    private String secretKeyAddress;

    //鉴权方式
    private Integer authenWay;

    //是否接入
    private Integer ifAccess;//1是0否

    //安全证书地址
    private String secretCertificate;
    
    //安全证书名称
    private String secretCertName;
    
    //操作日期
    private Date operaDate;
    
    //可管区域
    private List areaList;
    
    private String operatorKey;

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID == null ? null : operatorID.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public String getSecretKeyAddress() {
        return secretKeyAddress;
    }

    public void setSecretKeyAddress(String secretKeyAddress) {
        this.secretKeyAddress = secretKeyAddress == null ? null : secretKeyAddress.trim();
    }

    public Integer getAuthenWay() {
        return authenWay;
    }

    public void setAuthenWay(Integer authenWay) {
        this.authenWay = authenWay;
    }

    public Integer getIfAccess() {
        return ifAccess;
    }

    public void setIfAccess(Integer ifAccess) {
        this.ifAccess = ifAccess;
    }

	public String getSecretCertificate() {
		return secretCertificate;
	}

	public void setSecretCertificate(String secretCertificate) {
		this.secretCertificate = secretCertificate;
	}

	public String getSecretCertName() {
		return secretCertName;
	}

	public void setSecretCertName(String secretCertName) {
		this.secretCertName = secretCertName;
	}

	public Date getOperaDate() {
		return operaDate;
	}

	public void setOperaDate(Date operaDate) {
		this.operaDate = operaDate;
	}
	
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	public List getAreaList() {
		return areaList;
	}

	public void setAreaList(List areaList) {
		this.areaList = areaList;
	}
	
	public String getOperatorKey() {
		return operatorKey;
	}

	public void setOperatorKey(String operatorKey) {
		this.operatorKey = operatorKey;
	}

	@Override
	public String toString() {
		return "AccessManage [operatorID=" + operatorID + ", operatorName=" + operatorName + ", areaCode=" + areaCode
				+ ", secretKey=" + secretKey + ", secretKeyAddress=" + secretKeyAddress + ", authenWay=" + authenWay
				+ ", ifAccess=" + ifAccess + ", secretCertificate=" + secretCertificate + ", secretCertName="
				+ secretCertName + ", operaDate=" + operaDate + ", areaList=" + areaList + ", operatorKey="
				+ operatorKey + "]";
	}

}