package com.yiguo.qiakr.open.qdk4j.request.customer;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
public final class GetCustomerCouponFlowReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String actionTimeFrom;
    private String actionTimeTo;
    private String customerWeixinOpenId;
    private String customerPhone;
    private String customerExtNo;
    private Byte couponStatus;
    private Integer index;
    private Integer length;

    @Override
    public void checkReq() {
        if (this.index == null || this.length == null) {
            throw new QiakrApiException("index and length may not be null");
        }
    }
}
