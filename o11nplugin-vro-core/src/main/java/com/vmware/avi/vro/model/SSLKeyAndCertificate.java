package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SSLCertificate;
import com.vmware.avi.vro.model.SSLKeyParams;
import com.vmware.avi.vro.model.OCSPConfig;
import com.vmware.avi.vro.model.OCSPResponseInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SSLKeyAndCertificate is a POJO class extends AviRestResource that used for creating
 * SSLKeyAndCertificate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLKeyAndCertificate")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYANDCERTIFICATE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLKeyAndCertificate extends AviRestResource {
  @JsonProperty("ca_certs")
  @JsonInclude(Include.NON_NULL)
  private List<CertificateAuthority> caCerts = null;

  @JsonProperty("certificate")
  @JsonInclude(Include.NON_NULL)
  private SSLCertificate certificate = null;

  @JsonProperty("certificate_base64")
  @JsonInclude(Include.NON_NULL)
  private Boolean certificateBase64 = false;

  @JsonProperty("certificate_management_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String certificateManagementProfileRef = null;

  @JsonProperty("created_by")
  @JsonInclude(Include.NON_NULL)
  private String createdBy = null;

  @JsonProperty("dynamic_params")
  @JsonInclude(Include.NON_NULL)
  private List<CustomParams> dynamicParams = null;

  @JsonProperty("enable_ocsp_stapling")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableOcspStapling = false;

  @JsonProperty("enckey_base64")
  @JsonInclude(Include.NON_NULL)
  private String enckeyBase64 = null;

  @JsonProperty("enckey_name")
  @JsonInclude(Include.NON_NULL)
  private String enckeyName = null;

  @JsonProperty("format")
  @JsonInclude(Include.NON_NULL)
  private String format = "SSL_PEM";

  @JsonProperty("hardwaresecuritymodulegroup_ref")
  @JsonInclude(Include.NON_NULL)
  private String hardwaresecuritymodulegroupRef = null;

  @JsonProperty("key")
  @JsonInclude(Include.NON_NULL)
  private String key = null;

  @JsonProperty("key_base64")
  @JsonInclude(Include.NON_NULL)
  private Boolean keyBase64 = false;

  @JsonProperty("key_params")
  @JsonInclude(Include.NON_NULL)
  private SSLKeyParams keyParams = null;

  @JsonProperty("key_passphrase")
  @JsonInclude(Include.NON_NULL)
  private String keyPassphrase = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("ocsp_config")
  @JsonInclude(Include.NON_NULL)
  private OCSPConfig ocspConfig = null;

  @JsonProperty("ocsp_error_status")
  @JsonInclude(Include.NON_NULL)
  private String ocspErrorStatus = "OCSP_ERR_CERTSTATUS_DISABLED";

  @JsonProperty("ocsp_responder_url_list_from_certs")
  @JsonInclude(Include.NON_NULL)
  private List<String> ocspResponderUrlListFromCerts = null;

  @JsonProperty("ocsp_response_info")
  @JsonInclude(Include.NON_NULL)
  private OCSPResponseInfo ocspResponseInfo = null;

  @JsonProperty("status")
  @JsonInclude(Include.NON_NULL)
  private String status = "SSL_CERTIFICATE_FINISHED";

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ca certificates in certificate chain.
   * @return caCerts
   */
  @VsoMethod
  public List<CertificateAuthority> getCaCerts() {
    return caCerts;
  }

  /**
   * This is the setter method. this will set the caCerts
   * Ca certificates in certificate chain.
   * @return caCerts
   */
  @VsoMethod
  public void setCaCerts(List<CertificateAuthority>  caCerts) {
    this.caCerts = caCerts;
  }

  /**
   * This is the setter method this will set the caCerts
   * Ca certificates in certificate chain.
   * @return caCerts
   */
  @VsoMethod
  public SSLKeyAndCertificate addCaCertsItem(CertificateAuthority caCertsItem) {
    if (this.caCerts == null) {
      this.caCerts = new ArrayList<CertificateAuthority>();
    }
    this.caCerts.add(caCertsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property certificate of obj type sslkeyandcertificate field type str  type ref.
   * @return certificate
   */
  @VsoMethod
  public SSLCertificate getCertificate() {
    return certificate;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property certificate of obj type sslkeyandcertificate field type str  type ref.
   * @param certificate set the certificate.
   */
  @VsoMethod
  public void setCertificate(SSLCertificate certificate) {
    this.certificate = certificate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * States if the certificate is base64 encoded.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return certificateBase64
   */
  @VsoMethod
  public Boolean getCertificateBase64() {
    return certificateBase64;
  }

  /**
   * This is the setter method to the attribute.
   * States if the certificate is base64 encoded.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param certificateBase64 set the certificateBase64.
   */
  @VsoMethod
  public void setCertificateBase64(Boolean  certificateBase64) {
    this.certificateBase64 = certificateBase64;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type certificatemanagementprofile.
   * @return certificateManagementProfileRef
   */
  @VsoMethod
  public String getCertificateManagementProfileRef() {
    return certificateManagementProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type certificatemanagementprofile.
   * @param certificateManagementProfileRef set the certificateManagementProfileRef.
   */
  @VsoMethod
  public void setCertificateManagementProfileRef(String  certificateManagementProfileRef) {
    this.certificateManagementProfileRef = certificateManagementProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dynamic parameters needed for certificate management profile.
   * @return dynamicParams
   */
  @VsoMethod
  public List<CustomParams> getDynamicParams() {
    return dynamicParams;
  }

  /**
   * This is the setter method. this will set the dynamicParams
   * Dynamic parameters needed for certificate management profile.
   * @return dynamicParams
   */
  @VsoMethod
  public void setDynamicParams(List<CustomParams>  dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  /**
   * This is the setter method this will set the dynamicParams
   * Dynamic parameters needed for certificate management profile.
   * @return dynamicParams
   */
  @VsoMethod
  public SSLKeyAndCertificate addDynamicParamsItem(CustomParams dynamicParamsItem) {
    if (this.dynamicParams == null) {
      this.dynamicParams = new ArrayList<CustomParams>();
    }
    this.dynamicParams.add(dynamicParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enables ocsp stapling.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableOcspStapling
   */
  @VsoMethod
  public Boolean getEnableOcspStapling() {
    return enableOcspStapling;
  }

  /**
   * This is the setter method to the attribute.
   * Enables ocsp stapling.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableOcspStapling set the enableOcspStapling.
   */
  @VsoMethod
  public void setEnableOcspStapling(Boolean  enableOcspStapling) {
    this.enableOcspStapling = enableOcspStapling;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Encrypted private key corresponding to the private key (e.g.
   * Those generated by an hsm such as thales nshield).
   * @return enckeyBase64
   */
  @VsoMethod
  public String getEnckeyBase64() {
    return enckeyBase64;
  }

  /**
   * This is the setter method to the attribute.
   * Encrypted private key corresponding to the private key (e.g.
   * Those generated by an hsm such as thales nshield).
   * @param enckeyBase64 set the enckeyBase64.
   */
  @VsoMethod
  public void setEnckeyBase64(String  enckeyBase64) {
    this.enckeyBase64 = enckeyBase64;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the encrypted private key (e.g.
   * Those generated by an hsm such as thales nshield).
   * @return enckeyName
   */
  @VsoMethod
  public String getEnckeyName() {
    return enckeyName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the encrypted private key (e.g.
   * Those generated by an hsm such as thales nshield).
   * @param enckeyName set the enckeyName.
   */
  @VsoMethod
  public void setEnckeyName(String  enckeyName) {
    this.enckeyName = enckeyName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Format of the key/certificate file.
   * Enum options - SSL_PEM, SSL_PKCS12.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_PEM.
   * @return format
   */
  @VsoMethod
  public String getFormat() {
    return format;
  }

  /**
   * This is the setter method to the attribute.
   * Format of the key/certificate file.
   * Enum options - SSL_PEM, SSL_PKCS12.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_PEM.
   * @param format set the format.
   */
  @VsoMethod
  public void setFormat(String  format) {
    this.format = format;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type hardwaresecuritymodulegroup.
   * @return hardwaresecuritymodulegroupRef
   */
  @VsoMethod
  public String getHardwaresecuritymodulegroupRef() {
    return hardwaresecuritymodulegroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type hardwaresecuritymodulegroup.
   * @param hardwaresecuritymodulegroupRef set the hardwaresecuritymodulegroupRef.
   */
  @VsoMethod
  public void setHardwaresecuritymodulegroupRef(String  hardwaresecuritymodulegroupRef) {
    this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Private key.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Private key.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * States if the private key is base64 encoded.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return keyBase64
   */
  @VsoMethod
  public Boolean getKeyBase64() {
    return keyBase64;
  }

  /**
   * This is the setter method to the attribute.
   * States if the private key is base64 encoded.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param keyBase64 set the keyBase64.
   */
  @VsoMethod
  public void setKeyBase64(Boolean  keyBase64) {
    this.keyBase64 = keyBase64;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property key_params of obj type sslkeyandcertificate field type str  type ref.
   * @return keyParams
   */
  @VsoMethod
  public SSLKeyParams getKeyParams() {
    return keyParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property key_params of obj type sslkeyandcertificate field type str  type ref.
   * @param keyParams set the keyParams.
   */
  @VsoMethod
  public void setKeyParams(SSLKeyParams keyParams) {
    this.keyParams = keyParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Passphrase used to encrypt the private key.
   * @return keyPassphrase
   */
  @VsoMethod
  public String getKeyPassphrase() {
    return keyPassphrase;
  }

  /**
   * This is the setter method to the attribute.
   * Passphrase used to encrypt the private key.
   * @param keyPassphrase set the keyPassphrase.
   */
  @VsoMethod
  public void setKeyPassphrase(String  keyPassphrase) {
    this.keyPassphrase = keyPassphrase;
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
   * Configuration related to ocsp.
   * Field introduced in 20.1.1.
   * @return ocspConfig
   */
  @VsoMethod
  public OCSPConfig getOcspConfig() {
    return ocspConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration related to ocsp.
   * Field introduced in 20.1.1.
   * @param ocspConfig set the ocspConfig.
   */
  @VsoMethod
  public void setOcspConfig(OCSPConfig ocspConfig) {
    this.ocspConfig = ocspConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error reported during ocsp status query.
   * Enum options - OCSP_ERR_CERTSTATUS_GOOD, OCSP_ERR_CERTSTATUS_REVOKED, OCSP_ERR_CERTSTATUS_UNKNOWN, OCSP_ERR_CERTSTATUS_SERVERFAIL_ERR,
   * OCSP_ERR_CERTSTATUS_JOBDB, OCSP_ERR_CERTSTATUS_DISABLED, OCSP_ERR_CERTSTATUS_GETCERT, OCSP_ERR_CERTSTATUS_NONVSCERT,
   * OCSP_ERR_CERTSTATUS_SELFSIGNED, OCSP_ERR_CERTSTATUS_CERTFINISH, OCSP_ERR_CERTSTATUS_CACERT, OCSP_ERR_CERTSTATUS_REQUEST,
   * OCSP_ERR_CERTSTATUS_ISSUER_REVOKED, OCSP_ERR_CERTSTATUS_PARSE_CERT, OCSP_ERR_CERTSTATUS_HTTP_REQ, OCSP_ERR_CERTSTATUS_URL_LIST,
   * OCSP_ERR_CERTSTATUS_HTTP_SEND, OCSP_ERR_CERTSTATUS_HTTP_RECV, OCSP_ERR_CERTSTATUS_HTTP_RESP.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as OCSP_ERR_CERTSTATUS_DISABLED.
   * @return ocspErrorStatus
   */
  @VsoMethod
  public String getOcspErrorStatus() {
    return ocspErrorStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Error reported during ocsp status query.
   * Enum options - OCSP_ERR_CERTSTATUS_GOOD, OCSP_ERR_CERTSTATUS_REVOKED, OCSP_ERR_CERTSTATUS_UNKNOWN, OCSP_ERR_CERTSTATUS_SERVERFAIL_ERR,
   * OCSP_ERR_CERTSTATUS_JOBDB, OCSP_ERR_CERTSTATUS_DISABLED, OCSP_ERR_CERTSTATUS_GETCERT, OCSP_ERR_CERTSTATUS_NONVSCERT,
   * OCSP_ERR_CERTSTATUS_SELFSIGNED, OCSP_ERR_CERTSTATUS_CERTFINISH, OCSP_ERR_CERTSTATUS_CACERT, OCSP_ERR_CERTSTATUS_REQUEST,
   * OCSP_ERR_CERTSTATUS_ISSUER_REVOKED, OCSP_ERR_CERTSTATUS_PARSE_CERT, OCSP_ERR_CERTSTATUS_HTTP_REQ, OCSP_ERR_CERTSTATUS_URL_LIST,
   * OCSP_ERR_CERTSTATUS_HTTP_SEND, OCSP_ERR_CERTSTATUS_HTTP_RECV, OCSP_ERR_CERTSTATUS_HTTP_RESP.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as OCSP_ERR_CERTSTATUS_DISABLED.
   * @param ocspErrorStatus set the ocspErrorStatus.
   */
  @VsoMethod
  public void setOcspErrorStatus(String  ocspErrorStatus) {
    this.ocspErrorStatus = ocspErrorStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This is an internal field to store the ocsp responder urls contained in the certificate.
   * Field introduced in 20.1.1.
   * @return ocspResponderUrlListFromCerts
   */
  @VsoMethod
  public List<String> getOcspResponderUrlListFromCerts() {
    return ocspResponderUrlListFromCerts;
  }

  /**
   * This is the setter method. this will set the ocspResponderUrlListFromCerts
   * This is an internal field to store the ocsp responder urls contained in the certificate.
   * Field introduced in 20.1.1.
   * @return ocspResponderUrlListFromCerts
   */
  @VsoMethod
  public void setOcspResponderUrlListFromCerts(List<String>  ocspResponderUrlListFromCerts) {
    this.ocspResponderUrlListFromCerts = ocspResponderUrlListFromCerts;
  }

  /**
   * This is the setter method this will set the ocspResponderUrlListFromCerts
   * This is an internal field to store the ocsp responder urls contained in the certificate.
   * Field introduced in 20.1.1.
   * @return ocspResponderUrlListFromCerts
   */
  @VsoMethod
  public SSLKeyAndCertificate addOcspResponderUrlListFromCertsItem(String ocspResponderUrlListFromCertsItem) {
    if (this.ocspResponderUrlListFromCerts == null) {
      this.ocspResponderUrlListFromCerts = new ArrayList<String>();
    }
    this.ocspResponderUrlListFromCerts.add(ocspResponderUrlListFromCertsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Information related to ocsp response.
   * Field introduced in 20.1.1.
   * @return ocspResponseInfo
   */
  @VsoMethod
  public OCSPResponseInfo getOcspResponseInfo() {
    return ocspResponseInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Information related to ocsp response.
   * Field introduced in 20.1.1.
   * @param ocspResponseInfo set the ocspResponseInfo.
   */
  @VsoMethod
  public void setOcspResponseInfo(OCSPResponseInfo ocspResponseInfo) {
    this.ocspResponseInfo = ocspResponseInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_CERTIFICATE_FINISHED.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
   * Default value when not specified in API or module is interpreted by Avi Controller as SSL_CERTIFICATE_FINISHED.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
  SSLKeyAndCertificate objSSLKeyAndCertificate = (SSLKeyAndCertificate) o;
  return   Objects.equals(this.uuid, objSSLKeyAndCertificate.uuid)&&
  Objects.equals(this.name, objSSLKeyAndCertificate.name)&&
  Objects.equals(this.type, objSSLKeyAndCertificate.type)&&
  Objects.equals(this.certificate, objSSLKeyAndCertificate.certificate)&&
  Objects.equals(this.keyParams, objSSLKeyAndCertificate.keyParams)&&
  Objects.equals(this.key, objSSLKeyAndCertificate.key)&&
  Objects.equals(this.status, objSSLKeyAndCertificate.status)&&
  Objects.equals(this.caCerts, objSSLKeyAndCertificate.caCerts)&&
  Objects.equals(this.enckeyBase64, objSSLKeyAndCertificate.enckeyBase64)&&
  Objects.equals(this.enckeyName, objSSLKeyAndCertificate.enckeyName)&&
  Objects.equals(this.hardwaresecuritymodulegroupRef, objSSLKeyAndCertificate.hardwaresecuritymodulegroupRef)&&
  Objects.equals(this.tenantRef, objSSLKeyAndCertificate.tenantRef)&&
  Objects.equals(this.certificateManagementProfileRef, objSSLKeyAndCertificate.certificateManagementProfileRef)&&
  Objects.equals(this.dynamicParams, objSSLKeyAndCertificate.dynamicParams)&&
  Objects.equals(this.createdBy, objSSLKeyAndCertificate.createdBy)&&
  Objects.equals(this.format, objSSLKeyAndCertificate.format)&&
  Objects.equals(this.keyPassphrase, objSSLKeyAndCertificate.keyPassphrase)&&
  Objects.equals(this.certificateBase64, objSSLKeyAndCertificate.certificateBase64)&&
  Objects.equals(this.keyBase64, objSSLKeyAndCertificate.keyBase64)&&
  Objects.equals(this.enableOcspStapling, objSSLKeyAndCertificate.enableOcspStapling)&&
  Objects.equals(this.ocspResponderUrlListFromCerts, objSSLKeyAndCertificate.ocspResponderUrlListFromCerts)&&
  Objects.equals(this.ocspConfig, objSSLKeyAndCertificate.ocspConfig)&&
  Objects.equals(this.ocspResponseInfo, objSSLKeyAndCertificate.ocspResponseInfo)&&
  Objects.equals(this.ocspErrorStatus, objSSLKeyAndCertificate.ocspErrorStatus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLKeyAndCertificate {\n");
      sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateBase64: ").append(toIndentedString(certificateBase64)).append("\n");
        sb.append("    certificateManagementProfileRef: ").append(toIndentedString(certificateManagementProfileRef)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    dynamicParams: ").append(toIndentedString(dynamicParams)).append("\n");
        sb.append("    enableOcspStapling: ").append(toIndentedString(enableOcspStapling)).append("\n");
        sb.append("    enckeyBase64: ").append(toIndentedString(enckeyBase64)).append("\n");
        sb.append("    enckeyName: ").append(toIndentedString(enckeyName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyBase64: ").append(toIndentedString(keyBase64)).append("\n");
        sb.append("    keyParams: ").append(toIndentedString(keyParams)).append("\n");
        sb.append("    keyPassphrase: ").append(toIndentedString(keyPassphrase)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ocspConfig: ").append(toIndentedString(ocspConfig)).append("\n");
        sb.append("    ocspErrorStatus: ").append(toIndentedString(ocspErrorStatus)).append("\n");
        sb.append("    ocspResponderUrlListFromCerts: ").append(toIndentedString(ocspResponderUrlListFromCerts)).append("\n");
        sb.append("    ocspResponseInfo: ").append(toIndentedString(ocspResponseInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

