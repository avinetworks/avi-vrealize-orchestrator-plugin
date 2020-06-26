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
 * The SSLIgnoredDetails is a POJO class extends AviRestResource that used for creating
 * SSLIgnoredDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLIgnoredDetails")
@VsoFinder(name = Constants.FINDER_VRO_SSLIGNOREDDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLIgnoredDetails extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of ssl certificate.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of ssl certificate.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for ignoring certificate.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for ignoring certificate.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLIgnoredDetails objSSLIgnoredDetails = (SSLIgnoredDetails) o;
  return   Objects.equals(this.reason, objSSLIgnoredDetails.reason)&&
  Objects.equals(this.name, objSSLIgnoredDetails.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLIgnoredDetails {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
