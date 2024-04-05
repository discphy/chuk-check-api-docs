

# VoteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voteId** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**updatedDate** | **OffsetDateTime** |  |  [optional] |
|**player** | [**PlayerResponse**](PlayerResponse.md) |  |  [optional] |
|**match** | [**MatchResponse**](MatchResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAIT | &quot;WAIT&quot; |
| TRUE | &quot;TRUE&quot; |
| FALSE | &quot;FALSE&quot; |



