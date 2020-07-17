package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.UpgradeOpsParam;
import com.vmware.avi.vro.model.SeGroupStatus;
import com.vmware.avi.vro.model.UpgradeOpsState;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The UpgradeStatusInfo is a POJO class extends AviRestResource that used for creating
 * UpgradeStatusInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UpgradeStatusInfo")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADESTATUSINFO, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UpgradeStatusInfo extends AviRestResource {
  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private Integer duration = null;

  @JsonProperty("enable_patch_rollback")
  @JsonInclude(Include.NON_NULL)
  private Boolean enablePatchRollback = false;

  @JsonProperty("enable_rollback")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableRollback = false;

  @JsonProperty("end_time")
  @JsonInclude(Include.NON_NULL)
  private String endTime = null;

  @JsonProperty("enqueue_time")
  @JsonInclude(Include.NON_NULL)
  private String enqueueTime = null;

  @JsonProperty("image_ref")
  @JsonInclude(Include.NON_NULL)
  private String imageRef = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("node_type")
  @JsonInclude(Include.NON_NULL)
  private String nodeType = null;

  @JsonProperty("obj_cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String objCloudRef = null;

  @JsonProperty("params")
  @JsonInclude(Include.NON_NULL)
  private UpgradeOpsParam params = null;

  @JsonProperty("patch_image_ref")
  @JsonInclude(Include.NON_NULL)
  private String patchImageRef = null;

  @JsonProperty("patch_list")
  @JsonInclude(Include.NON_NULL)
  private List<PatchData> patchList = null;

  @JsonProperty("patch_version")
  @JsonInclude(Include.NON_NULL)
  private String patchVersion = null;

  @JsonProperty("previous_image_ref")
  @JsonInclude(Include.NON_NULL)
  private String previousImageRef = null;

  @JsonProperty("previous_patch_image_ref")
  @JsonInclude(Include.NON_NULL)
  private String previousPatchImageRef = null;

  @JsonProperty("previous_patch_list")
  @JsonInclude(Include.NON_NULL)
  private List<PatchData> previousPatchList = null;

  @JsonProperty("previous_patch_version")
  @JsonInclude(Include.NON_NULL)
  private String previousPatchVersion = null;

  @JsonProperty("previous_version")
  @JsonInclude(Include.NON_NULL)
  private String previousVersion = null;

  @JsonProperty("progress")
  @JsonInclude(Include.NON_NULL)
  private Integer progress = 0;

  @JsonProperty("se_upgrade_events")
  @JsonInclude(Include.NON_NULL)
  private List<SeUpgradeEvents> seUpgradeEvents = null;

  @JsonProperty("seg_status")
  @JsonInclude(Include.NON_NULL)
  private SeGroupStatus segStatus = null;

  @JsonProperty("start_time")
  @JsonInclude(Include.NON_NULL)
  private String startTime = null;

  @JsonProperty("state")
  @JsonInclude(Include.NON_NULL)
  private UpgradeOpsState state = null;

  @JsonProperty("system")
  @JsonInclude(Include.NON_NULL)
  private Boolean system = null;

  @JsonProperty("tasks_completed")
  @JsonInclude(Include.NON_NULL)
  private Integer tasksCompleted = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("total_tasks")
  @JsonInclude(Include.NON_NULL)
  private Integer totalTasks = null;

  @JsonProperty("upgrade_events")
  @JsonInclude(Include.NON_NULL)
  private List<EventMap> upgradeEvents = null;

  @JsonProperty("upgrade_ops")
  @JsonInclude(Include.NON_NULL)
  private String upgradeOps = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("version")
  @JsonInclude(Include.NON_NULL)
  private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Duration of upgrade operation in seconds.
   * Field introduced in 18.2.6.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Duration of upgrade operation in seconds.
   * Field introduced in 18.2.6.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Check if the patch rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enablePatchRollback
   */
  @VsoMethod
  public Boolean getEnablePatchRollback() {
    return enablePatchRollback;
  }

  /**
   * This is the setter method to the attribute.
   * Check if the patch rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enablePatchRollback set the enablePatchRollback.
   */
  @VsoMethod
  public void setEnablePatchRollback(Boolean  enablePatchRollback) {
    this.enablePatchRollback = enablePatchRollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Check if the rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRollback
   */
  @VsoMethod
  public Boolean getEnableRollback() {
    return enableRollback;
  }

  /**
   * This is the setter method to the attribute.
   * Check if the rollback is possible on this node.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRollback set the enableRollback.
   */
  @VsoMethod
  public void setEnableRollback(Boolean  enableRollback) {
    this.enableRollback = enableRollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End time of upgrade operation.
   * Field introduced in 18.2.6.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End time of upgrade operation.
   * Field introduced in 18.2.6.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enqueue time of upgrade operation.
   * Field introduced in 18.2.6.
   * @return enqueueTime
   */
  @VsoMethod
  public String getEnqueueTime() {
    return enqueueTime;
  }

  /**
   * This is the setter method to the attribute.
   * Enqueue time of upgrade operation.
   * Field introduced in 18.2.6.
   * @param enqueueTime set the enqueueTime.
   */
  @VsoMethod
  public void setEnqueueTime(String  enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current base image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @return imageRef
   */
  @VsoMethod
  public String getImageRef() {
    return imageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current base image.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @param imageRef set the imageRef.
   */
  @VsoMethod
  public void setImageRef(String  imageRef) {
    this.imageRef = imageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the system such as cluster name, se group name and se name.
   * Field introduced in 18.2.6.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the system such as cluster name, se group name and se name.
   * Field introduced in 18.2.6.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 18.2.6.
   * @return nodeType
   */
  @VsoMethod
  public String getNodeType() {
    return nodeType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 18.2.6.
   * @param nodeType set the nodeType.
   */
  @VsoMethod
  public void setNodeType(String  nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 18.2.6.
   * @return objCloudRef
   */
  @VsoMethod
  public String getObjCloudRef() {
    return objCloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 18.2.6.
   * @param objCloudRef set the objCloudRef.
   */
  @VsoMethod
  public void setObjCloudRef(String  objCloudRef) {
    this.objCloudRef = objCloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters associated with the upgrade operation.
   * Field introduced in 18.2.6.
   * @return params
   */
  @VsoMethod
  public UpgradeOpsParam getParams() {
    return params;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters associated with the upgrade operation.
   * Field introduced in 18.2.6.
   * @param params set the params.
   */
  @VsoMethod
  public void setParams(UpgradeOpsParam params) {
    this.params = params;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying the current patch.example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1
   * value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @return patchImageRef
   */
  @VsoMethod
  public String getPatchImageRef() {
    return patchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying the current patch.example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1
   * value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @param patchImageRef set the patchImageRef.
   */
  @VsoMethod
  public void setPatchImageRef(String  patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied, this field will indicate the [{'6p1', '6p1_image_uuid'},
   * {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * @return patchList
   */
  @VsoMethod
  public List<PatchData> getPatchList() {
    return patchList;
  }

  /**
   * This is the setter method. this will set the patchList
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied, this field will indicate the [{'6p1', '6p1_image_uuid'},
   * {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * @return patchList
   */
  @VsoMethod
  public void setPatchList(List<PatchData>  patchList) {
    this.patchList = patchList;
  }

  /**
   * This is the setter method this will set the patchList
   * List of patches applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then a patch 6p5 applied, this field will indicate the [{'6p1', '6p1_image_uuid'},
   * {'6p5', '6p5_image_uuid'}] value.
   * Field introduced in 18.2.8, 20.1.1.
   * @return patchList
   */
  @VsoMethod
  public UpgradeStatusInfo addPatchListItem(PatchData patchListItem) {
    if (this.patchList == null) {
      this.patchList = new ArrayList<PatchData>();
    }
    this.patchList.add(patchListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Current patch version applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * @return patchVersion
   */
  @VsoMethod
  public String getPatchVersion() {
    return patchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Current patch version applied to this node.
   * Example  base-image is 18.2.6 and a patch 6p1 is applied, then this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * @param patchVersion set the patchVersion.
   */
  @VsoMethod
  public void setPatchVersion(String  patchVersion) {
    this.patchVersion = patchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying previous base image.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate
   * the 18.2.5 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @return previousImageRef
   */
  @VsoMethod
  public String getPreviousImageRef() {
    return previousImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying previous base image.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate
   * the 18.2.5 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @param previousImageRef set the previousImageRef.
   */
  @VsoMethod
  public void setPreviousImageRef(String  previousImageRef) {
    this.previousImageRef = previousImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image uuid for identifying previous patch.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @return previousPatchImageRef
   */
  @VsoMethod
  public String getPreviousPatchImageRef() {
    return previousPatchImageRef;
  }

  /**
   * This is the setter method to the attribute.
   * Image uuid for identifying previous patch.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * It is a reference to an object of type image.
   * Field introduced in 18.2.6.
   * @param previousPatchImageRef set the previousPatchImageRef.
   */
  @VsoMethod
  public void setPreviousPatchImageRef(String  previousPatchImageRef) {
    this.previousPatchImageRef = previousPatchImageRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * @return previousPatchList
   */
  @VsoMethod
  public List<PatchData> getPreviousPatchList() {
    return previousPatchList;
  }

  /**
   * This is the setter method. this will set the previousPatchList
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * @return previousPatchList
   */
  @VsoMethod
  public void setPreviousPatchList(List<PatchData>  previousPatchList) {
    this.previousPatchList = previousPatchList;
  }

  /**
   * This is the setter method this will set the previousPatchList
   * List of patches applied to this node on previous major version.
   * Field introduced in 18.2.8, 20.1.1.
   * @return previousPatchList
   */
  @VsoMethod
  public UpgradeStatusInfo addPreviousPatchListItem(PatchData previousPatchListItem) {
    if (this.previousPatchList == null) {
      this.previousPatchList = new ArrayList<PatchData>();
    }
    this.previousPatchList.add(previousPatchListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Previous patch version applied to this node.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * @return previousPatchVersion
   */
  @VsoMethod
  public String getPreviousPatchVersion() {
    return previousPatchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Previous patch version applied to this node.example  base-image was 18.2.6 with a patch 6p1.
   * Upgrade was initiated to 18.2.8 with patch 8p1.
   * The previous_image field will contain 18.2.6 and this field will indicate the 6p1 value.
   * Field introduced in 18.2.6.
   * @param previousPatchVersion set the previousPatchVersion.
   */
  @VsoMethod
  public void setPreviousPatchVersion(String  previousPatchVersion) {
    this.previousPatchVersion = previousPatchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Previous version prior to upgrade.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5
   * value.
   * Field introduced in 18.2.6.
   * @return previousVersion
   */
  @VsoMethod
  public String getPreviousVersion() {
    return previousVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Previous version prior to upgrade.example  base-image was 18.2.5 and an upgrade was done to 18.2.6, then this field will indicate the 18.2.5
   * value.
   * Field introduced in 18.2.6.
   * @param previousVersion set the previousVersion.
   */
  @VsoMethod
  public void setPreviousVersion(String  previousVersion) {
    this.previousVersion = previousVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operations progress which holds value between 0-100.
   * Allowed values are 0-100.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public List<SeUpgradeEvents> getSeUpgradeEvents() {
    return seUpgradeEvents;
  }

  /**
   * This is the setter method. this will set the seUpgradeEvents
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public void setSeUpgradeEvents(List<SeUpgradeEvents>  seUpgradeEvents) {
    this.seUpgradeEvents = seUpgradeEvents;
  }

  /**
   * This is the setter method this will set the seUpgradeEvents
   * Serviceenginegroup upgrade errors.
   * Field introduced in 18.2.6.
   * @return seUpgradeEvents
   */
  @VsoMethod
  public UpgradeStatusInfo addSeUpgradeEventsItem(SeUpgradeEvents seUpgradeEventsItem) {
    if (this.seUpgradeEvents == null) {
      this.seUpgradeEvents = new ArrayList<SeUpgradeEvents>();
    }
    this.seUpgradeEvents.add(seUpgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Detailed segroup status.
   * Field introduced in 18.2.6.
   * @return segStatus
   */
  @VsoMethod
  public SeGroupStatus getSegStatus() {
    return segStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed segroup status.
   * Field introduced in 18.2.6.
   * @param segStatus set the segStatus.
   */
  @VsoMethod
  public void setSegStatus(SeGroupStatus segStatus) {
    this.segStatus = segStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start time of upgrade operation.
   * Field introduced in 18.2.6.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start time of upgrade operation.
   * Field introduced in 18.2.6.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current status of the upgrade operation.
   * Field introduced in 18.2.6.
   * @return state
   */
  @VsoMethod
  public UpgradeOpsState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Current status of the upgrade operation.
   * Field introduced in 18.2.6.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(UpgradeOpsState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag is set only in the cluster if the upgrade is initiated as a system-upgrade.
   * Field introduced in 18.2.6.
   * @return system
   */
  @VsoMethod
  public Boolean getSystem() {
    return system;
  }

  /**
   * This is the setter method to the attribute.
   * Flag is set only in the cluster if the upgrade is initiated as a system-upgrade.
   * Field introduced in 18.2.6.
   * @param system set the system.
   */
  @VsoMethod
  public void setSystem(Boolean  system) {
    this.system = system;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Completed set of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * @return tasksCompleted
   */
  @VsoMethod
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  /**
   * This is the setter method to the attribute.
   * Completed set of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * @param tasksCompleted set the tasksCompleted.
   */
  @VsoMethod
  public void setTasksCompleted(Integer  tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * @return totalTasks
   */
  @VsoMethod
  public Integer getTotalTasks() {
    return totalTasks;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of tasks in the upgrade operation.
   * Field introduced in 18.2.6.
   * @param totalTasks set the totalTasks.
   */
  @VsoMethod
  public void setTotalTasks(Integer  totalTasks) {
    this.totalTasks = totalTasks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * @return upgradeEvents
   */
  @VsoMethod
  public List<EventMap> getUpgradeEvents() {
    return upgradeEvents;
  }

  /**
   * This is the setter method. this will set the upgradeEvents
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * @return upgradeEvents
   */
  @VsoMethod
  public void setUpgradeEvents(List<EventMap>  upgradeEvents) {
    this.upgradeEvents = upgradeEvents;
  }

  /**
   * This is the setter method this will set the upgradeEvents
   * Events performed for upgrade operation.
   * Field introduced in 18.2.6.
   * @return upgradeEvents
   */
  @VsoMethod
  public UpgradeStatusInfo addUpgradeEventsItem(EventMap upgradeEventsItem) {
    if (this.upgradeEvents == null) {
      this.upgradeEvents = new ArrayList<EventMap>();
    }
    this.upgradeEvents.add(upgradeEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Upgrade operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME.
   * Field introduced in 18.2.6.
   * @return upgradeOps
   */
  @VsoMethod
  public String getUpgradeOps() {
    return upgradeOps;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade operations requested.
   * Enum options - UPGRADE, PATCH, ROLLBACK, ROLLBACKPATCH, SEGROUP_RESUME.
   * Field introduced in 18.2.6.
   * @param upgradeOps set the upgradeOps.
   */
  @VsoMethod
  public void setUpgradeOps(String  upgradeOps) {
    this.upgradeOps = upgradeOps;
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
   * Uuid identifier for the system such as cluster, se group and se.
   * Field introduced in 18.2.6.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the system such as cluster, se group and se.
   * Field introduced in 18.2.6.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current base image applied to this node.
   * Field introduced in 18.2.6.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Current base image applied to this node.
   * Field introduced in 18.2.6.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
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
  UpgradeStatusInfo objUpgradeStatusInfo = (UpgradeStatusInfo) o;
  return   Objects.equals(this.version, objUpgradeStatusInfo.version)&&
  Objects.equals(this.enablePatchRollback, objUpgradeStatusInfo.enablePatchRollback)&&
  Objects.equals(this.upgradeOps, objUpgradeStatusInfo.upgradeOps)&&
  Objects.equals(this.nodeType, objUpgradeStatusInfo.nodeType)&&
  Objects.equals(this.objCloudRef, objUpgradeStatusInfo.objCloudRef)&&
  Objects.equals(this.duration, objUpgradeStatusInfo.duration)&&
  Objects.equals(this.imageRef, objUpgradeStatusInfo.imageRef)&&
  Objects.equals(this.upgradeEvents, objUpgradeStatusInfo.upgradeEvents)&&
  Objects.equals(this.tasksCompleted, objUpgradeStatusInfo.tasksCompleted)&&
  Objects.equals(this.uuid, objUpgradeStatusInfo.uuid)&&
  Objects.equals(this.previousVersion, objUpgradeStatusInfo.previousVersion)&&
  Objects.equals(this.system, objUpgradeStatusInfo.system)&&
  Objects.equals(this.enqueueTime, objUpgradeStatusInfo.enqueueTime)&&
  Objects.equals(this.previousPatchImageRef, objUpgradeStatusInfo.previousPatchImageRef)&&
  Objects.equals(this.state, objUpgradeStatusInfo.state)&&
  Objects.equals(this.enableRollback, objUpgradeStatusInfo.enableRollback)&&
  Objects.equals(this.params, objUpgradeStatusInfo.params)&&
  Objects.equals(this.seUpgradeEvents, objUpgradeStatusInfo.seUpgradeEvents)&&
  Objects.equals(this.progress, objUpgradeStatusInfo.progress)&&
  Objects.equals(this.previousPatchList, objUpgradeStatusInfo.previousPatchList)&&
  Objects.equals(this.patchList, objUpgradeStatusInfo.patchList)&&
  Objects.equals(this.previousImageRef, objUpgradeStatusInfo.previousImageRef)&&
  Objects.equals(this.startTime, objUpgradeStatusInfo.startTime)&&
  Objects.equals(this.totalTasks, objUpgradeStatusInfo.totalTasks)&&
  Objects.equals(this.name, objUpgradeStatusInfo.name)&&
  Objects.equals(this.segStatus, objUpgradeStatusInfo.segStatus)&&
  Objects.equals(this.patchVersion, objUpgradeStatusInfo.patchVersion)&&
  Objects.equals(this.endTime, objUpgradeStatusInfo.endTime)&&
  Objects.equals(this.patchImageRef, objUpgradeStatusInfo.patchImageRef)&&
  Objects.equals(this.tenantRef, objUpgradeStatusInfo.tenantRef)&&
  Objects.equals(this.previousPatchVersion, objUpgradeStatusInfo.previousPatchVersion);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UpgradeStatusInfo {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    enablePatchRollback: ").append(toIndentedString(enablePatchRollback)).append("\n");
        sb.append("    enableRollback: ").append(toIndentedString(enableRollback)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    enqueueTime: ").append(toIndentedString(enqueueTime)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
        sb.append("    patchList: ").append(toIndentedString(patchList)).append("\n");
        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
        sb.append("    previousImageRef: ").append(toIndentedString(previousImageRef)).append("\n");
        sb.append("    previousPatchImageRef: ").append(toIndentedString(previousPatchImageRef)).append("\n");
        sb.append("    previousPatchList: ").append(toIndentedString(previousPatchList)).append("\n");
        sb.append("    previousPatchVersion: ").append(toIndentedString(previousPatchVersion)).append("\n");
        sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    seUpgradeEvents: ").append(toIndentedString(seUpgradeEvents)).append("\n");
        sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
        sb.append("    upgradeEvents: ").append(toIndentedString(upgradeEvents)).append("\n");
        sb.append("    upgradeOps: ").append(toIndentedString(upgradeOps)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

