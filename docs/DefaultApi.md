# DefaultApi

All URIs are relative to *http://dev-api.fcprovin.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessToken**](DefaultApi.md#accessToken) | **POST** /api/v1/auth/access-token | POST api/v1/auth/access-token |
| [**attendCreate**](DefaultApi.md#attendCreate) | **POST** /api/v1/attend | POST api/v1/attend |
| [**attendRead**](DefaultApi.md#attendRead) | **GET** /api/v1/attend/{id} | GET api/v1/attend/{id} |
| [**attendReadAll**](DefaultApi.md#attendReadAll) | **GET** /api/v1/attend | GET api/v1/attend |
| [**attendUpdate**](DefaultApi.md#attendUpdate) | **PUT** /api/v1/attend/{id} | PUT api/v1/attend/{id} |
| [**matchCreate**](DefaultApi.md#matchCreate) | **POST** /api/v1/match | POST api/v1/match |
| [**matchRead**](DefaultApi.md#matchRead) | **GET** /api/v1/match/{id} | GET api/v1/match/{id} |
| [**matchReadAll**](DefaultApi.md#matchReadAll) | **GET** /api/v1/match | GET api/v1/match |
| [**matchUpdate**](DefaultApi.md#matchUpdate) | **PUT** /api/v1/match/{id} | PUT api/v1/match/{id} |
| [**memberCreate**](DefaultApi.md#memberCreate) | **POST** /api/v1/member | POST api/v1/member |
| [**memberRead**](DefaultApi.md#memberRead) | **GET** /api/v1/member/{id} | GET api/v1/member/{id} |
| [**memberReadAll**](DefaultApi.md#memberReadAll) | **GET** /api/v1/member | GET api/v1/member |
| [**playerCreate**](DefaultApi.md#playerCreate) | **POST** /api/v1/player | POST api/v1/player |
| [**playerRead**](DefaultApi.md#playerRead) | **GET** /api/v1/player/{id} | GET api/v1/player/{id} |
| [**playerReadAll**](DefaultApi.md#playerReadAll) | **GET** /api/v1/player | GET api/v1/player |
| [**playerUpdate**](DefaultApi.md#playerUpdate) | **PUT** /api/v1/player/{id} | PUT api/v1/player/{id} |
| [**refreshToken**](DefaultApi.md#refreshToken) | **POST** /api/v1/auth/refresh-token | POST api/v1/auth/refresh-token |
| [**regionReadAll**](DefaultApi.md#regionReadAll) | **GET** /api/v1/region | GET api/v1/region |
| [**regionReate**](DefaultApi.md#regionReate) | **POST** /api/v1/region | POST api/v1/region |
| [**snsCreate**](DefaultApi.md#snsCreate) | **POST** /api/v1/sns | POST api/v1/sns |
| [**snsRead**](DefaultApi.md#snsRead) | **GET** /api/v1/sns/{id} | GET api/v1/sns/{id} |
| [**snsReadAll**](DefaultApi.md#snsReadAll) | **GET** /api/v1/sns | GET api/v1/sns |
| [**stadiumCreate**](DefaultApi.md#stadiumCreate) | **POST** /api/v1/stadium | POST api/v1/stadium |
| [**stadiumRead**](DefaultApi.md#stadiumRead) | **GET** /api/v1/stadium/{id} | GET api/v1/stadium/{id} |
| [**stadiumReadAll**](DefaultApi.md#stadiumReadAll) | **GET** /api/v1/stadium | GET api/v1/stadium |
| [**teamCreate**](DefaultApi.md#teamCreate) | **POST** /api/v1/team | POST api/v1/team |
| [**teamRead**](DefaultApi.md#teamRead) | **GET** /api/v1/team/{id} | GET api/v1/team/{id} |
| [**teamReadAll**](DefaultApi.md#teamReadAll) | **GET** /api/v1/team | GET api/v1/team |
| [**teamUpdate**](DefaultApi.md#teamUpdate) | **PUT** /api/v1/team/{id} | PUT api/v1/team/{id} |
| [**teams**](DefaultApi.md#teams) | **GET** /api/v1/member/{id}/teams | GET api/v1/member/{id}/teams |
| [**voteCreate**](DefaultApi.md#voteCreate) | **POST** /api/v1/vote | POST api/v1/vote |
| [**voteRead**](DefaultApi.md#voteRead) | **GET** /api/v1/vote/{id} | GET api/v1/vote/{id} |
| [**voteReadAll**](DefaultApi.md#voteReadAll) | **GET** /api/v1/vote | GET api/v1/vote |
| [**voteUpdate**](DefaultApi.md#voteUpdate) | **PUT** /api/v1/vote/{id} | PUT api/v1/vote/{id} |


<a name="accessToken"></a>
# **accessToken**
> TokenResponse accessToken(tokenCreateRequest)

POST api/v1/auth/access-token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TokenCreateRequest tokenCreateRequest = new TokenCreateRequest(); // TokenCreateRequest | 
    try {
      TokenResponse result = apiInstance.accessToken(tokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#accessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tokenCreateRequest** | [**TokenCreateRequest**](TokenCreateRequest.md)|  | |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="attendCreate"></a>
# **attendCreate**
> AttendResponse attendCreate(attendCreateRequest)

POST api/v1/attend

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AttendCreateRequest attendCreateRequest = new AttendCreateRequest(); // AttendCreateRequest | 
    try {
      AttendResponse result = apiInstance.attendCreate(attendCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attendCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attendCreateRequest** | [**AttendCreateRequest**](AttendCreateRequest.md)|  | |

### Return type

[**AttendResponse**](AttendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="attendRead"></a>
# **attendRead**
> AttendResponse attendRead(id)

GET api/v1/attend/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      AttendResponse result = apiInstance.attendRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attendRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**AttendResponse**](AttendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="attendReadAll"></a>
# **attendReadAll**
> List&lt;AttendResponse&gt; attendReadAll()

GET api/v1/attend

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<AttendResponse> result = apiInstance.attendReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attendReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AttendResponse&gt;**](AttendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="attendUpdate"></a>
# **attendUpdate**
> AttendResponse attendUpdate(id, attendUpdateRequest)

PUT api/v1/attend/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    AttendUpdateRequest attendUpdateRequest = new AttendUpdateRequest(); // AttendUpdateRequest | 
    try {
      AttendResponse result = apiInstance.attendUpdate(id, attendUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attendUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **attendUpdateRequest** | [**AttendUpdateRequest**](AttendUpdateRequest.md)|  | |

### Return type

[**AttendResponse**](AttendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="matchCreate"></a>
# **matchCreate**
> MatchResponse matchCreate(matchCreateRequest)

POST api/v1/match

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MatchCreateRequest matchCreateRequest = new MatchCreateRequest(); // MatchCreateRequest | 
    try {
      MatchResponse result = apiInstance.matchCreate(matchCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#matchCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchCreateRequest** | [**MatchCreateRequest**](MatchCreateRequest.md)|  | |

### Return type

[**MatchResponse**](MatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="matchRead"></a>
# **matchRead**
> MatchResponse matchRead(id)

GET api/v1/match/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      MatchResponse result = apiInstance.matchRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#matchRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**MatchResponse**](MatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="matchReadAll"></a>
# **matchReadAll**
> List&lt;MatchResponse&gt; matchReadAll()

GET api/v1/match

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<MatchResponse> result = apiInstance.matchReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#matchReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MatchResponse&gt;**](MatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="matchUpdate"></a>
# **matchUpdate**
> MatchResponse matchUpdate(id, matchUpdateRequest)

PUT api/v1/match/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    MatchUpdateRequest matchUpdateRequest = new MatchUpdateRequest(); // MatchUpdateRequest | 
    try {
      MatchResponse result = apiInstance.matchUpdate(id, matchUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#matchUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **matchUpdateRequest** | [**MatchUpdateRequest**](MatchUpdateRequest.md)|  | |

### Return type

[**MatchResponse**](MatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="memberCreate"></a>
# **memberCreate**
> MemberResponse memberCreate(memberCreateRequest)

POST api/v1/member

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    MemberCreateRequest memberCreateRequest = new MemberCreateRequest(); // MemberCreateRequest | 
    try {
      MemberResponse result = apiInstance.memberCreate(memberCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#memberCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **memberCreateRequest** | [**MemberCreateRequest**](MemberCreateRequest.md)|  | |

### Return type

[**MemberResponse**](MemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="memberRead"></a>
# **memberRead**
> MemberResponse memberRead(id)

GET api/v1/member/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      MemberResponse result = apiInstance.memberRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#memberRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**MemberResponse**](MemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="memberReadAll"></a>
# **memberReadAll**
> List&lt;MemberResponse&gt; memberReadAll()

GET api/v1/member

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<MemberResponse> result = apiInstance.memberReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#memberReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MemberResponse&gt;**](MemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="playerCreate"></a>
# **playerCreate**
> PlayerResponse playerCreate(playerCreateRequest)

POST api/v1/player

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PlayerCreateRequest playerCreateRequest = new PlayerCreateRequest(); // PlayerCreateRequest | 
    try {
      PlayerResponse result = apiInstance.playerCreate(playerCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#playerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerCreateRequest** | [**PlayerCreateRequest**](PlayerCreateRequest.md)|  | |

### Return type

[**PlayerResponse**](PlayerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="playerRead"></a>
# **playerRead**
> PlayerResponse playerRead(id)

GET api/v1/player/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      PlayerResponse result = apiInstance.playerRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#playerRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**PlayerResponse**](PlayerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="playerReadAll"></a>
# **playerReadAll**
> List&lt;PlayerResponse&gt; playerReadAll()

GET api/v1/player

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<PlayerResponse> result = apiInstance.playerReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#playerReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PlayerResponse&gt;**](PlayerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="playerUpdate"></a>
# **playerUpdate**
> PlayerResponse playerUpdate(id, playerUpdateRequest)

PUT api/v1/player/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    PlayerUpdateRequest playerUpdateRequest = new PlayerUpdateRequest(); // PlayerUpdateRequest | 
    try {
      PlayerResponse result = apiInstance.playerUpdate(id, playerUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#playerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **playerUpdateRequest** | [**PlayerUpdateRequest**](PlayerUpdateRequest.md)|  | |

### Return type

[**PlayerResponse**](PlayerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="refreshToken"></a>
# **refreshToken**
> TokenResponse refreshToken()

POST api/v1/auth/refresh-token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      TokenResponse result = apiInstance.refreshToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#refreshToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="regionReadAll"></a>
# **regionReadAll**
> List&lt;RegionResponse&gt; regionReadAll()

GET api/v1/region

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<RegionResponse> result = apiInstance.regionReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#regionReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RegionResponse&gt;**](RegionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="regionReate"></a>
# **regionReate**
> RegionResponse regionReate(regionCreateRequest)

POST api/v1/region

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RegionCreateRequest regionCreateRequest = new RegionCreateRequest(); // RegionCreateRequest | 
    try {
      RegionResponse result = apiInstance.regionReate(regionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#regionReate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **regionCreateRequest** | [**RegionCreateRequest**](RegionCreateRequest.md)|  | |

### Return type

[**RegionResponse**](RegionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="snsCreate"></a>
# **snsCreate**
> SnsResponse snsCreate(snsCreateRequest)

POST api/v1/sns

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    SnsCreateRequest snsCreateRequest = new SnsCreateRequest(); // SnsCreateRequest | 
    try {
      SnsResponse result = apiInstance.snsCreate(snsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#snsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **snsCreateRequest** | [**SnsCreateRequest**](SnsCreateRequest.md)|  | |

### Return type

[**SnsResponse**](SnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="snsRead"></a>
# **snsRead**
> SnsResponse snsRead(id)

GET api/v1/sns/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      SnsResponse result = apiInstance.snsRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#snsRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**SnsResponse**](SnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="snsReadAll"></a>
# **snsReadAll**
> List&lt;SnsResponse&gt; snsReadAll()

GET api/v1/sns

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<SnsResponse> result = apiInstance.snsReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#snsReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SnsResponse&gt;**](SnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="stadiumCreate"></a>
# **stadiumCreate**
> StadiumResponse stadiumCreate(stadiumCreateRequest)

POST api/v1/stadium

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    StadiumCreateRequest stadiumCreateRequest = new StadiumCreateRequest(); // StadiumCreateRequest | 
    try {
      StadiumResponse result = apiInstance.stadiumCreate(stadiumCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#stadiumCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stadiumCreateRequest** | [**StadiumCreateRequest**](StadiumCreateRequest.md)|  | |

### Return type

[**StadiumResponse**](StadiumResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="stadiumRead"></a>
# **stadiumRead**
> StadiumResponse stadiumRead(id)

GET api/v1/stadium/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      StadiumResponse result = apiInstance.stadiumRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#stadiumRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**StadiumResponse**](StadiumResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="stadiumReadAll"></a>
# **stadiumReadAll**
> List&lt;StadiumResponse&gt; stadiumReadAll()

GET api/v1/stadium

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<StadiumResponse> result = apiInstance.stadiumReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#stadiumReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StadiumResponse&gt;**](StadiumResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="teamCreate"></a>
# **teamCreate**
> TeamResponse teamCreate(teamCreateRequest)

POST api/v1/team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TeamCreateRequest teamCreateRequest = new TeamCreateRequest(); // TeamCreateRequest | 
    try {
      TeamResponse result = apiInstance.teamCreate(teamCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#teamCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **teamCreateRequest** | [**TeamCreateRequest**](TeamCreateRequest.md)|  | |

### Return type

[**TeamResponse**](TeamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="teamRead"></a>
# **teamRead**
> TeamResponse teamRead(id)

GET api/v1/team/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      TeamResponse result = apiInstance.teamRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#teamRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**TeamResponse**](TeamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="teamReadAll"></a>
# **teamReadAll**
> List&lt;TeamResponse&gt; teamReadAll()

GET api/v1/team

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<TeamResponse> result = apiInstance.teamReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#teamReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TeamResponse&gt;**](TeamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="teamUpdate"></a>
# **teamUpdate**
> TeamResponse teamUpdate(id, teamUpdateRequest)

PUT api/v1/team/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    TeamUpdateRequest teamUpdateRequest = new TeamUpdateRequest(); // TeamUpdateRequest | 
    try {
      TeamResponse result = apiInstance.teamUpdate(id, teamUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#teamUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **teamUpdateRequest** | [**TeamUpdateRequest**](TeamUpdateRequest.md)|  | |

### Return type

[**TeamResponse**](TeamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="teams"></a>
# **teams**
> List&lt;TeamResponse&gt; teams(id)

GET api/v1/member/{id}/teams

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      List<TeamResponse> result = apiInstance.teams(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#teams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**List&lt;TeamResponse&gt;**](TeamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="voteCreate"></a>
# **voteCreate**
> VoteResponse voteCreate(voteCreateRequest)

POST api/v1/vote

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    VoteCreateRequest voteCreateRequest = new VoteCreateRequest(); // VoteCreateRequest | 
    try {
      VoteResponse result = apiInstance.voteCreate(voteCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#voteCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **voteCreateRequest** | [**VoteCreateRequest**](VoteCreateRequest.md)|  | |

### Return type

[**VoteResponse**](VoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="voteRead"></a>
# **voteRead**
> VoteResponse voteRead(id)

GET api/v1/vote/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      VoteResponse result = apiInstance.voteRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#voteRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |

### Return type

[**VoteResponse**](VoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="voteReadAll"></a>
# **voteReadAll**
> List&lt;VoteResponse&gt; voteReadAll()

GET api/v1/vote

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<VoteResponse> result = apiInstance.voteReadAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#voteReadAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VoteResponse&gt;**](VoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="voteUpdate"></a>
# **voteUpdate**
> VoteResponse voteUpdate(id, voteUpdateRequest)

PUT api/v1/vote/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://dev-api.fcprovin.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    VoteUpdateRequest voteUpdateRequest = new VoteUpdateRequest(); // VoteUpdateRequest | 
    try {
      VoteResponse result = apiInstance.voteUpdate(id, voteUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#voteUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **voteUpdateRequest** | [**VoteUpdateRequest**](VoteUpdateRequest.md)|  | |

### Return type

[**VoteResponse**](VoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

