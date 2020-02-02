package com.cpit.cpmt.dto.system;

import java.io.Serializable;

public class AreaStreet implements Serializable {
	private static final long serialVersionUID = 1L;
	//街道id
	private int streetId;
	
	//区域编码
    private String areaCode;

    //街道名称
    private String streetName;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }
    
	public int getStreetId() {
		return streetId;
	}

	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}

	@Override
	public String toString() {
		return "AreaStreet [streetId=" + streetId + ", areaCode=" + areaCode + ", streetName=" + streetName + "]";
	}

}