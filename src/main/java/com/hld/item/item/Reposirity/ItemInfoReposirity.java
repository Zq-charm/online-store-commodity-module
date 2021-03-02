package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemInfoReposirity extends JpaRepository<ItemInfo,Integer>
{
    public ItemInfo findItemInfoByItemId(Integer itemId);
}
