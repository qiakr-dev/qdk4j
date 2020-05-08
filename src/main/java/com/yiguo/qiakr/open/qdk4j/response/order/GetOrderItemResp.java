package com.yiguo.qiakr.open.qdk4j.response.order;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetOrderItemResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderItemId;
    private Long skuId;
    private String shapeCode;
    private Long shoppingCount;
    private Long productId;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private BigDecimal payment;
    private BigDecimal discountFee;
    private BigDecimal totalFee;
    private String skuExternalSid;
    private Long categorySecondaryId;
    private Long brandId;
    private String categoryName;
    private String productCode;
    private String brandName;
    private Integer outOfStock;
    private BigDecimal skuPrice;
    private BigDecimal refundValue;
    private Byte refundStatus;
    private Long presaleStockId;

    public Long getOrderItemId() {
        return orderItemId;
    }

    public GetOrderItemResp setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    public Long getSkuId() {
        return skuId;
    }

    public GetOrderItemResp setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }

    public String getShapeCode() {
        return shapeCode;
    }

    public GetOrderItemResp setShapeCode(String shapeCode) {
        this.shapeCode = shapeCode;
        return this;
    }

    public Long getShoppingCount() {
        return shoppingCount;
    }

    public GetOrderItemResp setShoppingCount(Long shoppingCount) {
        this.shoppingCount = shoppingCount;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public GetOrderItemResp setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public GetOrderItemResp setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getNorms1Name() {
        return norms1Name;
    }

    public GetOrderItemResp setNorms1Name(String norms1Name) {
        this.norms1Name = norms1Name;
        return this;
    }

    public String getNorms2Name() {
        return norms2Name;
    }

    public GetOrderItemResp setNorms2Name(String norms2Name) {
        this.norms2Name = norms2Name;
        return this;
    }

    public String getNorms1Value() {
        return norms1Value;
    }

    public GetOrderItemResp setNorms1Value(String norms1Value) {
        this.norms1Value = norms1Value;
        return this;
    }

    public String getNorms2Value() {
        return norms2Value;
    }

    public GetOrderItemResp setNorms2Value(String norms2Value) {
        this.norms2Value = norms2Value;
        return this;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public GetOrderItemResp setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public GetOrderItemResp setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public GetOrderItemResp setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public String getSkuExternalSid() {
        return skuExternalSid;
    }

    public GetOrderItemResp setSkuExternalSid(String skuExternalSid) {
        this.skuExternalSid = skuExternalSid;
        return this;
    }

    public Long getCategorySecondaryId() {
        return categorySecondaryId;
    }

    public GetOrderItemResp setCategorySecondaryId(Long categorySecondaryId) {
        this.categorySecondaryId = categorySecondaryId;
        return this;
    }

    public Long getBrandId() {
        return brandId;
    }

    public GetOrderItemResp setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public GetOrderItemResp setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public GetOrderItemResp setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public GetOrderItemResp setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public Integer getOutOfStock() {
        return outOfStock;
    }

    public GetOrderItemResp setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
        return this;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public GetOrderItemResp setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }

    public BigDecimal getRefundValue() {
        return refundValue;
    }

    public GetOrderItemResp setRefundValue(BigDecimal refundValue) {
        this.refundValue = refundValue;
        return this;
    }

    public Byte getRefundStatus() {
        return refundStatus;
    }

    public GetOrderItemResp setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }

    public Long getPresaleStockId() {
        return presaleStockId;
    }

    public GetOrderItemResp setPresaleStockId(Long presaleStockId) {
        this.presaleStockId = presaleStockId;
        return this;
    }
}
