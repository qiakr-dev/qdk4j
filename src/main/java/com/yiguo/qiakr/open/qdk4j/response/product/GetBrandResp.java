package com.yiguo.qiakr.open.qdk4j.response.product;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetBrandResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long brandId;
    private String brandName;
}
