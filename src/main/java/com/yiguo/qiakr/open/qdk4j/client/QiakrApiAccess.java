package com.yiguo.qiakr.open.qdk4j.client;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yiguo.qiakr.open.qdk4j.request.BaseReq;
import com.yiguo.qiakr.open.qdk4j.request.customer.BatchUpdateCustomerPointReq;
import com.yiguo.qiakr.open.qdk4j.request.customer.BatchUpdateCustomerVipLevelReq;
import com.yiguo.qiakr.open.qdk4j.request.order.BatchImportExtOrderReq;
import com.yiguo.qiakr.open.qdk4j.request.order.GetOrderListReq;
import com.yiguo.qiakr.open.qdk4j.request.order.GetRefundOrderListReq;
import com.yiguo.qiakr.open.qdk4j.request.order.UpdateOrderToDeliveryStatusReq;
import com.yiguo.qiakr.open.qdk4j.request.product.BatchUpdateStoreStockReq;
import com.yiguo.qiakr.open.qdk4j.request.product.BatchUpdateSupplierStockReq;
import com.yiguo.qiakr.open.qdk4j.request.product.CreateSupplierStockReq;
import com.yiguo.qiakr.open.qdk4j.request.product.GetBrandListReq;
import com.yiguo.qiakr.open.qdk4j.request.product.GetCategoryListReq;
import com.yiguo.qiakr.open.qdk4j.response.BaseResp;
import com.yiguo.qiakr.open.qdk4j.response.auth.AccessTokenResp;
import com.yiguo.qiakr.open.qdk4j.response.customer.BatchUpdateCustomerPointResp;
import com.yiguo.qiakr.open.qdk4j.response.customer.BatchUpdateCustomerVipLevelResp;
import com.yiguo.qiakr.open.qdk4j.response.order.BatchImportExtOrderResp;
import com.yiguo.qiakr.open.qdk4j.response.order.GetOrderListResp;
import com.yiguo.qiakr.open.qdk4j.response.order.GetRefundOrderListResp;
import com.yiguo.qiakr.open.qdk4j.response.product.CreateSupplierStockResp;
import com.yiguo.qiakr.open.qdk4j.response.product.GetBrandListResp;
import com.yiguo.qiakr.open.qdk4j.response.product.GetCategoryListResp;
import com.yiguo.qiakr.open.qdk4j.response.store.GetSupplierStoresResp;
import lombok.Setter;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 * 洽客api访问
 *
 * @author yhzdys
 */
@Setter
public class QiakrApiAccess {
    private final SerializerFeature STR_FEATURE = SerializerFeature.WriteNonStringValueAsString;
    private QiakrApiClient client;

    public AccessTokenResp getAccessToken() {
        return this.client.getAccessToken();
    }

    /* 门店相关接口 */
    public GetSupplierStoresResp getSupplierStores(String accessToken) {
        return this.client.doRequest(
                "/store/getSupplierStores.json", accessToken, new BaseReq(), null, GetSupplierStoresResp.class
        );
    }

    /* 商品相关接口 */
    public GetBrandListResp getBrandList(GetBrandListReq req, String accessToken) {
        return this.client.doRequest(
                "/brand/getBrandList.json", accessToken, req, this.STR_FEATURE, GetBrandListResp.class
        );
    }

    public GetCategoryListResp getCategoryList(GetCategoryListReq req, String accessToken) {
        return this.client.doRequest(
                "/category/getCategoryList.json", accessToken, req, null, GetCategoryListResp.class
        );
    }

    public CreateSupplierStockResp createSupplierStock(CreateSupplierStockReq req, String accessToken) {
        return this.client.doRequest(
                "/stock/createSupplierStock.json", accessToken, req, this.STR_FEATURE, CreateSupplierStockResp.class
        );
    }

    public BaseResp batchUpdateSupplierStock(BatchUpdateSupplierStockReq req, String accessToken) {
        return this.client.doRequest(
                "/stock/batchUpdateSupplierStock.json", accessToken, req, null, BaseResp.class
        );
    }

    public BaseResp batchUpdateStoreStock(BatchUpdateStoreStockReq req, String accessToken) {
        return this.client.doRequest(
                "/stock/batchUpdateStoreStock.json", accessToken, req, null, BaseResp.class
        );
    }

    /* 会员相关接口 */
    public BatchUpdateCustomerPointResp batchUpdateCustomerPoint(BatchUpdateCustomerPointReq req, String accessToken) {
        return this.client.doRequest(
                "/customer/batchUpdateCustomerPoint.json", accessToken, req, null, BatchUpdateCustomerPointResp.class
        );
    }

    public BatchUpdateCustomerVipLevelResp batchUpdateCustomerVipLevel(BatchUpdateCustomerVipLevelReq req, String accessToken) {
        return this.client.doRequest(
                "/customer/batchUpdateCustomerVipLevel.json", accessToken, req, null, BatchUpdateCustomerVipLevelResp.class
        );
    }

    /* 订单相关接口 */
    public BatchImportExtOrderResp batchImportExtOrder(BatchImportExtOrderReq req, String accessToken) {
        return this.client.doRequest(
                "/order/batchImportExtOrder.json", accessToken, req, null, BatchImportExtOrderResp.class
        );
    }

    public GetOrderListResp getOrderList(GetOrderListReq req, String accessToken) {
        return this.client.doRequest(
                "/order/getOrderList.json", accessToken, req, null, GetOrderListResp.class
        );
    }

    public GetRefundOrderListResp getRefundOrderList(GetRefundOrderListReq req, String accessToken) {
        return this.client.doRequest(
                "/order/getRefundOrderList.json", accessToken, req, this.STR_FEATURE, GetRefundOrderListResp.class
        );
    }

    public BaseResp updateOrderToDeliveryStatus(UpdateOrderToDeliveryStatusReq req, String accessToken) {
        return this.client.doRequest(
                "/order/updateOrderToDeliveryStatus.json", accessToken, req, this.STR_FEATURE, BaseResp.class
        );
    }
}
