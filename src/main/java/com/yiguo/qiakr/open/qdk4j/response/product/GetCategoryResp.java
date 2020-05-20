package com.yiguo.qiakr.open.qdk4j.response.product;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetCategoryResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoryFamilyId;
    private Long familyPriority;
    private String categoryFamilyName;
    private List<GetCategorySecondaryResp> categorySecondaryList;
}
