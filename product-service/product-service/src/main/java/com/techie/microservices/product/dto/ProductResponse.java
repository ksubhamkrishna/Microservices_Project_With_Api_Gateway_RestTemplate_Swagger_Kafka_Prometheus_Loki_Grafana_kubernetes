package com.techie.microservices.product.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    @Id
    private String id;
    private String name;
    private String description;
    private String skuCode;
    private BigDecimal price;


}
