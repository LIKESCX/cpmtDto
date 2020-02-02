package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class StationHistoryInfo implements Serializable {
    /**
     * ID
     */
    private String sID;

    /**
     * 充电站ID
     */
    private String stationID;

    /**
     * 充电站名称
     */
    private String stationName;

    /**
     * 运营商历史表ID
     */
    private Integer operatorHisID;

    /**
     * 运营商唯一ID
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
     * 开始建设时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date buildDate;

    /**
     * 投入使用时间(已建成)
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date connectionTime;

    /**
     * 站点负责人
     */
    private String stationPrincipal;

    /**
     * 产权单位   （运营商自有产权则填“自有”）
     */
    private String propertyUnit;

    /**
     * 投资建设单位  （运营商自有产权则填“自投”）
     */
    private String investBuildUnit;

    /**
     * 充电站用地类型
     */
    private String stationLandKind;

    /**
     * 用地已使用时间
     */
    private String landUseTime;

    /**
     * 预计剩余用地时间 （填具体时间，未发生租赁或无具体时间的填“无”）
     */
    private String landRemainTime;

    /**
     * 充电站（桩）类型    集中式，分散式
     */
    private String stationKind;

    /**
     * 总桩数
     */
    private Integer chargeSum;

    /**
     * 总枪数
     */
    private Integer gunSum;

    /**
     * 补贴状态  0：未申请 1：申请中；2 审核中；3：待补贴；4：已补贴； 5：审核不通过
     */
    private Integer allowanceStatus;

    /**
     * 补贴金额
     */
    private String allowancePrice;

    /**
     * 检测状态  1：未检测；2：检测通过；3：检测不通过
     */
    private Integer checkoutStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 租赁期限
     */
    private String rentDate;

    /**
     * 投资规模
     */
    private String inventExtend;

    private Integer stationProperty;

    /**
     * 充电站街道
     */
    private String stationStreet;

    /**
     * 服务车辆类型 1.公交 2.网约车 3.物流货车 4.通勤车 5.大巴  6.私人乘用车 7.环卫泥头车
     */
    private Integer serviceCarType;

    /**
     * 用地性质  1.国有用地 2.集体用地 3.临时用地
     */
    private Integer landProperty;

    /**
     * 运营商性质
     */
    private String operatorProperty;

    /**
     * 补贴时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date allowanceDate;

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

    //补贴状态list
    private List<Object> allowanceStatusList;

    private static final long serialVersionUID = 1L;

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

    public String getSID() {
        return sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
    }

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

    public Integer getOperatorHisID() {
        return operatorHisID;
    }

    public void setOperatorHisID(Integer operatorHisID) {
        this.operatorHisID = operatorHisID;
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

    public Integer getSupportOrder() {
        return supportOrder;
    }

    public void setSupportOrder(Integer supportOrder) {
        this.supportOrder = supportOrder;
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


    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

    public String getStationPrincipal() {
        return stationPrincipal;
    }

    public void setStationPrincipal(String stationPrincipal) {
        this.stationPrincipal = stationPrincipal;
    }

    public String getPropertyUnit() {
        return propertyUnit;
    }

    public void setPropertyUnit(String propertyUnit) {
        this.propertyUnit = propertyUnit;
    }

    public String getInvestBuildUnit() {
        return investBuildUnit;
    }

    public void setInvestBuildUnit(String investBuildUnit) {
        this.investBuildUnit = investBuildUnit;
    }

    public String getStationLandKind() {
        return stationLandKind;
    }

    public void setStationLandKind(String stationLandKind) {
        this.stationLandKind = stationLandKind;
    }

    public String getLandUseTime() {
        return landUseTime;
    }

    public void setLandUseTime(String landUseTime) {
        this.landUseTime = landUseTime;
    }

    public String getLandRemainTime() {
        return landRemainTime;
    }

    public void setLandRemainTime(String landRemainTime) {
        this.landRemainTime = landRemainTime;
    }

    public String getStationKind() {
        return stationKind;
    }

    public void setStationKind(String stationKind) {
        this.stationKind = stationKind;
    }

    public Integer getChargeSum() {
        return chargeSum;
    }

    public void setChargeSum(Integer chargeSum) {
        this.chargeSum = chargeSum;
    }

    public Integer getGunSum() {
        return gunSum;
    }

    public void setGunSum(Integer gunSum) {
        this.gunSum = gunSum;
    }

    public Integer getAllowanceStatus() {
        return allowanceStatus;
    }

    public void setAllowanceStatus(Integer allowanceStatus) {
        this.allowanceStatus = allowanceStatus;
    }

    public String getAllowancePrice() {
        return allowancePrice;
    }

    public void setAllowancePrice(String allowancePrice) {
        this.allowancePrice = allowancePrice;
    }

    public Integer getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(Integer checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getInventExtend() {
        return inventExtend;
    }

    public void setInventExtend(String inventExtend) {
        this.inventExtend = inventExtend;
    }

    public Integer getStationProperty() {
        return stationProperty;
    }



    public void setStationProperty(Integer stationProperty) {
        this.stationProperty = stationProperty;
    }

    public String getStationStreet() {
        return stationStreet;
    }

    public void setStationStreet(String stationStreet) {
        this.stationStreet = stationStreet;
    }

    public Integer getServiceCarType() {
        return serviceCarType;
    }

    public void setServiceCarType(Integer serviceCarType) {
        this.serviceCarType = serviceCarType;
    }

    public Integer getLandProperty() {
        return landProperty;
    }

    public void setLandProperty(Integer landProperty) {
        this.landProperty = landProperty;
    }

    public String getOperatorProperty() {
        return operatorProperty;
    }

    public void setOperatorProperty(String operatorProperty) {
        this.operatorProperty = operatorProperty;
    }

    public Date getAllowanceDate() {
        return allowanceDate;
    }

    public void setAllowanceDate(Date allowanceDate) {
        this.allowanceDate = allowanceDate;
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
        StationHistoryInfo other = (StationHistoryInfo) that;
        return (this.getSID() == null ? other.getSID() == null : this.getSID().equals(other.getSID()))
            && (this.getStationID() == null ? other.getStationID() == null : this.getStationID().equals(other.getStationID()))
            && (this.getStationName() == null ? other.getStationName() == null : this.getStationName().equals(other.getStationName()))
            && (this.getOperatorHisID() == null ? other.getOperatorHisID() == null : this.getOperatorHisID().equals(other.getOperatorHisID()))
            && (this.getOperatorID() == null ? other.getOperatorID() == null : this.getOperatorID().equals(other.getOperatorID()))
            && (this.getEquipmentOwnerID() == null ? other.getEquipmentOwnerID() == null : this.getEquipmentOwnerID().equals(other.getEquipmentOwnerID()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStationTel() == null ? other.getStationTel() == null : this.getStationTel().equals(other.getStationTel()))
            && (this.getServiceTel() == null ? other.getServiceTel() == null : this.getServiceTel().equals(other.getServiceTel()))
            && (this.getStationType() == null ? other.getStationType() == null : this.getStationType().equals(other.getStationType()))
            && (this.getStationStatus() == null ? other.getStationStatus() == null : this.getStationStatus().equals(other.getStationStatus()))
            && (this.getParkNums() == null ? other.getParkNums() == null : this.getParkNums().equals(other.getParkNums()))
            && (this.getStationLng() == null ? other.getStationLng() == null : this.getStationLng().equals(other.getStationLng()))
            && (this.getStationLat() == null ? other.getStationLat() == null : this.getStationLat().equals(other.getStationLat()))
            && (this.getSiteGuide() == null ? other.getSiteGuide() == null : this.getSiteGuide().equals(other.getSiteGuide()))
            && (this.getConstruction() == null ? other.getConstruction() == null : this.getConstruction().equals(other.getConstruction()))
            && (this.getPictures() == null ? other.getPictures() == null : this.getPictures().equals(other.getPictures()))
            && (this.getMatchCars() == null ? other.getMatchCars() == null : this.getMatchCars().equals(other.getMatchCars()))
            && (this.getParkInfo() == null ? other.getParkInfo() == null : this.getParkInfo().equals(other.getParkInfo()))
            && (this.getBusineHours() == null ? other.getBusineHours() == null : this.getBusineHours().equals(other.getBusineHours()))
            && (this.getElectricityFee() == null ? other.getElectricityFee() == null : this.getElectricityFee().equals(other.getElectricityFee()))
            && (this.getServiceFee() == null ? other.getServiceFee() == null : this.getServiceFee().equals(other.getServiceFee()))
            && (this.getParkFee() == null ? other.getParkFee() == null : this.getParkFee().equals(other.getParkFee()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getSupportOrder() == null ? other.getSupportOrder() == null : this.getSupportOrder().equals(other.getSupportOrder()))
            && (this.getParkOwner() == null ? other.getParkOwner() == null : this.getParkOwner().equals(other.getParkOwner()))
            && (this.getParkManager() == null ? other.getParkManager() == null : this.getParkManager().equals(other.getParkManager()))
            && (this.getOpenAllDay() == null ? other.getOpenAllDay() == null : this.getOpenAllDay().equals(other.getOpenAllDay()))
            && (this.getParkFree() == null ? other.getParkFree() == null : this.getParkFree().equals(other.getParkFree()))
            && (this.getOpratorType() == null ? other.getOpratorType() == null : this.getOpratorType().equals(other.getOpratorType()))
            && (this.getBuildDate() == null ? other.getBuildDate() == null : this.getBuildDate().equals(other.getBuildDate()))
            && (this.getConnectionTime() == null ? other.getConnectionTime() == null : this.getConnectionTime().equals(other.getConnectionTime()))
            && (this.getStationPrincipal() == null ? other.getStationPrincipal() == null : this.getStationPrincipal().equals(other.getStationPrincipal()))
            && (this.getPropertyUnit() == null ? other.getPropertyUnit() == null : this.getPropertyUnit().equals(other.getPropertyUnit()))
            && (this.getInvestBuildUnit() == null ? other.getInvestBuildUnit() == null : this.getInvestBuildUnit().equals(other.getInvestBuildUnit()))
            && (this.getStationLandKind() == null ? other.getStationLandKind() == null : this.getStationLandKind().equals(other.getStationLandKind()))
            && (this.getLandUseTime() == null ? other.getLandUseTime() == null : this.getLandUseTime().equals(other.getLandUseTime()))
            && (this.getLandRemainTime() == null ? other.getLandRemainTime() == null : this.getLandRemainTime().equals(other.getLandRemainTime()))
            && (this.getStationKind() == null ? other.getStationKind() == null : this.getStationKind().equals(other.getStationKind()))
            && (this.getChargeSum() == null ? other.getChargeSum() == null : this.getChargeSum().equals(other.getChargeSum()))
            && (this.getGunSum() == null ? other.getGunSum() == null : this.getGunSum().equals(other.getGunSum()))
            && (this.getAllowanceStatus() == null ? other.getAllowanceStatus() == null : this.getAllowanceStatus().equals(other.getAllowanceStatus()))
            && (this.getAllowancePrice() == null ? other.getAllowancePrice() == null : this.getAllowancePrice().equals(other.getAllowancePrice()))
            && (this.getCheckoutStatus() == null ? other.getCheckoutStatus() == null : this.getCheckoutStatus().equals(other.getCheckoutStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRentDate() == null ? other.getRentDate() == null : this.getRentDate().equals(other.getRentDate()))
            && (this.getInventExtend() == null ? other.getInventExtend() == null : this.getInventExtend().equals(other.getInventExtend()))
            && (this.getStationProperty() == null ? other.getStationProperty() == null : this.getStationProperty().equals(other.getStationProperty()))
            && (this.getStationStreet() == null ? other.getStationStreet() == null : this.getStationStreet().equals(other.getStationStreet()))
            && (this.getServiceCarType() == null ? other.getServiceCarType() == null : this.getServiceCarType().equals(other.getServiceCarType()))
            && (this.getLandProperty() == null ? other.getLandProperty() == null : this.getLandProperty().equals(other.getLandProperty()))
            && (this.getOperatorProperty() == null ? other.getOperatorProperty() == null : this.getOperatorProperty().equals(other.getOperatorProperty()))
            && (this.getAllowanceDate() == null ? other.getAllowanceDate() == null : this.getAllowanceDate().equals(other.getAllowanceDate()))
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
        result = prime * result + ((getSID() == null) ? 0 : getSID().hashCode());
        result = prime * result + ((getStationID() == null) ? 0 : getStationID().hashCode());
        result = prime * result + ((getStationName() == null) ? 0 : getStationName().hashCode());
        result = prime * result + ((getOperatorHisID() == null) ? 0 : getOperatorHisID().hashCode());
        result = prime * result + ((getOperatorID() == null) ? 0 : getOperatorID().hashCode());
        result = prime * result + ((getEquipmentOwnerID() == null) ? 0 : getEquipmentOwnerID().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStationTel() == null) ? 0 : getStationTel().hashCode());
        result = prime * result + ((getServiceTel() == null) ? 0 : getServiceTel().hashCode());
        result = prime * result + ((getStationType() == null) ? 0 : getStationType().hashCode());
        result = prime * result + ((getStationStatus() == null) ? 0 : getStationStatus().hashCode());
        result = prime * result + ((getParkNums() == null) ? 0 : getParkNums().hashCode());
        result = prime * result + ((getStationLng() == null) ? 0 : getStationLng().hashCode());
        result = prime * result + ((getStationLat() == null) ? 0 : getStationLat().hashCode());
        result = prime * result + ((getSiteGuide() == null) ? 0 : getSiteGuide().hashCode());
        result = prime * result + ((getConstruction() == null) ? 0 : getConstruction().hashCode());
        result = prime * result + ((getPictures() == null) ? 0 : getPictures().hashCode());
        result = prime * result + ((getMatchCars() == null) ? 0 : getMatchCars().hashCode());
        result = prime * result + ((getParkInfo() == null) ? 0 : getParkInfo().hashCode());
        result = prime * result + ((getBusineHours() == null) ? 0 : getBusineHours().hashCode());
        result = prime * result + ((getElectricityFee() == null) ? 0 : getElectricityFee().hashCode());
        result = prime * result + ((getServiceFee() == null) ? 0 : getServiceFee().hashCode());
        result = prime * result + ((getParkFee() == null) ? 0 : getParkFee().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getSupportOrder() == null) ? 0 : getSupportOrder().hashCode());
        result = prime * result + ((getParkOwner() == null) ? 0 : getParkOwner().hashCode());
        result = prime * result + ((getParkManager() == null) ? 0 : getParkManager().hashCode());
        result = prime * result + ((getOpenAllDay() == null) ? 0 : getOpenAllDay().hashCode());
        result = prime * result + ((getParkFree() == null) ? 0 : getParkFree().hashCode());
        result = prime * result + ((getOpratorType() == null) ? 0 : getOpratorType().hashCode());
        result = prime * result + ((getBuildDate() == null) ? 0 : getBuildDate().hashCode());
        result = prime * result + ((getConnectionTime() == null) ? 0 : getConnectionTime().hashCode());
        result = prime * result + ((getStationPrincipal() == null) ? 0 : getStationPrincipal().hashCode());
        result = prime * result + ((getPropertyUnit() == null) ? 0 : getPropertyUnit().hashCode());
        result = prime * result + ((getInvestBuildUnit() == null) ? 0 : getInvestBuildUnit().hashCode());
        result = prime * result + ((getStationLandKind() == null) ? 0 : getStationLandKind().hashCode());
        result = prime * result + ((getLandUseTime() == null) ? 0 : getLandUseTime().hashCode());
        result = prime * result + ((getLandRemainTime() == null) ? 0 : getLandRemainTime().hashCode());
        result = prime * result + ((getStationKind() == null) ? 0 : getStationKind().hashCode());
        result = prime * result + ((getChargeSum() == null) ? 0 : getChargeSum().hashCode());
        result = prime * result + ((getGunSum() == null) ? 0 : getGunSum().hashCode());
        result = prime * result + ((getAllowanceStatus() == null) ? 0 : getAllowanceStatus().hashCode());
        result = prime * result + ((getAllowancePrice() == null) ? 0 : getAllowancePrice().hashCode());
        result = prime * result + ((getCheckoutStatus() == null) ? 0 : getCheckoutStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRentDate() == null) ? 0 : getRentDate().hashCode());
        result = prime * result + ((getInventExtend() == null) ? 0 : getInventExtend().hashCode());
        result = prime * result + ((getStationProperty() == null) ? 0 : getStationProperty().hashCode());
        result = prime * result + ((getStationStreet() == null) ? 0 : getStationStreet().hashCode());
        result = prime * result + ((getServiceCarType() == null) ? 0 : getServiceCarType().hashCode());
        result = prime * result + ((getLandProperty() == null) ? 0 : getLandProperty().hashCode());
        result = prime * result + ((getOperatorProperty() == null) ? 0 : getOperatorProperty().hashCode());
        result = prime * result + ((getAllowanceDate() == null) ? 0 : getAllowanceDate().hashCode());
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
        sb.append(", sID=").append(sID);
        sb.append(", stationID=").append(stationID);
        sb.append(", stationName=").append(stationName);
        sb.append(", operatorHisID=").append(operatorHisID);
        sb.append(", operatorID=").append(operatorID);
        sb.append(", equipmentOwnerID=").append(equipmentOwnerID);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", address=").append(address);
        sb.append(", stationTel=").append(stationTel);
        sb.append(", serviceTel=").append(serviceTel);
        sb.append(", stationType=").append(stationType);
        sb.append(", stationStatus=").append(stationStatus);
        sb.append(", parkNums=").append(parkNums);
        sb.append(", stationLng=").append(stationLng);
        sb.append(", stationLat=").append(stationLat);
        sb.append(", siteGuide=").append(siteGuide);
        sb.append(", construction=").append(construction);
        sb.append(", pictures=").append(pictures);
        sb.append(", matchCars=").append(matchCars);
        sb.append(", parkInfo=").append(parkInfo);
        sb.append(", busineHours=").append(busineHours);
        sb.append(", electricityFee=").append(electricityFee);
        sb.append(", serviceFee=").append(serviceFee);
        sb.append(", parkFee=").append(parkFee);
        sb.append(", payment=").append(payment);
        sb.append(", supportOrder=").append(supportOrder);
        sb.append(", parkOwner=").append(parkOwner);
        sb.append(", parkManager=").append(parkManager);
        sb.append(", openAllDay=").append(openAllDay);
        sb.append(", parkFree=").append(parkFree);
        sb.append(", opratorType=").append(opratorType);
        sb.append(", buildDate=").append(buildDate);
        sb.append(", connectionTime=").append(connectionTime);
        sb.append(", stationPrincipal=").append(stationPrincipal);
        sb.append(", propertyUnit=").append(propertyUnit);
        sb.append(", investBuildUnit=").append(investBuildUnit);
        sb.append(", stationLandKind=").append(stationLandKind);
        sb.append(", landUseTime=").append(landUseTime);
        sb.append(", landRemainTime=").append(landRemainTime);
        sb.append(", stationKind=").append(stationKind);
        sb.append(", chargeSum=").append(chargeSum);
        sb.append(", gunSum=").append(gunSum);
        sb.append(", allowanceStatus=").append(allowanceStatus);
        sb.append(", allowancePrice=").append(allowancePrice);
        sb.append(", checkoutStatus=").append(checkoutStatus);
        sb.append(", remark=").append(remark);
        sb.append(", rentDate=").append(rentDate);
        sb.append(", inventExtend=").append(inventExtend);
        sb.append(", stationProperty=").append(stationProperty);
        sb.append(", stationStreet=").append(stationStreet);
        sb.append(", serviceCarType=").append(serviceCarType);
        sb.append(", landProperty=").append(landProperty);
        sb.append(", operatorProperty=").append(operatorProperty);
        sb.append(", allowanceDate=").append(allowanceDate);
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