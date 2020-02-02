package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AccessParam implements Serializable{
   
	private static final long serialVersionUID = 1L;

	//接口类型
	public final static Integer INTERFACE_TYPE_SELECT = 1;//查询
	public final static Integer INTERFACE_TYPE_REPORT = 2;//上报
	
	//接入参数id
	private Integer accessId;

	//运营商id
    private String operatorID;

    //接口类型
    private Integer interfaceType;
    
    //接口地址
    private String interfaceAddress;

    //接口名称
    private String interfaceName;

    //传输周期
    private Integer transCycle;

    //版本号
    private String versionNum;

    //操作日期
    private Date operaDate;
    
    //运营商名称
    private String operatorName;
    
    //可管区域
    private List areaList;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public Integer getInterfaceType() {
		return interfaceType;
	}

	public void setInterfaceType(Integer interfaceType) {
		this.interfaceType = interfaceType;
	}

	public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress == null ? null : interfaceAddress.trim();
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public Integer getTransCycle() {
        return transCycle;
    }

    public void setTransCycle(Integer transCycle) {
        this.transCycle = transCycle;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    public Date getOperaDate() {
        return operaDate;
    }

    public void setOperaDate(Date operaDate) {
        this.operaDate = operaDate;
    }

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	public List getAreaList() {
		return areaList;
	}

	public void setAreaList(List areaList) {
		this.areaList = areaList;
	}

	@Override
	public String toString() {
		return "AccessParam [accessId=" + accessId + ", operatorID=" + operatorID + ", interfaceType=" + interfaceType
				+ ", interfaceAddress=" + interfaceAddress + ", interfaceName=" + interfaceName + ", transCycle="
				+ transCycle + ", versionNum=" + versionNum + ", operaDate=" + operaDate + ", operatorName="
				+ operatorName + "]";
	}
}