package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemAttributeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemAttributeValueReposirity extends JpaRepository<ItemAttributeValue,Integer>
{
    public ItemAttributeValue findItemAttributeValueByIdAndItemIdAndSkuId(Integer itemAttrId,Integer itemId,Integer skuId);
}
