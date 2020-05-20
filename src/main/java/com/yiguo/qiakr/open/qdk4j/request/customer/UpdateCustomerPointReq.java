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
    private Long qid;
    private String customerWeixinOpenId;
    private String customerPhone;
    private Integer point;
    private String referCode;
    private Integer actionType;
    private String remark;
    private Integer lessZero;

    @Override
    public void checkReq() {
        if (this.qid == null && QiakrStringUtil.isAllEmpty(this.customerWeixinOpenId, this.customerPhone)) {
            throw new QiakrApiException("qid or customerWeixinOpenId or customerPhone may not be null");
        }
        if (this.point == null || this.point == 0) {
            throw new QiakrApiException("point may not be null or zero");
        }
    }
}
