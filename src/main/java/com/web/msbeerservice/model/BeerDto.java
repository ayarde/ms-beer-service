package com.web.msbeerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private BeerStyleEnum beerStyle;
    private String beerName;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
