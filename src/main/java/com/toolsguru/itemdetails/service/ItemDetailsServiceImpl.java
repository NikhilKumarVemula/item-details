package com.toolsguru.itemdetails.service;

import com.toolsguru.itemdetails.model.Category;
import com.toolsguru.itemdetails.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
