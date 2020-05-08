package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

import java.math.BigDecimal;
import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class ImportExtOrderReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String subject;
    private String extOrderCode;
    private BigDecimal totalPrice;
    private BigDecimal discountFee;
    private Long gmtCreate;
    private Long gmtUpdate;
    private Byte status;
    private String remark;
    private Byte payType;
    private BigDecimal payment;
    private Long payTime;
    private String thirdTradeNo;
    private String customerExtCode;
    private String customerPhone;
    private String customerName;
    private String salesPhone;
    private String salesName;
    private String storeName;
    private String storeExtCode;
    private Byte deliveryType;
    private Long deliveryTime;
    private BigDecimal postFee;
    private String receivePersonName;
    private String receiveMobile;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveDistrict;
    private String expressCompany;
    private String expressCode;
    private Long supplierId;
    private Byte grantCoupon;
    private Byte grantPoint;
    private String platformCode;
    private String insulateGroupName;
    private List<ImportExtOrderItemReq> orderItemList;

    public String getSubject() {
        return subject;
    }

    public ImportExtOrderReq setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getExtOrderCode() {
        return extOrderCode;
    }

    public ImportExtOrderReq setExtOrderCode(String extOrderCode) {
        this.extOrderCode = extOrderCode;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public ImportExtOrderReq setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public ImportExtOrderReq setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public ImportExtOrderReq setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public Long getGmtUpdate() {
        return gmtUpdate;
    }

    public ImportExtOrderReq setGmtUpdate(Long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
        return this;
    }

    public Byte getStatus() {
        return status;
    }

    public ImportExtOrderReq setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ImportExtOrderReq setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Byte getPayType() {
        return payType;
    }

    public ImportExtOrderReq setPayType(Byte payType) {
        this.payType = payType;
        return this;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public ImportExtOrderReq setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    public Long getPayTime() {
        return payTime;
    }

    public ImportExtOrderReq setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public ImportExtOrderReq setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
        return this;
    }

    public String getCustomerExtCode() {
        return customerExtCode;
    }

    public ImportExtOrderReq setCustomerExtCode(String customerExtCode) {
        this.customerExtCode = customerExtCode;
        return this;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public ImportExtOrderReq setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ImportExtOrderReq setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getSalesPhone() {
        return salesPhone;
    }

    public ImportExtOrderReq setSalesPhone(String salesPhone) {
        this.salesPhone = salesPhone;
        return this;
    }

    public String getSalesName() {
        return salesName;
    }

    public ImportExtOrderReq setSalesName(String salesName) {
        this.salesName = salesName;
        return this;
    }

    public String getStoreName() {
        return storeName;
    }

    public ImportExtOrderReq setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    public String getStoreExtCode() {
        return storeExtCode;
    }

    public ImportExtOrderReq setStoreExtCode(String storeExtCode) {
        this.storeExtCode = storeExtCode;
        return this;
    }

    public Byte getDeliveryType() {
        return deliveryType;
    }

    public ImportExtOrderReq setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public Long getDeliveryTime() {
        return deliveryTime;
    }

    public ImportExtOrderReq setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public ImportExtOrderReq setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
        return this;
    }

    public String getReceivePersonName() {
        return receivePersonName;
    }

    public ImportExtOrderReq setReceivePersonName(String receivePersonName) {
        this.receivePersonName = receivePersonName;
        return this;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public ImportExtOrderReq setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
        return this;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public ImportExtOrderReq setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
        return this;
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public ImportExtOrderReq setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince;
        return this;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public ImportExtOrderReq setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
        return this;
    }

    public String getReceiveDistrict() {
        return receiveDistrict;
    }

    public ImportExtOrderReq setReceiveDistrict(String receiveDistrict) {
        this.receiveDistrict = receiveDistrict;
        return this;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public ImportExtOrderReq setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public ImportExtOrderReq setExpressCode(String expressCode) {
        this.expressCode = expressCode;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public ImportExtOrderReq setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Byte getGrantCoupon() {
        return grantCoupon;
    }

    public ImportExtOrderReq setGrantCoupon(Byte grantCoupon) {
        this.grantCoupon = grantCoupon;
        return this;
    }

    public Byte getGrantPoint() {
        return grantPoint;
    }

    public ImportExtOrderReq setGrantPoint(Byte grantPoint) {
        this.grantPoint = grantPoint;
        return this;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public ImportExtOrderReq setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }

    public String getInsulateGroupName() {
        return insulateGroupName;
    }

    public ImportExtOrderReq setInsulateGroupName(String insulateGroupName) {
        this.insulateGroupName = insulateGroupName;
        return this;
    }

    public List<ImportExtOrderItemReq> getOrderItemList() {
        return orderItemList;
    }

    public ImportExtOrderReq setOrderItemList(List<ImportExtOrderItemReq> orderItemList) {
        this.orderItemList = orderItemList;
        return this;
    }
}
