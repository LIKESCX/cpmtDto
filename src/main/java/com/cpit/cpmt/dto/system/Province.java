package com.cpit.cpmt.dto.system;

import java.io.Serializable;

public class Province implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer provinceId;

    private String provinceName;
    
    private Integer cityId;
    
    private String cityName;
    
    private Integer parentId;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Province [provinceId=" + provinceId + ", provinceName=" + provinceName + ", cityId=" + cityId
				+ ", cityName=" + cityName + ", parentId=" + parentId + "]";
	}

}