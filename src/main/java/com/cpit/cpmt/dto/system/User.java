package com.cpit.cpmt.dto.system;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpit.common.TimeConvertor;
import com.cpit.cpmt.dto.exchange.operator.OperatorInfoExtend;
import com.fasterxml.jackson.annotation.JsonFormat;


public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//1：正常，2：不可用，3：锁定，4：删除，5:未审核，6：待审核
	public static final int STATUS_OK = 1;
	public static final int STATUS_DISABLED = 2;
	public static final int STATUS_LOCKED = 3;
	public static final int STATUS_DELETED = 4;
	public static final int STATUS_UN_CHECK = 5;
	public static final int STATUS_WAIT_CHECK = 6;

	
	//'类型, 1：管理员，2：监管人员，3：运营商，4：第三方机构，5：其他 '
	public static final int TYPE_ADMIN = 1;
	public static final int TYPE_MANGER = 2;
	public static final int TYPE_OPERATOR = 3;
	public static final int TYPE_THIRD_PARTY = 4;
	public static final int TYPE_OTHER = 5;
	
	//'来源，1：自建，2：注册',
	public static final int SRC_CREATE = 1;
	public static final int SRC_REGISTER = 2;
	
    /**
     * 用户编号
     */
    private String id;

    /**
     * 账号
     */
    private String account;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;
    
    /**
     * 类型
     */
    private Integer type;

    /**
     * 来源
     */
    private Integer src;
    

    /**
     * 状态
     */
    private Integer status;
    
    /**
     * 描述
     */
    private String description;


    /**
     * 性别 1:male 2:female
     */
    private Integer sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String telephone;


    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")    
    private Date createDate;

    /**
     * 修改人
     */
    private String lastUpdatedBy;

    /**
     * 修改时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")    
    private Date lastUpdateDate;

    /**
     * 删除人
     */
    private String deletedBy;

    
    /**
     * 删除时间
     */
    @JsonFormat(pattern=TimeConvertor.FORMAT_MINUS_DAY,timezone = "GMT+8")
    private Date deleteDate;
    
    private String roleId;

    /**
     * 所属运营商
     */
    private String operatorId;
    
    /**
     * 所属组织
     */
    private String orgnization;
   
    
    //所属组织
    private OperatorInfoExtend operator = null;
    
    //======================查询用
    private List<Integer> statusList;
    
    private List<Integer> typeList;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
    
    public Integer getSrc() {
		return src;
	}

	public void setSrc(Integer src) {
		this.src = src;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getOrgnization() {
		return orgnization;
	}

	public void setOrgnization(String orgnization) {
		this.orgnization = orgnization;
	}


	public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    

	public List<Integer> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Integer> statusList) {
		this.statusList = statusList;
	}

	public List<Integer> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Integer> typeList) {
		this.typeList = typeList;
	}
	
	

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public OperatorInfoExtend getOperator() {
		return operator;
	}

	public void setOperator(OperatorInfoExtend operator) {
		this.operator = operator;
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
        User other = (User) that;
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
        sb.append("id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", src=").append(src);
        //sb.append(", password=").append(password);
        sb.append(", description=").append(description);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", telephone=").append(telephone);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdatedBy=").append(lastUpdatedBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", deletedBy=").append(deletedBy);
        sb.append(", deleteDate=").append(deleteDate);
        sb.append(", roleId=").append(roleId);
        sb.append(", operatorId=").append(operatorId);
        sb.append("]");
        return sb.toString();
    }
}