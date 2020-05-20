package com.yiguo.qiakr.open.qdk4j.response.coupon;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetCustomerCouponResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long customerCouponId;
    private Long couponPromotionId;
    private Long couponId;
    private Byte couponType;
    private String couponName;
    private String color;
    private BigDecimal couponValue;
    private BigDecimal orderLimitValue;
    private Byte limitType;
    private Byte ext;
    private String couponDescription;
    private Date beginTime;
    private Date expireTime;
    private Byte couponStatus;
    private Long orderId;
    private Long salesId;
    private String couponCode;
    private String thirdCouponCode;
    private Long customerId;
    private String customerWeixinOpenId;
    private String customerPhone;
    private String customerName;
}
