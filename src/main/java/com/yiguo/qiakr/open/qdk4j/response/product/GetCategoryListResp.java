package com.yiguo.qiakr.open.qdk4j.response.product;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetCategoryListResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private List<GetCategoryResp> categoryList;

    public List<GetCategoryResp> getCategoryList() {
        return categoryList;
    }

    public GetCategoryListResp setCategoryList(List<GetCategoryResp> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
}
