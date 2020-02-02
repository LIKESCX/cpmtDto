package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.exchange.basic.OperatorInfo;
import com.cpit.cpmt.dto.exchange.basic.StationInfo;
import com.cpit.cpmt.dto.monitor.StationEvaluateResult;
import com.cpit.cpmt.dto.system.Area;
import com.cpit.cpmt.dto.system.AreaStreet;
import com.cpit.cpmt.dto.system.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author 
 */
public class StationInfoShow extends StationInfo {
    private static final long serialVersionUID = 1L;

    private String sid;

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
     * 充电站占地类型  自有 租赁
     */
    private String stationLandKind;

    /*
    * 租赁期限
    * */
    private String rentDate;

    /**
     * 用地已使用时间
     */
    private String landUseTime;

    /**
     * 预计剩余用地时间 （填具体时间，未发生租赁或无具体时间的填“无”）
     */
    private String landRemainTime;

    /*
    * 投资规模
    * */
    private String inventExtend;

    /**
     * 充电站（桩）类型    1.集中式，2.分散式
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

    /*
    * 补贴金额
    * */
    private String allowancePrice;

    /*
     * 补贴时间
     * */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date allowanceDate;

    /**
     * 检测状态  1：未检测；2：检测通过；3：检测不通过
     */
    private Integer checkoutStatus;

    /*
    * 充电站性质  1.公用，2.专用
    * */
    private Integer stationProperty;

    /*
    * 充电站街道
    * */
    private String stationStreet;

    /*
    * 服务车辆类型 1.公交 2.网约车 3.物流货车 4.通勤车 5.大巴  6.私人乘用车 7.环卫泥头车
    * */
    private Integer serviceCarType;

    /*
    * 用地性质  1.国有用地 2.集体用地 3.临时用地
    * */
    private Integer landProperty;

    /*
    * 运营商性质
    * */
    private String operatorProperty;

    //运营商对象
    private OperatorInfo operatorInfo;

    //充电站图片列表
    private List<ChargeFile> pictureList;

    //运营商id集合
    private List<String> operatorIdList;

    private List<EquipmentInfoShow> equipmentShowInfos;

    //areacode集合
    List<String> areaCodeList;

    Area area;

    AreaStreet areaStreet;
    //开始时间
    private Date startDate;
    //结束时间
    private Date endDate;

    //周日
    private String sunday;

    //周六
    private String saturday;

    //告警状态
    private String alarmStatus;

    //动态--总功率
    private Double powerSum;

    //累计充电量
    private String chargeElecticSum;

    //累计放电量
    private String disChargeEleticsSum;

    //累计充电次数
    private Integer chargTimes;

    //累计故障次数
    private Integer chargeErrorTimes;

    //故障率
    private String errorRate;

    //累计服务时间
    private String totalServiceTime;

    //实时功率
    private String realTimePower;

    //当月使用率
    private String currentUseRate;

    //抽查检验
    private String selectCheck;

    //通过数量
    private String passNum;

    //小时
    private String hours;

    //用户
    private User user;

    //补贴状态list
    private List<Object> statusList;

    /*
     *操作类型  1.新增  2.变更
     * */
    private Integer operateType;

    private StationEvaluateResult stationEvaluateResult;

    public StationEvaluateResult getStationEvaluateResult() {
        return stationEvaluateResult;
    }

    public void setStationEvaluateResult(StationEvaluateResult stationEvaluateResult) {
        this.stationEvaluateResult = stationEvaluateResult;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public List<Object> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Object> statusList) {
        this.statusList = statusList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
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

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getAllowanceDate() {
        return allowanceDate;
    }

    public void setAllowanceDate(Date allowanceDate) {
        this.allowanceDate = allowanceDate;
    }

    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public List<EquipmentInfoShow> getEquipmentShowInfos() {
        return equipmentShowInfos;
    }

    public void setEquipmentShowInfos(List<EquipmentInfoShow> equipmentShowInfos) {
        this.equipmentShowInfos = equipmentShowInfos;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public AreaStreet getAreaStreet() {
        return areaStreet;
    }

    public void setAreaStreet(AreaStreet areaStreet) {
        this.areaStreet = areaStreet;
    }

    public List<String> getOperatorIdList() {
        return operatorIdList;
    }

    public void setOperatorIdList(List<String> operatorIdList) {
        this.operatorIdList = operatorIdList;
    }

    public List<String> getAreaCodeList() {
        return areaCodeList;
    }

    public void setAreaCodeList(List<String> areaCodeList) {
        this.areaCodeList = areaCodeList;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getErrorRate() {
        return errorRate;
    }

    public void setErrorRate(String errorRate) {
        this.errorRate = errorRate;
    }

    public String getTotalServiceTime() {
        return totalServiceTime;
    }

    public void setTotalServiceTime(String totalServiceTime) {
        this.totalServiceTime = totalServiceTime;
    }

    public String getRealTimePower() {
        return realTimePower;
    }

    public void setRealTimePower(String realTimePower) {
        this.realTimePower = realTimePower;
    }

    public String getCurrentUseRate() {
        return currentUseRate;
    }

    public void setCurrentUseRate(String currentUseRate) {
        this.currentUseRate = currentUseRate;
    }

    public String getSelectCheck() {
        return selectCheck;
    }

    public void setSelectCheck(String selectCheck) {
        this.selectCheck = selectCheck;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public List<ChargeFile> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<ChargeFile> pictureList) {
        this.pictureList = pictureList;
    }

    public String getDisChargeEleticsSum() {
        return disChargeEleticsSum;
    }

    public void setDisChargeEleticsSum(String disChargeEleticsSum) {
        this.disChargeEleticsSum = disChargeEleticsSum;
    }

    public Integer getChargTimes() {
        return chargTimes;
    }

    public void setChargTimes(Integer chargTimes) {
        this.chargTimes = chargTimes;
    }

    public Integer getChargeErrorTimes() {
        return chargeErrorTimes;
    }

    public void setChargeErrorTimes(Integer chargeErrorTimes) {
        this.chargeErrorTimes = chargeErrorTimes;
    }

    public Double getPowerSum() {
        return powerSum;
    }

    public void setPowerSum(Double powerSum) {
        this.powerSum = powerSum;
    }

    public String getChargeElecticSum() {
        return chargeElecticSum;
    }

    public void setChargeElecticSum(String chargeElecticSum) {
        this.chargeElecticSum = chargeElecticSum;
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

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
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

    public String getInventExtend() {
        return inventExtend;
    }

    public void setInventExtend(String inventExtend) {
        this.inventExtend = inventExtend;
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

    public OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationInfoShow)) return false;
        if (!super.equals(o)) return false;
        StationInfoShow that = (StationInfoShow) o;
        return Objects.equals(buildDate, that.buildDate) &&
                Objects.equals(connectionTime, that.connectionTime) &&
                Objects.equals(stationPrincipal, that.stationPrincipal) &&
                Objects.equals(propertyUnit, that.propertyUnit) &&
                Objects.equals(investBuildUnit, that.investBuildUnit) &&
                Objects.equals(stationLandKind, that.stationLandKind) &&
                Objects.equals(rentDate, that.rentDate) &&
                Objects.equals(landUseTime, that.landUseTime) &&
                Objects.equals(landRemainTime, that.landRemainTime) &&
                Objects.equals(inventExtend, that.inventExtend) &&
                Objects.equals(stationKind, that.stationKind) &&
                Objects.equals(chargeSum, that.chargeSum) &&
                Objects.equals(gunSum, that.gunSum) &&
                Objects.equals(allowanceStatus, that.allowanceStatus) &&
                Objects.equals(allowancePrice, that.allowancePrice) &&
                Objects.equals(checkoutStatus, that.checkoutStatus) &&
                Objects.equals(stationProperty, that.stationProperty) &&
                Objects.equals(stationStreet, that.stationStreet) &&
                Objects.equals(serviceCarType, that.serviceCarType) &&
                Objects.equals(landProperty, that.landProperty) &&
                Objects.equals(operatorProperty, that.operatorProperty) &&
                Objects.equals(operatorInfo, that.operatorInfo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), buildDate, connectionTime, stationPrincipal, propertyUnit, investBuildUnit, stationLandKind, rentDate, landUseTime, landRemainTime, inventExtend, stationKind, chargeSum, gunSum, allowanceStatus, allowancePrice, checkoutStatus, stationProperty, stationStreet, serviceCarType, landProperty, operatorProperty, operatorInfo);
    }

    @Override
    public String toString() {
        return "StationInfoShow{" +
                "buildDate=" + buildDate +
                ", connectionTime=" + connectionTime +
                ", stationPrincipal='" + stationPrincipal + '\'' +
                ", propertyUnit='" + propertyUnit + '\'' +
                ", investBuildUnit='" + investBuildUnit + '\'' +
                ", stationLandKind='" + stationLandKind + '\'' +
                ", rentDate='" + rentDate + '\'' +
                ", landUseTime='" + landUseTime + '\'' +
                ", landRemainTime='" + landRemainTime + '\'' +
                ", inventExtend='" + inventExtend + '\'' +
                ", stationKind='" + stationKind + '\'' +
                ", chargeSum=" + chargeSum +
                ", gunSum=" + gunSum +
                ", allowanceStatus=" + allowanceStatus +
                ", allowancePrice='" + allowancePrice + '\'' +
                ", checkoutStatus=" + checkoutStatus +
                ", stationProperty=" + stationProperty +
                ", stationStreet='" + stationStreet + '\'' +
                ", serviceCarType=" + serviceCarType +
                ", landProperty=" + landProperty +
                ", operatorProperty='" + operatorProperty + '\'' +
                ", operatorInfo=" + operatorInfo +
                ", powerSum=" + powerSum +
                ", chargeElecticSum='" + chargeElecticSum + '\'' +
                ", disChargeEleticsSum='" + disChargeEleticsSum + '\'' +
                ", chargTimes=" + chargTimes +
                ", chargeErrorTimes=" + chargeErrorTimes +
                '}';
    }
}