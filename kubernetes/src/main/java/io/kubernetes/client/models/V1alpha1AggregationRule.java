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
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 */
@ApiModel(description = "AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole")

public class V1alpha1AggregationRule {
  @SerializedName("clusterRoleSelectors")
  private List<V1LabelSelector> clusterRoleSelectors = null;

  public V1alpha1AggregationRule clusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
    return this;
  }

  public V1alpha1AggregationRule addClusterRoleSelectorsItem(V1LabelSelector clusterRoleSelectorsItem) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList<V1LabelSelector>();
    }
    this.clusterRoleSelectors.add(clusterRoleSelectorsItem);
    return this;
  }

   /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
   * @return clusterRoleSelectors
  **/
  @ApiModelProperty(value = "ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added")
  public List<V1LabelSelector> getClusterRoleSelectors() {
    return clusterRoleSelectors;
  }

  public void setClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AggregationRule v1alpha1AggregationRule = (V1alpha1AggregationRule) o;
    return Objects.equals(this.clusterRoleSelectors, v1alpha1AggregationRule.clusterRoleSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRoleSelectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AggregationRule {\n");
    
    sb.append("    clusterRoleSelectors: ").append(toIndentedString(clusterRoleSelectors)).append("\n");
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

