package com.cpit.cpmt.dto.exchange.supplement;

import java.io.Serializable;

public class SupplementInfo implements Serializable{
	   
		private static final long serialVersionUID = 1L;
		private int id;//唯一标识
		
		private String operatorID;//运营商id
		private String infName;//接口名称
		private String infVer;//接口版本
		private String infType;//接口类型 1-query 2-notification
		private String originalTime;//原始采集时间
		private String isNeedSupply;//是否需要补采 1-need,0-noNeed
		private String supplyTime;//补采时间
		private String supplyType;//补采方式
		private String supplyResult;//补采结果
		private String supplyFailReason;//补采失败原因
		private String memo1;//备忘字段1
		private String memo2;//备忘字段2
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getOperatorID() {
			return operatorID;
		}
		public void setOperatorID(String operatorID) {
			this.operatorID = operatorID;
		}
		public String getInfName() {
			return infName;
		}
		public void setInfName(String infName) {
			this.infName = infName;
		}
		public String getInfVer() {
			return infVer;
		}
		public void setInfVer(String infVer) {
			this.infVer = infVer;
		}
		public String getInfType() {
			return infType;
		}
		public void setInfType(String infType) {
			this.infType = infType;
		}
		public String getOriginalTime() {
			return originalTime;
		}
		public void setOriginalTime(String originalTime) {
			this.originalTime = originalTime;
		}
		public String isNeedSupply() {
			return isNeedSupply;
		}
		public void setNeedSupply(String isNeedSupply) {
			this.isNeedSupply = isNeedSupply;
		}
		public String getSupplyTime() {
			return supplyTime;
		}
		public void setSupplyTime(String supplyTime) {
			this.supplyTime = supplyTime;
		}
		public String getSupplyType() {
			return supplyType;
		}
		public void setSupplyType(String supplyType) {
			this.supplyType = supplyType;
		}
		public String getSupplyResult() {
			return supplyResult;
		}
		public void setSupplyResult(String supplyResult) {
			this.supplyResult = supplyResult;
		}
		public String getSupplyFailReason() {
			return supplyFailReason;
		}
		public void setSupplyFailReason(String supplyFailReason) {
			this.supplyFailReason = supplyFailReason;
		}
		public String getMemo1() {
			return memo1;
		}
		public void setMemo1(String memo1) {
			this.memo1 = memo1;
		}
		public String getMemo2() {
			return memo2;
		}
		public void setMemo2(String memo2) {
			this.memo2 = memo2;
		}
		@Override
		public String toString() {
			return "SupplementInfo [operatorID=" + operatorID + ", infName=" + infName + ", infVer=" + infVer
					+ ", infType=" + infType + ", originalTime=" + originalTime + ", isNeedSupply=" + isNeedSupply
					+ ", supplyTime=" + supplyTime + ", supplyType=" + supplyType + ", supplyResult=" + supplyResult
					+ ", supplyFailReason=" + supplyFailReason + ", memo1=" + memo1 + ", memo2=" + memo2 + "]";
		}
		
		

}
