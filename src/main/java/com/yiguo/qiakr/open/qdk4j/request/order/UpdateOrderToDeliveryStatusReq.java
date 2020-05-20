package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
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
        if (QiakrStringUtil.isAnyEmpty(this.expressCompany, this.expressCode)) {
            throw new QiakrApiException("expressCompany and expressCode may not be null");
        }
    }
}
