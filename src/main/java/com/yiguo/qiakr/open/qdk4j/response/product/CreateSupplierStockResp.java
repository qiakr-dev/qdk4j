package com.yiguo.qiakr.open.qdk4j.response.product;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class CreateSupplierStockResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Long productId;

    public Long getProductId() {
        return productId;
    }

    public CreateSupplierStockResp setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
}
