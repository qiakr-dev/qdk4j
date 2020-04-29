package com.yiguo.qiakr.open.qdk4j.response.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetOrderResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private String orderCode;
    private Long salesId;
    private String salesName;
    private Long storeId;
    private String storeName;
    private String subject;
    private Byte buyWay;
    private Integer status;
    private String customerWeixinOpenId;
    private Long customerId;
    private String customerExtNo;
    private String customerName;
    private String receivePersonName;
    private String receiveMobile;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveDistrict;
    private Integer deliveryType;
    private Date deliveryTime;
    private String expressCompany;
    private String expressCode;
    private BigDecimal payment;
    private BigDecimal postFee;
    private BigDecimal discountFee;
    private BigDecimal totalFee;
    private Date gmtCreate;
    private Date gmtUpdate;
    private Date payTime;
    private Date pickUpTime;
    private Integer payType;
    private String couponName;
    private String couponCode;
    private BigDecimal couponValue;
    private Date couponTime;
    private String pickUpCode;
    private String qiakrCardNo;
    private String supplierCardNo;
    private String certifyPhone;
    private String storeExtCode;
    private String extOrderCode;
    private String remark;
    private String tradeNo;
    private BigDecimal discountValue;
    private String barCode;
    private String salesPhone;
    private Long pickupStoreId;
    private String pickupStoreName;
    private String pickupStoreExtCode;
    private Byte deliverySite;
    private Byte flashSale;
    private List<GetOrderItemResp> orderItemList;
    private List<String> remarkList;

    public Long getOrderId() {
        return orderId;
    }

    public GetOrderResp setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public GetOrderResp setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public Long getSalesId() {
        return salesId;
    }

    public GetOrderResp setSalesId(Long salesId) {
        this.salesId = salesId;
        return this;
    }

    public String getSalesName() {
        return salesName;
    }

    public GetOrderResp setSalesName(String salesName) {
        this.salesName = salesName;
        return this;
    }

    public Long getStoreId() {
        return storeId;
    }

    public GetOrderResp setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    public String getStoreName() {
        return storeName;
    }

    public GetOrderResp setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public GetOrderResp setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Byte getBuyWay() {
        return buyWay;
    }

    public GetOrderResp setBuyWay(Byte buyWay) {
        this.buyWay = buyWay;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetOrderResp setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getCustomerWeixinOpenId() {
        return customerWeixinOpenId;
    }

    public GetOrderResp setCustomerWeixinOpenId(String customerWeixinOpenId) {
        this.customerWeixinOpenId = customerWeixinOpenId;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public GetOrderResp setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerExtNo() {
        return customerExtNo;
    }

    public GetOrderResp setCustomerExtNo(String customerExtNo) {
        this.customerExtNo = customerExtNo;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public GetOrderResp setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getReceivePersonName() {
        return receivePersonName;
    }

    public GetOrderResp setReceivePersonName(String receivePersonName) {
        this.receivePersonName = receivePersonName;
        return this;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public GetOrderResp setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
        return this;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public GetOrderResp setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
        return this;
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public GetOrderResp setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince;
        return this;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public GetOrderResp setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
        return this;
    }

    public String getReceiveDistrict() {
        return receiveDistrict;
    }

    public GetOrderResp setReceiveDistrict(String receiveDistrict) {
        this.receiveDistrict = receiveDistrict;
        return this;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public GetOrderResp setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public GetOrderResp setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public GetOrderResp setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public GetOrderResp setExpressCode(String expressCode) {
        this.expressCode = expressCode;
        return this;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public GetOrderResp setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public GetOrderResp setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
        return this;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public GetOrderResp setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public GetOrderResp setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public GetOrderResp setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public GetOrderResp setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
        return this;
    }

    public Date getPayTime() {
        return payTime;
    }

    public GetOrderResp setPayTime(Date payTime) {
        this.payTime = payTime;
        return this;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public GetOrderResp setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public GetOrderResp setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public String getCouponName() {
        return couponName;
    }

    public GetOrderResp setCouponName(String couponName) {
        this.couponName = couponName;
        return this;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public GetOrderResp setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }

    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public GetOrderResp setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
        return this;
    }

    public Date getCouponTime() {
        return couponTime;
    }

    public GetOrderResp setCouponTime(Date couponTime) {
        this.couponTime = couponTime;
        return this;
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public GetOrderResp setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode;
        return this;
    }

    public String getQiakrCardNo() {
        return qiakrCardNo;
    }

    public GetOrderResp setQiakrCardNo(String qiakrCardNo) {
        this.qiakrCardNo = qiakrCardNo;
        return this;
    }

    public String getSupplierCardNo() {
        return supplierCardNo;
    }

    public GetOrderResp setSupplierCardNo(String supplierCardNo) {
        this.supplierCardNo = supplierCardNo;
        return this;
    }

    public String getCertifyPhone() {
        return certifyPhone;
    }

    public GetOrderResp setCertifyPhone(String certifyPhone) {
        this.certifyPhone = certifyPhone;
        return this;
    }

    public String getStoreExtCode() {
        return storeExtCode;
    }

    public GetOrderResp setStoreExtCode(String storeExtCode) {
        this.storeExtCode = storeExtCode;
        return this;
    }

    public String getExtOrderCode() {
        return extOrderCode;
    }

    public GetOrderResp setExtOrderCode(String extOrderCode) {
        this.extOrderCode = extOrderCode;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public GetOrderResp setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public GetOrderResp setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }

    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    public GetOrderResp setDiscountValue(BigDecimal discountValue) {
        this.discountValue = discountValue;
        return this;
    }

    public String getBarCode() {
        return barCode;
    }

    public GetOrderResp setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }

    public String getSalesPhone() {
        return salesPhone;
    }

    public GetOrderResp setSalesPhone(String salesPhone) {
        this.salesPhone = salesPhone;
        return this;
    }

    public Long getPickupStoreId() {
        return pickupStoreId;
    }

    public GetOrderResp setPickupStoreId(Long pickupStoreId) {
        this.pickupStoreId = pickupStoreId;
        return this;
    }

    public String getPickupStoreName() {
        return pickupStoreName;
    }

    public GetOrderResp setPickupStoreName(String pickupStoreName) {
        this.pickupStoreName = pickupStoreName;
        return this;
    }

    public String getPickupStoreExtCode() {
        return pickupStoreExtCode;
    }

    public GetOrderResp setPickupStoreExtCode(String pickupStoreExtCode) {
        this.pickupStoreExtCode = pickupStoreExtCode;
        return this;
    }

    public Byte getDeliverySite() {
        return deliverySite;
    }

    public GetOrderResp setDeliverySite(Byte deliverySite) {
        this.deliverySite = deliverySite;
        return this;
    }

    public Byte getFlashSale() {
        return flashSale;
    }

    public GetOrderResp setFlashSale(Byte flashSale) {
        this.flashSale = flashSale;
        return this;
    }

    public List<GetOrderItemResp> getOrderItemList() {
        return orderItemList;
    }

    public GetOrderResp setOrderItemList(List<GetOrderItemResp> orderItemList) {
        this.orderItemList = orderItemList;
        return this;
    }

    public List<String> getRemarkList() {
        return remarkList;
    }

    public GetOrderResp setRemarkList(List<String> remarkList) {
        this.remarkList = remarkList;
        return this;
    }
}
