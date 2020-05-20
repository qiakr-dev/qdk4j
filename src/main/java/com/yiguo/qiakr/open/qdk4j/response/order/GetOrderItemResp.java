package com.yiguo.qiakr.open.qdk4j.response.order;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetOrderItemResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderItemId;
    private Long skuId;
    private String shapeCode;
    private Long shoppingCount;
    private Long productId;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private BigDecimal payment;
    private BigDecimal discountFee;
    private BigDecimal totalFee;
    private String skuExternalSid;
    private Long categorySecondaryId;
    private Long brandId;
    private String categoryName;
    private String productCode;
    private String brandName;
    private Integer outOfStock;
    private BigDecimal skuPrice;
    private BigDecimal refundValue;
    private Byte refundStatus;
    private Long presaleStockId;
}
