package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GCPSeGroupConfig;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.ObjSyncConfig;
import com.vmware.avi.vro.model.MetricsRealTimeUpdate;
import com.vmware.avi.vro.model.DosThresholdProfile;
import com.vmware.avi.vro.model.SeGroupAnalyticsPolicy;
import com.vmware.avi.vro.model.RateLimiterProperties;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.avi.vro.model.VcenterClusters;
import com.vmware.avi.vro.model.VcenterHosts;
import com.vmware.avi.vro.model.VipAutoscaleGroup;
import com.vmware.avi.vro.model.VssPlacement;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServiceEngineGroup is a POJO class extends AviRestResource that used for creating
 * ServiceEngineGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceEngineGroup")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINEGROUP, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceEngineGroup extends AviRestResource {
    @JsonProperty("accelerated_networking")
    @JsonInclude(Include.NON_NULL)
    private Boolean acceleratedNetworking = null;

    @JsonProperty("active_standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean activeStandby = false;

    @JsonProperty("additional_config_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer additionalConfigMemory;

    @JsonProperty("advertise_backend_networks")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseBackendNetworks;

    @JsonProperty("aggressive_failure_detection")
    @JsonInclude(Include.NON_NULL)
    private Boolean aggressiveFailureDetection = false;

    @JsonProperty("algo")
    @JsonInclude(Include.NON_NULL)
    private String algo = "PLACEMENT_ALGO_PACKED";

    @JsonProperty("allow_burst")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowBurst = null;

    @JsonProperty("app_cache_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer appCachePercent = 10;

    @JsonProperty("app_cache_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer appCacheThreshold = 5;

    @JsonProperty("app_learning_memory_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer appLearningMemoryPercent = 0;

    @JsonProperty("archive_shm_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer archiveShmLimit = 8;

    @JsonProperty("async_ssl")
    @JsonInclude(Include.NON_NULL)
    private Boolean asyncSsl = false;

    @JsonProperty("async_ssl_threads")
    @JsonInclude(Include.NON_NULL)
    private Integer asyncSslThreads = 1;

    @JsonProperty("auto_rebalance")
    @JsonInclude(Include.NON_NULL)
    private Boolean autoRebalance = false;

    @JsonProperty("auto_rebalance_capacity_per_se")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> autoRebalanceCapacityPerSe = null;

    @JsonProperty("auto_rebalance_criteria")
    @JsonInclude(Include.NON_NULL)
    private List<String> autoRebalanceCriteria = null;

    @JsonProperty("auto_rebalance_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer autoRebalanceInterval = 300;

    @JsonProperty("auto_redistribute_active_standby_load")
    @JsonInclude(Include.NON_NULL)
    private Boolean autoRedistributeActiveStandbyLoad = false;

    @JsonProperty("availability_zone_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> availabilityZoneRefs = null;

    @JsonProperty("bgp_state_update_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer bgpStateUpdateInterval = 60;

    @JsonProperty("buffer_se")
    @JsonInclude(Include.NON_NULL)
    private Integer bufferSe = 1;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef = null;

    @JsonProperty("compress_ip_rules_for_each_ns_subnet")
    @JsonInclude(Include.NON_NULL)
    private Boolean compressIpRulesForEachNsSubnet = true;

    @JsonProperty("config_debugs_on_all_cores")
    @JsonInclude(Include.NON_NULL)
    private Boolean configDebugsOnAllCores = false;

    @JsonProperty("connection_memory_percentage")
    @JsonInclude(Include.NON_NULL)
    private Integer connectionMemoryPercentage = 50;

    @JsonProperty("core_shm_app_cache")
    @JsonInclude(Include.NON_NULL)
    private Boolean coreShmAppCache = false;

    @JsonProperty("core_shm_app_learning")
    @JsonInclude(Include.NON_NULL)
    private Boolean coreShmAppLearning = false;

    @JsonProperty("cpu_reserve")
    @JsonInclude(Include.NON_NULL)
    private Boolean cpuReserve = false;

    @JsonProperty("cpu_socket_affinity")
    @JsonInclude(Include.NON_NULL)
    private Boolean cpuSocketAffinity = false;

    @JsonProperty("custom_securitygroups_data")
    @JsonInclude(Include.NON_NULL)
    private List<String> customSecuritygroupsData = null;

    @JsonProperty("custom_securitygroups_mgmt")
    @JsonInclude(Include.NON_NULL)
    private List<String> customSecuritygroupsMgmt = null;

    @JsonProperty("custom_tag")
    @JsonInclude(Include.NON_NULL)
    private List<CustomTag> customTag = null;

    @JsonProperty("data_network_id")
    @JsonInclude(Include.NON_NULL)
    private String dataNetworkId = null;

    @JsonProperty("datascript_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer datascriptTimeout = 1000000;

    @JsonProperty("dedicated_dispatcher_core")
    @JsonInclude(Include.NON_NULL)
    private Boolean dedicatedDispatcherCore = false;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("disable_avi_securitygroups")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableAviSecuritygroups = false;

    @JsonProperty("disable_csum_offloads")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableCsumOffloads = false;

    @JsonProperty("disable_flow_probes")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableFlowProbes = false;

    @JsonProperty("disable_gro")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableGro = true;

    @JsonProperty("disable_se_memory_check")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableSeMemoryCheck = false;

    @JsonProperty("disable_tso")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableTso = false;

    @JsonProperty("disk_per_se")
    @JsonInclude(Include.NON_NULL)
    private Integer diskPerSe = 15;

    @JsonProperty("distribute_load_active_standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean distributeLoadActiveStandby = false;

    @JsonProperty("distribute_queues")
    @JsonInclude(Include.NON_NULL)
    private Boolean distributeQueues = false;

    @JsonProperty("distribute_vnics")
    @JsonInclude(Include.NON_NULL)
    private Boolean distributeVnics = false;

    @JsonProperty("dp_aggressive_hb_frequency")
    @JsonInclude(Include.NON_NULL)
    private Integer dpAggressiveHbFrequency = 100;

    @JsonProperty("dp_aggressive_hb_timeout_count")
    @JsonInclude(Include.NON_NULL)
    private Integer dpAggressiveHbTimeoutCount = 10;

    @JsonProperty("dp_hb_frequency")
    @JsonInclude(Include.NON_NULL)
    private Integer dpHbFrequency = 100;

    @JsonProperty("dp_hb_timeout_count")
    @JsonInclude(Include.NON_NULL)
    private Integer dpHbTimeoutCount = 10;

    @JsonProperty("enable_gratarp_permanent")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableGratarpPermanent = false;

    @JsonProperty("enable_hsm_priming")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableHsmPriming = false;

    @JsonProperty("enable_multi_lb")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableMultiLb = false;

    @JsonProperty("enable_pcap_tx_ring")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePcapTxRing = null;

    @JsonProperty("enable_routing")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRouting;

    @JsonProperty("enable_vip_on_all_interfaces")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVipOnAllInterfaces;

    @JsonProperty("enable_vmac")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVmac;

    @JsonProperty("ephemeral_portrange_end")
    @JsonInclude(Include.NON_NULL)
    private Integer ephemeralPortrangeEnd = null;

    @JsonProperty("ephemeral_portrange_start")
    @JsonInclude(Include.NON_NULL)
    private Integer ephemeralPortrangeStart = null;

    @JsonProperty("extra_config_multiplier")
    @JsonInclude(Include.NON_NULL)
    private Float extraConfigMultiplier = 0.0f;

    @JsonProperty("extra_shared_config_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer extraSharedConfigMemory = 0;

    @JsonProperty("floating_intf_ip")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp;

    @JsonProperty("floating_intf_ip_se_2")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIpSe2;

    @JsonProperty("flow_table_new_syn_max_entries")
    @JsonInclude(Include.NON_NULL)
    private Integer flowTableNewSynMaxEntries = 0;

    @JsonProperty("free_list_size")
    @JsonInclude(Include.NON_NULL)
    private Integer freeListSize = 1024;

    @JsonProperty("gcp_config")
    @JsonInclude(Include.NON_NULL)
    private GCPSeGroupConfig gcpConfig = null;

    @JsonProperty("gratarp_permanent_periodicity")
    @JsonInclude(Include.NON_NULL)
    private Integer gratarpPermanentPeriodicity = 10;

    @JsonProperty("ha_mode")
    @JsonInclude(Include.NON_NULL)
    private String haMode = "HA_MODE_SHARED";

    @JsonProperty("handle_per_pkt_attack")
    @JsonInclude(Include.NON_NULL)
    private Boolean handlePerPktAttack = true;

    @JsonProperty("hardwaresecuritymodulegroup_ref")
    @JsonInclude(Include.NON_NULL)
    private String hardwaresecuritymodulegroupRef = null;

    @JsonProperty("heap_minimum_config_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer heapMinimumConfigMemory = 8;

    @JsonProperty("hm_on_standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean hmOnStandby = true;

    @JsonProperty("host_attribute_key")
    @JsonInclude(Include.NON_NULL)
    private String hostAttributeKey = null;

    @JsonProperty("host_attribute_value")
    @JsonInclude(Include.NON_NULL)
    private String hostAttributeValue = null;

    @JsonProperty("host_gateway_monitor")
    @JsonInclude(Include.NON_NULL)
    private Boolean hostGatewayMonitor = false;

    @JsonProperty("hypervisor")
    @JsonInclude(Include.NON_NULL)
    private String hypervisor = null;

    @JsonProperty("ignore_rtt_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer ignoreRttThreshold = 5000;

    @JsonProperty("ingress_access_data")
    @JsonInclude(Include.NON_NULL)
    private String ingressAccessData = "SG_INGRESS_ACCESS_ALL";

    @JsonProperty("ingress_access_mgmt")
    @JsonInclude(Include.NON_NULL)
    private String ingressAccessMgmt = "SG_INGRESS_ACCESS_ALL";

    @JsonProperty("instance_flavor")
    @JsonInclude(Include.NON_NULL)
    private String instanceFlavor = null;

    @JsonProperty("iptables")
    @JsonInclude(Include.NON_NULL)
    private List<IptableRuleSet> iptables = null;

    @JsonProperty("labels")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> labels = null;

    @JsonProperty("least_load_core_selection")
    @JsonInclude(Include.NON_NULL)
    private Boolean leastLoadCoreSelection = true;

    @JsonProperty("license_tier")
    @JsonInclude(Include.NON_NULL)
    private String licenseTier = null;

    @JsonProperty("license_type")
    @JsonInclude(Include.NON_NULL)
    private String licenseType = null;

    @JsonProperty("log_disksz")
    @JsonInclude(Include.NON_NULL)
    private Integer logDisksz = 10000;

    @JsonProperty("log_malloc_failure")
    @JsonInclude(Include.NON_NULL)
    private Boolean logMallocFailure = true;

    @JsonProperty("max_concurrent_external_hm")
    @JsonInclude(Include.NON_NULL)
    private Integer maxConcurrentExternalHm = null;

    @JsonProperty("max_cpu_usage")
    @JsonInclude(Include.NON_NULL)
    private Integer maxCpuUsage = 80;

    @JsonProperty("max_memory_per_mempool")
    @JsonInclude(Include.NON_NULL)
    private Integer maxMemoryPerMempool = 64;

    @JsonProperty("max_num_se_dps")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNumSeDps = null;

    @JsonProperty("max_public_ips_per_lb")
    @JsonInclude(Include.NON_NULL)
    private Integer maxPublicIpsPerLb = 30;

    @JsonProperty("max_queues_per_vnic")
    @JsonInclude(Include.NON_NULL)
    private Integer maxQueuesPerVnic = 1;

    @JsonProperty("max_rules_per_lb")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRulesPerLb = 150;

    @JsonProperty("max_scaleout_per_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer maxScaleoutPerVs = 4;

    @JsonProperty("max_se")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSe = 10;

    @JsonProperty("max_vs_per_se")
    @JsonInclude(Include.NON_NULL)
    private Integer maxVsPerSe = 10;

    @JsonProperty("mem_reserve")
    @JsonInclude(Include.NON_NULL)
    private Boolean memReserve = true;

    @JsonProperty("memory_for_config_update")
    @JsonInclude(Include.NON_NULL)
    private Integer memoryForConfigUpdate = 15;

    @JsonProperty("memory_per_se")
    @JsonInclude(Include.NON_NULL)
    private Integer memoryPerSe = 2048;

    @JsonProperty("mgmt_network_ref")
    @JsonInclude(Include.NON_NULL)
    private String mgmtNetworkRef = null;

    @JsonProperty("mgmt_subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix mgmtSubnet = null;

    @JsonProperty("min_cpu_usage")
    @JsonInclude(Include.NON_NULL)
    private Integer minCpuUsage = 30;

    @JsonProperty("min_scaleout_per_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer minScaleoutPerVs = 1;

    @JsonProperty("min_se")
    @JsonInclude(Include.NON_NULL)
    private Integer minSe = 1;

    @JsonProperty("minimum_connection_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer minimumConnectionMemory = 20;

    @JsonProperty("minimum_required_config_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer minimumRequiredConfigMemory;

    @JsonProperty("n_log_streaming_threads")
    @JsonInclude(Include.NON_NULL)
    private Integer nLogStreamingThreads = 1;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nat_flow_tcp_closed_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowTcpClosedTimeout;

    @JsonProperty("nat_flow_tcp_established_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowTcpEstablishedTimeout;

    @JsonProperty("nat_flow_tcp_half_closed_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowTcpHalfClosedTimeout;

    @JsonProperty("nat_flow_tcp_handshake_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowTcpHandshakeTimeout;

    @JsonProperty("nat_flow_udp_noresponse_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowUdpNoresponseTimeout;

    @JsonProperty("nat_flow_udp_response_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer natFlowUdpResponseTimeout;

    @JsonProperty("non_significant_log_throttle")
    @JsonInclude(Include.NON_NULL)
    private Integer nonSignificantLogThrottle = 100;

    @JsonProperty("num_dispatcher_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer numDispatcherCores = 0;

    @JsonProperty("num_flow_cores_sum_changes_to_ignore")
    @JsonInclude(Include.NON_NULL)
    private Integer numFlowCoresSumChangesToIgnore = 8;

    @JsonProperty("objsync_config")
    @JsonInclude(Include.NON_NULL)
    private ObjSyncConfig objsyncConfig = null;

    @JsonProperty("objsync_port")
    @JsonInclude(Include.NON_NULL)
    private Integer objsyncPort = 9001;

    @JsonProperty("openstack_availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String openstackAvailabilityZone;

    @JsonProperty("openstack_availability_zones")
    @JsonInclude(Include.NON_NULL)
    private List<String> openstackAvailabilityZones = null;

    @JsonProperty("openstack_mgmt_network_name")
    @JsonInclude(Include.NON_NULL)
    private String openstackMgmtNetworkName = null;

    @JsonProperty("openstack_mgmt_network_uuid")
    @JsonInclude(Include.NON_NULL)
    private String openstackMgmtNetworkUuid = null;

    @JsonProperty("os_reserved_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer osReservedMemory = 0;

    @JsonProperty("pcap_tx_mode")
    @JsonInclude(Include.NON_NULL)
    private String pcapTxMode = "PCAP_TX_AUTO";

    @JsonProperty("pcap_tx_ring_rd_balancing_factor")
    @JsonInclude(Include.NON_NULL)
    private Integer pcapTxRingRdBalancingFactor = 10;

    @JsonProperty("per_app")
    @JsonInclude(Include.NON_NULL)
    private Boolean perApp = false;

    @JsonProperty("per_vs_admission_control")
    @JsonInclude(Include.NON_NULL)
    private Boolean perVsAdmissionControl = false;

    @JsonProperty("placement_mode")
    @JsonInclude(Include.NON_NULL)
    private String placementMode = "PLACEMENT_MODE_AUTO";

    @JsonProperty("realtime_se_metrics")
    @JsonInclude(Include.NON_NULL)
    private MetricsRealTimeUpdate realtimeSeMetrics = null;

    @JsonProperty("reboot_on_panic")
    @JsonInclude(Include.NON_NULL)
    private Boolean rebootOnPanic = true;

    @JsonProperty("reboot_on_stop")
    @JsonInclude(Include.NON_NULL)
    private Boolean rebootOnStop;

    @JsonProperty("resync_time_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer resyncTimeInterval = 65536;

    @JsonProperty("se_bandwidth_type")
    @JsonInclude(Include.NON_NULL)
    private String seBandwidthType = null;

    @JsonProperty("se_delayed_flow_delete")
    @JsonInclude(Include.NON_NULL)
    private Boolean seDelayedFlowDelete = true;

    @JsonProperty("se_deprovision_delay")
    @JsonInclude(Include.NON_NULL)
    private Integer seDeprovisionDelay = 120;

    @JsonProperty("se_dos_profile")
    @JsonInclude(Include.NON_NULL)
    private DosThresholdProfile seDosProfile = null;

    @JsonProperty("se_dp_hm_drops")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpHmDrops = 0;

    @JsonProperty("se_dp_isolation")
    @JsonInclude(Include.NON_NULL)
    private Boolean seDpIsolation = false;

    @JsonProperty("se_dp_isolation_num_non_dp_cpus")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpIsolationNumNonDpCpus = 0;

    @JsonProperty("se_dp_max_hb_version")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpMaxHbVersion = 2;

    @JsonProperty("se_dp_vnic_queue_stall_event_sleep")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpVnicQueueStallEventSleep = 0;

    @JsonProperty("se_dp_vnic_queue_stall_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpVnicQueueStallThreshold = 2000;

    @JsonProperty("se_dp_vnic_queue_stall_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpVnicQueueStallTimeout = 10000;

    @JsonProperty("se_dp_vnic_restart_on_queue_stall_count")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpVnicRestartOnQueueStallCount = 3;

    @JsonProperty("se_dp_vnic_stall_se_restart_window")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpVnicStallSeRestartWindow = 3600;

    @JsonProperty("se_dpdk_pmd")
    @JsonInclude(Include.NON_NULL)
    private Integer seDpdkPmd = 0;

    @JsonProperty("se_flow_probe_retries")
    @JsonInclude(Include.NON_NULL)
    private Integer seFlowProbeRetries = 2;

    @JsonProperty("se_flow_probe_retry_timer")
    @JsonInclude(Include.NON_NULL)
    private Integer seFlowProbeRetryTimer = 40;

    @JsonProperty("se_flow_probe_timer")
    @JsonInclude(Include.NON_NULL)
    private Integer seFlowProbeTimer;

    @JsonProperty("se_group_analytics_policy")
    @JsonInclude(Include.NON_NULL)
    private SeGroupAnalyticsPolicy seGroupAnalyticsPolicy = null;

    @JsonProperty("se_hyperthreaded_mode")
    @JsonInclude(Include.NON_NULL)
    private String seHyperthreadedMode = "SE_CPU_HT_AUTO";

    @JsonProperty("se_ip_encap_ipc")
    @JsonInclude(Include.NON_NULL)
    private Integer seIpEncapIpc = 0;

    @JsonProperty("se_ipc_udp_port")
    @JsonInclude(Include.NON_NULL)
    private Integer seIpcUdpPort;

    @JsonProperty("se_kni_burst_factor")
    @JsonInclude(Include.NON_NULL)
    private Integer seKniBurstFactor = 0;

    @JsonProperty("se_l3_encap_ipc")
    @JsonInclude(Include.NON_NULL)
    private Integer seL3EncapIpc = 0;

    @JsonProperty("se_lro")
    @JsonInclude(Include.NON_NULL)
    private Boolean seLro = true;

    @JsonProperty("se_mp_ring_retry_count")
    @JsonInclude(Include.NON_NULL)
    private Integer seMpRingRetryCount = 500;

    @JsonProperty("se_mtu")
    @JsonInclude(Include.NON_NULL)
    private Integer seMtu = null;

    @JsonProperty("se_name_prefix")
    @JsonInclude(Include.NON_NULL)
    private String seNamePrefix = "Avi";

    @JsonProperty("se_pcap_lookahead")
    @JsonInclude(Include.NON_NULL)
    private Boolean sePcapLookahead = false;

    @JsonProperty("se_pcap_pkt_count")
    @JsonInclude(Include.NON_NULL)
    private Integer sePcapPktCount = 0;

    @JsonProperty("se_pcap_pkt_sz")
    @JsonInclude(Include.NON_NULL)
    private Integer sePcapPktSz = 69632;

    @JsonProperty("se_pcap_qdisc_bypass")
    @JsonInclude(Include.NON_NULL)
    private Boolean sePcapQdiscBypass = true;

    @JsonProperty("se_pcap_reinit_frequency")
    @JsonInclude(Include.NON_NULL)
    private Integer sePcapReinitFrequency = 0;

    @JsonProperty("se_pcap_reinit_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer sePcapReinitThreshold = 0;

    @JsonProperty("se_probe_port")
    @JsonInclude(Include.NON_NULL)
    private Integer seProbePort = 7;

    @JsonProperty("se_remote_punt_udp_port")
    @JsonInclude(Include.NON_NULL)
    private Integer seRemotePuntUdpPort;

    @JsonProperty("se_rl_prop")
    @JsonInclude(Include.NON_NULL)
    private RateLimiterProperties seRlProp = null;

    @JsonProperty("se_routing")
    @JsonInclude(Include.NON_NULL)
    private Boolean seRouting;

    @JsonProperty("se_rum_sampling_nav_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer seRumSamplingNavInterval = 1;

    @JsonProperty("se_rum_sampling_nav_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer seRumSamplingNavPercent = 1;

    @JsonProperty("se_rum_sampling_res_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer seRumSamplingResInterval = 2;

    @JsonProperty("se_rum_sampling_res_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer seRumSamplingResPercent = 100;

    @JsonProperty("se_sb_dedicated_core")
    @JsonInclude(Include.NON_NULL)
    private Boolean seSbDedicatedCore = false;

    @JsonProperty("se_sb_threads")
    @JsonInclude(Include.NON_NULL)
    private Integer seSbThreads = 1;

    @JsonProperty("se_thread_multiplier")
    @JsonInclude(Include.NON_NULL)
    private Integer seThreadMultiplier = 1;

    @JsonProperty("se_tracert_port_range")
    @JsonInclude(Include.NON_NULL)
    private PortRange seTracertPortRange = null;

    @JsonProperty("se_tunnel_mode")
    @JsonInclude(Include.NON_NULL)
    private Integer seTunnelMode = 0;

    @JsonProperty("se_tunnel_udp_port")
    @JsonInclude(Include.NON_NULL)
    private Integer seTunnelUdpPort = 1550;

    @JsonProperty("se_tx_batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seTxBatchSize = 64;

    @JsonProperty("se_txq_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer seTxqThreshold = 2048;

    @JsonProperty("se_udp_encap_ipc")
    @JsonInclude(Include.NON_NULL)
    private Integer seUdpEncapIpc = 0;

    @JsonProperty("se_use_dpdk")
    @JsonInclude(Include.NON_NULL)
    private Integer seUseDpdk = 0;

    @JsonProperty("se_vnic_tx_sw_queue_flush_frequency")
    @JsonInclude(Include.NON_NULL)
    private Integer seVnicTxSwQueueFlushFrequency = 0;

    @JsonProperty("se_vnic_tx_sw_queue_size")
    @JsonInclude(Include.NON_NULL)
    private Integer seVnicTxSwQueueSize = 256;

    @JsonProperty("se_vs_hb_max_pkts_in_batch")
    @JsonInclude(Include.NON_NULL)
    private Integer seVsHbMaxPktsInBatch = 64;

    @JsonProperty("se_vs_hb_max_vs_in_pkt")
    @JsonInclude(Include.NON_NULL)
    private Integer seVsHbMaxVsInPkt = 256;

    @JsonProperty("self_se_election")
    @JsonInclude(Include.NON_NULL)
    private Boolean selfSeElection = false;

    @JsonProperty("service_ip6_subnets")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrPrefix> serviceIp6Subnets = null;

    @JsonProperty("service_ip_subnets")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrPrefix> serviceIpSubnets = null;

    @JsonProperty("shm_minimum_config_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer shmMinimumConfigMemory = 4;

    @JsonProperty("significant_log_throttle")
    @JsonInclude(Include.NON_NULL)
    private Integer significantLogThrottle = 100;

    @JsonProperty("ssl_preprocess_sni_hostname")
    @JsonInclude(Include.NON_NULL)
    private Boolean sslPreprocessSniHostname = true;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("transient_shared_memory_max")
    @JsonInclude(Include.NON_NULL)
    private Integer transientSharedMemoryMax = 30;

    @JsonProperty("udf_log_throttle")
    @JsonInclude(Include.NON_NULL)
    private Integer udfLogThrottle = 100;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("use_hyperthreaded_cores")
    @JsonInclude(Include.NON_NULL)
    private Boolean useHyperthreadedCores = true;

    @JsonProperty("use_objsync")
    @JsonInclude(Include.NON_NULL)
    private Boolean useObjsync = true;

    @JsonProperty("use_standard_alb")
    @JsonInclude(Include.NON_NULL)
    private Boolean useStandardAlb = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vcenter_clusters")
    @JsonInclude(Include.NON_NULL)
    private VcenterClusters vcenterClusters = null;

    @JsonProperty("vcenter_datastore_mode")
    @JsonInclude(Include.NON_NULL)
    private String vcenterDatastoreMode = "VCENTER_DATASTORE_ANY";

    @JsonProperty("vcenter_datastores")
    @JsonInclude(Include.NON_NULL)
    private List<VcenterDatastore> vcenterDatastores = null;

    @JsonProperty("vcenter_datastores_include")
    @JsonInclude(Include.NON_NULL)
    private Boolean vcenterDatastoresInclude = false;

    @JsonProperty("vcenter_folder")
    @JsonInclude(Include.NON_NULL)
    private String vcenterFolder = "AviSeFolder";

    @JsonProperty("vcenter_hosts")
    @JsonInclude(Include.NON_NULL)
    private VcenterHosts vcenterHosts = null;

    @JsonProperty("vcenters")
    @JsonInclude(Include.NON_NULL)
    private List<PlacementScopeConfig> vcenters = null;

    @JsonProperty("vcpus_per_se")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpusPerSe = 1;

    @JsonProperty("vip_asg")
    @JsonInclude(Include.NON_NULL)
    private VipAutoscaleGroup vipAsg = null;

    @JsonProperty("vs_host_redundancy")
    @JsonInclude(Include.NON_NULL)
    private Boolean vsHostRedundancy = true;

    @JsonProperty("vs_scalein_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsScaleinTimeout = 30;

    @JsonProperty("vs_scalein_timeout_for_upgrade")
    @JsonInclude(Include.NON_NULL)
    private Integer vsScaleinTimeoutForUpgrade = 30;

    @JsonProperty("vs_scaleout_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsScaleoutTimeout = 600;

    @JsonProperty("vs_se_scaleout_additional_wait_time")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeScaleoutAdditionalWaitTime = 0;

    @JsonProperty("vs_se_scaleout_ready_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSeScaleoutReadyTimeout = 60;

    @JsonProperty("vs_switchover_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSwitchoverTimeout = 300;

    @JsonProperty("vss_placement")
    @JsonInclude(Include.NON_NULL)
    private VssPlacement vssPlacement = null;

    @JsonProperty("vss_placement_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean vssPlacementEnabled = false;

    @JsonProperty("waf_learning_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer wafLearningInterval;

    @JsonProperty("waf_learning_memory")
    @JsonInclude(Include.NON_NULL)
    private Integer wafLearningMemory;

    @JsonProperty("waf_mempool")
    @JsonInclude(Include.NON_NULL)
    private Boolean wafMempool = true;

    @JsonProperty("waf_mempool_size")
    @JsonInclude(Include.NON_NULL)
    private Integer wafMempoolSize = 64;



  /**
   * This is the getter method this will return the attribute value.
   * Enable accelerated networking option for azure se.
   * Accelerated networking enables single root i/o virtualization (sr-iov) to a se vm.
   * This improves networking performance.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return acceleratedNetworking
   */
  @VsoMethod
  public Boolean getAcceleratedNetworking() {
    return acceleratedNetworking;
  }

  /**
   * This is the setter method to the attribute.
   * Enable accelerated networking option for azure se.
   * Accelerated networking enables single root i/o virtualization (sr-iov) to a se vm.
   * This improves networking performance.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param acceleratedNetworking set the acceleratedNetworking.
   */
  @VsoMethod
  public void setAcceleratedNetworking(Boolean  acceleratedNetworking) {
    this.acceleratedNetworking = acceleratedNetworking;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engines in active/standby mode for ha failover.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return activeStandby
   */
  @VsoMethod
  public Boolean getActiveStandby() {
    return activeStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Service engines in active/standby mode for ha failover.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param activeStandby set the activeStandby.
   */
  @VsoMethod
  public void setActiveStandby(Boolean  activeStandby) {
    this.activeStandby = activeStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates the percent of config memory used for config updates.
   * Allowed values are 0-90.
   * Field deprecated in 18.1.2.
   * Field introduced in 18.1.1.
   * Unit is percent.
   * @return additionalConfigMemory
   */
  @VsoMethod
  public Integer getAdditionalConfigMemory() {
    return additionalConfigMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates the percent of config memory used for config updates.
   * Allowed values are 0-90.
   * Field deprecated in 18.1.2.
   * Field introduced in 18.1.1.
   * Unit is percent.
   * @param additionalConfigMemory set the additionalConfigMemory.
   */
  @VsoMethod
  public void setAdditionalConfigMemory(Integer  additionalConfigMemory) {
    this.additionalConfigMemory = additionalConfigMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Advertise reach-ability of backend server networks via adc through bgp for default gateway feature.
   * Field deprecated in 18.2.5.
   * @return advertiseBackendNetworks
   */
  @VsoMethod
  public Boolean getAdvertiseBackendNetworks() {
    return advertiseBackendNetworks;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise reach-ability of backend server networks via adc through bgp for default gateway feature.
   * Field deprecated in 18.2.5.
   * @param advertiseBackendNetworks set the advertiseBackendNetworks.
   */
  @VsoMethod
  public void setAdvertiseBackendNetworks(Boolean  advertiseBackendNetworks) {
    this.advertiseBackendNetworks = advertiseBackendNetworks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable aggressive failover configuration for ha.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return aggressiveFailureDetection
   */
  @VsoMethod
  public Boolean getAggressiveFailureDetection() {
    return aggressiveFailureDetection;
  }

  /**
   * This is the setter method to the attribute.
   * Enable aggressive failover configuration for ha.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param aggressiveFailureDetection set the aggressiveFailureDetection.
   */
  @VsoMethod
  public void setAggressiveFailureDetection(Boolean  aggressiveFailureDetection) {
    this.aggressiveFailureDetection = aggressiveFailureDetection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * In compact placement, virtual services are placed on existing ses until max_vs_per_se limit is reached.
   * Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_ALGO_PACKED".
   * @return algo
   */
  @VsoMethod
  public String getAlgo() {
    return algo;
  }

  /**
   * This is the setter method to the attribute.
   * In compact placement, virtual services are placed on existing ses until max_vs_per_se limit is reached.
   * Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_ALGO_PACKED".
   * @param algo set the algo.
   */
  @VsoMethod
  public void setAlgo(String  algo) {
    this.algo = algo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allow ses to be created using burst license.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowBurst
   */
  @VsoMethod
  public Boolean getAllowBurst() {
    return allowBurst;
  }

  /**
   * This is the setter method to the attribute.
   * Allow ses to be created using burst license.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param allowBurst set the allowBurst.
   */
  @VsoMethod
  public void setAllowBurst(Boolean  allowBurst) {
    this.allowBurst = allowBurst;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A percent value of total se memory reserved for applicationcaching.
   * This is an se bootup property and requires se restart.requires se reboot.
   * Allowed values are 0 - 100.
   * Special values are 0- 'disable'.
   * Field introduced in 18.2.3.
   * Unit is percent.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Special default for basic edition is 0, essentials edition is 0, enterprise is 10.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return appCachePercent
   */
  @VsoMethod
  public Integer getAppCachePercent() {
    return appCachePercent;
  }

  /**
   * This is the setter method to the attribute.
   * A percent value of total se memory reserved for applicationcaching.
   * This is an se bootup property and requires se restart.requires se reboot.
   * Allowed values are 0 - 100.
   * Special values are 0- 'disable'.
   * Field introduced in 18.2.3.
   * Unit is percent.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Special default for basic edition is 0, essentials edition is 0, enterprise is 10.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param appCachePercent set the appCachePercent.
   */
  @VsoMethod
  public void setAppCachePercent(Integer  appCachePercent) {
    this.appCachePercent = appCachePercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The max memory that can be allocated for the app cache.
   * This value will act as an upper bound on the cache size specified in app_cache_percent.
   * Special values are 0- 'disable'.
   * Field introduced in 20.1.1.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return appCacheThreshold
   */
  @VsoMethod
  public Integer getAppCacheThreshold() {
    return appCacheThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * The max memory that can be allocated for the app cache.
   * This value will act as an upper bound on the cache size specified in app_cache_percent.
   * Special values are 0- 'disable'.
   * Field introduced in 20.1.1.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param appCacheThreshold set the appCacheThreshold.
   */
  @VsoMethod
  public void setAppCacheThreshold(Integer  appCacheThreshold) {
    this.appCacheThreshold = appCacheThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A percent value of total se memory reserved for application learning.
   * This is an se bootup property and requires se restart.
   * Allowed values are 0 - 10.
   * Field introduced in 18.2.3.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return appLearningMemoryPercent
   */
  @VsoMethod
  public Integer getAppLearningMemoryPercent() {
    return appLearningMemoryPercent;
  }

  /**
   * This is the setter method to the attribute.
   * A percent value of total se memory reserved for application learning.
   * This is an se bootup property and requires se restart.
   * Allowed values are 0 - 10.
   * Field introduced in 18.2.3.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param appLearningMemoryPercent set the appLearningMemoryPercent.
   */
  @VsoMethod
  public void setAppLearningMemoryPercent(Integer  appLearningMemoryPercent) {
    this.appLearningMemoryPercent = appLearningMemoryPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of se memory in gb until which shared memory is collected in core archive.
   * Field introduced in 17.1.3.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return archiveShmLimit
   */
  @VsoMethod
  public Integer getArchiveShmLimit() {
    return archiveShmLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of se memory in gb until which shared memory is collected in core archive.
   * Field introduced in 17.1.3.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param archiveShmLimit set the archiveShmLimit.
   */
  @VsoMethod
  public void setArchiveShmLimit(Integer  archiveShmLimit) {
    this.archiveShmLimit = archiveShmLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl handshakes will be handled by dedicated ssl threads.requires se reboot.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return asyncSsl
   */
  @VsoMethod
  public Boolean getAsyncSsl() {
    return asyncSsl;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl handshakes will be handled by dedicated ssl threads.requires se reboot.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param asyncSsl set the asyncSsl.
   */
  @VsoMethod
  public void setAsyncSsl(Boolean  asyncSsl) {
    this.asyncSsl = asyncSsl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of async ssl threads per se_dp.requires se reboot.
   * Allowed values are 1-16.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return asyncSslThreads
   */
  @VsoMethod
  public Integer getAsyncSslThreads() {
    return asyncSslThreads;
  }

  /**
   * This is the setter method to the attribute.
   * Number of async ssl threads per se_dp.requires se reboot.
   * Allowed values are 1-16.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param asyncSslThreads set the asyncSslThreads.
   */
  @VsoMethod
  public void setAsyncSslThreads(Integer  asyncSslThreads) {
    this.asyncSslThreads = asyncSslThreads;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If set, virtual services will be automatically migrated when load on an se is less than minimum or more than maximum thresholds.
   * Only alerts are generated when the auto_rebalance is not set.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return autoRebalance
   */
  @VsoMethod
  public Boolean getAutoRebalance() {
    return autoRebalance;
  }

  /**
   * This is the setter method to the attribute.
   * If set, virtual services will be automatically migrated when load on an se is less than minimum or more than maximum thresholds.
   * Only alerts are generated when the auto_rebalance is not set.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param autoRebalance set the autoRebalance.
   */
  @VsoMethod
  public void setAutoRebalance(Boolean  autoRebalance) {
    this.autoRebalance = autoRebalance;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Capacities of se for auto rebalance for each criteria.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCapacityPerSe
   */
  @VsoMethod
  public List<Integer> getAutoRebalanceCapacityPerSe() {
    return autoRebalanceCapacityPerSe;
  }

  /**
   * This is the setter method. this will set the autoRebalanceCapacityPerSe
   * Capacities of se for auto rebalance for each criteria.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCapacityPerSe
   */
  @VsoMethod
  public void setAutoRebalanceCapacityPerSe(List<Integer>  autoRebalanceCapacityPerSe) {
    this.autoRebalanceCapacityPerSe = autoRebalanceCapacityPerSe;
  }

  /**
   * This is the setter method this will set the autoRebalanceCapacityPerSe
   * Capacities of se for auto rebalance for each criteria.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCapacityPerSe
   */
  @VsoMethod
  public ServiceEngineGroup addAutoRebalanceCapacityPerSeItem(Integer autoRebalanceCapacityPerSeItem) {
    if (this.autoRebalanceCapacityPerSe == null) {
      this.autoRebalanceCapacityPerSe = new ArrayList<Integer>();
    }
    this.autoRebalanceCapacityPerSe.add(autoRebalanceCapacityPerSeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Set of criteria for se auto rebalance.
   * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCriteria
   */
  @VsoMethod
  public List<String> getAutoRebalanceCriteria() {
    return autoRebalanceCriteria;
  }

  /**
   * This is the setter method. this will set the autoRebalanceCriteria
   * Set of criteria for se auto rebalance.
   * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCriteria
   */
  @VsoMethod
  public void setAutoRebalanceCriteria(List<String>  autoRebalanceCriteria) {
    this.autoRebalanceCriteria = autoRebalanceCriteria;
  }

  /**
   * This is the setter method this will set the autoRebalanceCriteria
   * Set of criteria for se auto rebalance.
   * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return autoRebalanceCriteria
   */
  @VsoMethod
  public ServiceEngineGroup addAutoRebalanceCriteriaItem(String autoRebalanceCriteriaItem) {
    if (this.autoRebalanceCriteria == null) {
      this.autoRebalanceCriteria = new ArrayList<String>();
    }
    this.autoRebalanceCriteria.add(autoRebalanceCriteriaItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Frequency of rebalance, if 'auto rebalance' is enabled.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return autoRebalanceInterval
   */
  @VsoMethod
  public Integer getAutoRebalanceInterval() {
    return autoRebalanceInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency of rebalance, if 'auto rebalance' is enabled.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param autoRebalanceInterval set the autoRebalanceInterval.
   */
  @VsoMethod
  public void setAutoRebalanceInterval(Integer  autoRebalanceInterval) {
    this.autoRebalanceInterval = autoRebalanceInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Redistribution of virtual services from the takeover se to the replacement se can cause momentary traffic loss.
   * If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to rest api.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return autoRedistributeActiveStandbyLoad
   */
  @VsoMethod
  public Boolean getAutoRedistributeActiveStandbyLoad() {
    return autoRedistributeActiveStandbyLoad;
  }

  /**
   * This is the setter method to the attribute.
   * Redistribution of virtual services from the takeover se to the replacement se can cause momentary traffic loss.
   * If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to rest api.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param autoRedistributeActiveStandbyLoad set the autoRedistributeActiveStandbyLoad.
   */
  @VsoMethod
  public void setAutoRedistributeActiveStandbyLoad(Boolean  autoRedistributeActiveStandbyLoad) {
    this.autoRedistributeActiveStandbyLoad = autoRedistributeActiveStandbyLoad;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availability zones for virtual service high availability.
   * It is a reference to an object of type availabilityzone.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZoneRefs
   */
  @VsoMethod
  public List<String> getAvailabilityZoneRefs() {
    return availabilityZoneRefs;
  }

  /**
   * This is the setter method. this will set the availabilityZoneRefs
   * Availability zones for virtual service high availability.
   * It is a reference to an object of type availabilityzone.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZoneRefs
   */
  @VsoMethod
  public void setAvailabilityZoneRefs(List<String>  availabilityZoneRefs) {
    this.availabilityZoneRefs = availabilityZoneRefs;
  }

  /**
   * This is the setter method this will set the availabilityZoneRefs
   * Availability zones for virtual service high availability.
   * It is a reference to an object of type availabilityzone.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZoneRefs
   */
  @VsoMethod
  public ServiceEngineGroup addAvailabilityZoneRefsItem(String availabilityZoneRefsItem) {
    if (this.availabilityZoneRefs == null) {
      this.availabilityZoneRefs = new ArrayList<String>();
    }
    this.availabilityZoneRefs.add(availabilityZoneRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Bgp peer state update interval.
   * Allowed values are 5-100.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return bgpStateUpdateInterval
   */
  @VsoMethod
  public Integer getBgpStateUpdateInterval() {
    return bgpStateUpdateInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Bgp peer state update interval.
   * Allowed values are 5-100.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param bgpStateUpdateInterval set the bgpStateUpdateInterval.
   */
  @VsoMethod
  public void setBgpStateUpdateInterval(Integer  bgpStateUpdateInterval) {
    this.bgpStateUpdateInterval = bgpStateUpdateInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Excess service engine capacity provisioned for ha failover.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return bufferSe
   */
  @VsoMethod
  public Integer getBufferSe() {
    return bufferSe;
  }

  /**
   * This is the setter method to the attribute.
   * Excess service engine capacity provisioned for ha failover.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param bufferSe set the bufferSe.
   */
  @VsoMethod
  public void setBufferSe(Integer  bufferSe) {
    this.bufferSe = bufferSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Compress ip rules into a single subnet based ip rule for each north-south ipam subnet configured in pcap mode in openshift/kubernetes node.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return compressIpRulesForEachNsSubnet
   */
  @VsoMethod
  public Boolean getCompressIpRulesForEachNsSubnet() {
    return compressIpRulesForEachNsSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Compress ip rules into a single subnet based ip rule for each north-south ipam subnet configured in pcap mode in openshift/kubernetes node.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param compressIpRulesForEachNsSubnet set the compressIpRulesForEachNsSubnet.
   */
  @VsoMethod
  public void setCompressIpRulesForEachNsSubnet(Boolean  compressIpRulesForEachNsSubnet) {
    this.compressIpRulesForEachNsSubnet = compressIpRulesForEachNsSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable config debugs on all cores of se.
   * Field introduced in 17.2.13,18.1.5,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return configDebugsOnAllCores
   */
  @VsoMethod
  public Boolean getConfigDebugsOnAllCores() {
    return configDebugsOnAllCores;
  }

  /**
   * This is the setter method to the attribute.
   * Enable config debugs on all cores of se.
   * Field introduced in 17.2.13,18.1.5,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param configDebugsOnAllCores set the configDebugsOnAllCores.
   */
  @VsoMethod
  public void setConfigDebugsOnAllCores(Boolean  configDebugsOnAllCores) {
    this.configDebugsOnAllCores = configDebugsOnAllCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of memory for connection state.
   * This will come at the expense of memory used for http in-memory cache.
   * Allowed values are 10-90.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return connectionMemoryPercentage
   */
  @VsoMethod
  public Integer getConnectionMemoryPercentage() {
    return connectionMemoryPercentage;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of memory for connection state.
   * This will come at the expense of memory used for http in-memory cache.
   * Allowed values are 10-90.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param connectionMemoryPercentage set the connectionMemoryPercentage.
   */
  @VsoMethod
  public void setConnectionMemoryPercentage(Integer  connectionMemoryPercentage) {
    this.connectionMemoryPercentage = connectionMemoryPercentage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Include shared memory for app cache in core file.requires se reboot.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return coreShmAppCache
   */
  @VsoMethod
  public Boolean getCoreShmAppCache() {
    return coreShmAppCache;
  }

  /**
   * This is the setter method to the attribute.
   * Include shared memory for app cache in core file.requires se reboot.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param coreShmAppCache set the coreShmAppCache.
   */
  @VsoMethod
  public void setCoreShmAppCache(Boolean  coreShmAppCache) {
    this.coreShmAppCache = coreShmAppCache;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Include shared memory for app learning in core file.requires se reboot.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return coreShmAppLearning
   */
  @VsoMethod
  public Boolean getCoreShmAppLearning() {
    return coreShmAppLearning;
  }

  /**
   * This is the setter method to the attribute.
   * Include shared memory for app learning in core file.requires se reboot.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param coreShmAppLearning set the coreShmAppLearning.
   */
  @VsoMethod
  public void setCoreShmAppLearning(Boolean  coreShmAppLearning) {
    this.coreShmAppLearning = coreShmAppLearning;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpu_reserve of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return cpuReserve
   */
  @VsoMethod
  public Boolean getCpuReserve() {
    return cpuReserve;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpu_reserve of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param cpuReserve set the cpuReserve.
   */
  @VsoMethod
  public void setCpuReserve(Boolean  cpuReserve) {
    this.cpuReserve = cpuReserve;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allocate all the cpu cores for the service engine virtual machines  on the same cpu socket.
   * Applicable only for vcenter cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return cpuSocketAffinity
   */
  @VsoMethod
  public Boolean getCpuSocketAffinity() {
    return cpuSocketAffinity;
  }

  /**
   * This is the setter method to the attribute.
   * Allocate all the cpu cores for the service engine virtual machines  on the same cpu socket.
   * Applicable only for vcenter cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param cpuSocketAffinity set the cpuSocketAffinity.
   */
  @VsoMethod
  public void setCpuSocketAffinity(Boolean  cpuSocketAffinity) {
    this.cpuSocketAffinity = cpuSocketAffinity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsData
   */
  @VsoMethod
  public List<String> getCustomSecuritygroupsData() {
    return customSecuritygroupsData;
  }

  /**
   * This is the setter method. this will set the customSecuritygroupsData
   * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsData
   */
  @VsoMethod
  public void setCustomSecuritygroupsData(List<String>  customSecuritygroupsData) {
    this.customSecuritygroupsData = customSecuritygroupsData;
  }

  /**
   * This is the setter method this will set the customSecuritygroupsData
   * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsData
   */
  @VsoMethod
  public ServiceEngineGroup addCustomSecuritygroupsDataItem(String customSecuritygroupsDataItem) {
    if (this.customSecuritygroupsData == null) {
      this.customSecuritygroupsData = new ArrayList<String>();
    }
    this.customSecuritygroupsData.add(customSecuritygroupsDataItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsMgmt
   */
  @VsoMethod
  public List<String> getCustomSecuritygroupsMgmt() {
    return customSecuritygroupsMgmt;
  }

  /**
   * This is the setter method. this will set the customSecuritygroupsMgmt
   * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsMgmt
   */
  @VsoMethod
  public void setCustomSecuritygroupsMgmt(List<String>  customSecuritygroupsMgmt) {
    this.customSecuritygroupsMgmt = customSecuritygroupsMgmt;
  }

  /**
   * This is the setter method this will set the customSecuritygroupsMgmt
   * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customSecuritygroupsMgmt
   */
  @VsoMethod
  public ServiceEngineGroup addCustomSecuritygroupsMgmtItem(String customSecuritygroupsMgmtItem) {
    if (this.customSecuritygroupsMgmt == null) {
      this.customSecuritygroupsMgmt = new ArrayList<String>();
    }
    this.customSecuritygroupsMgmt.add(customSecuritygroupsMgmtItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Custom tag will be used to create the tags for se instance in aws.
   * Note this is not the same as the prefix for se name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTag
   */
  @VsoMethod
  public List<CustomTag> getCustomTag() {
    return customTag;
  }

  /**
   * This is the setter method. this will set the customTag
   * Custom tag will be used to create the tags for se instance in aws.
   * Note this is not the same as the prefix for se name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTag
   */
  @VsoMethod
  public void setCustomTag(List<CustomTag>  customTag) {
    this.customTag = customTag;
  }

  /**
   * This is the setter method this will set the customTag
   * Custom tag will be used to create the tags for se instance in aws.
   * Note this is not the same as the prefix for se name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTag
   */
  @VsoMethod
  public ServiceEngineGroup addCustomTagItem(CustomTag customTagItem) {
    if (this.customTag == null) {
      this.customTag = new ArrayList<CustomTag>();
    }
    this.customTag.add(customTagItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Subnet used to spin up the data nic for service engines, used only for azure cloud.
   * Overrides the cloud level setting for service engine subnet.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dataNetworkId
   */
  @VsoMethod
  public String getDataNetworkId() {
    return dataNetworkId;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet used to spin up the data nic for service engines, used only for azure cloud.
   * Overrides the cloud level setting for service engine subnet.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dataNetworkId set the dataNetworkId.
   */
  @VsoMethod
  public void setDataNetworkId(String  dataNetworkId) {
    this.dataNetworkId = dataNetworkId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of instructions before datascript times out.
   * Allowed values are 0-100000000.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
   * @return datascriptTimeout
   */
  @VsoMethod
  public Integer getDatascriptTimeout() {
    return datascriptTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Number of instructions before datascript times out.
   * Allowed values are 0-100000000.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
   * @param datascriptTimeout set the datascriptTimeout.
   */
  @VsoMethod
  public void setDatascriptTimeout(Integer  datascriptTimeout) {
    this.datascriptTimeout = datascriptTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dedicate the core that handles packet receive/transmit from the network to just the dispatching function.
   * Don't use it for tcp/ip and ssl functions.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dedicatedDispatcherCore
   */
  @VsoMethod
  public Boolean getDedicatedDispatcherCore() {
    return dedicatedDispatcherCore;
  }

  /**
   * This is the setter method to the attribute.
   * Dedicate the core that handles packet receive/transmit from the network to just the dispatching function.
   * Don't use it for tcp/ip and ssl functions.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dedicatedDispatcherCore set the dedicatedDispatcherCore.
   */
  @VsoMethod
  public void setDedicatedDispatcherCore(Boolean  dedicatedDispatcherCore) {
    this.dedicatedDispatcherCore = dedicatedDispatcherCore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * By default, avi creates and manages security groups along with custom sg provided by user.
   * Set this to true to disallow avi to create and manage new security groups.
   * Avi will only make use of custom security groups provided by user.
   * This option is supported for aws and openstack cloud types.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableAviSecuritygroups
   */
  @VsoMethod
  public Boolean getDisableAviSecuritygroups() {
    return disableAviSecuritygroups;
  }

  /**
   * This is the setter method to the attribute.
   * By default, avi creates and manages security groups along with custom sg provided by user.
   * Set this to true to disallow avi to create and manage new security groups.
   * Avi will only make use of custom security groups provided by user.
   * This option is supported for aws and openstack cloud types.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableAviSecuritygroups set the disableAviSecuritygroups.
   */
  @VsoMethod
  public void setDisableAviSecuritygroups(Boolean  disableAviSecuritygroups) {
    this.disableAviSecuritygroups = disableAviSecuritygroups;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Stop using tcp/udp and ip checksum offload features of nics.
   * Field introduced in 17.1.14, 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableCsumOffloads
   */
  @VsoMethod
  public Boolean getDisableCsumOffloads() {
    return disableCsumOffloads;
  }

  /**
   * This is the setter method to the attribute.
   * Stop using tcp/udp and ip checksum offload features of nics.
   * Field introduced in 17.1.14, 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableCsumOffloads set the disableCsumOffloads.
   */
  @VsoMethod
  public void setDisableCsumOffloads(Boolean  disableCsumOffloads) {
    this.disableCsumOffloads = disableCsumOffloads;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable flow probes for scaled out vs'es.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableFlowProbes
   */
  @VsoMethod
  public Boolean getDisableFlowProbes() {
    return disableFlowProbes;
  }

  /**
   * This is the setter method to the attribute.
   * Disable flow probes for scaled out vs'es.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableFlowProbes set the disableFlowProbes.
   */
  @VsoMethod
  public void setDisableFlowProbes(Boolean  disableFlowProbes) {
    this.disableFlowProbes = disableFlowProbes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable generic receive offload (gro) in dpdk poll-mode driver packet receive path.
   * Gro is on by default on nics that do not support lro (large receive offload) or do not gain performance boost from lro.
   * Field introduced in 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return disableGro
   */
  @VsoMethod
  public Boolean getDisableGro() {
    return disableGro;
  }

  /**
   * This is the setter method to the attribute.
   * Disable generic receive offload (gro) in dpdk poll-mode driver packet receive path.
   * Gro is on by default on nics that do not support lro (large receive offload) or do not gain performance boost from lro.
   * Field introduced in 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param disableGro set the disableGro.
   */
  @VsoMethod
  public void setDisableGro(Boolean  disableGro) {
    this.disableGro = disableGro;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If set, disable the config memory check done in service engine.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableSeMemoryCheck
   */
  @VsoMethod
  public Boolean getDisableSeMemoryCheck() {
    return disableSeMemoryCheck;
  }

  /**
   * This is the setter method to the attribute.
   * If set, disable the config memory check done in service engine.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableSeMemoryCheck set the disableSeMemoryCheck.
   */
  @VsoMethod
  public void setDisableSeMemoryCheck(Boolean  disableSeMemoryCheck) {
    this.disableSeMemoryCheck = disableSeMemoryCheck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable tcp segmentation offload (tso) in dpdk poll-mode driver packet transmit path.
   * Tso is on by default on nics that support it.
   * Field introduced in 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableTso
   */
  @VsoMethod
  public Boolean getDisableTso() {
    return disableTso;
  }

  /**
   * This is the setter method to the attribute.
   * Disable tcp segmentation offload (tso) in dpdk poll-mode driver packet transmit path.
   * Tso is on by default on nics that support it.
   * Field introduced in 17.2.5, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableTso set the disableTso.
   */
  @VsoMethod
  public void setDisableTso(Boolean  disableTso) {
    this.disableTso = disableTso;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of disk space for each of the service engine virtual machines.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return diskPerSe
   */
  @VsoMethod
  public Integer getDiskPerSe() {
    return diskPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of disk space for each of the service engine virtual machines.
   * Unit is gb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param diskPerSe set the diskPerSe.
   */
  @VsoMethod
  public void setDiskPerSe(Integer  diskPerSe) {
    this.diskPerSe = diskPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use both the active and standby service engines for virtual service placement in the legacy active standby ha mode.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return distributeLoadActiveStandby
   */
  @VsoMethod
  public Boolean getDistributeLoadActiveStandby() {
    return distributeLoadActiveStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Use both the active and standby service engines for virtual service placement in the legacy active standby ha mode.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param distributeLoadActiveStandby set the distributeLoadActiveStandby.
   */
  @VsoMethod
  public void setDistributeLoadActiveStandby(Boolean  distributeLoadActiveStandby) {
    this.distributeLoadActiveStandby = distributeLoadActiveStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Distributes queue ownership among cores so multiple cores handle dispatcher duties.
   * Requires se reboot.
   * Deprecated from 18.2.8, instead use max_queues_per_vnic.
   * Field introduced in 17.2.8.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return distributeQueues
   */
  @VsoMethod
  public Boolean getDistributeQueues() {
    return distributeQueues;
  }

  /**
   * This is the setter method to the attribute.
   * Distributes queue ownership among cores so multiple cores handle dispatcher duties.
   * Requires se reboot.
   * Deprecated from 18.2.8, instead use max_queues_per_vnic.
   * Field introduced in 17.2.8.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param distributeQueues set the distributeQueues.
   */
  @VsoMethod
  public void setDistributeQueues(Boolean  distributeQueues) {
    this.distributeQueues = distributeQueues;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Distributes vnic ownership among cores so multiple cores handle dispatcher duties.requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return distributeVnics
   */
  @VsoMethod
  public Boolean getDistributeVnics() {
    return distributeVnics;
  }

  /**
   * This is the setter method to the attribute.
   * Distributes vnic ownership among cores so multiple cores handle dispatcher duties.requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param distributeVnics set the distributeVnics.
   */
  @VsoMethod
  public void setDistributeVnics(Boolean  distributeVnics) {
    this.distributeVnics = distributeVnics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return dpAggressiveHbFrequency
   */
  @VsoMethod
  public Integer getDpAggressiveHbFrequency() {
    return dpAggressiveHbFrequency;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param dpAggressiveHbFrequency set the dpAggressiveHbFrequency.
   */
  @VsoMethod
  public void setDpAggressiveHbFrequency(Integer  dpAggressiveHbFrequency) {
    this.dpAggressiveHbFrequency = dpAggressiveHbFrequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return dpAggressiveHbTimeoutCount
   */
  @VsoMethod
  public Integer getDpAggressiveHbTimeoutCount() {
    return dpAggressiveHbTimeoutCount;
  }

  /**
   * This is the setter method to the attribute.
   * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param dpAggressiveHbTimeoutCount set the dpAggressiveHbTimeoutCount.
   */
  @VsoMethod
  public void setDpAggressiveHbTimeoutCount(Integer  dpAggressiveHbTimeoutCount) {
    this.dpAggressiveHbTimeoutCount = dpAggressiveHbTimeoutCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return dpHbFrequency
   */
  @VsoMethod
  public Integer getDpHbFrequency() {
    return dpHbFrequency;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param dpHbFrequency set the dpHbFrequency.
   */
  @VsoMethod
  public void setDpHbFrequency(Integer  dpHbFrequency) {
    this.dpHbFrequency = dpHbFrequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return dpHbTimeoutCount
   */
  @VsoMethod
  public Integer getDpHbTimeoutCount() {
    return dpHbTimeoutCount;
  }

  /**
   * This is the setter method to the attribute.
   * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param dpHbTimeoutCount set the dpHbTimeoutCount.
   */
  @VsoMethod
  public void setDpHbTimeoutCount(Integer  dpHbTimeoutCount) {
    this.dpHbTimeoutCount = dpHbTimeoutCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable gratarp for vip_ip.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableGratarpPermanent
   */
  @VsoMethod
  public Boolean getEnableGratarpPermanent() {
    return enableGratarpPermanent;
  }

  /**
   * This is the setter method to the attribute.
   * Enable gratarp for vip_ip.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableGratarpPermanent set the enableGratarpPermanent.
   */
  @VsoMethod
  public void setEnableGratarpPermanent(Boolean  enableGratarpPermanent) {
    this.enableGratarpPermanent = enableGratarpPermanent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (this is a beta feature).
   * Enable hsm key priming.
   * If enabled, key handles on the hsm will be synced to se before processing client connections.
   * Field introduced in 17.2.7, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableHsmPriming
   */
  @VsoMethod
  public Boolean getEnableHsmPriming() {
    return enableHsmPriming;
  }

  /**
   * This is the setter method to the attribute.
   * (this is a beta feature).
   * Enable hsm key priming.
   * If enabled, key handles on the hsm will be synced to se before processing client connections.
   * Field introduced in 17.2.7, 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableHsmPriming set the enableHsmPriming.
   */
  @VsoMethod
  public void setEnableHsmPriming(Boolean  enableHsmPriming) {
    this.enableHsmPriming = enableHsmPriming;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Applicable only for azure cloud with basic sku lb.
   * If set, additional azure lbs will be automatically created if resources in existing lb are exhausted.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableMultiLb
   */
  @VsoMethod
  public Boolean getEnableMultiLb() {
    return enableMultiLb;
  }

  /**
   * This is the setter method to the attribute.
   * Applicable only for azure cloud with basic sku lb.
   * If set, additional azure lbs will be automatically created if resources in existing lb are exhausted.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableMultiLb set the enableMultiLb.
   */
  @VsoMethod
  public void setEnableMultiLb(Boolean  enableMultiLb) {
    this.enableMultiLb = enableMultiLb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable tx ring support in pcap mode of operation.
   * Tso feature is not supported with tx ring enabled.
   * Deprecated from 18.2.8, instead use pcap_tx_mode.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enablePcapTxRing
   */
  @VsoMethod
  public Boolean getEnablePcapTxRing() {
    return enablePcapTxRing;
  }

  /**
   * This is the setter method to the attribute.
   * Enable tx ring support in pcap mode of operation.
   * Tso feature is not supported with tx ring enabled.
   * Deprecated from 18.2.8, instead use pcap_tx_mode.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enablePcapTxRing set the enablePcapTxRing.
   */
  @VsoMethod
  public void setEnablePcapTxRing(Boolean  enablePcapTxRing) {
    this.enablePcapTxRing = enablePcapTxRing;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable routing for this serviceenginegroup.
   * Field deprecated in 18.2.5.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @return enableRouting
   */
  @VsoMethod
  public Boolean getEnableRouting() {
    return enableRouting;
  }

  /**
   * This is the setter method to the attribute.
   * Enable routing for this serviceenginegroup.
   * Field deprecated in 18.2.5.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * @param enableRouting set the enableRouting.
   */
  @VsoMethod
  public void setEnableRouting(Boolean  enableRouting) {
    this.enableRouting = enableRouting;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable vip on all interfaces of se.
   * Field deprecated in 18.2.5.
   * Field introduced in 17.1.1.
   * @return enableVipOnAllInterfaces
   */
  @VsoMethod
  public Boolean getEnableVipOnAllInterfaces() {
    return enableVipOnAllInterfaces;
  }

  /**
   * This is the setter method to the attribute.
   * Enable vip on all interfaces of se.
   * Field deprecated in 18.2.5.
   * Field introduced in 17.1.1.
   * @param enableVipOnAllInterfaces set the enableVipOnAllInterfaces.
   */
  @VsoMethod
  public void setEnableVipOnAllInterfaces(Boolean  enableVipOnAllInterfaces) {
    this.enableVipOnAllInterfaces = enableVipOnAllInterfaces;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use virtual mac address for interfaces on which floating interface ips are placed.
   * Field deprecated in 18.2.5.
   * @return enableVmac
   */
  @VsoMethod
  public Boolean getEnableVmac() {
    return enableVmac;
  }

  /**
   * This is the setter method to the attribute.
   * Use virtual mac address for interfaces on which floating interface ips are placed.
   * Field deprecated in 18.2.5.
   * @param enableVmac set the enableVmac.
   */
  @VsoMethod
  public void setEnableVmac(Boolean  enableVmac) {
    this.enableVmac = enableVmac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End local ephemeral port number for outbound connections.
   * Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ephemeralPortrangeEnd
   */
  @VsoMethod
  public Integer getEphemeralPortrangeEnd() {
    return ephemeralPortrangeEnd;
  }

  /**
   * This is the setter method to the attribute.
   * End local ephemeral port number for outbound connections.
   * Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ephemeralPortrangeEnd set the ephemeralPortrangeEnd.
   */
  @VsoMethod
  public void setEphemeralPortrangeEnd(Integer  ephemeralPortrangeEnd) {
    this.ephemeralPortrangeEnd = ephemeralPortrangeEnd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start local ephemeral port number for outbound connections.
   * Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ephemeralPortrangeStart
   */
  @VsoMethod
  public Integer getEphemeralPortrangeStart() {
    return ephemeralPortrangeStart;
  }

  /**
   * This is the setter method to the attribute.
   * Start local ephemeral port number for outbound connections.
   * Field introduced in 17.2.13, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ephemeralPortrangeStart set the ephemeralPortrangeStart.
   */
  @VsoMethod
  public void setEphemeralPortrangeStart(Integer  ephemeralPortrangeStart) {
    this.ephemeralPortrangeStart = ephemeralPortrangeStart;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Multiplier for extra config to support large vs/pool config.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return extraConfigMultiplier
   */
  @VsoMethod
  public Float getExtraConfigMultiplier() {
    return extraConfigMultiplier;
  }

  /**
   * This is the setter method to the attribute.
   * Multiplier for extra config to support large vs/pool config.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param extraConfigMultiplier set the extraConfigMultiplier.
   */
  @VsoMethod
  public void setExtraConfigMultiplier(Float  extraConfigMultiplier) {
    this.extraConfigMultiplier = extraConfigMultiplier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Extra config memory to support large geo db configuration.
   * Field introduced in 17.1.1.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return extraSharedConfigMemory
   */
  @VsoMethod
  public Integer getExtraSharedConfigMemory() {
    return extraSharedConfigMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Extra config memory to support large geo db configuration.
   * Field introduced in 17.1.1.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param extraSharedConfigMemory set the extraSharedConfigMemory.
   */
  @VsoMethod
  public void setExtraSharedConfigMemory(Integer  extraSharedConfigMemory) {
    this.extraSharedConfigMemory = extraSharedConfigMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 1 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIp
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 1 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIp
   */
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr>  floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  /**
   * This is the setter method this will set the floatingIntfIp
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 1 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIp
   */
  @VsoMethod
  public ServiceEngineGroup addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIpSe2() {
    return floatingIntfIpSe2;
  }

  /**
   * This is the setter method. this will set the floatingIntfIpSe2
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public void setFloatingIntfIpSe2(List<IpAddr>  floatingIntfIpSe2) {
    this.floatingIntfIpSe2 = floatingIntfIpSe2;
  }

  /**
   * This is the setter method this will set the floatingIntfIpSe2
   * If serviceenginegroup is configured for legacy 1+1 active standby ha mode, floating ip's will be advertised only by the active se in the pair.
   * Virtual services in this group must be disabled/enabled for any changes to the floating ip's to take effect.
   * Only active se hosting vs tagged with active standby se 2 tag will advertise this floating ip when manual load distribution is enabled.
   * Field deprecated in 18.2.5.
   * Maximum of 32 items allowed.
   * @return floatingIntfIpSe2
   */
  @VsoMethod
  public ServiceEngineGroup addFloatingIntfIpSe2Item(IpAddr floatingIntfIpSe2Item) {
    if (this.floatingIntfIpSe2 == null) {
      this.floatingIntfIpSe2 = new ArrayList<IpAddr>();
    }
    this.floatingIntfIpSe2.add(floatingIntfIpSe2Item);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of flow table entries that have not completed tcp three-way handshake yet.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return flowTableNewSynMaxEntries
   */
  @VsoMethod
  public Integer getFlowTableNewSynMaxEntries() {
    return flowTableNewSynMaxEntries;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of flow table entries that have not completed tcp three-way handshake yet.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param flowTableNewSynMaxEntries set the flowTableNewSynMaxEntries.
   */
  @VsoMethod
  public void setFlowTableNewSynMaxEntries(Integer  flowTableNewSynMaxEntries) {
    this.flowTableNewSynMaxEntries = flowTableNewSynMaxEntries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of entries in the free list.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
   * @return freeListSize
   */
  @VsoMethod
  public Integer getFreeListSize() {
    return freeListSize;
  }

  /**
   * This is the setter method to the attribute.
   * Number of entries in the free list.
   * Field introduced in 17.2.10, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
   * @param freeListSize set the freeListSize.
   */
  @VsoMethod
  public void setFreeListSize(Integer  freeListSize) {
    this.freeListSize = freeListSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform, service engine group configuration.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpConfig
   */
  @VsoMethod
  public GCPSeGroupConfig getGcpConfig() {
    return gcpConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform, service engine group configuration.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpConfig set the gcpConfig.
   */
  @VsoMethod
  public void setGcpConfig(GCPSeGroupConfig gcpConfig) {
    this.gcpConfig = gcpConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gratarp periodicity for vip-ip.
   * Allowed values are 5-30.
   * Field introduced in 18.2.3.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return gratarpPermanentPeriodicity
   */
  @VsoMethod
  public Integer getGratarpPermanentPeriodicity() {
    return gratarpPermanentPeriodicity;
  }

  /**
   * This is the setter method to the attribute.
   * Gratarp periodicity for vip-ip.
   * Allowed values are 5-30.
   * Field introduced in 18.2.3.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param gratarpPermanentPeriodicity set the gratarpPermanentPeriodicity.
   */
  @VsoMethod
  public void setGratarpPermanentPeriodicity(Integer  gratarpPermanentPeriodicity) {
    this.gratarpPermanentPeriodicity = gratarpPermanentPeriodicity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * High availability mode for all the virtual services using this service engine group.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * Allowed in basic(allowed values- ha_mode_legacy_active_standby) edition, essentials(allowed values- ha_mode_legacy_active_standby) edition,
   * enterprise edition.
   * Special default for basic edition is ha_mode_legacy_active_standby, essentials edition is ha_mode_legacy_active_standby, enterprise is
   * ha_mode_shared.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HA_MODE_SHARED".
   * @return haMode
   */
  @VsoMethod
  public String getHaMode() {
    return haMode;
  }

  /**
   * This is the setter method to the attribute.
   * High availability mode for all the virtual services using this service engine group.
   * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
   * Allowed in basic(allowed values- ha_mode_legacy_active_standby) edition, essentials(allowed values- ha_mode_legacy_active_standby) edition,
   * enterprise edition.
   * Special default for basic edition is ha_mode_legacy_active_standby, essentials edition is ha_mode_legacy_active_standby, enterprise is
   * ha_mode_shared.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HA_MODE_SHARED".
   * @param haMode set the haMode.
   */
  @VsoMethod
  public void setHaMode(String  haMode) {
    this.haMode = haMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration to handle per packet attack handling.for example, dns reflection attack is a type of attack where a response packet is sent to the
   * dns vs.this configuration tells if such packets should be dropped without further processing.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return handlePerPktAttack
   */
  @VsoMethod
  public Boolean getHandlePerPktAttack() {
    return handlePerPktAttack;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration to handle per packet attack handling.for example, dns reflection attack is a type of attack where a response packet is sent to the
   * dns vs.this configuration tells if such packets should be dropped without further processing.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param handlePerPktAttack set the handlePerPktAttack.
   */
  @VsoMethod
  public void setHandlePerPktAttack(Boolean  handlePerPktAttack) {
    this.handlePerPktAttack = handlePerPktAttack;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type hardwaresecuritymodulegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hardwaresecuritymodulegroupRef
   */
  @VsoMethod
  public String getHardwaresecuritymodulegroupRef() {
    return hardwaresecuritymodulegroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type hardwaresecuritymodulegroup.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hardwaresecuritymodulegroupRef set the hardwaresecuritymodulegroupRef.
   */
  @VsoMethod
  public void setHardwaresecuritymodulegroupRef(String  hardwaresecuritymodulegroupRef) {
    this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum required heap memory to apply any configuration.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return heapMinimumConfigMemory
   */
  @VsoMethod
  public Integer getHeapMinimumConfigMemory() {
    return heapMinimumConfigMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum required heap memory to apply any configuration.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param heapMinimumConfigMemory set the heapMinimumConfigMemory.
   */
  @VsoMethod
  public void setHeapMinimumConfigMemory(Integer  heapMinimumConfigMemory) {
    this.heapMinimumConfigMemory = heapMinimumConfigMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable active health monitoring from the standby se for all placed virtual services.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Special default for basic edition is false, essentials edition is false, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return hmOnStandby
   */
  @VsoMethod
  public Boolean getHmOnStandby() {
    return hmOnStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Enable active health monitoring from the standby se for all placed virtual services.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Special default for basic edition is false, essentials edition is false, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param hmOnStandby set the hmOnStandby.
   */
  @VsoMethod
  public void setHmOnStandby(Boolean  hmOnStandby) {
    this.hmOnStandby = hmOnStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
   * Needs to be specified together with host_attribute_value.
   * Ses can be configured differently including ha modes across different se groups.
   * May also be used for isolation between different classes of virtualservices.
   * Virtualservices' se group may be specified via annotations/labels.
   * A openshift/kubernetes namespace maybe annotated with a matching se group label as openshift.io/node-selector  apptype=prod.
   * When multiple se groups are used in a cloud with host attributes specified,just a single se group can exist as a match-all se group without a
   * host_attribute_key.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostAttributeKey
   */
  @VsoMethod
  public String getHostAttributeKey() {
    return hostAttributeKey;
  }

  /**
   * This is the setter method to the attribute.
   * Key of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
   * Needs to be specified together with host_attribute_value.
   * Ses can be configured differently including ha modes across different se groups.
   * May also be used for isolation between different classes of virtualservices.
   * Virtualservices' se group may be specified via annotations/labels.
   * A openshift/kubernetes namespace maybe annotated with a matching se group label as openshift.io/node-selector  apptype=prod.
   * When multiple se groups are used in a cloud with host attributes specified,just a single se group can exist as a match-all se group without a
   * host_attribute_key.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostAttributeKey set the hostAttributeKey.
   */
  @VsoMethod
  public void setHostAttributeKey(String  hostAttributeKey) {
    this.hostAttributeKey = hostAttributeKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Value of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
   * Needs to be specified together with host_attribute_key.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostAttributeValue
   */
  @VsoMethod
  public String getHostAttributeValue() {
    return hostAttributeValue;
  }

  /**
   * This is the setter method to the attribute.
   * Value of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
   * Needs to be specified together with host_attribute_key.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostAttributeValue set the hostAttributeValue.
   */
  @VsoMethod
  public void setHostAttributeValue(String  hostAttributeValue) {
    this.hostAttributeValue = hostAttributeValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable the host gateway monitor when service engine is deployed as docker container.
   * Disabled by default.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return hostGatewayMonitor
   */
  @VsoMethod
  public Boolean getHostGatewayMonitor() {
    return hostGatewayMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Enable the host gateway monitor when service engine is deployed as docker container.
   * Disabled by default.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param hostGatewayMonitor set the hostGatewayMonitor.
   */
  @VsoMethod
  public void setHostGatewayMonitor(Boolean  hostGatewayMonitor) {
    this.hostGatewayMonitor = hostGatewayMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Override default hypervisor.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hypervisor
   */
  @VsoMethod
  public String getHypervisor() {
    return hypervisor;
  }

  /**
   * This is the setter method to the attribute.
   * Override default hypervisor.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hypervisor set the hypervisor.
   */
  @VsoMethod
  public void setHypervisor(String  hypervisor) {
    this.hypervisor = hypervisor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ignore rtt samples if it is above threshold.
   * Field introduced in 17.1.6,17.2.2.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @return ignoreRttThreshold
   */
  @VsoMethod
  public Integer getIgnoreRttThreshold() {
    return ignoreRttThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Ignore rtt samples if it is above threshold.
   * Field introduced in 17.1.6,17.2.2.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
   * @param ignoreRttThreshold set the ignoreRttThreshold.
   */
  @VsoMethod
  public void setIgnoreRttThreshold(Integer  ignoreRttThreshold) {
    this.ignoreRttThreshold = ignoreRttThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Program se security group ingress rules to allow vip data access from remote cidr type.
   * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
   * @return ingressAccessData
   */
  @VsoMethod
  public String getIngressAccessData() {
    return ingressAccessData;
  }

  /**
   * This is the setter method to the attribute.
   * Program se security group ingress rules to allow vip data access from remote cidr type.
   * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
   * @param ingressAccessData set the ingressAccessData.
   */
  @VsoMethod
  public void setIngressAccessData(String  ingressAccessData) {
    this.ingressAccessData = ingressAccessData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Program se security group ingress rules to allow ssh/icmp management access from remote cidr type.
   * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
   * @return ingressAccessMgmt
   */
  @VsoMethod
  public String getIngressAccessMgmt() {
    return ingressAccessMgmt;
  }

  /**
   * This is the setter method to the attribute.
   * Program se security group ingress rules to allow ssh/icmp management access from remote cidr type.
   * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
   * @param ingressAccessMgmt set the ingressAccessMgmt.
   */
  @VsoMethod
  public void setIngressAccessMgmt(String  ingressAccessMgmt) {
    this.ingressAccessMgmt = ingressAccessMgmt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Instance/flavor name for se instance.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instanceFlavor
   */
  @VsoMethod
  public String getInstanceFlavor() {
    return instanceFlavor;
  }

  /**
   * This is the setter method to the attribute.
   * Instance/flavor name for se instance.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instanceFlavor set the instanceFlavor.
   */
  @VsoMethod
  public void setInstanceFlavor(String  instanceFlavor) {
    this.instanceFlavor = instanceFlavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Iptable rules.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return iptables
   */
  @VsoMethod
  public List<IptableRuleSet> getIptables() {
    return iptables;
  }

  /**
   * This is the setter method. this will set the iptables
   * Iptable rules.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return iptables
   */
  @VsoMethod
  public void setIptables(List<IptableRuleSet>  iptables) {
    this.iptables = iptables;
  }

  /**
   * This is the setter method this will set the iptables
   * Iptable rules.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return iptables
   */
  @VsoMethod
  public ServiceEngineGroup addIptablesItem(IptableRuleSet iptablesItem) {
    if (this.iptables == null) {
      this.iptables = new ArrayList<IptableRuleSet>();
    }
    this.iptables.add(iptablesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Labels associated with this se group.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public List<KeyValue> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Labels associated with this se group.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<KeyValue>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Labels associated with this se group.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public ServiceEngineGroup addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Select core with least load for new flow.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return leastLoadCoreSelection
   */
  @VsoMethod
  public Boolean getLeastLoadCoreSelection() {
    return leastLoadCoreSelection;
  }

  /**
   * This is the setter method to the attribute.
   * Select core with least load for new flow.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param leastLoadCoreSelection set the leastLoadCoreSelection.
   */
  @VsoMethod
  public void setLeastLoadCoreSelection(Boolean  leastLoadCoreSelection) {
    this.leastLoadCoreSelection = leastLoadCoreSelection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the license tier which would be used.
   * This field by default inherits the value from cloud.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTier
   */
  @VsoMethod
  public String getLicenseTier() {
    return licenseTier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the license tier which would be used.
   * This field by default inherits the value from cloud.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseTier set the licenseTier.
   */
  @VsoMethod
  public void setLicenseTier(String  licenseTier) {
    this.licenseTier = licenseTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If no license type is specified then default license enforcement for the cloud type is chosen.
   * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseType
   */
  @VsoMethod
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * This is the setter method to the attribute.
   * If no license type is specified then default license enforcement for the cloud type is chosen.
   * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseType set the licenseType.
   */
  @VsoMethod
  public void setLicenseType(String  licenseType) {
    this.licenseType = licenseType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum disk capacity (in mb) to be allocated to an se.
   * This is exclusively used for debug and log data.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return logDisksz
   */
  @VsoMethod
  public Integer getLogDisksz() {
    return logDisksz;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum disk capacity (in mb) to be allocated to an se.
   * This is exclusively used for debug and log data.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param logDisksz set the logDisksz.
   */
  @VsoMethod
  public void setLogDisksz(Integer  logDisksz) {
    this.logDisksz = logDisksz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se will log memory allocation related failure to the se_trace file, wherever available.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return logMallocFailure
   */
  @VsoMethod
  public Boolean getLogMallocFailure() {
    return logMallocFailure;
  }

  /**
   * This is the setter method to the attribute.
   * Se will log memory allocation related failure to the se_trace file, wherever available.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param logMallocFailure set the logMallocFailure.
   */
  @VsoMethod
  public void setLogMallocFailure(Boolean  logMallocFailure) {
    this.logMallocFailure = logMallocFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of external health monitors that can run concurrently in a service engine.
   * This helps control the cpu and memory use by external health monitors.
   * Special values are 0- 'value will be internally calculated based on cpu and memory'.
   * Field introduced in 18.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxConcurrentExternalHm
   */
  @VsoMethod
  public Integer getMaxConcurrentExternalHm() {
    return maxConcurrentExternalHm;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of external health monitors that can run concurrently in a service engine.
   * This helps control the cpu and memory use by external health monitors.
   * Special values are 0- 'value will be internally calculated based on cpu and memory'.
   * Field introduced in 18.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxConcurrentExternalHm set the maxConcurrentExternalHm.
   */
  @VsoMethod
  public void setMaxConcurrentExternalHm(Integer  maxConcurrentExternalHm) {
    this.maxConcurrentExternalHm = maxConcurrentExternalHm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When cpu usage on an se exceeds this threshold, virtual services hosted on this se may be rebalanced to other ses to reduce load.
   * A new se may be created as part of this process.
   * Allowed values are 40-90.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 80.
   * @return maxCpuUsage
   */
  @VsoMethod
  public Integer getMaxCpuUsage() {
    return maxCpuUsage;
  }

  /**
   * This is the setter method to the attribute.
   * When cpu usage on an se exceeds this threshold, virtual services hosted on this se may be rebalanced to other ses to reduce load.
   * A new se may be created as part of this process.
   * Allowed values are 40-90.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 80.
   * @param maxCpuUsage set the maxCpuUsage.
   */
  @VsoMethod
  public void setMaxCpuUsage(Integer  maxCpuUsage) {
    this.maxCpuUsage = maxCpuUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max bytes that can be allocated in a single mempool.
   * Field introduced in 18.1.5.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @return maxMemoryPerMempool
   */
  @VsoMethod
  public Integer getMaxMemoryPerMempool() {
    return maxMemoryPerMempool;
  }

  /**
   * This is the setter method to the attribute.
   * Max bytes that can be allocated in a single mempool.
   * Field introduced in 18.1.5.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @param maxMemoryPerMempool set the maxMemoryPerMempool.
   */
  @VsoMethod
  public void setMaxMemoryPerMempool(Integer  maxMemoryPerMempool) {
    this.maxMemoryPerMempool = maxMemoryPerMempool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configures the maximum number of se_dp processes created on the se, requires se reboot.
   * If not configured, defaults to the number of cpus on the se.
   * This should only be used if user wants to limit the number of se_dps to less than the available cpus on the se.
   * Allowed values are 1-128.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNumSeDps
   */
  @VsoMethod
  public Integer getMaxNumSeDps() {
    return maxNumSeDps;
  }

  /**
   * This is the setter method to the attribute.
   * Configures the maximum number of se_dp processes created on the se, requires se reboot.
   * If not configured, defaults to the number of cpus on the se.
   * This should only be used if user wants to limit the number of se_dps to less than the available cpus on the se.
   * Allowed values are 1-128.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNumSeDps set the maxNumSeDps.
   */
  @VsoMethod
  public void setMaxNumSeDps(Integer  maxNumSeDps) {
    this.maxNumSeDps = maxNumSeDps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Applicable to azure platform only.
   * Maximum number of public ips per azure lb.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return maxPublicIpsPerLb
   */
  @VsoMethod
  public Integer getMaxPublicIpsPerLb() {
    return maxPublicIpsPerLb;
  }

  /**
   * This is the setter method to the attribute.
   * Applicable to azure platform only.
   * Maximum number of public ips per azure lb.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param maxPublicIpsPerLb set the maxPublicIpsPerLb.
   */
  @VsoMethod
  public void setMaxPublicIpsPerLb(Integer  maxPublicIpsPerLb) {
    this.maxPublicIpsPerLb = maxPublicIpsPerLb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of queues per vnic setting to '0' utilises all queues that are distributed across dispatcher cores.
   * Allowed values are 0,1,2,4,8,16.
   * Field introduced in 18.2.7, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxQueuesPerVnic
   */
  @VsoMethod
  public Integer getMaxQueuesPerVnic() {
    return maxQueuesPerVnic;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of queues per vnic setting to '0' utilises all queues that are distributed across dispatcher cores.
   * Allowed values are 0,1,2,4,8,16.
   * Field introduced in 18.2.7, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxQueuesPerVnic set the maxQueuesPerVnic.
   */
  @VsoMethod
  public void setMaxQueuesPerVnic(Integer  maxQueuesPerVnic) {
    this.maxQueuesPerVnic = maxQueuesPerVnic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Applicable to azure platform only.
   * Maximum number of rules per azure lb.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 150.
   * @return maxRulesPerLb
   */
  @VsoMethod
  public Integer getMaxRulesPerLb() {
    return maxRulesPerLb;
  }

  /**
   * This is the setter method to the attribute.
   * Applicable to azure platform only.
   * Maximum number of rules per azure lb.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 150.
   * @param maxRulesPerLb set the maxRulesPerLb.
   */
  @VsoMethod
  public void setMaxRulesPerLb(Integer  maxRulesPerLb) {
    this.maxRulesPerLb = maxRulesPerLb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of active service engines for the virtual service.
   * Allowed values are 1-64.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return maxScaleoutPerVs
   */
  @VsoMethod
  public Integer getMaxScaleoutPerVs() {
    return maxScaleoutPerVs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of active service engines for the virtual service.
   * Allowed values are 1-64.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param maxScaleoutPerVs set the maxScaleoutPerVs.
   */
  @VsoMethod
  public void setMaxScaleoutPerVs(Integer  maxScaleoutPerVs) {
    this.maxScaleoutPerVs = maxScaleoutPerVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of services engines in this group.
   * Allowed values are 0-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxSe
   */
  @VsoMethod
  public Integer getMaxSe() {
    return maxSe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of services engines in this group.
   * Allowed values are 0-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxSe set the maxSe.
   */
  @VsoMethod
  public void setMaxSe(Integer  maxSe) {
    this.maxSe = maxSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtual services that can be placed on a single service engine.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxVsPerSe
   */
  @VsoMethod
  public Integer getMaxVsPerSe() {
    return maxVsPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtual services that can be placed on a single service engine.
   * Allowed values are 1-1000.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxVsPerSe set the maxVsPerSe.
   */
  @VsoMethod
  public void setMaxVsPerSe(Integer  maxVsPerSe) {
    this.maxVsPerSe = maxVsPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mem_reserve of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return memReserve
   */
  @VsoMethod
  public Boolean getMemReserve() {
    return memReserve;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mem_reserve of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param memReserve set the memReserve.
   */
  @VsoMethod
  public void setMemReserve(Boolean  memReserve) {
    this.memReserve = memReserve;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates the percent of memory reserved for config updates.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return memoryForConfigUpdate
   */
  @VsoMethod
  public Integer getMemoryForConfigUpdate() {
    return memoryForConfigUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates the percent of memory reserved for config updates.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param memoryForConfigUpdate set the memoryForConfigUpdate.
   */
  @VsoMethod
  public void setMemoryForConfigUpdate(Integer  memoryForConfigUpdate) {
    this.memoryForConfigUpdate = memoryForConfigUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of memory for each of the service engine virtual machines.
   * Changes to this setting do not affect existing ses.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @return memoryPerSe
   */
  @VsoMethod
  public Integer getMemoryPerSe() {
    return memoryPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of memory for each of the service engine virtual machines.
   * Changes to this setting do not affect existing ses.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @param memoryPerSe set the memoryPerSe.
   */
  @VsoMethod
  public void setMemoryPerSe(Integer  memoryPerSe) {
    this.memoryPerSe = memoryPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management network to use for avi service engines.
   * It is a reference to an object of type network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtNetworkRef
   */
  @VsoMethod
  public String getMgmtNetworkRef() {
    return mgmtNetworkRef;
  }

  /**
   * This is the setter method to the attribute.
   * Management network to use for avi service engines.
   * It is a reference to an object of type network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtNetworkRef set the mgmtNetworkRef.
   */
  @VsoMethod
  public void setMgmtNetworkRef(String  mgmtNetworkRef) {
    this.mgmtNetworkRef = mgmtNetworkRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management subnet to use for avi service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtSubnet
   */
  @VsoMethod
  public IpAddrPrefix getMgmtSubnet() {
    return mgmtSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Management subnet to use for avi service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtSubnet set the mgmtSubnet.
   */
  @VsoMethod
  public void setMgmtSubnet(IpAddrPrefix mgmtSubnet) {
    this.mgmtSubnet = mgmtSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When cpu usage on an se falls below the minimum threshold, virtual services hosted on the se may be consolidated onto other underutilized ses.
   * After consolidation, unused service engines may then be eligible for deletion.
   * Allowed values are 20-60.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return minCpuUsage
   */
  @VsoMethod
  public Integer getMinCpuUsage() {
    return minCpuUsage;
  }

  /**
   * This is the setter method to the attribute.
   * When cpu usage on an se falls below the minimum threshold, virtual services hosted on the se may be consolidated onto other underutilized ses.
   * After consolidation, unused service engines may then be eligible for deletion.
   * Allowed values are 20-60.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param minCpuUsage set the minCpuUsage.
   */
  @VsoMethod
  public void setMinCpuUsage(Integer  minCpuUsage) {
    this.minCpuUsage = minCpuUsage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of active service engines for the virtual service.
   * Allowed values are 1-64.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minScaleoutPerVs
   */
  @VsoMethod
  public Integer getMinScaleoutPerVs() {
    return minScaleoutPerVs;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of active service engines for the virtual service.
   * Allowed values are 1-64.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minScaleoutPerVs set the minScaleoutPerVs.
   */
  @VsoMethod
  public void setMinScaleoutPerVs(Integer  minScaleoutPerVs) {
    this.minScaleoutPerVs = minScaleoutPerVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of services engines in this group (relevant for se autorebalance only).
   * Allowed values are 0-1000.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return minSe
   */
  @VsoMethod
  public Integer getMinSe() {
    return minSe;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of services engines in this group (relevant for se autorebalance only).
   * Allowed values are 0-1000.
   * Field introduced in 17.2.13,18.1.3,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param minSe set the minSe.
   */
  @VsoMethod
  public void setMinSe(Integer  minSe) {
    this.minSe = minSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates the percent of memory reserved for connections.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return minimumConnectionMemory
   */
  @VsoMethod
  public Integer getMinimumConnectionMemory() {
    return minimumConnectionMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates the percent of memory reserved for connections.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param minimumConnectionMemory set the minimumConnectionMemory.
   */
  @VsoMethod
  public void setMinimumConnectionMemory(Integer  minimumConnectionMemory) {
    this.minimumConnectionMemory = minimumConnectionMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Required available config memory to apply any configuration.
   * Allowed values are 0-90.
   * Field deprecated in 18.1.2.
   * Field introduced in 18.1.1.
   * Unit is percent.
   * @return minimumRequiredConfigMemory
   */
  @VsoMethod
  public Integer getMinimumRequiredConfigMemory() {
    return minimumRequiredConfigMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Required available config memory to apply any configuration.
   * Allowed values are 0-90.
   * Field deprecated in 18.1.2.
   * Field introduced in 18.1.1.
   * Unit is percent.
   * @param minimumRequiredConfigMemory set the minimumRequiredConfigMemory.
   */
  @VsoMethod
  public void setMinimumRequiredConfigMemory(Integer  minimumRequiredConfigMemory) {
    this.minimumRequiredConfigMemory = minimumRequiredConfigMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of threads to use for log streaming.
   * Allowed values are 1-100.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return nLogStreamingThreads
   */
  @VsoMethod
  public Integer getNLogStreamingThreads() {
    return nLogStreamingThreads;
  }

  /**
   * This is the setter method to the attribute.
   * Number of threads to use for log streaming.
   * Allowed values are 1-100.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param nLogStreamingThreads set the nLogStreamingThreads.
   */
  @VsoMethod
  public void setNLogStreamingThreads(Integer  nLogStreamingThreads) {
    this.nLogStreamingThreads = nLogStreamingThreads;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat tcp flows in closed state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowTcpClosedTimeout
   */
  @VsoMethod
  public Integer getNatFlowTcpClosedTimeout() {
    return natFlowTcpClosedTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat tcp flows in closed state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowTcpClosedTimeout set the natFlowTcpClosedTimeout.
   */
  @VsoMethod
  public void setNatFlowTcpClosedTimeout(Integer  natFlowTcpClosedTimeout) {
    this.natFlowTcpClosedTimeout = natFlowTcpClosedTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat tcp flows in established state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowTcpEstablishedTimeout
   */
  @VsoMethod
  public Integer getNatFlowTcpEstablishedTimeout() {
    return natFlowTcpEstablishedTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat tcp flows in established state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowTcpEstablishedTimeout set the natFlowTcpEstablishedTimeout.
   */
  @VsoMethod
  public void setNatFlowTcpEstablishedTimeout(Integer  natFlowTcpEstablishedTimeout) {
    this.natFlowTcpEstablishedTimeout = natFlowTcpEstablishedTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat tcp flows in half closed state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowTcpHalfClosedTimeout
   */
  @VsoMethod
  public Integer getNatFlowTcpHalfClosedTimeout() {
    return natFlowTcpHalfClosedTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat tcp flows in half closed state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowTcpHalfClosedTimeout set the natFlowTcpHalfClosedTimeout.
   */
  @VsoMethod
  public void setNatFlowTcpHalfClosedTimeout(Integer  natFlowTcpHalfClosedTimeout) {
    this.natFlowTcpHalfClosedTimeout = natFlowTcpHalfClosedTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat tcp flows in handshake state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowTcpHandshakeTimeout
   */
  @VsoMethod
  public Integer getNatFlowTcpHandshakeTimeout() {
    return natFlowTcpHandshakeTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat tcp flows in handshake state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowTcpHandshakeTimeout set the natFlowTcpHandshakeTimeout.
   */
  @VsoMethod
  public void setNatFlowTcpHandshakeTimeout(Integer  natFlowTcpHandshakeTimeout) {
    this.natFlowTcpHandshakeTimeout = natFlowTcpHandshakeTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat udp flows in noresponse state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowUdpNoresponseTimeout
   */
  @VsoMethod
  public Integer getNatFlowUdpNoresponseTimeout() {
    return natFlowUdpNoresponseTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat udp flows in noresponse state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowUdpNoresponseTimeout set the natFlowUdpNoresponseTimeout.
   */
  @VsoMethod
  public void setNatFlowUdpNoresponseTimeout(Integer  natFlowUdpNoresponseTimeout) {
    this.natFlowUdpNoresponseTimeout = natFlowUdpNoresponseTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in seconds for nat udp flows in response state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @return natFlowUdpResponseTimeout
   */
  @VsoMethod
  public Integer getNatFlowUdpResponseTimeout() {
    return natFlowUdpResponseTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in seconds for nat udp flows in response state.
   * Allowed values are 1-3600.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.5.
   * Unit is seconds.
   * @param natFlowUdpResponseTimeout set the natFlowUdpResponseTimeout.
   */
  @VsoMethod
  public void setNatFlowUdpResponseTimeout(Integer  natFlowUdpResponseTimeout) {
    this.natFlowUdpResponseTimeout = natFlowUdpResponseTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting limits the number of non-significant logs generated per second per core on this se.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return nonSignificantLogThrottle
   */
  @VsoMethod
  public Integer getNonSignificantLogThrottle() {
    return nonSignificantLogThrottle;
  }

  /**
   * This is the setter method to the attribute.
   * This setting limits the number of non-significant logs generated per second per core on this se.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param nonSignificantLogThrottle set the nonSignificantLogThrottle.
   */
  @VsoMethod
  public void setNonSignificantLogThrottle(Integer  nonSignificantLogThrottle) {
    this.nonSignificantLogThrottle = nonSignificantLogThrottle;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of dispatcher cores (0,1,2,4,8 or 16).
   * If set to 0, then number of dispatcher cores is deduced automatically.requires se reboot.
   * Allowed values are 0,1,2,4,8,16.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return numDispatcherCores
   */
  @VsoMethod
  public Integer getNumDispatcherCores() {
    return numDispatcherCores;
  }

  /**
   * This is the setter method to the attribute.
   * Number of dispatcher cores (0,1,2,4,8 or 16).
   * If set to 0, then number of dispatcher cores is deduced automatically.requires se reboot.
   * Allowed values are 0,1,2,4,8,16.
   * Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param numDispatcherCores set the numDispatcherCores.
   */
  @VsoMethod
  public void setNumDispatcherCores(Integer  numDispatcherCores) {
    this.numDispatcherCores = numDispatcherCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of changes in num flow cores sum to ignore.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return numFlowCoresSumChangesToIgnore
   */
  @VsoMethod
  public Integer getNumFlowCoresSumChangesToIgnore() {
    return numFlowCoresSumChangesToIgnore;
  }

  /**
   * This is the setter method to the attribute.
   * Number of changes in num flow cores sum to ignore.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param numFlowCoresSumChangesToIgnore set the numFlowCoresSumChangesToIgnore.
   */
  @VsoMethod
  public void setNumFlowCoresSumChangesToIgnore(Integer  numFlowCoresSumChangesToIgnore) {
    this.numFlowCoresSumChangesToIgnore = numFlowCoresSumChangesToIgnore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration knobs for interse object distribution.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objsyncConfig
   */
  @VsoMethod
  public ObjSyncConfig getObjsyncConfig() {
    return objsyncConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration knobs for interse object distribution.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objsyncConfig set the objsyncConfig.
   */
  @VsoMethod
  public void setObjsyncConfig(ObjSyncConfig objsyncConfig) {
    this.objsyncConfig = objsyncConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp port on se management interface for interse object distribution.
   * Supported only for externally managed security groups.
   * Not supported on full access deployments.
   * Requires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9001.
   * @return objsyncPort
   */
  @VsoMethod
  public Integer getObjsyncPort() {
    return objsyncPort;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp port on se management interface for interse object distribution.
   * Supported only for externally managed security groups.
   * Not supported on full access deployments.
   * Requires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9001.
   * @param objsyncPort set the objsyncPort.
   */
  @VsoMethod
  public void setObjsyncPort(Integer  objsyncPort) {
    this.objsyncPort = objsyncPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 17.1.1.
   * @return openstackAvailabilityZone
   */
  @VsoMethod
  public String getOpenstackAvailabilityZone() {
    return openstackAvailabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 17.1.1.
   * @param openstackAvailabilityZone set the openstackAvailabilityZone.
   */
  @VsoMethod
  public void setOpenstackAvailabilityZone(String  openstackAvailabilityZone) {
    this.openstackAvailabilityZone = openstackAvailabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Maximum of 5 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackAvailabilityZones
   */
  @VsoMethod
  public List<String> getOpenstackAvailabilityZones() {
    return openstackAvailabilityZones;
  }

  /**
   * This is the setter method. this will set the openstackAvailabilityZones
   * Field introduced in 17.1.1.
   * Maximum of 5 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackAvailabilityZones
   */
  @VsoMethod
  public void setOpenstackAvailabilityZones(List<String>  openstackAvailabilityZones) {
    this.openstackAvailabilityZones = openstackAvailabilityZones;
  }

  /**
   * This is the setter method this will set the openstackAvailabilityZones
   * Field introduced in 17.1.1.
   * Maximum of 5 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackAvailabilityZones
   */
  @VsoMethod
  public ServiceEngineGroup addOpenstackAvailabilityZonesItem(String openstackAvailabilityZonesItem) {
    if (this.openstackAvailabilityZones == null) {
      this.openstackAvailabilityZones = new ArrayList<String>();
    }
    this.openstackAvailabilityZones.add(openstackAvailabilityZonesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Avi management network name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackMgmtNetworkName
   */
  @VsoMethod
  public String getOpenstackMgmtNetworkName() {
    return openstackMgmtNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Avi management network name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param openstackMgmtNetworkName set the openstackMgmtNetworkName.
   */
  @VsoMethod
  public void setOpenstackMgmtNetworkName(String  openstackMgmtNetworkName) {
    this.openstackMgmtNetworkName = openstackMgmtNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management network uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackMgmtNetworkUuid
   */
  @VsoMethod
  public String getOpenstackMgmtNetworkUuid() {
    return openstackMgmtNetworkUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Management network uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param openstackMgmtNetworkUuid set the openstackMgmtNetworkUuid.
   */
  @VsoMethod
  public void setOpenstackMgmtNetworkUuid(String  openstackMgmtNetworkUuid) {
    this.openstackMgmtNetworkUuid = openstackMgmtNetworkUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of extra memory to be reserved for use by the operating system on a service engine.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return osReservedMemory
   */
  @VsoMethod
  public Integer getOsReservedMemory() {
    return osReservedMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of extra memory to be reserved for use by the operating system on a service engine.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param osReservedMemory set the osReservedMemory.
   */
  @VsoMethod
  public void setOsReservedMemory(Integer  osReservedMemory) {
    this.osReservedMemory = osReservedMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines the pcap transmit mode of operation.
   * Requires se reboot.
   * Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PCAP_TX_AUTO".
   * @return pcapTxMode
   */
  @VsoMethod
  public String getPcapTxMode() {
    return pcapTxMode;
  }

  /**
   * This is the setter method to the attribute.
   * Determines the pcap transmit mode of operation.
   * Requires se reboot.
   * Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PCAP_TX_AUTO".
   * @param pcapTxMode set the pcapTxMode.
   */
  @VsoMethod
  public void setPcapTxMode(String  pcapTxMode) {
    this.pcapTxMode = pcapTxMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * In pcap mode, reserve a configured portion of tx ring resources for itself and the remaining portion for the rx ring to achieve better balance in
   * terms of queue depth.
   * Requires se reboot.
   * Allowed values are 10-100.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return pcapTxRingRdBalancingFactor
   */
  @VsoMethod
  public Integer getPcapTxRingRdBalancingFactor() {
    return pcapTxRingRdBalancingFactor;
  }

  /**
   * This is the setter method to the attribute.
   * In pcap mode, reserve a configured portion of tx ring resources for itself and the remaining portion for the rx ring to achieve better balance in
   * terms of queue depth.
   * Requires se reboot.
   * Allowed values are 10-100.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param pcapTxRingRdBalancingFactor set the pcapTxRingRdBalancingFactor.
   */
  @VsoMethod
  public void setPcapTxRingRdBalancingFactor(Integer  pcapTxRingRdBalancingFactor) {
    this.pcapTxRingRdBalancingFactor = pcapTxRingRdBalancingFactor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Per-app se mode is designed for deploying dedicated load balancers per app (vs).
   * In this mode, each se is limited to a max of 2 vss.
   * Vcpus in per-app ses count towards licensing usage at 25% rate.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return perApp
   */
  @VsoMethod
  public Boolean getPerApp() {
    return perApp;
  }

  /**
   * This is the setter method to the attribute.
   * Per-app se mode is designed for deploying dedicated load balancers per app (vs).
   * In this mode, each se is limited to a max of 2 vss.
   * Vcpus in per-app ses count towards licensing usage at 25% rate.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param perApp set the perApp.
   */
  @VsoMethod
  public void setPerApp(Boolean  perApp) {
    this.perApp = perApp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable/disable per vs level admission control.enabling this feature will cause the connection and packet throttling on a particular vs that has
   * high packet buffer consumption.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return perVsAdmissionControl
   */
  @VsoMethod
  public Boolean getPerVsAdmissionControl() {
    return perVsAdmissionControl;
  }

  /**
   * This is the setter method to the attribute.
   * Enable/disable per vs level admission control.enabling this feature will cause the connection and packet throttling on a particular vs that has
   * high packet buffer consumption.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param perVsAdmissionControl set the perVsAdmissionControl.
   */
  @VsoMethod
  public void setPerVsAdmissionControl(Boolean  perVsAdmissionControl) {
    this.perVsAdmissionControl = perVsAdmissionControl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If placement mode is 'auto', virtual services are automatically placed on service engines.
   * Enum options - PLACEMENT_MODE_AUTO.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_MODE_AUTO".
   * @return placementMode
   */
  @VsoMethod
  public String getPlacementMode() {
    return placementMode;
  }

  /**
   * This is the setter method to the attribute.
   * If placement mode is 'auto', virtual services are automatically placed on service engines.
   * Enum options - PLACEMENT_MODE_AUTO.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_MODE_AUTO".
   * @param placementMode set the placementMode.
   */
  @VsoMethod
  public void setPlacementMode(String  placementMode) {
    this.placementMode = placementMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or deactivate real time se metrics.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return realtimeSeMetrics
   */
  @VsoMethod
  public MetricsRealTimeUpdate getRealtimeSeMetrics() {
    return realtimeSeMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or deactivate real time se metrics.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param realtimeSeMetrics set the realtimeSeMetrics.
   */
  @VsoMethod
  public void setRealtimeSeMetrics(MetricsRealTimeUpdate realtimeSeMetrics) {
    this.realtimeSeMetrics = realtimeSeMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reboot the vm or host on kernel panic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return rebootOnPanic
   */
  @VsoMethod
  public Boolean getRebootOnPanic() {
    return rebootOnPanic;
  }

  /**
   * This is the setter method to the attribute.
   * Reboot the vm or host on kernel panic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param rebootOnPanic set the rebootOnPanic.
   */
  @VsoMethod
  public void setRebootOnPanic(Boolean  rebootOnPanic) {
    this.rebootOnPanic = rebootOnPanic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reboot the system if the se is stopped.
   * Field deprecated in 18.2.5.
   * @return rebootOnStop
   */
  @VsoMethod
  public Boolean getRebootOnStop() {
    return rebootOnStop;
  }

  /**
   * This is the setter method to the attribute.
   * Reboot the system if the se is stopped.
   * Field deprecated in 18.2.5.
   * @param rebootOnStop set the rebootOnStop.
   */
  @VsoMethod
  public void setRebootOnStop(Boolean  rebootOnStop) {
    this.rebootOnStop = rebootOnStop;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval to re-sync se's time with wall clock time.
   * Allowed values are 8-600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 65536.
   * @return resyncTimeInterval
   */
  @VsoMethod
  public Integer getResyncTimeInterval() {
    return resyncTimeInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval to re-sync se's time with wall clock time.
   * Allowed values are 8-600000.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 65536.
   * @param resyncTimeInterval set the resyncTimeInterval.
   */
  @VsoMethod
  public void setResyncTimeInterval(Integer  resyncTimeInterval) {
    this.resyncTimeInterval = resyncTimeInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the se bandwidth for the bandwidth license.
   * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
   * Field introduced in 17.2.5.
   * Allowed in basic(allowed values- se_bandwidth_unlimited) edition, essentials(allowed values- se_bandwidth_unlimited) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seBandwidthType
   */
  @VsoMethod
  public String getSeBandwidthType() {
    return seBandwidthType;
  }

  /**
   * This is the setter method to the attribute.
   * Select the se bandwidth for the bandwidth license.
   * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
   * Field introduced in 17.2.5.
   * Allowed in basic(allowed values- se_bandwidth_unlimited) edition, essentials(allowed values- se_bandwidth_unlimited) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seBandwidthType set the seBandwidthType.
   */
  @VsoMethod
  public void setSeBandwidthType(String  seBandwidthType) {
    this.seBandwidthType = seBandwidthType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delay the cleanup of flowtable entry.
   * To be used under surveillance of avi support.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return seDelayedFlowDelete
   */
  @VsoMethod
  public Boolean getSeDelayedFlowDelete() {
    return seDelayedFlowDelete;
  }

  /**
   * This is the setter method to the attribute.
   * Delay the cleanup of flowtable entry.
   * To be used under surveillance of avi support.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param seDelayedFlowDelete set the seDelayedFlowDelete.
   */
  @VsoMethod
  public void setSeDelayedFlowDelete(Boolean  seDelayedFlowDelete) {
    this.seDelayedFlowDelete = seDelayedFlowDelete;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration to preserve unused service engine virtual machines before deleting them.
   * If traffic to a virtual service were to spike up abruptly, this se would still be available to be utilized again rather than creating a new se.
   * If this value is set to 0, controller will never delete any ses and administrator has to manually cleanup unused ses.
   * Allowed values are 0-525600.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @return seDeprovisionDelay
   */
  @VsoMethod
  public Integer getSeDeprovisionDelay() {
    return seDeprovisionDelay;
  }

  /**
   * This is the setter method to the attribute.
   * Duration to preserve unused service engine virtual machines before deleting them.
   * If traffic to a virtual service were to spike up abruptly, this se would still be available to be utilized again rather than creating a new se.
   * If this value is set to 0, controller will never delete any ses and administrator has to manually cleanup unused ses.
   * Allowed values are 0-525600.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 120.
   * @param seDeprovisionDelay set the seDeprovisionDelay.
   */
  @VsoMethod
  public void setSeDeprovisionDelay(Integer  seDeprovisionDelay) {
    this.seDeprovisionDelay = seDeprovisionDelay;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_dos_profile of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDosProfile
   */
  @VsoMethod
  public DosThresholdProfile getSeDosProfile() {
    return seDosProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_dos_profile of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seDosProfile set the seDosProfile.
   */
  @VsoMethod
  public void setSeDosProfile(DosThresholdProfile seDosProfile) {
    this.seDosProfile = seDosProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Internal only.
   * Used to simulate se - se hb failure.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seDpHmDrops
   */
  @VsoMethod
  public Integer getSeDpHmDrops() {
    return seDpHmDrops;
  }

  /**
   * This is the setter method to the attribute.
   * Internal only.
   * Used to simulate se - se hb failure.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seDpHmDrops set the seDpHmDrops.
   */
  @VsoMethod
  public void setSeDpHmDrops(Integer  seDpHmDrops) {
    this.seDpHmDrops = seDpHmDrops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Toggle support to run se datapath instances in isolation on exclusive cpus.
   * This improves latency and performance.
   * However, this could reduce the total number of se_dp instances created on that se instance.
   * Supported for >= 8 cpus.
   * Requires se reboot.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return seDpIsolation
   */
  @VsoMethod
  public Boolean getSeDpIsolation() {
    return seDpIsolation;
  }

  /**
   * This is the setter method to the attribute.
   * Toggle support to run se datapath instances in isolation on exclusive cpus.
   * This improves latency and performance.
   * However, this could reduce the total number of se_dp instances created on that se instance.
   * Supported for >= 8 cpus.
   * Requires se reboot.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param seDpIsolation set the seDpIsolation.
   */
  @VsoMethod
  public void setSeDpIsolation(Boolean  seDpIsolation) {
    this.seDpIsolation = seDpIsolation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of cpus for non se-dp tasks in se datapath isolation mode.
   * Translates total cpus minus 'num_non_dp_cpus' for datapath use.
   * It is recommended to reserve an even number of cpus for hyper-threaded processors.
   * Requires se reboot.
   * Allowed values are 1-8.
   * Special values are 0- 'auto'.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seDpIsolationNumNonDpCpus
   */
  @VsoMethod
  public Integer getSeDpIsolationNumNonDpCpus() {
    return seDpIsolationNumNonDpCpus;
  }

  /**
   * This is the setter method to the attribute.
   * Number of cpus for non se-dp tasks in se datapath isolation mode.
   * Translates total cpus minus 'num_non_dp_cpus' for datapath use.
   * It is recommended to reserve an even number of cpus for hyper-threaded processors.
   * Requires se reboot.
   * Allowed values are 1-8.
   * Special values are 0- 'auto'.
   * Field introduced in 20.1.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seDpIsolationNumNonDpCpus set the seDpIsolationNumNonDpCpus.
   */
  @VsoMethod
  public void setSeDpIsolationNumNonDpCpus(Integer  seDpIsolationNumNonDpCpus) {
    this.seDpIsolationNumNonDpCpus = seDpIsolationNumNonDpCpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The highest supported se-se heartbeat protocol version.
   * This version is reported by secondary se to primary se in heartbeat response messages.
   * Allowed values are 1-2.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return seDpMaxHbVersion
   */
  @VsoMethod
  public Integer getSeDpMaxHbVersion() {
    return seDpMaxHbVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The highest supported se-se heartbeat protocol version.
   * This version is reported by secondary se to primary se in heartbeat response messages.
   * Allowed values are 1-2.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param seDpMaxHbVersion set the seDpMaxHbVersion.
   */
  @VsoMethod
  public void setSeDpMaxHbVersion(Integer  seDpMaxHbVersion) {
    this.seDpMaxHbVersion = seDpMaxHbVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time (in seconds) service engine waits for after generating a vnic transmit queue stall event before resetting thenic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seDpVnicQueueStallEventSleep
   */
  @VsoMethod
  public Integer getSeDpVnicQueueStallEventSleep() {
    return seDpVnicQueueStallEventSleep;
  }

  /**
   * This is the setter method to the attribute.
   * Time (in seconds) service engine waits for after generating a vnic transmit queue stall event before resetting thenic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seDpVnicQueueStallEventSleep set the seDpVnicQueueStallEventSleep.
   */
  @VsoMethod
  public void setSeDpVnicQueueStallEventSleep(Integer  seDpVnicQueueStallEventSleep) {
    this.seDpVnicQueueStallEventSleep = seDpVnicQueueStallEventSleep;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of consecutive transmit failures to look for before generating a vnic transmit queue stall event.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return seDpVnicQueueStallThreshold
   */
  @VsoMethod
  public Integer getSeDpVnicQueueStallThreshold() {
    return seDpVnicQueueStallThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Number of consecutive transmit failures to look for before generating a vnic transmit queue stall event.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param seDpVnicQueueStallThreshold set the seDpVnicQueueStallThreshold.
   */
  @VsoMethod
  public void setSeDpVnicQueueStallThreshold(Integer  seDpVnicQueueStallThreshold) {
    this.seDpVnicQueueStallThreshold = seDpVnicQueueStallThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time (in milliseconds) to wait for network/nic recovery on detecting a transmit queue stall after which service engine resets the nic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return seDpVnicQueueStallTimeout
   */
  @VsoMethod
  public Integer getSeDpVnicQueueStallTimeout() {
    return seDpVnicQueueStallTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time (in milliseconds) to wait for network/nic recovery on detecting a transmit queue stall after which service engine resets the nic.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param seDpVnicQueueStallTimeout set the seDpVnicQueueStallTimeout.
   */
  @VsoMethod
  public void setSeDpVnicQueueStallTimeout(Integer  seDpVnicQueueStallTimeout) {
    this.seDpVnicQueueStallTimeout = seDpVnicQueueStallTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting se.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return seDpVnicRestartOnQueueStallCount
   */
  @VsoMethod
  public Integer getSeDpVnicRestartOnQueueStallCount() {
    return seDpVnicRestartOnQueueStallCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting se.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param seDpVnicRestartOnQueueStallCount set the seDpVnicRestartOnQueueStallCount.
   */
  @VsoMethod
  public void setSeDpVnicRestartOnQueueStallCount(Integer  seDpVnicRestartOnQueueStallCount) {
    this.seDpVnicRestartOnQueueStallCount = seDpVnicRestartOnQueueStallCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a se restart.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @return seDpVnicStallSeRestartWindow
   */
  @VsoMethod
  public Integer getSeDpVnicStallSeRestartWindow() {
    return seDpVnicStallSeRestartWindow;
  }

  /**
   * This is the setter method to the attribute.
   * Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a se restart.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @param seDpVnicStallSeRestartWindow set the seDpVnicStallSeRestartWindow.
   */
  @VsoMethod
  public void setSeDpVnicStallSeRestartWindow(Integer  seDpVnicStallSeRestartWindow) {
    this.seDpVnicStallSeRestartWindow = seDpVnicStallSeRestartWindow;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if dpdk pool mode driver should be used or not   0  automatically determine based on hypervisor/nic type 1  unconditionally use dpdk
   * poll mode driver 2  don't use dpdk poll mode driver.requires se reboot.
   * Allowed values are 0-2.
   * Field introduced in 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seDpdkPmd
   */
  @VsoMethod
  public Integer getSeDpdkPmd() {
    return seDpdkPmd;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if dpdk pool mode driver should be used or not   0  automatically determine based on hypervisor/nic type 1  unconditionally use dpdk
   * poll mode driver 2  don't use dpdk poll mode driver.requires se reboot.
   * Allowed values are 0-2.
   * Field introduced in 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seDpdkPmd set the seDpdkPmd.
   */
  @VsoMethod
  public void setSeDpdkPmd(Integer  seDpdkPmd) {
    this.seDpdkPmd = seDpdkPmd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flow probe retry count if no replies are received.requires se reboot.
   * Allowed values are 0-5.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return seFlowProbeRetries
   */
  @VsoMethod
  public Integer getSeFlowProbeRetries() {
    return seFlowProbeRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Flow probe retry count if no replies are received.requires se reboot.
   * Allowed values are 0-5.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param seFlowProbeRetries set the seFlowProbeRetries.
   */
  @VsoMethod
  public void setSeFlowProbeRetries(Integer  seFlowProbeRetries) {
    this.seFlowProbeRetries = seFlowProbeRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout in milliseconds for flow probe retries.requires se reboot.
   * Allowed values are 20-50.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 40.
   * @return seFlowProbeRetryTimer
   */
  @VsoMethod
  public Integer getSeFlowProbeRetryTimer() {
    return seFlowProbeRetryTimer;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout in milliseconds for flow probe retries.requires se reboot.
   * Allowed values are 20-50.
   * Field introduced in 18.2.5.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 40.
   * @param seFlowProbeRetryTimer set the seFlowProbeRetryTimer.
   */
  @VsoMethod
  public void setSeFlowProbeRetryTimer(Integer  seFlowProbeRetryTimer) {
    this.seFlowProbeRetryTimer = seFlowProbeRetryTimer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout in milliseconds for flow probe entries.
   * Allowed values are 10-200.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is milliseconds.
   * @return seFlowProbeTimer
   */
  @VsoMethod
  public Integer getSeFlowProbeTimer() {
    return seFlowProbeTimer;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout in milliseconds for flow probe entries.
   * Allowed values are 10-200.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.1.4, 18.2.1.
   * Unit is milliseconds.
   * @param seFlowProbeTimer set the seFlowProbeTimer.
   */
  @VsoMethod
  public void setSeFlowProbeTimer(Integer  seFlowProbeTimer) {
    this.seFlowProbeTimer = seFlowProbeTimer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Analytics policy for serviceenginegroup.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupAnalyticsPolicy
   */
  @VsoMethod
  public SeGroupAnalyticsPolicy getSeGroupAnalyticsPolicy() {
    return seGroupAnalyticsPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Analytics policy for serviceenginegroup.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupAnalyticsPolicy set the seGroupAnalyticsPolicy.
   */
  @VsoMethod
  public void setSeGroupAnalyticsPolicy(SeGroupAnalyticsPolicy seGroupAnalyticsPolicy) {
    this.seGroupAnalyticsPolicy = seGroupAnalyticsPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controls the distribution of se data path processes on cpus which support hyper-threading.
   * Requires hyper-threading to be enabled at host level.
   * Requires se reboot.
   * For more details please refer to se placement kb.
   * Enum options - SE_CPU_HT_AUTO, SE_CPU_HT_SPARSE_DISPATCHER_PRIORITY, SE_CPU_HT_SPARSE_PROXY_PRIORITY, SE_CPU_HT_PACKED_CORES.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_CPU_HT_AUTO".
   * @return seHyperthreadedMode
   */
  @VsoMethod
  public String getSeHyperthreadedMode() {
    return seHyperthreadedMode;
  }

  /**
   * This is the setter method to the attribute.
   * Controls the distribution of se data path processes on cpus which support hyper-threading.
   * Requires hyper-threading to be enabled at host level.
   * Requires se reboot.
   * For more details please refer to se placement kb.
   * Enum options - SE_CPU_HT_AUTO, SE_CPU_HT_SPARSE_DISPATCHER_PRIORITY, SE_CPU_HT_SPARSE_PROXY_PRIORITY, SE_CPU_HT_PACKED_CORES.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_CPU_HT_AUTO".
   * @param seHyperthreadedMode set the seHyperthreadedMode.
   */
  @VsoMethod
  public void setSeHyperthreadedMode(String  seHyperthreadedMode) {
    this.seHyperthreadedMode = seHyperthreadedMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if se-se ipc messages are encapsulated in an ip header       0        automatically determine based on hypervisor type    1        use
   * ip encap unconditionally    ~[0,1]   don't use ip encaprequires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seIpEncapIpc
   */
  @VsoMethod
  public Integer getSeIpEncapIpc() {
    return seIpEncapIpc;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if se-se ipc messages are encapsulated in an ip header       0        automatically determine based on hypervisor type    1        use
   * ip encap unconditionally    ~[0,1]   don't use ip encaprequires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seIpEncapIpc set the seIpEncapIpc.
   */
  @VsoMethod
  public void setSeIpEncapIpc(Integer  seIpEncapIpc) {
    this.seIpEncapIpc = seIpEncapIpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Udp port for se_dp ipc in docker bridge mode.
   * Field deprecated in 20.1.1.
   * Field introduced in 17.1.2.
   * @return seIpcUdpPort
   */
  @VsoMethod
  public Integer getSeIpcUdpPort() {
    return seIpcUdpPort;
  }

  /**
   * This is the setter method to the attribute.
   * Udp port for se_dp ipc in docker bridge mode.
   * Field deprecated in 20.1.1.
   * Field introduced in 17.1.2.
   * @param seIpcUdpPort set the seIpcUdpPort.
   */
  @VsoMethod
  public void setSeIpcUdpPort(Integer  seIpcUdpPort) {
    this.seIpcUdpPort = seIpcUdpPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This knob controls the resource availability and burst size used between se datapath and kni.
   * This helps in minimising packet drops when there is higher kni traffic (non-vip traffic from and to linux).
   * The factor takes the following values      0-default.
   * 1-doubles the burst size and kni resources.
   * 2-quadruples the burst size and kni resources.
   * Allowed values are 0-2.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seKniBurstFactor
   */
  @VsoMethod
  public Integer getSeKniBurstFactor() {
    return seKniBurstFactor;
  }

  /**
   * This is the setter method to the attribute.
   * This knob controls the resource availability and burst size used between se datapath and kni.
   * This helps in minimising packet drops when there is higher kni traffic (non-vip traffic from and to linux).
   * The factor takes the following values      0-default.
   * 1-doubles the burst size and kni resources.
   * 2-quadruples the burst size and kni resources.
   * Allowed values are 0-2.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seKniBurstFactor set the seKniBurstFactor.
   */
  @VsoMethod
  public void setSeKniBurstFactor(Integer  seKniBurstFactor) {
    this.seKniBurstFactor = seKniBurstFactor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if se-se ipc messages use se interface ip instead of vip        0        automatically determine based on hypervisor type    1
   * use se interface ip unconditionally    ~[0,1]   don't use se interface iprequires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seL3EncapIpc
   */
  @VsoMethod
  public Integer getSeL3EncapIpc() {
    return seL3EncapIpc;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if se-se ipc messages use se interface ip instead of vip        0        automatically determine based on hypervisor type    1
   * use se interface ip unconditionally    ~[0,1]   don't use se interface iprequires se reboot.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seL3EncapIpc set the seL3EncapIpc.
   */
  @VsoMethod
  public void setSeL3EncapIpc(Integer  seL3EncapIpc) {
    this.seL3EncapIpc = seL3EncapIpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable large receive optimization for vnics.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return seLro
   */
  @VsoMethod
  public Boolean getSeLro() {
    return seLro;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable large receive optimization for vnics.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param seLro set the seLro.
   */
  @VsoMethod
  public void setSeLro(Boolean  seLro) {
    this.seLro = seLro;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The retry count for the multi-producer enqueue before yielding the cpu.
   * To be used under surveillance of avi support.
   * Field introduced in 20.1.3.
   * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @return seMpRingRetryCount
   */
  @VsoMethod
  public Integer getSeMpRingRetryCount() {
    return seMpRingRetryCount;
  }

  /**
   * This is the setter method to the attribute.
   * The retry count for the multi-producer enqueue before yielding the cpu.
   * To be used under surveillance of avi support.
   * Field introduced in 20.1.3.
   * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @param seMpRingRetryCount set the seMpRingRetryCount.
   */
  @VsoMethod
  public void setSeMpRingRetryCount(Integer  seMpRingRetryCount) {
    this.seMpRingRetryCount = seMpRingRetryCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mtu for the vnics of ses in the se group.
   * Allowed values are 512-9000.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seMtu
   */
  @VsoMethod
  public Integer getSeMtu() {
    return seMtu;
  }

  /**
   * This is the setter method to the attribute.
   * Mtu for the vnics of ses in the se group.
   * Allowed values are 512-9000.
   * Field introduced in 18.2.8, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seMtu set the seMtu.
   */
  @VsoMethod
  public void setSeMtu(Integer  seMtu) {
    this.seMtu = seMtu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Prefix to use for virtual machine name of service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as "Avi".
   * @return seNamePrefix
   */
  @VsoMethod
  public String getSeNamePrefix() {
    return seNamePrefix;
  }

  /**
   * This is the setter method to the attribute.
   * Prefix to use for virtual machine name of service engines.
   * Default value when not specified in API or module is interpreted by Avi Controller as "Avi".
   * @param seNamePrefix set the seNamePrefix.
   */
  @VsoMethod
  public void setSeNamePrefix(String  seNamePrefix) {
    this.seNamePrefix = seNamePrefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enables lookahead mode of packet receive in pcap mode.
   * Introduced to overcome an issue with hv_netvsc driver.
   * Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return sePcapLookahead
   */
  @VsoMethod
  public Boolean getSePcapLookahead() {
    return sePcapLookahead;
  }

  /**
   * This is the setter method to the attribute.
   * Enables lookahead mode of packet receive in pcap mode.
   * Introduced to overcome an issue with hv_netvsc driver.
   * Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param sePcapLookahead set the sePcapLookahead.
   */
  @VsoMethod
  public void setSePcapLookahead(Boolean  sePcapLookahead) {
    this.sePcapLookahead = sePcapLookahead;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen.
   * The optimum value will be chosen based on se-memory, cloud type and number of interfaces.requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return sePcapPktCount
   */
  @VsoMethod
  public Integer getSePcapPktCount() {
    return sePcapPktCount;
  }

  /**
   * This is the setter method to the attribute.
   * Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen.
   * The optimum value will be chosen based on se-memory, cloud type and number of interfaces.requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param sePcapPktCount set the sePcapPktCount.
   */
  @VsoMethod
  public void setSePcapPktCount(Integer  sePcapPktCount) {
    this.sePcapPktCount = sePcapPktCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max size of each packet in the pcap interface.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 69632.
   * @return sePcapPktSz
   */
  @VsoMethod
  public Integer getSePcapPktSz() {
    return sePcapPktSz;
  }

  /**
   * This is the setter method to the attribute.
   * Max size of each packet in the pcap interface.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 69632.
   * @param sePcapPktSz set the sePcapPktSz.
   */
  @VsoMethod
  public void setSePcapPktSz(Integer  sePcapPktSz) {
    this.sePcapPktSz = sePcapPktSz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bypass the kernel's traffic control layer, to deliver packets directly to the driver.
   * Enabling this feature results in egress packets not being captured in host tcpdump.
   * Note   brief packet reordering or loss may occur upon toggle.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sePcapQdiscBypass
   */
  @VsoMethod
  public Boolean getSePcapQdiscBypass() {
    return sePcapQdiscBypass;
  }

  /**
   * This is the setter method to the attribute.
   * Bypass the kernel's traffic control layer, to deliver packets directly to the driver.
   * Enabling this feature results in egress packets not being captured in host tcpdump.
   * Note   brief packet reordering or loss may occur upon toggle.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sePcapQdiscBypass set the sePcapQdiscBypass.
   */
  @VsoMethod
  public void setSePcapQdiscBypass(Boolean  sePcapQdiscBypass) {
    this.sePcapQdiscBypass = sePcapQdiscBypass;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency in seconds at which periodically a pcap reinit check is triggered.
   * May be used in conjunction with the configuration pcap_reinit_threshold.
   * (valid range   15 mins - 12 hours, 0 - disables).
   * Allowed values are 900-43200.
   * Special values are 0- 'disable'.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return sePcapReinitFrequency
   */
  @VsoMethod
  public Integer getSePcapReinitFrequency() {
    return sePcapReinitFrequency;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency in seconds at which periodically a pcap reinit check is triggered.
   * May be used in conjunction with the configuration pcap_reinit_threshold.
   * (valid range   15 mins - 12 hours, 0 - disables).
   * Allowed values are 900-43200.
   * Special values are 0- 'disable'.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param sePcapReinitFrequency set the sePcapReinitFrequency.
   */
  @VsoMethod
  public void setSePcapReinitFrequency(Integer  sePcapReinitFrequency) {
    this.sePcapReinitFrequency = sePcapReinitFrequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threshold for input packet receive errors in pcap mode exceeding which a pcap reinit is triggered.
   * If not set, an unconditional reinit is performed.
   * This value is checked every pcap_reinit_frequency interval.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Unit is metric_count.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return sePcapReinitThreshold
   */
  @VsoMethod
  public Integer getSePcapReinitThreshold() {
    return sePcapReinitThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Threshold for input packet receive errors in pcap mode exceeding which a pcap reinit is triggered.
   * If not set, an unconditional reinit is performed.
   * This value is checked every pcap_reinit_frequency interval.
   * Field introduced in 17.2.13, 18.1.3, 18.2.1.
   * Unit is metric_count.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param sePcapReinitThreshold set the sePcapReinitThreshold.
   */
  @VsoMethod
  public void setSePcapReinitThreshold(Integer  sePcapReinitThreshold) {
    this.sePcapReinitThreshold = sePcapReinitThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp port on se where echo service will be run.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 7.
   * @return seProbePort
   */
  @VsoMethod
  public Integer getSeProbePort() {
    return seProbePort;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp port on se where echo service will be run.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 7.
   * @param seProbePort set the seProbePort.
   */
  @VsoMethod
  public void setSeProbePort(Integer  seProbePort) {
    this.seProbePort = seProbePort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Udp port for punted packets in docker bridge mode.
   * Field deprecated in 20.1.1.
   * Field introduced in 17.1.2.
   * @return seRemotePuntUdpPort
   */
  @VsoMethod
  public Integer getSeRemotePuntUdpPort() {
    return seRemotePuntUdpPort;
  }

  /**
   * This is the setter method to the attribute.
   * Udp port for punted packets in docker bridge mode.
   * Field deprecated in 20.1.1.
   * Field introduced in 17.1.2.
   * @param seRemotePuntUdpPort set the seRemotePuntUdpPort.
   */
  @VsoMethod
  public void setSeRemotePuntUdpPort(Integer  seRemotePuntUdpPort) {
    this.seRemotePuntUdpPort = seRemotePuntUdpPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter properties.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRlProp
   */
  @VsoMethod
  public RateLimiterProperties getSeRlProp() {
    return seRlProp;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter properties.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRlProp set the seRlProp.
   */
  @VsoMethod
  public void setSeRlProp(RateLimiterProperties seRlProp) {
    this.seRlProp = seRlProp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable routing via service engine datapath.
   * When disabled, routing is done by the linux kernel.
   * Ip routing needs to be enabled in service engine group for se routing to be effective.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.3.
   * @return seRouting
   */
  @VsoMethod
  public Boolean getSeRouting() {
    return seRouting;
  }

  /**
   * This is the setter method to the attribute.
   * Enable routing via service engine datapath.
   * When disabled, routing is done by the linux kernel.
   * Ip routing needs to be enabled in service engine group for se routing to be effective.
   * Field deprecated in 18.2.5.
   * Field introduced in 18.2.3.
   * @param seRouting set the seRouting.
   */
  @VsoMethod
  public void setSeRouting(Boolean  seRouting) {
    this.seRouting = seRouting;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return seRumSamplingNavInterval
   */
  @VsoMethod
  public Integer getSeRumSamplingNavInterval() {
    return seRumSamplingNavInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param seRumSamplingNavInterval set the seRumSamplingNavInterval.
   */
  @VsoMethod
  public void setSeRumSamplingNavInterval(Integer  seRumSamplingNavInterval) {
    this.seRumSamplingNavInterval = seRumSamplingNavInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of navigation timing data from the end user client, used for sampling to get client insights.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return seRumSamplingNavPercent
   */
  @VsoMethod
  public Integer getSeRumSamplingNavPercent() {
    return seRumSamplingNavPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of navigation timing data from the end user client, used for sampling to get client insights.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param seRumSamplingNavPercent set the seRumSamplingNavPercent.
   */
  @VsoMethod
  public void setSeRumSamplingNavPercent(Integer  seRumSamplingNavPercent) {
    this.seRumSamplingNavPercent = seRumSamplingNavPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return seRumSamplingResInterval
   */
  @VsoMethod
  public Integer getSeRumSamplingResInterval() {
    return seRumSamplingResInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client.
   * Field introduced in 18.2.6.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param seRumSamplingResInterval set the seRumSamplingResInterval.
   */
  @VsoMethod
  public void setSeRumSamplingResInterval(Integer  seRumSamplingResInterval) {
    this.seRumSamplingResInterval = seRumSamplingResInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of resource timing data from the end user client used for sampling to get client insight.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return seRumSamplingResPercent
   */
  @VsoMethod
  public Integer getSeRumSamplingResPercent() {
    return seRumSamplingResPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of resource timing data from the end user client used for sampling to get client insight.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param seRumSamplingResPercent set the seRumSamplingResPercent.
   */
  @VsoMethod
  public void setSeRumSamplingResPercent(Integer  seRumSamplingResPercent) {
    this.seRumSamplingResPercent = seRumSamplingResPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sideband traffic will be handled by a dedicated core.requires se reboot.
   * Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return seSbDedicatedCore
   */
  @VsoMethod
  public Boolean getSeSbDedicatedCore() {
    return seSbDedicatedCore;
  }

  /**
   * This is the setter method to the attribute.
   * Sideband traffic will be handled by a dedicated core.requires se reboot.
   * Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param seSbDedicatedCore set the seSbDedicatedCore.
   */
  @VsoMethod
  public void setSeSbDedicatedCore(Boolean  seSbDedicatedCore) {
    this.seSbDedicatedCore = seSbDedicatedCore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of sideband threads per se.requires se reboot.
   * Allowed values are 1-128.
   * Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return seSbThreads
   */
  @VsoMethod
  public Integer getSeSbThreads() {
    return seSbThreads;
  }

  /**
   * This is the setter method to the attribute.
   * Number of sideband threads per se.requires se reboot.
   * Allowed values are 1-128.
   * Field introduced in 16.5.2, 17.1.9, 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param seSbThreads set the seSbThreads.
   */
  @VsoMethod
  public void setSeSbThreads(Integer  seSbThreads) {
    this.seSbThreads = seSbThreads;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Multiplier for se threads based on vcpu.
   * Allowed values are 1-10.
   * Allowed in basic(allowed values- 1) edition, essentials(allowed values- 1) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return seThreadMultiplier
   */
  @VsoMethod
  public Integer getSeThreadMultiplier() {
    return seThreadMultiplier;
  }

  /**
   * This is the setter method to the attribute.
   * Multiplier for se threads based on vcpu.
   * Allowed values are 1-10.
   * Allowed in basic(allowed values- 1) edition, essentials(allowed values- 1) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param seThreadMultiplier set the seThreadMultiplier.
   */
  @VsoMethod
  public void setSeThreadMultiplier(Integer  seThreadMultiplier) {
    this.seThreadMultiplier = seThreadMultiplier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Traceroute port range.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seTracertPortRange
   */
  @VsoMethod
  public PortRange getSeTracertPortRange() {
    return seTracertPortRange;
  }

  /**
   * This is the setter method to the attribute.
   * Traceroute port range.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seTracertPortRange set the seTracertPortRange.
   */
  @VsoMethod
  public void setSeTracertPortRange(PortRange seTracertPortRange) {
    this.seTracertPortRange = seTracertPortRange;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if direct secondary return (dsr) from secondary se is active or not  0  automatically determine based on hypervisor type.
   * 1  enable tunnel mode - dsr is unconditionally disabled.
   * 2  disable tunnel mode - dsr is unconditionally enabled.
   * Tunnel mode can be enabled or disabled at run-time.
   * Allowed values are 0-2.
   * Field introduced in 17.1.1.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seTunnelMode
   */
  @VsoMethod
  public Integer getSeTunnelMode() {
    return seTunnelMode;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if direct secondary return (dsr) from secondary se is active or not  0  automatically determine based on hypervisor type.
   * 1  enable tunnel mode - dsr is unconditionally disabled.
   * 2  disable tunnel mode - dsr is unconditionally enabled.
   * Tunnel mode can be enabled or disabled at run-time.
   * Allowed values are 0-2.
   * Field introduced in 17.1.1.
   * Allowed in basic(allowed values- 0) edition, essentials(allowed values- 0) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seTunnelMode set the seTunnelMode.
   */
  @VsoMethod
  public void setSeTunnelMode(Integer  seTunnelMode) {
    this.seTunnelMode = seTunnelMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Udp port for tunneled packets from secondary to primary se in docker bridge mode.requires se reboot.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1550.
   * @return seTunnelUdpPort
   */
  @VsoMethod
  public Integer getSeTunnelUdpPort() {
    return seTunnelUdpPort;
  }

  /**
   * This is the setter method to the attribute.
   * Udp port for tunneled packets from secondary to primary se in docker bridge mode.requires se reboot.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1550.
   * @param seTunnelUdpPort set the seTunnelUdpPort.
   */
  @VsoMethod
  public void setSeTunnelUdpPort(Integer  seTunnelUdpPort) {
    this.seTunnelUdpPort = seTunnelUdpPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of packets to batch for transmit to the nic.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @return seTxBatchSize
   */
  @VsoMethod
  public Integer getSeTxBatchSize() {
    return seTxBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Number of packets to batch for transmit to the nic.
   * Requires se reboot.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @param seTxBatchSize set the seTxBatchSize.
   */
  @VsoMethod
  public void setSeTxBatchSize(Integer  seTxBatchSize) {
    this.seTxBatchSize = seTxBatchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Once the tx queue of the dispatcher reaches this threshold, hardware queues are not polled for further packets.
   * To be used under surveillance of avi support.
   * Allowed values are 512-32768.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- 2048) edition, essentials(allowed values- 2048) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @return seTxqThreshold
   */
  @VsoMethod
  public Integer getSeTxqThreshold() {
    return seTxqThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Once the tx queue of the dispatcher reaches this threshold, hardware queues are not polled for further packets.
   * To be used under surveillance of avi support.
   * Allowed values are 512-32768.
   * Field introduced in 20.1.2.
   * Allowed in basic(allowed values- 2048) edition, essentials(allowed values- 2048) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @param seTxqThreshold set the seTxqThreshold.
   */
  @VsoMethod
  public void setSeTxqThreshold(Integer  seTxqThreshold) {
    this.seTxqThreshold = seTxqThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if se-se ipc messages are encapsulated in a udp header  0  automatically determine based on hypervisor type.
   * 1  use udp encap unconditionally.requires se reboot.
   * Allowed values are 0-1.
   * Field introduced in 17.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seUdpEncapIpc
   */
  @VsoMethod
  public Integer getSeUdpEncapIpc() {
    return seUdpEncapIpc;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if se-se ipc messages are encapsulated in a udp header  0  automatically determine based on hypervisor type.
   * 1  use udp encap unconditionally.requires se reboot.
   * Allowed values are 0-1.
   * Field introduced in 17.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seUdpEncapIpc set the seUdpEncapIpc.
   */
  @VsoMethod
  public void setSeUdpEncapIpc(Integer  seUdpEncapIpc) {
    this.seUdpEncapIpc = seUdpEncapIpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if dpdk library should be used or not   0  automatically determine based on hypervisor type 1  use dpdk if pcap is not enabled 2
   * don't use dpdk.
   * Allowed values are 0-2.
   * Field introduced in 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seUseDpdk
   */
  @VsoMethod
  public Integer getSeUseDpdk() {
    return seUseDpdk;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if dpdk library should be used or not   0  automatically determine based on hypervisor type 1  use dpdk if pcap is not enabled 2
   * don't use dpdk.
   * Allowed values are 0-2.
   * Field introduced in 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seUseDpdk set the seUseDpdk.
   */
  @VsoMethod
  public void setSeUseDpdk(Integer  seUseDpdk) {
    this.seUseDpdk = seUseDpdk;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the frequency in milliseconds of software transmit spillover queue flush when enabled.
   * This is necessary to flush any packets in the spillover queue in the absence of a packet transmit in the normal course of operation.
   * Allowed values are 50-500.
   * Special values are 0- 'disable'.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seVnicTxSwQueueFlushFrequency
   */
  @VsoMethod
  public Integer getSeVnicTxSwQueueFlushFrequency() {
    return seVnicTxSwQueueFlushFrequency;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the frequency in milliseconds of software transmit spillover queue flush when enabled.
   * This is necessary to flush any packets in the spillover queue in the absence of a packet transmit in the normal course of operation.
   * Allowed values are 50-500.
   * Special values are 0- 'disable'.
   * Field introduced in 20.1.1.
   * Unit is milliseconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seVnicTxSwQueueFlushFrequency set the seVnicTxSwQueueFlushFrequency.
   */
  @VsoMethod
  public void setSeVnicTxSwQueueFlushFrequency(Integer  seVnicTxSwQueueFlushFrequency) {
    this.seVnicTxSwQueueFlushFrequency = seVnicTxSwQueueFlushFrequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure the size of software transmit spillover queue when enabled.
   * Requires se reboot.
   * Allowed values are 128-2048.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @return seVnicTxSwQueueSize
   */
  @VsoMethod
  public Integer getSeVnicTxSwQueueSize() {
    return seVnicTxSwQueueSize;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the size of software transmit spillover queue when enabled.
   * Requires se reboot.
   * Allowed values are 128-2048.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @param seVnicTxSwQueueSize set the seVnicTxSwQueueSize.
   */
  @VsoMethod
  public void setSeVnicTxSwQueueSize(Integer  seVnicTxSwQueueSize) {
    this.seVnicTxSwQueueSize = seVnicTxSwQueueSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of aggregated vs heartbeat packets to send in a batch.
   * Allowed values are 1-256.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @return seVsHbMaxPktsInBatch
   */
  @VsoMethod
  public Integer getSeVsHbMaxPktsInBatch() {
    return seVsHbMaxPktsInBatch;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of aggregated vs heartbeat packets to send in a batch.
   * Allowed values are 1-256.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @param seVsHbMaxPktsInBatch set the seVsHbMaxPktsInBatch.
   */
  @VsoMethod
  public void setSeVsHbMaxPktsInBatch(Integer  seVsHbMaxPktsInBatch) {
    this.seVsHbMaxPktsInBatch = seVsHbMaxPktsInBatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices for which heartbeat messages are aggregated in one packet.
   * Allowed values are 1-1024.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @return seVsHbMaxVsInPkt
   */
  @VsoMethod
  public Integer getSeVsHbMaxVsInPkt() {
    return seVsHbMaxVsInPkt;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices for which heartbeat messages are aggregated in one packet.
   * Allowed values are 1-1024.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 256.
   * @param seVsHbMaxVsInPkt set the seVsHbMaxVsInPkt.
   */
  @VsoMethod
  public void setSeVsHbMaxVsInPkt(Integer  seVsHbMaxVsInPkt) {
    this.seVsHbMaxVsInPkt = seVsHbMaxVsInPkt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ses to elect a primary amongst themselves in the absence of a connectivity to controller.
   * Field introduced in 18.1.2.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return selfSeElection
   */
  @VsoMethod
  public Boolean getSelfSeElection() {
    return selfSeElection;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ses to elect a primary amongst themselves in the absence of a connectivity to controller.
   * Field introduced in 18.1.2.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param selfSeElection set the selfSeElection.
   */
  @VsoMethod
  public void setSelfSeElection(Boolean  selfSeElection) {
    this.selfSeElection = selfSeElection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 18.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIp6Subnets
   */
  @VsoMethod
  public List<IpAddrPrefix> getServiceIp6Subnets() {
    return serviceIp6Subnets;
  }

  /**
   * This is the setter method. this will set the serviceIp6Subnets
   * Ipv6 subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 18.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIp6Subnets
   */
  @VsoMethod
  public void setServiceIp6Subnets(List<IpAddrPrefix>  serviceIp6Subnets) {
    this.serviceIp6Subnets = serviceIp6Subnets;
  }

  /**
   * This is the setter method this will set the serviceIp6Subnets
   * Ipv6 subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 18.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIp6Subnets
   */
  @VsoMethod
  public ServiceEngineGroup addServiceIp6SubnetsItem(IpAddrPrefix serviceIp6SubnetsItem) {
    if (this.serviceIp6Subnets == null) {
      this.serviceIp6Subnets = new ArrayList<IpAddrPrefix>();
    }
    this.serviceIp6Subnets.add(serviceIp6SubnetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 17.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIpSubnets
   */
  @VsoMethod
  public List<IpAddrPrefix> getServiceIpSubnets() {
    return serviceIpSubnets;
  }

  /**
   * This is the setter method. this will set the serviceIpSubnets
   * Subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 17.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIpSubnets
   */
  @VsoMethod
  public void setServiceIpSubnets(List<IpAddrPrefix>  serviceIpSubnets) {
    this.serviceIpSubnets = serviceIpSubnets;
  }

  /**
   * This is the setter method this will set the serviceIpSubnets
   * Subnets assigned to the se group.
   * Required for vs group placement.
   * Field introduced in 17.1.1.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceIpSubnets
   */
  @VsoMethod
  public ServiceEngineGroup addServiceIpSubnetsItem(IpAddrPrefix serviceIpSubnetsItem) {
    if (this.serviceIpSubnets == null) {
      this.serviceIpSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.serviceIpSubnets.add(serviceIpSubnetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Minimum required shared memory to apply any configuration.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return shmMinimumConfigMemory
   */
  @VsoMethod
  public Integer getShmMinimumConfigMemory() {
    return shmMinimumConfigMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum required shared memory to apply any configuration.
   * Allowed values are 0-100.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param shmMinimumConfigMemory set the shmMinimumConfigMemory.
   */
  @VsoMethod
  public void setShmMinimumConfigMemory(Integer  shmMinimumConfigMemory) {
    this.shmMinimumConfigMemory = shmMinimumConfigMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting limits the number of significant logs generated per second per core on this se.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return significantLogThrottle
   */
  @VsoMethod
  public Integer getSignificantLogThrottle() {
    return significantLogThrottle;
  }

  /**
   * This is the setter method to the attribute.
   * This setting limits the number of significant logs generated per second per core on this se.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param significantLogThrottle set the significantLogThrottle.
   */
  @VsoMethod
  public void setSignificantLogThrottle(Integer  significantLogThrottle) {
    this.significantLogThrottle = significantLogThrottle;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (beta) preprocess ssl client hello for sni hostname extension.if set to true, this will apply sni child's ssl protocol(s), if they are different
   * from sni parent's allowed ssl protocol(s).
   * Field introduced in 17.2.12, 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sslPreprocessSniHostname
   */
  @VsoMethod
  public Boolean getSslPreprocessSniHostname() {
    return sslPreprocessSniHostname;
  }

  /**
   * This is the setter method to the attribute.
   * (beta) preprocess ssl client hello for sni hostname extension.if set to true, this will apply sni child's ssl protocol(s), if they are different
   * from sni parent's allowed ssl protocol(s).
   * Field introduced in 17.2.12, 18.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sslPreprocessSniHostname set the sslPreprocessSniHostname.
   */
  @VsoMethod
  public void setSslPreprocessSniHostname(Boolean  sslPreprocessSniHostname) {
    this.sslPreprocessSniHostname = sslPreprocessSniHostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The threshold for the transient shared config memory in the se.
   * Allowed values are 0-100.
   * Field introduced in 20.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return transientSharedMemoryMax
   */
  @VsoMethod
  public Integer getTransientSharedMemoryMax() {
    return transientSharedMemoryMax;
  }

  /**
   * This is the setter method to the attribute.
   * The threshold for the transient shared config memory in the se.
   * Allowed values are 0-100.
   * Field introduced in 20.1.1.
   * Unit is percent.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param transientSharedMemoryMax set the transientSharedMemoryMax.
   */
  @VsoMethod
  public void setTransientSharedMemoryMax(Integer  transientSharedMemoryMax) {
    this.transientSharedMemoryMax = transientSharedMemoryMax;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting limits the number of udf logs generated per second per core on this se.
   * Udf logs are generated due to the configured client log filters or the rules with logging enabled.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return udfLogThrottle
   */
  @VsoMethod
  public Integer getUdfLogThrottle() {
    return udfLogThrottle;
  }

  /**
   * This is the setter method to the attribute.
   * This setting limits the number of udf logs generated per second per core on this se.
   * Udf logs are generated due to the configured client log filters or the rules with logging enabled.
   * Default is 100 logs per second.
   * Set it to zero (0) to deactivate throttling.
   * Field introduced in 17.1.3.
   * Unit is per_second.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param udfLogThrottle set the udfLogThrottle.
   */
  @VsoMethod
  public void setUdfLogThrottle(Integer  udfLogThrottle) {
    this.udfLogThrottle = udfLogThrottle;
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
   * Enables the use of hyper-threaded cores on se.
   * Requires se reboot.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useHyperthreadedCores
   */
  @VsoMethod
  public Boolean getUseHyperthreadedCores() {
    return useHyperthreadedCores;
  }

  /**
   * This is the setter method to the attribute.
   * Enables the use of hyper-threaded cores on se.
   * Requires se reboot.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useHyperthreadedCores set the useHyperthreadedCores.
   */
  @VsoMethod
  public void setUseHyperthreadedCores(Boolean  useHyperthreadedCores) {
    this.useHyperthreadedCores = useHyperthreadedCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable interse objsyc distribution framework.
   * Field introduced in 20.1.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useObjsync
   */
  @VsoMethod
  public Boolean getUseObjsync() {
    return useObjsync;
  }

  /**
   * This is the setter method to the attribute.
   * Enable interse objsyc distribution framework.
   * Field introduced in 20.1.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useObjsync set the useObjsync.
   */
  @VsoMethod
  public void setUseObjsync(Boolean  useObjsync) {
    this.useObjsync = useObjsync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use standard sku azure load balancer.
   * By default cloud level flag is set.
   * If not set, it inherits/uses the use_standard_alb flag from the cloud.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return useStandardAlb
   */
  @VsoMethod
  public Boolean getUseStandardAlb() {
    return useStandardAlb;
  }

  /**
   * This is the setter method to the attribute.
   * Use standard sku azure load balancer.
   * By default cloud level flag is set.
   * If not set, it inherits/uses the use_standard_alb flag from the cloud.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param useStandardAlb set the useStandardAlb.
   */
  @VsoMethod
  public void setUseStandardAlb(Boolean  useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_clusters of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterClusters
   */
  @VsoMethod
  public VcenterClusters getVcenterClusters() {
    return vcenterClusters;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_clusters of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterClusters set the vcenterClusters.
   */
  @VsoMethod
  public void setVcenterClusters(VcenterClusters vcenterClusters) {
    this.vcenterClusters = vcenterClusters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VCENTER_DATASTORE_ANY".
   * @return vcenterDatastoreMode
   */
  @VsoMethod
  public String getVcenterDatastoreMode() {
    return vcenterDatastoreMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VCENTER_DATASTORE_ANY".
   * @param vcenterDatastoreMode set the vcenterDatastoreMode.
   */
  @VsoMethod
  public void setVcenterDatastoreMode(String  vcenterDatastoreMode) {
    this.vcenterDatastoreMode = vcenterDatastoreMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_datastores of obj type serviceenginegroup field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterDatastores
   */
  @VsoMethod
  public List<VcenterDatastore> getVcenterDatastores() {
    return vcenterDatastores;
  }

  /**
   * This is the setter method. this will set the vcenterDatastores
   * Placeholder for description of property vcenter_datastores of obj type serviceenginegroup field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterDatastores
   */
  @VsoMethod
  public void setVcenterDatastores(List<VcenterDatastore>  vcenterDatastores) {
    this.vcenterDatastores = vcenterDatastores;
  }

  /**
   * This is the setter method this will set the vcenterDatastores
   * Placeholder for description of property vcenter_datastores of obj type serviceenginegroup field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterDatastores
   */
  @VsoMethod
  public ServiceEngineGroup addVcenterDatastoresItem(VcenterDatastore vcenterDatastoresItem) {
    if (this.vcenterDatastores == null) {
      this.vcenterDatastores = new ArrayList<VcenterDatastore>();
    }
    this.vcenterDatastores.add(vcenterDatastoresItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_datastores_include of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vcenterDatastoresInclude
   */
  @VsoMethod
  public Boolean getVcenterDatastoresInclude() {
    return vcenterDatastoresInclude;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_datastores_include of obj type serviceenginegroup field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vcenterDatastoresInclude set the vcenterDatastoresInclude.
   */
  @VsoMethod
  public void setVcenterDatastoresInclude(Boolean  vcenterDatastoresInclude) {
    this.vcenterDatastoresInclude = vcenterDatastoresInclude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Folder to place all the service engine virtual machines in vcenter.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AviSeFolder".
   * @return vcenterFolder
   */
  @VsoMethod
  public String getVcenterFolder() {
    return vcenterFolder;
  }

  /**
   * This is the setter method to the attribute.
   * Folder to place all the service engine virtual machines in vcenter.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AviSeFolder".
   * @param vcenterFolder set the vcenterFolder.
   */
  @VsoMethod
  public void setVcenterFolder(String  vcenterFolder) {
    this.vcenterFolder = vcenterFolder;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_hosts of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterHosts
   */
  @VsoMethod
  public VcenterHosts getVcenterHosts() {
    return vcenterHosts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_hosts of obj type serviceenginegroup field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterHosts set the vcenterHosts.
   */
  @VsoMethod
  public void setVcenterHosts(VcenterHosts vcenterHosts) {
    this.vcenterHosts = vcenterHosts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcenter information for scoping at host/cluster level.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenters
   */
  @VsoMethod
  public List<PlacementScopeConfig> getVcenters() {
    return vcenters;
  }

  /**
   * This is the setter method. this will set the vcenters
   * Vcenter information for scoping at host/cluster level.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenters
   */
  @VsoMethod
  public void setVcenters(List<PlacementScopeConfig>  vcenters) {
    this.vcenters = vcenters;
  }

  /**
   * This is the setter method this will set the vcenters
   * Vcenter information for scoping at host/cluster level.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenters
   */
  @VsoMethod
  public ServiceEngineGroup addVcentersItem(PlacementScopeConfig vcentersItem) {
    if (this.vcenters == null) {
      this.vcenters = new ArrayList<PlacementScopeConfig>();
    }
    this.vcenters.add(vcentersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Number of vcpus for each of the service engine virtual machines.
   * Changes to this setting do not affect existing ses.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return vcpusPerSe
   */
  @VsoMethod
  public Integer getVcpusPerSe() {
    return vcpusPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Number of vcpus for each of the service engine virtual machines.
   * Changes to this setting do not affect existing ses.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param vcpusPerSe set the vcpusPerSe.
   */
  @VsoMethod
  public void setVcpusPerSe(Integer  vcpusPerSe) {
    this.vcpusPerSe = vcpusPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When vip_asg is set, vip configuration will be managed by avi.user will be able to configure vip_asg or vips individually at the time of create.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipAsg
   */
  @VsoMethod
  public VipAutoscaleGroup getVipAsg() {
    return vipAsg;
  }

  /**
   * This is the setter method to the attribute.
   * When vip_asg is set, vip configuration will be managed by avi.user will be able to configure vip_asg or vips individually at the time of create.
   * Field introduced in 17.2.12, 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipAsg set the vipAsg.
   */
  @VsoMethod
  public void setVipAsg(VipAutoscaleGroup vipAsg) {
    this.vipAsg = vipAsg;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ensure primary and secondary service engines are deployed on different physical hosts.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Special default for basic edition is true, essentials edition is true, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return vsHostRedundancy
   */
  @VsoMethod
  public Boolean getVsHostRedundancy() {
    return vsHostRedundancy;
  }

  /**
   * This is the setter method to the attribute.
   * Ensure primary and secondary service engines are deployed on different physical hosts.
   * Allowed in basic(allowed values- true) edition, essentials(allowed values- true) edition, enterprise edition.
   * Special default for basic edition is true, essentials edition is true, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param vsHostRedundancy set the vsHostRedundancy.
   */
  @VsoMethod
  public void setVsHostRedundancy(Boolean  vsHostRedundancy) {
    this.vsHostRedundancy = vsHostRedundancy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to wait for the scaled in se to drain existing flows before marking the scalein done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return vsScaleinTimeout
   */
  @VsoMethod
  public Integer getVsScaleinTimeout() {
    return vsScaleinTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time to wait for the scaled in se to drain existing flows before marking the scalein done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param vsScaleinTimeout set the vsScaleinTimeout.
   */
  @VsoMethod
  public void setVsScaleinTimeout(Integer  vsScaleinTimeout) {
    this.vsScaleinTimeout = vsScaleinTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * During se upgrade, time to wait for the scaled-in se to drain existing flows before marking the scalein done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return vsScaleinTimeoutForUpgrade
   */
  @VsoMethod
  public Integer getVsScaleinTimeoutForUpgrade() {
    return vsScaleinTimeoutForUpgrade;
  }

  /**
   * This is the setter method to the attribute.
   * During se upgrade, time to wait for the scaled-in se to drain existing flows before marking the scalein done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param vsScaleinTimeoutForUpgrade set the vsScaleinTimeoutForUpgrade.
   */
  @VsoMethod
  public void setVsScaleinTimeoutForUpgrade(Integer  vsScaleinTimeoutForUpgrade) {
    this.vsScaleinTimeoutForUpgrade = vsScaleinTimeoutForUpgrade;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to wait for the scaled out se to become ready before marking the scaleout done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @return vsScaleoutTimeout
   */
  @VsoMethod
  public Integer getVsScaleoutTimeout() {
    return vsScaleoutTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time to wait for the scaled out se to become ready before marking the scaleout done.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @param vsScaleoutTimeout set the vsScaleoutTimeout.
   */
  @VsoMethod
  public void setVsScaleoutTimeout(Integer  vsScaleoutTimeout) {
    this.vsScaleoutTimeout = vsScaleoutTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Wait time for sending scaleout ready notification after virtual service is marked up.
   * In certain deployments, there may be an additional delay to accept traffic.
   * For example, for bgp, some time is needed for route advertisement.
   * Allowed values are 0-20.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vsSeScaleoutAdditionalWaitTime
   */
  @VsoMethod
  public Integer getVsSeScaleoutAdditionalWaitTime() {
    return vsSeScaleoutAdditionalWaitTime;
  }

  /**
   * This is the setter method to the attribute.
   * Wait time for sending scaleout ready notification after virtual service is marked up.
   * In certain deployments, there may be an additional delay to accept traffic.
   * For example, for bgp, some time is needed for route advertisement.
   * Allowed values are 0-20.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vsSeScaleoutAdditionalWaitTime set the vsSeScaleoutAdditionalWaitTime.
   */
  @VsoMethod
  public void setVsSeScaleoutAdditionalWaitTime(Integer  vsSeScaleoutAdditionalWaitTime) {
    this.vsSeScaleoutAdditionalWaitTime = vsSeScaleoutAdditionalWaitTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout in seconds for service engine to sendscaleout ready notification of a virtual service.
   * Allowed values are 0-90.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return vsSeScaleoutReadyTimeout
   */
  @VsoMethod
  public Integer getVsSeScaleoutReadyTimeout() {
    return vsSeScaleoutReadyTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout in seconds for service engine to sendscaleout ready notification of a virtual service.
   * Allowed values are 0-90.
   * Field introduced in 18.1.5,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param vsSeScaleoutReadyTimeout set the vsSeScaleoutReadyTimeout.
   */
  @VsoMethod
  public void setVsSeScaleoutReadyTimeout(Integer  vsSeScaleoutReadyTimeout) {
    this.vsSeScaleoutReadyTimeout = vsSeScaleoutReadyTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * During se upgrade in a legacy active/standby segroup, time to wait for the new primary se to accept flows before marking the switchover done.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return vsSwitchoverTimeout
   */
  @VsoMethod
  public Integer getVsSwitchoverTimeout() {
    return vsSwitchoverTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * During se upgrade in a legacy active/standby segroup, time to wait for the new primary se to accept flows before marking the switchover done.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param vsSwitchoverTimeout set the vsSwitchoverTimeout.
   */
  @VsoMethod
  public void setVsSwitchoverTimeout(Integer  vsSwitchoverTimeout) {
    this.vsSwitchoverTimeout = vsSwitchoverTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters to place virtual services on only a subset of the cores of an se.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vssPlacement
   */
  @VsoMethod
  public VssPlacement getVssPlacement() {
    return vssPlacement;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters to place virtual services on only a subset of the cores of an se.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vssPlacement set the vssPlacement.
   */
  @VsoMethod
  public void setVssPlacement(VssPlacement vssPlacement) {
    this.vssPlacement = vssPlacement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If set, virtual services will be placed on only a subset of the cores of an se.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vssPlacementEnabled
   */
  @VsoMethod
  public Boolean getVssPlacementEnabled() {
    return vssPlacementEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * If set, virtual services will be placed on only a subset of the cores of an se.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vssPlacementEnabled set the vssPlacementEnabled.
   */
  @VsoMethod
  public void setVssPlacementEnabled(Boolean  vssPlacementEnabled) {
    this.vssPlacementEnabled = vssPlacementEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which se publishes waf learning.
   * Allowed values are 1-43200.
   * Field deprecated in 18.2.3.
   * Field introduced in 18.1.2.
   * Unit is min.
   * @return wafLearningInterval
   */
  @VsoMethod
  public Integer getWafLearningInterval() {
    return wafLearningInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which se publishes waf learning.
   * Allowed values are 1-43200.
   * Field deprecated in 18.2.3.
   * Field introduced in 18.1.2.
   * Unit is min.
   * @param wafLearningInterval set the wafLearningInterval.
   */
  @VsoMethod
  public void setWafLearningInterval(Integer  wafLearningInterval) {
    this.wafLearningInterval = wafLearningInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Amount of memory reserved on se for waf learning.
   * This can be atmost 5% of se memory.
   * Field deprecated in 18.2.3.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * @return wafLearningMemory
   */
  @VsoMethod
  public Integer getWafLearningMemory() {
    return wafLearningMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Amount of memory reserved on se for waf learning.
   * This can be atmost 5% of se memory.
   * Field deprecated in 18.2.3.
   * Field introduced in 18.1.2.
   * Unit is mb.
   * @param wafLearningMemory set the wafLearningMemory.
   */
  @VsoMethod
  public void setWafLearningMemory(Integer  wafLearningMemory) {
    this.wafLearningMemory = wafLearningMemory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable memory pool for waf.requires se reboot.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return wafMempool
   */
  @VsoMethod
  public Boolean getWafMempool() {
    return wafMempool;
  }

  /**
   * This is the setter method to the attribute.
   * Enable memory pool for waf.requires se reboot.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param wafMempool set the wafMempool.
   */
  @VsoMethod
  public void setWafMempool(Boolean  wafMempool) {
    this.wafMempool = wafMempool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Memory pool size used for waf.requires se reboot.
   * Field introduced in 17.2.3.
   * Unit is kb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @return wafMempoolSize
   */
  @VsoMethod
  public Integer getWafMempoolSize() {
    return wafMempoolSize;
  }

  /**
   * This is the setter method to the attribute.
   * Memory pool size used for waf.requires se reboot.
   * Field introduced in 17.2.3.
   * Unit is kb.
   * Default value when not specified in API or module is interpreted by Avi Controller as 64.
   * @param wafMempoolSize set the wafMempoolSize.
   */
  @VsoMethod
  public void setWafMempoolSize(Integer  wafMempoolSize) {
    this.wafMempoolSize = wafMempoolSize;
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
  ServiceEngineGroup objServiceEngineGroup = (ServiceEngineGroup) o;
  return   Objects.equals(this.uuid, objServiceEngineGroup.uuid)&&
  Objects.equals(this.name, objServiceEngineGroup.name)&&
  Objects.equals(this.description, objServiceEngineGroup.description)&&
  Objects.equals(this.tenantRef, objServiceEngineGroup.tenantRef)&&
  Objects.equals(this.maxVsPerSe, objServiceEngineGroup.maxVsPerSe)&&
  Objects.equals(this.minScaleoutPerVs, objServiceEngineGroup.minScaleoutPerVs)&&
  Objects.equals(this.maxScaleoutPerVs, objServiceEngineGroup.maxScaleoutPerVs)&&
  Objects.equals(this.maxSe, objServiceEngineGroup.maxSe)&&
  Objects.equals(this.vcpusPerSe, objServiceEngineGroup.vcpusPerSe)&&
  Objects.equals(this.memoryPerSe, objServiceEngineGroup.memoryPerSe)&&
  Objects.equals(this.diskPerSe, objServiceEngineGroup.diskPerSe)&&
  Objects.equals(this.maxCpuUsage, objServiceEngineGroup.maxCpuUsage)&&
  Objects.equals(this.minCpuUsage, objServiceEngineGroup.minCpuUsage)&&
  Objects.equals(this.seDeprovisionDelay, objServiceEngineGroup.seDeprovisionDelay)&&
  Objects.equals(this.autoRebalance, objServiceEngineGroup.autoRebalance)&&
  Objects.equals(this.seNamePrefix, objServiceEngineGroup.seNamePrefix)&&
  Objects.equals(this.vsHostRedundancy, objServiceEngineGroup.vsHostRedundancy)&&
  Objects.equals(this.vcenterFolder, objServiceEngineGroup.vcenterFolder)&&
  Objects.equals(this.vcenterDatastores, objServiceEngineGroup.vcenterDatastores)&&
  Objects.equals(this.vcenterDatastoresInclude, objServiceEngineGroup.vcenterDatastoresInclude)&&
  Objects.equals(this.vcenterDatastoreMode, objServiceEngineGroup.vcenterDatastoreMode)&&
  Objects.equals(this.vcenterClusters, objServiceEngineGroup.vcenterClusters)&&
  Objects.equals(this.vcenterHosts, objServiceEngineGroup.vcenterHosts)&&
  Objects.equals(this.openstackAvailabilityZone, objServiceEngineGroup.openstackAvailabilityZone)&&
  Objects.equals(this.cpuReserve, objServiceEngineGroup.cpuReserve)&&
  Objects.equals(this.memReserve, objServiceEngineGroup.memReserve)&&
  Objects.equals(this.mgmtNetworkRef, objServiceEngineGroup.mgmtNetworkRef)&&
  Objects.equals(this.mgmtSubnet, objServiceEngineGroup.mgmtSubnet)&&
  Objects.equals(this.haMode, objServiceEngineGroup.haMode)&&
  Objects.equals(this.algo, objServiceEngineGroup.algo)&&
  Objects.equals(this.bufferSe, objServiceEngineGroup.bufferSe)&&
  Objects.equals(this.activeStandby, objServiceEngineGroup.activeStandby)&&
  Objects.equals(this.placementMode, objServiceEngineGroup.placementMode)&&
  Objects.equals(this.openstackMgmtNetworkName, objServiceEngineGroup.openstackMgmtNetworkName)&&
  Objects.equals(this.openstackMgmtNetworkUuid, objServiceEngineGroup.openstackMgmtNetworkUuid)&&
  Objects.equals(this.instanceFlavor, objServiceEngineGroup.instanceFlavor)&&
  Objects.equals(this.hypervisor, objServiceEngineGroup.hypervisor)&&
  Objects.equals(this.seDosProfile, objServiceEngineGroup.seDosProfile)&&
  Objects.equals(this.autoRebalanceInterval, objServiceEngineGroup.autoRebalanceInterval)&&
  Objects.equals(this.aggressiveFailureDetection, objServiceEngineGroup.aggressiveFailureDetection)&&
  Objects.equals(this.realtimeSeMetrics, objServiceEngineGroup.realtimeSeMetrics)&&
  Objects.equals(this.vsScaleoutTimeout, objServiceEngineGroup.vsScaleoutTimeout)&&
  Objects.equals(this.vsScaleinTimeout, objServiceEngineGroup.vsScaleinTimeout)&&
  Objects.equals(this.hardwaresecuritymodulegroupRef, objServiceEngineGroup.hardwaresecuritymodulegroupRef)&&
  Objects.equals(this.connectionMemoryPercentage, objServiceEngineGroup.connectionMemoryPercentage)&&
  Objects.equals(this.extraConfigMultiplier, objServiceEngineGroup.extraConfigMultiplier)&&
  Objects.equals(this.vsScaleinTimeoutForUpgrade, objServiceEngineGroup.vsScaleinTimeoutForUpgrade)&&
  Objects.equals(this.hostAttributeKey, objServiceEngineGroup.hostAttributeKey)&&
  Objects.equals(this.hostAttributeValue, objServiceEngineGroup.hostAttributeValue)&&
  Objects.equals(this.logDisksz, objServiceEngineGroup.logDisksz)&&
  Objects.equals(this.osReservedMemory, objServiceEngineGroup.osReservedMemory)&&
  Objects.equals(this.floatingIntfIp, objServiceEngineGroup.floatingIntfIp)&&
  Objects.equals(this.hmOnStandby, objServiceEngineGroup.hmOnStandby)&&
  Objects.equals(this.perApp, objServiceEngineGroup.perApp)&&
  Objects.equals(this.enableVmac, objServiceEngineGroup.enableVmac)&&
  Objects.equals(this.distributeLoadActiveStandby, objServiceEngineGroup.distributeLoadActiveStandby)&&
  Objects.equals(this.autoRedistributeActiveStandbyLoad, objServiceEngineGroup.autoRedistributeActiveStandbyLoad)&&
  Objects.equals(this.floatingIntfIpSe2, objServiceEngineGroup.floatingIntfIpSe2)&&
  Objects.equals(this.customTag, objServiceEngineGroup.customTag)&&
  Objects.equals(this.dedicatedDispatcherCore, objServiceEngineGroup.dedicatedDispatcherCore)&&
  Objects.equals(this.cpuSocketAffinity, objServiceEngineGroup.cpuSocketAffinity)&&
  Objects.equals(this.numFlowCoresSumChangesToIgnore, objServiceEngineGroup.numFlowCoresSumChangesToIgnore)&&
  Objects.equals(this.leastLoadCoreSelection, objServiceEngineGroup.leastLoadCoreSelection)&&
  Objects.equals(this.extraSharedConfigMemory, objServiceEngineGroup.extraSharedConfigMemory)&&
  Objects.equals(this.seTunnelMode, objServiceEngineGroup.seTunnelMode)&&
  Objects.equals(this.openstackAvailabilityZones, objServiceEngineGroup.openstackAvailabilityZones)&&
  Objects.equals(this.serviceIpSubnets, objServiceEngineGroup.serviceIpSubnets)&&
  Objects.equals(this.seVsHbMaxVsInPkt, objServiceEngineGroup.seVsHbMaxVsInPkt)&&
  Objects.equals(this.seVsHbMaxPktsInBatch, objServiceEngineGroup.seVsHbMaxPktsInBatch)&&
  Objects.equals(this.autoRebalanceCriteria, objServiceEngineGroup.autoRebalanceCriteria)&&
  Objects.equals(this.cloudRef, objServiceEngineGroup.cloudRef)&&
  Objects.equals(this.iptables, objServiceEngineGroup.iptables)&&
  Objects.equals(this.enableRouting, objServiceEngineGroup.enableRouting)&&
  Objects.equals(this.advertiseBackendNetworks, objServiceEngineGroup.advertiseBackendNetworks)&&
  Objects.equals(this.enableVipOnAllInterfaces, objServiceEngineGroup.enableVipOnAllInterfaces)&&
  Objects.equals(this.seThreadMultiplier, objServiceEngineGroup.seThreadMultiplier)&&
  Objects.equals(this.asyncSsl, objServiceEngineGroup.asyncSsl)&&
  Objects.equals(this.asyncSslThreads, objServiceEngineGroup.asyncSslThreads)&&
  Objects.equals(this.seUdpEncapIpc, objServiceEngineGroup.seUdpEncapIpc)&&
  Objects.equals(this.seIpcUdpPort, objServiceEngineGroup.seIpcUdpPort)&&
  Objects.equals(this.seRemotePuntUdpPort, objServiceEngineGroup.seRemotePuntUdpPort)&&
  Objects.equals(this.seTunnelUdpPort, objServiceEngineGroup.seTunnelUdpPort)&&
  Objects.equals(this.customSecuritygroupsMgmt, objServiceEngineGroup.customSecuritygroupsMgmt)&&
  Objects.equals(this.customSecuritygroupsData, objServiceEngineGroup.customSecuritygroupsData)&&
  Objects.equals(this.archiveShmLimit, objServiceEngineGroup.archiveShmLimit)&&
  Objects.equals(this.significantLogThrottle, objServiceEngineGroup.significantLogThrottle)&&
  Objects.equals(this.udfLogThrottle, objServiceEngineGroup.udfLogThrottle)&&
  Objects.equals(this.nonSignificantLogThrottle, objServiceEngineGroup.nonSignificantLogThrottle)&&
  Objects.equals(this.ingressAccessMgmt, objServiceEngineGroup.ingressAccessMgmt)&&
  Objects.equals(this.ingressAccessData, objServiceEngineGroup.ingressAccessData)&&
  Objects.equals(this.seSbDedicatedCore, objServiceEngineGroup.seSbDedicatedCore)&&
  Objects.equals(this.seProbePort, objServiceEngineGroup.seProbePort)&&
  Objects.equals(this.seSbThreads, objServiceEngineGroup.seSbThreads)&&
  Objects.equals(this.ignoreRttThreshold, objServiceEngineGroup.ignoreRttThreshold)&&
  Objects.equals(this.wafMempool, objServiceEngineGroup.wafMempool)&&
  Objects.equals(this.wafMempoolSize, objServiceEngineGroup.wafMempoolSize)&&
  Objects.equals(this.seBandwidthType, objServiceEngineGroup.seBandwidthType)&&
  Objects.equals(this.licenseType, objServiceEngineGroup.licenseType)&&
  Objects.equals(this.licenseTier, objServiceEngineGroup.licenseTier)&&
  Objects.equals(this.allowBurst, objServiceEngineGroup.allowBurst)&&
  Objects.equals(this.autoRebalanceCapacityPerSe, objServiceEngineGroup.autoRebalanceCapacityPerSe)&&
  Objects.equals(this.hostGatewayMonitor, objServiceEngineGroup.hostGatewayMonitor)&&
  Objects.equals(this.vssPlacement, objServiceEngineGroup.vssPlacement)&&
  Objects.equals(this.flowTableNewSynMaxEntries, objServiceEngineGroup.flowTableNewSynMaxEntries)&&
  Objects.equals(this.minimumRequiredConfigMemory, objServiceEngineGroup.minimumRequiredConfigMemory)&&
  Objects.equals(this.disableCsumOffloads, objServiceEngineGroup.disableCsumOffloads)&&
  Objects.equals(this.disableGro, objServiceEngineGroup.disableGro)&&
  Objects.equals(this.disableTso, objServiceEngineGroup.disableTso)&&
  Objects.equals(this.enableHsmPriming, objServiceEngineGroup.enableHsmPriming)&&
  Objects.equals(this.serviceIp6Subnets, objServiceEngineGroup.serviceIp6Subnets)&&
  Objects.equals(this.seTracertPortRange, objServiceEngineGroup.seTracertPortRange)&&
  Objects.equals(this.distributeQueues, objServiceEngineGroup.distributeQueues)&&
  Objects.equals(this.additionalConfigMemory, objServiceEngineGroup.additionalConfigMemory)&&
  Objects.equals(this.vssPlacementEnabled, objServiceEngineGroup.vssPlacementEnabled)&&
  Objects.equals(this.enableMultiLb, objServiceEngineGroup.enableMultiLb)&&
  Objects.equals(this.nLogStreamingThreads, objServiceEngineGroup.nLogStreamingThreads)&&
  Objects.equals(this.freeListSize, objServiceEngineGroup.freeListSize)&&
  Objects.equals(this.maxRulesPerLb, objServiceEngineGroup.maxRulesPerLb)&&
  Objects.equals(this.maxPublicIpsPerLb, objServiceEngineGroup.maxPublicIpsPerLb)&&
  Objects.equals(this.wafLearningMemory, objServiceEngineGroup.wafLearningMemory)&&
  Objects.equals(this.wafLearningInterval, objServiceEngineGroup.wafLearningInterval)&&
  Objects.equals(this.selfSeElection, objServiceEngineGroup.selfSeElection)&&
  Objects.equals(this.vipAsg, objServiceEngineGroup.vipAsg)&&
  Objects.equals(this.minimumConnectionMemory, objServiceEngineGroup.minimumConnectionMemory)&&
  Objects.equals(this.shmMinimumConfigMemory, objServiceEngineGroup.shmMinimumConfigMemory)&&
  Objects.equals(this.heapMinimumConfigMemory, objServiceEngineGroup.heapMinimumConfigMemory)&&
  Objects.equals(this.disableSeMemoryCheck, objServiceEngineGroup.disableSeMemoryCheck)&&
  Objects.equals(this.memoryForConfigUpdate, objServiceEngineGroup.memoryForConfigUpdate)&&
  Objects.equals(this.numDispatcherCores, objServiceEngineGroup.numDispatcherCores)&&
  Objects.equals(this.sslPreprocessSniHostname, objServiceEngineGroup.sslPreprocessSniHostname)&&
  Objects.equals(this.seDpdkPmd, objServiceEngineGroup.seDpdkPmd)&&
  Objects.equals(this.seUseDpdk, objServiceEngineGroup.seUseDpdk)&&
  Objects.equals(this.minSe, objServiceEngineGroup.minSe)&&
  Objects.equals(this.sePcapReinitFrequency, objServiceEngineGroup.sePcapReinitFrequency)&&
  Objects.equals(this.sePcapReinitThreshold, objServiceEngineGroup.sePcapReinitThreshold)&&
  Objects.equals(this.ephemeralPortrangeStart, objServiceEngineGroup.ephemeralPortrangeStart)&&
  Objects.equals(this.ephemeralPortrangeEnd, objServiceEngineGroup.ephemeralPortrangeEnd)&&
  Objects.equals(this.disableAviSecuritygroups, objServiceEngineGroup.disableAviSecuritygroups)&&
  Objects.equals(this.seFlowProbeRetries, objServiceEngineGroup.seFlowProbeRetries)&&
  Objects.equals(this.seFlowProbeTimer, objServiceEngineGroup.seFlowProbeTimer)&&
  Objects.equals(this.vsSwitchoverTimeout, objServiceEngineGroup.vsSwitchoverTimeout)&&
  Objects.equals(this.configDebugsOnAllCores, objServiceEngineGroup.configDebugsOnAllCores)&&
  Objects.equals(this.acceleratedNetworking, objServiceEngineGroup.acceleratedNetworking)&&
  Objects.equals(this.vsSeScaleoutReadyTimeout, objServiceEngineGroup.vsSeScaleoutReadyTimeout)&&
  Objects.equals(this.vsSeScaleoutAdditionalWaitTime, objServiceEngineGroup.vsSeScaleoutAdditionalWaitTime)&&
  Objects.equals(this.seDpHmDrops, objServiceEngineGroup.seDpHmDrops)&&
  Objects.equals(this.disableFlowProbes, objServiceEngineGroup.disableFlowProbes)&&
  Objects.equals(this.dpAggressiveHbFrequency, objServiceEngineGroup.dpAggressiveHbFrequency)&&
  Objects.equals(this.dpAggressiveHbTimeoutCount, objServiceEngineGroup.dpAggressiveHbTimeoutCount)&&
  Objects.equals(this.bgpStateUpdateInterval, objServiceEngineGroup.bgpStateUpdateInterval)&&
  Objects.equals(this.maxMemoryPerMempool, objServiceEngineGroup.maxMemoryPerMempool)&&
  Objects.equals(this.appCachePercent, objServiceEngineGroup.appCachePercent)&&
  Objects.equals(this.seRouting, objServiceEngineGroup.seRouting)&&
  Objects.equals(this.useStandardAlb, objServiceEngineGroup.useStandardAlb)&&
  Objects.equals(this.appLearningMemoryPercent, objServiceEngineGroup.appLearningMemoryPercent)&&
  Objects.equals(this.datascriptTimeout, objServiceEngineGroup.datascriptTimeout)&&
  Objects.equals(this.rebootOnStop, objServiceEngineGroup.rebootOnStop)&&
  Objects.equals(this.dataNetworkId, objServiceEngineGroup.dataNetworkId)&&
  Objects.equals(this.sePcapLookahead, objServiceEngineGroup.sePcapLookahead)&&
  Objects.equals(this.enableGratarpPermanent, objServiceEngineGroup.enableGratarpPermanent)&&
  Objects.equals(this.gratarpPermanentPeriodicity, objServiceEngineGroup.gratarpPermanentPeriodicity)&&
  Objects.equals(this.rebootOnPanic, objServiceEngineGroup.rebootOnPanic)&&
  Objects.equals(this.seFlowProbeRetryTimer, objServiceEngineGroup.seFlowProbeRetryTimer)&&
  Objects.equals(this.natFlowUdpNoresponseTimeout, objServiceEngineGroup.natFlowUdpNoresponseTimeout)&&
  Objects.equals(this.natFlowUdpResponseTimeout, objServiceEngineGroup.natFlowUdpResponseTimeout)&&
  Objects.equals(this.natFlowTcpHandshakeTimeout, objServiceEngineGroup.natFlowTcpHandshakeTimeout)&&
  Objects.equals(this.natFlowTcpEstablishedTimeout, objServiceEngineGroup.natFlowTcpEstablishedTimeout)&&
  Objects.equals(this.natFlowTcpHalfClosedTimeout, objServiceEngineGroup.natFlowTcpHalfClosedTimeout)&&
  Objects.equals(this.natFlowTcpClosedTimeout, objServiceEngineGroup.natFlowTcpClosedTimeout)&&
  Objects.equals(this.seLro, objServiceEngineGroup.seLro)&&
  Objects.equals(this.seTxBatchSize, objServiceEngineGroup.seTxBatchSize)&&
  Objects.equals(this.sePcapPktSz, objServiceEngineGroup.sePcapPktSz)&&
  Objects.equals(this.sePcapPktCount, objServiceEngineGroup.sePcapPktCount)&&
  Objects.equals(this.distributeVnics, objServiceEngineGroup.distributeVnics)&&
  Objects.equals(this.seDpVnicQueueStallEventSleep, objServiceEngineGroup.seDpVnicQueueStallEventSleep)&&
  Objects.equals(this.seDpVnicQueueStallTimeout, objServiceEngineGroup.seDpVnicQueueStallTimeout)&&
  Objects.equals(this.seDpVnicQueueStallThreshold, objServiceEngineGroup.seDpVnicQueueStallThreshold)&&
  Objects.equals(this.seDpVnicRestartOnQueueStallCount, objServiceEngineGroup.seDpVnicRestartOnQueueStallCount)&&
  Objects.equals(this.seDpVnicStallSeRestartWindow, objServiceEngineGroup.seDpVnicStallSeRestartWindow)&&
  Objects.equals(this.enablePcapTxRing, objServiceEngineGroup.enablePcapTxRing)&&
  Objects.equals(this.sePcapQdiscBypass, objServiceEngineGroup.sePcapQdiscBypass)&&
  Objects.equals(this.seRumSamplingNavPercent, objServiceEngineGroup.seRumSamplingNavPercent)&&
  Objects.equals(this.seRumSamplingResPercent, objServiceEngineGroup.seRumSamplingResPercent)&&
  Objects.equals(this.seRumSamplingNavInterval, objServiceEngineGroup.seRumSamplingNavInterval)&&
  Objects.equals(this.seRumSamplingResInterval, objServiceEngineGroup.seRumSamplingResInterval)&&
  Objects.equals(this.seKniBurstFactor, objServiceEngineGroup.seKniBurstFactor)&&
  Objects.equals(this.maxQueuesPerVnic, objServiceEngineGroup.maxQueuesPerVnic)&&
  Objects.equals(this.seRlProp, objServiceEngineGroup.seRlProp)&&
  Objects.equals(this.appCacheThreshold, objServiceEngineGroup.appCacheThreshold)&&
  Objects.equals(this.maxConcurrentExternalHm, objServiceEngineGroup.maxConcurrentExternalHm)&&
  Objects.equals(this.seMtu, objServiceEngineGroup.seMtu)&&
  Objects.equals(this.coreShmAppLearning, objServiceEngineGroup.coreShmAppLearning)&&
  Objects.equals(this.coreShmAppCache, objServiceEngineGroup.coreShmAppCache)&&
  Objects.equals(this.pcapTxMode, objServiceEngineGroup.pcapTxMode)&&
  Objects.equals(this.seDpMaxHbVersion, objServiceEngineGroup.seDpMaxHbVersion)&&
  Objects.equals(this.maxNumSeDps, objServiceEngineGroup.maxNumSeDps)&&
  Objects.equals(this.resyncTimeInterval, objServiceEngineGroup.resyncTimeInterval)&&
  Objects.equals(this.useHyperthreadedCores, objServiceEngineGroup.useHyperthreadedCores)&&
  Objects.equals(this.seHyperthreadedMode, objServiceEngineGroup.seHyperthreadedMode)&&
  Objects.equals(this.compressIpRulesForEachNsSubnet, objServiceEngineGroup.compressIpRulesForEachNsSubnet)&&
  Objects.equals(this.availabilityZoneRefs, objServiceEngineGroup.availabilityZoneRefs)&&
  Objects.equals(this.vcenters, objServiceEngineGroup.vcenters)&&
  Objects.equals(this.seVnicTxSwQueueSize, objServiceEngineGroup.seVnicTxSwQueueSize)&&
  Objects.equals(this.seVnicTxSwQueueFlushFrequency, objServiceEngineGroup.seVnicTxSwQueueFlushFrequency)&&
  Objects.equals(this.transientSharedMemoryMax, objServiceEngineGroup.transientSharedMemoryMax)&&
  Objects.equals(this.labels, objServiceEngineGroup.labels)&&
  Objects.equals(this.logMallocFailure, objServiceEngineGroup.logMallocFailure)&&
  Objects.equals(this.seDelayedFlowDelete, objServiceEngineGroup.seDelayedFlowDelete)&&
  Objects.equals(this.seTxqThreshold, objServiceEngineGroup.seTxqThreshold)&&
  Objects.equals(this.seMpRingRetryCount, objServiceEngineGroup.seMpRingRetryCount)&&
  Objects.equals(this.seGroupAnalyticsPolicy, objServiceEngineGroup.seGroupAnalyticsPolicy)&&
  Objects.equals(this.dpHbFrequency, objServiceEngineGroup.dpHbFrequency)&&
  Objects.equals(this.dpHbTimeoutCount, objServiceEngineGroup.dpHbTimeoutCount)&&
  Objects.equals(this.pcapTxRingRdBalancingFactor, objServiceEngineGroup.pcapTxRingRdBalancingFactor)&&
  Objects.equals(this.gcpConfig, objServiceEngineGroup.gcpConfig)&&
  Objects.equals(this.useObjsync, objServiceEngineGroup.useObjsync)&&
  Objects.equals(this.seIpEncapIpc, objServiceEngineGroup.seIpEncapIpc)&&
  Objects.equals(this.seL3EncapIpc, objServiceEngineGroup.seL3EncapIpc)&&
  Objects.equals(this.handlePerPktAttack, objServiceEngineGroup.handlePerPktAttack)&&
  Objects.equals(this.perVsAdmissionControl, objServiceEngineGroup.perVsAdmissionControl)&&
  Objects.equals(this.objsyncPort, objServiceEngineGroup.objsyncPort)&&
  Objects.equals(this.objsyncConfig, objServiceEngineGroup.objsyncConfig)&&
  Objects.equals(this.seDpIsolation, objServiceEngineGroup.seDpIsolation)&&
  Objects.equals(this.seDpIsolationNumNonDpCpus, objServiceEngineGroup.seDpIsolationNumNonDpCpus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceEngineGroup {\n");
      sb.append("    acceleratedNetworking: ").append(toIndentedString(acceleratedNetworking)).append("\n");
        sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
        sb.append("    additionalConfigMemory: ").append(toIndentedString(additionalConfigMemory)).append("\n");
        sb.append("    advertiseBackendNetworks: ").append(toIndentedString(advertiseBackendNetworks)).append("\n");
        sb.append("    aggressiveFailureDetection: ").append(toIndentedString(aggressiveFailureDetection)).append("\n");
        sb.append("    algo: ").append(toIndentedString(algo)).append("\n");
        sb.append("    allowBurst: ").append(toIndentedString(allowBurst)).append("\n");
        sb.append("    appCachePercent: ").append(toIndentedString(appCachePercent)).append("\n");
        sb.append("    appCacheThreshold: ").append(toIndentedString(appCacheThreshold)).append("\n");
        sb.append("    appLearningMemoryPercent: ").append(toIndentedString(appLearningMemoryPercent)).append("\n");
        sb.append("    archiveShmLimit: ").append(toIndentedString(archiveShmLimit)).append("\n");
        sb.append("    asyncSsl: ").append(toIndentedString(asyncSsl)).append("\n");
        sb.append("    asyncSslThreads: ").append(toIndentedString(asyncSslThreads)).append("\n");
        sb.append("    autoRebalance: ").append(toIndentedString(autoRebalance)).append("\n");
        sb.append("    autoRebalanceCapacityPerSe: ").append(toIndentedString(autoRebalanceCapacityPerSe)).append("\n");
        sb.append("    autoRebalanceCriteria: ").append(toIndentedString(autoRebalanceCriteria)).append("\n");
        sb.append("    autoRebalanceInterval: ").append(toIndentedString(autoRebalanceInterval)).append("\n");
        sb.append("    autoRedistributeActiveStandbyLoad: ").append(toIndentedString(autoRedistributeActiveStandbyLoad)).append("\n");
        sb.append("    availabilityZoneRefs: ").append(toIndentedString(availabilityZoneRefs)).append("\n");
        sb.append("    bgpStateUpdateInterval: ").append(toIndentedString(bgpStateUpdateInterval)).append("\n");
        sb.append("    bufferSe: ").append(toIndentedString(bufferSe)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    compressIpRulesForEachNsSubnet: ").append(toIndentedString(compressIpRulesForEachNsSubnet)).append("\n");
        sb.append("    configDebugsOnAllCores: ").append(toIndentedString(configDebugsOnAllCores)).append("\n");
        sb.append("    connectionMemoryPercentage: ").append(toIndentedString(connectionMemoryPercentage)).append("\n");
        sb.append("    coreShmAppCache: ").append(toIndentedString(coreShmAppCache)).append("\n");
        sb.append("    coreShmAppLearning: ").append(toIndentedString(coreShmAppLearning)).append("\n");
        sb.append("    cpuReserve: ").append(toIndentedString(cpuReserve)).append("\n");
        sb.append("    cpuSocketAffinity: ").append(toIndentedString(cpuSocketAffinity)).append("\n");
        sb.append("    customSecuritygroupsData: ").append(toIndentedString(customSecuritygroupsData)).append("\n");
        sb.append("    customSecuritygroupsMgmt: ").append(toIndentedString(customSecuritygroupsMgmt)).append("\n");
        sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
        sb.append("    dataNetworkId: ").append(toIndentedString(dataNetworkId)).append("\n");
        sb.append("    datascriptTimeout: ").append(toIndentedString(datascriptTimeout)).append("\n");
        sb.append("    dedicatedDispatcherCore: ").append(toIndentedString(dedicatedDispatcherCore)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disableAviSecuritygroups: ").append(toIndentedString(disableAviSecuritygroups)).append("\n");
        sb.append("    disableCsumOffloads: ").append(toIndentedString(disableCsumOffloads)).append("\n");
        sb.append("    disableFlowProbes: ").append(toIndentedString(disableFlowProbes)).append("\n");
        sb.append("    disableGro: ").append(toIndentedString(disableGro)).append("\n");
        sb.append("    disableSeMemoryCheck: ").append(toIndentedString(disableSeMemoryCheck)).append("\n");
        sb.append("    disableTso: ").append(toIndentedString(disableTso)).append("\n");
        sb.append("    diskPerSe: ").append(toIndentedString(diskPerSe)).append("\n");
        sb.append("    distributeLoadActiveStandby: ").append(toIndentedString(distributeLoadActiveStandby)).append("\n");
        sb.append("    distributeQueues: ").append(toIndentedString(distributeQueues)).append("\n");
        sb.append("    distributeVnics: ").append(toIndentedString(distributeVnics)).append("\n");
        sb.append("    dpAggressiveHbFrequency: ").append(toIndentedString(dpAggressiveHbFrequency)).append("\n");
        sb.append("    dpAggressiveHbTimeoutCount: ").append(toIndentedString(dpAggressiveHbTimeoutCount)).append("\n");
        sb.append("    dpHbFrequency: ").append(toIndentedString(dpHbFrequency)).append("\n");
        sb.append("    dpHbTimeoutCount: ").append(toIndentedString(dpHbTimeoutCount)).append("\n");
        sb.append("    enableGratarpPermanent: ").append(toIndentedString(enableGratarpPermanent)).append("\n");
        sb.append("    enableHsmPriming: ").append(toIndentedString(enableHsmPriming)).append("\n");
        sb.append("    enableMultiLb: ").append(toIndentedString(enableMultiLb)).append("\n");
        sb.append("    enablePcapTxRing: ").append(toIndentedString(enablePcapTxRing)).append("\n");
        sb.append("    enableRouting: ").append(toIndentedString(enableRouting)).append("\n");
        sb.append("    enableVipOnAllInterfaces: ").append(toIndentedString(enableVipOnAllInterfaces)).append("\n");
        sb.append("    enableVmac: ").append(toIndentedString(enableVmac)).append("\n");
        sb.append("    ephemeralPortrangeEnd: ").append(toIndentedString(ephemeralPortrangeEnd)).append("\n");
        sb.append("    ephemeralPortrangeStart: ").append(toIndentedString(ephemeralPortrangeStart)).append("\n");
        sb.append("    extraConfigMultiplier: ").append(toIndentedString(extraConfigMultiplier)).append("\n");
        sb.append("    extraSharedConfigMemory: ").append(toIndentedString(extraSharedConfigMemory)).append("\n");
        sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
        sb.append("    floatingIntfIpSe2: ").append(toIndentedString(floatingIntfIpSe2)).append("\n");
        sb.append("    flowTableNewSynMaxEntries: ").append(toIndentedString(flowTableNewSynMaxEntries)).append("\n");
        sb.append("    freeListSize: ").append(toIndentedString(freeListSize)).append("\n");
        sb.append("    gcpConfig: ").append(toIndentedString(gcpConfig)).append("\n");
        sb.append("    gratarpPermanentPeriodicity: ").append(toIndentedString(gratarpPermanentPeriodicity)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    handlePerPktAttack: ").append(toIndentedString(handlePerPktAttack)).append("\n");
        sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
        sb.append("    heapMinimumConfigMemory: ").append(toIndentedString(heapMinimumConfigMemory)).append("\n");
        sb.append("    hmOnStandby: ").append(toIndentedString(hmOnStandby)).append("\n");
        sb.append("    hostAttributeKey: ").append(toIndentedString(hostAttributeKey)).append("\n");
        sb.append("    hostAttributeValue: ").append(toIndentedString(hostAttributeValue)).append("\n");
        sb.append("    hostGatewayMonitor: ").append(toIndentedString(hostGatewayMonitor)).append("\n");
        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
        sb.append("    ignoreRttThreshold: ").append(toIndentedString(ignoreRttThreshold)).append("\n");
        sb.append("    ingressAccessData: ").append(toIndentedString(ingressAccessData)).append("\n");
        sb.append("    ingressAccessMgmt: ").append(toIndentedString(ingressAccessMgmt)).append("\n");
        sb.append("    instanceFlavor: ").append(toIndentedString(instanceFlavor)).append("\n");
        sb.append("    iptables: ").append(toIndentedString(iptables)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    leastLoadCoreSelection: ").append(toIndentedString(leastLoadCoreSelection)).append("\n");
        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    logDisksz: ").append(toIndentedString(logDisksz)).append("\n");
        sb.append("    logMallocFailure: ").append(toIndentedString(logMallocFailure)).append("\n");
        sb.append("    maxConcurrentExternalHm: ").append(toIndentedString(maxConcurrentExternalHm)).append("\n");
        sb.append("    maxCpuUsage: ").append(toIndentedString(maxCpuUsage)).append("\n");
        sb.append("    maxMemoryPerMempool: ").append(toIndentedString(maxMemoryPerMempool)).append("\n");
        sb.append("    maxNumSeDps: ").append(toIndentedString(maxNumSeDps)).append("\n");
        sb.append("    maxPublicIpsPerLb: ").append(toIndentedString(maxPublicIpsPerLb)).append("\n");
        sb.append("    maxQueuesPerVnic: ").append(toIndentedString(maxQueuesPerVnic)).append("\n");
        sb.append("    maxRulesPerLb: ").append(toIndentedString(maxRulesPerLb)).append("\n");
        sb.append("    maxScaleoutPerVs: ").append(toIndentedString(maxScaleoutPerVs)).append("\n");
        sb.append("    maxSe: ").append(toIndentedString(maxSe)).append("\n");
        sb.append("    maxVsPerSe: ").append(toIndentedString(maxVsPerSe)).append("\n");
        sb.append("    memReserve: ").append(toIndentedString(memReserve)).append("\n");
        sb.append("    memoryForConfigUpdate: ").append(toIndentedString(memoryForConfigUpdate)).append("\n");
        sb.append("    memoryPerSe: ").append(toIndentedString(memoryPerSe)).append("\n");
        sb.append("    mgmtNetworkRef: ").append(toIndentedString(mgmtNetworkRef)).append("\n");
        sb.append("    mgmtSubnet: ").append(toIndentedString(mgmtSubnet)).append("\n");
        sb.append("    minCpuUsage: ").append(toIndentedString(minCpuUsage)).append("\n");
        sb.append("    minScaleoutPerVs: ").append(toIndentedString(minScaleoutPerVs)).append("\n");
        sb.append("    minSe: ").append(toIndentedString(minSe)).append("\n");
        sb.append("    minimumConnectionMemory: ").append(toIndentedString(minimumConnectionMemory)).append("\n");
        sb.append("    minimumRequiredConfigMemory: ").append(toIndentedString(minimumRequiredConfigMemory)).append("\n");
        sb.append("    nLogStreamingThreads: ").append(toIndentedString(nLogStreamingThreads)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    natFlowTcpClosedTimeout: ").append(toIndentedString(natFlowTcpClosedTimeout)).append("\n");
        sb.append("    natFlowTcpEstablishedTimeout: ").append(toIndentedString(natFlowTcpEstablishedTimeout)).append("\n");
        sb.append("    natFlowTcpHalfClosedTimeout: ").append(toIndentedString(natFlowTcpHalfClosedTimeout)).append("\n");
        sb.append("    natFlowTcpHandshakeTimeout: ").append(toIndentedString(natFlowTcpHandshakeTimeout)).append("\n");
        sb.append("    natFlowUdpNoresponseTimeout: ").append(toIndentedString(natFlowUdpNoresponseTimeout)).append("\n");
        sb.append("    natFlowUdpResponseTimeout: ").append(toIndentedString(natFlowUdpResponseTimeout)).append("\n");
        sb.append("    nonSignificantLogThrottle: ").append(toIndentedString(nonSignificantLogThrottle)).append("\n");
        sb.append("    numDispatcherCores: ").append(toIndentedString(numDispatcherCores)).append("\n");
        sb.append("    numFlowCoresSumChangesToIgnore: ").append(toIndentedString(numFlowCoresSumChangesToIgnore)).append("\n");
        sb.append("    objsyncConfig: ").append(toIndentedString(objsyncConfig)).append("\n");
        sb.append("    objsyncPort: ").append(toIndentedString(objsyncPort)).append("\n");
        sb.append("    openstackAvailabilityZone: ").append(toIndentedString(openstackAvailabilityZone)).append("\n");
        sb.append("    openstackAvailabilityZones: ").append(toIndentedString(openstackAvailabilityZones)).append("\n");
        sb.append("    openstackMgmtNetworkName: ").append(toIndentedString(openstackMgmtNetworkName)).append("\n");
        sb.append("    openstackMgmtNetworkUuid: ").append(toIndentedString(openstackMgmtNetworkUuid)).append("\n");
        sb.append("    osReservedMemory: ").append(toIndentedString(osReservedMemory)).append("\n");
        sb.append("    pcapTxMode: ").append(toIndentedString(pcapTxMode)).append("\n");
        sb.append("    pcapTxRingRdBalancingFactor: ").append(toIndentedString(pcapTxRingRdBalancingFactor)).append("\n");
        sb.append("    perApp: ").append(toIndentedString(perApp)).append("\n");
        sb.append("    perVsAdmissionControl: ").append(toIndentedString(perVsAdmissionControl)).append("\n");
        sb.append("    placementMode: ").append(toIndentedString(placementMode)).append("\n");
        sb.append("    realtimeSeMetrics: ").append(toIndentedString(realtimeSeMetrics)).append("\n");
        sb.append("    rebootOnPanic: ").append(toIndentedString(rebootOnPanic)).append("\n");
        sb.append("    rebootOnStop: ").append(toIndentedString(rebootOnStop)).append("\n");
        sb.append("    resyncTimeInterval: ").append(toIndentedString(resyncTimeInterval)).append("\n");
        sb.append("    seBandwidthType: ").append(toIndentedString(seBandwidthType)).append("\n");
        sb.append("    seDelayedFlowDelete: ").append(toIndentedString(seDelayedFlowDelete)).append("\n");
        sb.append("    seDeprovisionDelay: ").append(toIndentedString(seDeprovisionDelay)).append("\n");
        sb.append("    seDosProfile: ").append(toIndentedString(seDosProfile)).append("\n");
        sb.append("    seDpHmDrops: ").append(toIndentedString(seDpHmDrops)).append("\n");
        sb.append("    seDpIsolation: ").append(toIndentedString(seDpIsolation)).append("\n");
        sb.append("    seDpIsolationNumNonDpCpus: ").append(toIndentedString(seDpIsolationNumNonDpCpus)).append("\n");
        sb.append("    seDpMaxHbVersion: ").append(toIndentedString(seDpMaxHbVersion)).append("\n");
        sb.append("    seDpVnicQueueStallEventSleep: ").append(toIndentedString(seDpVnicQueueStallEventSleep)).append("\n");
        sb.append("    seDpVnicQueueStallThreshold: ").append(toIndentedString(seDpVnicQueueStallThreshold)).append("\n");
        sb.append("    seDpVnicQueueStallTimeout: ").append(toIndentedString(seDpVnicQueueStallTimeout)).append("\n");
        sb.append("    seDpVnicRestartOnQueueStallCount: ").append(toIndentedString(seDpVnicRestartOnQueueStallCount)).append("\n");
        sb.append("    seDpVnicStallSeRestartWindow: ").append(toIndentedString(seDpVnicStallSeRestartWindow)).append("\n");
        sb.append("    seDpdkPmd: ").append(toIndentedString(seDpdkPmd)).append("\n");
        sb.append("    seFlowProbeRetries: ").append(toIndentedString(seFlowProbeRetries)).append("\n");
        sb.append("    seFlowProbeRetryTimer: ").append(toIndentedString(seFlowProbeRetryTimer)).append("\n");
        sb.append("    seFlowProbeTimer: ").append(toIndentedString(seFlowProbeTimer)).append("\n");
        sb.append("    seGroupAnalyticsPolicy: ").append(toIndentedString(seGroupAnalyticsPolicy)).append("\n");
        sb.append("    seHyperthreadedMode: ").append(toIndentedString(seHyperthreadedMode)).append("\n");
        sb.append("    seIpEncapIpc: ").append(toIndentedString(seIpEncapIpc)).append("\n");
        sb.append("    seIpcUdpPort: ").append(toIndentedString(seIpcUdpPort)).append("\n");
        sb.append("    seKniBurstFactor: ").append(toIndentedString(seKniBurstFactor)).append("\n");
        sb.append("    seL3EncapIpc: ").append(toIndentedString(seL3EncapIpc)).append("\n");
        sb.append("    seLro: ").append(toIndentedString(seLro)).append("\n");
        sb.append("    seMpRingRetryCount: ").append(toIndentedString(seMpRingRetryCount)).append("\n");
        sb.append("    seMtu: ").append(toIndentedString(seMtu)).append("\n");
        sb.append("    seNamePrefix: ").append(toIndentedString(seNamePrefix)).append("\n");
        sb.append("    sePcapLookahead: ").append(toIndentedString(sePcapLookahead)).append("\n");
        sb.append("    sePcapPktCount: ").append(toIndentedString(sePcapPktCount)).append("\n");
        sb.append("    sePcapPktSz: ").append(toIndentedString(sePcapPktSz)).append("\n");
        sb.append("    sePcapQdiscBypass: ").append(toIndentedString(sePcapQdiscBypass)).append("\n");
        sb.append("    sePcapReinitFrequency: ").append(toIndentedString(sePcapReinitFrequency)).append("\n");
        sb.append("    sePcapReinitThreshold: ").append(toIndentedString(sePcapReinitThreshold)).append("\n");
        sb.append("    seProbePort: ").append(toIndentedString(seProbePort)).append("\n");
        sb.append("    seRemotePuntUdpPort: ").append(toIndentedString(seRemotePuntUdpPort)).append("\n");
        sb.append("    seRlProp: ").append(toIndentedString(seRlProp)).append("\n");
        sb.append("    seRouting: ").append(toIndentedString(seRouting)).append("\n");
        sb.append("    seRumSamplingNavInterval: ").append(toIndentedString(seRumSamplingNavInterval)).append("\n");
        sb.append("    seRumSamplingNavPercent: ").append(toIndentedString(seRumSamplingNavPercent)).append("\n");
        sb.append("    seRumSamplingResInterval: ").append(toIndentedString(seRumSamplingResInterval)).append("\n");
        sb.append("    seRumSamplingResPercent: ").append(toIndentedString(seRumSamplingResPercent)).append("\n");
        sb.append("    seSbDedicatedCore: ").append(toIndentedString(seSbDedicatedCore)).append("\n");
        sb.append("    seSbThreads: ").append(toIndentedString(seSbThreads)).append("\n");
        sb.append("    seThreadMultiplier: ").append(toIndentedString(seThreadMultiplier)).append("\n");
        sb.append("    seTracertPortRange: ").append(toIndentedString(seTracertPortRange)).append("\n");
        sb.append("    seTunnelMode: ").append(toIndentedString(seTunnelMode)).append("\n");
        sb.append("    seTunnelUdpPort: ").append(toIndentedString(seTunnelUdpPort)).append("\n");
        sb.append("    seTxBatchSize: ").append(toIndentedString(seTxBatchSize)).append("\n");
        sb.append("    seTxqThreshold: ").append(toIndentedString(seTxqThreshold)).append("\n");
        sb.append("    seUdpEncapIpc: ").append(toIndentedString(seUdpEncapIpc)).append("\n");
        sb.append("    seUseDpdk: ").append(toIndentedString(seUseDpdk)).append("\n");
        sb.append("    seVnicTxSwQueueFlushFrequency: ").append(toIndentedString(seVnicTxSwQueueFlushFrequency)).append("\n");
        sb.append("    seVnicTxSwQueueSize: ").append(toIndentedString(seVnicTxSwQueueSize)).append("\n");
        sb.append("    seVsHbMaxPktsInBatch: ").append(toIndentedString(seVsHbMaxPktsInBatch)).append("\n");
        sb.append("    seVsHbMaxVsInPkt: ").append(toIndentedString(seVsHbMaxVsInPkt)).append("\n");
        sb.append("    selfSeElection: ").append(toIndentedString(selfSeElection)).append("\n");
        sb.append("    serviceIp6Subnets: ").append(toIndentedString(serviceIp6Subnets)).append("\n");
        sb.append("    serviceIpSubnets: ").append(toIndentedString(serviceIpSubnets)).append("\n");
        sb.append("    shmMinimumConfigMemory: ").append(toIndentedString(shmMinimumConfigMemory)).append("\n");
        sb.append("    significantLogThrottle: ").append(toIndentedString(significantLogThrottle)).append("\n");
        sb.append("    sslPreprocessSniHostname: ").append(toIndentedString(sslPreprocessSniHostname)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    transientSharedMemoryMax: ").append(toIndentedString(transientSharedMemoryMax)).append("\n");
        sb.append("    udfLogThrottle: ").append(toIndentedString(udfLogThrottle)).append("\n");
            sb.append("    useHyperthreadedCores: ").append(toIndentedString(useHyperthreadedCores)).append("\n");
        sb.append("    useObjsync: ").append(toIndentedString(useObjsync)).append("\n");
        sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterClusters: ").append(toIndentedString(vcenterClusters)).append("\n");
        sb.append("    vcenterDatastoreMode: ").append(toIndentedString(vcenterDatastoreMode)).append("\n");
        sb.append("    vcenterDatastores: ").append(toIndentedString(vcenterDatastores)).append("\n");
        sb.append("    vcenterDatastoresInclude: ").append(toIndentedString(vcenterDatastoresInclude)).append("\n");
        sb.append("    vcenterFolder: ").append(toIndentedString(vcenterFolder)).append("\n");
        sb.append("    vcenterHosts: ").append(toIndentedString(vcenterHosts)).append("\n");
        sb.append("    vcenters: ").append(toIndentedString(vcenters)).append("\n");
        sb.append("    vcpusPerSe: ").append(toIndentedString(vcpusPerSe)).append("\n");
        sb.append("    vipAsg: ").append(toIndentedString(vipAsg)).append("\n");
        sb.append("    vsHostRedundancy: ").append(toIndentedString(vsHostRedundancy)).append("\n");
        sb.append("    vsScaleinTimeout: ").append(toIndentedString(vsScaleinTimeout)).append("\n");
        sb.append("    vsScaleinTimeoutForUpgrade: ").append(toIndentedString(vsScaleinTimeoutForUpgrade)).append("\n");
        sb.append("    vsScaleoutTimeout: ").append(toIndentedString(vsScaleoutTimeout)).append("\n");
        sb.append("    vsSeScaleoutAdditionalWaitTime: ").append(toIndentedString(vsSeScaleoutAdditionalWaitTime)).append("\n");
        sb.append("    vsSeScaleoutReadyTimeout: ").append(toIndentedString(vsSeScaleoutReadyTimeout)).append("\n");
        sb.append("    vsSwitchoverTimeout: ").append(toIndentedString(vsSwitchoverTimeout)).append("\n");
        sb.append("    vssPlacement: ").append(toIndentedString(vssPlacement)).append("\n");
        sb.append("    vssPlacementEnabled: ").append(toIndentedString(vssPlacementEnabled)).append("\n");
        sb.append("    wafLearningInterval: ").append(toIndentedString(wafLearningInterval)).append("\n");
        sb.append("    wafLearningMemory: ").append(toIndentedString(wafLearningMemory)).append("\n");
        sb.append("    wafMempool: ").append(toIndentedString(wafMempool)).append("\n");
        sb.append("    wafMempoolSize: ").append(toIndentedString(wafMempoolSize)).append("\n");
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

