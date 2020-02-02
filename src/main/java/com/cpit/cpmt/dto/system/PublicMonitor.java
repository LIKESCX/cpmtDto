package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//舆情监控网址表
public class PublicMonitor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    //网址名称
    private String netName;

    //网址类型 1.舆情采集，2.政府门户网站，3.新能源相关网站，4.其他
    private Integer netType;

    //网址状态 0.失效，1.生效
    private Integer netStatus;

    //入库时间
    private Date inDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public Integer getNetType() {
        return netType;
    }

    public void setNetType(Integer netType) {
        this.netType = netType;
    }

    public Integer getNetStatus() {
        return netStatus;
    }

    public void setNetStatus(Integer netStatus) {
        this.netStatus = netStatus;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicMonitor)) return false;
        PublicMonitor that = (PublicMonitor) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(netName, that.netName) &&
                Objects.equals(netType, that.netType) &&
                Objects.equals(netStatus, that.netStatus) &&
                Objects.equals(inDate, that.inDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, netName, netType, netStatus, inDate);
    }

    @Override
    public String toString() {
        return "PublicMonitor{" +
                "id='" + id + '\'' +
                ", netName='" + netName + '\'' +
                ", netType=" + netType +
                ", netStatus=" + netStatus +
                ", inDate=" + inDate +
                '}';
    }
}
