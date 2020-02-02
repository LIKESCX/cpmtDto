package com.cpit.cpmt.dto.security;

import java.io.Serializable;
import java.util.Date;

public class DangerFile implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer dangerFileId;

    private String dangerId;

    private String fileName;

    private String fileUrl;

    private String previewUrl;

    private Date uploadDate;

    public Integer getDangerFileId() {
        return dangerFileId;
    }

    public void setDangerFileId(Integer dangerFileId) {
        this.dangerFileId = dangerFileId;
    }

    public String getDangerId() {
        return dangerId;
    }

    public void setDangerId(String dangerId) {
        this.dangerId = dangerId == null ? null : dangerId.trim();
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

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl == null ? null : previewUrl.trim();
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

	@Override
	public String toString() {
		return "DangerFile [dangerFileId=" + dangerFileId + ", dangerId=" + dangerId + ", fileName=" + fileName
				+ ", fileUrl=" + fileUrl + ", previewUrl=" + previewUrl + ", uploadDate=" + uploadDate + "]";
	}
    
}