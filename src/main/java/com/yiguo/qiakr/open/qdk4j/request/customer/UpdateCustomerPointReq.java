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
public final class UpdateCustomerPointReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private Long customerId;
    private String customerExtCode;
    private String customerPhone;
    private String platFormCode;
    private Integer referType;
    private Integer changePoint;
    private String externalFlowCode;
    private String changeReason;

    @Override
    public void checkReq() {
        if (this.customerId == null
                && QiakrStringUtil.isAllEmpty(this.customerExtCode, this.customerPhone)) {
            throw new QiakrApiException("customer data may not be null");
        }
        if (this.changePoint == null || this.changePoint == 0) {
            throw new QiakrApiException("changePoint may not be null");
        }
        if (QiakrStringUtil.isEmpty(externalFlowCode)) {
            throw new QiakrApiException("externalFlowCode may not be null");
        }
    }
}
