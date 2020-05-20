package com.yiguo.qiakr.open.qdk4j.request.product;

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
public final class CreateSupplierStockReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String productName;
    private String subHead;
    private String selfGroupName;
    private String productPicUrl;
    private String productCode;
    private Long categorySecondaryId;
    private String previewJson;
    private BigDecimal tagPrice;
    private List<CreateSupplierStockSkuReq> stockSkuList;
    private Long norms1Id;
    private Long norms2Id;
    private Long brandId;
    private Integer limitCount;
    private Byte limitDelivery;
    private Byte commissionType;
    private String commissionRate;
    private BigDecimal commissionValue;
    private Byte couponDisable;
}
