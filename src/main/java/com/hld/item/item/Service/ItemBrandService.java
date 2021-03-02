package com.hld.item.item.Service;

import com.hld.item.item.Reposirity.ItemBrandReposirity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemBrandService
{
    @Autowired
    private ItemBrandReposirity itemBrandReposirity;
}
