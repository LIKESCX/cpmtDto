package com.cpit.cpmt.dto.system;

import java.io.Serializable;

/**
 * @author 
 */
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;

    public final static String CODE_SHEN_ZHEN     = "440300";
    public final static String CODE_SHI_XIA_QU    = "440301";
    public final static String CODE_LUO_HU_QU     = "440303";
    public final static String CODE_FU_TIAN_QU    = "440304";
    public final static String CODE_NAN_SHAN_QU   = "440305";
    public final static String CODE_BAO_AN_QU     = "440306";
    public final static String CODE_LONG_GANG_QU  = "440307";
    public final static String CODE_YAN_TIAN_QU   = "440308";
	

    private String areaCode;

    /**
     * 名称
     */
    private String areaName;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        //sb.append("Hash = ").append(hashCode());
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append("]");
        return sb.toString();
    }
}