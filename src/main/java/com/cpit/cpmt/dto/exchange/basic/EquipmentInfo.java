package com.cpit.cpmt.dto.exchange.basic;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author 
 */
public class EquipmentInfo implements Serializable {
    /**
     * 设备唯一编码
     */
    private String equipmentID;

    /**
     * 运营商唯一id    统一社会信用代码
     */
    @JsonProperty
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
     * 设备状态	1：建设中 5：关闭下线：停用(故障) 6：维护中：长时间维护 7:报废 50：正常使用，验收后默认1
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

    /*
    * 设备接口列表
    * */
    private List<ConnectorInfo> connectorInfos;

    private static final long serialVersionUID = 1L;

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    @JsonIgnore
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

    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
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


    public List<ConnectorInfo> getConnectorInfos() {
        return connectorInfos;
    }

    public void setConnectorInfos(List<ConnectorInfo> connectorInfos) {
        this.connectorInfos = connectorInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentInfo)) return false;
        EquipmentInfo that = (EquipmentInfo) o;
        return Objects.equals(equipmentID, that.equipmentID) &&
                Objects.equals(operatorID, that.operatorID) &&
                Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(manufacturerID, that.manufacturerID) &&
                Objects.equals(manufacturerName, that.manufacturerName) &&
                Objects.equals(equipmentModel, that.equipmentModel) &&
                Objects.equals(productionDate, that.productionDate) &&
                Objects.equals(equipmentAddTime, that.equipmentAddTime) &&
                Objects.equals(equipmentType, that.equipmentType) &&
                Objects.equals(equipmentLng, that.equipmentLng) &&
                Objects.equals(equipmentLat, that.equipmentLat) &&
                Objects.equals(power, that.power) &&
                Objects.equals(equipmentStatus, that.equipmentStatus) &&
                Objects.equals(equipmentPower, that.equipmentPower) &&
                Objects.equals(newNationalStandard, that.newNationalStandard);
    }

    @Override
    public int hashCode() {

        return Objects.hash(equipmentID, operatorID,  equipmentName, manufacturerID, manufacturerName, equipmentModel, productionDate, equipmentAddTime, equipmentType, equipmentLng, equipmentLat, power, equipmentStatus, equipmentPower, newNationalStandard);
    }

    @Override
    public String toString() {
        return "EquipmentInfo{" +
                "equipmentID='" + equipmentID + '\'' +
                ", operatorID='" + operatorID + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", manufacturerID='" + manufacturerID + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", equipmentModel='" + equipmentModel + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", equipmentAddTime='" + equipmentAddTime + '\'' +
                ", equipmentType=" + equipmentType +
                ", equipmentLng='" + equipmentLng + '\'' +
                ", equipmentLat='" + equipmentLat + '\'' +
                ", power='" + power + '\'' +
                ", equipmentStatus='" + equipmentStatus + '\'' +
                ", equipmentPower='" + equipmentPower + '\'' +
                ", newNationalStandard='" + newNationalStandard + '\'' +
                '}';
    }
}