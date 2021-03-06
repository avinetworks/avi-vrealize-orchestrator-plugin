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
 * The VcenterDatastore is a POJO class extends AviRestResource that used for creating
 * VcenterDatastore.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterDatastore")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERDATASTORE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterDatastore extends AviRestResource {
    @JsonProperty("datastore_name")
    @JsonInclude(Include.NON_NULL)
    private String datastoreName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property datastore_name of obj type vcenterdatastore field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datastoreName
   */
  @VsoMethod
  public String getDatastoreName() {
    return datastoreName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property datastore_name of obj type vcenterdatastore field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param datastoreName set the datastoreName.
   */
  @VsoMethod
  public void setDatastoreName(String  datastoreName) {
    this.datastoreName = datastoreName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterDatastore objVcenterDatastore = (VcenterDatastore) o;
  return   Objects.equals(this.datastoreName, objVcenterDatastore.datastoreName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterDatastore {\n");
      sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
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

