package com.hld.item.item.Reposirity;

import com.hld.item.item.Entity.WebItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebItemReposirity extends JpaRepository<WebItem,Integer>
{
    public WebItem findWebItemByItemId(int itemId);
}
