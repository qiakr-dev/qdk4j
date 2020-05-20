package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
public final class ImportExtOrderItemReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String productName;
    private String norms1Name;
    private String norms2Name;
    private String norms1Value;
    private String norms2Value;
    private Long brandId;
    private String brandName;
    private String extSkuCode;
    private BigDecimal payment;
    private BigDecimal discountFee;
    private BigDecimal totalPrice;
    private BigDecimal skuPrice;
    private BigDecimal refundValue;
    private Long category_id;
    private Long category_family_id;
    private Long shoppingCount;
}
