package com.yiguo.qiakr.open.qdk4j.response.customer;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchUpdateCustomerVipLevelResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Integer successCount;

    public Integer getSuccessCount() {
        return successCount;
    }

    public BatchUpdateCustomerVipLevelResp setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
}
