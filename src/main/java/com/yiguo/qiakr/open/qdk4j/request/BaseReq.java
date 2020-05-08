package com.yiguo.qiakr.open.qdk4j.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 接口请求父类
 *
 * @author yhzdys
 */
public class BaseReq implements Serializable {
    private static final long serialVersionUID = 1L;

    public void checkReq() {
    }

    public String toJSONStr() {
        return JSON.toJSONString(this);
    }

    public String toJSONStr(SerializerFeature feature) {
        return JSON.toJSONString(this, feature);
    }
}
