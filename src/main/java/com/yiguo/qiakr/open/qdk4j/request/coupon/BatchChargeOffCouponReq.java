package com.yiguo.qiakr.open.qdk4j.request.coupon;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrCollectionUtil;
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
public final class BatchChargeOffCouponReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private List<ChargeOffCouponReq> couponList;

    @Override
    public void checkReq() {
        if (QiakrCollectionUtil.isEmpty(couponList)) {
            throw new QiakrApiException("couponList may not be null");
        }
        for (ChargeOffCouponReq req : this.couponList) {
            req.checkReq();
        }
    }
}
