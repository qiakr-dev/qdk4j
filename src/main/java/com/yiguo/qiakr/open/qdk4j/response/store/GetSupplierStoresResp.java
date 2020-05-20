package com.yiguo.qiakr.open.qdk4j.response.store;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
@Getter
@Setter
public final class GetSupplierStoresResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private List<GetSupplierStoreResp> storeList;
}
