

# MatchResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchId** | **Long** |  |  [optional] |
|**otherTeamName** | **String** |  |  [optional] |
|**home** | **Boolean** |  |  [optional] |
|**notice** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**matchDate** | [**MatchDate**](MatchDate.md) |  |  [optional] |
|**voteDate** | [**VoteDate**](VoteDate.md) |  |  [optional] |
|**attendDate** | [**AttendDate**](AttendDate.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**updatedDate** | **OffsetDateTime** |  |  [optional] |
|**team** | [**TeamResponse**](TeamResponse.md) |  |  [optional] |
|**stadium** | [**StadiumResponse**](StadiumResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| VOTE | &quot;VOTE&quot; |
| ATTEND | &quot;ATTEND&quot; |
| MATCH | &quot;MATCH&quot; |
| FINISH | &quot;FINISH&quot; |



