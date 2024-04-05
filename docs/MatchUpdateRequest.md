

# MatchUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stadiumId** | **Long** |  |  [optional] |
|**otherTeamName** | **String** |  |  [optional] |
|**home** | **Boolean** |  |  [optional] |
|**notice** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**voteStartDate** | **OffsetDateTime** |  |  [optional] |
|**voteEndDate** | **OffsetDateTime** |  |  [optional] |
|**attendDeadlineDate** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| VOTE | &quot;VOTE&quot; |
| ATTEND | &quot;ATTEND&quot; |
| MATCH | &quot;MATCH&quot; |
| FINISH | &quot;FINISH&quot; |



