package com.yiguo.qiakr.open.qdk4j.response.product;

import java.io.Serializable;
import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetCategoryResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoryFamilyId;
    private Long familyPriority;
    private String categoryFamilyName;
    private List<GetCategorySecondaryResp> categorySecondaryList;

    public Long getCategoryFamilyId() {
        return categoryFamilyId;
    }

    public GetCategoryResp setCategoryFamilyId(Long categoryFamilyId) {
        this.categoryFamilyId = categoryFamilyId;
        return this;
    }

    public Long getFamilyPriority() {
        return familyPriority;
    }

    public GetCategoryResp setFamilyPriority(Long familyPriority) {
        this.familyPriority = familyPriority;
        return this;
    }

    public String getCategoryFamilyName() {
        return categoryFamilyName;
    }

    public GetCategoryResp setCategoryFamilyName(String categoryFamilyName) {
        this.categoryFamilyName = categoryFamilyName;
        return this;
    }

    public List<GetCategorySecondaryResp> getCategorySecondaryList() {
        return categorySecondaryList;
    }

    public GetCategoryResp setCategorySecondaryList(List<GetCategorySecondaryResp> categorySecondaryList) {
        this.categorySecondaryList = categorySecondaryList;
        return this;
    }
}
