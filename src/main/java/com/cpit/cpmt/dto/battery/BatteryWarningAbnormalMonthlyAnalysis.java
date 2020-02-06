package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

public class BatteryWarningAbnormalMonthlyAnalysis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//电池编码
	private String bmsCode;
	
	//电池版本号
	private String bmsVer;

	//本月度告警次数
	private Integer warningTimes;
	
	//本月度告警率(本月/季/年告警次数/历史充电次数)
	private Double warningRate;
	
	//告警类型(对应预警代码)
	private Integer warningCode;
	
	//每种告警类型的数量
	private Integer warningCodeTimes;
	
	//告警级别(对应预警等级) 
	//注：告警等级是相同告警严重程度的体现，一级表示最严重，二级表示一般严重，三级表示不严重；
	private Integer warningLevel;
	
	//每种告警级别对应的数量
	private Integer warningLevelTimes;
	
	//对应的月份
	private String statisticalMonth;
	
	//对应的季份
	private String statisticalSeason;
	
	//对应的年份
	private String statisticalYear;

	public Integer getWarningTimes() {
		return warningTimes;
	}

	public void setWarningTimes(Integer warningTimes) {
		this.warningTimes = warningTimes;
	}

	public Double getWarningRate() {
		return warningRate;
	}

	public void setWarningRate(Double warningRate) {
		this.warningRate = warningRate;
	}

	public Integer getWarningCode() {
		return warningCode;
	}

	public void setWarningCode(Integer warningCode) {
		this.warningCode = warningCode;
	}

	public Integer getWarningCodeTimes() {
		return warningCodeTimes;
	}

	public void setWarningCodeTimes(Integer warningCodeTimes) {
		this.warningCodeTimes = warningCodeTimes;
	}

	public Integer getWarningLevel() {
		return warningLevel;
	}

	public void setWarningLevel(Integer warningLevel) {
		this.warningLevel = warningLevel;
	}

	public Integer getWarningLevelTimes() {
		return warningLevelTimes;
	}

	public void setWarningLevelTimes(Integer warningLevelTimes) {
		this.warningLevelTimes = warningLevelTimes;
	}

	public String getStatisticalMonth() {
		return statisticalMonth;
	}

	public void setStatisticalMonth(String statisticalMonth) {
		this.statisticalMonth = statisticalMonth;
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

	public String getStatisticalSeason() {
		return statisticalSeason;
	}

	public void setStatisticalSeason(String statisticalSeason) {
		this.statisticalSeason = statisticalSeason;
	}

	public String getStatisticalYear() {
		return statisticalYear;
	}

	public void setStatisticalYear(String statisticalYear) {
		this.statisticalYear = statisticalYear;
	}
	
}
