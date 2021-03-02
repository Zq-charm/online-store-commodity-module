package com.hld.item.item.Controller;

import com.hld.item.item.Entity.WebItem;
import com.hld.item.item.Service.WebItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

;

@RestController
public class WebItemController
{

    @Autowired
    private WebItemService webItemService;

    //根据商品ID获取商品SKU列表
    @GetMapping(value = "/SKU/{itemId}")
    public ResponseEntity<List<WebItem>> findItemSkuListByItemId(@PathVariable("itemId") Integer itemId, Model model)
    {
        try
        {

            List<WebItem> webItems = new ArrayList<>();
            webItems = this.webItemService.getItemSkuListByItemId(itemId);
            //取商品描述信息
//        ItemDesc itemDesc = itemService.getItemDescById(itemId);
            //把信息传递给页面
//            model.addAttribute("webItem", webItem);
//        model.addAttribute("itemDesc", itemDesc);
//            System.out.println(webItem.toString());
            //返回逻辑视图
            System.out.println("根据id查询"+webItems);
            return ResponseEntity.ok(webItems);
        }catch (Exception e)
        {
            System.out.println("根据id查询失败");
            e.printStackTrace();
        }
        //调用服务取商品基本信息
        System.out.println("根据id查询失败");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }


    //根据商品ID获取商品
    @GetMapping(value = "/{itemId}")
    public ResponseEntity<WebItem> findItemByItemId(@PathVariable("itemId") Integer itemId, Model model)
    {
        try
        {

            WebItem webItem = new WebItem();
            webItem = this.webItemService.getItemByItemId(itemId);
            //取商品描述信息
//        ItemDesc itemDesc = itemService.getItemDescById(itemId);
            //把信息传递给页面
//            model.addAttribute("webItem", webItem);
//        model.addAttribute("itemDesc", itemDesc);
//            System.out.println(webItem.toString());
            //返回逻辑视图
            System.out.println("根据id查询"+webItem);
            return ResponseEntity.ok(webItem);
        }catch (Exception e)
        {
            System.out.println("根据id查询失败");
            e.printStackTrace();
        }
        //调用服务取商品基本信息
        System.out.println("根据id查询失败");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    //获取全部商品并存入solr
    @GetMapping(value = "/allItems")
    public List<WebItem> saveItemsSolr()
    {
        try{
            List<WebItem> webItems = new ArrayList<>();
            webItems = webItemService.getAllItem();
            return webItems;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("获取所有商品出错");
        return null;
    }
//
//    @Autowired
//    private ItemInfoReposirity itemInfoReposirity;
//
//    @Autowired
//    private ItemSkuReposirity itemSkuReposirity;
//
//    @Autowired
//    private ItemBrandReposirity itemBrandReposirity;
//
//    @Autowired
//    private ItemCategoryBrandReposirity itemCategoryBrandReposirity;
//
//    @Autowired
//    private ItemCategoryReposirity itemCategoryReposirity;
//
//    @Autowired
//    private ItemCategoryAttributesReposirity itemCategoryAttributesReposirity;
//
//    @Autowired
//    private ItemCategoryAttrValueReposirity itemCategoryAttrValueReposirity;
//
//    @Autowired
//    private  ItemAttributeValueReposirity itemAttributeValueReposirity;
//
//    @Autowired
//    private ItemSkuPictureReposirity itemSkuPictureReposirity;
//
//
//
//    public WebItem getItemByItemId(Integer itemId)
//    {
//        //查询缓存
//        try{
//            RedisUt redisUt = new RedisUt();
//            JedisPool jedisPool= redisUt.initJedisPool();
//            Jedis jedis = redisUt.getJedis(jedisPool);
//            String result =  redisUt.getByKey(jedis,"ITEM_INFO:" + itemId +":BASE");
//            if (StringUtils.isNotBlank(result))
//            {
//                WebItem item = JsonUtil.jsonToPojo(result,WebItem.class);
//                redisUt.close(jedisPool,jedis);
//                return item;
//            }
//
//
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        try
//        {
//            ItemInfo itemInfo = new ItemInfo();
//            itemInfo = itemInfoReposirity.findItemInfoByItemId(itemId);
//
//            WebItem item =new WebItem();
//            item.setItemStatue(itemInfo.getItemInfoStatus());
//            item.setItemId(itemId);
//            item.setShopId(itemInfo.getShopId());
//            item.setSellerId(itemInfo.getSellerId());
//            item.setShopCid(itemInfo.getShopCid());
//            item.setItemAd(itemInfo.getAdvert());
//            item.setItemName(itemInfo.getGoodsName());//商品名称
//            item.setItemProductNum(itemInfo.getProductNumber());//商品货号
//            item.setItemCreateTime(itemInfo.getCreatedTime());//商品创建时间
//            item.setItemBrandId(itemInfo.getBrandId());//商品品牌ID
//            ///扩展。。。
//
//            ItemBrand itemBrand = new ItemBrand();
//            itemBrand = itemBrandReposirity.findItemBrandByBrandId(itemInfo.getBrandId());
//            item.setBrandNameCn(itemBrand.getbrandNameCn());//商品品牌中文名
//            //扩展。。。
//
//
//
//            ItemCategory itemCategory = new ItemCategory();//品牌类别表
//            itemCategory=itemCategoryReposirity.findItemCategoryByCategoryId(itemInfo.getCategoryId());//商品类别表
//            item.setItemCategory(itemCategory.getCategoryName());
//            item.setItemCategoryId(itemCategory.getCategoryId());
//            //扩展
//
//
//            if (item!=null)//添加到缓存
//            {
//                try{
//                    RedisUt redisUt = new RedisUt();
//                    JedisPool jedisPool = redisUt.initJedisPool();
//                    Jedis jedis = redisUt.getJedis(jedisPool);
//                    jedis.append("ITEM_INFO:" + itemId +":BASE",JsonUtil.objectToJson(item));
//                    jedis.expire("ITEM_INFO:" + itemId +":BASE",3600);
//                    redisUt.close(jedisPool,jedis);
////                    RedisUtil redisUtil =RedisUtil.getRedisUtil();
////                    redisUtil.append("ITEM_INFO:" + itemId +":BASE",JsonUtils.objectToJson(item));
////                    //设置过期时间
////                    redisUtil.expire("ITEM_INFO:" + itemId +":BASE",3600);//设置过期时间一小时
//                }catch (Exception e)
//                {
//                    e.printStackTrace();
//                }
//            }
//
//
//            return item;
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    public List<WebItem> getItemSkuListByItemId(Integer itemId)
//    {
//        List<WebItem> webItems = new ArrayList<>();
//        //查询缓存
//        try {
//
//            RedisUt redisUt = new RedisUt();
//            JedisPool jedisPool = redisUt.initJedisPool();
//            Jedis jedis = redisUt.getJedis(jedisPool);
//            for (int i=1;redisUt.getByKey(jedis, "ITEM_INFO:" + itemId + ":SKU"+i)!=null;i++)
//            {
//                String result = redisUt.getByKey(jedis, "ITEM_INFO:" + itemId + ":SKU"+i);
//                if (StringUtils.isNotBlank(result)) {
//                    WebItem item = JsonUtil.jsonToPojo(result, WebItem.class);
//                    webItems.add(item);
//                }else
//                {
//                    break;
//                }
//            }
//            redisUt.close(jedisPool, jedis);
//            if (webItems.get(0)!=null)
//            {
//                return webItems;
//            }
//
//
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        try{
//            ItemInfo itemInfo = new ItemInfo();
//            itemInfo = itemInfoReposirity.findItemInfoByItemId(itemId);
//            List<ItemCategoryAttributes> itemCategoryAttributesList = new ArrayList<>();//商品类别属性集合
//            itemCategoryAttributesList = itemCategoryAttributesReposirity.findItemCategoryAttributesByAttrId(itemInfo.getCategoryId());
//
//
//            //根据SKU查询
//            List<ItemSku> itemSku = new ArrayList<>();
//
//            itemSku = itemSkuReposirity.findItemSkuByItemId(itemId);
//
//
//            //绑定ItemSku
//            for (ItemSku itemSku1 : itemSku)
//            {
//                WebItem webItem = new WebItem();
//
//                webItem=this.getItemByItemId(itemId);//根据ID获得商品
//
//                webItem.setItemInventory(itemSku1.getInventory());
//
//                webItem.setItemPrice(itemSku1.getMarketPrice());
//                webItem.setItemName(itemSku1.getSkuName());
//                webItem.setItemSku(itemSku1.getSkuId());
//                Map<String, String> map = new HashMap<String, String>();
//                //类别属性
//                for(ItemCategoryAttributes itemCAt : itemCategoryAttributesList)//将属性名ID：属性值存为MAP对象
//                {
//
//                    ItemAttributeValue itemAttributeValue = new ItemAttributeValue();//商品与其基本属性取值关联表
//                    itemAttributeValue = itemAttributeValueReposirity.findItemAttributeValueByIdAndItemIdAndSkuId(itemCAt.getAttrId(),itemInfo.getItemId(),itemSku1.getSkuId());  //取出商品对应ID的属性名及属性值List
//
//                    ItemCategoryAttrValue itemCategoryAttrValue = new ItemCategoryAttrValue();
//                    itemCategoryAttrValue = itemCategoryAttrValueReposirity.findItemCategoryAttrValueByValueId(itemAttributeValue.getValueId());
//
//                    String itemattrName = itemCAt.getAttrName();
//                    String itemattrValue = itemCategoryAttrValue.getAttributeValue();
//
//                    map.put(itemattrName,itemattrValue);
//
//                    // item.setItemSku(itemAttributeValue.getSkuId());//设置SKUID
//                }
//                webItem.setItemAttribute(map.toString());
//
//                webItems.add(webItem);
//            }
//
//
//            if (webItems!=null)//添加到缓存
//            {
//                try {
//                    for (WebItem webItem:webItems)
//                    {
//                        RedisUt redisUt = new RedisUt();
//                        JedisPool jedisPool = redisUt.initJedisPool();
//                        Jedis jedis = redisUt.getJedis(jedisPool);
//                        jedis.append("ITEM_INFO:" + itemId + ":SKU"+webItem.getItemSku(), JsonUtil.objectToJson(webItem));
//                        jedis.expire("ITEM_INFO:" + itemId + ":SKU"+webItem.getItemSku(), 3600);
//                        redisUt.close(jedisPool, jedis);
//                    }
//
////                    RedisUtil redisUtil =RedisUtil.getRedisUtil();
////                    redisUtil.append("ITEM_INFO:" + itemId +":BASE",JsonUtils.objectToJson(item));
////                    //设置过期时间
////                    redisUtil.expire("ITEM_INFO:" + itemId +":BASE",3600);//设置过期时间一小时
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//
//                return webItems;
//            }
////            ItemSkuPicture itemSkuPicture = new ItemSkuPicture();
////            itemSkuPicture = itemSkuPictureDao.queryListBySkuId(item.getItemSku());
////            //根据SKUID查询图片
////            item.setItemPictureUrl(itemSkuPicture.getPictureUrl());
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    public List<WebItem> getAllItem()
//    {
//        try {
//            List<WebItem> itemList =new ArrayList<>();
//            List<ItemInfo> itemInfoList = itemInfoReposirity.findAll();
//            for (ItemInfo itemInfo:itemInfoList)
//            {
//                WebItem webItem = new WebItem();
//                webItem.setItemStatue(itemInfo.getItemInfoStatus());
//                webItem.setItemId(itemInfo.getItemId());
//                webItem.setShopId(itemInfo.getShopId());
//                webItem.setSellerId(itemInfo.getSellerId());
//                webItem.setShopCid(itemInfo.getShopCid());
//                webItem.setItemAd(itemInfo.getAdvert());
//                webItem.setItemName(itemInfo.getGoodsName());//商品名称
//                webItem.setItemProductNum(itemInfo.getProductNumber());//商品货号
//                webItem.setItemCreateTime(itemInfo.getCreatedTime());//商品创建时间
//                webItem.setItemBrandId(itemInfo.getBrandId());//商品品牌ID
//                itemList.add(webItem);
//            }
////            solrTemplate.saveBeans(itemList);
////            solrTemplate.commit();
//            return itemList;
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("getAllItem出错");
//        return null;
//    }


}
