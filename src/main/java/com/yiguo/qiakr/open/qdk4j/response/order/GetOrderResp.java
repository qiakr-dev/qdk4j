package com.yiguo.qiakr.open.qdk4j.response.order;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetOrderResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private String orderCode;
    private Long salesId;
    private String salesName;
    private Long storeId;
    private String storeName;
    private String subject;
    private Byte buyWay;
    private Integer status;
    private String customerWeixinOpenId;
    private Long customerId;
    private String customerExtNo;
    private String customerName;
    private String receivePersonName;
    private String receiveMobile;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveDistrict;
    private Integer deliveryType;
    private Date deliveryTime;
    private String expressCompany;
    private String expressCode;
    private BigDecimal payment;
    private BigDecimal postFee;
    private BigDecimal discountFee;
    private BigDecimal totalFee;
    private Date gmtCreate;
    private Date gmtUpdate;
    private Date payTime;
    private Date pickUpTime;
    private Integer payType;
    private String couponName;
    private String couponCode;
    private BigDecimal couponValue;
    private Date couponTime;
    private String pickUpCode;
    private String qiakrCardNo;
    private String supplierCardNo;
    private String certifyPhone;
    private String storeExtCode;
    private String extOrderCode;
    private String remark;
    private String tradeNo;
    private BigDecimal discountValue;
    private String barCode;
    private String salesPhone;
    private Long pickupStoreId;
    private String pickupStoreName;
    private String pickupStoreExtCode;
    private Byte deliverySite;
    private Byte flashSale;
    private List<GetOrderItemResp> orderItemList;
    private List<String> remarkList;
}
