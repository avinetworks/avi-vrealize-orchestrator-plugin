package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPRewriteLocHdrAction;
import com.vmware.avi.vro.model.ResponseMatchTarget;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPResponseRule is a POJO class extends AviRestResource that used for creating
 * HTTPResponseRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPResponseRule")
@VsoFinder(name = Constants.FINDER_VRO_HTTPRESPONSERULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPResponseRule extends AviRestResource {
  @JsonProperty("all_headers")
  @JsonInclude(Include.NON_NULL)
  private Boolean allHeaders = null;

  @JsonProperty("enable")
  @JsonInclude(Include.NON_NULL)
  private Boolean enable = true;

  @JsonProperty("hdr_action")
  @JsonInclude(Include.NON_NULL)
  private List<HTTPHdrAction> hdrAction = null;

  @JsonProperty("index")
  @JsonInclude(Include.NON_NULL)
  private Integer index = null;

  @JsonProperty("loc_hdr_action")
  @JsonInclude(Include.NON_NULL)
  private HTTPRewriteLocHdrAction locHdrAction = null;

  @JsonProperty("log")
  @JsonInclude(Include.NON_NULL)
  private Boolean log = null;

  @JsonProperty("match")
  @JsonInclude(Include.NON_NULL)
  private ResponseMatchTarget match = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Log all http headers upon rule match.
   * @return allHeaders
   */
  @VsoMethod
  public Boolean getAllHeaders() {
    return allHeaders;
  }

  /**
   * This is the setter method to the attribute.
   * Log all http headers upon rule match.
   * @param allHeaders set the allHeaders.
   */
  @VsoMethod
  public void setAllHeaders(Boolean  allHeaders) {
    this.allHeaders = allHeaders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the rule.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http header rewrite action.
   * @return hdrAction
   */
  @VsoMethod
  public List<HTTPHdrAction> getHdrAction() {
    return hdrAction;
  }

  /**
   * This is the setter method. this will set the hdrAction
   * Http header rewrite action.
   * @return hdrAction
   */
  @VsoMethod
  public void setHdrAction(List<HTTPHdrAction>  hdrAction) {
    this.hdrAction = hdrAction;
  }

  /**
   * This is the setter method this will set the hdrAction
   * Http header rewrite action.
   * @return hdrAction
   */
  @VsoMethod
  public HTTPResponseRule addHdrActionItem(HTTPHdrAction hdrActionItem) {
    if (this.hdrAction == null) {
      this.hdrAction = new ArrayList<HTTPHdrAction>();
    }
    this.hdrAction.add(hdrActionItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Index of the rule.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the rule.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Location header rewrite action.
   * @return locHdrAction
   */
  @VsoMethod
  public HTTPRewriteLocHdrAction getLocHdrAction() {
    return locHdrAction;
  }

  /**
   * This is the setter method to the attribute.
   * Location header rewrite action.
   * @param locHdrAction set the locHdrAction.
   */
  @VsoMethod
  public void setLocHdrAction(HTTPRewriteLocHdrAction locHdrAction) {
    this.locHdrAction = locHdrAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log http request upon rule match.
   * @return log
   */
  @VsoMethod
  public Boolean getLog() {
    return log;
  }

  /**
   * This is the setter method to the attribute.
   * Log http request upon rule match.
   * @param log set the log.
   */
  @VsoMethod
  public void setLog(Boolean  log) {
    this.log = log;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Add match criteria to the rule.
   * @return match
   */
  @VsoMethod
  public ResponseMatchTarget getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Add match criteria to the rule.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(ResponseMatchTarget match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rule.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rule.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPResponseRule objHTTPResponseRule = (HTTPResponseRule) o;
  return   Objects.equals(this.index, objHTTPResponseRule.index)&&
  Objects.equals(this.enable, objHTTPResponseRule.enable)&&
  Objects.equals(this.name, objHTTPResponseRule.name)&&
  Objects.equals(this.locHdrAction, objHTTPResponseRule.locHdrAction)&&
  Objects.equals(this.hdrAction, objHTTPResponseRule.hdrAction)&&
  Objects.equals(this.allHeaders, objHTTPResponseRule.allHeaders)&&
  Objects.equals(this.match, objHTTPResponseRule.match)&&
  Objects.equals(this.log, objHTTPResponseRule.log);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPResponseRule {\n");
      sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    hdrAction: ").append(toIndentedString(hdrAction)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    locHdrAction: ").append(toIndentedString(locHdrAction)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
