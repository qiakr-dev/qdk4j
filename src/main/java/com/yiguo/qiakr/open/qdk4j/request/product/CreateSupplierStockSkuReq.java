package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
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
public final class CreateSupplierStockSkuReq extends BaseResp {
    private static final long serialVersionUID = 1L;
    private String norms1Value;
    private String norms2Value;
    private String shapeCode;
    private String skuExternalSid;
    private Integer skuCount;
    private BigDecimal skuPrice;
}
