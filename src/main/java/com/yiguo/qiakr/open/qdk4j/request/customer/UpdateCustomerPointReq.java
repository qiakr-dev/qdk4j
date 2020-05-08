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
public final class UpdateCustomerPointReq extends BaseReq {
    private static final long serialVersionUID = 1L;
    private Long qid;
    private String customerWeixinOpenId;
    private String customerPhone;
    private Integer point;
    private String referCode;
    private Integer actionType;
    private String remark;
    private Integer lessZero;

    @Override
    public void checkReq() {
        if (this.qid == null
                && QiakrStringUtil.isEmpty(this.customerWeixinOpenId)
                && QiakrStringUtil.isEmpty(this.customerPhone)) {
            throw new QiakrApiException("qid or customerWeixinOpenId or customerPhone may not be null");
        }
        if (this.point == null || this.point == 0) {
            throw new QiakrApiException("point may not be null or zero");
        }
    }

    public Long getQid() {
        return qid;
    }

    public UpdateCustomerPointReq setQid(Long qid) {
        this.qid = qid;
        return this;
    }

    public String getCustomerWeixinOpenId() {
        return customerWeixinOpenId;
    }

    public UpdateCustomerPointReq setCustomerWeixinOpenId(String customerWeixinOpenId) {
        this.customerWeixinOpenId = customerWeixinOpenId;
        return this;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public UpdateCustomerPointReq setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public Integer getPoint() {
        return point;
    }

    public UpdateCustomerPointReq setPoint(Integer point) {
        this.point = point;
        return this;
    }

    public String getReferCode() {
        return referCode;
    }

    public UpdateCustomerPointReq setReferCode(String referCode) {
        this.referCode = referCode;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public UpdateCustomerPointReq setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UpdateCustomerPointReq setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Integer getLessZero() {
        return lessZero;
    }

    public UpdateCustomerPointReq setLessZero(Integer lessZero) {
        this.lessZero = lessZero;
        return this;
    }
}
