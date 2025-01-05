package com.javatechie.Mapper;

import com.javatechie.dto.ProductResponse;
import com.javatechie.entity.Product;

public class ProductResponseMapper {


    public static ProductResponse map(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .discountPercentage(product.getDiscountPercentage())
                .priceAfterDiscount(product.getPrice() - (product.getPrice() * product.getDiscountPercentage() / 100))
                .build();
    }
}
