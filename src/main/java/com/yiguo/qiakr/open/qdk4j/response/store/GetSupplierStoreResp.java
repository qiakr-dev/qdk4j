package com.yiguo.qiakr.open.qdk4j.response.store;

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
public final class GetSupplierStoreResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Byte storeType;
    private Byte open;
    private String extCode;
    private String logo;
    private String picture;
    private String province;
    private String city;
    private String district;
    private String address;
    private BigDecimal longitude;
    private BigDecimal latitude;
}
