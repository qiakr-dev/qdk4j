package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetRefundOrderListReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private Long storeId;
    private Integer status;
    private String gmtCreateFrom;
    private String gmtCreateTo;
    private String gmtUpdateFrom;
    private String gmtUpdateTo;
    private Integer index;
    private Integer length;

    @Override
    public void checkReq() {
        if (this.index == null || this.length == null) {
            throw new QiakrApiException("index and length may not be null");
        }
    }

    public Long getStoreId() {
        return storeId;
    }

    public GetRefundOrderListReq setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetRefundOrderListReq setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getGmtCreateFrom() {
        return gmtCreateFrom;
    }

    public GetRefundOrderListReq setGmtCreateFrom(String gmtCreateFrom) {
        this.gmtCreateFrom = gmtCreateFrom;
        return this;
    }

    public String getGmtCreateTo() {
        return gmtCreateTo;
    }

    public GetRefundOrderListReq setGmtCreateTo(String gmtCreateTo) {
        this.gmtCreateTo = gmtCreateTo;
        return this;
    }

    public String getGmtUpdateFrom() {
        return gmtUpdateFrom;
    }

    public GetRefundOrderListReq setGmtUpdateFrom(String gmtUpdateFrom) {
        this.gmtUpdateFrom = gmtUpdateFrom;
        return this;
    }

    public String getGmtUpdateTo() {
        return gmtUpdateTo;
    }

    public GetRefundOrderListReq setGmtUpdateTo(String gmtUpdateTo) {
        this.gmtUpdateTo = gmtUpdateTo;
        return this;
    }

    public Integer getIndex() {
        return index;
    }

    public GetRefundOrderListReq setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GetRefundOrderListReq setLength(Integer length) {
        this.length = length;
        return this;
    }
}
