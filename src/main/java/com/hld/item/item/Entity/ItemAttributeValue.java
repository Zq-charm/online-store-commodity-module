package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品与其基本属性取值关联表
 */
@Entity
@Table(name ="item_attribute_value")
public class ItemAttributeValue implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer id;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 商品的ID号
	private Integer itemId;
	
	// 属性名ID号
	private Integer attrId;
	
	// 属性值的ID号
	private Integer valueId;
	
	// 属性值的首字母，供页面以a、b、c等的形式显示
	private String indexKey;
	
	// 身份是SKU
	private Integer isSku;
	
	// SKU的ID号
	private Integer skuId;
	
	// 记录状态：1、新建，2、删除
	private Integer attributeValueStatus;

	@Id
	@Column(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Column(name="item_id")
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name="attr_id")
	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	@Column(name="value_id")
	public Integer getValueId() {
		return valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	@Column(name="index_key")
	public String getIndexKey() {
		return indexKey;
	}

	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	@Column(name="is_sku")
	public Integer getIsSku() {
		return isSku;
	}

	public void setIsSku(Integer isSku) {
		this.isSku = isSku;
	}

	@Column(name="sku_id")
	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	@Column(name="attribute_value_status")
	public Integer getAttributeValueStatus() {
		return attributeValueStatus;
	}

	public void setAttributeValueStatus(Integer attributeValueStatus) {
		this.attributeValueStatus = attributeValueStatus;
	}

	@Override
	public String toString() {
		return "ItemAttributeValue [id=" + id + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime
				+ ", creatorId=" + creatorId + ", editorId=" + editorId + ", itemId=" + itemId + ", attrId=" + attrId
				+ ", valueId=" + valueId + ", indexKey=" + indexKey + ", isSku=" + isSku + ", skuId=" + skuId
				+ ", attributeValueStatus=" + attributeValueStatus + "]";
	}
	
}
