/*
 * chuk_check_core API
 * chuk_check_core API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.MemberResponse;
import org.openapitools.client.model.TeamResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PlayerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-05T14:29:51.370708+09:00[Asia/Seoul]")
public class PlayerResponse {
  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Long playerId;

  public static final String SERIALIZED_NAME_UNIFORM_NUMBER = "uniformNumber";
  @SerializedName(SERIALIZED_NAME_UNIFORM_NUMBER)
  private Integer uniformNumber;

  /**
   * Gets or Sets position
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    FW("FW"),
    
    MF("MF"),
    
    DF("DF"),
    
    GK("GK");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PositionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionEnum position;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAIT("WAIT"),
    
    APPROVE("APPROVE"),
    
    EXIT("EXIT");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Gets or Sets authority
   */
  @JsonAdapter(AuthorityEnum.Adapter.class)
  public enum AuthorityEnum {
    GENERAL("GENERAL"),
    
    MANAGER("MANAGER"),
    
    LEADER("LEADER");

    private String value;

    AuthorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorityEnum fromValue(String value) {
      for (AuthorityEnum b : AuthorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHORITY = "authority";
  @SerializedName(SERIALIZED_NAME_AUTHORITY)
  private AuthorityEnum authority;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updatedDate";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private OffsetDateTime updatedDate;

  public static final String SERIALIZED_NAME_MEMBER = "member";
  @SerializedName(SERIALIZED_NAME_MEMBER)
  private MemberResponse member;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private TeamResponse team;

  public PlayerResponse() {
  }

  public PlayerResponse playerId(Long playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPlayerId() {
    return playerId;
  }


  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }


  public PlayerResponse uniformNumber(Integer uniformNumber) {
    
    this.uniformNumber = uniformNumber;
    return this;
  }

   /**
   * Get uniformNumber
   * @return uniformNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniformNumber() {
    return uniformNumber;
  }


  public void setUniformNumber(Integer uniformNumber) {
    this.uniformNumber = uniformNumber;
  }


  public PlayerResponse position(PositionEnum position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PositionEnum getPosition() {
    return position;
  }


  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  public PlayerResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PlayerResponse authority(AuthorityEnum authority) {
    
    this.authority = authority;
    return this;
  }

   /**
   * Get authority
   * @return authority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorityEnum getAuthority() {
    return authority;
  }


  public void setAuthority(AuthorityEnum authority) {
    this.authority = authority;
  }


  public PlayerResponse createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public PlayerResponse updatedDate(OffsetDateTime updatedDate) {
    
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }


  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }


  public PlayerResponse member(MemberResponse member) {
    
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MemberResponse getMember() {
    return member;
  }


  public void setMember(MemberResponse member) {
    this.member = member;
  }


  public PlayerResponse team(TeamResponse team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamResponse getTeam() {
    return team;
  }


  public void setTeam(TeamResponse team) {
    this.team = team;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerResponse playerResponse = (PlayerResponse) o;
    return Objects.equals(this.playerId, playerResponse.playerId) &&
        Objects.equals(this.uniformNumber, playerResponse.uniformNumber) &&
        Objects.equals(this.position, playerResponse.position) &&
        Objects.equals(this.status, playerResponse.status) &&
        Objects.equals(this.authority, playerResponse.authority) &&
        Objects.equals(this.createdDate, playerResponse.createdDate) &&
        Objects.equals(this.updatedDate, playerResponse.updatedDate) &&
        Objects.equals(this.member, playerResponse.member) &&
        Objects.equals(this.team, playerResponse.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerId, uniformNumber, position, status, authority, createdDate, updatedDate, member, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerResponse {\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    uniformNumber: ").append(toIndentedString(uniformNumber)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("playerId");
    openapiFields.add("uniformNumber");
    openapiFields.add("position");
    openapiFields.add("status");
    openapiFields.add("authority");
    openapiFields.add("createdDate");
    openapiFields.add("updatedDate");
    openapiFields.add("member");
    openapiFields.add("team");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlayerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PlayerResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerResponse is not found in the empty JSON string", PlayerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlayerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("authority") != null && !jsonObj.get("authority").isJsonNull()) && !jsonObj.get("authority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authority").toString()));
      }
      // validate the optional field `member`
      if (jsonObj.get("member") != null && !jsonObj.get("member").isJsonNull()) {
        MemberResponse.validateJsonObject(jsonObj.getAsJsonObject("member"));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        TeamResponse.validateJsonObject(jsonObj.getAsJsonObject("team"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerResponse>() {
           @Override
           public void write(JsonWriter out, PlayerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerResponse
  * @throws IOException if the JSON string is invalid with respect to PlayerResponse
  */
  public static PlayerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerResponse.class);
  }

 /**
  * Convert an instance of PlayerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
