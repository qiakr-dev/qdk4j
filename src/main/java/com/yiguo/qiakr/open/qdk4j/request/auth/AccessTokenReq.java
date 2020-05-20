package com.yiguo.qiakr.open.qdk4j.request.auth;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public final class AccessTokenReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String appId;
    private String appSecret;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isAnyEmpty(this.appId, this.appSecret)) {
            throw new QiakrApiException("appId and appSecret may not be null");
        }
    }
}
