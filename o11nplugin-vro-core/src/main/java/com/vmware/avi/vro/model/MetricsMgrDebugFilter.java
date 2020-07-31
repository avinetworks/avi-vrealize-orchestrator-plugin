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
 * The MetricsMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * MetricsMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_METRICSMGRDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsMgrDebugFilter extends AviRestResource {
  @JsonProperty("disable_hw_training")
  @JsonInclude(Include.NON_NULL)
  private String disableHwTraining = null;

  @JsonProperty("entity")
  @JsonInclude(Include.NON_NULL)
  private String entity = null;

  @JsonProperty("license_grace_period")
  @JsonInclude(Include.NON_NULL)
  private String licenseGracePeriod = null;

  @JsonProperty("log_first_n")
  @JsonInclude(Include.NON_NULL)
  private String logFirstN = null;

  @JsonProperty("logging_freq")
  @JsonInclude(Include.NON_NULL)
  private String loggingFreq = null;

  @JsonProperty("metric_instance_id")
  @JsonInclude(Include.NON_NULL)
  private String metricInstanceId = null;

  @JsonProperty("obj")
  @JsonInclude(Include.NON_NULL)
  private String obj = null;

  @JsonProperty("skip_cluster_map_check")
  @JsonInclude(Include.NON_NULL)
  private String skipClusterMapCheck = null;

  @JsonProperty("skip_metrics_db_writes")
  @JsonInclude(Include.NON_NULL)
  private String skipMetricsDbWrites = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property disable_hw_training of obj type metricsmgrdebugfilter field type str  type string.
   * @return disableHwTraining
   */
  @VsoMethod
  public String getDisableHwTraining() {
    return disableHwTraining;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property disable_hw_training of obj type metricsmgrdebugfilter field type str  type string.
   * @param disableHwTraining set the disableHwTraining.
   */
  @VsoMethod
  public void setDisableHwTraining(String  disableHwTraining) {
    this.disableHwTraining = disableHwTraining;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property entity of obj type metricsmgrdebugfilter field type str  type string.
   * @return entity
   */
  @VsoMethod
  public String getEntity() {
    return entity;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property entity of obj type metricsmgrdebugfilter field type str  type string.
   * @param entity set the entity.
   */
  @VsoMethod
  public void setEntity(String  entity) {
    this.entity = entity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Setting to reduce the grace period for license expiry in hours.
   * @return licenseGracePeriod
   */
  @VsoMethod
  public String getLicenseGracePeriod() {
    return licenseGracePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Setting to reduce the grace period for license expiry in hours.
   * @param licenseGracePeriod set the licenseGracePeriod.
   */
  @VsoMethod
  public void setLicenseGracePeriod(String  licenseGracePeriod) {
    this.licenseGracePeriod = licenseGracePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property log_first_n of obj type metricsmgrdebugfilter field type str  type string.
   * @return logFirstN
   */
  @VsoMethod
  public String getLogFirstN() {
    return logFirstN;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property log_first_n of obj type metricsmgrdebugfilter field type str  type string.
   * @param logFirstN set the logFirstN.
   */
  @VsoMethod
  public void setLogFirstN(String  logFirstN) {
    this.logFirstN = logFirstN;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property logging_freq of obj type metricsmgrdebugfilter field type str  type string.
   * @return loggingFreq
   */
  @VsoMethod
  public String getLoggingFreq() {
    return loggingFreq;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property logging_freq of obj type metricsmgrdebugfilter field type str  type string.
   * @param loggingFreq set the loggingFreq.
   */
  @VsoMethod
  public void setLoggingFreq(String  loggingFreq) {
    this.loggingFreq = loggingFreq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_instance_id of obj type metricsmgrdebugfilter field type str  type string.
   * @return metricInstanceId
   */
  @VsoMethod
  public String getMetricInstanceId() {
    return metricInstanceId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_instance_id of obj type metricsmgrdebugfilter field type str  type string.
   * @param metricInstanceId set the metricInstanceId.
   */
  @VsoMethod
  public void setMetricInstanceId(String  metricInstanceId) {
    this.metricInstanceId = metricInstanceId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property obj of obj type metricsmgrdebugfilter field type str  type string.
   * @return obj
   */
  @VsoMethod
  public String getObj() {
    return obj;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property obj of obj type metricsmgrdebugfilter field type str  type string.
   * @param obj set the obj.
   */
  @VsoMethod
  public void setObj(String  obj) {
    this.obj = obj;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property skip_cluster_map_check of obj type metricsmgrdebugfilter field type str  type string.
   * @return skipClusterMapCheck
   */
  @VsoMethod
  public String getSkipClusterMapCheck() {
    return skipClusterMapCheck;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property skip_cluster_map_check of obj type metricsmgrdebugfilter field type str  type string.
   * @param skipClusterMapCheck set the skipClusterMapCheck.
   */
  @VsoMethod
  public void setSkipClusterMapCheck(String  skipClusterMapCheck) {
    this.skipClusterMapCheck = skipClusterMapCheck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property skip_metrics_db_writes of obj type metricsmgrdebugfilter field type str  type string.
   * @return skipMetricsDbWrites
   */
  @VsoMethod
  public String getSkipMetricsDbWrites() {
    return skipMetricsDbWrites;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property skip_metrics_db_writes of obj type metricsmgrdebugfilter field type str  type string.
   * @param skipMetricsDbWrites set the skipMetricsDbWrites.
   */
  @VsoMethod
  public void setSkipMetricsDbWrites(String  skipMetricsDbWrites) {
    this.skipMetricsDbWrites = skipMetricsDbWrites;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsMgrDebugFilter objMetricsMgrDebugFilter = (MetricsMgrDebugFilter) o;
  return   Objects.equals(this.obj, objMetricsMgrDebugFilter.obj)&&
  Objects.equals(this.entity, objMetricsMgrDebugFilter.entity)&&
  Objects.equals(this.skipMetricsDbWrites, objMetricsMgrDebugFilter.skipMetricsDbWrites)&&
  Objects.equals(this.loggingFreq, objMetricsMgrDebugFilter.loggingFreq)&&
  Objects.equals(this.logFirstN, objMetricsMgrDebugFilter.logFirstN)&&
  Objects.equals(this.metricInstanceId, objMetricsMgrDebugFilter.metricInstanceId)&&
  Objects.equals(this.skipClusterMapCheck, objMetricsMgrDebugFilter.skipClusterMapCheck)&&
  Objects.equals(this.disableHwTraining, objMetricsMgrDebugFilter.disableHwTraining)&&
  Objects.equals(this.licenseGracePeriod, objMetricsMgrDebugFilter.licenseGracePeriod);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsMgrDebugFilter {\n");
      sb.append("    disableHwTraining: ").append(toIndentedString(disableHwTraining)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    licenseGracePeriod: ").append(toIndentedString(licenseGracePeriod)).append("\n");
        sb.append("    logFirstN: ").append(toIndentedString(logFirstN)).append("\n");
        sb.append("    loggingFreq: ").append(toIndentedString(loggingFreq)).append("\n");
        sb.append("    metricInstanceId: ").append(toIndentedString(metricInstanceId)).append("\n");
        sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
        sb.append("    skipClusterMapCheck: ").append(toIndentedString(skipClusterMapCheck)).append("\n");
        sb.append("    skipMetricsDbWrites: ").append(toIndentedString(skipMetricsDbWrites)).append("\n");
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

