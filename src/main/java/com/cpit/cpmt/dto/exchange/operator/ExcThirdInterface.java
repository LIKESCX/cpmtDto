package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
/**
 * (交互接口权限控制)系统接口表
 * @author zcp
 *
 */
public class ExcThirdInterface implements Serializable{
 
	private static final long serialVersionUID = 1L;
	/**
	 * 唯一主键id
	 */
	private Integer interfaceId;
	/**
	 * 接口url路径
	 */
    private String interfaceUrl;
	/**
	 * 接口描述
	 */
    private String interfaceDesc;

    public Integer getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getInterfaceUrl() {
        return interfaceUrl;
    }

    public void setInterfaceUrl(String interfaceUrl) {
        this.interfaceUrl = interfaceUrl == null ? null : interfaceUrl.trim();
    }

    public String getInterfaceDesc() {
        return interfaceDesc;
    }

    public void setInterfaceDesc(String interfaceDesc) {
        this.interfaceDesc = interfaceDesc == null ? null : interfaceDesc.trim();
    }
}