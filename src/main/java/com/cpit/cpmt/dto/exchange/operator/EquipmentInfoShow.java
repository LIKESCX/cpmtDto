package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.exchange.basic.ConnectorInfo;
import com.cpit.cpmt.dto.exchange.basic.EquipmentInfo;
import com.cpit.cpmt.dto.system.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author 
 */
public class EquipmentInfoShow extends EquipmentInfo {
    private static final long serialVersionUID = 1L;

    private String eid;

    private String sid;
    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 补贴状态  0：未申请 1：申请中；2 审核中；3：待补贴；4：已补贴； 5：审核不通过
     */
    private String allowanceStatus;

    /*
     * 补贴金额
     * */
    private String allowancePrice;

    /*
     * 补贴时间
     * */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date allowanceDate;

    /*
    *使用期限 单位：年
    * */
    private Integer periodUse;

    /*
     * 入库时间
     * */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date inDate;

    /*
     * 报废时间
     * */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date worthDate;

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

    //充电站对象
    private StationInfoShow stationInfo;

    //运营商id集合
    private List<String> operatorIdList;

    //areacode集合
    private List<String> areaCodeList;

    private List<String> chargeIdList;

    private Integer numbers;

    /*
     * 设备接口列表
     * */
    private List<ConnectorInfoShow> connectorShowInfos;

    //动态-累计充电量
    private String chargeElecticSum;

    //累计放电量
    private String disChargeEleticsSum;

    //当月充电量
    private String chargeElecticByMonth;

    //累计充电次数
    private Integer chargTimes;

    //实时功率
    private String realTimePower;

    //累计故障次数
    private Integer chargeErrorTimes;

    //使用率
    private String UseRate;

    //故障率
    private String errorRate;

    //抽查检验
    private String selectCheck;

    //通过数量
    private String passNum;

    //充电电能
    private String chargeElectricEnergy;

    //放电电能
    private String disChargeElectricEnergy;

    //累计使用时间
    private String totalUseTime;

    //充电设备接口累计充电量
    private String connectorElecticSum;

    //累计放电量
    private String disConnectorEleticsSum;

    //备注
    private String note;

    //用户
    private User user;

    //补贴状态list
    private List<Object> statusList;

    /*
     *操作类型  1.新增  2.变更
     * */
    private Integer operateType;

    //stationTypeList
    private List<Integer> stationTypeList;

    /**
     * 充电站省市辖区编码
     */
    private String areaCode;

    public Date getWorthDate() {
        return worthDate;
    }

    public void setWorthDate(Date worthDate) {
        this.worthDate = worthDate;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<Integer> getStationTypeList() {
        return stationTypeList;
    }

    public void setStationTypeList(List<Integer> stationTypeList) {
        this.stationTypeList = stationTypeList;
    }

    public Integer getPeriodUse() {
        return periodUse;
    }

    public void setPeriodUse(Integer periodUse) {
        this.periodUse = periodUse;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
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

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public List<ConnectorInfoShow> getConnectorShowInfos() {
        return connectorShowInfos;
    }

    public void setConnectorShowInfos(List<ConnectorInfoShow> connectorShowInfos) {
        this.connectorShowInfos = connectorShowInfos;
    }

    public List<String> getChargeIdList() {
        return chargeIdList;
    }

    public void setChargeIdList(List<String> chargeIdList) {
        this.chargeIdList = chargeIdList;
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

    public String getChargeElecticSum() {
        return chargeElecticSum;
    }

    public void setChargeElecticSum(String chargeElecticSum) {
        this.chargeElecticSum = chargeElecticSum;
    }

    public String getDisChargeEleticsSum() {
        return disChargeEleticsSum;
    }

    public void setDisChargeEleticsSum(String disChargeEleticsSum) {
        this.disChargeEleticsSum = disChargeEleticsSum;
    }

    public String getChargeElecticByMonth() {
        return chargeElecticByMonth;
    }

    public void setChargeElecticByMonth(String chargeElecticByMonth) {
        this.chargeElecticByMonth = chargeElecticByMonth;
    }

    public Integer getChargTimes() {
        return chargTimes;
    }

    public void setChargTimes(Integer chargTimes) {
        this.chargTimes = chargTimes;
    }

    public String getRealTimePower() {
        return realTimePower;
    }

    public void setRealTimePower(String realTimePower) {
        this.realTimePower = realTimePower;
    }

    public Integer getChargeErrorTimes() {
        return chargeErrorTimes;
    }

    public void setChargeErrorTimes(Integer chargeErrorTimes) {
        this.chargeErrorTimes = chargeErrorTimes;
    }

    public String getUseRate() {
        return UseRate;
    }

    public void setUseRate(String useRate) {
        UseRate = useRate;
    }

    public String getErrorRate() {
        return errorRate;
    }

    public void setErrorRate(String errorRate) {
        this.errorRate = errorRate;
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

    public String getChargeElectricEnergy() {
        return chargeElectricEnergy;
    }

    public void setChargeElectricEnergy(String chargeElectricEnergy) {
        this.chargeElectricEnergy = chargeElectricEnergy;
    }

    public String getDisChargeElectricEnergy() {
        return disChargeElectricEnergy;
    }

    public void setDisChargeElectricEnergy(String disChargeElectricEnergy) {
        this.disChargeElectricEnergy = disChargeElectricEnergy;
    }

    public String getTotalUseTime() {
        return totalUseTime;
    }

    public void setTotalUseTime(String totalUseTime) {
        this.totalUseTime = totalUseTime;
    }

    public String getConnectorElecticSum() {
        return connectorElecticSum;
    }

    public void setConnectorElecticSum(String connectorElecticSum) {
        this.connectorElecticSum = connectorElecticSum;
    }

    public String getDisConnectorEleticsSum() {
        return disConnectorEleticsSum;
    }

    public void setDisConnectorEleticsSum(String disConnectorEleticsSum) {
        this.disConnectorEleticsSum = disConnectorEleticsSum;
    }

    public String getStationId() {
        return stationId;
    }


    public void setStationId(String stationId) {
        this.stationId = stationId;
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

    public StationInfoShow getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(StationInfoShow stationInfo) {
        this.stationInfo = stationInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentInfoShow)) return false;
        if (!super.equals(o)) return false;
        EquipmentInfoShow that = (EquipmentInfoShow) o;
        return Objects.equals(stationId, that.stationId) &&
                Objects.equals(allowanceStatus, that.allowanceStatus) &&
                Objects.equals(allowancePrice, that.allowancePrice) &&
                Objects.equals(checkoutStatus, that.checkoutStatus) &&
                Objects.equals(ratedInVoltage, that.ratedInVoltage) &&
                Objects.equals(ratedOutVoltage, that.ratedOutVoltage) &&
                Objects.equals(ratedPower, that.ratedPower) &&
                Objects.equals(feedNum, that.feedNum) &&
                Objects.equals(gunSum, that.gunSum) &&
                Objects.equals(stationInfo, that.stationInfo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), stationId, allowanceStatus, allowancePrice, checkoutStatus, ratedInVoltage, ratedOutVoltage, ratedPower, feedNum, gunSum, stationInfo);
    }

    @Override
    public String toString() {
        return "EquipmentInfoShow{" +
                "stationId='" + stationId + '\'' +
                ", allowanceStatus='" + allowanceStatus + '\'' +
                ", allowancePrice='" + allowancePrice + '\'' +
                ", checkoutStatus='" + checkoutStatus + '\'' +
                ", ratedInVoltage='" + ratedInVoltage + '\'' +
                ", ratedOutVoltage='" + ratedOutVoltage + '\'' +
                ", ratedPower='" + ratedPower + '\'' +
                ", feedNum=" + feedNum +
                ", gunSum=" + gunSum +
                ", stationInfo=" + stationInfo +
                '}';
    }
}