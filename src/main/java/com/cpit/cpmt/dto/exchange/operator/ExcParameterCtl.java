package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.CustomDateTimeSerializer;
import com.cpit.common.DeserializeDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
/**
 * 参数控制表
 * @author zcp
 *
 */
public class ExcParameterCtl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 服务器名
	 */
    private String serverName;
	/**
	 * 是否可用：1可用 0，不可用
	 */
    private Byte statusCd;
	/**
	 * ip地址
	 */
    private String serverIp;
	/**
	 * 端口号
	 */
    private String serverPort;
	/**
	 * 最新操作日期
	 */
    private Date uptdate;
    
    @JsonDeserialize(using = DeserializeDateTime.class)
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    private Date startDate;
    
    @JsonDeserialize(using = DeserializeDateTime.class)
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    private Date endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Byte getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Byte statusCd) {
        this.statusCd = statusCd;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort == null ? null : serverPort.trim();
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
    
    
}