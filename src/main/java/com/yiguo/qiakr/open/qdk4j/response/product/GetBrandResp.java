package com.yiguo.qiakr.open.qdk4j.response.product;

import java.io.Serializable;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetBrandResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long brandId;
    private String brandName;

    public Long getBrandId() {
        return brandId;
    }

    public GetBrandResp setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public GetBrandResp setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
}
