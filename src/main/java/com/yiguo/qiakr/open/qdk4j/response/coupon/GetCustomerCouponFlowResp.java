package com.yiguo.qiakr.open.qdk4j.response.coupon;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetCustomerCouponFlowResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Long countAll;
    private List<GetCustomerCouponResp> result;
}
