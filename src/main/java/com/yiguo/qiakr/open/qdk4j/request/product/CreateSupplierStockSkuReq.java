package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class CreateSupplierStockSkuReq extends BaseResp {
    private static final long serialVersionUID = 1L;
    private String norms1Value;
    private String norms2Value;
    private String shapeCode;
    private String skuExternalSid;
    private Integer skuCount;
    private BigDecimal skuPrice;

    public String getNorms1Value() {
        return norms1Value;
    }

    public CreateSupplierStockSkuReq setNorms1Value(String norms1Value) {
        this.norms1Value = norms1Value;
        return this;
    }

    public String getNorms2Value() {
        return norms2Value;
    }

    public CreateSupplierStockSkuReq setNorms2Value(String norms2Value) {
        this.norms2Value = norms2Value;
        return this;
    }

    public String getSkuExternalSid() {
        return skuExternalSid;
    }

    public CreateSupplierStockSkuReq setSkuExternalSid(String skuExternalSid) {
        this.skuExternalSid = skuExternalSid;
        return this;
    }

    public String getShapeCode() {
        return shapeCode;
    }

    public CreateSupplierStockSkuReq setShapeCode(String shapeCode) {
        this.shapeCode = shapeCode;
        return this;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public CreateSupplierStockSkuReq setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
        return this;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public CreateSupplierStockSkuReq setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }
}
