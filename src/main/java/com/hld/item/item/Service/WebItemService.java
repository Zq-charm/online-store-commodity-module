package com.hld.item.item.Service;

import com.hld.item.item.Entity.WebItem;

import java.util.List;

public interface WebItemService
{
    public List<WebItem> getItemSkuListByItemId(Integer itemId);
    public WebItem getItemByItemId(Integer itemId);
    public List<WebItem> getAllItem();
}
