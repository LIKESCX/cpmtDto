package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBatteryMonthBasicInformation implements Serializable {
    private static final long serialVersionUID = 1L;
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
     * 车辆用途
     */
    private String vehicleUse;

    /**
     * 电池额定容量
     */
    private String ratedCapacity;

    /**
     * 额定电压
     */
    private String ratedVoltage;

    /**
     * 综合评估 优 良 一般
     */
    private String comprehensiveAssessment;

    /**
     * 电池健康度
     */
    private Integer sOH;

    /**
     * 电池剩余容量
     */
    private Integer remainCapacity;

    /**
     * 电池内阻估算
     */
    private Integer estiR;
    
    /**
     * 对应的月份
     */
    private String statisticalMonth;

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

    public String getVehicleUse() {
        return vehicleUse;
    }

    public void setVehicleUse(String vehicleUse) {
        this.vehicleUse = vehicleUse;
    }

    public String getRatedCapacity() {
        return ratedCapacity;
    }

    public void setRatedCapacity(String ratedCapacity) {
        this.ratedCapacity = ratedCapacity;
    }

    public String getRatedVoltage() {
        return ratedVoltage;
    }

    public void setRatedVoltage(String ratedVoltage) {
        this.ratedVoltage = ratedVoltage;
    }

    public String getComprehensiveAssessment() {
        return comprehensiveAssessment;
    }

    public void setComprehensiveAssessment(String comprehensiveAssessment) {
        this.comprehensiveAssessment = comprehensiveAssessment;
    }

    
    
    public Integer getRemainCapacity() {
        return remainCapacity;
    }

    public void setRemainCapacity(Integer remainCapacity) {
        this.remainCapacity = remainCapacity;
    }

    public Integer getEstiR() {
        return estiR;
    }

    public void setEstiR(Integer estiR) {
        this.estiR = estiR;
    }

    public String getStatisticalMonth() {
		return statisticalMonth;
	}

	public void setStatisticalMonth(String statisticalMonth) {
		this.statisticalMonth = statisticalMonth;
	}

	public Integer getsOH() {
		return sOH;
	}

	public void setsOH(Integer sOH) {
		this.sOH = sOH;
	}

	@Override
	public String toString() {
		return "AnaBatteryMonthBasicInformation [id=" + id + ", bmsCode=" + bmsCode + ", bmsVer=" + bmsVer
				+ ", vehicleUse=" + vehicleUse + ", ratedCapacity=" + ratedCapacity + ", ratedVoltage=" + ratedVoltage
				+ ", comprehensiveAssessment=" + comprehensiveAssessment + ", sOH=" + sOH + ", remainCapacity="
				+ remainCapacity + ", estiR=" + estiR + ", statisticalMonth=" + statisticalMonth + "]";
	}
	
}