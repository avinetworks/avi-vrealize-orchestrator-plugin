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
 * The VCenterCredentials is a POJO class extends AviRestResource that used for creating
 * VCenterCredentials.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VCenterCredentials")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCREDENTIALS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VCenterCredentials extends AviRestResource {
  @JsonProperty("password")
  @JsonInclude(Include.NON_NULL)
  private String password = null;

  @JsonProperty("username")
  @JsonInclude(Include.NON_NULL)
  private String username = null;



  /**
   * This is the getter method this will return the attribute value.
   * Password to talk to vcenter server.
   * Field introduced in 20.1.1.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Password to talk to vcenter server.
   * Field introduced in 20.1.1.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username to talk to vcenter server.
   * Field introduced in 20.1.1.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Username to talk to vcenter server.
   * Field introduced in 20.1.1.
   * @param username set the username.
   */
  @VsoMethod
  public void setUsername(String  username) {
    this.username = username;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VCenterCredentials objVCenterCredentials = (VCenterCredentials) o;
  return   Objects.equals(this.username, objVCenterCredentials.username)&&
  Objects.equals(this.password, objVCenterCredentials.password);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VCenterCredentials {\n");
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
