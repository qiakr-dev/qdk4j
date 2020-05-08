package com.yiguo.qiakr.open.qdk4j.response.product;

import java.io.Serializable;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetCategorySecondaryResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categorySecondaryId;
    private String categorySecondaryName;

    public Long getCategorySecondaryId() {
        return categorySecondaryId;
    }

    public GetCategorySecondaryResp setCategorySecondaryId(Long categorySecondaryId) {
        this.categorySecondaryId = categorySecondaryId;
        return this;
    }

    public String getCategorySecondaryName() {
        return categorySecondaryName;
    }

    public GetCategorySecondaryResp setCategorySecondaryName(String categorySecondaryName) {
        this.categorySecondaryName = categorySecondaryName;
        return this;
    }
}
