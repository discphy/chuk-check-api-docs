# openapi-java-client

chuk_check_core API
- API version: 1.0.0
  - Build date: 2024-04-05T14:29:51.370708+09:00[Asia/Seoul]

chuk_check_core API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://dev-api.fcprovin.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**accessToken**](docs/DefaultApi.md#accessToken) | **POST** /api/v1/auth/access-token | POST api/v1/auth/access-token
*DefaultApi* | [**attendCreate**](docs/DefaultApi.md#attendCreate) | **POST** /api/v1/attend | POST api/v1/attend
*DefaultApi* | [**attendRead**](docs/DefaultApi.md#attendRead) | **GET** /api/v1/attend/{id} | GET api/v1/attend/{id}
*DefaultApi* | [**attendReadAll**](docs/DefaultApi.md#attendReadAll) | **GET** /api/v1/attend | GET api/v1/attend
*DefaultApi* | [**attendUpdate**](docs/DefaultApi.md#attendUpdate) | **PUT** /api/v1/attend/{id} | PUT api/v1/attend/{id}
*DefaultApi* | [**matchCreate**](docs/DefaultApi.md#matchCreate) | **POST** /api/v1/match | POST api/v1/match
*DefaultApi* | [**matchRead**](docs/DefaultApi.md#matchRead) | **GET** /api/v1/match/{id} | GET api/v1/match/{id}
*DefaultApi* | [**matchReadAll**](docs/DefaultApi.md#matchReadAll) | **GET** /api/v1/match | GET api/v1/match
*DefaultApi* | [**matchUpdate**](docs/DefaultApi.md#matchUpdate) | **PUT** /api/v1/match/{id} | PUT api/v1/match/{id}
*DefaultApi* | [**memberCreate**](docs/DefaultApi.md#memberCreate) | **POST** /api/v1/member | POST api/v1/member
*DefaultApi* | [**memberRead**](docs/DefaultApi.md#memberRead) | **GET** /api/v1/member/{id} | GET api/v1/member/{id}
*DefaultApi* | [**memberReadAll**](docs/DefaultApi.md#memberReadAll) | **GET** /api/v1/member | GET api/v1/member
*DefaultApi* | [**playerCreate**](docs/DefaultApi.md#playerCreate) | **POST** /api/v1/player | POST api/v1/player
*DefaultApi* | [**playerRead**](docs/DefaultApi.md#playerRead) | **GET** /api/v1/player/{id} | GET api/v1/player/{id}
*DefaultApi* | [**playerReadAll**](docs/DefaultApi.md#playerReadAll) | **GET** /api/v1/player | GET api/v1/player
*DefaultApi* | [**playerUpdate**](docs/DefaultApi.md#playerUpdate) | **PUT** /api/v1/player/{id} | PUT api/v1/player/{id}
*DefaultApi* | [**refreshToken**](docs/DefaultApi.md#refreshToken) | **POST** /api/v1/auth/refresh-token | POST api/v1/auth/refresh-token
*DefaultApi* | [**regionReadAll**](docs/DefaultApi.md#regionReadAll) | **GET** /api/v1/region | GET api/v1/region
*DefaultApi* | [**regionReate**](docs/DefaultApi.md#regionReate) | **POST** /api/v1/region | POST api/v1/region
*DefaultApi* | [**snsCreate**](docs/DefaultApi.md#snsCreate) | **POST** /api/v1/sns | POST api/v1/sns
*DefaultApi* | [**snsRead**](docs/DefaultApi.md#snsRead) | **GET** /api/v1/sns/{id} | GET api/v1/sns/{id}
*DefaultApi* | [**snsReadAll**](docs/DefaultApi.md#snsReadAll) | **GET** /api/v1/sns | GET api/v1/sns
*DefaultApi* | [**stadiumCreate**](docs/DefaultApi.md#stadiumCreate) | **POST** /api/v1/stadium | POST api/v1/stadium
*DefaultApi* | [**stadiumRead**](docs/DefaultApi.md#stadiumRead) | **GET** /api/v1/stadium/{id} | GET api/v1/stadium/{id}
*DefaultApi* | [**stadiumReadAll**](docs/DefaultApi.md#stadiumReadAll) | **GET** /api/v1/stadium | GET api/v1/stadium
*DefaultApi* | [**teamCreate**](docs/DefaultApi.md#teamCreate) | **POST** /api/v1/team | POST api/v1/team
*DefaultApi* | [**teamRead**](docs/DefaultApi.md#teamRead) | **GET** /api/v1/team/{id} | GET api/v1/team/{id}
*DefaultApi* | [**teamReadAll**](docs/DefaultApi.md#teamReadAll) | **GET** /api/v1/team | GET api/v1/team
*DefaultApi* | [**teamUpdate**](docs/DefaultApi.md#teamUpdate) | **PUT** /api/v1/team/{id} | PUT api/v1/team/{id}
*DefaultApi* | [**teams**](docs/DefaultApi.md#teams) | **GET** /api/v1/member/{id}/teams | GET api/v1/member/{id}/teams
*DefaultApi* | [**voteCreate**](docs/DefaultApi.md#voteCreate) | **POST** /api/v1/vote | POST api/v1/vote
*DefaultApi* | [**voteRead**](docs/DefaultApi.md#voteRead) | **GET** /api/v1/vote/{id} | GET api/v1/vote/{id}
*DefaultApi* | [**voteReadAll**](docs/DefaultApi.md#voteReadAll) | **GET** /api/v1/vote | GET api/v1/vote
*DefaultApi* | [**voteUpdate**](docs/DefaultApi.md#voteUpdate) | **PUT** /api/v1/vote/{id} | PUT api/v1/vote/{id}


## Documentation for Models

 - [AttendCreateRequest](docs/AttendCreateRequest.md)
 - [AttendDate](docs/AttendDate.md)
 - [AttendResponse](docs/AttendResponse.md)
 - [AttendUpdateRequest](docs/AttendUpdateRequest.md)
 - [MatchCreateRequest](docs/MatchCreateRequest.md)
 - [MatchDate](docs/MatchDate.md)
 - [MatchResponse](docs/MatchResponse.md)
 - [MatchUpdateRequest](docs/MatchUpdateRequest.md)
 - [MemberCreateRequest](docs/MemberCreateRequest.md)
 - [MemberResponse](docs/MemberResponse.md)
 - [PlayerCreateRequest](docs/PlayerCreateRequest.md)
 - [PlayerResponse](docs/PlayerResponse.md)
 - [PlayerUpdateRequest](docs/PlayerUpdateRequest.md)
 - [RegionCreateRequest](docs/RegionCreateRequest.md)
 - [RegionResponse](docs/RegionResponse.md)
 - [SnsCreateRequest](docs/SnsCreateRequest.md)
 - [SnsResponse](docs/SnsResponse.md)
 - [StadiumCreateRequest](docs/StadiumCreateRequest.md)
 - [StadiumResponse](docs/StadiumResponse.md)
 - [TeamCreateRequest](docs/TeamCreateRequest.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamUpdateRequest](docs/TeamUpdateRequest.md)
 - [TokenCreateRequest](docs/TokenCreateRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [VoteCreateRequest](docs/VoteCreateRequest.md)
 - [VoteDate](docs/VoteDate.md)
 - [VoteResponse](docs/VoteResponse.md)
 - [VoteUpdateRequest](docs/VoteUpdateRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


