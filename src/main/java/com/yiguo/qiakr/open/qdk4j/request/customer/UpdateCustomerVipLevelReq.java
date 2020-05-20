package com.yiguo.qiakr.open.qdk4j.request.customer;

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
public final class UpdateCustomerVipLevelReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String customerWeixinOpenId;
    private String customerPhone;
    private Integer vipLevel;
    private String remark;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isAllEmpty(this.customerWeixinOpenId, this.customerPhone)) {
            throw new QiakrApiException("customerWeixinOpenId or customerPhone may not be null");
        }
        if (this.vipLevel == null) {
            throw new QiakrApiException("vipLevel may not be null");
        }
        if (this.vipLevel < 1 || this.vipLevel > 10) {
            throw new QiakrApiException("vipLevel must be between 0 and 10");
        }
    }
}
