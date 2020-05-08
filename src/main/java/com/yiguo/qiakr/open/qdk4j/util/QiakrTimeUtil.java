package com.yiguo.qiakr.open.qdk4j.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 时间操作工具类
 *
 * @author yhzdys
 */
public final class QiakrTimeUtil {
    public static final SimpleDateFormat DATE_TIME = new SimpleDateFormat("yyyyMMddHHmmss");
    public static final SimpleDateFormat DATE = new SimpleDateFormat("yyyyMMdd");

    public static String fsDate(Date date, SimpleDateFormat format) {
        if (date == null) {
            return "";
        }
        return format.format(date);
    }

    public static Date addDay(Date date, int day) {
        return new Date(date.getTime() + (day * 24 * 60 * 60 * 1000L));
    }

    public static Date addHour(Date date, int hour) {
        return new Date(date.getTime() + (hour * 60 * 60 * 1000L));
    }

    public static Date addMinute(Date date, int minute) {
        return new Date(date.getTime() + (minute * 60 * 1000L));
    }

    public static Date addSecond(Date date, int second) {
        return new Date(date.getTime() + (second * 1000L));
    }
}
