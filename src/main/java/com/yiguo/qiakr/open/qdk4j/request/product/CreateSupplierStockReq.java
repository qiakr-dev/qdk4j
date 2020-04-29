package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

import java.math.BigDecimal;
import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class CreateSupplierStockReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String productName;
    private String subHead;
    private String selfGroupName;
    private String productPicUrl;
    private String productCode;
    private Long categorySecondaryId;
    private String previewJson;
    private BigDecimal tagPrice;
    private List<CreateSupplierStockSkuReq> stockSkuList;
    private Long norms1Id;
    private Long norms2Id;
    private Long brandId;
    private Integer limitCount;
    private Byte limitDelivery;
    private Byte commissionType;
    private String commissionRate;
    private BigDecimal commissionValue;
    private Byte couponDisable;

    public String getProductName() {
        return productName;
    }

    public CreateSupplierStockReq setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getSubHead() {
        return subHead;
    }

    public CreateSupplierStockReq setSubHead(String subHead) {
        this.subHead = subHead;
        return this;
    }

    public String getSelfGroupName() {
        return selfGroupName;
    }

    public CreateSupplierStockReq setSelfGroupName(String selfGroupName) {
        this.selfGroupName = selfGroupName;
        return this;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public CreateSupplierStockReq setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public CreateSupplierStockReq setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public Long getCategorySecondaryId() {
        return categorySecondaryId;
    }

    public CreateSupplierStockReq setCategorySecondaryId(Long categorySecondaryId) {
        this.categorySecondaryId = categorySecondaryId;
        return this;
    }

    public String getPreviewJson() {
        return previewJson;
    }

    public CreateSupplierStockReq setPreviewJson(String previewJson) {
        this.previewJson = previewJson;
        return this;
    }

    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    public CreateSupplierStockReq setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
        return this;
    }

    public List<CreateSupplierStockSkuReq> getStockSkuList() {
        return stockSkuList;
    }

    public CreateSupplierStockReq setStockSkuList(List<CreateSupplierStockSkuReq> stockSkuList) {
        this.stockSkuList = stockSkuList;
        return this;
    }

    public Long getNorms1Id() {
        return norms1Id;
    }

    public CreateSupplierStockReq setNorms1Id(Long norms1Id) {
        this.norms1Id = norms1Id;
        return this;
    }

    public Long getNorms2Id() {
        return norms2Id;
    }

    public CreateSupplierStockReq setNorms2Id(Long norms2Id) {
        this.norms2Id = norms2Id;
        return this;
    }

    public Long getBrandId() {
        return brandId;
    }

    public CreateSupplierStockReq setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public CreateSupplierStockReq setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    public Byte getLimitDelivery() {
        return limitDelivery;
    }

    public CreateSupplierStockReq setLimitDelivery(Byte limitDelivery) {
        this.limitDelivery = limitDelivery;
        return this;
    }

    public Byte getCommissionType() {
        return commissionType;
    }

    public CreateSupplierStockReq setCommissionType(Byte commissionType) {
        this.commissionType = commissionType;
        return this;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public CreateSupplierStockReq setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }

    public BigDecimal getCommissionValue() {
        return commissionValue;
    }

    public CreateSupplierStockReq setCommissionValue(BigDecimal commissionValue) {
        this.commissionValue = commissionValue;
        return this;
    }

    public Byte getCouponDisable() {
        return couponDisable;
    }

    public CreateSupplierStockReq setCouponDisable(Byte couponDisable) {
        this.couponDisable = couponDisable;
        return this;
    }
}
