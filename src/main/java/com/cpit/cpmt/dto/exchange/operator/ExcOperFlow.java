package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.CustomDateTimeSerializer;
import com.cpit.common.DeserializeDateTime;
import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
/**
 * 运营商流量控制表
 * @author zcp
 *
 */
public class ExcOperFlow implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 运营商id
	 */
	private String operatorId;
	/**
	 * 流量控制状态:1，开 0，关
	 */
    private Byte statusCd;
	/**
	 * 最新操作日期
	 */
    private Date uptdate;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date startDate;
    
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date endDate;

    /**
     * 运营商名称(界面传值)
     */
    private String operatorName;
    /**
     * 界面传值备用字段
     */
    private String str1;
    private String str2;
    
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public Byte getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Byte statusCd) {
        this.statusCd = statusCd;
    }

    public Date getUptdate() {
        return uptdate;
    }

    public void setUptdate(Date uptdate) {
        this.uptdate = uptdate;
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

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
    
    
}