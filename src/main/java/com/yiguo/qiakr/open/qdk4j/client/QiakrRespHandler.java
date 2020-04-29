package com.yiguo.qiakr.open.qdk4j.client;

import com.alibaba.fastjson.JSONObject;
import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 洽客api接口返回处理
 *
 * @author yhzdys
 */
public final class QiakrRespHandler {

    static <R extends BaseResp> ResponseHandler<R> newInst(final Class<R> clazz) {
        return new ResponseHandler<R>() {
            @Override
            public R handleResponse(HttpResponse resp) throws IOException {
                if (resp == null) {
                    throw new QiakrApiException("QiakrAPI resp is null");
                }
                int status = resp.getStatusLine().getStatusCode();
                if (status < 200 || status >= 300) {
                    throw new QiakrApiException("unexpected QiakrAPI resp status: " + status);
                }
                HttpEntity respEntity = resp.getEntity();
                String respData = EntityUtils.toString(respEntity, StandardCharsets.UTF_8);
                if (QiakrStringUtil.isEmpty(respData)) {
                    throw new QiakrApiException("QiakrAPI api resp is empty");
                }
                return JSONObject.parseObject(respData, clazz);
            }
        };
    }

}