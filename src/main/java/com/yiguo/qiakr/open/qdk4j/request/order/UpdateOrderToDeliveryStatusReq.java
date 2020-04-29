package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class UpdateOrderToDeliveryStatusReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private String orderCode;
    private String expressCompany;
    private String expressCode;
    private List<Long> orderItemIdList;

    @Override
    public void checkReq() {
        if (this.orderId == null
                && QiakrStringUtil.isEmpty(this.orderCode)) {
            throw new QiakrApiException("orderId or orderCode may not be null");
        }
        if (QiakrStringUtil.isEmpty(this.expressCompany)
                || QiakrStringUtil.isEmpty(this.expressCode)) {
            throw new QiakrApiException("expressCompany and expressCode may not be null");
        }
    }

    public Long getOrderId() {
        return orderId;
    }

    public UpdateOrderToDeliveryStatusReq setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public UpdateOrderToDeliveryStatusReq setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public UpdateOrderToDeliveryStatusReq setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public UpdateOrderToDeliveryStatusReq setExpressCode(String expressCode) {
        this.expressCode = expressCode;
        return this;
    }

    public List<Long> getOrderItemIdList() {
        return orderItemIdList;
    }

    public UpdateOrderToDeliveryStatusReq setOrderItemIdList(List<Long> orderItemIdList) {
        this.orderItemIdList = orderItemIdList;
        return this;
    }
}
