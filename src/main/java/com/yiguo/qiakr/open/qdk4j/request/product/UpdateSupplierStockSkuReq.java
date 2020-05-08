package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;

import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class UpdateSupplierStockSkuReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String skuCode;
    private String shapeCode;
    private Integer skuCount;
    private BigDecimal skuPrice;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.skuCode) && QiakrStringUtil.isEmpty(this.shapeCode)) {
            throw new QiakrApiException("skuCode or shapeCode may not be null");
        }
        if (this.skuCount == null && this.skuPrice == null) {
            throw new QiakrApiException("skuCount or skuPrice may not be null");
        }
        if (this.skuPrice != null && this.skuPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new QiakrApiException("skuPrice must be greater than 0.00");
        }
        if (this.skuCount != null && this.skuCount < 0) {
            throw new QiakrApiException("skuCount must be greater than 0");
        }
    }

    public String getSkuCode() {
        return skuCode;
    }

    public UpdateSupplierStockSkuReq setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    public String getShapeCode() {
        return shapeCode;
    }

    public UpdateSupplierStockSkuReq setShapeCode(String shapeCode) {
        this.shapeCode = shapeCode;
        return this;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public UpdateSupplierStockSkuReq setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
        return this;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public UpdateSupplierStockSkuReq setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }
}
