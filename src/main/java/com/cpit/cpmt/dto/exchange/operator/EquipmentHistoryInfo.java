package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class EquipmentHistoryInfo implements Serializable {
    /**
     * ID
     */
    private String eID;

    /**
     * 设备唯一编码
     */
    private String equipmentID;

    private String sID;

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
    private String stationId;

    /**
     * 运营商唯一ID	
     */
    private String operatorID;

    /**
     * 设备名称	设备编号，如”xxx站06#桩”
     */
    private String equipmentName;

    /**
     * 设备生产商组织机构代码
     */
    private String manufacturerID;

    /**
     * 设备生产商名称
     */
    private String manufacturerName;

    /**
     * 设备型号	由设备生厂商定义的设备型号
     */
    private String equipmentModel;

    /**
     * 设备生产日期	yyyy-mm-dd
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date productionDate;

    /**
     * 充电设备接入时间	创建时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date equipmentAddTime;

    /**
     * 设备类型	1：直流设备 2：交流设备 3：交直流一体设备 4：无线充电 5：充放电设备 255：其他
     */
    private Integer equipmentType;

    /**
     * 充电设备经度	gcj-02坐标系
     */
    private Double equipmentLng;

    /**
     * 充电设备纬度	gcj-02坐标系
     */
    private Double equipmentLat;

    /**
     * 充电设备总功率	单位：kw
     */
    private Double power;

    /**
     * 设备状态	1：建设中 5：关闭下线：停用 6：维护中：长时间维护 50：正常使用，验收后默认1
     */
    private Integer equipmentStatus;

    /**
     * 额定功率	单位：kw
     */
    private Double equipmentPower;

    /**
     * 支持标准版本 1：2011版 2：2015版 3：大功率交流 255：其他默认1
     */
    private Integer newNationalStandard;

    /**
     * 补贴状态  1：已申报；2：已发放；3 未发放
     */
    private String allowanceStatus;

    /**
     * 补贴金额
     */
    private String allowancePrice;

    /**
     * 检测状态  1：未检测；2：检测通过；3：检测不通过
     */
    private String checkoutStatus;

    /**
     * 额定输入电压  单位：kV
     */
    private String ratedInVoltage;

    /**
     * 额定输出电压  单位：V
     */
    private String ratedOutVoltage;

    /**
     * 额定容量      单位：kVA
     */
    private String ratedPower;

    /**
     * 馈线开关数量  个
     */
    private Integer feedNum;

    /**
     * 枪数
     */
    private Integer gunSum;

    /**
     * 补贴时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date allowanceDate;

    /**
     * 入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date inDate;

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
     * 审核原因描述
     */
    private String reason;

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
     * 结束时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date endTime;

    //接口id
    private String connectorId;

    /*
     *操作类型  1.新增  2.变更
     * */
    private Integer operateType;

    /*
     * 变更方式 1.地标 2.界面 3.自动
     * */
    private Integer changeMethod;

    //运营商信息
    private OperatorInfoExtend operatorInfo;
    //运营商历史记录
    private OperatorChangeHis operatorChangeHis;

    //充电站信息
    private StationInfoShow stationInfo;
    //充电站历史记录
    private StationHistoryInfo stationHistory;

    //补贴状态list
    private List<Object> allowanceStatusList;

    private static final long serialVersionUID = 1L;

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Integer getChangeMethod() {
        return changeMethod;
    }

    public void setChangeMethod(Integer changeMethod) {
        this.changeMethod = changeMethod;
    }

    public List<Object> getAllowanceStatusList() {
        return allowanceStatusList;
    }

    public void setAllowanceStatusList(List<Object> allowanceStatusList) {
        this.allowanceStatusList = allowanceStatusList;
    }

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

    public String getEID() {
        return eID;
    }

    public void setEID(String eID) {
        this.eID = eID;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getSID() {
        return sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
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

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
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



    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getEquipmentAddTime() {
        return equipmentAddTime;
    }

    public void setEquipmentAddTime(Date equipmentAddTime) {
        this.equipmentAddTime = equipmentAddTime;
    }

    public Double getEquipmentLng() {
        return equipmentLng;
    }

    public void setEquipmentLng(Double equipmentLng) {
        this.equipmentLng = equipmentLng;
    }

    public Double getEquipmentLat() {
        return equipmentLat;
    }

    public void setEquipmentLat(Double equipmentLat) {
        this.equipmentLat = equipmentLat;
    }

    public Integer getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(Integer equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public Double getEquipmentPower() {
        return equipmentPower;
    }

    public void setEquipmentPower(Double equipmentPower) {
        this.equipmentPower = equipmentPower;
    }

    public Integer getNewNationalStandard() {
        return newNationalStandard;
    }

    public void setNewNationalStandard(Integer newNationalStandard) {
        this.newNationalStandard = newNationalStandard;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }


    public String getAllowanceStatus() {
        return allowanceStatus;
    }

    public void setAllowanceStatus(String allowanceStatus) {
        this.allowanceStatus = allowanceStatus;
    }

    public String getAllowancePrice() {
        return allowancePrice;
    }

    public void setAllowancePrice(String allowancePrice) {
        this.allowancePrice = allowancePrice;
    }

    public String getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    public String getRatedInVoltage() {
        return ratedInVoltage;
    }

    public void setRatedInVoltage(String ratedInVoltage) {
        this.ratedInVoltage = ratedInVoltage;
    }

    public String getRatedOutVoltage() {
        return ratedOutVoltage;
    }

    public void setRatedOutVoltage(String ratedOutVoltage) {
        this.ratedOutVoltage = ratedOutVoltage;
    }

    public String getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(String ratedPower) {
        this.ratedPower = ratedPower;
    }

    public Integer getFeedNum() {
        return feedNum;
    }

    public void setFeedNum(Integer feedNum) {
        this.feedNum = feedNum;
    }

    public Integer getGunSum() {
        return gunSum;
    }

    public void setGunSum(Integer gunSum) {
        this.gunSum = gunSum;
    }

    public Date getAllowanceDate() {
        return allowanceDate;
    }

    public void setAllowanceDate(Date allowanceDate) {
        this.allowanceDate = allowanceDate;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
        EquipmentHistoryInfo other = (EquipmentHistoryInfo) that;
        return (this.getEID() == null ? other.getEID() == null : this.getEID().equals(other.getEID()))
            && (this.getEquipmentID() == null ? other.getEquipmentID() == null : this.getEquipmentID().equals(other.getEquipmentID()))
            && (this.getSID() == null ? other.getSID() == null : this.getSID().equals(other.getSID()))
            && (this.getOperatorHisID() == null ? other.getOperatorHisID() == null : this.getOperatorHisID().equals(other.getOperatorHisID()))
            && (this.getHisSID() == null ? other.getHisSID() == null : this.getHisSID().equals(other.getHisSID()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getOperatorID() == null ? other.getOperatorID() == null : this.getOperatorID().equals(other.getOperatorID()))
            && (this.getEquipmentName() == null ? other.getEquipmentName() == null : this.getEquipmentName().equals(other.getEquipmentName()))
            && (this.getManufacturerID() == null ? other.getManufacturerID() == null : this.getManufacturerID().equals(other.getManufacturerID()))
            && (this.getManufacturerName() == null ? other.getManufacturerName() == null : this.getManufacturerName().equals(other.getManufacturerName()))
            && (this.getEquipmentModel() == null ? other.getEquipmentModel() == null : this.getEquipmentModel().equals(other.getEquipmentModel()))
            && (this.getProductionDate() == null ? other.getProductionDate() == null : this.getProductionDate().equals(other.getProductionDate()))
            && (this.getEquipmentAddTime() == null ? other.getEquipmentAddTime() == null : this.getEquipmentAddTime().equals(other.getEquipmentAddTime()))
            && (this.getEquipmentType() == null ? other.getEquipmentType() == null : this.getEquipmentType().equals(other.getEquipmentType()))
            && (this.getEquipmentLng() == null ? other.getEquipmentLng() == null : this.getEquipmentLng().equals(other.getEquipmentLng()))
            && (this.getEquipmentLat() == null ? other.getEquipmentLat() == null : this.getEquipmentLat().equals(other.getEquipmentLat()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getEquipmentStatus() == null ? other.getEquipmentStatus() == null : this.getEquipmentStatus().equals(other.getEquipmentStatus()))
            && (this.getEquipmentPower() == null ? other.getEquipmentPower() == null : this.getEquipmentPower().equals(other.getEquipmentPower()))
            && (this.getNewNationalStandard() == null ? other.getNewNationalStandard() == null : this.getNewNationalStandard().equals(other.getNewNationalStandard()))
            && (this.getAllowanceStatus() == null ? other.getAllowanceStatus() == null : this.getAllowanceStatus().equals(other.getAllowanceStatus()))
            && (this.getAllowancePrice() == null ? other.getAllowancePrice() == null : this.getAllowancePrice().equals(other.getAllowancePrice()))
            && (this.getCheckoutStatus() == null ? other.getCheckoutStatus() == null : this.getCheckoutStatus().equals(other.getCheckoutStatus()))
            && (this.getRatedInVoltage() == null ? other.getRatedInVoltage() == null : this.getRatedInVoltage().equals(other.getRatedInVoltage()))
            && (this.getRatedOutVoltage() == null ? other.getRatedOutVoltage() == null : this.getRatedOutVoltage().equals(other.getRatedOutVoltage()))
            && (this.getRatedPower() == null ? other.getRatedPower() == null : this.getRatedPower().equals(other.getRatedPower()))
            && (this.getFeedNum() == null ? other.getFeedNum() == null : this.getFeedNum().equals(other.getFeedNum()))
            && (this.getGunSum() == null ? other.getGunSum() == null : this.getGunSum().equals(other.getGunSum()))
            && (this.getAllowanceDate() == null ? other.getAllowanceDate() == null : this.getAllowanceDate().equals(other.getAllowanceDate()))
            && (this.getInDate() == null ? other.getInDate() == null : this.getInDate().equals(other.getInDate()))
            && (this.getUserID() == null ? other.getUserID() == null : this.getUserID().equals(other.getUserID()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOperate() == null ? other.getOperate() == null : this.getOperate().equals(other.getOperate()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEID() == null) ? 0 : getEID().hashCode());
        result = prime * result + ((getEquipmentID() == null) ? 0 : getEquipmentID().hashCode());
        result = prime * result + ((getSID() == null) ? 0 : getSID().hashCode());
        result = prime * result + ((getOperatorHisID() == null) ? 0 : getOperatorHisID().hashCode());
        result = prime * result + ((getHisSID() == null) ? 0 : getHisSID().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getOperatorID() == null) ? 0 : getOperatorID().hashCode());
        result = prime * result + ((getEquipmentName() == null) ? 0 : getEquipmentName().hashCode());
        result = prime * result + ((getManufacturerID() == null) ? 0 : getManufacturerID().hashCode());
        result = prime * result + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        result = prime * result + ((getEquipmentModel() == null) ? 0 : getEquipmentModel().hashCode());
        result = prime * result + ((getProductionDate() == null) ? 0 : getProductionDate().hashCode());
        result = prime * result + ((getEquipmentAddTime() == null) ? 0 : getEquipmentAddTime().hashCode());
        result = prime * result + ((getEquipmentType() == null) ? 0 : getEquipmentType().hashCode());
        result = prime * result + ((getEquipmentLng() == null) ? 0 : getEquipmentLng().hashCode());
        result = prime * result + ((getEquipmentLat() == null) ? 0 : getEquipmentLat().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getEquipmentStatus() == null) ? 0 : getEquipmentStatus().hashCode());
        result = prime * result + ((getEquipmentPower() == null) ? 0 : getEquipmentPower().hashCode());
        result = prime * result + ((getNewNationalStandard() == null) ? 0 : getNewNationalStandard().hashCode());
        result = prime * result + ((getAllowanceStatus() == null) ? 0 : getAllowanceStatus().hashCode());
        result = prime * result + ((getAllowancePrice() == null) ? 0 : getAllowancePrice().hashCode());
        result = prime * result + ((getCheckoutStatus() == null) ? 0 : getCheckoutStatus().hashCode());
        result = prime * result + ((getRatedInVoltage() == null) ? 0 : getRatedInVoltage().hashCode());
        result = prime * result + ((getRatedOutVoltage() == null) ? 0 : getRatedOutVoltage().hashCode());
        result = prime * result + ((getRatedPower() == null) ? 0 : getRatedPower().hashCode());
        result = prime * result + ((getFeedNum() == null) ? 0 : getFeedNum().hashCode());
        result = prime * result + ((getGunSum() == null) ? 0 : getGunSum().hashCode());
        result = prime * result + ((getAllowanceDate() == null) ? 0 : getAllowanceDate().hashCode());
        result = prime * result + ((getInDate() == null) ? 0 : getInDate().hashCode());
        result = prime * result + ((getUserID() == null) ? 0 : getUserID().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOperate() == null) ? 0 : getOperate().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eID=").append(eID);
        sb.append(", equipmentID=").append(equipmentID);
        sb.append(", sID=").append(sID);
        sb.append(", operatorHisID=").append(operatorHisID);
        sb.append(", hisSID=").append(hisSID);
        sb.append(", stationId=").append(stationId);
        sb.append(", operatorID=").append(operatorID);
        sb.append(", equipmentName=").append(equipmentName);
        sb.append(", manufacturerID=").append(manufacturerID);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", equipmentModel=").append(equipmentModel);
        sb.append(", productionDate=").append(productionDate);
        sb.append(", equipmentAddTime=").append(equipmentAddTime);
        sb.append(", equipmentType=").append(equipmentType);
        sb.append(", equipmentLng=").append(equipmentLng);
        sb.append(", equipmentLat=").append(equipmentLat);
        sb.append(", power=").append(power);
        sb.append(", equipmentStatus=").append(equipmentStatus);
        sb.append(", equipmentPower=").append(equipmentPower);
        sb.append(", newNationalStandard=").append(newNationalStandard);
        sb.append(", allowanceStatus=").append(allowanceStatus);
        sb.append(", allowancePrice=").append(allowancePrice);
        sb.append(", checkoutStatus=").append(checkoutStatus);
        sb.append(", ratedInVoltage=").append(ratedInVoltage);
        sb.append(", ratedOutVoltage=").append(ratedOutVoltage);
        sb.append(", ratedPower=").append(ratedPower);
        sb.append(", feedNum=").append(feedNum);
        sb.append(", gunSum=").append(gunSum);
        sb.append(", allowanceDate=").append(allowanceDate);
        sb.append(", inDate=").append(inDate);
        sb.append(", userID=").append(userID);
        sb.append(", userName=").append(userName);
        sb.append(", operate=").append(operate);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", reason=").append(reason);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}