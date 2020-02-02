package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author 
 */
public class StationInfo implements Serializable {
    /**
     * 充电站id
     */
    private String stationID;

    /**
     * 充电站名称
     */
    private String stationName;

    /**
     * 运营商唯一id  统一社会信用代码
     */
    private String operatorID;

    /**
     * 设备所属方ID
     */
    private String equipmentOwnerID;

    /**
     * 充电站国家代码
     */
    private String countryCode;

    /**
     * 充电站省市辖区编码
     */
    private String areaCode;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 站点电话
     */
    private String stationTel;

    /**
     * 服务电话
     */
    private String serviceTel;

    /**
     * 站点类型 1：公共; 50：个人(普通); 100：公交（专用）; 101：环卫（专用）; 102：物流（专用）; 103：出租车（专用）; 255：其他
     */
    private Integer stationType;

    /**
     * 站点状态 0：未知; 1：建设中; 5：关闭下线; 6：维护中; 50：正常使用
     */
    private Integer stationStatus;

    /**
     * 车位数量
     */
    private Integer parkNums;

    /**
     * 经度
     */
    private Double stationLng;

    /**
     * 纬度
     */
    private Double stationLat;

    /**
     * 站点引导
     */
    private String siteGuide;

    /**
     * 建设场所  1.道路范围内 2.交通场站内 3.党政机关事业单位内部停车场 4.国有企业内部 5.住宅区停车场 6.社会停车场 7.市属公园内 8.其他类
     */
    private Integer construction;

    /**
     * 站点照片
     */
    private String[] pictures;

    /**
     * 使用车型描述
     */
    private String matchCars;

    /**
     * 车位楼层及数量描述
     */
    private String parkInfo;

    /**
     * 营业时间
     */
    private String busineHours;

    /**
     * 充电电费率
     */
    private String electricityFee;

    /**
     * 服务费率
     */
    private String serviceFee;

    /**
     * 停车费
     */
    private String parkFee;

    /**
     * 支付方式   刷卡、线上、现金
     */
    private String payment;

    /**
     * 是否支持预约
     */
    private Integer supportOrder;

    /**
     * 停车场产权方
     */
    private String parkOwner;

    /**
     * 停车场管理方
     */
    private String parkManager;

    /**
     * 全天开放   是否全天开放 0：否; 1：是
     */
    private Integer openAllDay;

    /**
     * 免费停车 是否停车免费  0：否,1：是
     */
    private Integer parkFree;

    /**
     * 运营属性    运营场站的属性   1：由本运营商自营；2：由本运营商代运营
     */
    private Integer opratorType;

    /**
     * 备注
     */
    private String remark;

    /*
    * 充电设备列表
    * */
    private List<EquipmentInfo> equipmentInfos;


    private static final long serialVersionUID = 1L;

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getEquipmentOwnerID() {
        return equipmentOwnerID;
    }

    public void setEquipmentOwnerID(String equipmentOwnerID) {
        this.equipmentOwnerID = equipmentOwnerID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStationTel() {
        return stationTel;
    }

    public void setStationTel(String stationTel) {
        this.stationTel = stationTel;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public Integer getStationType() {
        return stationType;
    }

    public void setStationType(Integer stationType) {
        this.stationType = stationType;
    }

    public Integer getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(Integer stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Integer getParkNums() {
        return parkNums;
    }

    public void setParkNums(Integer parkNums) {
        this.parkNums = parkNums;
    }

    public Double getStationLng() {
        return stationLng;
    }

    public void setStationLng(Double stationLng) {
        this.stationLng = stationLng;
    }

    public Double getStationLat() {
        return stationLat;
    }

    public void setStationLat(Double stationLat) {
        this.stationLat = stationLat;
    }

    public String getSiteGuide() {
        return siteGuide;
    }

    public void setSiteGuide(String siteGuide) {
        this.siteGuide = siteGuide;
    }

    public Integer getConstruction() {
        return construction;
    }

    public void setConstruction(Integer construction) {
        this.construction = construction;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public String getMatchCars() {
        return matchCars;
    }

    public void setMatchCars(String matchCars) {
        this.matchCars = matchCars;
    }

    public String getParkInfo() {
        return parkInfo;
    }

    public void setParkInfo(String parkInfo) {
        this.parkInfo = parkInfo;
    }

    public String getBusineHours() {
        return busineHours;
    }

    public void setBusineHours(String busineHours) {
        this.busineHours = busineHours;
    }

    public String getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(String electricityFee) {
        this.electricityFee = electricityFee;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getParkFee() {
        return parkFee;
    }

    public void setParkFee(String parkFee) {
        this.parkFee = parkFee;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getSupportOrder() {
        return supportOrder;
    }

    public void setSupportOrder(Integer supportOrder) {
        this.supportOrder = supportOrder;
    }

    public String getParkOwner() {
        return parkOwner;
    }

    public void setParkOwner(String parkOwner) {
        this.parkOwner = parkOwner;
    }

    public String getParkManager() {
        return parkManager;
    }

    public void setParkManager(String parkManager) {
        this.parkManager = parkManager;
    }

    public Integer getOpenAllDay() {
        return openAllDay;
    }

    public void setOpenAllDay(Integer openAllDay) {
        this.openAllDay = openAllDay;
    }

    public Integer getParkFree() {
        return parkFree;
    }

    public void setParkFree(Integer parkFree) {
        this.parkFree = parkFree;
    }

    public Integer getOpratorType() {
        return opratorType;
    }

    public void setOpratorType(Integer opratorType) {
        this.opratorType = opratorType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<EquipmentInfo> getEquipmentInfos() {
        return equipmentInfos;
    }

    public void setEquipmentInfos(List<EquipmentInfo> equipmentInfos) {
        this.equipmentInfos = equipmentInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationInfo)) return false;
        StationInfo that = (StationInfo) o;
        return Objects.equals(stationID, that.stationID) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(operatorID, that.operatorID) &&
                Objects.equals(equipmentOwnerID, that.equipmentOwnerID) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(address, that.address) &&
                Objects.equals(stationTel, that.stationTel) &&
                Objects.equals(serviceTel, that.serviceTel) &&
                Objects.equals(stationType, that.stationType) &&
                Objects.equals(stationStatus, that.stationStatus) &&
                Objects.equals(parkNums, that.parkNums) &&
                Objects.equals(stationLng, that.stationLng) &&
                Objects.equals(stationLat, that.stationLat) &&
                Objects.equals(siteGuide, that.siteGuide) &&
                Objects.equals(construction, that.construction) &&
                Objects.equals(pictures, that.pictures) &&
                Objects.equals(matchCars, that.matchCars) &&
                Objects.equals(parkInfo, that.parkInfo) &&
                Objects.equals(busineHours, that.busineHours) &&
                Objects.equals(electricityFee, that.electricityFee) &&
                Objects.equals(serviceFee, that.serviceFee) &&
                Objects.equals(parkFee, that.parkFee) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(supportOrder, that.supportOrder) &&
                Objects.equals(parkOwner, that.parkOwner) &&
                Objects.equals(parkManager, that.parkManager) &&
                Objects.equals(openAllDay, that.openAllDay) &&
                Objects.equals(parkFree, that.parkFree) &&
                Objects.equals(opratorType, that.opratorType) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stationID, stationName, operatorID, equipmentOwnerID, countryCode, areaCode, address, stationTel, serviceTel, stationType, stationStatus, parkNums, stationLng, stationLat, siteGuide, construction, pictures, matchCars, parkInfo, busineHours, electricityFee, serviceFee, parkFee, payment, supportOrder, parkOwner, parkManager, openAllDay, parkFree, opratorType, remark);
    }

    @Override
    public String toString() {
        return "StationInfo{" +
                "stationID='" + stationID + '\'' +
                ", stationName='" + stationName + '\'' +
                ", operatorID='" + operatorID + '\'' +
                ", equipmentOwnerID='" + equipmentOwnerID + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", address='" + address + '\'' +
                ", stationTel='" + stationTel + '\'' +
                ", serviceTel='" + serviceTel + '\'' +
                ", stationType='" + stationType + '\'' +
                ", stationStatus='" + stationStatus + '\'' +
                ", parkNums='" + parkNums + '\'' +
                ", stationLng='" + stationLng + '\'' +
                ", stationLat='" + stationLat + '\'' +
                ", siteGuide='" + siteGuide + '\'' +
                ", construction=" + construction +
                ", pictures='" + pictures + '\'' +
                ", matchCars='" + matchCars + '\'' +
                ", parkInfo='" + parkInfo + '\'' +
                ", busineHours='" + busineHours + '\'' +
                ", electricityFee='" + electricityFee + '\'' +
                ", serviceFee='" + serviceFee + '\'' +
                ", parkFee='" + parkFee + '\'' +
                ", payment='" + payment + '\'' +
                ", supportOrder='" + supportOrder + '\'' +
                ", parkOwner='" + parkOwner + '\'' +
                ", parkManager='" + parkManager + '\'' +
                ", openAllDay='" + openAllDay + '\'' +
                ", parkFree='" + parkFree + '\'' +
                ", opratorType='" + opratorType + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}