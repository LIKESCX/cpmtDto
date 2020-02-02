package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class DisEquipmentHistoryInfo implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 运营商历史表ID
     */
    private Integer operatorHisID;

    /**
     * 充电站历史表ID
     */
    private String hisSID;

    /**
     * 充电站ID
     */
    private String stationID;

    /**
     * 运营商ID
     */
    private String operatorID;

    /**
     * 设备唯一编码,对同一运营商,保证唯一
     */
    private String disequipmentID;

    /**
     *  设备生产商统一社会信用代码
     */
    private String manufacturerID;

    /**
     * 设备生产商的名称(制造商全称)
     */
    private String manufacturerName;

    /**
     * 设备型号	由设备生厂商定义的设备型号
     */
    private String equipmentModel;

    /**
     * 设备生产日期 YYYY-MM-DD
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date productionDate;

    /**
     * 额定输入电压 单位：kV 保留小数点后一位
     */
    private Double ratedInVoltage;

    /**
     * 额定输出电压 单位：kV 保留小数点后一位
     */
    private Double ratedOutVoltage;

    /**
     * 额定容量 单位：kVA 保留小数点后一位
     */
    private Double ratedPower;

    /**
     * 馈线开关数量 单位个
     */
    private Integer feedNum;

    /**
     * 中心平台收到时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date receivedTime;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date inTime;

    /**
     * 1 停运；2活跃
     */
    private Integer status;

    /**
     * 操作人ID
     */
    private String userID;

    /**
     * 操作人
     */
    private String userName;

    /**
     * 操作
     */
    private String operate;

    /**
     * 记录入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date checkDate;

    /**
     * 备注
     */
    private String note;

    /**
     * 开始时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date beginTime;

    /**
     * 开始时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date endTime;

    //运营商信息
    private OperatorInfoExtend operatorInfo;
    //运营商历史记录
    private OperatorChangeHis operatorChangeHis;

    //充电站信息
    private StationInfoShow stationInfo;
    //充电站历史记录
    private StationHistoryInfo stationHistory;

    private static final long serialVersionUID = 1L;

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public OperatorInfoExtend getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoExtend operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public OperatorChangeHis getOperatorChangeHis() {
        return operatorChangeHis;
    }

    public void setOperatorChangeHis(OperatorChangeHis operatorChangeHis) {
        this.operatorChangeHis = operatorChangeHis;
    }

    public StationInfoShow getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(StationInfoShow stationInfo) {
        this.stationInfo = stationInfo;
    }

    public StationHistoryInfo getStationHistory() {
        return stationHistory;
    }

    public void setStationHistory(StationHistoryInfo stationHistory) {
        this.stationHistory = stationHistory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatorHisID() {
        return operatorHisID;
    }

    public void setOperatorHisID(Integer operatorHisID) {
        this.operatorHisID = operatorHisID;
    }

    public String getHisSID() {
        return hisSID;
    }

    public void setHisSID(String hisSID) {
        this.hisSID = hisSID;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getDisequipmentID() {
        return disequipmentID;
    }

    public void setDisequipmentID(String disequipmentID) {
        this.disequipmentID = disequipmentID;
    }

    public String getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(String manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Double getRatedInVoltage() {
        return ratedInVoltage;
    }

    public void setRatedInVoltage(Double ratedInVoltage) {
        this.ratedInVoltage = ratedInVoltage;
    }

    public Double getRatedOutVoltage() {
        return ratedOutVoltage;
    }

    public void setRatedOutVoltage(Double ratedOutVoltage) {
        this.ratedOutVoltage = ratedOutVoltage;
    }

    public Double getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(Double ratedPower) {
        this.ratedPower = ratedPower;
    }

    public Integer getFeedNum() {
        return feedNum;
    }

    public void setFeedNum(Integer feedNum) {
        this.feedNum = feedNum;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DisEquipmentHistoryInfo other = (DisEquipmentHistoryInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOperatorHisID() == null ? other.getOperatorHisID() == null : this.getOperatorHisID().equals(other.getOperatorHisID()))
            && (this.getHisSID() == null ? other.getHisSID() == null : this.getHisSID().equals(other.getHisSID()))
            && (this.getStationID() == null ? other.getStationID() == null : this.getStationID().equals(other.getStationID()))
            && (this.getOperatorID() == null ? other.getOperatorID() == null : this.getOperatorID().equals(other.getOperatorID()))
            && (this.getDisequipmentID() == null ? other.getDisequipmentID() == null : this.getDisequipmentID().equals(other.getDisequipmentID()))
            && (this.getManufacturerID() == null ? other.getManufacturerID() == null : this.getManufacturerID().equals(other.getManufacturerID()))
            && (this.getManufacturerName() == null ? other.getManufacturerName() == null : this.getManufacturerName().equals(other.getManufacturerName()))
            && (this.getEquipmentModel() == null ? other.getEquipmentModel() == null : this.getEquipmentModel().equals(other.getEquipmentModel()))
            && (this.getProductionDate() == null ? other.getProductionDate() == null : this.getProductionDate().equals(other.getProductionDate()))
            && (this.getRatedInVoltage() == null ? other.getRatedInVoltage() == null : this.getRatedInVoltage().equals(other.getRatedInVoltage()))
            && (this.getRatedOutVoltage() == null ? other.getRatedOutVoltage() == null : this.getRatedOutVoltage().equals(other.getRatedOutVoltage()))
            && (this.getRatedPower() == null ? other.getRatedPower() == null : this.getRatedPower().equals(other.getRatedPower()))
            && (this.getFeedNum() == null ? other.getFeedNum() == null : this.getFeedNum().equals(other.getFeedNum()))
            && (this.getReceivedTime() == null ? other.getReceivedTime() == null : this.getReceivedTime().equals(other.getReceivedTime()))
            && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserID() == null ? other.getUserID() == null : this.getUserID().equals(other.getUserID()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOperate() == null ? other.getOperate() == null : this.getOperate().equals(other.getOperate()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOperatorHisID() == null) ? 0 : getOperatorHisID().hashCode());
        result = prime * result + ((getHisSID() == null) ? 0 : getHisSID().hashCode());
        result = prime * result + ((getStationID() == null) ? 0 : getStationID().hashCode());
        result = prime * result + ((getOperatorID() == null) ? 0 : getOperatorID().hashCode());
        result = prime * result + ((getDisequipmentID() == null) ? 0 : getDisequipmentID().hashCode());
        result = prime * result + ((getManufacturerID() == null) ? 0 : getManufacturerID().hashCode());
        result = prime * result + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        result = prime * result + ((getEquipmentModel() == null) ? 0 : getEquipmentModel().hashCode());
        result = prime * result + ((getProductionDate() == null) ? 0 : getProductionDate().hashCode());
        result = prime * result + ((getRatedInVoltage() == null) ? 0 : getRatedInVoltage().hashCode());
        result = prime * result + ((getRatedOutVoltage() == null) ? 0 : getRatedOutVoltage().hashCode());
        result = prime * result + ((getRatedPower() == null) ? 0 : getRatedPower().hashCode());
        result = prime * result + ((getFeedNum() == null) ? 0 : getFeedNum().hashCode());
        result = prime * result + ((getReceivedTime() == null) ? 0 : getReceivedTime().hashCode());
        result = prime * result + ((getInTime() == null) ? 0 : getInTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserID() == null) ? 0 : getUserID().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOperate() == null) ? 0 : getOperate().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operatorHisID=").append(operatorHisID);
        sb.append(", hisSID=").append(hisSID);
        sb.append(", stationID=").append(stationID);
        sb.append(", operatorID=").append(operatorID);
        sb.append(", disequipmentID=").append(disequipmentID);
        sb.append(", manufacturerID=").append(manufacturerID);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", equipmentModel=").append(equipmentModel);
        sb.append(", productionDate=").append(productionDate);
        sb.append(", ratedInVoltage=").append(ratedInVoltage);
        sb.append(", ratedOutVoltage=").append(ratedOutVoltage);
        sb.append(", ratedPower=").append(ratedPower);
        sb.append(", feedNum=").append(feedNum);
        sb.append(", receivedTime=").append(receivedTime);
        sb.append(", inTime=").append(inTime);
        sb.append(", status=").append(status);
        sb.append(", userID=").append(userID);
        sb.append(", userName=").append(userName);
        sb.append(", operate=").append(operate);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}