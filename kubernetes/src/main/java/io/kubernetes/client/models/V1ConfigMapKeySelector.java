/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Selects a key from a ConfigMap.
 */
@ApiModel(description = "Selects a key from a ConfigMap.")

public class V1ConfigMapKeySelector {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  public V1ConfigMapKeySelector key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key to select.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key to select.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ConfigMapKeySelector name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ConfigMapKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the ConfigMap or it&#39;s key must be defined
   * @return optional
  **/
  @ApiModelProperty(value = "Specify whether the ConfigMap or it's key must be defined")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigMapKeySelector v1ConfigMapKeySelector = (V1ConfigMapKeySelector) o;
    return Objects.equals(this.key, v1ConfigMapKeySelector.key) &&
        Objects.equals(this.name, v1ConfigMapKeySelector.name) &&
        Objects.equals(this.optional, v1ConfigMapKeySelector.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigMapKeySelector {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

