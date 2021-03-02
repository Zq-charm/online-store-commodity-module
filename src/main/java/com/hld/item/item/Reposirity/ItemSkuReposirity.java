package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.ItemSku;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemSkuReposirity extends JpaRepository<ItemSku,Integer>
{
    public List<ItemSku> findItemSkuByItemId(Integer itemId);
}
