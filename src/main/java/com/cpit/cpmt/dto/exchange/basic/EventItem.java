package com.cpit.cpmt.dto.exchange.basic;

import java.io.Serializable;

/**
 * @author 
 */
public class EventItem implements Serializable {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 事件类型
     */
    private String eventType;

    /**
     * 事件编码
     */
    private String eventCode;

    
	public String getEventType() {
		return eventType;
	}


	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


	public String getEventCode() {
		return eventCode;
	}


	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}


	@Override
	public String toString() {
		return "EventInfo [eventType=" + eventType + ", eventCode=" + eventCode + "]";
	}
    
    
}