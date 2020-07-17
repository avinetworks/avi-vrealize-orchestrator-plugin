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
 * The CloudTenantCleanup is a POJO class extends AviRestResource that used for creating
 * CloudTenantCleanup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudTenantCleanup")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDTENANTCLEANUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudTenantCleanup extends AviRestResource {
  @JsonProperty("id")
  @JsonInclude(Include.NON_NULL)
  private String id = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("num_ports")
  @JsonInclude(Include.NON_NULL)
  private Integer numPorts = null;

  @JsonProperty("num_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numSe = null;

  @JsonProperty("num_secgrp")
  @JsonInclude(Include.NON_NULL)
  private Integer numSecgrp = null;

  @JsonProperty("num_svrgrp")
  @JsonInclude(Include.NON_NULL)
  private Integer numSvrgrp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property id of obj type cloudtenantcleanup field type str  type string.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property id of obj type cloudtenantcleanup field type str  type string.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_ports of obj type cloudtenantcleanup field type str  type integer.
   * @return numPorts
   */
  @VsoMethod
  public Integer getNumPorts() {
    return numPorts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_ports of obj type cloudtenantcleanup field type str  type integer.
   * @param numPorts set the numPorts.
   */
  @VsoMethod
  public void setNumPorts(Integer  numPorts) {
    this.numPorts = numPorts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_se of obj type cloudtenantcleanup field type str  type integer.
   * @return numSe
   */
  @VsoMethod
  public Integer getNumSe() {
    return numSe;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_se of obj type cloudtenantcleanup field type str  type integer.
   * @param numSe set the numSe.
   */
  @VsoMethod
  public void setNumSe(Integer  numSe) {
    this.numSe = numSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_secgrp of obj type cloudtenantcleanup field type str  type integer.
   * @return numSecgrp
   */
  @VsoMethod
  public Integer getNumSecgrp() {
    return numSecgrp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_secgrp of obj type cloudtenantcleanup field type str  type integer.
   * @param numSecgrp set the numSecgrp.
   */
  @VsoMethod
  public void setNumSecgrp(Integer  numSecgrp) {
    this.numSecgrp = numSecgrp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_svrgrp of obj type cloudtenantcleanup field type str  type integer.
   * @return numSvrgrp
   */
  @VsoMethod
  public Integer getNumSvrgrp() {
    return numSvrgrp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_svrgrp of obj type cloudtenantcleanup field type str  type integer.
   * @param numSvrgrp set the numSvrgrp.
   */
  @VsoMethod
  public void setNumSvrgrp(Integer  numSvrgrp) {
    this.numSvrgrp = numSvrgrp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudTenantCleanup objCloudTenantCleanup = (CloudTenantCleanup) o;
  return   Objects.equals(this.name, objCloudTenantCleanup.name)&&
  Objects.equals(this.numSvrgrp, objCloudTenantCleanup.numSvrgrp)&&
  Objects.equals(this.numPorts, objCloudTenantCleanup.numPorts)&&
  Objects.equals(this.numSecgrp, objCloudTenantCleanup.numSecgrp)&&
  Objects.equals(this.numSe, objCloudTenantCleanup.numSe)&&
  Objects.equals(this.id, objCloudTenantCleanup.id);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudTenantCleanup {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numPorts: ").append(toIndentedString(numPorts)).append("\n");
        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
        sb.append("    numSecgrp: ").append(toIndentedString(numSecgrp)).append("\n");
        sb.append("    numSvrgrp: ").append(toIndentedString(numSvrgrp)).append("\n");
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
