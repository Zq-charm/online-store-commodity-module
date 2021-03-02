package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryReposirity extends JpaRepository<ItemCategory,Integer>
{
    public ItemCategory findItemCategoryByCategoryId(Integer categoryId);
}
