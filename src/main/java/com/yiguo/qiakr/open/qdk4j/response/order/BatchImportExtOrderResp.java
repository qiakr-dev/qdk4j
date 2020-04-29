package com.yiguo.qiakr.open.qdk4j.response.order;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchImportExtOrderResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Integer successCount;
    private List<String> retryList;

    public Integer getSuccessCount() {
        return successCount;
    }

    public BatchImportExtOrderResp setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    public List<String> getRetryList() {
        return retryList;
    }

    public BatchImportExtOrderResp setRetryList(List<String> retryList) {
        this.retryList = retryList;
        return this;
    }
}
