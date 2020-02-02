package com.cpit.cpmt.dto.exchange.operator;

import java.io.Serializable;
import java.util.Date;

public class OperatorFile implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//文件编码
    private String fileId;

    //统一社会信用代码
    private String operatorId;

    //文件名称
    private String fileName;

    //文件存储路径
    private String fileUrl;
    
    //文件预览路径
    private String previewUrl;

    //文件类型:1营业执照,2接入协议(盖章),3股本结构,4运营商信息(盖章),5其他附件
    private Integer fileType;

    //上传时间
    private Date uploadDate;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    
	public String getPreviewUrl() {
		return previewUrl;
	}

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	@Override
	public String toString() {
		return "OperatorFile [fileId=" + fileId + ", operatorId=" + operatorId + ", fileName=" + fileName + ", fileUrl="
				+ fileUrl + ", previewUrl=" + previewUrl + ", fileType=" + fileType + ", uploadDate=" + uploadDate
				+ "]";
	}
}