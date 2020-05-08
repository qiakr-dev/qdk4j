package com.yiguo.qiakr.open.qdk4j.response.order;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetRefundOrderListResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Long countAll;
    private List<GetRefundOrderResp> refundOrderList;

    public Long getCountAll() {
        return countAll;
    }

    public GetRefundOrderListResp setCountAll(Long countAll) {
        this.countAll = countAll;
        return this;
    }

    public List<GetRefundOrderResp> getRefundOrderList() {
        return refundOrderList;
    }

    public GetRefundOrderListResp setRefundOrderList(List<GetRefundOrderResp> refundOrderList) {
        this.refundOrderList = refundOrderList;
        return this;
    }
}
