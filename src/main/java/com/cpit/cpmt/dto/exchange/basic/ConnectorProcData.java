package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 
 */
public class ConnectorProcData implements Serializable {
    private Integer id;

    /**
     * 运营商id
     */
    private String operatorID;

    /**
     * 充电设备接口ID
     */
    private String connectorID;

    /**
     * 充电设备接口状态
     */
    private String status;

    /**
     * 平台收到运营商上报时间yyyy-mm-dd hh:mm:ss
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date recTime;

    /**
     * 入库时间 yyyy-mm-dd hh:mm:ss
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
    private Date inTime;

    /**
     * 时间戳，上报信息头自带
     */
    private String timeStamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorId) {
        this.operatorID = operatorId;
    }

    public String getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(String connectorId) {
        this.connectorID = connectorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

	@Override
	public String toString() {
		return "ConnectorProcData [id=" + id + ", operatorID=" + operatorID + ", connectorID=" + connectorID
				+ ", status=" + status + ", recTime=" + recTime + ", inTime=" + inTime + ", timeStamp=" + timeStamp
				+ "]";
	}
}