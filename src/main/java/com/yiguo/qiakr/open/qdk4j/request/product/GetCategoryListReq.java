package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
public final class GetCategoryListReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String fuzzyKeyword;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.fuzzyKeyword)) {
            throw new QiakrApiException("fuzzyKeyword may not be null");
        }
    }
}
