package com.hld.item.item.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;


public class Item implements Serializable
{
    //商品ID
    private Integer itemId;

    //商品名称
    private String itemName;

    public Integer getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Integer itemInventory) {
        this.itemInventory = itemInventory;
    }

    public Date getItemCreateTime() {
        return itemCreateTime;
    }

    public void setItemCreateTime(Date itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    //商品创建时间
    private Date itemCreateTime;

    //商品SKU唯一价格
    private Double itemPrice;

    //商品图片Url
    private String itemPictureUrl;

    //商品类别
    private String itemCategory;

    //商品SkuID
    private Integer itemSku;

    //商品品牌ID
    private Integer itemBrandId;

    //商品类目ID
    private Integer itemCategoryId;

    //店铺ID号
    private Integer shopId;

    //商品品牌中文名
    private String brandNameCn;

    //SKU对应唯一商品库存量
    private Integer itemInventory;

    //商家ID号
    private Integer sellerId;

    //商品所属店铺内部的类目ID
    private Integer shopCid;

    //运费Id
    private Integer shopFreightTemplateId;

    //商品货号
    private String itemProductNum;

    //商品属性   属性名:属性值
    private Map<String,String> itemAttribute;

    //商品广告词
    private String itemAd;


    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn;
    }

    public Integer getItemBrandId() {
        return itemBrandId;
    }

    public void setItemBrandId(Integer itemBrandId) {
        this.itemBrandId = itemBrandId;
    }

    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getShopCid() {
        return shopCid;
    }

    public void setShopCid(Integer shopCid) {
        this.shopCid = shopCid;
    }

    public Integer getShopFreightTemplateId() {
        return shopFreightTemplateId;
    }

    public void setShopFreightTemplateId(Integer shopFreightTemplateId) {
        this.shopFreightTemplateId = shopFreightTemplateId;
    }




    public Integer getItemSku() {
        return itemSku;
    }

    public void setItemSku(Integer itemSku) {
        this.itemSku = itemSku;
    }

    public Map<String, String> getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(Map<String, String> itemAttribute) {
        this.itemAttribute = itemAttribute;
    }



    public String getItemAd() {
        return itemAd;
    }

    public void setItemAd(String itemAd) {
        this.itemAd = itemAd;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemPictureUrl() {
        return itemPictureUrl;
    }

    public void setItemPictureUrl(String itemPictureUrl) {
        this.itemPictureUrl = itemPictureUrl;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemProductNum() {
        return itemProductNum;
    }

    public void setItemProductNum(String itemProductNum) {
        this.itemProductNum = itemProductNum;
    }


}
