package com.yiguo.qiakr.open.qdk4j.response.order;

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
public final class GetRefundOrderResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long storeId;
    private Long customerId;
    private BigDecimal value;
    private BigDecimal refundPostFee;
    private Integer refundCount;
    private Byte refundMode;
    private Byte applyMode;
    private Date gmtCreate;
    private Byte status;
    private String expressCompany;
    private String expressCode;
    private String expressNo;
    private String reason;
    private String mobile;
    private BigDecimal payment;
    private String shapeCode;
    private String skuExternalSid;
    private Long productId;
    private String productCode;
    private Long shoppingCount;
    private Long skuId;
    private BigDecimal skuPrice;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private Long orderId;
    private String orderCode;
    private Date gmtUpdate;
    private Long orderItemId;
    private Byte refundType;
    private Byte deliveryType;
    private String cashFlow;
}
