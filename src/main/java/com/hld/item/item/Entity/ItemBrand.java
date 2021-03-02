package com.hld.item.item.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 品牌表
 */
@Entity
@Table(name ="item_brand")
public class ItemBrand implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;

	// 主键ID号
	private Integer brandId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 品牌中文名称
	private String brandNameCn;
	
	// 品牌外文名称
	private String brandNameEn;
	
	// 品牌logo地址ַ
	private String brandLogoUrl;
	
	// 品牌描述
	private String description;
	
	// 品牌官网地址
	private String describeUrl;
	
	// 品牌的首字母，主要用于按次序显示
	private String firstLetter;
	
	// 品牌的认证状态（0、未认证，10、待审核，20、通过，30、驳回，40、已取消）
	private Integer authenStatus;
	
	// 品牌的认证失败原因
	private String failReason;

	
	@Id
	@Column(name="brand_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name="created_time")
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@Column(name="modified_time")
	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name="creator_id")
	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	@Column(name="editor_id")
	public Integer getEditorId() {
		return editorId;
	}

	public void setEditorId(Integer editorId) {
		this.editorId = editorId;
	}

	@Column(name="brand_name_cn")
	public String getbrandNameCn() {
		return brandNameCn;
	}

	public void setbrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

	@Column(name="brand_name_en")
	public String getbrandNameEn() {
		return brandNameEn;
	}

	public void setbrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

	@Column(name="brand_logo_url")
	public String getbrandLogoUrl() {
		return brandLogoUrl;
	}

	public void setbrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
	}

	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="describe_url")
	public String getDescribeUrl() {
		return describeUrl;
	}

	public void setDescribeUrl(String describeUrl) {
		this.describeUrl = describeUrl;
	}

	@Column(name="first_letter")
	public String getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}

	@Column(name="authen_status")
	public Integer getAuthenStatus() {
		return authenStatus;
	}

	public void setAuthenStatus(Integer authenStatus) {
		this.authenStatus = authenStatus;
	}

	@Column(name="fail_reason")
	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	@Override
	public String toString() {
		return "ItemBrand [brintId=" + brandId + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime
				+ ", createId=" + creatorId + ", editorId=" + editorId + ", brandNameCn=" + brandNameCn
				+ ", brandNameEn=" + brandNameEn + ", brandLogoUrl=" + brandLogoUrl + ", description=" + description
				+ ", describeUrl=" + describeUrl + ", firstLetter=" + firstLetter + ", authenStatus=" + authenStatus
				+ ", failReason=" + failReason + "]";
	}

	public ItemBrand(Integer brandId, Date createdTime, Date modifiedTime, Integer creatorId, Integer editorId, String brandNameCn, String brandNameEn, String brandLogoUrl, String description, String describeUrl, String firstLetter, Integer authenStatus, String failReason) {
		this.brandId = brandId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.creatorId = creatorId;
		this.editorId = editorId;
		this.brandNameCn = brandNameCn;
		this.brandNameEn = brandNameEn;
		this.brandLogoUrl = brandLogoUrl;
		this.description = description;
		this.describeUrl = describeUrl;
		this.firstLetter = firstLetter;
		this.authenStatus = authenStatus;
		this.failReason = failReason;
	}

	public ItemBrand(){}


}
