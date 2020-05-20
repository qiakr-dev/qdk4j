package com.yiguo.qiakr.open.qdk4j.request.order;

import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
@Accessors(chain = true)
public final class BatchImportExtOrderReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private List<ImportExtOrderReq> orderList;
}
