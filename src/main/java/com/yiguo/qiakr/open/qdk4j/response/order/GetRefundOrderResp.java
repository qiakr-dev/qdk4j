package com.yiguo.qiakr.open.qdk4j.response.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetRefundOrderResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long storeId;
    private Long customerId;
    private BigDecimal value;
    private BigDecimal refundPostFee;
    private Integer refundCount;
    private Byte refundMode;
    private Byte applyMode;
    private Date gmtCreate;
    private Byte status;
    private String expressCompany;
    private String expressCode;
    private String expressNo;
    private String reason;
    private String mobile;
    private BigDecimal payment;
    private String shapeCode;
    private String skuExternalSid;
    private Long productId;
    private String productCode;
    private Long shoppingCount;
    private Long skuId;
    private BigDecimal skuPrice;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private Long orderId;
    private String orderCode;
    private Date gmtUpdate;
    private Long orderItemId;
    private Byte refundType;
    private Byte deliveryType;
    private String cashFlow;

    public Long getId() {
        return id;
    }

    public GetRefundOrderResp setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getStoreId() {
        return storeId;
    }

    public GetRefundOrderResp setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public GetRefundOrderResp setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public GetRefundOrderResp setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public BigDecimal getRefundPostFee() {
        return refundPostFee;
    }

    public GetRefundOrderResp setRefundPostFee(BigDecimal refundPostFee) {
        this.refundPostFee = refundPostFee;
        return this;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public GetRefundOrderResp setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
        return this;
    }

    public Byte getRefundMode() {
        return refundMode;
    }

    public GetRefundOrderResp setRefundMode(Byte refundMode) {
        this.refundMode = refundMode;
        return this;
    }

    public Byte getApplyMode() {
        return applyMode;
    }

    public GetRefundOrderResp setApplyMode(Byte applyMode) {
        this.applyMode = applyMode;
        return this;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public GetRefundOrderResp setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public Byte getStatus() {
        return status;
    }

    public GetRefundOrderResp setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public GetRefundOrderResp setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public GetRefundOrderResp setExpressCode(String expressCode) {
        this.expressCode = expressCode;
        return this;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public GetRefundOrderResp setExpressNo(String expressNo) {
        this.expressNo = expressNo;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public GetRefundOrderResp setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public GetRefundOrderResp setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public GetRefundOrderResp setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    public String getShapeCode() {
        return shapeCode;
    }

    public GetRefundOrderResp setShapeCode(String shapeCode) {
        this.shapeCode = shapeCode;
        return this;
    }

    public String getSkuExternalSid() {
        return skuExternalSid;
    }

    public GetRefundOrderResp setSkuExternalSid(String skuExternalSid) {
        this.skuExternalSid = skuExternalSid;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public GetRefundOrderResp setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public GetRefundOrderResp setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public Long getShoppingCount() {
        return shoppingCount;
    }

    public GetRefundOrderResp setShoppingCount(Long shoppingCount) {
        this.shoppingCount = shoppingCount;
        return this;
    }

    public Long getSkuId() {
        return skuId;
    }

    public GetRefundOrderResp setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public GetRefundOrderResp setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public GetRefundOrderResp setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getNorms1Name() {
        return norms1Name;
    }

    public GetRefundOrderResp setNorms1Name(String norms1Name) {
        this.norms1Name = norms1Name;
        return this;
    }

    public String getNorms2Name() {
        return norms2Name;
    }

    public GetRefundOrderResp setNorms2Name(String norms2Name) {
        this.norms2Name = norms2Name;
        return this;
    }

    public String getNorms1Value() {
        return norms1Value;
    }

    public GetRefundOrderResp setNorms1Value(String norms1Value) {
        this.norms1Value = norms1Value;
        return this;
    }

    public String getNorms2Value() {
        return norms2Value;
    }

    public GetRefundOrderResp setNorms2Value(String norms2Value) {
        this.norms2Value = norms2Value;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public GetRefundOrderResp setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public GetRefundOrderResp setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public GetRefundOrderResp setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
        return this;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public GetRefundOrderResp setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    public Byte getRefundType() {
        return refundType;
    }

    public GetRefundOrderResp setRefundType(Byte refundType) {
        this.refundType = refundType;
        return this;
    }

    public Byte getDeliveryType() {
        return deliveryType;
    }

    public GetRefundOrderResp setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public String getCashFlow() {
        return cashFlow;
    }

    public GetRefundOrderResp setCashFlow(String cashFlow) {
        this.cashFlow = cashFlow;
        return this;
    }
}
