package com.cpit.cpmt.dto.system;

import java.io.Serializable;
import java.util.Date;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;


@ApiModel(description="导出日志值对象")
public class ExportLog implements Serializable {

	private static final long serialVersionUID = 1L;


	public static final String STATUS_OK = "0";
	public static final String STATUS_FAIL = "1";


	@ApiModelProperty(value="主键", accessMode=AccessMode.READ_ONLY, hidden=true)
    private String id;


	@ApiModelProperty(value="操作用户")
    private String userAccount;

	@ApiModelProperty(value="操作时间",example="yyyy-MM-dd HH:SS",accessMode=AccessMode.READ_ONLY)
 	@JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")
	private Date operationTime;


	@ApiModelProperty(value="操作名称", example="xxx模块-导出")
    private String operationName;

	@ApiModelProperty(value="状态", allowableValues="0:成功,1:失败",example="0 成功；1失败")
    private String status;

	@ApiModelProperty(value="操作项")
    private String appId;


	@ApiModelProperty(value="导出条件")
    private String message;

   
	@ApiModelProperty(value="数据量")
    private Integer num; 
    
	@ApiModelProperty(value="目标文件")
    private String fileName ;


    @ApiModelProperty(value="查询开始时间",example="yyyy-MM-dd HH:SS")
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")    
    private Date beginTime;

    @ApiModelProperty(value="查询结束时间",example="yyyy-MM-dd HH:SS")
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_24HOUR,timezone = "GMT+8")    
    private Date endTime;

    public ExportLog(){

    }

	public ExportLog(String appId,String operationName, String status, 
			String message,Integer num, String fileName) {
		super();
		this.appId = appId;
		this.operationName = operationName;
		this.status = status;
		this.message = message;
		this.num = num;
		this.fileName = fileName;
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
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
        ExportLog other = (ExportLog) that;
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
        sb.append(", num=").append(num);
        sb.append(", appId=").append(appId);
        sb.append(", message=").append(message);
        sb.append(", fileName=").append(fileName);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}
