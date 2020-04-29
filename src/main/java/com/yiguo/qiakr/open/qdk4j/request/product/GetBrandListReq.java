package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetBrandListReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String fuzzyKeyword;
    private Integer index;
    private Integer length;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.fuzzyKeyword)) {
            throw new QiakrApiException("fuzzyKeyword may not be null");
        }
        if (this.index == null || this.length == null) {
            throw new QiakrApiException("index and length may not be null");
        }
    }

    public String getFuzzyKeyword() {
        return fuzzyKeyword;
    }

    public GetBrandListReq setFuzzyKeyword(String fuzzyKeyword) {
        this.fuzzyKeyword = fuzzyKeyword;
        return this;
    }

    public Integer getIndex() {
        return index;
    }

    public GetBrandListReq setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GetBrandListReq setLength(Integer length) {
        this.length = length;
        return this;
    }
}
