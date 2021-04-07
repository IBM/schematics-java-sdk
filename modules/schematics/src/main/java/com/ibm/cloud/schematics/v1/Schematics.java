/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

/*
 * IBM OpenAPI SDK Code Generator Version: 3.12.2-b734cb71-20200916-142547
 */

package com.ibm.cloud.schematics.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.common.SdkCommon;
import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.CreateSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetDiscoveredKmsInstancesOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryValueOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.GetSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceDeletionJobStatusOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceLogUrlsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceReadmeOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceStateOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceTemplateStateOptions;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoriesOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoryValuesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListSharedDatasetsOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.OutputValuesItem;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceInventoryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceJobOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecord;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponse;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponseList;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarOptions;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityCommandResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityDestroyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * Schematics Service is to provide the capability to manage resources  of (cloud) provider infrastructure using file
 * based configurations.  With the Schematics service the customer is able to specify the  required set of resources and
 * their configuration in ''config files'',  and then pass these config files to the service to fulfill it by  calling
 * the necessary actions on the infrastructure.  This principle is also known as Infrastructure as Code.  For more
 * information refer to  https://cloud.ibm.com/docs/schematics?topic=schematics-getting-started'.
 *
 * @version v1
 */
public class Schematics extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "schematics";

  public static final String DEFAULT_SERVICE_URL = "https://schematics-dev.containers.appdomain.cloud";

 /**
   * Class method which constructs an instance of the `Schematics` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Schematics` client using external configuration
   */
  public static Schematics newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Schematics` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Schematics` client using external configuration
   */
  public static Schematics newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Schematics service = new Schematics(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Schematics` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Schematics(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List supported schematics locations.
   *
   * List supported schematics locations.
   *
   * @param listSchematicsLocationOptions the {@link ListSchematicsLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<SchematicsLocations>> listSchematicsLocation(ListSchematicsLocationOptions listSchematicsLocationOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/locations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listSchematicsLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<SchematicsLocations>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<SchematicsLocations>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List supported schematics locations.
   *
   * List supported schematics locations.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<SchematicsLocations>> listSchematicsLocation() {
    return listSchematicsLocation(null);
  }

  /**
   * List of resource groups in the Account.
   *
   * List of resource groups in the Account.
   *
   * @param listResourceGroupOptions the {@link ListResourceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ResourceGroupResponse>> listResourceGroup(ListResourceGroupOptions listResourceGroupOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/resource_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listResourceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<ResourceGroupResponse>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<ResourceGroupResponse>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List of resource groups in the Account.
   *
   * List of resource groups in the Account.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ResourceGroupResponse>> listResourceGroup() {
    return listResourceGroup(null);
  }

  /**
   * Get schematics version.
   *
   * Get schematics version.
   *
   * @param getSchematicsVersionOptions the {@link GetSchematicsVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VersionResponse}
   */
  public ServiceCall<VersionResponse> getSchematicsVersion(GetSchematicsVersionOptions getSchematicsVersionOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/version"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getSchematicsVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VersionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VersionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get schematics version.
   *
   * Get schematics version.
   *
   * @return a {@link ServiceCall} with a result of type {@link VersionResponse}
   */
  public ServiceCall<VersionResponse> getSchematicsVersion() {
    return getSchematicsVersion(null);
  }

  /**
   * List all workspace definitions.
   *
   * List all workspace definitions.
   *
   * @param listWorkspacesOptions the {@link ListWorkspacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponseList}
   */
  public ServiceCall<WorkspaceResponseList> listWorkspaces(ListWorkspacesOptions listWorkspacesOptions) {
    if (listWorkspacesOptions == null) {
      listWorkspacesOptions = new ListWorkspacesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listWorkspaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspacesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspacesOptions.offset()));
    }
    if (listWorkspacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspacesOptions.limit()));
    }
    ResponseConverter<WorkspaceResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all workspace definitions.
   *
   * List all workspace definitions.
   *
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponseList}
   */
  public ServiceCall<WorkspaceResponseList> listWorkspaces() {
    return listWorkspaces(null);
  }

  /**
   * Create workspace definition.
   *
   * Create workspace definition.
   *
   * @param createWorkspaceOptions the {@link CreateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> createWorkspace(CreateWorkspaceOptions createWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceOptions,
      "createWorkspaceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createWorkspaceOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (createWorkspaceOptions.appliedShareddataIds() != null) {
      contentJson.add("applied_shareddata_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.appliedShareddataIds()));
    }
    if (createWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.catalogRef()));
    }
    if (createWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", createWorkspaceOptions.description());
    }
    if (createWorkspaceOptions.location() != null) {
      contentJson.addProperty("location", createWorkspaceOptions.location());
    }
    if (createWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", createWorkspaceOptions.name());
    }
    if (createWorkspaceOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createWorkspaceOptions.resourceGroup());
    }
    if (createWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.sharedData()));
    }
    if (createWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.tags()));
    }
    if (createWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.templateData()));
    }
    if (createWorkspaceOptions.templateRef() != null) {
      contentJson.addProperty("template_ref", createWorkspaceOptions.templateRef());
    }
    if (createWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.templateRepo()));
    }
    if (createWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.type()));
    }
    if (createWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.workspaceStatus()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create workspace definition.
   *
   * Create workspace definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> createWorkspace() {
    return createWorkspace(null);
  }

  /**
   * Get workspace definition.
   *
   * Get workspace definition.
   *
   * @param getWorkspaceOptions the {@link GetWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> getWorkspace(GetWorkspaceOptions getWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOptions,
      "getWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the workspace definition.
   *
   * Replace the workspace definition.
   *
   * @param replaceWorkspaceOptions the {@link ReplaceWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> replaceWorkspace(ReplaceWorkspaceOptions replaceWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWorkspaceOptions,
      "replaceWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", replaceWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.catalogRef()));
    }
    if (replaceWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", replaceWorkspaceOptions.description());
    }
    if (replaceWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", replaceWorkspaceOptions.name());
    }
    if (replaceWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.sharedData()));
    }
    if (replaceWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.tags()));
    }
    if (replaceWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.templateData()));
    }
    if (replaceWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.templateRepo()));
    }
    if (replaceWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.type()));
    }
    if (replaceWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.workspaceStatus()));
    }
    if (replaceWorkspaceOptions.workspaceStatusMsg() != null) {
      contentJson.add("workspace_status_msg", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.workspaceStatusMsg()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a workspace definition.
   *
   * Delete a workspace definition.  Use destroy_resource='true' to destroy the related cloud resource.
   *
   * @param deleteWorkspaceOptions the {@link DeleteWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> deleteWorkspace(DeleteWorkspaceOptions deleteWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkspaceOptions,
      "deleteWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", deleteWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", deleteWorkspaceOptions.refreshToken());
    if (deleteWorkspaceOptions.destroyResources() != null) {
      builder.query("destroy_resources", String.valueOf(deleteWorkspaceOptions.destroyResources()));
    }
    ResponseConverter<String> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<String>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the workspace definition.
   *
   * Update the workspace definition.
   *
   * @param updateWorkspaceOptions the {@link UpdateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> updateWorkspace(UpdateWorkspaceOptions updateWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWorkspaceOptions,
      "updateWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", updateWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.catalogRef()));
    }
    if (updateWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", updateWorkspaceOptions.description());
    }
    if (updateWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", updateWorkspaceOptions.name());
    }
    if (updateWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.sharedData()));
    }
    if (updateWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.tags()));
    }
    if (updateWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.templateData()));
    }
    if (updateWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.templateRepo()));
    }
    if (updateWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.type()));
    }
    if (updateWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.workspaceStatus()));
    }
    if (updateWorkspaceOptions.workspaceStatusMsg() != null) {
      contentJson.add("workspace_status_msg", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.workspaceStatusMsg()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload template tar file for the workspace.
   *
   * Upload template tar file for the workspace.
   *
   * @param uploadTemplateTarOptions the {@link UploadTemplateTarOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateRepoTarUploadResponse}
   */
  public ServiceCall<TemplateRepoTarUploadResponse> uploadTemplateTar(UploadTemplateTarOptions uploadTemplateTarOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarOptions,
      "uploadTemplateTarOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarOptions.file() != null), "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", uploadTemplateTarOptions.wId());
    pathParamsMap.put("t_id", uploadTemplateTarOptions.tId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "uploadTemplateTar");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(uploadTemplateTarOptions.file(), uploadTemplateTarOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<TemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the workspace readme.
   *
   * Get the workspace readme.
   *
   * @param getWorkspaceReadmeOptions the {@link GetWorkspaceReadmeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateReadme}
   */
  public ServiceCall<TemplateReadme> getWorkspaceReadme(GetWorkspaceReadmeOptions getWorkspaceReadmeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceReadmeOptions,
      "getWorkspaceReadmeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceReadmeOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/templates/readme", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceReadme");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceReadmeOptions.ref() != null) {
      builder.query("ref", String.valueOf(getWorkspaceReadmeOptions.ref()));
    }
    if (getWorkspaceReadmeOptions.formatted() != null) {
      builder.query("formatted", String.valueOf(getWorkspaceReadmeOptions.formatted()));
    }
    ResponseConverter<TemplateReadme> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateReadme>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all workspace activities.
   *
   * List all workspace activities.
   *
   * @param listWorkspaceActivitiesOptions the {@link ListWorkspaceActivitiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivities}
   */
  public ServiceCall<WorkspaceActivities> listWorkspaceActivities(ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWorkspaceActivitiesOptions,
      "listWorkspaceActivitiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", listWorkspaceActivitiesOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listWorkspaceActivities");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspaceActivitiesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspaceActivitiesOptions.offset()));
    }
    if (listWorkspaceActivitiesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspaceActivitiesOptions.limit()));
    }
    ResponseConverter<WorkspaceActivities> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivities>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get workspace activity details.
   *
   * Get workspace activity details.
   *
   * @param getWorkspaceActivityOptions the {@link GetWorkspaceActivityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivity}
   */
  public ServiceCall<WorkspaceActivity> getWorkspaceActivity(GetWorkspaceActivityOptions getWorkspaceActivityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceActivityOptions,
      "getWorkspaceActivityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceActivityOptions.wId());
    pathParamsMap.put("activity_id", getWorkspaceActivityOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceActivity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivity> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivity>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop the workspace activity.
   *
   * Stop the workspace activity.
   *
   * @param deleteWorkspaceActivityOptions the {@link DeleteWorkspaceActivityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityApplyResult}
   */
  public ServiceCall<WorkspaceActivityApplyResult> deleteWorkspaceActivity(DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkspaceActivityOptions,
      "deleteWorkspaceActivityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", deleteWorkspaceActivityOptions.wId());
    pathParamsMap.put("activity_id", deleteWorkspaceActivityOptions.activityId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteWorkspaceActivity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivityApplyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityApplyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run terraform Commands.
   *
   * Run terraform Commands on workspaces.
   *
   * @param runWorkspaceCommandsOptions the {@link RunWorkspaceCommandsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityCommandResult}
   */
  public ServiceCall<WorkspaceActivityCommandResult> runWorkspaceCommands(RunWorkspaceCommandsOptions runWorkspaceCommandsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runWorkspaceCommandsOptions,
      "runWorkspaceCommandsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", runWorkspaceCommandsOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/commands", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "runWorkspaceCommands");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", runWorkspaceCommandsOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (runWorkspaceCommandsOptions.commands() != null) {
      contentJson.add("commands", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runWorkspaceCommandsOptions.commands()));
    }
    if (runWorkspaceCommandsOptions.operationName() != null) {
      contentJson.addProperty("operation_name", runWorkspaceCommandsOptions.operationName());
    }
    if (runWorkspaceCommandsOptions.description() != null) {
      contentJson.addProperty("description", runWorkspaceCommandsOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityCommandResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityCommandResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run schematics workspace 'apply' activity.
   *
   * Run schematics workspace 'apply' activity.
   *
   * @param applyWorkspaceCommandOptions the {@link ApplyWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityApplyResult}
   */
  public ServiceCall<WorkspaceActivityApplyResult> applyWorkspaceCommand(ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(applyWorkspaceCommandOptions,
      "applyWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", applyWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/apply", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "applyWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", applyWorkspaceCommandOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (applyWorkspaceCommandOptions.actionOptions() != null) {
      contentJson.add("action_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(applyWorkspaceCommandOptions.actionOptions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityApplyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityApplyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run workspace 'destroy' activity.
   *
   * Run workspace 'destroy' activity,  to destroy all the resources associated with the workspace.  WARNING: This
   * action cannot be reversed.
   *
   * @param destroyWorkspaceCommandOptions the {@link DestroyWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityDestroyResult}
   */
  public ServiceCall<WorkspaceActivityDestroyResult> destroyWorkspaceCommand(DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(destroyWorkspaceCommandOptions,
      "destroyWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", destroyWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/destroy", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "destroyWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", destroyWorkspaceCommandOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (destroyWorkspaceCommandOptions.actionOptions() != null) {
      contentJson.add("action_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(destroyWorkspaceCommandOptions.actionOptions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityDestroyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityDestroyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run workspace 'plan' activity,.
   *
   * Run schematics workspace 'plan' activity,  to preview the change before running an 'apply' activity.
   *
   * @param planWorkspaceCommandOptions the {@link PlanWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityPlanResult}
   */
  public ServiceCall<WorkspaceActivityPlanResult> planWorkspaceCommand(PlanWorkspaceCommandOptions planWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(planWorkspaceCommandOptions,
      "planWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", planWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/plan", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "planWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", planWorkspaceCommandOptions.refreshToken());
    ResponseConverter<WorkspaceActivityPlanResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityPlanResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run workspace 'refresh' activity.
   *
   * Run workspace 'refresh' activity.
   *
   * @param refreshWorkspaceCommandOptions the {@link RefreshWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityRefreshResult}
   */
  public ServiceCall<WorkspaceActivityRefreshResult> refreshWorkspaceCommand(RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(refreshWorkspaceCommandOptions,
      "refreshWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", refreshWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/refresh", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "refreshWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", refreshWorkspaceCommandOptions.refreshToken());
    ResponseConverter<WorkspaceActivityRefreshResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityRefreshResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the input values of the workspace.
   *
   * Get the input values of the workspace.
   *
   * @param getWorkspaceInputsOptions the {@link GetWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateValues}
   */
  public ServiceCall<TemplateValues> getWorkspaceInputs(GetWorkspaceInputsOptions getWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceInputsOptions,
      "getWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceInputsOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceInputsOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TemplateValues> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateValues>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the input values for the workspace.
   *
   * Replace the input values for the workspace.
   *
   * @param replaceWorkspaceInputsOptions the {@link ReplaceWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UserValues}
   */
  public ServiceCall<UserValues> replaceWorkspaceInputs(ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWorkspaceInputsOptions,
      "replaceWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", replaceWorkspaceInputsOptions.wId());
    pathParamsMap.put("t_id", replaceWorkspaceInputsOptions.tId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceWorkspaceInputsOptions.envValues() != null) {
      contentJson.add("env_values", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceInputsOptions.envValues()));
    }
    if (replaceWorkspaceInputsOptions.values() != null) {
      contentJson.addProperty("values", replaceWorkspaceInputsOptions.values());
    }
    if (replaceWorkspaceInputsOptions.variablestore() != null) {
      contentJson.add("variablestore", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceInputsOptions.variablestore()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<UserValues> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UserValues>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the input values of the workspace.
   *
   * Get all the input values of the workspace.
   *
   * @param getAllWorkspaceInputsOptions the {@link GetAllWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceTemplateValuesResponse}
   */
  public ServiceCall<WorkspaceTemplateValuesResponse> getAllWorkspaceInputs(GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllWorkspaceInputsOptions,
      "getAllWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getAllWorkspaceInputsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/templates/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAllWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceTemplateValuesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceTemplateValuesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the input metadata of the workspace.
   *
   * Get the input metadata of the workspace.
   *
   * @param getWorkspaceInputMetadataOptions the {@link GetWorkspaceInputMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<Object>> getWorkspaceInputMetadata(GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceInputMetadataOptions,
      "getWorkspaceInputMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceInputMetadataOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceInputMetadataOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values_metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceInputMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<Object>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the output values of the workspace.
   *
   * Get all the output values from your workspace; (ex. result of terraform output command).
   *
   * @param getWorkspaceOutputsOptions the {@link GetWorkspaceOutputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<OutputValuesItem>> getWorkspaceOutputs(GetWorkspaceOutputsOptions getWorkspaceOutputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOutputsOptions,
      "getWorkspaceOutputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceOutputsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/output_values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceOutputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<OutputValuesItem>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<OutputValuesItem>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the resources created by the workspace.
   *
   * Get all the resources created by the workspace.
   *
   * @param getWorkspaceResourcesOptions the {@link GetWorkspaceResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<TemplateResources>> getWorkspaceResources(GetWorkspaceResourcesOptions getWorkspaceResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceResourcesOptions,
      "getWorkspaceResourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceResourcesOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/resources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<TemplateResources>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<TemplateResources>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the workspace state.
   *
   * Get the workspace state.
   *
   * @param getWorkspaceStateOptions the {@link GetWorkspaceStateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StateStoreResponseList}
   */
  public ServiceCall<StateStoreResponseList> getWorkspaceState(GetWorkspaceStateOptions getWorkspaceStateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceStateOptions,
      "getWorkspaceStateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceStateOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/state_stores", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceState");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<StateStoreResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StateStoreResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the template state.
   *
   * Get the template state.
   *
   * @param getWorkspaceTemplateStateOptions the {@link GetWorkspaceTemplateStateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateStateStore}
   */
  public ServiceCall<TemplateStateStore> getWorkspaceTemplateState(GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceTemplateStateOptions,
      "getWorkspaceTemplateStateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceTemplateStateOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceTemplateStateOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/state_store", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceTemplateState");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TemplateStateStore> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateStateStore>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the workspace activity log urls.
   *
   * View an activity log for Terraform actions that ran against your workspace.  You can view logs for plan, apply, and
   * destroy actions.      operationId: get_activity_log_urls.
   *
   * @param getWorkspaceActivityLogsOptions the {@link GetWorkspaceActivityLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityLogs}
   */
  public ServiceCall<WorkspaceActivityLogs> getWorkspaceActivityLogs(GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceActivityLogsOptions,
      "getWorkspaceActivityLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceActivityLogsOptions.wId());
    pathParamsMap.put("activity_id", getWorkspaceActivityLogsOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceActivityLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivityLogs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityLogs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all workspace log urls.
   *
   * Get all workspace log urls.
   *
   * @param getWorkspaceLogUrlsOptions the {@link GetWorkspaceLogUrlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogStoreResponseList}
   */
  public ServiceCall<LogStoreResponseList> getWorkspaceLogUrls(GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceLogUrlsOptions,
      "getWorkspaceLogUrlsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceLogUrlsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/log_stores", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceLogUrls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LogStoreResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogStoreResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all template logs.
   *
   * Get all template logs.
   *
   * @param getTemplateLogsOptions the {@link GetTemplateLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getTemplateLogs(GetTemplateLogsOptions getTemplateLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateLogsOptions,
      "getTemplateLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getTemplateLogsOptions.wId());
    pathParamsMap.put("t_id", getTemplateLogsOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/log_store", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getTemplateLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTemplateLogsOptions.logTfCmd() != null) {
      builder.query("log_tf_cmd", String.valueOf(getTemplateLogsOptions.logTfCmd()));
    }
    if (getTemplateLogsOptions.logTfPrefix() != null) {
      builder.query("log_tf_prefix", String.valueOf(getTemplateLogsOptions.logTfPrefix()));
    }
    if (getTemplateLogsOptions.logTfNullResource() != null) {
      builder.query("log_tf_null_resource", String.valueOf(getTemplateLogsOptions.logTfNullResource()));
    }
    if (getTemplateLogsOptions.logTfAnsible() != null) {
      builder.query("log_tf_ansible", String.valueOf(getTemplateLogsOptions.logTfAnsible()));
    }
    ResponseConverter<String> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<String>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the template activity logs.
   *
   * View an activity log for Terraform actions that ran for a template against your workspace.  You can view logs for
   * plan, apply, and destroy actions.
   *
   * @param getTemplateActivityLogOptions the {@link GetTemplateActivityLogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getTemplateActivityLog(GetTemplateActivityLogOptions getTemplateActivityLogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateActivityLogOptions,
      "getTemplateActivityLogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getTemplateActivityLogOptions.wId());
    pathParamsMap.put("t_id", getTemplateActivityLogOptions.tId());
    pathParamsMap.put("activity_id", getTemplateActivityLogOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/log_store/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getTemplateActivityLog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTemplateActivityLogOptions.logTfCmd() != null) {
      builder.query("log_tf_cmd", String.valueOf(getTemplateActivityLogOptions.logTfCmd()));
    }
    if (getTemplateActivityLogOptions.logTfPrefix() != null) {
      builder.query("log_tf_prefix", String.valueOf(getTemplateActivityLogOptions.logTfPrefix()));
    }
    if (getTemplateActivityLogOptions.logTfNullResource() != null) {
      builder.query("log_tf_null_resource", String.valueOf(getTemplateActivityLogOptions.logTfNullResource()));
    }
    if (getTemplateActivityLogOptions.logTfAnsible() != null) {
      builder.query("log_tf_ansible", String.valueOf(getTemplateActivityLogOptions.logTfAnsible()));
    }
    ResponseConverter<String> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<String>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete multiple workspaces.
   *
   * Delete multiple workspaces.  Use ?destroy_resource="true" to destroy the related cloud resources,  otherwise the
   * resources must be managed outside of Schematics.
   *
   * @param createWorkspaceDeletionJobOptions the {@link CreateWorkspaceDeletionJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceBulkDeleteResponse}
   */
  public ServiceCall<WorkspaceBulkDeleteResponse> createWorkspaceDeletionJob(CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceDeletionJobOptions,
      "createWorkspaceDeletionJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspace_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createWorkspaceDeletionJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", createWorkspaceDeletionJobOptions.refreshToken());
    if (createWorkspaceDeletionJobOptions.destroyResources() != null) {
      builder.query("destroy_resources", String.valueOf(createWorkspaceDeletionJobOptions.destroyResources()));
    }
    final JsonObject contentJson = new JsonObject();
    if (createWorkspaceDeletionJobOptions.newDeleteWorkspaces() != null) {
      contentJson.addProperty("delete_workspaces", createWorkspaceDeletionJobOptions.newDeleteWorkspaces());
    }
    if (createWorkspaceDeletionJobOptions.newDestroyResources() != null) {
      contentJson.addProperty("destroy_resources", createWorkspaceDeletionJobOptions.newDestroyResources());
    }
    if (createWorkspaceDeletionJobOptions.newJob() != null) {
      contentJson.addProperty("job", createWorkspaceDeletionJobOptions.newJob());
    }
    if (createWorkspaceDeletionJobOptions.newVersion() != null) {
      contentJson.addProperty("version", createWorkspaceDeletionJobOptions.newVersion());
    }
    if (createWorkspaceDeletionJobOptions.newWorkspaces() != null) {
      contentJson.add("workspaces", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceDeletionJobOptions.newWorkspaces()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceBulkDeleteResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceBulkDeleteResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the workspace deletion job status.
   *
   * Get the workspace deletion job status.
   *
   * @param getWorkspaceDeletionJobStatusOptions the {@link GetWorkspaceDeletionJobStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceJobResponse}
   */
  public ServiceCall<WorkspaceJobResponse> getWorkspaceDeletionJobStatus(GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceDeletionJobStatusOptions,
      "getWorkspaceDeletionJobStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("wj_id", getWorkspaceDeletionJobStatusOptions.wjId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspace_jobs/{wj_id}/status", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceDeletionJobStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an Action definition.
   *
   * Create a new Action definition.
   *
   * @param createActionOptions the {@link CreateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> createAction(CreateActionOptions createActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionOptions,
      "createActionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createActionOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (createActionOptions.name() != null) {
      contentJson.addProperty("name", createActionOptions.name());
    }
    if (createActionOptions.description() != null) {
      contentJson.addProperty("description", createActionOptions.description());
    }
    if (createActionOptions.location() != null) {
      contentJson.addProperty("location", createActionOptions.location());
    }
    if (createActionOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createActionOptions.resourceGroup());
    }
    if (createActionOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.tags()));
    }
    if (createActionOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.userState()));
    }
    if (createActionOptions.sourceReadmeUrl() != null) {
      contentJson.addProperty("source_readme_url", createActionOptions.sourceReadmeUrl());
    }
    if (createActionOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.source()));
    }
    if (createActionOptions.sourceType() != null) {
      contentJson.addProperty("source_type", createActionOptions.sourceType());
    }
    if (createActionOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", createActionOptions.commandParameter());
    }
    if (createActionOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.bastion()));
    }
    if (createActionOptions.inventory() != null) {
      contentJson.addProperty("inventory", createActionOptions.inventory());
    }
    if (createActionOptions.bastionCredential() != null) {
      contentJson.add("bastion_credential", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.bastionCredential()));
    }
    if (createActionOptions.credentials() != null) {
      contentJson.add("credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.credentials()));
    }
    if (createActionOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.inputs()));
    }
    if (createActionOptions.outputs() != null) {
      contentJson.add("outputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.outputs()));
    }
    if (createActionOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.settings()));
    }
    if (createActionOptions.state() != null) {
      contentJson.add("state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.state()));
    }
    if (createActionOptions.sysLock() != null) {
      contentJson.add("sys_lock", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.sysLock()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an Action definition.
   *
   * Create a new Action definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> createAction() {
    return createAction(null);
  }

  /**
   * Get all the Action definitions.
   *
   * Get all the Action definitions.
   *
   * @param listActionsOptions the {@link ListActionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions(ListActionsOptions listActionsOptions) {
    if (listActionsOptions == null) {
      listActionsOptions = new ListActionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listActions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listActionsOptions.offset()));
    }
    if (listActionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionsOptions.limit()));
    }
    if (listActionsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listActionsOptions.sort()));
    }
    if (listActionsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listActionsOptions.profile()));
    }
    ResponseConverter<ActionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Action definitions.
   *
   * Get all the Action definitions.
   *
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions() {
    return listActions(null);
  }

  /**
   * Get the Action definition.
   *
   * Get the Action definition.
   *
   * @param getActionOptions the {@link GetActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> getAction(GetActionOptions getActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionOptions,
      "getActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", getActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getActionOptions.profile() != null) {
      builder.query("profile", String.valueOf(getActionOptions.profile()));
    }
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the Action.
   *
   * Delete the Action definition.
   *
   * @param deleteActionOptions the {@link DeleteActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAction(DeleteActionOptions deleteActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionOptions,
      "deleteActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", deleteActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteActionOptions.force() != null) {
      builder.header("force", deleteActionOptions.force());
    }
    if (deleteActionOptions.propagate() != null) {
      builder.header("propagate", deleteActionOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Action definition.
   *
   * Update the Action definition.
   *
   * @param updateActionOptions the {@link UpdateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> updateAction(UpdateActionOptions updateActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateActionOptions,
      "updateActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", updateActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", updateActionOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateActionOptions.name() != null) {
      contentJson.addProperty("name", updateActionOptions.name());
    }
    if (updateActionOptions.description() != null) {
      contentJson.addProperty("description", updateActionOptions.description());
    }
    if (updateActionOptions.location() != null) {
      contentJson.addProperty("location", updateActionOptions.location());
    }
    if (updateActionOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updateActionOptions.resourceGroup());
    }
    if (updateActionOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.tags()));
    }
    if (updateActionOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.userState()));
    }
    if (updateActionOptions.sourceReadmeUrl() != null) {
      contentJson.addProperty("source_readme_url", updateActionOptions.sourceReadmeUrl());
    }
    if (updateActionOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.source()));
    }
    if (updateActionOptions.sourceType() != null) {
      contentJson.addProperty("source_type", updateActionOptions.sourceType());
    }
    if (updateActionOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", updateActionOptions.commandParameter());
    }
    if (updateActionOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.bastion()));
    }
    if (updateActionOptions.inventory() != null) {
      contentJson.addProperty("inventory", updateActionOptions.inventory());
    }
    if (updateActionOptions.bastionCredential() != null) {
      contentJson.add("bastion_credential", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.bastionCredential()));
    }
    if (updateActionOptions.credentials() != null) {
      contentJson.add("credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.credentials()));
    }
    if (updateActionOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.inputs()));
    }
    if (updateActionOptions.outputs() != null) {
      contentJson.add("outputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.outputs()));
    }
    if (updateActionOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.settings()));
    }
    if (updateActionOptions.state() != null) {
      contentJson.add("state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.state()));
    }
    if (updateActionOptions.sysLock() != null) {
      contentJson.add("sys_lock", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.sysLock()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload template tar file for the action.
   *
   * Upload template tar file for the action.
   *
   * @param uploadTemplateTarActionOptions the {@link UploadTemplateTarActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateRepoTarUploadResponse}
   */
  public ServiceCall<TemplateRepoTarUploadResponse> uploadTemplateTarAction(UploadTemplateTarActionOptions uploadTemplateTarActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarActionOptions,
      "uploadTemplateTarActionOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarActionOptions.file() != null), "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", uploadTemplateTarActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "uploadTemplateTarAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarActionOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(uploadTemplateTarActionOptions.file(), uploadTemplateTarActionOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<TemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a Job record and launch the Job.
   *
   * Creare a Job record and launch the Job.
   *
   * @param createJobOptions the {@link CreateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> createJob(CreateJobOptions createJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createJobOptions,
      "createJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", createJobOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (createJobOptions.commandObject() != null) {
      contentJson.addProperty("command_object", createJobOptions.commandObject());
    }
    if (createJobOptions.commandObjectId() != null) {
      contentJson.addProperty("command_object_id", createJobOptions.commandObjectId());
    }
    if (createJobOptions.commandName() != null) {
      contentJson.addProperty("command_name", createJobOptions.commandName());
    }
    if (createJobOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", createJobOptions.commandParameter());
    }
    if (createJobOptions.commandOptions() != null) {
      contentJson.add("command_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.commandOptions()));
    }
    if (createJobOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.inputs()));
    }
    if (createJobOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.settings()));
    }
    if (createJobOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.tags()));
    }
    if (createJobOptions.location() != null) {
      contentJson.addProperty("location", createJobOptions.location());
    }
    if (createJobOptions.status() != null) {
      contentJson.add("status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.status()));
    }
    if (createJobOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.data()));
    }
    if (createJobOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.bastion()));
    }
    if (createJobOptions.logSummary() != null) {
      contentJson.add("log_summary", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.logSummary()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Job records.
   *
   * Get all the Job records.
   *
   * @param listJobsOptions the {@link ListJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs(ListJobsOptions listJobsOptions) {
    if (listJobsOptions == null) {
      listJobsOptions = new ListJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listJobsOptions.offset()));
    }
    if (listJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listJobsOptions.limit()));
    }
    if (listJobsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listJobsOptions.sort()));
    }
    if (listJobsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listJobsOptions.profile()));
    }
    if (listJobsOptions.resource() != null) {
      builder.query("resource", String.valueOf(listJobsOptions.resource()));
    }
    if (listJobsOptions.actionId() != null) {
      builder.query("action_id", String.valueOf(listJobsOptions.actionId()));
    }
    if (listJobsOptions.list() != null) {
      builder.query("list", String.valueOf(listJobsOptions.list()));
    }
    ResponseConverter<JobList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Job records.
   *
   * Get all the Job records.
   *
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs() {
    return listJobs(null);
  }

  /**
   * Clone the Job-record, and relaunch the Job.
   *
   * Clone the Job-record, and relaunch the Job.
   *
   * @param replaceJobOptions the {@link ReplaceJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> replaceJob(ReplaceJobOptions replaceJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceJobOptions,
      "replaceJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", replaceJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", replaceJobOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (replaceJobOptions.commandObject() != null) {
      contentJson.addProperty("command_object", replaceJobOptions.commandObject());
    }
    if (replaceJobOptions.commandObjectId() != null) {
      contentJson.addProperty("command_object_id", replaceJobOptions.commandObjectId());
    }
    if (replaceJobOptions.commandName() != null) {
      contentJson.addProperty("command_name", replaceJobOptions.commandName());
    }
    if (replaceJobOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", replaceJobOptions.commandParameter());
    }
    if (replaceJobOptions.commandOptions() != null) {
      contentJson.add("command_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.commandOptions()));
    }
    if (replaceJobOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.inputs()));
    }
    if (replaceJobOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.settings()));
    }
    if (replaceJobOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.tags()));
    }
    if (replaceJobOptions.location() != null) {
      contentJson.addProperty("location", replaceJobOptions.location());
    }
    if (replaceJobOptions.status() != null) {
      contentJson.add("status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.status()));
    }
    if (replaceJobOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.data()));
    }
    if (replaceJobOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.bastion()));
    }
    if (replaceJobOptions.logSummary() != null) {
      contentJson.add("log_summary", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceJobOptions.logSummary()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop the running Job, and delete the Job-record.
   *
   * Stop the running Job, and delete the Job-record.
   *
   * @param deleteJobOptions the {@link DeleteJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteJob(DeleteJobOptions deleteJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteJobOptions,
      "deleteJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", deleteJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("refresh_token", deleteJobOptions.refreshToken());
    if (deleteJobOptions.force() != null) {
      builder.header("force", deleteJobOptions.force());
    }
    if (deleteJobOptions.propagate() != null) {
      builder.header("propagate", deleteJobOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Job record.
   *
   * Get the Job record.
   *
   * @param getJobOptions the {@link GetJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> getJob(GetJobOptions getJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobOptions,
      "getJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobOptions.profile() != null) {
      builder.query("profile", String.valueOf(getJobOptions.profile()));
    }
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get log-file from the Job record.
   *
   * Get log-file from the Job record.
   *
   * @param listJobLogsOptions the {@link ListJobLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobLog}
   */
  public ServiceCall<JobLog> listJobLogs(ListJobLogsOptions listJobLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobLogsOptions,
      "listJobLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listJobLogsOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listJobLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<JobLog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobLog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all shared datasets.
   *
   * List all shared datasets.
   *
   * @param listSharedDatasetsOptions the {@link ListSharedDatasetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponseList}
   */
  public ServiceCall<SharedDatasetResponseList> listSharedDatasets(ListSharedDatasetsOptions listSharedDatasetsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/shared_datasets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listSharedDatasets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SharedDatasetResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SharedDatasetResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all shared datasets.
   *
   * List all shared datasets.
   *
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponseList}
   */
  public ServiceCall<SharedDatasetResponseList> listSharedDatasets() {
    return listSharedDatasets(null);
  }

  /**
   * Create a shared dataset definition.
   *
   * Create a shared dataset definition.
   *
   * @param createSharedDatasetOptions the {@link CreateSharedDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponse}
   */
  public ServiceCall<SharedDatasetResponse> createSharedDataset(CreateSharedDatasetOptions createSharedDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSharedDatasetOptions,
      "createSharedDatasetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/shared_datasets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createSharedDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createSharedDatasetOptions.autoPropagateChange() != null) {
      contentJson.addProperty("auto_propagate_change", createSharedDatasetOptions.autoPropagateChange());
    }
    if (createSharedDatasetOptions.description() != null) {
      contentJson.addProperty("description", createSharedDatasetOptions.description());
    }
    if (createSharedDatasetOptions.effectedWorkspaceIds() != null) {
      contentJson.add("effected_workspace_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSharedDatasetOptions.effectedWorkspaceIds()));
    }
    if (createSharedDatasetOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createSharedDatasetOptions.resourceGroup());
    }
    if (createSharedDatasetOptions.sharedDatasetData() != null) {
      contentJson.add("shared_dataset_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSharedDatasetOptions.sharedDatasetData()));
    }
    if (createSharedDatasetOptions.sharedDatasetName() != null) {
      contentJson.addProperty("shared_dataset_name", createSharedDatasetOptions.sharedDatasetName());
    }
    if (createSharedDatasetOptions.sharedDatasetSourceName() != null) {
      contentJson.addProperty("shared_dataset_source_name", createSharedDatasetOptions.sharedDatasetSourceName());
    }
    if (createSharedDatasetOptions.sharedDatasetType() != null) {
      contentJson.add("shared_dataset_type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSharedDatasetOptions.sharedDatasetType()));
    }
    if (createSharedDatasetOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSharedDatasetOptions.tags()));
    }
    if (createSharedDatasetOptions.version() != null) {
      contentJson.addProperty("version", createSharedDatasetOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SharedDatasetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SharedDatasetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a shared dataset definition.
   *
   * Create a shared dataset definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponse}
   */
  public ServiceCall<SharedDatasetResponse> createSharedDataset() {
    return createSharedDataset(null);
  }

  /**
   * Get the shared dataset.
   *
   * Get the shared dataset.
   *
   * @param getSharedDatasetOptions the {@link GetSharedDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponse}
   */
  public ServiceCall<SharedDatasetResponse> getSharedDataset(GetSharedDatasetOptions getSharedDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSharedDatasetOptions,
      "getSharedDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("sd_id", getSharedDatasetOptions.sdId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/shared_datasets/{sd_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getSharedDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SharedDatasetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SharedDatasetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the shared dataset.
   *
   * Replace the shared dataset.
   *
   * @param replaceSharedDatasetOptions the {@link ReplaceSharedDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponse}
   */
  public ServiceCall<SharedDatasetResponse> replaceSharedDataset(ReplaceSharedDatasetOptions replaceSharedDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSharedDatasetOptions,
      "replaceSharedDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("sd_id", replaceSharedDatasetOptions.sdId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/shared_datasets/{sd_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceSharedDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceSharedDatasetOptions.autoPropagateChange() != null) {
      contentJson.addProperty("auto_propagate_change", replaceSharedDatasetOptions.autoPropagateChange());
    }
    if (replaceSharedDatasetOptions.description() != null) {
      contentJson.addProperty("description", replaceSharedDatasetOptions.description());
    }
    if (replaceSharedDatasetOptions.effectedWorkspaceIds() != null) {
      contentJson.add("effected_workspace_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSharedDatasetOptions.effectedWorkspaceIds()));
    }
    if (replaceSharedDatasetOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", replaceSharedDatasetOptions.resourceGroup());
    }
    if (replaceSharedDatasetOptions.sharedDatasetData() != null) {
      contentJson.add("shared_dataset_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSharedDatasetOptions.sharedDatasetData()));
    }
    if (replaceSharedDatasetOptions.sharedDatasetName() != null) {
      contentJson.addProperty("shared_dataset_name", replaceSharedDatasetOptions.sharedDatasetName());
    }
    if (replaceSharedDatasetOptions.sharedDatasetSourceName() != null) {
      contentJson.addProperty("shared_dataset_source_name", replaceSharedDatasetOptions.sharedDatasetSourceName());
    }
    if (replaceSharedDatasetOptions.sharedDatasetType() != null) {
      contentJson.add("shared_dataset_type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSharedDatasetOptions.sharedDatasetType()));
    }
    if (replaceSharedDatasetOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSharedDatasetOptions.tags()));
    }
    if (replaceSharedDatasetOptions.version() != null) {
      contentJson.addProperty("version", replaceSharedDatasetOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SharedDatasetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SharedDatasetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the shared dataset.
   *
   * Replace the shared dataset.
   *
   * @param deleteSharedDatasetOptions the {@link DeleteSharedDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SharedDatasetResponse}
   */
  public ServiceCall<SharedDatasetResponse> deleteSharedDataset(DeleteSharedDatasetOptions deleteSharedDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSharedDatasetOptions,
      "deleteSharedDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("sd_id", deleteSharedDatasetOptions.sdId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/shared_datasets/{sd_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteSharedDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SharedDatasetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SharedDatasetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the KMS settings for customer account.
   *
   * Get the KMS settings for customer account.
   *
   * @param getKmsSettingsOptions the {@link GetKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> getKmsSettings(GetKmsSettingsOptions getKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getKmsSettingsOptions,
      "getKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("location", String.valueOf(getKmsSettingsOptions.location()));
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set the KMS settings for customer account.
   *
   * Set the KMS settings for customer account.
   *
   * @param replaceKmsSettingsOptions the {@link ReplaceKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> replaceKmsSettings(ReplaceKmsSettingsOptions replaceKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceKmsSettingsOptions,
      "replaceKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceKmsSettingsOptions.location() != null) {
      contentJson.addProperty("location", replaceKmsSettingsOptions.location());
    }
    if (replaceKmsSettingsOptions.encryptionScheme() != null) {
      contentJson.addProperty("encryption_scheme", replaceKmsSettingsOptions.encryptionScheme());
    }
    if (replaceKmsSettingsOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", replaceKmsSettingsOptions.resourceGroup());
    }
    if (replaceKmsSettingsOptions.primaryCrk() != null) {
      contentJson.add("primary_crk", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceKmsSettingsOptions.primaryCrk()));
    }
    if (replaceKmsSettingsOptions.secondaryCrk() != null) {
      contentJson.add("secondary_crk", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceKmsSettingsOptions.secondaryCrk()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set the KMS settings for customer account.
   *
   * Set the KMS settings for customer account.
   *
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> replaceKmsSettings() {
    return replaceKmsSettings(null);
  }

  /**
   * Discover the KMS instances in the account.
   *
   * Discover the KMS instances in the account.
   *
   * @param getDiscoveredKmsInstancesOptions the {@link GetDiscoveredKmsInstancesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSDiscovery}
   */
  public ServiceCall<KMSDiscovery> getDiscoveredKmsInstances(GetDiscoveredKmsInstancesOptions getDiscoveredKmsInstancesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDiscoveredKmsInstancesOptions,
      "getDiscoveredKmsInstancesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms_instances"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getDiscoveredKmsInstances");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("encryption_scheme", String.valueOf(getDiscoveredKmsInstancesOptions.encryptionScheme()));
    builder.query("location", String.valueOf(getDiscoveredKmsInstancesOptions.location()));
    if (getDiscoveredKmsInstancesOptions.resourceGroup() != null) {
      builder.query("resource_group", String.valueOf(getDiscoveredKmsInstancesOptions.resourceGroup()));
    }
    if (getDiscoveredKmsInstancesOptions.limit() != null) {
      builder.query("limit", String.valueOf(getDiscoveredKmsInstancesOptions.limit()));
    }
    if (getDiscoveredKmsInstancesOptions.sort() != null) {
      builder.query("sort", String.valueOf(getDiscoveredKmsInstancesOptions.sort()));
    }
    ResponseConverter<KMSDiscovery> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSDiscovery>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource inventory definition, used to target Actions or Controls.
   *
   * Create a resource inventory definition.
   *
   * @param createInventoryOptions the {@link CreateInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> createInventory(CreateInventoryOptions createInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInventoryOptions,
      "createInventoryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createInventoryOptions.name() != null) {
      contentJson.addProperty("name", createInventoryOptions.name());
    }
    if (createInventoryOptions.description() != null) {
      contentJson.addProperty("description", createInventoryOptions.description());
    }
    if (createInventoryOptions.location() != null) {
      contentJson.addProperty("location", createInventoryOptions.location());
    }
    if (createInventoryOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createInventoryOptions.resourceGroup());
    }
    if (createInventoryOptions.inventoriesIni() != null) {
      contentJson.addProperty("inventories_ini", createInventoryOptions.inventoriesIni());
    }
    if (createInventoryOptions.resourceQueries() != null) {
      contentJson.add("resource_queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInventoryOptions.resourceQueries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource inventory definition, used to target Actions or Controls.
   *
   * Create a resource inventory definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> createInventory() {
    return createInventory(null);
  }

  /**
   * Get all resource inventory definitions.
   *
   * Get all resource inventory definition.
   *
   * @param listInventoriesOptions the {@link ListInventoriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories(ListInventoriesOptions listInventoriesOptions) {
    if (listInventoriesOptions == null) {
      listInventoriesOptions = new ListInventoriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listInventories");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInventoriesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listInventoriesOptions.offset()));
    }
    if (listInventoriesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInventoriesOptions.limit()));
    }
    if (listInventoriesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listInventoriesOptions.sort()));
    }
    if (listInventoriesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listInventoriesOptions.profile()));
    }
    ResponseConverter<InventoryResourceRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all resource inventory definitions.
   *
   * Get all resource inventory definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories() {
    return listInventories(null);
  }

  /**
   * Replace the resource inventory definition, used to target Actions or Controls.
   *
   * Replace the resource inventory definition.
   *
   * @param replaceInventoryOptions the {@link ReplaceInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> replaceInventory(ReplaceInventoryOptions replaceInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceInventoryOptions,
      "replaceInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", replaceInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceInventoryOptions.name() != null) {
      contentJson.addProperty("name", replaceInventoryOptions.name());
    }
    if (replaceInventoryOptions.description() != null) {
      contentJson.addProperty("description", replaceInventoryOptions.description());
    }
    if (replaceInventoryOptions.location() != null) {
      contentJson.addProperty("location", replaceInventoryOptions.location());
    }
    if (replaceInventoryOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", replaceInventoryOptions.resourceGroup());
    }
    if (replaceInventoryOptions.inventoriesIni() != null) {
      contentJson.addProperty("inventories_ini", replaceInventoryOptions.inventoriesIni());
    }
    if (replaceInventoryOptions.resourceQueries() != null) {
      contentJson.add("resource_queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceInventoryOptions.resourceQueries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the resource inventory definition, used to target Actions or Controls.
   *
   * Update the resource inventory definition.
   *
   * @param updateInventoryOptions the {@link UpdateInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> updateInventory(UpdateInventoryOptions updateInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInventoryOptions,
      "updateInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", updateInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateInventoryOptions.name() != null) {
      contentJson.addProperty("name", updateInventoryOptions.name());
    }
    if (updateInventoryOptions.description() != null) {
      contentJson.addProperty("description", updateInventoryOptions.description());
    }
    if (updateInventoryOptions.location() != null) {
      contentJson.addProperty("location", updateInventoryOptions.location());
    }
    if (updateInventoryOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updateInventoryOptions.resourceGroup());
    }
    if (updateInventoryOptions.inventoriesIni() != null) {
      contentJson.addProperty("inventories_ini", updateInventoryOptions.inventoriesIni());
    }
    if (updateInventoryOptions.resourceQueries() != null) {
      contentJson.add("resource_queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInventoryOptions.resourceQueries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the resource inventory definition.
   *
   * Delete the resource inventory definition.
   *
   * @param deleteInventoryOptions the {@link DeleteInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInventory(DeleteInventoryOptions deleteInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInventoryOptions,
      "deleteInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", deleteInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteInventoryOptions.force() != null) {
      builder.header("force", deleteInventoryOptions.force());
    }
    if (deleteInventoryOptions.propagate() != null) {
      builder.header("propagate", deleteInventoryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the resource inventory definition, used to target Actions or Controls.
   *
   * Get the resource inventory definition.
   *
   * @param getInventoryOptions the {@link GetInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> getInventory(GetInventoryOptions getInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInventoryOptions,
      "getInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", getInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the resource inventory values.
   *
   * Get all the resource inventory values.
   *
   * @param listInventoryValuesOptions the {@link ListInventoryValuesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventoryValues(ListInventoryValuesOptions listInventoryValuesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInventoryValuesOptions,
      "listInventoryValuesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", listInventoryValuesOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}/variables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listInventoryValues");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<InventoryResourceRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the resource inventory value.
   *
   * Get the resource inventory value.
   *
   * @param getInventoryValueOptions the {@link GetInventoryValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> getInventoryValue(GetInventoryValueOptions getInventoryValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInventoryValueOptions,
      "getInventoryValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", getInventoryValueOptions.inventoryId());
    pathParamsMap.put("var_name", getInventoryValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}/variables/{var_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getInventoryValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource query definition.
   *
   * Create a resource query definition.
   *
   * @param createResourceQueryOptions the {@link CreateResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> createResourceQuery(CreateResourceQueryOptions createResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createResourceQueryOptions,
      "createResourceQueryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createResourceQueryOptions.type() != null) {
      contentJson.addProperty("type", createResourceQueryOptions.type());
    }
    if (createResourceQueryOptions.name() != null) {
      contentJson.addProperty("name", createResourceQueryOptions.name());
    }
    if (createResourceQueryOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createResourceQueryOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource query definition.
   *
   * Create a resource query definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> createResourceQuery() {
    return createResourceQuery(null);
  }

  /**
   * Get all resource query definitions.
   *
   * Get all resource query definition.
   *
   * @param listResourceQueryOptions the {@link ListResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery(ListResourceQueryOptions listResourceQueryOptions) {
    if (listResourceQueryOptions == null) {
      listResourceQueryOptions = new ListResourceQueryOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourceQueryOptions.offset() != null) {
      builder.query("offset", String.valueOf(listResourceQueryOptions.offset()));
    }
    if (listResourceQueryOptions.limit() != null) {
      builder.query("limit", String.valueOf(listResourceQueryOptions.limit()));
    }
    if (listResourceQueryOptions.sort() != null) {
      builder.query("sort", String.valueOf(listResourceQueryOptions.sort()));
    }
    if (listResourceQueryOptions.profile() != null) {
      builder.query("profile", String.valueOf(listResourceQueryOptions.profile()));
    }
    ResponseConverter<ResourceQueryRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all resource query definitions.
   *
   * Get all resource query definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery() {
    return listResourceQuery(null);
  }

  /**
   * Run the resource query.
   *
   * Execute a resource query definition.
   *
   * @param executeResourceQueryOptions the {@link ExecuteResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryResponseRecord}
   */
  public ServiceCall<ResourceQueryResponseRecord> executeResourceQuery(ExecuteResourceQueryOptions executeResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(executeResourceQueryOptions,
      "executeResourceQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", executeResourceQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "executeResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryResponseRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryResponseRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the resources query definition.
   *
   * Replace the resources query definition.
   *
   * @param replaceResourcesQueryOptions the {@link ReplaceResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> replaceResourcesQuery(ReplaceResourcesQueryOptions replaceResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceResourcesQueryOptions,
      "replaceResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", replaceResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceResourcesQueryOptions.type() != null) {
      contentJson.addProperty("type", replaceResourcesQueryOptions.type());
    }
    if (replaceResourcesQueryOptions.name() != null) {
      contentJson.addProperty("name", replaceResourcesQueryOptions.name());
    }
    if (replaceResourcesQueryOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceResourcesQueryOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the resources query definition.
   *
   * Delete the resources query definition.
   *
   * @param deleteResourcesQueryOptions the {@link DeleteResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteResourcesQuery(DeleteResourcesQueryOptions deleteResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteResourcesQueryOptions,
      "deleteResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", deleteResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteResourcesQueryOptions.force() != null) {
      builder.header("force", deleteResourcesQueryOptions.force());
    }
    if (deleteResourcesQueryOptions.propagate() != null) {
      builder.header("propagate", deleteResourcesQueryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the resources query definition.
   *
   * Get the resources query definition.
   *
   * @param getResourcesQueryOptions the {@link GetResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> getResourcesQuery(GetResourcesQueryOptions getResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourcesQueryOptions,
      "getResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", getResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
