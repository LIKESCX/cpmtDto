package com.cpit.cpmt.dto.battery;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AnaBmsSingleChargeWarningResult implements Serializable {
    private static final long serialVersionUID = 1L;
	/**
     * BMS编码
     */
    private String bMSCode;
    /**
     * BMS版本
     */
    private String bMSVer;

    /**
     * 运营商唯一id
     */
    private String operatorId;

    /**
     * 设备接口编码
     */
    private String connectorId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
	/**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;


    /**
     * 预警代码
     */
    private Integer warningCode;

    /**
     * 预警描述
     */
    private String warningDesc;

    /**
     * 预警等级
     */
    private Integer warningLevel;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDate;

    /**
     * 对应的日期所在的周日(以结束时间为准)
     */
    private String statisticalWeek;

    /**
     * 对应的月份(以结束时间为准)
     */
    private String statisticalMonth;

    /**
     * 对应的季度(以结束时间为准)
     */
    private String statisticalSeason;
    /**
     * 对应的年度(以结束时间为准)
     */
    private String statisticalYear;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getbMSCode() {
		return bMSCode;
	}

	public void setbMSCode(String bMSCode) {
		this.bMSCode = bMSCode;
	}

	public String getbMSVer() {
		return bMSVer;
	}

	public void setbMSVer(String bMSVer) {
		this.bMSVer = bMSVer;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }

    public String getWarningDesc() {
        return warningDesc;
    }

    public void setWarningDesc(String warningDesc) {
        this.warningDesc = warningDesc;
    }

    public Integer getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
    }

    public String getStatisticalDate() {
        return statisticalDate;
    }

    public void setStatisticalDate(String statisticalDate) {
        this.statisticalDate = statisticalDate;
    }

    public String getStatisticalWeek() {
        return statisticalWeek;
    }

    public void setStatisticalWeek(String statisticalWeek) {
        this.statisticalWeek = statisticalWeek;
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
    

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getStatisticalYear() {
		return statisticalYear;
	}

	public void setStatisticalYear(String statisticalYear) {
		this.statisticalYear = statisticalYear;
	}

	@Override
	public String toString() {
		return "AnaBmsSingleChargeWarningResult [bMSCode=" + bMSCode + ", bMSVer=" + bMSVer + ", operatorId="
				+ operatorId + ", connectorId=" + connectorId + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", stationId=" + stationId + ", equipmentId=" + equipmentId + ", warningCode=" + warningCode
				+ ", warningDesc=" + warningDesc + ", warningLevel=" + warningLevel + ", statisticalDate="
				+ statisticalDate + ", statisticalWeek=" + statisticalWeek + ", statisticalMonth=" + statisticalMonth
				+ ", statisticalSeason=" + statisticalSeason + "]";
	}
}