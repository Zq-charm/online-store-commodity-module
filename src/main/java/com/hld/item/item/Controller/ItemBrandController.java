package com.hld.item.item.Controller;

import com.hld.item.item.Entity.ItemBrand;
import com.hld.item.item.Reposirity.ItemBrandReposirity;
import com.hld.item.item.Service.ItemBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemBrandController
{
    @Autowired
    private ItemBrandReposirity itemBrandReposirity;

    @Autowired
    private ItemBrandService itemBrandService;

    //查询所有品牌
    @GetMapping(value = "/allBrand")
    public List<ItemBrand> brandList()
    {
        return itemBrandReposirity.findAll();
    }

    //添加一个品牌
    @PostMapping(value = "/addBrand")
    @ResponseBody
    public ItemBrand itemBrandAdd(@RequestBody ItemBrand newItemBrand)
    {
        return itemBrandReposirity.save(newItemBrand);
    }

    //根据品牌Id查询品牌
    @GetMapping(value = "/findItemBrand/{itemBrandId}")
    public ItemBrand itemBrandFindOne(@PathVariable("itemBrandId") Integer id)
    {
        return itemBrandReposirity.findItemBrandByBrandId(id);
    }

    //更新一个品牌
    @PostMapping(value = "/updateBrand/{id}")
    @ResponseBody
    public ItemBrand itemBrandUpdate(@RequestBody ItemBrand newItemBrand)
    {

        return itemBrandReposirity.save(newItemBrand);
    }

    //删除一个品牌
    @DeleteMapping(value = "/deleteBrand/{id}")
    public void itemBrandDelete(@PathVariable("id")Integer id)
    {
        itemBrandReposirity.deleteById(id);
    }
}
