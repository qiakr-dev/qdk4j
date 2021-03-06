package com.yiguo.qiakr.open.qdk4j.request.coupon;

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
public class ChargeOffBarCodeReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String barCode;
    private String extOrderCode;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.barCode)) {
            throw new QiakrApiException("barCode may not be null");
        }
    }
}
