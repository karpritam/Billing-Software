package com.psk.BillingSoftware.service;

import com.psk.BillingSoftware.io.CategoryRequest;
import com.psk.BillingSoftware.io.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();
}
