package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The StaticRoute is a POJO class extends AviRestResource that used for creating
 * StaticRoute.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StaticRoute")
@VsoFinder(name = Constants.FINDER_VRO_STATICROUTE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StaticRoute extends AviRestResource {
  @JsonProperty("disable_gateway_monitor")
  @JsonInclude(Include.NON_NULL)
  private Boolean disableGatewayMonitor = null;

  @JsonProperty("if_name")
  @JsonInclude(Include.NON_NULL)
  private String ifName = null;

  @JsonProperty("next_hop")
  @JsonInclude(Include.NON_NULL)
  private IpAddr nextHop = null;

  @JsonProperty("prefix")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix prefix = null;

  @JsonProperty("route_id")
  @JsonInclude(Include.NON_NULL)
  private String routeId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Disable the gateway monitor for default gateway.
   * They are monitored by default.
   * Field introduced in 17.1.1.
   * @return disableGatewayMonitor
   */
  @VsoMethod
  public Boolean getDisableGatewayMonitor() {
    return disableGatewayMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Disable the gateway monitor for default gateway.
   * They are monitored by default.
   * Field introduced in 17.1.1.
   * @param disableGatewayMonitor set the disableGatewayMonitor.
   */
  @VsoMethod
  public void setDisableGatewayMonitor(Boolean  disableGatewayMonitor) {
    this.disableGatewayMonitor = disableGatewayMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property if_name of obj type staticroute field type str  type string.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property if_name of obj type staticroute field type str  type string.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property next_hop of obj type staticroute field type str  type ref.
   * @return nextHop
   */
  @VsoMethod
  public IpAddr getNextHop() {
    return nextHop;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property next_hop of obj type staticroute field type str  type ref.
   * @param nextHop set the nextHop.
   */
  @VsoMethod
  public void setNextHop(IpAddr nextHop) {
    this.nextHop = nextHop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property prefix of obj type staticroute field type str  type ref.
   * @return prefix
   */
  @VsoMethod
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property prefix of obj type staticroute field type str  type ref.
   * @param prefix set the prefix.
   */
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property route_id of obj type staticroute field type str  type string.
   * @return routeId
   */
  @VsoMethod
  public String getRouteId() {
    return routeId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property route_id of obj type staticroute field type str  type string.
   * @param routeId set the routeId.
   */
  @VsoMethod
  public void setRouteId(String  routeId) {
    this.routeId = routeId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  StaticRoute objStaticRoute = (StaticRoute) o;
  return   Objects.equals(this.routeId, objStaticRoute.routeId)&&
  Objects.equals(this.prefix, objStaticRoute.prefix)&&
  Objects.equals(this.nextHop, objStaticRoute.nextHop)&&
  Objects.equals(this.ifName, objStaticRoute.ifName)&&
  Objects.equals(this.disableGatewayMonitor, objStaticRoute.disableGatewayMonitor);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StaticRoute {\n");
      sb.append("    disableGatewayMonitor: ").append(toIndentedString(disableGatewayMonitor)).append("\n");
        sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
        sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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
