package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemCategoryAttributes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemCategoryAttributesReposirity extends JpaRepository<ItemCategoryAttributes,Integer>
{
    public List<ItemCategoryAttributes> findItemCategoryAttributesByAttrId(Integer attrId);
}
