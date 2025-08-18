package com.psk.BillingSoftware.service;

import com.psk.BillingSoftware.io.CategoryRequest;
import com.psk.BillingSoftware.io.CategoryResponse;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
}
