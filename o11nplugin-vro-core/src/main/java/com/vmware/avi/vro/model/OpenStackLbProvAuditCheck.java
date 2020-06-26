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
 * The OpenStackLbProvAuditCheck is a POJO class extends AviRestResource that used for creating
 * OpenStackLbProvAuditCheck.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackLbProvAuditCheck")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKLBPROVAUDITCHECK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackLbProvAuditCheck extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("detail")
  @JsonInclude(Include.NON_NULL)
  private String detail = null;

  @JsonProperty("elapsed")
  @JsonInclude(Include.NON_NULL)
  private Integer elapsed = null;

  @JsonProperty("id")
  @JsonInclude(Include.NON_NULL)
  private String id = null;

  @JsonProperty("result")
  @JsonInclude(Include.NON_NULL)
  private String result = null;

  @JsonProperty("tenant")
  @JsonInclude(Include.NON_NULL)
  private String tenant = null;

  @JsonProperty("user")
  @JsonInclude(Include.NON_NULL)
  private String user = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type openstacklbprovauditcheck field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type openstacklbprovauditcheck field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property detail of obj type openstacklbprovauditcheck field type str  type string.
   * @return detail
   */
  @VsoMethod
  public String getDetail() {
    return detail;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property detail of obj type openstacklbprovauditcheck field type str  type string.
   * @param detail set the detail.
   */
  @VsoMethod
  public void setDetail(String  detail) {
    this.detail = detail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property elapsed of obj type openstacklbprovauditcheck field type str  type integer.
   * @return elapsed
   */
  @VsoMethod
  public Integer getElapsed() {
    return elapsed;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property elapsed of obj type openstacklbprovauditcheck field type str  type integer.
   * @param elapsed set the elapsed.
   */
  @VsoMethod
  public void setElapsed(Integer  elapsed) {
    this.elapsed = elapsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property id of obj type openstacklbprovauditcheck field type str  type string.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property id of obj type openstacklbprovauditcheck field type str  type string.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property result of obj type openstacklbprovauditcheck field type str  type string.
   * @return result
   */
  @VsoMethod
  public String getResult() {
    return result;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property result of obj type openstacklbprovauditcheck field type str  type string.
   * @param result set the result.
   */
  @VsoMethod
  public void setResult(String  result) {
    this.result = result;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tenant of obj type openstacklbprovauditcheck field type str  type string.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tenant of obj type openstacklbprovauditcheck field type str  type string.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property user of obj type openstacklbprovauditcheck field type str  type string.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property user of obj type openstacklbprovauditcheck field type str  type string.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackLbProvAuditCheck objOpenStackLbProvAuditCheck = (OpenStackLbProvAuditCheck) o;
  return   Objects.equals(this.detail, objOpenStackLbProvAuditCheck.detail)&&
  Objects.equals(this.elapsed, objOpenStackLbProvAuditCheck.elapsed)&&
  Objects.equals(this.result, objOpenStackLbProvAuditCheck.result)&&
  Objects.equals(this.ccId, objOpenStackLbProvAuditCheck.ccId)&&
  Objects.equals(this.id, objOpenStackLbProvAuditCheck.id)&&
  Objects.equals(this.tenant, objOpenStackLbProvAuditCheck.tenant)&&
  Objects.equals(this.user, objOpenStackLbProvAuditCheck.user);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackLbProvAuditCheck {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
