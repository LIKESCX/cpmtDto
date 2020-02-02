package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.cpmt.dto.exchange.basic.ConnectorInfo;
import com.cpit.cpmt.dto.exchange.basic.ConnectorStatusInfo;

import java.util.Objects;

public class ConnectorInfoShow extends ConnectorInfo {

    private String cid;

    private String eid;

    private ConnectorStatusInfo connectorStatusInfo;

    //充电接口累计充电量
    private String connectorChargeSum;

    //充电接口累计放电量
    private String connectorDisChargeSum;

    //累计使用时间
    private String connectorUsedTimeSum;

    //充电设备
    private EquipmentInfoShow equipmentInfoShow;

    private static final long serialVersionUID = 1L;

    public EquipmentInfoShow getEquipmentInfoShow() {
        return equipmentInfoShow;
    }

    public void setEquipmentInfoShow(EquipmentInfoShow equipmentInfoShow) {
        this.equipmentInfoShow = equipmentInfoShow;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }


    public ConnectorStatusInfo getConnectorStatusInfo() {
        return connectorStatusInfo;
    }

    public void setConnectorStatusInfo(ConnectorStatusInfo connectorStatusInfo) {
        this.connectorStatusInfo = connectorStatusInfo;
    }

    public String getConnectorChargeSum() {
        return connectorChargeSum;
    }

    public void setConnectorChargeSum(String connectorChargeSum) {
        this.connectorChargeSum = connectorChargeSum;
    }

    public String getConnectorDisChargeSum() {
        return connectorDisChargeSum;
    }

    public void setConnectorDisChargeSum(String connectorDisChargeSum) {
        this.connectorDisChargeSum = connectorDisChargeSum;
    }

    public String getConnectorUsedTimeSum() {
        return connectorUsedTimeSum;
    }

    public void setConnectorUsedTimeSum(String connectorUsedTimeSum) {
        this.connectorUsedTimeSum = connectorUsedTimeSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectorInfoShow)) return false;
        if (!super.equals(o)) return false;
        ConnectorInfoShow that = (ConnectorInfoShow) o;
        return Objects.equals(cid, that.cid) &&
                Objects.equals(eid, that.eid) &&
                Objects.equals(connectorStatusInfo, that.connectorStatusInfo) &&
                Objects.equals(connectorChargeSum, that.connectorChargeSum) &&
                Objects.equals(connectorDisChargeSum, that.connectorDisChargeSum) &&
                Objects.equals(connectorUsedTimeSum, that.connectorUsedTimeSum) &&
                Objects.equals(equipmentInfoShow, that.equipmentInfoShow);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cid, eid, connectorStatusInfo, connectorChargeSum, connectorDisChargeSum, connectorUsedTimeSum, equipmentInfoShow);
    }

    @Override
    public String toString() {
        return "ConnectorInfoShow{" +
                "cid='" + cid + '\'' +
                ", eid='" + eid + '\'' +
                ", connectorStatusInfo=" + connectorStatusInfo +
                ", connectorChargeSum='" + connectorChargeSum + '\'' +
                ", connectorDisChargeSum='" + connectorDisChargeSum + '\'' +
                ", connectorUsedTimeSum='" + connectorUsedTimeSum + '\'' +
                ", equipmentInfoShow=" + equipmentInfoShow +
                '}';
    }
}
