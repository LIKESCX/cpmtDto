package com.cpit.cpmt.dto.exchange.operator;

import com.cpit.common.TimeConvertor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ChargeFileHistory implements Serializable {
    /**
     * 文件编码
     */
    private Integer fileId;

    /**
     * 运营商历史表id
     */
    private Integer operatorHisId;

    /**
     * 充电站历史表id
     */
    private String hisSid;

    /**
     * 充电设备历史表id
     */
    private String hisEid;

    /**
     * 运营商社会信用代码
     */
    private String operatorId;

    /**
     * 充电站id
     */
    private String stationId;

    /**
     * 设备唯一编码
     */
    private String equipmentId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件存储路径
     */
    private String fileUrl;

    /**
     * 文件大小
     */
    private String fileSize;

    /**
     * 文件分类 1.普通附件 2.补贴附件
     */
    private Integer fileKind;

    /**
     * 文件样式 1.充电站附件 2.充电设施附件
     */
    private Integer fileClass;

    /**
     * 文件上传状态 1.管理上传文件; 2：未申请 3：待补贴；4：已补贴； 5：审核不通过
     */
    private Integer fileUploadStatus;

    /**
     * 文件类型: 1.营业执照 2.申请报告 3.企业请示 4.项目投资备案证 5. 充电站专项审计报告
6. 投资证明材料（发票）  7. 充电设备强检报告 8. 节能报告 9.核查报告（计量院提供） 10. 节能审查意见书 11. 核查报告（第三方提供）
12. 包括检测和核查 13. 计量检定证书 14. 客户受电工程竣工检验意见书 15. 供电方案（供电局提供） 16. 电力工程竣工验收表
17. 防雷装置检测报告 18. 消防备案信息 19. 监控平台使用手册 20. 竣工报告 21. 用地协议 22. 企业用电结算情况（每月） 23. 供电公司发票
24. 供电公司收据 盖章 25. 结算证明 盖章 26. 补贴承诺函 27. 安全管理制度 28. 充电设施核查报告 29. 安全检查报告 30. 安全隐患信息 31. 整改信息 32.站点图片
     */
    private Integer fileType;

    /**
     * 上传时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date uploadDate;

    /**
     * 预览地址
     */
    private String previewUrl;

    /**
     * 操作人id
     */
    private String userId;

    /**
     * 操作人
     */
    private String userName;

    /**
     * 操作
     */
    private String operate;

    /**
     * 记录入库时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date checkDate;

    /**
     * 备注
     */
    private String note;

    /**
     * 开始时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date beginTime;

    /**
     * 开始时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date endTime;

    //运营商信息
    private OperatorInfoExtend operatorInfo;
    //运营商历史记录
    private OperatorChangeHis operatorChangeHis;

    //充电站信息
    private StationInfoShow stationInfo;
    //充电站历史记录
    private StationHistoryInfo stationHistory;

    //充电设备信息
    private EquipmentInfoShow equipmentInfoShow;
    //充电设备历史记录
    private EquipmentHistoryInfo equipmentHistoryInfo;

    private static final long serialVersionUID = 1L;

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

    public OperatorInfoExtend getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoExtend operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public OperatorChangeHis getOperatorChangeHis() {
        return operatorChangeHis;
    }

    public void setOperatorChangeHis(OperatorChangeHis operatorChangeHis) {
        this.operatorChangeHis = operatorChangeHis;
    }

    public StationInfoShow getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(StationInfoShow stationInfo) {
        this.stationInfo = stationInfo;
    }

    public StationHistoryInfo getStationHistory() {
        return stationHistory;
    }

    public void setStationHistory(StationHistoryInfo stationHistory) {
        this.stationHistory = stationHistory;
    }

    public EquipmentInfoShow getEquipmentInfoShow() {
        return equipmentInfoShow;
    }

    public void setEquipmentInfoShow(EquipmentInfoShow equipmentInfoShow) {
        this.equipmentInfoShow = equipmentInfoShow;
    }

    public EquipmentHistoryInfo getEquipmentHistoryInfo() {
        return equipmentHistoryInfo;
    }

    public void setEquipmentHistoryInfo(EquipmentHistoryInfo equipmentHistoryInfo) {
        this.equipmentHistoryInfo = equipmentHistoryInfo;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getOperatorHisId() {
        return operatorHisId;
    }

    public void setOperatorHisId(Integer operatorHisId) {
        this.operatorHisId = operatorHisId;
    }

    public String getHisSid() {
        return hisSid;
    }

    public void setHisSid(String hisSid) {
        this.hisSid = hisSid;
    }

    public String getHisEid() {
        return hisEid;
    }

    public void setHisEid(String hisEid) {
        this.hisEid = hisEid;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileKind() {
        return fileKind;
    }

    public void setFileKind(Integer fileKind) {
        this.fileKind = fileKind;
    }

    public Integer getFileClass() {
        return fileClass;
    }

    public void setFileClass(Integer fileClass) {
        this.fileClass = fileClass;
    }

    public Integer getFileUploadStatus() {
        return fileUploadStatus;
    }

    public void setFileUploadStatus(Integer fileUploadStatus) {
        this.fileUploadStatus = fileUploadStatus;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        ChargeFileHistory other = (ChargeFileHistory) that;
        return (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getOperatorHisId() == null ? other.getOperatorHisId() == null : this.getOperatorHisId().equals(other.getOperatorHisId()))
            && (this.getHisSid() == null ? other.getHisSid() == null : this.getHisSid().equals(other.getHisSid()))
            && (this.getHisEid() == null ? other.getHisEid() == null : this.getHisEid().equals(other.getHisEid()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFileUrl() == null ? other.getFileUrl() == null : this.getFileUrl().equals(other.getFileUrl()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getFileKind() == null ? other.getFileKind() == null : this.getFileKind().equals(other.getFileKind()))
            && (this.getFileClass() == null ? other.getFileClass() == null : this.getFileClass().equals(other.getFileClass()))
            && (this.getFileUploadStatus() == null ? other.getFileUploadStatus() == null : this.getFileUploadStatus().equals(other.getFileUploadStatus()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getUploadDate() == null ? other.getUploadDate() == null : this.getUploadDate().equals(other.getUploadDate()))
            && (this.getPreviewUrl() == null ? other.getPreviewUrl() == null : this.getPreviewUrl().equals(other.getPreviewUrl()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOperate() == null ? other.getOperate() == null : this.getOperate().equals(other.getOperate()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getOperatorHisId() == null) ? 0 : getOperatorHisId().hashCode());
        result = prime * result + ((getHisSid() == null) ? 0 : getHisSid().hashCode());
        result = prime * result + ((getHisEid() == null) ? 0 : getHisEid().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileUrl() == null) ? 0 : getFileUrl().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getFileKind() == null) ? 0 : getFileKind().hashCode());
        result = prime * result + ((getFileClass() == null) ? 0 : getFileClass().hashCode());
        result = prime * result + ((getFileUploadStatus() == null) ? 0 : getFileUploadStatus().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        result = prime * result + ((getPreviewUrl() == null) ? 0 : getPreviewUrl().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOperate() == null) ? 0 : getOperate().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", operatorHisId=").append(operatorHisId);
        sb.append(", hisSid=").append(hisSid);
        sb.append(", hisEid=").append(hisEid);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", stationId=").append(stationId);
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", fileKind=").append(fileKind);
        sb.append(", fileClass=").append(fileClass);
        sb.append(", fileUploadStatus=").append(fileUploadStatus);
        sb.append(", fileType=").append(fileType);
        sb.append(", uploadDate=").append(uploadDate);
        sb.append(", previewUrl=").append(previewUrl);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", operate=").append(operate);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}