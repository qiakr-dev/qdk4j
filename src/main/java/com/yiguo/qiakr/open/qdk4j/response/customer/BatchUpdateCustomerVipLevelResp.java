package com.yiguo.qiakr.open.qdk4j.response.customer;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class BatchUpdateCustomerVipLevelResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private Integer successCount;
}
