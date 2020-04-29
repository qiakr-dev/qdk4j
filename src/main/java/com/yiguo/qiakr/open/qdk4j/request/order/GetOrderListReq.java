package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetOrderListReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String orderCode;
    private Long storeId;
    private String storeExtCode;
    private Integer deliveryType;
    private Integer deliverySite;
    private Integer status;
    private String payTimeFrom;
    private String payTimeTo;
    private String pickupTimeFrom;
    private String pickupTimeTo;
    private String updateTimeFrom;
    private String updateTimeTo;
    private Integer index;
    private Integer length;

    @Override
    public void checkReq() {
        if (this.index == null || this.length == null) {
            throw new QiakrApiException("index and length may not be null");
        }
    }

    public String getOrderCode() {
        return orderCode;
    }

    public GetOrderListReq setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public Long getStoreId() {
        return storeId;
    }

    public GetOrderListReq setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    public String getStoreExtCode() {
        return storeExtCode;
    }

    public GetOrderListReq setStoreExtCode(String storeExtCode) {
        this.storeExtCode = storeExtCode;
        return this;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public GetOrderListReq setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public Integer getDeliverySite() {
        return deliverySite;
    }

    public GetOrderListReq setDeliverySite(Integer deliverySite) {
        this.deliverySite = deliverySite;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetOrderListReq setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getPayTimeFrom() {
        return payTimeFrom;
    }

    public GetOrderListReq setPayTimeFrom(String payTimeFrom) {
        this.payTimeFrom = payTimeFrom;
        return this;
    }

    public String getPayTimeTo() {
        return payTimeTo;
    }

    public GetOrderListReq setPayTimeTo(String payTimeTo) {
        this.payTimeTo = payTimeTo;
        return this;
    }

    public String getPickupTimeFrom() {
        return pickupTimeFrom;
    }

    public GetOrderListReq setPickupTimeFrom(String pickupTimeFrom) {
        this.pickupTimeFrom = pickupTimeFrom;
        return this;
    }

    public String getPickupTimeTo() {
        return pickupTimeTo;
    }

    public GetOrderListReq setPickupTimeTo(String pickupTimeTo) {
        this.pickupTimeTo = pickupTimeTo;
        return this;
    }

    public String getUpdateTimeFrom() {
        return updateTimeFrom;
    }

    public GetOrderListReq setUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
        return this;
    }

    public String getUpdateTimeTo() {
        return updateTimeTo;
    }

    public GetOrderListReq setUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
        return this;
    }

    public Integer getIndex() {
        return index;
    }

    public GetOrderListReq setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GetOrderListReq setLength(Integer length) {
        this.length = length;
        return this;
    }
}
