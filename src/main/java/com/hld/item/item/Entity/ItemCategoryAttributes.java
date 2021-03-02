package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品类别（类目）属性关系表
 */
@Entity
@Table(name ="item_category_attributes")
public class ItemCategoryAttributes implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer attrId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 商品类目的ID号
	private Integer categoryId;
	
	// 属性名称
	private String attrName;
	
	// 属性类型：1、销售属性，2、非销售属性
	private Integer attrType;
	
	// 是否允许起别名
	private Integer isAllowAlias;
	
	// 是否颜色属性
	private Integer isColorAttr;
	
	// 是否枚举属性
	private Integer isEnumerationAttr;
	
	// 是否输入属性
	private Integer isInputAttr;
	
	// 是否关键属性
	private Integer isKeyAttr;
	
	// 是否销售属性
	private Integer isSaleAttr;
	
	// 是否可搜索的字段
	private Integer isSearchAttr;
	
	// 是否必填：1、必填，2、非必填
	private Integer optionType;
	
	// 是否多选：1、单选，2、多选
	private Integer selectType;
	
	// 记录状态：1、新建，2、删除
	private Integer categoryAttrStatus;
	
	// 排序指数，越小越靠前
	private String sortNumber;

	@Id
	@Column(name="attr_id")
	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
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

	@Column(name="category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name="attr_name")
	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	@Column(name="attr_type")
	public Integer getAttrType() {
		return attrType;
	}

	public void setAttrType(Integer attrType) {
		this.attrType = attrType;
	}

	@Column(name="is_allow_alias")
	public Integer getIsAllowAlias() {
		return isAllowAlias;
	}

	public void setIsAllowAlias(Integer isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	@Column(name="is_color_attr")
	public Integer getIsColorAttr() {
		return isColorAttr;
	}

	public void setIsColorAttr(Integer isColorAttr) {
		this.isColorAttr = isColorAttr;
	}

	@Column(name="is_enumeration_attr")
	public Integer getIsEnumerationAttr() {
		return isEnumerationAttr;
	}

	public void setIsEnumerationAttr(Integer isEnumerationAttr) {
		this.isEnumerationAttr = isEnumerationAttr;
	}

	@Column(name="is_input_attr")
	public Integer getIsInputAttr() {
		return isInputAttr;
	}

	public void setIsInputAttr(Integer isInputAttr) {
		this.isInputAttr = isInputAttr;
	}

	@Column(name="is_key_attr")
	public Integer getIsKeyAttr() {
		return isKeyAttr;
	}

	public void setIsKeyAttr(Integer isKeyAttr) {
		this.isKeyAttr = isKeyAttr;
	}

	@Column(name="is_sale_attr")
	public Integer getIsSaleAttr() {
		return isSaleAttr;
	}

	public void setIsSaleAttr(Integer isSaleAttr) {
		this.isSaleAttr = isSaleAttr;
	}

	@Column(name="is_search_attr")
	public Integer getIsSearchAttr() {
		return isSearchAttr;
	}

	public void setIsSearchAttr(Integer isSearchAttr) {
		this.isSearchAttr = isSearchAttr;
	}

	@Column(name="option_type")
	public Integer getOptionType() {
		return optionType;
	}

	public void setOptionType(Integer optionType) {
		this.optionType = optionType;
	}

	@Column(name="select_type")
	public Integer getSelectType() {
		return selectType;
	}

	public void setSelectType(Integer selectType) {
		this.selectType = selectType;
	}

	@Column(name="category_attr_status")
	public Integer getCategoryAttrStatus() {
		return categoryAttrStatus;
	}

	public void setCategoryAttrStatus(Integer categoryAttrStatus) {
		this.categoryAttrStatus = categoryAttrStatus;
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
		return "ItemCategoryAttributes [attrId=" + attrId + ", createdTime=" + createdTime + ", modifiedTime="
				+ modifiedTime + ", creatorId=" + creatorId + ", editorId=" + editorId + ", categoryId=" + categoryId
				+ ", attrName=" + attrName + ", attrType=" + attrType + ", isAllowAlias=" + isAllowAlias
				+ ", isColorAttr=" + isColorAttr + ", isEnumerationAttr=" + isEnumerationAttr + ", isInputAttr="
				+ isInputAttr + ", isKeyAttr=" + isKeyAttr + ", isSaleAttr=" + isSaleAttr + ", isSearchAttr="
				+ isSearchAttr + ", optionType=" + optionType + ", selectType=" + selectType + ", categoryAttrStatus="
				+ categoryAttrStatus + ", sortNumber=" + sortNumber + "]";
	}
	
}
