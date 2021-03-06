package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerUpgradeState;
import com.vmware.avi.vro.model.SeUpgradeStatusSummary;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SystemUpgradeState is a POJO class extends AviRestResource that used for creating
 * SystemUpgradeState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SystemUpgradeState")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMUPGRADESTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SystemUpgradeState extends AviRestResource {
    @JsonProperty("controller_state")
    @JsonInclude(Include.NON_NULL)
    private ControllerUpgradeState controllerState = null;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = null;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime = null;

    @JsonProperty("from_version")
    @JsonInclude(Include.NON_NULL)
    private String fromVersion = null;

    @JsonProperty("in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean inProgress = null;

    @JsonProperty("is_patch")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPatch = null;

    @JsonProperty("patch_type")
    @JsonInclude(Include.NON_NULL)
    private String patchType = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("result")
    @JsonInclude(Include.NON_NULL)
    private String result = null;

    @JsonProperty("rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean rollback = null;

    @JsonProperty("se_state")
    @JsonInclude(Include.NON_NULL)
    private SeUpgradeStatusSummary seState = null;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime = null;

    @JsonProperty("to_version")
    @JsonInclude(Include.NON_NULL)
    private String toVersion = null;



  /**
   * This is the getter method this will return the attribute value.
   * Upgrade state from controller.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerState
   */
  @VsoMethod
  public ControllerUpgradeState getControllerState() {
    return controllerState;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade state from controller.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerState set the controllerState.
   */
  @VsoMethod
  public void setControllerState(ControllerUpgradeState controllerState) {
    this.controllerState = controllerState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade duration.
   * Field introduced in 17.1.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade duration.
   * Field introduced in 17.1.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade end time.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade end time.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current version.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fromVersion
   */
  @VsoMethod
  public String getFromVersion() {
    return fromVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Current version.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fromVersion set the fromVersion.
   */
  @VsoMethod
  public void setFromVersion(String  fromVersion) {
    this.fromVersion = fromVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set if upgrade is in progress.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return inProgress
   */
  @VsoMethod
  public Boolean getInProgress() {
    return inProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Set if upgrade is in progress.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param inProgress set the inProgress.
   */
  @VsoMethod
  public void setInProgress(Boolean  inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Is set true, if patch upgrade requested by the user.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isPatch
   */
  @VsoMethod
  public Boolean getIsPatch() {
    return isPatch;
  }

  /**
   * This is the setter method to the attribute.
   * Is set true, if patch upgrade requested by the user.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isPatch set the isPatch.
   */
  @VsoMethod
  public void setIsPatch(Boolean  isPatch) {
    this.isPatch = isPatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of patch upgrade.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchType
   */
  @VsoMethod
  public String getPatchType() {
    return patchType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of patch upgrade.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchType set the patchType.
   */
  @VsoMethod
  public void setPatchType(String  patchType) {
    this.patchType = patchType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for upgrade failure.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for upgrade failure.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade result.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return result
   */
  @VsoMethod
  public String getResult() {
    return result;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade result.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param result set the result.
   */
  @VsoMethod
  public void setResult(String  result) {
    this.result = result;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set if rollback is requested by the user.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rollback
   */
  @VsoMethod
  public Boolean getRollback() {
    return rollback;
  }

  /**
   * This is the setter method to the attribute.
   * Set if rollback is requested by the user.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rollback set the rollback.
   */
  @VsoMethod
  public void setRollback(Boolean  rollback) {
    this.rollback = rollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade state of service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seState
   */
  @VsoMethod
  public SeUpgradeStatusSummary getSeState() {
    return seState;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade state of service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seState set the seState.
   */
  @VsoMethod
  public void setSeState(SeUpgradeStatusSummary seState) {
    this.seState = seState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade start time.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade start time.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version to upgrade to.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toVersion
   */
  @VsoMethod
  public String getToVersion() {
    return toVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Version to upgrade to.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toVersion set the toVersion.
   */
  @VsoMethod
  public void setToVersion(String  toVersion) {
    this.toVersion = toVersion;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SystemUpgradeState objSystemUpgradeState = (SystemUpgradeState) o;
  return   Objects.equals(this.inProgress, objSystemUpgradeState.inProgress)&&
  Objects.equals(this.rollback, objSystemUpgradeState.rollback)&&
  Objects.equals(this.controllerState, objSystemUpgradeState.controllerState)&&
  Objects.equals(this.seState, objSystemUpgradeState.seState)&&
  Objects.equals(this.startTime, objSystemUpgradeState.startTime)&&
  Objects.equals(this.endTime, objSystemUpgradeState.endTime)&&
  Objects.equals(this.duration, objSystemUpgradeState.duration)&&
  Objects.equals(this.fromVersion, objSystemUpgradeState.fromVersion)&&
  Objects.equals(this.toVersion, objSystemUpgradeState.toVersion)&&
  Objects.equals(this.result, objSystemUpgradeState.result)&&
  Objects.equals(this.reason, objSystemUpgradeState.reason)&&
  Objects.equals(this.isPatch, objSystemUpgradeState.isPatch)&&
  Objects.equals(this.patchType, objSystemUpgradeState.patchType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SystemUpgradeState {\n");
      sb.append("    controllerState: ").append(toIndentedString(controllerState)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    fromVersion: ").append(toIndentedString(fromVersion)).append("\n");
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    isPatch: ").append(toIndentedString(isPatch)).append("\n");
        sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
        sb.append("    seState: ").append(toIndentedString(seState)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    toVersion: ").append(toIndentedString(toVersion)).append("\n");
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

