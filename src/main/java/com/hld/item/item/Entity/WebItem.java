package com.hld.item.item.Entity;




import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class WebItem implements Serializable
{

    //商品ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Field(index=false,store=true,type= FieldType.Integer)
    private Integer itemId;

    //商品名称
    @Column
 //   @Field(index=true,analyzer="ik",store=true,searchAnalyzer="ik",type=FieldType.Text)
    private String itemName;


    //商品创建时间
    @Column
    private Date itemCreateTime;

    //商品SKU唯一价格
    @Column
//    @Field(index=true,analyzer="ik",store=true,searchAnalyzer="ik",type=FieldType.Double)
    private Double itemPrice;

    //商品图片Url
    @Column
 //   @Field(index=true,analyzer="ik",store=true,searchAnalyzer="ik",type=FieldType.Text)
    private String itemPictureUrl;

    //商品类别
    @Column
//    @Field(index=true,analyzer="ik",store=true,searchAnalyzer="ik",type=FieldType.Text)
    private String itemCategory;

    //商品SkuID
    @Column
    private Integer itemSku;

    //商品品牌ID
    @Column
    private Integer itemBrandId;

    //商品类目ID
    @Column
    private Integer itemCategoryId;

    //店铺ID号
    @Column
    private Integer shopId;

    //商品品牌中文名
    @Column
    private String brandNameCn;

    //SKU对应唯一商品库存量
    @Column
    private Integer itemInventory;

    //商家ID号
    @Column
    private Integer sellerId;

    //商品所属店铺内部的类目ID
    @Column
    private Integer shopCid;

    //运费Id
    @Column
    private Integer shopFreightTemplateId;

    //商品货号
    @Column
    private String itemProductNum;

    //商品属性   属性名:属性值
    @Column
    private String itemAttribute;

    //商品状态
    @Column
    private Integer itemStatue;

    public Integer getItemStatue() {
        return itemStatue;
    }

    public void setItemStatue(Integer itemStatue) {
        this.itemStatue = itemStatue;
    }

    //商品广告词
    @Column
  //  @Field(index=true,analyzer="ik",store=true,searchAnalyzer="ik",type=FieldType.Text)
    private String itemAd;

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

    public Date getItemCreateTime() {
        return itemCreateTime;
    }

    public void setItemCreateTime(Date itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
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

    public Integer getItemSku() {
        return itemSku;
    }

    public void setItemSku(Integer itemSku) {
        this.itemSku = itemSku;
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

    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn;
    }

    public Integer getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Integer itemInventory) {
        this.itemInventory = itemInventory;
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

    public String getItemProductNum() {
        return itemProductNum;
    }

    public void setItemProductNum(String itemProductNum) {
        this.itemProductNum = itemProductNum;
    }


    public String getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(String itemAttribute) {
        this.itemAttribute = itemAttribute;
    }

    public String getItemAd() {
        return itemAd;
    }

    public void setItemAd(String itemAd) {
        this.itemAd = itemAd;
    }
//
//    public String[] getImages() {
//        String image2 = this.getItemPictureUrl();
//        if (image2 != null && !"".equals(image2)) {
//            String[] strings = image2.split(",");
//            return strings;
//        }
//        return null;
//    }
}
