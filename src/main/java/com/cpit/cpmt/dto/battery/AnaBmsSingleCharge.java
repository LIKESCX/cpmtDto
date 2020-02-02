package com.cpit.cpmt.dto.battery;

import java.io.Serializable;

/**
 * @author 
 */
public class AnaBmsSingleCharge extends AnaBmsSingleChargeKey implements Serializable {
    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * BMS版本
     */
    private String bmsVer;

    /**
     * 电池内阻估算
     */
    private Integer estiR;

    /**
     * 电池剩余容量
     */
    private Integer remainCapacity;

    /**
     * 充电时间长度，单位秒
     */
    private Integer chargetime;

    /**
     * 电池健康度
     */
    private Integer soh;

    /**
     * 综合评估
     */
    private String remark1;

    /**
     * 荷电状态
     */
    private String soc;

    /**
     * 单体最高电压
     */
    private String voltageH;

    /**
     * 单体最低电压
     */
    private String voltageL;

    /**
     * 单体最高温度
     */
    private String temptureH;

    /**
     * 单体最低温度
     */
    private String temptureL;

    /**
     * 充电前soc值
     */
    private String beforesoc;

    /**
     * 充电后soc值
     */
    private String aftersoc;

    /**
     * 对应的日期(以结束时间为准)
     */
    private String statisticalDate;

    /**
     * 对应的月份(以结束时间为准)
     */
    private String statisticalMonth;

    /**
     * 对应的季度(以结束时间为准)
     */
    private String statisticalSeason;

    private static final long serialVersionUID = 1L;

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

    public String getBmsVer() {
        return bmsVer;
    }

    public void setBmsVer(String bmsVer) {
        this.bmsVer = bmsVer;
    }

    public Integer getEstiR() {
        return estiR;
    }

    public void setEstiR(Integer estiR) {
        this.estiR = estiR;
    }

    public Integer getRemainCapacity() {
        return remainCapacity;
    }

    public void setRemainCapacity(Integer remainCapacity) {
        this.remainCapacity = remainCapacity;
    }

    public Integer getChargetime() {
        return chargetime;
    }

    public void setChargetime(Integer chargetime) {
        this.chargetime = chargetime;
    }

    public Integer getSoh() {
        return soh;
    }

    public void setSoh(Integer soh) {
        this.soh = soh;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getVoltageH() {
        return voltageH;
    }

    public void setVoltageH(String voltageH) {
        this.voltageH = voltageH;
    }

    public String getVoltageL() {
        return voltageL;
    }

    public void setVoltageL(String voltageL) {
        this.voltageL = voltageL;
    }

    public String getTemptureH() {
        return temptureH;
    }

    public void setTemptureH(String temptureH) {
        this.temptureH = temptureH;
    }

    public String getTemptureL() {
        return temptureL;
    }

    public void setTemptureL(String temptureL) {
        this.temptureL = temptureL;
    }

    public String getBeforesoc() {
        return beforesoc;
    }

    public void setBeforesoc(String beforesoc) {
        this.beforesoc = beforesoc;
    }

    public String getAftersoc() {
        return aftersoc;
    }

    public void setAftersoc(String aftersoc) {
        this.aftersoc = aftersoc;
    }

    public String getStatisticalDate() {
        return statisticalDate;
    }

    public void setStatisticalDate(String statisticalDate) {
        this.statisticalDate = statisticalDate;
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
        AnaBmsSingleCharge other = (AnaBmsSingleCharge) that;
        return (this.getBmsCode() == null ? other.getBmsCode() == null : this.getBmsCode().equals(other.getBmsCode()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getConnectorId() == null ? other.getConnectorId() == null : this.getConnectorId().equals(other.getConnectorId()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
            && (this.getBmsVer() == null ? other.getBmsVer() == null : this.getBmsVer().equals(other.getBmsVer()))
            && (this.getEstiR() == null ? other.getEstiR() == null : this.getEstiR().equals(other.getEstiR()))
            && (this.getRemainCapacity() == null ? other.getRemainCapacity() == null : this.getRemainCapacity().equals(other.getRemainCapacity()))
            && (this.getChargetime() == null ? other.getChargetime() == null : this.getChargetime().equals(other.getChargetime()))
            && (this.getSoh() == null ? other.getSoh() == null : this.getSoh().equals(other.getSoh()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getSoc() == null ? other.getSoc() == null : this.getSoc().equals(other.getSoc()))
            && (this.getVoltageH() == null ? other.getVoltageH() == null : this.getVoltageH().equals(other.getVoltageH()))
            && (this.getVoltageL() == null ? other.getVoltageL() == null : this.getVoltageL().equals(other.getVoltageL()))
            && (this.getTemptureH() == null ? other.getTemptureH() == null : this.getTemptureH().equals(other.getTemptureH()))
            && (this.getTemptureL() == null ? other.getTemptureL() == null : this.getTemptureL().equals(other.getTemptureL()))
            && (this.getBeforesoc() == null ? other.getBeforesoc() == null : this.getBeforesoc().equals(other.getBeforesoc()))
            && (this.getAftersoc() == null ? other.getAftersoc() == null : this.getAftersoc().equals(other.getAftersoc()))
            && (this.getStatisticalDate() == null ? other.getStatisticalDate() == null : this.getStatisticalDate().equals(other.getStatisticalDate()))
            && (this.getStatisticalMonth() == null ? other.getStatisticalMonth() == null : this.getStatisticalMonth().equals(other.getStatisticalMonth()))
            && (this.getStatisticalSeason() == null ? other.getStatisticalSeason() == null : this.getStatisticalSeason().equals(other.getStatisticalSeason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBmsCode() == null) ? 0 : getBmsCode().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getBmsVer() == null) ? 0 : getBmsVer().hashCode());
        result = prime * result + ((getEstiR() == null) ? 0 : getEstiR().hashCode());
        result = prime * result + ((getRemainCapacity() == null) ? 0 : getRemainCapacity().hashCode());
        result = prime * result + ((getChargetime() == null) ? 0 : getChargetime().hashCode());
        result = prime * result + ((getSoh() == null) ? 0 : getSoh().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getSoc() == null) ? 0 : getSoc().hashCode());
        result = prime * result + ((getVoltageH() == null) ? 0 : getVoltageH().hashCode());
        result = prime * result + ((getVoltageL() == null) ? 0 : getVoltageL().hashCode());
        result = prime * result + ((getTemptureH() == null) ? 0 : getTemptureH().hashCode());
        result = prime * result + ((getTemptureL() == null) ? 0 : getTemptureL().hashCode());
        result = prime * result + ((getBeforesoc() == null) ? 0 : getBeforesoc().hashCode());
        result = prime * result + ((getAftersoc() == null) ? 0 : getAftersoc().hashCode());
        result = prime * result + ((getStatisticalDate() == null) ? 0 : getStatisticalDate().hashCode());
        result = prime * result + ((getStatisticalMonth() == null) ? 0 : getStatisticalMonth().hashCode());
        result = prime * result + ((getStatisticalSeason() == null) ? 0 : getStatisticalSeason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationId=").append(stationId);
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", bmsVer=").append(bmsVer);
        sb.append(", estiR=").append(estiR);
        sb.append(", remainCapacity=").append(remainCapacity);
        sb.append(", chargetime=").append(chargetime);
        sb.append(", soh=").append(soh);
        sb.append(", remark1=").append(remark1);
        sb.append(", soc=").append(soc);
        sb.append(", voltageH=").append(voltageH);
        sb.append(", voltageL=").append(voltageL);
        sb.append(", temptureH=").append(temptureH);
        sb.append(", temptureL=").append(temptureL);
        sb.append(", beforesoc=").append(beforesoc);
        sb.append(", aftersoc=").append(aftersoc);
        sb.append(", statisticalDate=").append(statisticalDate);
        sb.append(", statisticalMonth=").append(statisticalMonth);
        sb.append(", statisticalSeason=").append(statisticalSeason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}