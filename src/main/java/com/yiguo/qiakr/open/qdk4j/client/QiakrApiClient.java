package com.yiguo.qiakr.open.qdk4j.client;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.request.auth.AccessTokenReq;
import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import com.yiguo.qiakr.open.qdk4j.response.auth.AccessTokenResp;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 洽客api客户端
 *
 * @author yhzdys
 */
public final class QiakrApiClient {
    private static final Logger logger = LoggerFactory.getLogger(QiakrApiClient.class);
    private String appId;
    private String appSecret;
    private String profile;
    private String api;
    private boolean enLog;
    private boolean checkResp;

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setProfile(String profile) {
        this.profile = profile;
        switch (profile) {
            case "prod":
                this.api = "http://api.qiakr.com/external";
                break;
            case "dev1":
                this.api = "http://apidev.ekeban.com/external";
                break;
            case "dev2":
                this.api = "http://apidev2.ekeban.com/external";
                break;
            case "qa1":
                this.api = "http://open.ekeban.com/external";
                break;
            case "qa2":
                this.api = "http://open2.ekeban.com/external";
                break;
            default:
                throw new QiakrApiException("unexpected profile: " + profile);
        }
    }

    public void setEnLog(boolean enLog) {
        this.enLog = enLog;
    }

    public void setCheckResp(boolean checkResp) {
        this.checkResp = checkResp;
    }

    AccessTokenResp getAccessToken() {
        AccessTokenReq req = new AccessTokenReq(this.appId, this.appSecret);
        req.checkReq();
        String reqUrl = this.api + "/thirdPlatform/getAccessToken.json";
        String reqBody = req.toJSONStr();
        if (this.enLog) {
            logger.info("QiakrAPI[{}]: {} reqData: {}", this.profile, reqUrl, reqBody);
        }
        AccessTokenResp resp = QiakrHttpClient.doPost(reqUrl, reqBody, QiakrRespHandler.newInst(AccessTokenResp.class));
        if (this.checkResp) {
            resp.checkResp();
        }
        return resp;
    }

    public <T extends BaseReq, R extends BaseResp> R doRequest(String path,
                                                               String accessToken,
                                                               T req,
                                                               SerializerFeature feature,
                                                               Class<R> respClazz) {
        if (req == null) {
            throw new QiakrApiException("reqData may not be null");
        }
        if (QiakrStringUtil.isEmpty(accessToken)) {
            throw new QiakrApiException("accessToken may not be null");
        }
        // 请求参数检查，前置拦截非法传参
        req.checkReq();
        String reqUrl = this.api + path + "?appId=" + this.appId + "&accessToken=" + accessToken;
        String reqBody = req.toJSONStr(feature);
        if (this.enLog) {
            logger.info("QiakrAPI[{}]: {} reqData: {}", this.profile, reqUrl, reqBody);
        }
        R resp = QiakrHttpClient.doPost(reqUrl, reqBody, QiakrRespHandler.newInst(respClazz));
        if (this.checkResp) {
            resp.checkResp();
        }
        return resp;
    }
}
