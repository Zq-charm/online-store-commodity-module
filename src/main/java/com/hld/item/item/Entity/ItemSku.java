package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品的SKU表（即最终含有关键销售属性的）
 */
@Entity
@Table(name ="item_sku")
public class ItemSku implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer skuId;
	
	// 对应的商品的ID
	private Integer itemId;
	
	// 店铺的ID号
	private Integer shopId;
	
	// 卖家（商家）的ID号
	private Integer sellerId;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 商品的SKU名称（标题）
	private String skuName;
	
	// SKU编号，唯一
	private String skuNo;
	
	// 库存量
	private Integer inventory;
	
	// 库存余量预警值
	private Integer restInventory;
	
	// 市场价格
	private Double marketPrice;
	
	// 商品的货号
	private String productNumber;
	
	// 商品的编码
	private String productCode;
	
	// SKU状态：1、有效，2、无效
	private Integer skuStatus;
	
	// 销售属性集合，其存储格式：keyId:valueId
	private String attributes;
	
	// 商品的广告词
	private String advert;

	@Id
	@Column(name="sku_id")
	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	@Column(name="item_id")
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name="shop_id")
	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Column(name="seller_id")
	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
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

	@Column(name="sku_name")
	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	@Column(name="sku_no")
	public String getSkuNo() {
		return skuNo;
	}

	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

	@Column(name="inventory")
	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	@Column(name="rest_inventory")
	public Integer getRestInventory() {
		return restInventory;
	}

	public void setRestInventory(Integer restInventory) {
		this.restInventory = restInventory;
	}

	@Column(name="market_price")
	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Column(name="product_number")
	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	@Column(name="product_code")
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name="sku_status")
	public Integer getSkuStatus() {
		return skuStatus;
	}

	public void setSkuStatus(Integer skuStatus) {
		this.skuStatus = skuStatus;
	}

	@Column(name="attributes")
	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	@Column(name="advert")
	public String getAdvert() {
		return advert;
	}

	public void setAdvert(String advert) {
		this.advert = advert;
	}

	@Override
	public String toString() {
		return "ItemSku [skuId=" + skuId + ", itemId=" + itemId + ", shopId=" + shopId + ", sellerId=" + sellerId
				+ ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + ", skuName=" + skuName
				+ ", skuNo=" + skuNo + ", inventory=" + inventory + ", restInventory=" + restInventory
				+ ", marketPrice=" + marketPrice + ", productNumber=" + productNumber + ", productCode=" + productCode
				+ ", skuStatus=" + skuStatus + ", attributes=" + attributes + ", advert=" + advert + "]";
	}
	
}
