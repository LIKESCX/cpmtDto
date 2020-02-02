package com.cpit.cpmt.dto.message;

import java.io.Serializable;
import java.util.Date;

public class ExcMessage implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int TYPE_CHECK_CODE = 1;  //短信验证码
	public static final int TYPE_CHECK_OPERATOR = 2; //运营商审核
    public static final int TYPE_CHECK_ESW = 3; //设备安全预警
    public static final int TYPE_STATION_ANNOUNCE = 4; //充电站安全运行情况通报
    public static final int TYPE_STA_RISK = 5; //充电站风险通知
    public static final int TYPE_ALARM_ANNOUNCE = 6; //告警级别在2或3时，通过短信推送给市和区发改委。


	//短信id
	private Integer smsId;

	//手机号码
    private String phoneNumber;

    //验证码
    private String checkCode;

    //短信内容
    private String subContent;

    //发送时间
    private Date sendTime;

    //短信过期时间
    private Date expDate;

    //短信类型
    private Integer smsType;

    //调用方式
    private Integer invokType;

    public Integer getSmsId() {
        return smsId;
    }

    public void setSmsId(Integer smsId) {
        this.smsId = smsId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public String getSubContent() {
        return subContent;
    }

    public void setSubContent(String subContent) {
        this.subContent = subContent == null ? null : subContent.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    public Integer getInvokType() {
        return invokType;
    }

    public void setInvokType(Integer invokType) {
        this.invokType = invokType;
    }

	@Override
	public String toString() {
		return "ExcMessage [smsId=" + smsId + ", phoneNumber=" + phoneNumber + ", checkCode=" + checkCode
				+ ", subContent=" + subContent + ", sendTime=" + sendTime + ", expDate=" + expDate + ", smsType="
				+ smsType + ", invokType=" + invokType + "]";
	}
    
}