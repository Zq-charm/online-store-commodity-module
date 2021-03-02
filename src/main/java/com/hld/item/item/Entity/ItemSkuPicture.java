package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 图片表
 */
@Entity
@Table(name ="item_sku_picture")
public class ItemSkuPicture implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号，图片ID
	private Integer pictureId;
	
	// 商品SKU的ID号
	private Integer skuId;
	
	// 店铺的ID号
	private Integer shopId;
	
	// 图片创建时间
	private Date createdTime;
	
	// 图片修改时间
	private Date modifiedTime;
	
	// 商品的图片路径URL
	private String pictureUrl;
	
	// 图片的认证状态（0、未认证，10、待审核，20、通过，30、驳回，40、已取消）
	private Integer pictureStatus;
	
	// 图片的认证失败原因
	private String failReason;
	
	// 图片名称
	private String pictureName;
	
	// 排序指数，越小越靠前
	private String sortNumber;

	
	@Id
	@Column(name="picture_id")
	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}

	@Column(name="sku_id")
	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	@Column(name="shop_id")
	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
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

	@Column(name="picture_url")
	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	@Column(name="picture_status")
	public Integer getPictureStatus() {
		return pictureStatus;
	}

	public void setPictureStatus(Integer pictureStatus) {
		this.pictureStatus = pictureStatus;
	}

	@Column(name="fail_reason")
	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	@Column(name="picture_name")
	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
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
		return "ItemSkuPicture [pictureId=" + pictureId + ", skuId=" + skuId + ", shopId=" + shopId + ", createdTime="
				+ createdTime + ", modifiedTime=" + modifiedTime + ", pictureUrl=" + pictureUrl + ", pictureStatus="
				+ pictureStatus + ", failReason=" + failReason + ", pictureName=" + pictureName + ", sortNumber="
				+ sortNumber + "]";
	}
	
}
