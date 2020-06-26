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
 * The SeVersionCheckFailedEvent is a POJO class extends AviRestResource that used for creating
 * SeVersionCheckFailedEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeVersionCheckFailedEvent")
@VsoFinder(name = Constants.FINDER_VRO_SEVERSIONCHECKFAILEDEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeVersionCheckFailedEvent extends AviRestResource {
  @JsonProperty("controller_version")
  @JsonInclude(Include.NON_NULL)
  private String controllerVersion = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("se_version")
  @JsonInclude(Include.NON_NULL)
  private String seVersion = null;



  /**
   * This is the getter method this will return the attribute value.
   * Software version on the controller.
   * @return controllerVersion
   */
  @VsoMethod
  public String getControllerVersion() {
    return controllerVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Software version on the controller.
   * @param controllerVersion set the controllerVersion.
   */
  @VsoMethod
  public void setControllerVersion(String  controllerVersion) {
    this.controllerVersion = controllerVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Software version on the se.
   * @return seVersion
   */
  @VsoMethod
  public String getSeVersion() {
    return seVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Software version on the se.
   * @param seVersion set the seVersion.
   */
  @VsoMethod
  public void setSeVersion(String  seVersion) {
    this.seVersion = seVersion;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeVersionCheckFailedEvent objSeVersionCheckFailedEvent = (SeVersionCheckFailedEvent) o;
  return   Objects.equals(this.seVersion, objSeVersionCheckFailedEvent.seVersion)&&
  Objects.equals(this.seUuid, objSeVersionCheckFailedEvent.seUuid)&&
  Objects.equals(this.controllerVersion, objSeVersionCheckFailedEvent.controllerVersion);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeVersionCheckFailedEvent {\n");
      sb.append("    controllerVersion: ").append(toIndentedString(controllerVersion)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    seVersion: ").append(toIndentedString(seVersion)).append("\n");
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
