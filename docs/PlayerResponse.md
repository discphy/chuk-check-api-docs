

# PlayerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**playerId** | **Long** |  |  [optional] |
|**uniformNumber** | **Integer** |  |  [optional] |
|**position** | [**PositionEnum**](#PositionEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**authority** | [**AuthorityEnum**](#AuthorityEnum) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**updatedDate** | **OffsetDateTime** |  |  [optional] |
|**member** | [**MemberResponse**](MemberResponse.md) |  |  [optional] |
|**team** | [**TeamResponse**](TeamResponse.md) |  |  [optional] |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| FW | &quot;FW&quot; |
| MF | &quot;MF&quot; |
| DF | &quot;DF&quot; |
| GK | &quot;GK&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAIT | &quot;WAIT&quot; |
| APPROVE | &quot;APPROVE&quot; |
| EXIT | &quot;EXIT&quot; |



## Enum: AuthorityEnum

| Name | Value |
|---- | -----|
| GENERAL | &quot;GENERAL&quot; |
| MANAGER | &quot;MANAGER&quot; |
| LEADER | &quot;LEADER&quot; |



