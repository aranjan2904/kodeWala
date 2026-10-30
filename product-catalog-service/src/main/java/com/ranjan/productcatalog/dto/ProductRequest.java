package com.ranjan.productcatalog.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank(message = "Product name is required")
        @Size(max = 120, message = "Name cannot exceed 120 characters")
        String name,

        @Size(max = 1000, message = "Description cannot exceed 1000 characters")
        String description,

        @NotNull(message = "Price is required")
        @DecimalMin(value = "0.01", message = "Price must be greater than zero")
        @Digits(integer = 10, fraction = 2, message = "Price can have at most 2 decimal places")
        BigDecimal price,

        @NotBlank(message = "Category is required")
        @Size(max = 80, message = "Category cannot exceed 80 characters")
        String category,

        @NotNull(message = "Stock quantity is required")
        @Min(value = 0, message = "Stock quantity cannot be negative")
        Integer stockQuantity,

        Boolean active
) {
}
