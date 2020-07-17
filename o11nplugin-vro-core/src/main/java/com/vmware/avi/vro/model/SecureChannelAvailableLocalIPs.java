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
 * The SecureChannelAvailableLocalIPs is a POJO class extends AviRestResource that used for creating
 * SecureChannelAvailableLocalIPs.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecureChannelAvailableLocalIPs")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELAVAILABLELOCALIPS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecureChannelAvailableLocalIPs extends AviRestResource {
  @JsonProperty("end")
  @JsonInclude(Include.NON_NULL)
  private Integer end = null;

  @JsonProperty("free_controller_ips")
  @JsonInclude(Include.NON_NULL)
  private List<String> freeControllerIps = null;

  @JsonProperty("free_ips")
  @JsonInclude(Include.NON_NULL)
  private List<String> freeIps = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("start")
  @JsonInclude(Include.NON_NULL)
  private Integer start = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property end of obj type securechannelavailablelocalips field type str  type integer.
   * @return end
   */
  @VsoMethod
  public Integer getEnd() {
    return end;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property end of obj type securechannelavailablelocalips field type str  type integer.
   * @param end set the end.
   */
  @VsoMethod
  public void setEnd(Integer  end) {
    this.end = end;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property free_controller_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeControllerIps
   */
  @VsoMethod
  public List<String> getFreeControllerIps() {
    return freeControllerIps;
  }

  /**
   * This is the setter method. this will set the freeControllerIps
   * Placeholder for description of property free_controller_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeControllerIps
   */
  @VsoMethod
  public void setFreeControllerIps(List<String>  freeControllerIps) {
    this.freeControllerIps = freeControllerIps;
  }

  /**
   * This is the setter method this will set the freeControllerIps
   * Placeholder for description of property free_controller_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeControllerIps
   */
  @VsoMethod
  public SecureChannelAvailableLocalIPs addFreeControllerIpsItem(String freeControllerIpsItem) {
    if (this.freeControllerIps == null) {
      this.freeControllerIps = new ArrayList<String>();
    }
    this.freeControllerIps.add(freeControllerIpsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property free_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeIps
   */
  @VsoMethod
  public List<String> getFreeIps() {
    return freeIps;
  }

  /**
   * This is the setter method. this will set the freeIps
   * Placeholder for description of property free_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeIps
   */
  @VsoMethod
  public void setFreeIps(List<String>  freeIps) {
    this.freeIps = freeIps;
  }

  /**
   * This is the setter method this will set the freeIps
   * Placeholder for description of property free_ips of obj type securechannelavailablelocalips field type str  type array.
   * @return freeIps
   */
  @VsoMethod
  public SecureChannelAvailableLocalIPs addFreeIpsItem(String freeIpsItem) {
    if (this.freeIps == null) {
      this.freeIps = new ArrayList<String>();
    }
    this.freeIps.add(freeIpsItem);
    return this;
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
   * Placeholder for description of property start of obj type securechannelavailablelocalips field type str  type integer.
   * @return start
   */
  @VsoMethod
  public Integer getStart() {
    return start;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start of obj type securechannelavailablelocalips field type str  type integer.
   * @param start set the start.
   */
  @VsoMethod
  public void setStart(Integer  start) {
    this.start = start;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecureChannelAvailableLocalIPs objSecureChannelAvailableLocalIPs = (SecureChannelAvailableLocalIPs) o;
  return   Objects.equals(this.end, objSecureChannelAvailableLocalIPs.end)&&
  Objects.equals(this.uuid, objSecureChannelAvailableLocalIPs.uuid)&&
  Objects.equals(this.start, objSecureChannelAvailableLocalIPs.start)&&
  Objects.equals(this.freeIps, objSecureChannelAvailableLocalIPs.freeIps)&&
  Objects.equals(this.freeControllerIps, objSecureChannelAvailableLocalIPs.freeControllerIps)&&
  Objects.equals(this.name, objSecureChannelAvailableLocalIPs.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecureChannelAvailableLocalIPs {\n");
      sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    freeControllerIps: ").append(toIndentedString(freeControllerIps)).append("\n");
        sb.append("    freeIps: ").append(toIndentedString(freeIps)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

