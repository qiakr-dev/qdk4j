package com.yiguo.qiakr.open.qdk4j.util;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class QiakrStringUtil {

    public static boolean isEmpty(String source) {
        return source == null || "".equals(source);
    }

    public static boolean isAnyEmpty(String... sources) {
        for (String source : sources) {
            if (isEmpty(source)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllEmpty(String... sources) {
        for (String source : sources) {
            if (!isEmpty(source)) {
                return false;
            }
        }
        return true;
    }
}
