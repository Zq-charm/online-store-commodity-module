package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品类别属性取值表，或视频类别属性取值选项表
 */
@Entity
@Table(name ="item_category_attr_value")
public class ItemCategoryAttrValue implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer valueId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 属性名ID号
	private Integer attrId;
	
	// 商品类目的ID号
	private Integer categoryId;
	
	// 属性值名称
	private String attributeValue;
	
	// 记录状态：1、新建，2、删除
	private Integer attrValueStatus;
	
	// 排序指数，越小越靠前
	private String sortNumber;

	
	@Id
	@Column(name="value_id")
	public Integer getValueId() {
		return valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
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

	@Column(name="attr_id")
	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	@Column(name="category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name="attribute_value")
	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Column(name="attr_value_status")
	public Integer getAttrValueStatus() {
		return attrValueStatus;
	}

	public void setAttrValueStatus(Integer attrValueStatus) {
		this.attrValueStatus = attrValueStatus;
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
		return "ItemCategoryAttrValue [valueId=" + valueId + ", createdTime=" + createdTime + ", modifiedTime="
				+ modifiedTime + ", creatorId=" + creatorId + ", editorId=" + editorId + ", attrId=" + attrId
				+ ", categoryId=" + categoryId + ", attributeValue=" + attributeValue + ", attrValueStatus="
				+ attrValueStatus + ", sortNumber=" + sortNumber + "]";
	}
	
}
