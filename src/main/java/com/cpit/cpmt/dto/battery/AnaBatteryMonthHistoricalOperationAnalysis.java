package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBatteryMonthHistoricalOperationAnalysis implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * BMS编码
     */
    private String bmsCode;

    /**
     * BMS版本
     */
    private String bmsVer;

    /**
     * 历史充电次数
     */
    private Integer historyTimes;

    /**
     * 历史充电时间长度，单位秒
     */
    private Integer historyChargeTime;

    /**
     * 历史最快充电时间长度，单位秒
     */
    private Integer historyMaxChargeTime;

    /**
     * 历史最慢充电时间长度，单位秒
     */
    private Integer historyMinChargeTime;

    /**
     * 最大充电电压
     */
    private Float maxChargingVoltage;

    /**
     * 最大充电电流
     */
    private Float maxChargingCurrent;

    /**
     * 最高单体电压
     */
    private Float historyVoltageH;

    /**
     * 最低单体电压
     */
    private Float historyVoltageL;

    /**
     * 最高温度同单体最高温度
     */
    private Integer historyTemptureH;

    /**
     * 最低温度同单体最低温度
     */
    private String historyTemptureL;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDay;

    /**
     * 对应的月份(以结束时间为准)
     */
    private String statisticalMonth;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBmsCode() {
        return bmsCode;
    }

    public void setBmsCode(String bmsCode) {
        this.bmsCode = bmsCode;
    }

    public String getBmsVer() {
        return bmsVer;
    }

    public void setBmsVer(String bmsVer) {
        this.bmsVer = bmsVer;
    }

    public Integer getHistoryTimes() {
        return historyTimes;
    }

    public void setHistoryTimes(Integer historyTimes) {
        this.historyTimes = historyTimes;
    }

    public Integer getHistoryChargeTime() {
        return historyChargeTime;
    }

    public void setHistoryChargeTime(Integer historyChargeTime) {
        this.historyChargeTime = historyChargeTime;
    }

    public Integer getHistoryMaxChargeTime() {
        return historyMaxChargeTime;
    }

    public void setHistoryMaxChargeTime(Integer historyMaxChargeTime) {
        this.historyMaxChargeTime = historyMaxChargeTime;
    }

    public Integer getHistoryMinChargeTime() {
        return historyMinChargeTime;
    }

    public void setHistoryMinChargeTime(Integer historyMinChargeTime) {
        this.historyMinChargeTime = historyMinChargeTime;
    }

    public Float getMaxChargingVoltage() {
        return maxChargingVoltage;
    }

    public void setMaxChargingVoltage(Float maxChargingVoltage) {
        this.maxChargingVoltage = maxChargingVoltage;
    }

    public Float getMaxChargingCurrent() {
        return maxChargingCurrent;
    }

    public void setMaxChargingCurrent(Float maxChargingCurrent) {
        this.maxChargingCurrent = maxChargingCurrent;
    }

    public Float getHistoryVoltageH() {
        return historyVoltageH;
    }

    public void setHistoryVoltageH(Float historyVoltageH) {
        this.historyVoltageH = historyVoltageH;
    }

    public Float getHistoryVoltageL() {
        return historyVoltageL;
    }

    public void setHistoryVoltageL(Float historyVoltageL) {
        this.historyVoltageL = historyVoltageL;
    }

    public Integer getHistoryTemptureH() {
        return historyTemptureH;
    }

    public void setHistoryTemptureH(Integer historyTemptureH) {
        this.historyTemptureH = historyTemptureH;
    }

    public String getHistoryTemptureL() {
        return historyTemptureL;
    }

    public void setHistoryTemptureL(String historyTemptureL) {
        this.historyTemptureL = historyTemptureL;
    }

    public String getStatisticalDay() {
        return statisticalDay;
    }

    public void setStatisticalDay(String statisticalDay) {
        this.statisticalDay = statisticalDay;
    }

    public String getStatisticalMonth() {
        return statisticalMonth;
    }

    public void setStatisticalMonth(String statisticalMonth) {
        this.statisticalMonth = statisticalMonth;
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
        AnaBatteryMonthHistoricalOperationAnalysis other = (AnaBatteryMonthHistoricalOperationAnalysis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBmsCode() == null ? other.getBmsCode() == null : this.getBmsCode().equals(other.getBmsCode()))
            && (this.getBmsVer() == null ? other.getBmsVer() == null : this.getBmsVer().equals(other.getBmsVer()))
            && (this.getHistoryTimes() == null ? other.getHistoryTimes() == null : this.getHistoryTimes().equals(other.getHistoryTimes()))
            && (this.getHistoryChargeTime() == null ? other.getHistoryChargeTime() == null : this.getHistoryChargeTime().equals(other.getHistoryChargeTime()))
            && (this.getHistoryMaxChargeTime() == null ? other.getHistoryMaxChargeTime() == null : this.getHistoryMaxChargeTime().equals(other.getHistoryMaxChargeTime()))
            && (this.getHistoryMinChargeTime() == null ? other.getHistoryMinChargeTime() == null : this.getHistoryMinChargeTime().equals(other.getHistoryMinChargeTime()))
            && (this.getMaxChargingVoltage() == null ? other.getMaxChargingVoltage() == null : this.getMaxChargingVoltage().equals(other.getMaxChargingVoltage()))
            && (this.getMaxChargingCurrent() == null ? other.getMaxChargingCurrent() == null : this.getMaxChargingCurrent().equals(other.getMaxChargingCurrent()))
            && (this.getHistoryVoltageH() == null ? other.getHistoryVoltageH() == null : this.getHistoryVoltageH().equals(other.getHistoryVoltageH()))
            && (this.getHistoryVoltageL() == null ? other.getHistoryVoltageL() == null : this.getHistoryVoltageL().equals(other.getHistoryVoltageL()))
            && (this.getHistoryTemptureH() == null ? other.getHistoryTemptureH() == null : this.getHistoryTemptureH().equals(other.getHistoryTemptureH()))
            && (this.getHistoryTemptureL() == null ? other.getHistoryTemptureL() == null : this.getHistoryTemptureL().equals(other.getHistoryTemptureL()))
            && (this.getStatisticalDay() == null ? other.getStatisticalDay() == null : this.getStatisticalDay().equals(other.getStatisticalDay()))
            && (this.getStatisticalMonth() == null ? other.getStatisticalMonth() == null : this.getStatisticalMonth().equals(other.getStatisticalMonth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBmsCode() == null) ? 0 : getBmsCode().hashCode());
        result = prime * result + ((getBmsVer() == null) ? 0 : getBmsVer().hashCode());
        result = prime * result + ((getHistoryTimes() == null) ? 0 : getHistoryTimes().hashCode());
        result = prime * result + ((getHistoryChargeTime() == null) ? 0 : getHistoryChargeTime().hashCode());
        result = prime * result + ((getHistoryMaxChargeTime() == null) ? 0 : getHistoryMaxChargeTime().hashCode());
        result = prime * result + ((getHistoryMinChargeTime() == null) ? 0 : getHistoryMinChargeTime().hashCode());
        result = prime * result + ((getMaxChargingVoltage() == null) ? 0 : getMaxChargingVoltage().hashCode());
        result = prime * result + ((getMaxChargingCurrent() == null) ? 0 : getMaxChargingCurrent().hashCode());
        result = prime * result + ((getHistoryVoltageH() == null) ? 0 : getHistoryVoltageH().hashCode());
        result = prime * result + ((getHistoryVoltageL() == null) ? 0 : getHistoryVoltageL().hashCode());
        result = prime * result + ((getHistoryTemptureH() == null) ? 0 : getHistoryTemptureH().hashCode());
        result = prime * result + ((getHistoryTemptureL() == null) ? 0 : getHistoryTemptureL().hashCode());
        result = prime * result + ((getStatisticalDay() == null) ? 0 : getStatisticalDay().hashCode());
        result = prime * result + ((getStatisticalMonth() == null) ? 0 : getStatisticalMonth().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bmsCode=").append(bmsCode);
        sb.append(", bmsVer=").append(bmsVer);
        sb.append(", historyTimes=").append(historyTimes);
        sb.append(", historyChargeTime=").append(historyChargeTime);
        sb.append(", historyMaxChargeTime=").append(historyMaxChargeTime);
        sb.append(", historyMinChargeTime=").append(historyMinChargeTime);
        sb.append(", maxChargingVoltage=").append(maxChargingVoltage);
        sb.append(", maxChargingCurrent=").append(maxChargingCurrent);
        sb.append(", historyVoltageH=").append(historyVoltageH);
        sb.append(", historyVoltageL=").append(historyVoltageL);
        sb.append(", historyTemptureH=").append(historyTemptureH);
        sb.append(", historyTemptureL=").append(historyTemptureL);
        sb.append(", statisticalDay=").append(statisticalDay);
        sb.append(", statisticalMonth=").append(statisticalMonth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}