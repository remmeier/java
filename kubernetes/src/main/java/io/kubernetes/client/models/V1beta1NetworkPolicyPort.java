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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
 */
@ApiModel(description = "DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.")

public class V1beta1NetworkPolicyPort {
  @SerializedName("port")
  private IntOrString port = null;

  @SerializedName("protocol")
  private String protocol = null;

  public V1beta1NetworkPolicyPort port(IntOrString port) {
    this.port = port;
    return this;
  }

   /**
   * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
   * @return port
  **/
  @ApiModelProperty(value = "If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }

  public V1beta1NetworkPolicyPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Optional.  The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP.
   * @return protocol
  **/
  @ApiModelProperty(value = "Optional.  The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicyPort v1beta1NetworkPolicyPort = (V1beta1NetworkPolicyPort) o;
    return Objects.equals(this.port, v1beta1NetworkPolicyPort.port) &&
        Objects.equals(this.protocol, v1beta1NetworkPolicyPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyPort {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

