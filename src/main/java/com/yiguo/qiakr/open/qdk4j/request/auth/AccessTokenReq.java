package com.yiguo.qiakr.open.qdk4j.request.auth;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class AccessTokenReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String appId;
    private String appSecret;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.appId) || QiakrStringUtil.isEmpty(this.appSecret)) {
            throw new QiakrApiException("appId and appSecret may not be null");
        }
    }

    public AccessTokenReq() {
    }

    public AccessTokenReq(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
}
