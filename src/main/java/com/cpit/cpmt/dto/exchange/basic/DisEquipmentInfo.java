package com.cpit.cpmt.dto.exchange.basic;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.system.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class DisEquipmentInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 充电站id
     */
    @JsonProperty
    private String stationID;

    /*
    * 状态 1 停运；2活跃
    * */
    private Integer status;

    /**
     * 运营商id
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

    //用户
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonIgnore
    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        DisEquipmentInfo other = (DisEquipmentInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
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
            && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}