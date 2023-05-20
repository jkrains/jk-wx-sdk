# jk-wx-sdk
> 我们要开发SaaS相关的产品，要接入微信生态，我们去尝试寻找相关的能支持多租户的微信SDK, 开源社区的微信SDK到很多，但是在代码质量和功能上，没有一个能满足我们的需求的，尤其是支持动态的多租户的特性，另外大多数的sdk只是提供了命令式编程（同步）机制，我们的框架是响应试编程，所以我们基于proejctReactor 开发了微信相关的sdk, 包括微信公众平台， 微信小程序，微信开放平台，以及企业微信的SDK。



主要是对如下微信开发者的接口进行了封装：  微信公众平台、微信小程序、微信开放平台、企业微信。本sdk基于webflux开发，响应式编程，同时，所有接口均支持动态的多租户使用，适合SaaS产品，以及PaaS平台开发使用。本代码我们用户[云晶](https://www.yunjingxz.com)-新一代云上操作系统的的开发使用。



# 模块说明

| 模块名称          | 说明                         |
| ----------------- | ---------------------------- |
| jk-wx-sdk-commons | 本模块的所有模块的公共模块。 |
| jk-wx-sdk-miniapp | 微信小程序相关的api。        |
| jk-wx-sdk-mp      | 微信公众平台的api。          |
| jk-wx-sdk-qw      | 企业微信相关的api。          |
| jk-wx-sdk-webflux | 基于webflux实现的通信类      |



# 实例

## 企业微信

**1.创建一个DeventDispatcher**

```java
@Configuration
public class QwCallbackConfig {

  @Bean
  public SuiteEventDispatcher suiteEventDispatcher() {
    return new SuiteEventDispatcher();
  }

  @Bean
  public EventDispatcher eventDispatcher(SuiteEventDispatcher suiteEventDispatcher) {
    EventDispatcher dispatcher = new EventDispatcher(suiteEventDispatcher);
    return dispatcher;
  }

}

```



**2.创建HttpRequestClient**

```java
public class QwSdkHttpRequestClient extends HttpRequestClient {

  private final JsonConverter jsonConverter;

  public QwSdkHttpRequestClient(WebClient webClient, JsonConverter jsonConverter) {
    super(webClient);
    this.jsonConverter = jsonConverter;
  }

  @Override
  protected Throwable errorMessageToThrowable(String subPath, int httpStatusCode, String jsonBody) {
    Map<String, Object> map = jsonConverter.fromJson(jsonBody, Map.class);
    Integer errcode = (Integer) map.get("errcode");
    String errmsg = (String) map.get("errmsg");
    return new JkRuntimeException(errcode, errmsg);
  }
}
```



**3.创建一个HttpApiContext**

```java
@Configuration
public class QwSdkApiConfig {

  public static final String WX_API_BASE_URL = "https://qyapi.weixin.qq.com";

  private CacheWxAppContextManager wxAppContextManager;

  @Autowired
  public void setWxAppContextManager(CacheWxAppContextManager wxAppContextManager) {
    this.wxAppContextManager = wxAppContextManager;
  }

  /**
   *
   * 请求api转换路径
   * @param wxApiSdkJsonConverter
   * @return
   */
  @Bean
  @QwSdkApiContext
  public HttpApiContext qwHttpApiContext(JsonConverter wxApiSdkJsonConverter) {
    WebClient webClient = WebClient.builder()
        .baseUrl(WX_API_BASE_URL)
        .filter(new WxExchangeFilter(this.wxAppContextManager))
        .build();
    HttpRequestClient httpRequestClient = new QwSdkHttpRequestClient(webClient, wxApiSdkJsonConverter);
    return new HttpApiContext(httpRequestClient, wxApiSdkJsonConverter);
  }
}
```

4.使用qw下面的Requester来与微信平台通信，调用微信平台的sdk



## 微信公众号



```java
@Configuration
public class WxApiSdkConfig {

  public static final String WX_API_BASE_URL = "https://api.weixin.qq.com";

  private CacheWxAppContextManager wxAppContextManager;

  public WxApiSdkConfig() {
  }

  @Autowired
  public void setWxAppContextManager(CacheWxAppContextManager wxAppContextManager) {
    this.wxAppContextManager = wxAppContextManager;
  }

  @Bean
  @WxSdkApiContext
  public HttpApiContext wxHttpApiContext(JsonConverter wxApiSdkJsonConverter) {
    WebClient webClient = WebClient.builder()
        .baseUrl(WX_API_BASE_URL)
        .filter(new WxExchangeFilter(this.wxAppContextManager))
        .build();
    HttpRequestClient httpRequestClient = new WxSdkHttpRequestClient(webClient, wxApiSdkJsonConverter);
    HttpApiContext httpApiContext = new HttpApiContext(httpRequestClient, wxApiSdkJsonConverter);
    return httpApiContext;
  }


}

```





# 说明

sdk 本身是跟框架无关的，本sdk我们基于webflux的http通信封装了一个实现机制， 用户也可以基于其他平台来使用该sdk。





