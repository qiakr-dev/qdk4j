package com.yiguo.qiakr.open.qdk4j.response.order;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetOrderListResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private List<GetOrderResp> orderList;
    private Long countAll;
    private Byte pickupStockType;
    private Byte deliveryStockType;

    public Long getCountAll() {
        return countAll;
    }

    public GetOrderListResp setCountAll(Long countAll) {
        this.countAll = countAll;
        return this;
    }

    public List<GetOrderResp> getOrderList() {
        return orderList;
    }

    public GetOrderListResp setOrderList(List<GetOrderResp> orderList) {
        this.orderList = orderList;
        return this;
    }

    public Byte getPickupStockType() {
        return pickupStockType;
    }

    public GetOrderListResp setPickupStockType(Byte pickupStockType) {
        this.pickupStockType = pickupStockType;
        return this;
    }

    public Byte getDeliveryStockType() {
        return deliveryStockType;
    }

    public GetOrderListResp setDeliveryStockType(Byte deliveryStockType) {
        this.deliveryStockType = deliveryStockType;
        return this;
    }
}
