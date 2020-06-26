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
 * The ParamSizeClass is a POJO class extends AviRestResource that used for creating
 * ParamSizeClass.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ParamSizeClass")
@VsoFinder(name = Constants.FINDER_VRO_PARAMSIZECLASS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ParamSizeClass extends AviRestResource {
  @JsonProperty("hits")
  @JsonInclude(Include.NON_NULL)
  private Integer hits = null;

  @JsonProperty("len")
  @JsonInclude(Include.NON_NULL)
  private String len = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property hits of obj type paramsizeclass field type str  type integer.
   * @return hits
   */
  @VsoMethod
  public Integer getHits() {
    return hits;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property hits of obj type paramsizeclass field type str  type integer.
   * @param hits set the hits.
   */
  @VsoMethod
  public void setHits(Integer  hits) {
    this.hits = hits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED.
   * @return len
   */
  @VsoMethod
  public String getLen() {
    return len;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - EMPTY, SMALL, MEDIUM, LARGE, UNLIMITED.
   * @param len set the len.
   */
  @VsoMethod
  public void setLen(String  len) {
    this.len = len;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ParamSizeClass objParamSizeClass = (ParamSizeClass) o;
  return   Objects.equals(this.hits, objParamSizeClass.hits)&&
  Objects.equals(this.len, objParamSizeClass.len);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ParamSizeClass {\n");
      sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
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
