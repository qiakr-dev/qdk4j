package com.yiguo.qiakr.open.qdk4j.request.customer;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrCollectionUtil;

import java.util.List;

/**
 * www.qiakr.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class BatchUpdateCustomerPointReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private List<UpdateCustomerPointReq> customerPointList;

    @Override
    public void checkReq() {
        if (QiakrCollectionUtil.isEmpty(this.customerPointList)) {
            throw new QiakrApiException("customerPointList may not be null");
        }
        for (UpdateCustomerPointReq customerPointReq : this.customerPointList) {
            customerPointReq.checkReq();
        }
    }

    public List<UpdateCustomerPointReq> getCustomerPointList() {
        return customerPointList;
    }

    public BatchUpdateCustomerPointReq setCustomerPointList(List<UpdateCustomerPointReq> customerPointList) {
        this.customerPointList = customerPointList;
        return this;
    }
}
