package com.yiguo.qiakr.open.qdk4j.exception;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 * QDK异常类
 *
 * @author yhzdys
 */
public final class QiakrApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QiakrApiException(String message) {
        super(message);
    }

    public QiakrApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
