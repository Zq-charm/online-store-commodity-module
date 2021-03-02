package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品类别（类目）品牌关系表
 */
@Entity
@Table(name ="item_category_brand")
public class ItemCategoryBrand implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号，类目品牌关联ID
	private Integer categoryBrandId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 品牌ID
	private Integer brandId;
	
	// 平台二级商品类目ID
	private Integer secondLevelCid;
	
	// 平台三级商品类目ID
	private Integer thirdLevelCid;
	
	// 品牌在当前类目下是否有效：1、有效，2、无效
	private Integer cbrandStatus;
	
	// 排序指数，越小越靠前
	private String sortNumber;

	@Id
	@Column(name="category_brand_id")
	public Integer getCategoryBrandId() {
		return categoryBrandId;
	}

	public void setCategoryBrandId(Integer categoryBrandId) {
		this.categoryBrandId = categoryBrandId;
	}

	@Column(name="created_time")
	public Date getcreatedTime() {
		return createdTime;
	}

	public void setcreatedTime(Date createdTime) {
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

	@Column(name="brand_id")
	public Integer getbrandId() {
		return brandId;
	}

	public void setbrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name="second_level_cid")
	public Integer getSecondLevelCid() {
		return secondLevelCid;
	}

	public void setSecondLevelCid(Integer secondLevelCid) {
		this.secondLevelCid = secondLevelCid;
	}

	@Column(name="third_level_cid")
	public Integer getThirdLevelCid() {
		return thirdLevelCid;
	}

	public void setThirdLevelCid(Integer thirdLevelCid) {
		this.thirdLevelCid = thirdLevelCid;
	}

	@Column(name="cbrand_status")
	public Integer getCbrandStatus() {
		return cbrandStatus;
	}

	public void setCbrandStatus(Integer cbrandStatus) {
		this.cbrandStatus = cbrandStatus;
	}

	@Column(name="sort_number")
	public String getSortNumber() {
		return sortNumber;
	}

	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
	}

	@Override
	public String toString() {
		return "ItemCategoryBrand [categoryBrandId=" + categoryBrandId + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + ", creatorId=" + creatorId + ", editorId=" + editorId
				+ ", brandId=" + brandId + ", secondLevelCid=" + secondLevelCid + ", thirdLevelCid=" + thirdLevelCid
				+ ", cbrandStatus=" + cbrandStatus + ", sortNumber=" + sortNumber + "]";
	}

	
	
}
