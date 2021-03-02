package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品类别（类目）表
 */
@Entity
@Table(name ="item_category")
public class ItemCategory implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer categoryId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;
	
	// 商品分类类目名称
	private String categoryName;
	
	// 商品父级分类ID，顶级类目填0
	private Integer parentCategoryId;
	
	// 是否为叶子节点，1为叶子节点，2为非叶子节点
	private Integer isLeaf;
	
	// 是否前台首页展示，1、是，2、否
	private Integer isHomeShow;
	
	// 类目级别：1、一级类目，2、二级类目，3、三级类目，目前只支持三级类目
	private Integer categoryLevel;
	
	// 排序指数，越小越靠前
	private String sortNumber;
	
	// 1、有效，2、无效
	private Integer categoryStatus;

	
	@Id
	@Column(name="category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	@Column(name="category_name")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name="parent_category_id")
	public Integer getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	@Column(name="is_leaf")
	public Integer getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	@Column(name="is_home_show")
	public Integer getIsHomeShow() {
		return isHomeShow;
	}

	public void setIsHomeShow(Integer isHomeShow) {
		this.isHomeShow = isHomeShow;
	}

	@Column(name="category_level")
	public Integer getCategoryLevel() {
		return categoryLevel;
	}

	public void setCategoryLevel(Integer categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	@Column(name="sort_number")
	public String getSortNumber() {
		return sortNumber;
	}

	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
	}

	@Column(name="category_status")
	public Integer getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(Integer categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	@Override
	public String toString() {
		return "ItemCategory [categoryId=" + categoryId + ", createdTime=" + createdTime + ", modifiedTime="
				+ modifiedTime + ", creatorId=" + creatorId + ", editorId=" + editorId + ", categoryName="
				+ categoryName + ", parentCategoryId=" + parentCategoryId + ", isLeaf=" + isLeaf + ", isHomeShow="
				+ isHomeShow + ", categoryLevel=" + categoryLevel + ", sortNumber=" + sortNumber + ", categoryStatus="
				+ categoryStatus + "]";
	}
	
}
