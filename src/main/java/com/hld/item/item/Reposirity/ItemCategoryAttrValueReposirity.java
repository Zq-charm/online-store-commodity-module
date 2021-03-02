package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemCategoryAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryAttrValueReposirity extends JpaRepository<ItemCategoryAttrValue,Integer>
{
    public ItemCategoryAttrValue findItemCategoryAttrValueByValueId(Integer valueId);
}
