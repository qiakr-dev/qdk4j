package com.yiguo.qiakr.open.qdk4j.response;

import com.alibaba.fastjson.JSON;
import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 接口返回父类
 *
 * @author yhzdys
 */
@Getter
@Setter
public class BaseResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;

    public String toJSONStr() {
        return JSON.toJSONString(this);
    }

    public void checkResp() {
        if (this.code == null) {
            throw new QiakrApiException("incorrect resp code: " + this.code + " msg: " + this.msg);
        }
        if (this.code == 0 || this.code == 1000) {
            return;
        }
        if (this.code == 1003) {
            throw new QiakrApiException("invalid accessToken");
        }
        throw new QiakrApiException("incorrect resp code: " + this.code + " msg: " + this.msg);
    }
}
