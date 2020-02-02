package com.cpit.cpmt.dto.monitor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//充电站评估结果表
public class StationEvaluateResult implements Serializable {
    private String id;

    private String operatorId;

    private String stationId;

    //通知状态 0.未通知，1.已通知
    private Integer noticeStatus;

    //通知内容
    private String noticeContent;

    //评估结论
    private String evaluteResult;

    //入库时间
    private Date inTime;

    //备用字段
    private String remark;

    private static final long serialVersionUID = 1L;

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

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getEvaluteResult() {
        return evaluteResult;
    }

    public void setEvaluteResult(String evaluteResult) {
        this.evaluteResult = evaluteResult;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationEvaluateResult)) return false;
        StationEvaluateResult that = (StationEvaluateResult) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(noticeStatus, that.noticeStatus) &&
                Objects.equals(noticeContent, that.noticeContent) &&
                Objects.equals(evaluteResult, that.evaluteResult) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, operatorId, stationId, noticeStatus, noticeContent, evaluteResult, inTime, remark);
    }

    @Override
    public String toString() {
        return "StationEvaluateResult{" +
                "id='" + id + '\'' +
                ", operatorId='" + operatorId + '\'' +
                ", stationId='" + stationId + '\'' +
                ", noticeStatus=" + noticeStatus +
                ", noticeContent='" + noticeContent + '\'' +
                ", evaluteResult='" + evaluteResult + '\'' +
                ", inTime=" + inTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
