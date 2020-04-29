package com.yiguo.qiakr.open.qdk4j.client;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.nio.charset.StandardCharsets;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 洽客http请求客户端
 *
 * @author yhzdys
 */
public final class QiakrHttpClient {

    static <R> R doPost(String url, String body, ResponseHandler<R> respHandler) {
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
            httpPost.setConfig(REQ_CONF);
            httpPost.setEntity(new StringEntity(body, StandardCharsets.UTF_8));
            return httpClient.execute(httpPost, respHandler);
        } catch (Exception e) {
            throw new QiakrApiException(e.getMessage(), e.getCause());
        } finally {
            closeHttpClient(httpClient);
        }
    }

    private static void closeHttpClient(CloseableHttpClient httpClient) {
        if (httpClient == null) {
            return;
        }
        try {
            httpClient.close();
        } catch (Exception e) {
            throw new QiakrApiException(e.getMessage(), e.getCause());
        }
    }

    // 请求超时时间配置
    private static final RequestConfig REQ_CONF = RequestConfig.custom()
            .setConnectTimeout(4 * 1000)
            .setSocketTimeout(16 * 1000)
            .build();
}
