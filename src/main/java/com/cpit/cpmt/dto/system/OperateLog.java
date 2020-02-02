package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;

/**
 * @author
 */
@ApiModel(description="操作日志值对象")
public class OperateLog implements Serializable {


	// appId list， 长度不能超过10
	public static final String APP_ID_VIEW = "view";//平台概览    
	public static final String APP_ID_INFO = "info";//信息查询
	public static final String APP_ID_SECURITY = "security";//安全监管
	public static final String APP_ID_FINANCE = "finance"; //财政补贴
	public static final String APP_ID_POLICY = "policy"; //政策法规
	public static final String APP_ID_COLLECT = "collect"; //数据采集
	public static final String APP_ID_MONITOR = "monitor"; //运行监控
	public static final String APP_ID_EXCHANGE = "exchange"; //信息交换
   	public static final String APP_ID_ANALYZE = "analyze"; //统计分析
	public static final String APP_ID_SYSTEM = "system"; //平台管理


	public static final String STATUS_OK = "0";
	public static final String STATUS_FAIL = "1";

	public static final String OPERATION_TYPE_QUERY = "0";
	public static final String OPERATION_TYPE_ADD = "1";
	public static final String OPERATION_TYPE_MODIFY = "2";
	public static final String OPERATION_TYPE_DEL = "3";
	public static final String OPERATION_TYPE_CHECK = "4";
	public static final String OPERATION_TYPE_OTHER = "5";
	




	@ApiModelProperty(value="主键", accessMode=AccessMode.READ_ONLY, hidden=true)
    private String id;


	@ApiModelProperty(value="操作用户")
    private String userAccount;

	@ApiModelProperty(value="操作时间",example="yyyy-MM-dd HH:SS",accessMode=AccessMode.READ_ONLY)
 	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
	private Date operationTime;


	@ApiModelProperty(value="操作名称", example="资源模块-查询桩，crm模块-用户入网等")
    private String operationName;

	@ApiModelProperty(value="状态", allowableValues="0:成功,1:失败",example="0 成功；1失败")
    private String status;

	@ApiModelProperty(value="操作类型",allowableValues="0:查询,1:添加,2:删除,3:修改")
 	private String operationType;


    private String appId;


	@ApiModelProperty(value="详细信息(若失败则为错误信息)")
    private String message;

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="查询开始时间",example="yyyy-MM-dd HH:SS")
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")    
    private Date beginTime;

    @ApiModelProperty(value="查询结束时间",example="yyyy-MM-dd HH:SS")
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")    
    private Date endTime;

    public OperateLog(){

    }

	public OperateLog(String appId,String operationName, String status, String operationType,
			String message) {
		super();
		this.operationName = operationName;
		this.status = status;
		this.operationType = operationType;
		this.appId = appId;
		this.message = message;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getBeginTime() {
		return beginTime;
	}

	
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OperateLog other = (OperateLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
     }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        //sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", operationName=").append(operationName);
        sb.append(", status=").append(status);
        sb.append(", operationType=").append(operationType);
        sb.append(", appId=").append(appId);
        sb.append(", message=").append(message);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}
