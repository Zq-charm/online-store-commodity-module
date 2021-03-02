package com.hld.item.item.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xujianpeng 商品信息表
 */
@Entity
@Table(name ="item_info")
public class ItemInfo implements Serializable{

	/**
	 * 自己生成的serialVersionUID
	 */
	private static final long serialVersionUID = -5058864290285343166L;
	
	// 主键ID号
	private Integer itemId;
	
	// 店铺的ID号
	private Integer shopId;
	
	// 卖家（商家）的ID号
	private Integer sellerId;
	
	// 类目ID
	private Integer categoryId;
	
	// 品牌ID
	private Integer brandId;
	
	// 商品所属店铺内部的类目ID
	private Integer shopCid;
	
	// 创建时间
	private Date createdTime;
	
	// 修改时间
	private Date modifiedTime;
	
	// 商品的名称（标题）
	private String goodsName;
	
	// 商品的广告词
	private String advert;
	
	// 商品的状态：1、未发布，2、待审核，20、审核驳回，3、待上架，4、在售，5、已下架，6、锁定，7、申请解锁，8、删除
	private Integer itemInfoStatus;
	
	// 平台方下架或锁定或审核驳回时给出的理由
	private String statusChangeReason;
	
	// 商品的关键字，便于检索
	private String keyword;
	
	// 运费模板ID
	private Integer shopFreightTemplateId;
	
	// 上架时间
	private Date onSaleTime;
	
	// 下架时间
	private Date offSaleTime;
	
	// 操作方：1、商家，2、平台
	private Integer operator;
	
	// 商品是否促销
	private Integer isSalePromotion;
	
	// 商品是否配送：0、自提，1、配送
	private Integer isDelivery;
	
	// 定时上架，为空则表示未设置定时上架
	private Date timingOnSale;
	
	// 定时下架，为空则表示未设置定时下架
	private Date timingOffSale;
	
	// 商品描述
	private String describeUrl;
	
	// 商品的货号
	private String productNumber;
	
	// 商品的编码
	private String productCode;
	
	// 是否有报价：1、有价格，2、暂无报价
	private Integer hasPrice;
	
	// 排序指数，越小越靠前
	private String sortNumber;
	
	// 创建者用户ID
	private Integer creatorId;
	
	// 最后修改者用户ID
	private Integer editorId;

	@Id
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

	@Column(name="category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name="brand_id")
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name="shop_cid")
	public Integer getShopCid() {
		return shopCid;
	}

	public void setShopCid(Integer shopCid) {
		this.shopCid = shopCid;
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

	@Column(name="goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name="advert")
	public String getAdvert() {
		return advert;
	}

	public void setAdvert(String advert) {
		this.advert = advert;
	}

	@Column(name="item_info_status")
	public Integer getItemInfoStatus() {
		return itemInfoStatus;
	}

	public void setItemInfoStatus(Integer itemInfoStatus) {
		this.itemInfoStatus = itemInfoStatus;
	}

	@Column(name="status_change_reason")
	public String getStatusChangeReason() {
		return statusChangeReason;
	}

	public void setStatusChangeReason(String statusChangeReason) {
		this.statusChangeReason = statusChangeReason;
	}

	@Column(name="keyword")
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name="shop_freight_template_id")
	public Integer getShopFreightTemplateId() {
		return shopFreightTemplateId;
	}

	public void setShopFreightTemplateId(Integer shopFreightTemplateId) {
		this.shopFreightTemplateId = shopFreightTemplateId;
	}

	@Column(name="on_sale_time")
	public Date getOnSaleTime() {
		return onSaleTime;
	}

	public void setOnSaleTime(Date onSaleTime) {
		this.onSaleTime = onSaleTime;
	}

	@Column(name="off_sale_time")
	public Date getOffSaleTime() {
		return offSaleTime;
	}

	public void setOffSaleTime(Date offSaleTime) {
		this.offSaleTime = offSaleTime;
	}

	@Column(name="operator")
	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	@Column(name="is_sale_promotion")
	public Integer getIsSalePromotion() {
		return isSalePromotion;
	}

	public void setIsSalePromotion(Integer isSalePromotion) {
		this.isSalePromotion = isSalePromotion;
	}

	@Column(name="is_delivery")
	public Integer getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(Integer isDelivery) {
		this.isDelivery = isDelivery;
	}

	@Column(name="timing_on_sale")
	public Date getTimingOnSale() {
		return timingOnSale;
	}

	public void setTimingOnSale(Date timingOnSale) {
		this.timingOnSale = timingOnSale;
	}

	@Column(name="timing_off_sale")
	public Date getTimingOffSale() {
		return timingOffSale;
	}

	public void setTimingOffSale(Date timingOffSale) {
		this.timingOffSale = timingOffSale;
	}

	@Column(name="describe_url")
	public String getDescribeUrl() {
		return describeUrl;
	}

	public void setDescribeUrl(String describeUrl) {
		this.describeUrl = describeUrl;
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

	@Column(name="has_price")
	public Integer getHasPrice() {
		return hasPrice;
	}

	public void setHasPrice(Integer hasPrice) {
		this.hasPrice = hasPrice;
	}

	@Column(name="sort_number")
	public String getSortNumber() {
		return sortNumber;
	}

	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
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

	@Override
	public String toString() {
		return "ItemInfo [itemId=" + itemId + ", shopId=" + shopId + ", sellerId=" + sellerId + ", categoryId="
				+ categoryId + ", brandId=" + brandId + ", shopCid=" + shopCid + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + ", goodsName=" + goodsName + ", advert=" + advert
				+ ", itemInfoStatus=" + itemInfoStatus + ", statusChangeReason=" + statusChangeReason + ", keyword="
				+ keyword + ", shopFreightTemplateId=" + shopFreightTemplateId + ", onSaleTime=" + onSaleTime
				+ ", offSaleTime=" + offSaleTime + ", operator=" + operator + ", isSalePromotion=" + isSalePromotion
				+ ", isDelivery=" + isDelivery + ", timingOnSale=" + timingOnSale + ", timingOffSale=" + timingOffSale
				+ ", describeUrl=" + describeUrl + ", productNumber=" + productNumber + ", productCode=" + productCode
				+ ", hasPrice=" + hasPrice + ", sortNumber=" + sortNumber + ", creatorId=" + creatorId + ", editorId="
				+ editorId + "]";
	}
	
}
