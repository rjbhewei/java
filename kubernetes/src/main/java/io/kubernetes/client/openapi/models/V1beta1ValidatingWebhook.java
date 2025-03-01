/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1beta1RuleWithOperations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
@ApiModel(description = "ValidatingWebhook describes an admission webhook and the resources and operations it applies to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1beta1ValidatingWebhook {
  public static final String SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS = "admissionReviewVersions";
  @SerializedName(SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS)
  private List<String> admissionReviewVersions = null;

  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  private AdmissionregistrationV1beta1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_POLICY = "matchPolicy";
  @SerializedName(SERIALIZED_NAME_MATCH_POLICY)
  private String matchPolicy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_OBJECT_SELECTOR = "objectSelector";
  @SerializedName(SERIALIZED_NAME_OBJECT_SELECTOR)
  private V1LabelSelector objectSelector;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1beta1RuleWithOperations> rules = null;

  public static final String SERIALIZED_NAME_SIDE_EFFECTS = "sideEffects";
  @SerializedName(SERIALIZED_NAME_SIDE_EFFECTS)
  private String sideEffects;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;


  public V1beta1ValidatingWebhook admissionReviewVersions(List<String> admissionReviewVersions) {
    
    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public V1beta1ValidatingWebhook addAdmissionReviewVersionsItem(String admissionReviewVersionsItem) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList<String>();
    }
    this.admissionReviewVersions.add(admissionReviewVersionsItem);
    return this;
  }

   /**
   * AdmissionReviewVersions is an ordered list of preferred &#x60;AdmissionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to &#x60;[&#39;v1beta1&#39;]&#x60;.
   * @return admissionReviewVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.")

  public List<String> getAdmissionReviewVersions() {
    return admissionReviewVersions;
  }


  public void setAdmissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
  }


  public V1beta1ValidatingWebhook clientConfig(AdmissionregistrationV1beta1WebhookClientConfig clientConfig) {
    
    this.clientConfig = clientConfig;
    return this;
  }

   /**
   * Get clientConfig
   * @return clientConfig
  **/
  @ApiModelProperty(required = true, value = "")

  public AdmissionregistrationV1beta1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }


  public void setClientConfig(AdmissionregistrationV1beta1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }


  public V1beta1ValidatingWebhook failurePolicy(String failurePolicy) {
    
    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
   * @return failurePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.")

  public String getFailurePolicy() {
    return failurePolicy;
  }


  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1beta1ValidatingWebhook matchPolicy(String matchPolicy) {
    
    this.matchPolicy = matchPolicy;
    return this;
  }

   /**
   * matchPolicy defines how the \&quot;rules\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \&quot;Exact\&quot;
   * @return matchPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Exact\"")

  public String getMatchPolicy() {
    return matchPolicy;
  }


  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }


  public V1beta1ValidatingWebhook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ValidatingWebhook namespaceSelector(V1LabelSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1beta1ValidatingWebhook objectSelector(V1LabelSelector objectSelector) {
    
    this.objectSelector = objectSelector;
    return this;
  }

   /**
   * Get objectSelector
   * @return objectSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getObjectSelector() {
    return objectSelector;
  }


  public void setObjectSelector(V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }


  public V1beta1ValidatingWebhook rules(List<V1beta1RuleWithOperations> rules) {
    
    this.rules = rules;
    return this;
  }

  public V1beta1ValidatingWebhook addRulesItem(V1beta1RuleWithOperations rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<V1beta1RuleWithOperations>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.")

  public List<V1beta1RuleWithOperations> getRules() {
    return rules;
  }


  public void setRules(List<V1beta1RuleWithOperations> rules) {
    this.rules = rules;
  }


  public V1beta1ValidatingWebhook sideEffects(String sideEffects) {
    
    this.sideEffects = sideEffects;
    return this;
  }

   /**
   * SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects &#x3D;&#x3D; Unknown or Some. Defaults to Unknown.
   * @return sideEffects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.")

  public String getSideEffects() {
    return sideEffects;
  }


  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }


  public V1beta1ValidatingWebhook timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.")

  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ValidatingWebhook {\n");
    sb.append("    admissionReviewVersions: ").append(toIndentedString(admissionReviewVersions)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    sideEffects: ").append(toIndentedString(sideEffects)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

