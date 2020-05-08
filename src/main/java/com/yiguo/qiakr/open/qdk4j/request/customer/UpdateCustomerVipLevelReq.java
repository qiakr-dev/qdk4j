package com.yiguo.qiakr.open.qdk4j.request.customer;

import com.yiguo.qiakr.open.qdk4j.exception.QiakrApiException;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.util.QiakrStringUtil;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class UpdateCustomerVipLevelReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private String customerWeixinOpenId;
    private String customerPhone;
    private Integer vipLevel;
    private String remark;

    @Override
    public void checkReq() {
        if (QiakrStringUtil.isEmpty(this.customerWeixinOpenId)
                && QiakrStringUtil.isEmpty(this.customerPhone)) {
            throw new QiakrApiException("customerWeixinOpenId or customerPhone may not be null");
        }
        if (this.vipLevel == null) {
            throw new QiakrApiException("vipLevel may not be null");
        }
        if (this.vipLevel < 1 || this.vipLevel > 10) {
            throw new QiakrApiException("vipLevel must be between 0 and 10");
        }
    }

    public String getCustomerWeixinOpenId() {
        return customerWeixinOpenId;
    }

    public UpdateCustomerVipLevelReq setCustomerWeixinOpenId(String customerWeixinOpenId) {
        this.customerWeixinOpenId = customerWeixinOpenId;
        return this;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public UpdateCustomerVipLevelReq setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public UpdateCustomerVipLevelReq setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UpdateCustomerVipLevelReq setRemark(String remark) {
        this.remark = remark;
        return this;
    }
}
