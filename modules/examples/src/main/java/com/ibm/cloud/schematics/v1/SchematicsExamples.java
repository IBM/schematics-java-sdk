/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.schematics.v1;

import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.AgentData;
import com.ibm.cloud.schematics.v1.model.AgentDataList;
import com.ibm.cloud.schematics.v1.model.AgentDeployJob;
import com.ibm.cloud.schematics.v1.model.AgentHealthJob;
import com.ibm.cloud.schematics.v1.model.AgentInfrastructure;
import com.ibm.cloud.schematics.v1.model.AgentPRSJob;
import com.ibm.cloud.schematics.v1.model.AgentUserState;
import com.ibm.cloud.schematics.v1.model.AgentVersions;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.CreateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.DeleteAgentResources202Response;
import com.ibm.cloud.schematics.v1.model.DeleteAgentResourcesOptions;
import com.ibm.cloud.schematics.v1.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeletePolicyOptions;
import com.ibm.cloud.schematics.v1.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeployAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentVersionsOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryOptions;
import com.ibm.cloud.schematics.v1.model.GetJobFilesOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetPolicyOptions;
import com.ibm.cloud.schematics.v1.model.GetResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceDeletionJobStatusOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataV2Options;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceLogUrlsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsV2Options;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceReadmeOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesV2Options;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceStateOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceTemplateStateOptions;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.Group;
import com.ibm.cloud.schematics.v1.model.HealthCheckAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.Host;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics.v1.model.InventoryView;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobFileData;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoriesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListKmsOptions;
import com.ibm.cloud.schematics.v1.model.ListLocationsOptions;
import com.ibm.cloud.schematics.v1.model.ListPolicyOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.OutputValuesInner;
import com.ibm.cloud.schematics.v1.model.OutputValuesObject;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.Policy;
import com.ibm.cloud.schematics.v1.model.PolicyList;
import com.ibm.cloud.schematics.v1.model.ProcessTemplateMetaDataOptions;
import com.ibm.cloud.schematics.v1.model.PrsAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceInventoryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.ResourceQuery;
import com.ibm.cloud.schematics.v1.model.ResourceQueryParam;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecord;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocationsList;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUploadOptions;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateResourcesObject;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.TemplateValuesMetaData;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.UpdateJobOptions;
import com.ibm.cloud.schematics.v1.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.UpdatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
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
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusUpdateRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the schematics service.
 *
 * The following configuration properties are assumed to be defined:
 * SCHEMATICS_URL=&lt;service base url&gt;
 * SCHEMATICS_AUTH_TYPE=iam
 * SCHEMATICS_APIKEY=&lt;IAM apikey&gt;
 * SCHEMATICS_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class SchematicsExamples {
  private static final Logger logger = LoggerFactory.getLogger(SchematicsExamples.class);
  protected SchematicsExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../schematics_v1.env");
  }

  /**
   * The main() function invokes operations of the schematics service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Schematics schematicsService = Schematics.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(Schematics.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("listLocations() result:");
      // begin-list_locations
      ListLocationsOptions listLocationsOptions = new ListLocationsOptions();

      Response<SchematicsLocationsList> response = schematicsService.listLocations(listLocationsOptions).execute();
      SchematicsLocationsList schematicsLocationsList = response.getResult();

      System.out.println(schematicsLocationsList);
      // end-list_locations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listResourceGroup() result:");
      // begin-list_resource_group
      ListResourceGroupOptions listResourceGroupOptions = new ListResourceGroupOptions();

      Response<List<ResourceGroupResponse>> response = schematicsService.listResourceGroup(listResourceGroupOptions).execute();
      List<ResourceGroupResponse> listResourceGroupResponse = response.getResult();

      System.out.println(listResourceGroupResponse);
      // end-list_resource_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSchematicsVersion() result:");
      // begin-get_schematics_version
      GetSchematicsVersionOptions getSchematicsVersionOptions = new GetSchematicsVersionOptions();

      Response<VersionResponse> response = schematicsService.getSchematicsVersion(getSchematicsVersionOptions).execute();
      VersionResponse versionResponse = response.getResult();

      System.out.println(versionResponse);
      // end-get_schematics_version
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("processTemplateMetaData() result:");
      // begin-ProcessTemplateMetaData
      GitSource gitSourceModel = new GitSource.Builder()
        .computedGitRepoUrl("https://github.com/IBM-Cloud/terraform-provider-ibm/tree/master/examples/ibm-vsi")
        .gitRepoUrl("https://github.com/IBM-Cloud/terraform-provider-ibm")
        .gitRepoFolder("examples/ibm-vsi")
        .gitRelease("v1.0.0")
        .gitBranch("master")
        .build();
      ExternalSource externalSourceModel = new ExternalSource.Builder()
        .sourceType("git_hub")
        .git(gitSourceModel)
        .build();
      ProcessTemplateMetaDataOptions processTemplateMetaDataOptions = new ProcessTemplateMetaDataOptions.Builder()
        .templateType("terraform_v1_0")
        .source(externalSourceModel)
        .build();

      Response<TemplateMetaDataResponse> response = schematicsService.processTemplateMetaData(processTemplateMetaDataOptions).execute();
      TemplateMetaDataResponse templateMetaDataResponse = response.getResult();

      System.out.println(templateMetaDataResponse);
      // end-ProcessTemplateMetaData
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listWorkspaces() result:");
      // begin-list_workspaces
      ListWorkspacesOptions listWorkspacesOptions = new ListWorkspacesOptions.Builder()
        .build();

      Response<WorkspaceResponseList> response = schematicsService.listWorkspaces(listWorkspacesOptions).execute();
      WorkspaceResponseList workspaceResponseList = response.getResult();

      System.out.println(workspaceResponseList);
      // end-list_workspaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createWorkspace() result:");
      // begin-create_workspace
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
        .name("region")
        .type("string")
        .value("us-south")
        .build();
      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
        .type("terraform_v1.9")
        .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
        .build();
      TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
        .url("https://github.com/ptaube/tf_cloudless_sleepy")
        .build();
      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
        .description("Workspace to provision infrastructure")
        .location("us-east")
        .name("my-terraform-workspace")
        .resourceGroup("Default")
        .tags(java.util.Arrays.asList("env:dev", "project:demo"))
        .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
        .templateRepo(templateRepoRequestModel)
        .type(java.util.Arrays.asList("terraform_v1.9"))
        .build();

      Response<WorkspaceResponse> response = schematicsService.createWorkspace(createWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-create_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspace() result:");
      // begin-get_workspace
      GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceResponse> response = schematicsService.getWorkspace(getWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-get_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateWorkspace() result:");
      // begin-update_workspace
      WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
        .frozen(false)
        .build();
      UpdateWorkspaceOptions updateWorkspaceOptions = new UpdateWorkspaceOptions.Builder()
        .wId("testString")
        .description("Updated workspace description")
        .name("my-workspace-updated")
        .tags(java.util.Arrays.asList("env:production", "team:devops"))
        .workspaceStatus(workspaceStatusUpdateRequestModel)
        .build();

      Response<WorkspaceResponse> response = schematicsService.updateWorkspace(updateWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-update_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceWorkspace() result:");
      // begin-replace_workspace
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
        .description("Description of sample_var")
        .name("sample_var")
        .secure(false)
        .value("THIS IS IBM CLOUD TERRAFORM CLI DEMO")
        .build();
      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
        .folder(".")
        .type("terraform_v1.0")
        .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
        .build();
      TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
        .url("https://github.com/ptaube/tf_cloudless_sleepy")
        .build();
      WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
        .frozen(true)
        .build();
      ReplaceWorkspaceOptions replaceWorkspaceOptions = new ReplaceWorkspaceOptions.Builder()
        .wId("testString")
        .description("terraform workspace updated")
        .name("testWorkspaceApi")
        .tags(java.util.Arrays.asList("department:HR", "application:compensation", "environment:staging"))
        .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
        .templateRepo(templateRepoUpdateRequestModel)
        .type(java.util.Arrays.asList("terraform_v1.0"))
        .workspaceStatus(workspaceStatusUpdateRequestModel)
        .build();

      Response<WorkspaceResponse> response = schematicsService.replaceWorkspace(replaceWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-replace_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceReadme() result:");
      // begin-get_workspace_readme
      GetWorkspaceReadmeOptions getWorkspaceReadmeOptions = new GetWorkspaceReadmeOptions.Builder()
        .wId("testString")
        .build();

      Response<TemplateReadme> response = schematicsService.getWorkspaceReadme(getWorkspaceReadmeOptions).execute();
      TemplateReadme templateReadme = response.getResult();

      System.out.println(templateReadme);
      // end-get_workspace_readme
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("templateRepoUpload() result:");
      // begin-template_repo_upload
      TemplateRepoUploadOptions templateRepoUploadOptions = new TemplateRepoUploadOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateRepoTarUploadResponse> response = schematicsService.templateRepoUpload(templateRepoUploadOptions).execute();
      TemplateRepoTarUploadResponse templateRepoTarUploadResponse = response.getResult();

      System.out.println(templateRepoTarUploadResponse);
      // end-template_repo_upload
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceInputs() result:");
      // begin-get_workspace_inputs
      GetWorkspaceInputsOptions getWorkspaceInputsOptions = new GetWorkspaceInputsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateValues> response = schematicsService.getWorkspaceInputs(getWorkspaceInputsOptions).execute();
      TemplateValues templateValues = response.getResult();

      System.out.println(templateValues);
      // end-get_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceWorkspaceInputs() result:");
      // begin-replace_workspace_inputs
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
        .description("IBM Cloud region")
        .name("region")
        .secure(false)
        .type("string")
        .value("us-south")
        .build();
      ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions = new ReplaceWorkspaceInputsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .values("string")
        .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
        .build();

      Response<UserValues> response = schematicsService.replaceWorkspaceInputs(replaceWorkspaceInputsOptions).execute();
      UserValues userValues = response.getResult();

      System.out.println(userValues);
      // end-replace_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllWorkspaceInputs() result:");
      // begin-get_all_workspace_inputs
      GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions = new GetAllWorkspaceInputsOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceTemplateValuesResponse> response = schematicsService.getAllWorkspaceInputs(getAllWorkspaceInputsOptions).execute();
      WorkspaceTemplateValuesResponse workspaceTemplateValuesResponse = response.getResult();

      System.out.println(workspaceTemplateValuesResponse);
      // end-get_all_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceInputMetadataV2() result:");
      // begin-get_workspace_input_metadata_v2
      GetWorkspaceInputMetadataV2Options getWorkspaceInputMetadataV2Options = new GetWorkspaceInputMetadataV2Options.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateValuesMetaData> response = schematicsService.getWorkspaceInputMetadataV2(getWorkspaceInputMetadataV2Options).execute();
      TemplateValuesMetaData templateValuesMetaData = response.getResult();

      System.out.println(templateValuesMetaData);
      // end-get_workspace_input_metadata_v2
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceInputMetadata() result:");
      // begin-get_workspace_input_metadata
      GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions = new GetWorkspaceInputMetadataOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<List<Map<String, Object>>> response = schematicsService.getWorkspaceInputMetadata(getWorkspaceInputMetadataOptions).execute();
      List<Map<String, Object>> templateMetadata = response.getResult();

      System.out.println(templateMetadata);
      // end-get_workspace_input_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceOutputsV2() result:");
      // begin-get_workspace_outputs_v2
      GetWorkspaceOutputsV2Options getWorkspaceOutputsV2Options = new GetWorkspaceOutputsV2Options.Builder()
        .wId("testString")
        .build();

      Response<OutputValuesObject> response = schematicsService.getWorkspaceOutputsV2(getWorkspaceOutputsV2Options).execute();
      OutputValuesObject outputValuesObject = response.getResult();

      System.out.println(outputValuesObject);
      // end-get_workspace_outputs_v2
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceOutputs() result:");
      // begin-get_workspace_outputs
      GetWorkspaceOutputsOptions getWorkspaceOutputsOptions = new GetWorkspaceOutputsOptions.Builder()
        .wId("testString")
        .build();

      Response<List<OutputValuesInner>> response = schematicsService.getWorkspaceOutputs(getWorkspaceOutputsOptions).execute();
      List<OutputValuesInner> listOutputValuesInner = response.getResult();

      System.out.println(listOutputValuesInner);
      // end-get_workspace_outputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceResourcesV2() result:");
      // begin-get_workspace_resources_v2
      GetWorkspaceResourcesV2Options getWorkspaceResourcesV2Options = new GetWorkspaceResourcesV2Options.Builder()
        .wId("testString")
        .build();

      Response<TemplateResourcesObject> response = schematicsService.getWorkspaceResourcesV2(getWorkspaceResourcesV2Options).execute();
      TemplateResourcesObject templateResourcesObject = response.getResult();

      System.out.println(templateResourcesObject);
      // end-get_workspace_resources_v2
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceResources() result:");
      // begin-get_workspace_resources
      GetWorkspaceResourcesOptions getWorkspaceResourcesOptions = new GetWorkspaceResourcesOptions.Builder()
        .wId("testString")
        .build();

      Response<List<TemplateResources>> response = schematicsService.getWorkspaceResources(getWorkspaceResourcesOptions).execute();
      List<TemplateResources> listTemplateResources = response.getResult();

      System.out.println(listTemplateResources);
      // end-get_workspace_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceState() result:");
      // begin-get_workspace_state
      GetWorkspaceStateOptions getWorkspaceStateOptions = new GetWorkspaceStateOptions.Builder()
        .wId("testString")
        .build();

      Response<StateStoreResponseList> response = schematicsService.getWorkspaceState(getWorkspaceStateOptions).execute();
      StateStoreResponseList stateStoreResponseList = response.getResult();

      System.out.println(stateStoreResponseList);
      // end-get_workspace_state
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceTemplateState() result:");
      // begin-get_workspace_template_state
      GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions = new GetWorkspaceTemplateStateOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateStateStore> response = schematicsService.getWorkspaceTemplateState(getWorkspaceTemplateStateOptions).execute();
      TemplateStateStore templateStateStore = response.getResult();

      System.out.println(templateStateStore);
      // end-get_workspace_template_state
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceActivityLogs() result:");
      // begin-get_workspace_activity_logs
      GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions = new GetWorkspaceActivityLogsOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivityLogs> response = schematicsService.getWorkspaceActivityLogs(getWorkspaceActivityLogsOptions).execute();
      WorkspaceActivityLogs workspaceActivityLogs = response.getResult();

      System.out.println(workspaceActivityLogs);
      // end-get_workspace_activity_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceLogUrls() result:");
      // begin-get_workspace_log_urls
      GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions = new GetWorkspaceLogUrlsOptions.Builder()
        .wId("testString")
        .build();

      Response<LogStoreResponseList> response = schematicsService.getWorkspaceLogUrls(getWorkspaceLogUrlsOptions).execute();
      LogStoreResponseList logStoreResponseList = response.getResult();

      System.out.println(logStoreResponseList);
      // end-get_workspace_log_urls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTemplateLogs() result:");
      // begin-get_template_logs
      GetTemplateLogsOptions getTemplateLogsOptions = new GetTemplateLogsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<String> response = schematicsService.getTemplateLogs(getTemplateLogsOptions).execute();
      String templateLogStoreString = response.getResult();

      System.out.println(templateLogStoreString);
      // end-get_template_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTemplateActivityLog() result:");
      // begin-get_template_activity_log
      GetTemplateActivityLogOptions getTemplateActivityLogOptions = new GetTemplateActivityLogOptions.Builder()
        .wId("testString")
        .tId("testString")
        .activityId("testString")
        .build();

      Response<String> response = schematicsService.getTemplateActivityLog(getTemplateActivityLogOptions).execute();
      String workspaceActivityTemplateLogString = response.getResult();

      System.out.println(workspaceActivityTemplateLogString);
      // end-get_template_activity_log
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listActions() result:");
      // begin-list_actions
      ListActionsOptions listActionsOptions = new ListActionsOptions.Builder()
        .build();

      Response<ActionList> response = schematicsService.listActions(listActionsOptions).execute();
      ActionList actionList = response.getResult();

      System.out.println(actionList);
      // end-list_actions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createAction() result:");
      // begin-create_action
      GitSource gitSourceModel = new GitSource.Builder()
        .gitRepoUrl("https://github.com/Cloud-Schematics/ansible-is-instance-actions")
        .build();
      ExternalSource externalSourceModel = new ExternalSource.Builder()
        .sourceType("git")
        .git(gitSourceModel)
        .build();
      CreateActionOptions createActionOptions = new CreateActionOptions.Builder()
        .name("Example-12ab1334")
        .description("action_description")
        .location("us-south")
        .resourceGroup("test")
        .tags(java.util.Arrays.asList("department:HR", "application:compensation", "environment:staging", "env:dev", "k8s"))
        .source(externalSourceModel)
        .build();

      Response<Action> response = schematicsService.createAction(createActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
      // end-create_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAction() result:");
      // begin-get_action
      GetActionOptions getActionOptions = new GetActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<Action> response = schematicsService.getAction(getActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
      // end-get_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateAction() result:");
      // begin-update_action
      GitSource gitSourceModel = new GitSource.Builder()
        .gitRepoUrl("https://github.com/Cloud-Schematics/ansible-lamp-stack")
        .gitBranch("v2.0")
        .build();
      ExternalSource externalSourceModel = new ExternalSource.Builder()
        .sourceType("git_hub")
        .git(gitSourceModel)
        .build();
      VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
        .type("string")
        .secure(true)
        .build();
      VariableData variableDataModel = new VariableData.Builder()
        .name("db_password")
        .value("NewSecurePassword456")
        .metadata(variableMetadataModel)
        .build();
      UpdateActionOptions updateActionOptions = new UpdateActionOptions.Builder()
        .actionId("testString")
        .name("Deploy LAMP Stack - Updated")
        .description("Updated action to deploy LAMP stack with new configuration")
        .tags(java.util.Arrays.asList("env:production", "app:lamp", "version:2.0"))
        .source(externalSourceModel)
        .commandParameter("site-v2.yml")
        .inputs(java.util.Arrays.asList(variableDataModel))
        .build();

      Response<Action> response = schematicsService.updateAction(updateActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
      // end-update_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("uploadTemplateTarAction() result:");
      // begin-upload_template_tar_action
      UploadTemplateTarActionOptions uploadTemplateTarActionOptions = new UploadTemplateTarActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<TemplateRepoTarUploadResponse> response = schematicsService.uploadTemplateTarAction(uploadTemplateTarActionOptions).execute();
      TemplateRepoTarUploadResponse templateRepoTarUploadResponse = response.getResult();

      System.out.println(templateRepoTarUploadResponse);
      // end-upload_template_tar_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listWorkspaceActivities() result:");
      // begin-list_workspace_activities
      ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions = new ListWorkspaceActivitiesOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceActivities> response = schematicsService.listWorkspaceActivities(listWorkspaceActivitiesOptions).execute();
      WorkspaceActivities workspaceActivities = response.getResult();

      System.out.println(workspaceActivities);
      // end-list_workspace_activities
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceActivity() result:");
      // begin-get_workspace_activity
      GetWorkspaceActivityOptions getWorkspaceActivityOptions = new GetWorkspaceActivityOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivity> response = schematicsService.getWorkspaceActivity(getWorkspaceActivityOptions).execute();
      WorkspaceActivity workspaceActivity = response.getResult();

      System.out.println(workspaceActivity);
      // end-get_workspace_activity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("runWorkspaceCommands() result:");
      // begin-run_workspace_commands
      RunWorkspaceCommandsOptions runWorkspaceCommandsOptions = new RunWorkspaceCommandsOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityCommandResult> response = schematicsService.runWorkspaceCommands(runWorkspaceCommandsOptions).execute();
      WorkspaceActivityCommandResult workspaceActivityCommandResult = response.getResult();

      System.out.println(workspaceActivityCommandResult);
      // end-run_workspace_commands
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("applyWorkspaceCommand() result:");
      // begin-apply_workspace_command
      ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions = new ApplyWorkspaceCommandOptions.Builder()
        .refreshToken("testString")
        .wId("testString")
        .build();

      Response<WorkspaceActivityApplyResult> response = schematicsService.applyWorkspaceCommand(applyWorkspaceCommandOptions).execute();
      WorkspaceActivityApplyResult workspaceActivityApplyResult = response.getResult();

      System.out.println(workspaceActivityApplyResult);
      // end-apply_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("destroyWorkspaceCommand() result:");
      // begin-destroy_workspace_command
      DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions = new DestroyWorkspaceCommandOptions.Builder()
        .refreshToken("testString")
        .wId("testString")
        .build();

      Response<WorkspaceActivityDestroyResult> response = schematicsService.destroyWorkspaceCommand(destroyWorkspaceCommandOptions).execute();
      WorkspaceActivityDestroyResult workspaceActivityDestroyResult = response.getResult();

      System.out.println(workspaceActivityDestroyResult);
      // end-destroy_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("planWorkspaceCommand() result:");
      // begin-plan_workspace_command
      PlanWorkspaceCommandOptions planWorkspaceCommandOptions = new PlanWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityPlanResult> response = schematicsService.planWorkspaceCommand(planWorkspaceCommandOptions).execute();
      WorkspaceActivityPlanResult workspaceActivityPlanResult = response.getResult();

      System.out.println(workspaceActivityPlanResult);
      // end-plan_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("refreshWorkspaceCommand() result:");
      // begin-refresh_workspace_command
      RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions = new RefreshWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityRefreshResult> response = schematicsService.refreshWorkspaceCommand(refreshWorkspaceCommandOptions).execute();
      WorkspaceActivityRefreshResult workspaceActivityRefreshResult = response.getResult();

      System.out.println(workspaceActivityRefreshResult);
      // end-refresh_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listJobs() result:");
      // begin-list_jobs
      ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
        .build();

      Response<JobList> response = schematicsService.listJobs(listJobsOptions).execute();
      JobList jobList = response.getResult();

      System.out.println(jobList);
      // end-list_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createJob() result:");
      // begin-create_job
      CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
        .refreshToken("testString")
        .commandObject("action")
        .commandObjectId("us-east.ACTION.Example-12a1b212.3287dc42")
        .commandName("ansible_playbook_run")
        .commandParameter("site.yml")
        .build();

      Response<Job> response = schematicsService.createJob(createJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-create_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getJob() result:");
      // begin-get_job
      GetJobOptions getJobOptions = new GetJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<Job> response = schematicsService.getJob(getJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-get_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateJob() result:");
      // begin-update_job
      UpdateJobOptions updateJobOptions = new UpdateJobOptions.Builder()
        .jobId("testString")
        .refreshToken("testString")
        .commandObject("action")
        .commandObjectId("us-east.ACTION.Example-12a1b212.3287dc42")
        .commandName("ansible_playbook_run")
        .commandParameter("site.yml")
        .build();

      Response<Job> response = schematicsService.updateJob(updateJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-update_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listJobLogs() result:");
      // begin-list_job_logs
      ListJobLogsOptions listJobLogsOptions = new ListJobLogsOptions.Builder()
        .jobId("testString")
        .build();

      Response<JobLog> response = schematicsService.listJobLogs(listJobLogsOptions).execute();
      JobLog jobLog = response.getResult();

      System.out.println(jobLog);
      // end-list_job_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getJobFiles() result:");
      // begin-get_job_files
      GetJobFilesOptions getJobFilesOptions = new GetJobFilesOptions.Builder()
        .jobId("testString")
        .fileType("template_repo")
        .build();

      Response<JobFileData> response = schematicsService.getJobFiles(getJobFilesOptions).execute();
      JobFileData jobFileData = response.getResult();

      System.out.println(jobFileData);
      // end-get_job_files
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createWorkspaceDeletionJob() result:");
      // begin-create_workspace_deletion_job
      CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions = new CreateWorkspaceDeletionJobOptions.Builder()
        .refreshToken("testString")
        .job("delete")
        .workspaces(java.util.Arrays.asList("us-south.workspace.testWorkspace.a6010c37", "us-south.workspace.teraformNewupdatedone.72011986", "us-south.workspace.readterraform.400b427c", "us-south.workspace.myworkspacesink.49745827", "us-south.workspace.ReadTerraformTemp.c98c9774", "us-south.workspace.SampleTest1.2a51c3a1"))
        .build();

      Response<WorkspaceBulkDeleteResponse> response = schematicsService.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptions).execute();
      WorkspaceBulkDeleteResponse workspaceBulkDeleteResponse = response.getResult();

      System.out.println(workspaceBulkDeleteResponse);
      // end-create_workspace_deletion_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkspaceDeletionJobStatus() result:");
      // begin-get_workspace_deletion_job_status
      GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions = new GetWorkspaceDeletionJobStatusOptions.Builder()
        .wjId("testString")
        .build();

      Response<WorkspaceJobResponse> response = schematicsService.getWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptions).execute();
      WorkspaceJobResponse workspaceJobResponse = response.getResult();

      System.out.println(workspaceJobResponse);
      // end-get_workspace_deletion_job_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInventories() result:");
      // begin-list_inventories
      ListInventoriesOptions listInventoriesOptions = new ListInventoriesOptions.Builder()
        .build();

      Response<InventoryResourceRecordList> response = schematicsService.listInventories(listInventoriesOptions).execute();
      InventoryResourceRecordList inventoryResourceRecordList = response.getResult();

      System.out.println(inventoryResourceRecordList);
      // end-list_inventories
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInventory() result:");
      // begin-create_inventory
      CreateInventoryOptions createInventoryOptions = new CreateInventoryOptions.Builder()
        .name("dev-inventoryapidocexample")
        .description("My cloud linux inventory")
        .location("us-east")
        .resourceGroup("Default")
        .inventoriesIni("[windows]\n158.177.7.181")
        .build();

      Response<InventoryResourceRecord> response = schematicsService.createInventory(createInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-create_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInventory() result:");
      // begin-get_inventory
      GetInventoryOptions getInventoryOptions = new GetInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<InventoryResourceRecord> response = schematicsService.getInventory(getInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-get_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceInventory() result:");
      // begin-replace_inventory
      CredentialVariableMetadata credentialVariableMetadataModel = new CredentialVariableMetadata.Builder()
        .build();
      CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
        .metadata(credentialVariableMetadataModel)
        .build();
      Host hostModel = new Host.Builder()
        .name("158.177.7.182")
        .credential(credentialVariableDataModel)
        .build();
      Group groupModel = new Group.Builder()
        .name("windows")
        .credentials(credentialVariableDataModel)
        .hosts(java.util.Arrays.asList(hostModel))
        .build();
      InventoryView inventoryViewModel = new InventoryView.Builder()
        .groups(java.util.Arrays.asList(groupModel))
        .build();
      ReplaceInventoryOptions replaceInventoryOptions = new ReplaceInventoryOptions.Builder()
        .inventoryId("testString")
        .name("dev-inventoryapidocexample")
        .description("My cloud linux inventory")
        .location("us-east")
        .resourceGroup("Default")
        .connectionType("ssh")
        .inventoriesIni("[windows]\n158.177.7.182")
        .inventoryView(inventoryViewModel)
        .build();

      Response<InventoryResourceRecord> response = schematicsService.replaceInventory(replaceInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-replace_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listResourceQuery() result:");
      // begin-list_resource_query
      ListResourceQueryOptions listResourceQueryOptions = new ListResourceQueryOptions.Builder()
        .build();

      Response<ResourceQueryRecordList> response = schematicsService.listResourceQuery(listResourceQueryOptions).execute();
      ResourceQueryRecordList resourceQueryRecordList = response.getResult();

      System.out.println(resourceQueryRecordList);
      // end-list_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createResourceQuery() result:");
      // begin-create_resource_query
      ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
        .name("workspace-id")
        .value("us-east.ACTION.kubectlWorkshop.1010101")
        .description("string")
        .build();
      ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
        .queryType("workspaces")
        .queryCondition(java.util.Arrays.asList(resourceQueryParamModel))
        .build();
      CreateResourceQueryOptions createResourceQueryOptions = new CreateResourceQueryOptions.Builder()
        .type("workspace_resource")
        .name("hello")
        .queries(java.util.Arrays.asList(resourceQueryModel))
        .build();

      Response<ResourceQueryRecord> response = schematicsService.createResourceQuery(createResourceQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-create_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getResourcesQuery() result:");
      // begin-get_resources_query
      GetResourcesQueryOptions getResourcesQueryOptions = new GetResourcesQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<ResourceQueryRecord> response = schematicsService.getResourcesQuery(getResourcesQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-get_resources_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("executeResourceQuery() result:");
      // begin-execute_resource_query
      ExecuteResourceQueryOptions executeResourceQueryOptions = new ExecuteResourceQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<ResourceQueryResponseRecord> response = schematicsService.executeResourceQuery(executeResourceQueryOptions).execute();
      ResourceQueryResponseRecord resourceQueryResponseRecord = response.getResult();

      System.out.println(resourceQueryResponseRecord);
      // end-execute_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceResourcesQuery() result:");
      // begin-replace_resources_query
      ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
        .name("workspace-id")
        .value("us-east.ACTION.kubectlWorkshop.1010101")
        .description("string")
        .build();
      ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
        .queryType("workspaces")
        .queryCondition(java.util.Arrays.asList(resourceQueryParamModel))
        .build();
      ReplaceResourcesQueryOptions replaceResourcesQueryOptions = new ReplaceResourcesQueryOptions.Builder()
        .queryId("testString")
        .type("workspace_resource")
        .name("hello my world")
        .queries(java.util.Arrays.asList(resourceQueryModel))
        .build();

      Response<ResourceQueryRecord> response = schematicsService.replaceResourcesQuery(replaceResourcesQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-replace_resources_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listAgentData() result:");
      // begin-list_agent_data
      ListAgentDataOptions listAgentDataOptions = new ListAgentDataOptions.Builder()
        .build();

      Response<AgentDataList> response = schematicsService.listAgentData(listAgentDataOptions).execute();
      AgentDataList agentDataList = response.getResult();

      System.out.println(agentDataList);
      // end-list_agent_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createAgentData() result:");
      // begin-create_agent_data
      AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
        .infraType("ibm_kubernetes")
        .clusterId("cluster_id")
        .clusterResourceGroup("Default")
        .cosInstanceName("blueprint_basic")
        .cosBucketName("sample_bucket_name")
        .cosBucketRegion("us-east")
        .build();
      VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
        .secure(true)
        .build();
      VariableData variableDataModel = new VariableData.Builder()
        .name("ibmcloud_api_key")
        .value("<api_key of the account where cluster and cos are present>")
        .metadata(variableMetadataModel)
        .build();
      AgentUserState agentUserStateModel = new AgentUserState.Builder()
        .state("enable")
        .build();
      CreateAgentDataOptions createAgentDataOptions = new CreateAgentDataOptions.Builder()
        .name("AgentName")
        .resourceGroup("Default")
        .version("v1.0.0")
        .schematicsLocation("us-south")
        .agentLocation("us-south")
        .agentInfrastructure(agentInfrastructureModel)
        .description("Create Agent")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .agentInputs(java.util.Arrays.asList(variableDataModel))
        .userState(agentUserStateModel)
        .build();

      Response<AgentData> response = schematicsService.createAgentData(createAgentDataOptions).execute();
      AgentData agentData = response.getResult();

      System.out.println(agentData);
      // end-create_agent_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAgentData() result:");
      // begin-get_agent_data
      GetAgentDataOptions getAgentDataOptions = new GetAgentDataOptions.Builder()
        .agentId("testString")
        .build();

      Response<AgentData> response = schematicsService.getAgentData(getAgentDataOptions).execute();
      AgentData agentData = response.getResult();

      System.out.println(agentData);
      // end-get_agent_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateAgentData() result:");
      // begin-update_agent_data
      AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
        .infraType("ibm_kubernetes")
        .clusterId("cluster_id")
        .clusterResourceGroup("Default")
        .cosInstanceName("blueprint_basic")
        .cosBucketName("sample_bucket_name")
        .cosBucketRegion("us-east")
        .build();
      VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
        .secure(true)
        .build();
      VariableData variableDataModel = new VariableData.Builder()
        .name("ibmcloud_api_key")
        .value("<api_key of the account where cluster and cos are present>")
        .metadata(variableMetadataModel)
        .build();
      AgentUserState agentUserStateModel = new AgentUserState.Builder()
        .state("enable")
        .build();
      UpdateAgentDataOptions updateAgentDataOptions = new UpdateAgentDataOptions.Builder()
        .agentId("testString")
        .name("AgentName")
        .resourceGroup("Default")
        .version("v1.0.0")
        .schematicsLocation("us-south")
        .agentLocation("us-south")
        .agentInfrastructure(agentInfrastructureModel)
        .description("New Description")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .agentInputs(java.util.Arrays.asList(variableDataModel))
        .userState(agentUserStateModel)
        .build();

      Response<AgentData> response = schematicsService.updateAgentData(updateAgentDataOptions).execute();
      AgentData agentData = response.getResult();

      System.out.println(agentData);
      // end-update_agent_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAgentVersions() result:");
      // begin-get_agent_versions
      GetAgentVersionsOptions getAgentVersionsOptions = new GetAgentVersionsOptions();

      Response<AgentVersions> response = schematicsService.getAgentVersions(getAgentVersionsOptions).execute();
      AgentVersions agentVersions = response.getResult();

      System.out.println(agentVersions);
      // end-get_agent_versions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("prsAgentJob() result:");
      // begin-prs_agent_job
      PrsAgentJobOptions prsAgentJobOptions = new PrsAgentJobOptions.Builder()
        .agentId("testString")
        .build();

      Response<AgentPRSJob> response = schematicsService.prsAgentJob(prsAgentJobOptions).execute();
      AgentPRSJob agentPrsJob = response.getResult();

      System.out.println(agentPrsJob);
      // end-prs_agent_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("healthCheckAgentJob() result:");
      // begin-health_check_agent_job
      HealthCheckAgentJobOptions healthCheckAgentJobOptions = new HealthCheckAgentJobOptions.Builder()
        .agentId("testString")
        .build();

      Response<AgentHealthJob> response = schematicsService.healthCheckAgentJob(healthCheckAgentJobOptions).execute();
      AgentHealthJob agentHealthJob = response.getResult();

      System.out.println(agentHealthJob);
      // end-health_check_agent_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deployAgentJob() result:");
      // begin-deploy_agent_job
      DeployAgentJobOptions deployAgentJobOptions = new DeployAgentJobOptions.Builder()
        .agentId("testString")
        .build();

      Response<AgentDeployJob> response = schematicsService.deployAgentJob(deployAgentJobOptions).execute();
      AgentDeployJob agentDeployJob = response.getResult();

      System.out.println(agentDeployJob);
      // end-deploy_agent_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getKmsSettings() result:");
      // begin-get_kms_settings
      GetKmsSettingsOptions getKmsSettingsOptions = new GetKmsSettingsOptions.Builder()
        .location("testString")
        .build();

      Response<KMSSettings> response = schematicsService.getKmsSettings(getKmsSettingsOptions).execute();
      KMSSettings kmsSettings = response.getResult();

      System.out.println(kmsSettings);
      // end-get_kms_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateKmsSettings() result:");
      // begin-update_kms_settings
      KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
        .kmsName("Key Protect-xxx")
        .kmsPrivateEndpoint("https://private.us-south.kms.cloud.ibm.com")
        .keyCrn("crn:v1:public:kms:us-south:a/010101010:key:3a14ceaf-c679-455d-10101010")
        .build();
      UpdateKmsSettingsOptions updateKmsSettingsOptions = new UpdateKmsSettingsOptions.Builder()
        .location("US")
        .encryptionScheme("byok")
        .resourceGroup("Default")
        .primaryCrk(kmsSettingsPrimaryCrkModel)
        .build();

      Response<KMSSettings> response = schematicsService.updateKmsSettings(updateKmsSettingsOptions).execute();
      KMSSettings kmsSettings = response.getResult();

      System.out.println(kmsSettings);
      // end-update_kms_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listKms() result:");
      // begin-list_kms
      ListKmsOptions listKmsOptions = new ListKmsOptions.Builder()
        .encryptionScheme("testString")
        .location("testString")
        .build();

      Response<KMSDiscovery> response = schematicsService.listKms(listKmsOptions).execute();
      KMSDiscovery kmsDiscovery = response.getResult();

      System.out.println(kmsDiscovery);
      // end-list_kms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPolicy() result:");
      // begin-list_policy
      ListPolicyOptions listPolicyOptions = new ListPolicyOptions.Builder()
        .build();

      Response<PolicyList> response = schematicsService.listPolicy(listPolicyOptions).execute();
      PolicyList policyList = response.getResult();

      System.out.println(policyList);
      // end-list_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPolicy() result:");
      // begin-create_policy
      CreatePolicyOptions createPolicyOptions = new CreatePolicyOptions.Builder()
        .kind("agent_assignment_policy")
        .name("new-policy-dev")
        .description("Policy for job execution of secured workspaces on agent1")
        .resourceGroup("Default")
        .tags(java.util.Arrays.asList("policy:secured-job"))
        .location("us-south")
        .build();

      Response<Policy> response = schematicsService.createPolicy(createPolicyOptions).execute();
      Policy policy = response.getResult();

      System.out.println(policy);
      // end-create_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPolicy() result:");
      // begin-get_policy
      GetPolicyOptions getPolicyOptions = new GetPolicyOptions.Builder()
        .policyId("testString")
        .build();

      Response<Policy> response = schematicsService.getPolicy(getPolicyOptions).execute();
      Policy policy = response.getResult();

      System.out.println(policy);
      // end-get_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePolicy() result:");
      // begin-update_policy
      UpdatePolicyOptions updatePolicyOptions = new UpdatePolicyOptions.Builder()
        .policyId("testString")
        .kind("agent_assignment_policy")
        .name("new-policy-dev")
        .description("Policy for job execution of secured workspaces on agent1 updated")
        .resourceGroup("Default")
        .tags(java.util.Arrays.asList("policy:secured-job"))
        .location("us-south")
        .build();

      Response<Policy> response = schematicsService.updatePolicy(updatePolicyOptions).execute();
      Policy policy = response.getResult();

      System.out.println(policy);
      // end-update_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteWorkspace() result:");
      // begin-delete_workspace
      DeleteWorkspaceOptions deleteWorkspaceOptions = new DeleteWorkspaceOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<String> response = schematicsService.deleteWorkspace(deleteWorkspaceOptions).execute();
      String workspaceDeleteResponse = response.getResult();

      System.out.println(workspaceDeleteResponse);
      // end-delete_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_action
      DeleteActionOptions deleteActionOptions = new DeleteActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<Void> response = schematicsService.deleteAction(deleteActionOptions).execute();
      // end-delete_action
      System.out.printf("deleteAction() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteWorkspaceActivity() result:");
      // begin-delete_workspace_activity
      DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions = new DeleteWorkspaceActivityOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivityApplyResult> response = schematicsService.deleteWorkspaceActivity(deleteWorkspaceActivityOptions).execute();
      WorkspaceActivityApplyResult workspaceActivityApplyResult = response.getResult();

      System.out.println(workspaceActivityApplyResult);
      // end-delete_workspace_activity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_job
      DeleteJobOptions deleteJobOptions = new DeleteJobOptions.Builder()
        .jobId("testString")
        .refreshToken("testString")
        .build();

      Response<Void> response = schematicsService.deleteJob(deleteJobOptions).execute();
      // end-delete_job
      System.out.printf("deleteJob() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_inventory
      DeleteInventoryOptions deleteInventoryOptions = new DeleteInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<Void> response = schematicsService.deleteInventory(deleteInventoryOptions).execute();
      // end-delete_inventory
      System.out.printf("deleteInventory() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_resources_query
      DeleteResourcesQueryOptions deleteResourcesQueryOptions = new DeleteResourcesQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<Void> response = schematicsService.deleteResourcesQuery(deleteResourcesQueryOptions).execute();
      // end-delete_resources_query
      System.out.printf("deleteResourcesQuery() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_agent_data
      DeleteAgentDataOptions deleteAgentDataOptions = new DeleteAgentDataOptions.Builder()
        .agentId("testString")
        .build();

      Response<Void> response = schematicsService.deleteAgentData(deleteAgentDataOptions).execute();
      // end-delete_agent_data
      System.out.printf("deleteAgentData() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteAgentResources() result:");
      // begin-delete_agent_resources
      DeleteAgentResourcesOptions deleteAgentResourcesOptions = new DeleteAgentResourcesOptions.Builder()
        .agentId("testString")
        .refreshToken("testString")
        .build();

      Response<DeleteAgentResources202Response> response = schematicsService.deleteAgentResources(deleteAgentResourcesOptions).execute();
      DeleteAgentResources202Response deleteAgentResources202Response = response.getResult();

      System.out.println(deleteAgentResources202Response);
      // end-delete_agent_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_policy
      DeletePolicyOptions deletePolicyOptions = new DeletePolicyOptions.Builder()
        .policyId("testString")
        .build();

      Response<Void> response = schematicsService.deletePolicy(deletePolicyOptions).execute();
      // end-delete_policy
      System.out.printf("deletePolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
