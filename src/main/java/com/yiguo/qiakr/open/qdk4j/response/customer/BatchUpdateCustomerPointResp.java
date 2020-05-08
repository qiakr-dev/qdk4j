package com.yiguo.qiakr.open.qdk4j.response.customer;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchUpdateCustomerPointResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private String errmsg;

    public String getErrmsg() {
        return errmsg;
    }

    public BatchUpdateCustomerPointResp setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
}
