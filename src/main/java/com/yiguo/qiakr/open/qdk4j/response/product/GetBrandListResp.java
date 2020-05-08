package com.yiguo.qiakr.open.qdk4j.response.product;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetBrandListResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private List<GetBrandResp> brandList;

    public List<GetBrandResp> getBrandList() {
        return brandList;
    }

    public GetBrandListResp setBrandList(List<GetBrandResp> brandList) {
        this.brandList = brandList;
        return this;
    }
}
