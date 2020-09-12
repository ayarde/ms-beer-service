package com.web.msbeerservice.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerListPageable extends PageImpl<BeerDto> {
    public BeerListPageable(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerListPageable(List<BeerDto> content) {
        super(content);
    }
}
