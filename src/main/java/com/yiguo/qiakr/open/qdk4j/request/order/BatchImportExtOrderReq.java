package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchImportExtOrderReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private List<ImportExtOrderReq> orderList;

    public List<ImportExtOrderReq> getOrderList() {
        return orderList;
    }

    public BatchImportExtOrderReq setOrderList(List<ImportExtOrderReq> orderList) {
        this.orderList = orderList;
        return this;
    }
}
