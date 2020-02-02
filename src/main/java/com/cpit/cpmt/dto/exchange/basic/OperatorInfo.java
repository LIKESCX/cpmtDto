package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class OperatorInfo implements Serializable{
    /**
     * 社会信用代码,字母加数字(可修改)
     */
    private String operatorID;
     /**
     * 运营商名称
     */
    private String operatorName;

    /**
     * 运营商电话1
     */
    private String operatorTel1;

    /**
     * 运营商电话2
     */
    private String operatorTel2;

    private String operatorRegAddress;


    /**
     * 备注
     */
    private String operatorNote;
    
    /*
     * 充电站列表
     * */
     private List<StationInfo> stationInfos;
     
     
    private static final long serialVersionUID = 1L;
    
	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorTel1() {
        return operatorTel1;
    }

    public void setOperatorTel1(String operatorTel1) {
        this.operatorTel1 = operatorTel1;
    }

    public String getOperatorTel2() {
        return operatorTel2;
    }

    public void setOperatorTel2(String operatorTel2) {
        this.operatorTel2 = operatorTel2;
    }

    public String getOperatorRegAddress() {
        return operatorRegAddress;
    }

    public void setOperatorRegAddress(String operatorRegAddress) {
        this.operatorRegAddress = operatorRegAddress;
    }

 
    public String getOperatorNote() {
        return operatorNote;
    }

    public void setOperatorNote(String operatorNote) {
        this.operatorNote = operatorNote;
    }

	public List<StationInfo> getStationInfos() {
		return stationInfos;
	}

	public void setStationInfos(List<StationInfo> stationInfos) {
		this.stationInfos = stationInfos;
	}

	@Override
	public String toString() {
		return "OperatorInfo [operatorID=" + operatorID + ", operatorName=" + operatorName + ", operatorTel1="
				+ operatorTel1 + ", operatorTel2=" + operatorTel2 + ", operatorRegAddress=" + operatorRegAddress
				+ ", operatorNote=" + operatorNote + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operatorID == null) ? 0 : operatorID.hashCode());
		result = prime * result + ((operatorName == null) ? 0 : operatorName.hashCode());
		result = prime * result + ((operatorNote == null) ? 0 : operatorNote.hashCode());
		result = prime * result + ((operatorRegAddress == null) ? 0 : operatorRegAddress.hashCode());
		result = prime * result + ((operatorTel1 == null) ? 0 : operatorTel1.hashCode());
		result = prime * result + ((operatorTel2 == null) ? 0 : operatorTel2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperatorInfo other = (OperatorInfo) obj;
		if (operatorID == null) {
			if (other.operatorID != null)
				return false;
		} else if (!operatorID.equals(other.operatorID))
			return false;
		if (operatorName == null) {
			if (other.operatorName != null)
				return false;
		} else if (!operatorName.equals(other.operatorName))
			return false;
		if (operatorNote == null) {
			if (other.operatorNote != null)
				return false;
		} else if (!operatorNote.equals(other.operatorNote))
			return false;
		if (operatorRegAddress == null) {
			if (other.operatorRegAddress != null)
				return false;
		} else if (!operatorRegAddress.equals(other.operatorRegAddress))
			return false;
		if (operatorTel1 == null) {
			if (other.operatorTel1 != null)
				return false;
		} else if (!operatorTel1.equals(other.operatorTel1))
			return false;
		if (operatorTel2 == null) {
			if (other.operatorTel2 != null)
				return false;
		} else if (!operatorTel2.equals(other.operatorTel2))
			return false;
		return true;
	}
    
  


}
