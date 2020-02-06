package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBatteryMonthPerformanceHistoryAnalysis implements Serializable {
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
     * 电池历史健康度
     */
    private Integer historySoh;

    /**
     * 电池剩余容量
     */
    private Integer historyRemainCapacity;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDay;

    /**
     * 对应的月份(以结束时间为准)
     */
    private String statisticalMonth;
    /**
     * 对应的季份(以结束时间为准)
     */
    private String statisticalSeason;
    
    /**
     * 对应的年份(以结束时间为准)
     */
    private String statisticalYear;

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

    public Integer getHistorySoh() {
        return historySoh;
    }

    public void setHistorySoh(Integer historySoh) {
        this.historySoh = historySoh;
    }

    public Integer getHistoryRemainCapacity() {
        return historyRemainCapacity;
    }

    public void setHistoryRemainCapacity(Integer historyRemainCapacity) {
        this.historyRemainCapacity = historyRemainCapacity;
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
        AnaBatteryMonthPerformanceHistoryAnalysis other = (AnaBatteryMonthPerformanceHistoryAnalysis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBmsCode() == null ? other.getBmsCode() == null : this.getBmsCode().equals(other.getBmsCode()))
            && (this.getBmsVer() == null ? other.getBmsVer() == null : this.getBmsVer().equals(other.getBmsVer()))
            && (this.getHistorySoh() == null ? other.getHistorySoh() == null : this.getHistorySoh().equals(other.getHistorySoh()))
            && (this.getHistoryRemainCapacity() == null ? other.getHistoryRemainCapacity() == null : this.getHistoryRemainCapacity().equals(other.getHistoryRemainCapacity()))
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
        result = prime * result + ((getHistorySoh() == null) ? 0 : getHistorySoh().hashCode());
        result = prime * result + ((getHistoryRemainCapacity() == null) ? 0 : getHistoryRemainCapacity().hashCode());
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
        sb.append(", historySoh=").append(historySoh);
        sb.append(", historyRemainCapacity=").append(historyRemainCapacity);
        sb.append(", statisticalDay=").append(statisticalDay);
        sb.append(", statisticalMonth=").append(statisticalMonth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}