package com.toolsguru.itemdetails.controller;

import com.toolsguru.itemdetails.model.Category;
import com.toolsguru.itemdetails.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class ItemDetailsController {

    @Autowired
    private ItemDetailsService itemDetailsService;

    public ItemDetailsController(ItemDetailsService itemDetailsService) {
        this.itemDetailsService = itemDetailsService;
    }

    @GetMapping("/categories")
    List<Category> all() {
        return itemDetailsService.findAll();
    }
    
}
