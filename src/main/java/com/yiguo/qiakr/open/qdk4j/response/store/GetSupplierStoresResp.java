package com.yiguo.qiakr.open.qdk4j.response.store;

import com.yiguo.qiakr.open.qdk4j.response.BaseResp;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetSupplierStoresResp extends BaseResp {
    private static final long serialVersionUID = 1L;
    private List<GetSupplierStoreResp> storeList;

    public List<GetSupplierStoreResp> getStoreList() {
        return storeList;
    }

    public GetSupplierStoresResp setStoreList(List<GetSupplierStoreResp> storeList) {
        this.storeList = storeList;
        return this;
    }
}
