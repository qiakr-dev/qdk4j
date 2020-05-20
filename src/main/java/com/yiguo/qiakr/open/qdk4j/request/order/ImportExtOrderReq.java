package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
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
public final class ImportExtOrderReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String subject;
    private String extOrderCode;
    private BigDecimal totalPrice;
    private BigDecimal discountFee;
    private Long gmtCreate;
    private Long gmtUpdate;
    private Byte status;
    private String remark;
    private Byte payType;
    private BigDecimal payment;
    private Long payTime;
    private String thirdTradeNo;
    private String customerExtCode;
    private String customerPhone;
    private String customerName;
    private String salesPhone;
    private String salesName;
    private String storeName;
    private String storeExtCode;
    private Byte deliveryType;
    private Long deliveryTime;
    private BigDecimal postFee;
    private String receivePersonName;
    private String receiveMobile;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveDistrict;
    private String expressCompany;
    private String expressCode;
    private Long supplierId;
    private Byte grantCoupon;
    private Byte grantPoint;
    private String platformCode;
    private String insulateGroupName;
    private List<ImportExtOrderItemReq> orderItemList;
}
