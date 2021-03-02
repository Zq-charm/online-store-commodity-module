package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemBrand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemBrandReposirity extends JpaRepository<ItemBrand,Integer>
{
    public ItemBrand findItemBrandByBrandId(int brandId);
}
