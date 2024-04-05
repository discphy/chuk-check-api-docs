

# AttendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attendId** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**updatedDate** | **OffsetDateTime** |  |  [optional] |
|**player** | [**PlayerResponse**](PlayerResponse.md) |  |  [optional] |
|**match** | [**MatchResponse**](MatchResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ATTEND | &quot;ATTEND&quot; |
| LATE | &quot;LATE&quot; |
| ABSENT | &quot;ABSENT&quot; |
| REASON | &quot;REASON&quot; |



