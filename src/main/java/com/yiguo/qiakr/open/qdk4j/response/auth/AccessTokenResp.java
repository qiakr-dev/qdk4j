package com.yiguo.qiakr.open.qdk4j.response.auth;

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
public final class AccessTokenResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private String accessToken;
}
