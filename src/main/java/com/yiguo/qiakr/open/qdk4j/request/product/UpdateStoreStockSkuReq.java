package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
public final class UpdateStoreStockSkuReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String skuCode;
    private String shapeCode;
    private Integer skuCount;
    private BigDecimal skuPrice;
    private Long storeId;
    private String storeCode;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isAllEmpty(this.skuCode, this.shapeCode)) {
            throw new QiakrApiException("skuCode or shapeCode may not be null");
        }
        if (this.storeId == null && QiakrStringUtil.isEmpty(this.storeCode)) {
            throw new QiakrApiException("storeId or storeCode may not be null");
        }
        if (this.skuCount == null && this.skuPrice == null) {
            throw new QiakrApiException("skuCount or skuPrice may not be null");
        }
        if (this.skuCount != null && this.skuCount < 0) {
            throw new QiakrApiException("skuCount must be greater than 0");
        }
        if (this.skuPrice != null && this.skuPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new QiakrApiException("skuPrice must be greater than 0.00");
        }
    }
}
