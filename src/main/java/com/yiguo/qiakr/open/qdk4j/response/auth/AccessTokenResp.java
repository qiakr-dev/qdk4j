package com.yiguo.qiakr.open.qdk4j.response.auth;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class AccessTokenResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
