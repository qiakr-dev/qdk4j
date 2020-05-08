package com.yiguo.qiakr.open.qdk4j.request.product;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrCollectionUtil;

import java.util.List;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchUpdateStoreStockReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private List<UpdateStoreStockSkuReq> stockSkuList;

    @Override
    public void checkReq() {
        if (QiakrCollectionUtil.isEmpty(this.stockSkuList)) {
            throw new QiakrApiException("stockSkuList may not be null");
        }
        if (this.stockSkuList.size() > 200) {
            throw new QiakrApiException("stockSkuList size must be less than 200");
        }
        for (UpdateStoreStockSkuReq updateStoreStockSkuReq : this.stockSkuList) {
            updateStoreStockSkuReq.checkReq();
        }
    }

    public List<UpdateStoreStockSkuReq> getStockSkuList() {
        return stockSkuList;
    }

    public BatchUpdateStoreStockReq setStockSkuList(List<UpdateStoreStockSkuReq> stockSkuList) {
        this.stockSkuList = stockSkuList;
        return this;
    }
}
