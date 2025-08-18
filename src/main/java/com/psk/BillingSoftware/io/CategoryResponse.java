package com.psk.BillingSoftware.io;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@Data
public class CategoryResponse {
    private String categoryId;
    private String name;
    private String description;
    private String bgColor;
    private String imgUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
