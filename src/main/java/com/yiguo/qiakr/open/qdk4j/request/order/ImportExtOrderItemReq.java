package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class ImportExtOrderItemReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private Long brandId;
    private String brandName;
    private String extSkuCode;
    private BigDecimal payment;
    private BigDecimal discountFee;
    private BigDecimal totalPrice;
    private BigDecimal skuPrice;
    private BigDecimal refundValue;
    private Long category_id;
    private Long category_family_id;
    private Long shoppingCount;

    public String getProductName() {
        return productName;
    }

    public ImportExtOrderItemReq setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getNorms1Name() {
        return norms1Name;
    }

    public ImportExtOrderItemReq setNorms1Name(String norms1Name) {
        this.norms1Name = norms1Name;
        return this;
    }

    public String getNorms2Name() {
        return norms2Name;
    }

    public ImportExtOrderItemReq setNorms2Name(String norms2Name) {
        this.norms2Name = norms2Name;
        return this;
    }

    public String getNorms1Value() {
        return norms1Value;
    }

    public ImportExtOrderItemReq setNorms1Value(String norms1Value) {
        this.norms1Value = norms1Value;
        return this;
    }

    public String getNorms2Value() {
        return norms2Value;
    }

    public ImportExtOrderItemReq setNorms2Value(String norms2Value) {
        this.norms2Value = norms2Value;
        return this;
    }

    public Long getBrandId() {
        return brandId;
    }

    public ImportExtOrderItemReq setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public ImportExtOrderItemReq setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getExtSkuCode() {
        return extSkuCode;
    }

    public ImportExtOrderItemReq setExtSkuCode(String extSkuCode) {
        this.extSkuCode = extSkuCode;
        return this;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public ImportExtOrderItemReq setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public ImportExtOrderItemReq setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public ImportExtOrderItemReq setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public ImportExtOrderItemReq setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }

    public BigDecimal getRefundValue() {
        return refundValue;
    }

    public ImportExtOrderItemReq setRefundValue(BigDecimal refundValue) {
        this.refundValue = refundValue;
        return this;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public ImportExtOrderItemReq setCategory_id(Long category_id) {
        this.category_id = category_id;
        return this;
    }

    public Long getCategory_family_id() {
        return category_family_id;
    }

    public ImportExtOrderItemReq setCategory_family_id(Long category_family_id) {
        this.category_family_id = category_family_id;
        return this;
    }

    public Long getShoppingCount() {
        return shoppingCount;
    }

    public ImportExtOrderItemReq setShoppingCount(Long shoppingCount) {
        this.shoppingCount = shoppingCount;
        return this;
    }
}
