## 洽客开放平台开发套件 
## “QiakrAPI Development Kit (QDK)”

***
##### &emsp;简单配置，快速集成，完成洽客开放平台对接

***
### ReleaseNote
##### &emsp;1.2.0.RAELEASE:&emsp;
###### &emsp;&emsp;&emsp;1.支持github packages特性

##### &emsp;1.1.0.RAELEASE:&emsp;
###### &emsp;&emsp;&emsp;1.请求自动校错全覆盖
###### &emsp;&emsp;&emsp;1.优化接口请求逻辑，错误修复

##### &emsp;1.0.1.RAELEASE:&emsp;
###### &emsp;&emsp;&emsp;1.支持自定义接口请求
###### &emsp;&emsp;&emsp;2.新增特性-请求自动校错
###### &emsp;&emsp;&emsp;3.批量更新库存接口支持自动校错

##### &emsp;1.0.0.RAELEASE:
###### &emsp;&emsp;&emsp;1.QDK发布，集成大部分API

***
### QuickStart
##### &emsp;&emsp;JDK版本：Oracle JDK1.7 +

***
#### 修改Maven settings.xml
~~~xml
<servers>
    <server>
        <id>qdk4j</id>
        <username>qiakr-dev</username>
        <password>a5f7dc2735ca919f721c2d23c388de3cbab27bdf</password>
    </server>
</servers>
~~~
#### 修改pom.xml
~~~xml
<repositories>
    <repository>
        <id>qiakr-github</id>
        <url>https://maven.pkg.github.com/qiakr-dev/qdk4j</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.yiguo.qiakr</groupId>
        <artifactId>qdk4j</artifactId>
        <version>1.2.1.RELEASE</version>
    </dependency>
</dependencies>
~~~

***
#### Java原生配置
~~~java
// 初始化ApiClient
QiakrApiClient client = new QiakrApiClient();
client.setAppId("qka94ofnzca5nig588e4");
client.setAppSecret("274686640ecc45f2a6f2558ab9d41a64");
// 对接环境["dev1","dev2","qa1","qa2","prod"]，默认"prod"
client.setProfile("prod");
// 开启log输出(slf4j)，默认"false"
client.setCheckResp(true);
// 自动检查接口返回状态码，异常状态抛出QiakrApiException，默认"false"
client.setEnLog(true);

// 初始化ApiAccess
QiakrApiAccess qiakrApiAccess = new QiakrApiAccess();
qiakrApiAccess.setClient(client);
~~~

***
### Spring-XML配置
~~~xml
<bean id="qiakrApiClient" class="com.yiguo.qiakr.open.qdk4j.client.QiakrApiClient">
    <property name="appId" value="qka94ofnzca5nig588e4"/>
    <property name="appSecret" value="274686640ecc45f2a6f2558ab9d41a64"/>
    <!-- 对接环境["dev1","dev2","qa1","qa2","prod"]，默认"prod" -->
    <property name="profile" value="prod"/>
    <!-- 开启log输出(slf4j)，默认"false" -->
    <property name="enLog" value="true"/>
    <!-- 自动检查接口返回状态码，异常状态抛出QiakrApiException，默认"false" -->
    <property name="checkResp" value="true"/>
</bean>

<bean id="qiakrApiAccess" class="com.yiguo.qiakr.open.qdk4j.client.QiakrApiAccess">
    <property name="client" ref="qiakrApiClient"/>
</bean>
~~~

***
### Spring代码配置
~~~java
@Bean(name = "qiakrApiClient")
public QiakrApiClient qiakrApiClient() {
    QiakrApiClient client = new QiakrApiClient();
    client.setAppId("qka94ofnzca5nig588e4");
    client.setAppSecret("274686640ecc45f2a6f2558ab9d41a64");
    client.setProfile("prod");
    client.setCheckResp(true);
    client.setEnLog(true);
    return client;
}

@Bean(name = "qiakrApiAccess")
public QiakrApiAccess qiakrApiAccess(@Qualifier("qiakrApiClient") QiakrApiClient client) {
    QiakrApiAccess qiakrApiAccess = new QiakrApiAccess();
    qiakrApiAccess.setClient(client);
    return qiakrApiAccess;
}
~~~

***
### Q&A 我将调用的API，QDK没有集成怎么办
&emsp;QiakrApiClient提供了公共的doRequest()函数，方便开发者自定义API请求，如下：
~~~java
public <T extends BaseReq, R extends BaseResp> R doRequest(String path,
                                                           String accessToken,
                                                           T req,
                                                           SerializerFeature feature,
                                                           Class<R> respClazz) {
  ......
  ......
  ......
}
~~~
&emsp;1、“String path”: API地址补充，例：“/brand/getBrandList.json”；

&emsp;2、“T req” & “Class<R> respClazz”: 开发者可自定义接口请求对象（T extends BaseReq）与返回对象（R extends BaseResp），也可继承QiakrApiAccess进行二次接口封装；

&emsp;3、"SerializerFeature feature": alibaba-fastjson内部的序列化feature，为可选参数，一般为null即可；

***
### 快速使用
~~~java
// 获取accessToken
AccessTokenResp tokenResp = qiakrApiAccess.getAccessToken();
System.out.println(tokenResp.toJSONStr());
String accessToken = tokenResp.getAccessToken();

// 更新总库库存、价格
UpdateSupplierStockSkuReq req11 = new UpdateSupplierStockSkuReq()
        .setSkuCode("条码号")
        .setSkuCount(233)
        .setSkuPrice(new BigDecimal("213"));
BatchUpdateSupplierStockReq req1 = new BatchUpdateSupplierStockReq()
  			.setStockSkuList(Collections.singletonList(req11));
BaseResp resp1 = qiakrApiAccess.batchUpdateSupplierStock(req1, accessToken);
System.out.println(resp1.toJSONStr());

// 新建总库商品
CreateSupplierStockSkuReq req22 = new CreateSupplierStockSkuReq()
        .setNorms1Value("黑色")
        .setNorms2Value("42")
        .setShapeCode("条码号")
        .setSkuExternalSid("外部条码号")
        .setSkuCount(0)
        .setSkuPrice(new BigDecimal("128.00"));
CreateSupplierStockReq req2 = new CreateSupplierStockReq()
        .setProductName("测试2")
        .setSubHead("123")
        .setProductCode("款号")
        .setCategorySecondaryId(37L)
        .setBrandId(2L)
        .setTagPrice(new BigDecimal("231"))
        .setStockSkuList(Collections.singletonList(req22))
        .setNorms1Id(1L)
        .setNorms1Id(2L)
        .setLimitCount(0)
        .setBrandId(2L)
        .setCouponDisable((byte) 0)
        .setLimitDelivery((byte) 0)
        .setCommissionType((byte) 1);
CreateSupplierStockResp resp2 = qiakrApiAccess.createSupplierStock(req2, accessToken);
System.out.println(resp2.toJSONStr());

// 查询品牌列表
GetBrandListReq req3 = new GetBrandListReq()
        .setFuzzyKeyword("阿迪")
        .setIndex(0)
        .setLength(10);
GetBrandListResp resp3 = qiakrApiAccess.getBrandList(req3, accessToken);
System.out.println(resp3.toJSONStr());

// 查询品类列表
GetCategoryListReq req4 = new GetCategoryListReq()
        .setFuzzyKeyword("鞋");
GetCategoryListResp resp4 = qiakrApiAccess.getCategoryList(req4, accessToken);
System.out.println(resp4.toJSONStr());

// 获取门店列表
GetSupplierStoresResp resp5 = qiakrApiAccess.getSupplierStores(accessToken);
System.out.println(resp5.toJSONStr());

// 批量更新会员积分
UpdateCustomerPointReq req66 = new UpdateCustomerPointReq()
        .setCustomerPhone("135****9801")
        .setPoint(123)
        .setRemark("QDK测试");
BatchUpdateCustomerPointReq req6 = new BatchUpdateCustomerPointReq()
        .setCustomerPointList(Collections.singletonList(req66));
BatchUpdateCustomerPointResp resp6 = qiakrApiAccess.batchUpdateCustomerPoint(req6, accessToken);
System.out.println(resp6.toJSONStr());

// 批量更新会员等级
UpdateCustomerVipLevelReq req77 = new UpdateCustomerVipLevelReq()
        .setCustomerPhone("135****9801")
        .setVipLevel(3)
        .setRemark("QDK测试");
BatchUpdateCustomerVipLevelReq req7 = new BatchUpdateCustomerVipLevelReq()
        .setCustomerVipLevelList(Collections.singletonList(req77));
BatchUpdateCustomerVipLevelResp resp7 = qiakrApiAccess.batchUpdateCustomerVipLevel(req7, accessToken);
System.out.println(resp7.toJSONStr());

// 获取订单列表
Date to = new Date();
Date from = QiakrTimeUtil.addDay(to, -2);
GetOrderListReq req8 = new GetOrderListReq()
        .setUpdateTimeFrom(QiakrTimeUtil.fsDate(from, QiakrTimeUtil.DATE_TIME))
        .setUpdateTimeTo(QiakrTimeUtil.fsDate(to, QiakrTimeUtil.DATE_TIME))
        .setIndex(0)
        .setLength(10);
GetOrderListResp resp8 = qiakrApiAccess.getOrderList(req8, accessToken);
System.out.println(resp8.toJSONStr());

// 更新订单物流信息
UpdateOrderToDeliveryStatusReq req9 = new UpdateOrderToDeliveryStatusReq()
        .setOrderCode("2020042****517666885")
        .setExpressCompany("申通快递")
        .setExpressCode("1234567890");
BaseResp resp9 = qiakrApiAccess.updateOrderToDeliveryStatus(req9, accessToken);
System.out.println(resp9.toJSONStr());

// 获取售后单列表
Date to10 = new Date();
Date from10 = QiakrTimeUtil.addDay(to10, -10);
GetRefundOrderListReq req10 = new GetRefundOrderListReq()
        .setStatus(88)
        .setGmtUpdateFrom(QiakrTimeUtil.fsDate(from10, QiakrTimeUtil.DATE_TIME))
        .setGmtUpdateTo(QiakrTimeUtil.fsDate(to10, QiakrTimeUtil.DATE_TIME))
        .setIndex(0)
        .setLength(10);
GetRefundOrderListResp resp10 = qiakrApiAccess.getRefundOrderList(req10, accessToken);
System.out.println(resp10.toJSONStr());
~~~