package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

public class BasicReportMsgInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String operatorId;

    private String infVersion;

    private String infType;

    private String infName;
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date recTime;

    private String validateResult;

    private String validateFailDetail;

    private String storeResult;

    private String storeFailDetail;
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date inTime;

    private String remarks1;

    private String remarks2;

    private String timeStamp;
    
    private String jsonMsg;

    

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getOperatorId() {
		return operatorId;
	}



	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}



	public String getInfVersion() {
		return infVersion;
	}



	public void setInfVersion(String infVersion) {
		this.infVersion = infVersion;
	}



	public String getInfType() {
		return infType;
	}



	public void setInfType(String infType) {
		this.infType = infType;
	}



	public String getInfName() {
		return infName;
	}



	public void setInfName(String infName) {
		this.infName = infName;
	}



	public Date getRecTime() {
		return recTime;
	}



	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}



	public String getValidateResult() {
		return validateResult;
	}



	public void setValidateResult(String validateResult) {
		this.validateResult = validateResult;
	}



	public String getValidateFailDetail() {
		return validateFailDetail;
	}



	public void setValidateFailDetail(String validateFailDetail) {
		this.validateFailDetail = validateFailDetail;
	}



	public String getStoreResult() {
		return storeResult;
	}



	public void setStoreResult(String storeResult) {
		this.storeResult = storeResult;
	}



	public String getStoreFailDetail() {
		return storeFailDetail;
	}



	public void setStoreFailDetail(String storeFailDetail) {
		this.storeFailDetail = storeFailDetail;
	}



	public Date getInTime() {
		return inTime;
	}



	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}



	public String getRemarks1() {
		return remarks1;
	}



	public void setRemarks1(String remarks1) {
		this.remarks1 = remarks1;
	}



	public String getRemarks2() {
		return remarks2;
	}



	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}



	public String getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	public String getJsonMsg() {
		return jsonMsg;
	}



	public void setJsonMsg(String jsonMsg) {
		this.jsonMsg = jsonMsg;
	}


	@Override
	public String toString() {
		return "BasicReportMsgInfo [id=" + id + ", operatorId=" + operatorId + ", infVersion=" + infVersion
				+ ", infType=" + infType + ", infName=" + infName + ", recTime=" + recTime + ", validateResult="
				+ validateResult + ", validateFailDetail=" + validateFailDetail + ", storeResult=" + storeResult
				+ ", storeFailDetail=" + storeFailDetail + ", inTime=" + inTime + ", remarks1=" + remarks1
				+ ", remarks2=" + remarks2 + ", timeStamp=" + timeStamp + ", jsonMsg=" + jsonMsg + "]";
	}


    
}