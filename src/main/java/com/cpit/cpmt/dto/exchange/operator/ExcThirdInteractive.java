package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
/**
 * (交互接口权限控制)中间表
 * @author zcp
 *
 */
public class ExcThirdInteractive implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 唯一主键
	 */
	private Integer interactiveId;
	/**
	 * 鉴权表id
	 */
    private Integer authId;
	/**
	 * 接口Id
	 */
    private Integer interfaceId;
	/**
	 * 频率控制
	 */
    private Integer transCycle;
	/**
	 * 接口开关：1，开 0，关
	 */
    private Byte statusCd;

    /**
     * 接口地址url
     */
    private String interfaceUrl;
    /**
     * 接口描述
     */
    private String interfaceDesc;
    
    /**
     * 用于展示一个接口一条记录
     */
    private ExcThirdAuthentication excThirdAuthentication;
    /**
     * 用于展示一个接口一条记录
     */
    private ExcThirdInterface excThirdInterface;
    
    public Integer getInteractiveId() {
        return interactiveId;
    }

    public void setInteractiveId(Integer interactiveId) {
        this.interactiveId = interactiveId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Integer getTransCycle() {
        return transCycle;
    }

    public void setTransCycle(Integer transCycle) {
        this.transCycle = transCycle;
    }

    public Byte getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Byte statusCd) {
        this.statusCd = statusCd;
    }

	public String getInterfaceUrl() {
		return interfaceUrl;
	}

	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}

	public String getInterfaceDesc() {
		return interfaceDesc;
	}

	public void setInterfaceDesc(String interfaceDesc) {
		this.interfaceDesc = interfaceDesc;
	}

	public ExcThirdAuthentication getExcThirdAuthentication() {
		return excThirdAuthentication;
	}

	public void setExcThirdAuthentication(ExcThirdAuthentication excThirdAuthentication) {
		this.excThirdAuthentication = excThirdAuthentication;
	}

	public ExcThirdInterface getExcThirdInterface() {
		return excThirdInterface;
	}

	public void setExcThirdInterface(ExcThirdInterface excThirdInterface) {
		this.excThirdInterface = excThirdInterface;
	}
    
    
}