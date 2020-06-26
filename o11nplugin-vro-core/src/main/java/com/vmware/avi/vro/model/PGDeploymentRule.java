package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PGDeploymentRule is a POJO class extends AviRestResource that used for creating
 * PGDeploymentRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PGDeploymentRule")
@VsoFinder(name = Constants.FINDER_VRO_PGDEPLOYMENTRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PGDeploymentRule extends AviRestResource {
  @JsonProperty("metric_id")
  @JsonInclude(Include.NON_NULL)
  private String metricId = "health.health_score_value";

  @JsonProperty("operator")
  @JsonInclude(Include.NON_NULL)
  private String operator = "CO_GE";

  @JsonProperty("threshold")
  @JsonInclude(Include.NON_NULL)
  private Float threshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_id of obj type pgdeploymentrule field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as health.health_score_value.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_id of obj type pgdeploymentrule field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as health.health_score_value.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CO_EQ, CO_GT, CO_GE, CO_LT, CO_LE, CO_NE.
   * Default value when not specified in API or module is interpreted by Avi Controller as CO_GE.
   * @return operator
   */
  @VsoMethod
  public String getOperator() {
    return operator;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CO_EQ, CO_GT, CO_GE, CO_LT, CO_LE, CO_NE.
   * Default value when not specified in API or module is interpreted by Avi Controller as CO_GE.
   * @param operator set the operator.
   */
  @VsoMethod
  public void setOperator(String  operator) {
    this.operator = operator;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metric threshold that is used as the pass fail.
   * If it is not provided then it will simply compare it with current pool vs new pool.
   * @return threshold
   */
  @VsoMethod
  public Float getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Metric threshold that is used as the pass fail.
   * If it is not provided then it will simply compare it with current pool vs new pool.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Float  threshold) {
    this.threshold = threshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PGDeploymentRule objPGDeploymentRule = (PGDeploymentRule) o;
  return   Objects.equals(this.operator, objPGDeploymentRule.operator)&&
  Objects.equals(this.threshold, objPGDeploymentRule.threshold)&&
  Objects.equals(this.metricId, objPGDeploymentRule.metricId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PGDeploymentRule {\n");
      sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
