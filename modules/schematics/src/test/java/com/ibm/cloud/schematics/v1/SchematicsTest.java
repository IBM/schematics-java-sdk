/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.schematics.v1.Schematics;
import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.ActionLite;
import com.ibm.cloud.schematics.v1.model.ActionLiteState;
import com.ibm.cloud.schematics.v1.model.ActionState;
import com.ibm.cloud.schematics.v1.model.Agent;
import com.ibm.cloud.schematics.v1.model.AgentAssignmentPolicyParameter;
import com.ibm.cloud.schematics.v1.model.AgentData;
import com.ibm.cloud.schematics.v1.model.AgentDataList;
import com.ibm.cloud.schematics.v1.model.AgentDataLite;
import com.ibm.cloud.schematics.v1.model.AgentDataRecentDeployJob;
import com.ibm.cloud.schematics.v1.model.AgentDataRecentDestroyJob;
import com.ibm.cloud.schematics.v1.model.AgentDataRecentHealthJob;
import com.ibm.cloud.schematics.v1.model.AgentDataRecentPrsJob;
import com.ibm.cloud.schematics.v1.model.AgentDeployJob;
import com.ibm.cloud.schematics.v1.model.AgentHealthJob;
import com.ibm.cloud.schematics.v1.model.AgentInfo;
import com.ibm.cloud.schematics.v1.model.AgentInfrastructure;
import com.ibm.cloud.schematics.v1.model.AgentKPIData;
import com.ibm.cloud.schematics.v1.model.AgentKPIDataLite;
import com.ibm.cloud.schematics.v1.model.AgentList;
import com.ibm.cloud.schematics.v1.model.AgentMetadataInfo;
import com.ibm.cloud.schematics.v1.model.AgentPRSJob;
import com.ibm.cloud.schematics.v1.model.AgentSystemState;
import com.ibm.cloud.schematics.v1.model.AgentSystemStatus;
import com.ibm.cloud.schematics.v1.model.AgentUserState;
import com.ibm.cloud.schematics.v1.model.AgentVersionInfo;
import com.ibm.cloud.schematics.v1.model.AgentVersions;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.CartOrderData;
import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.CommandsInfo;
import com.ibm.cloud.schematics.v1.model.ConnectionState;
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
import com.ibm.cloud.schematics.v1.model.DeleteAgentOptions;
import com.ibm.cloud.schematics.v1.model.DeleteAgentResourcesOptions;
import com.ibm.cloud.schematics.v1.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeletePolicyOptions;
import com.ibm.cloud.schematics.v1.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.Dependencies;
import com.ibm.cloud.schematics.v1.model.DeployAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.EnvVariableRequestMap;
import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.EnvironmentValuesMetadata;
import com.ibm.cloud.schematics.v1.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentVersionsOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetDeployAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetHealthCheckAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryOptions;
import com.ibm.cloud.schematics.v1.model.GetJobFilesOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetPolicyOptions;
import com.ibm.cloud.schematics.v1.model.GetPrsAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
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
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.HealthCheckAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInner;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInnerTftParametersItem;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobDataFlow;
import com.ibm.cloud.schematics.v1.model.JobDataSystem;
import com.ibm.cloud.schematics.v1.model.JobDataTemplate;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItem;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics.v1.model.JobDataWorkspace;
import com.ibm.cloud.schematics.v1.model.JobFileContent;
import com.ibm.cloud.schematics.v1.model.JobFileData;
import com.ibm.cloud.schematics.v1.model.JobFileDataSummary;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLite;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryLogErrors;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusFlow;
import com.ibm.cloud.schematics.v1.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics.v1.model.JobStatusSystem;
import com.ibm.cloud.schematics.v1.model.JobStatusTemplate;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkitem;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkspace;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSInstances;
import com.ibm.cloud.schematics.v1.model.KMSInstancesKeys;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics.v1.model.LastJob;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.ListAgentOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoriesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListKmsOptions;
import com.ibm.cloud.schematics.v1.model.ListLocationsOptions;
import com.ibm.cloud.schematics.v1.model.ListPolicyOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponse;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.LogSummary;
import com.ibm.cloud.schematics.v1.model.OutputValuesInner;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.Policy;
import com.ibm.cloud.schematics.v1.model.PolicyList;
import com.ibm.cloud.schematics.v1.model.PolicyLite;
import com.ibm.cloud.schematics.v1.model.PolicyObjectSelector;
import com.ibm.cloud.schematics.v1.model.PolicyObjects;
import com.ibm.cloud.schematics.v1.model.PolicyParameter;
import com.ibm.cloud.schematics.v1.model.ProcessTemplateMetaDataOptions;
import com.ibm.cloud.schematics.v1.model.PrsAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RegisterAgentOptions;
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
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecordQueryOutput;
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecordResponse;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SchematicsLocationsList;
import com.ibm.cloud.schematics.v1.model.SchematicsLocationsLite;
import com.ibm.cloud.schematics.v1.model.ScopedResource;
import com.ibm.cloud.schematics.v1.model.ServiceExtensions;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.SharedTargetDataResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUploadOptions;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateRunTimeDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.TerraformCommand;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.UpdateAgentRegistrationOptions;
import com.ibm.cloud.schematics.v1.model.UpdateJobOptions;
import com.ibm.cloud.schematics.v1.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.UpdatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics.v1.model.UserState;
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
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityOptionsTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplateLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobStatusType;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusMessage;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusUpdateRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableResponse;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Schematics service.
 */
public class SchematicsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Schematics schematicsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new Schematics(serviceName, null);
  }

  // Test the listSchematicsLocation operation with a valid options model parameter
  @Test
  public void testListSchematicsLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "[{\"name\": \"name\", \"id\": \"id\", \"country\": \"country\", \"geography\": \"geography\", \"geography_code\": \"geographyCode\", \"metro\": \"metro\", \"multizone_metro\": \"multizoneMetro\", \"kind\": \"kind\", \"paired_region\": [\"pairedRegion\"], \"restricted\": true, \"agent_metadata\": [{\"name\": \"purpose\", \"value\": [\"value\"]}]}]";
    String listSchematicsLocationPath = "/v1/locations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSchematicsLocationOptions model
    ListSchematicsLocationOptions listSchematicsLocationOptionsModel = new ListSchematicsLocationOptions();

    // Invoke listSchematicsLocation() with a valid options model and verify the result
    Response<List<SchematicsLocations>> response = schematicsService.listSchematicsLocation(listSchematicsLocationOptionsModel).execute();
    assertNotNull(response);
    List<SchematicsLocations> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSchematicsLocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSchematicsLocation operation with and without retries enabled
  @Test
  public void testListSchematicsLocationWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListSchematicsLocationWOptions();

    schematicsService.disableRetries();
    testListSchematicsLocationWOptions();
  }

  // Test the listLocations operation with a valid options model parameter
  @Test
  public void testListLocationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [{\"region\": \"region\", \"metro\": \"metro\", \"geography_code\": \"geographyCode\", \"geography\": \"geography\", \"country\": \"country\", \"kind\": \"kind\", \"paired_region\": [\"pairedRegion\"], \"restricted\": true, \"display_name\": \"displayName\", \"schematics_regional_public_endpoint\": \"schematicsRegionalPublicEndpoint\", \"schematics_regional_private_endpoint\": \"schematicsRegionalPrivateEndpoint\"}]}";
    String listLocationsPath = "/v2/locations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListLocationsOptions model
    ListLocationsOptions listLocationsOptionsModel = new ListLocationsOptions();

    // Invoke listLocations() with a valid options model and verify the result
    Response<SchematicsLocationsList> response = schematicsService.listLocations(listLocationsOptionsModel).execute();
    assertNotNull(response);
    SchematicsLocationsList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLocationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listLocations operation with and without retries enabled
  @Test
  public void testListLocationsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListLocationsWOptions();

    schematicsService.disableRetries();
    testListLocationsWOptions();
  }

  // Test the listResourceGroup operation with a valid options model parameter
  @Test
  public void testListResourceGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "[{\"account_id\": \"accountId\", \"crn\": \"crn\", \"default\": true, \"name\": \"name\", \"resource_group_id\": \"resourceGroupId\", \"state\": \"state\"}]";
    String listResourceGroupPath = "/v1/resource_groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListResourceGroupOptions model
    ListResourceGroupOptions listResourceGroupOptionsModel = new ListResourceGroupOptions();

    // Invoke listResourceGroup() with a valid options model and verify the result
    Response<List<ResourceGroupResponse>> response = schematicsService.listResourceGroup(listResourceGroupOptionsModel).execute();
    assertNotNull(response);
    List<ResourceGroupResponse> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listResourceGroup operation with and without retries enabled
  @Test
  public void testListResourceGroupWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListResourceGroupWOptions();

    schematicsService.disableRetries();
    testListResourceGroupWOptions();
  }

  // Test the getSchematicsVersion operation with a valid options model parameter
  @Test
  public void testGetSchematicsVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"builddate\": \"builddate\", \"buildno\": \"buildno\", \"commitsha\": \"commitsha\", \"helm_provider_version\": \"helmProviderVersion\", \"helm_version\": \"helmVersion\", \"supported_template_types\": {\"anyKey\": \"anyValue\"}, \"terraform_provider_version\": \"terraformProviderVersion\", \"terraform_version\": \"terraformVersion\"}";
    String getSchematicsVersionPath = "/v1/version";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSchematicsVersionOptions model
    GetSchematicsVersionOptions getSchematicsVersionOptionsModel = new GetSchematicsVersionOptions();

    // Invoke getSchematicsVersion() with a valid options model and verify the result
    Response<VersionResponse> response = schematicsService.getSchematicsVersion(getSchematicsVersionOptionsModel).execute();
    assertNotNull(response);
    VersionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchematicsVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSchematicsVersion operation with and without retries enabled
  @Test
  public void testGetSchematicsVersionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetSchematicsVersionWOptions();

    schematicsService.disableRetries();
    testGetSchematicsVersionWOptions();
  }

  // Test the processTemplateMetaData operation with a valid options model parameter
  @Test
  public void testProcessTemplateMetaDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"type\", \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String processTemplateMetaDataPath = "/v2/template_metadata_processor";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GitSource model
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

    // Construct an instance of the CatalogSource model
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();

    // Construct an instance of the ProcessTemplateMetaDataOptions model
    ProcessTemplateMetaDataOptions processTemplateMetaDataOptionsModel = new ProcessTemplateMetaDataOptions.Builder()
      .templateType("testString")
      .source(externalSourceModel)
      .region("testString")
      .sourceType("local")
      .xGithubToken("testString")
      .build();

    // Invoke processTemplateMetaData() with a valid options model and verify the result
    Response<TemplateMetaDataResponse> response = schematicsService.processTemplateMetaData(processTemplateMetaDataOptionsModel).execute();
    assertNotNull(response);
    TemplateMetaDataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, processTemplateMetaDataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the processTemplateMetaData operation with and without retries enabled
  @Test
  public void testProcessTemplateMetaDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testProcessTemplateMetaDataWOptions();

    schematicsService.disableRetries();
    testProcessTemplateMetaDataWOptions();
  }

  // Test the processTemplateMetaData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testProcessTemplateMetaDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.processTemplateMetaData(null).execute();
  }

  // Test the listWorkspaces operation with a valid options model parameter
  @Test
  public void testListWorkspacesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 5, \"limit\": 5, \"offset\": 6, \"workspaces\": [{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\", \"service_extensions\": [{\"name\": \"flavor\", \"value\": \"anyValue\", \"type\": \"string\"}]}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"dependencies\": {\"parents\": [\"parents\"], \"children\": [\"children\"]}, \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00.000Z\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"cart_id\": \"cartId\", \"project_id\": \"projectId\", \"last_action_name\": \"lastActionName\", \"last_activity_id\": \"lastActivityId\", \"last_job\": {\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"job_status\": \"jobStatus\"}, \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00.000Z\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00.000Z\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}, \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}]}";
    String listWorkspacesPath = "/v1/workspaces";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListWorkspacesOptions model
    ListWorkspacesOptions listWorkspacesOptionsModel = new ListWorkspacesOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .profile("ids")
      .resourceGroup("testString")
      .build();

    // Invoke listWorkspaces() with a valid options model and verify the result
    Response<WorkspaceResponseList> response = schematicsService.listWorkspaces(listWorkspacesOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspacesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("profile"), "ids");
    assertEquals(query.get("resource_group"), "testString");
  }

  // Test the listWorkspaces operation with and without retries enabled
  @Test
  public void testListWorkspacesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListWorkspacesWOptions();

    schematicsService.disableRetries();
    testListWorkspacesWOptions();
  }

  // Test the createWorkspace operation with a valid options model parameter
  @Test
  public void testCreateWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\", \"service_extensions\": [{\"name\": \"flavor\", \"value\": \"anyValue\", \"type\": \"string\"}]}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"dependencies\": {\"parents\": [\"parents\"], \"children\": [\"children\"]}, \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00.000Z\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"cart_id\": \"cartId\", \"project_id\": \"projectId\", \"last_action_name\": \"lastActionName\", \"last_activity_id\": \"lastActivityId\", \"last_job\": {\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"job_status\": \"jobStatus\"}, \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00.000Z\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00.000Z\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}, \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String createWorkspacePath = "/v1/workspaces";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ServiceExtensions model
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .serviceExtensions(java.util.Arrays.asList(serviceExtensionsModel))
      .build();

    // Construct an instance of the Dependencies model
    Dependencies dependenciesModel = new Dependencies.Builder()
      .parents(java.util.Arrays.asList("testString"))
      .children(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

    // Construct an instance of the EnvironmentValuesMetadata model
    EnvironmentValuesMetadata environmentValuesMetadataModel = new EnvironmentValuesMetadata.Builder()
      .hidden(true)
      .name("testString")
      .secure(true)
      .build();

    // Construct an instance of the InjectTerraformTemplateInnerTftParametersItem model
    InjectTerraformTemplateInnerTftParametersItem injectTerraformTemplateInnerTftParametersItemModel = new InjectTerraformTemplateInnerTftParametersItem.Builder()
      .name("testString")
      .value("testString")
      .build();

    // Construct an instance of the InjectTerraformTemplateInner model
    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("testString")
      .tftGitToken("testString")
      .tftPrefix("testString")
      .injectionType("testString")
      .tftName("testString")
      .tftParameters(java.util.Arrays.asList(injectTerraformTemplateInnerTftParametersItemModel))
      .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .envValuesMetadata(java.util.Arrays.asList(environmentValuesMetadataModel))
      .folder("testString")
      .compact(true)
      .initStateFile("testString")
      .injectors(java.util.Arrays.asList(injectTerraformTemplateInnerModel))
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
      .build();

    // Construct an instance of the TemplateRepoRequest model
    TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

    // Construct an instance of the WorkspaceStatusRequest model
    WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the CreateWorkspaceOptions model
    CreateWorkspaceOptions createWorkspaceOptionsModel = new CreateWorkspaceOptions.Builder()
      .appliedShareddataIds(java.util.Arrays.asList("testString"))
      .catalogRef(catalogRefModel)
      .dependencies(dependenciesModel)
      .description("testString")
      .location("testString")
      .name("testString")
      .resourceGroup("testString")
      .sharedData(sharedTargetDataModel)
      .tags(java.util.Arrays.asList("testString"))
      .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
      .templateRef("testString")
      .templateRepo(templateRepoRequestModel)
      .type(java.util.Arrays.asList("testString"))
      .workspaceStatus(workspaceStatusRequestModel)
      .agentId("testString")
      .xGithubToken("testString")
      .build();

    // Invoke createWorkspace() with a valid options model and verify the result
    Response<WorkspaceResponse> response = schematicsService.createWorkspace(createWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspacePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createWorkspace operation with and without retries enabled
  @Test
  public void testCreateWorkspaceWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateWorkspaceWOptions();

    schematicsService.disableRetries();
    testCreateWorkspaceWOptions();
  }

  // Test the getWorkspace operation with a valid options model parameter
  @Test
  public void testGetWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\", \"service_extensions\": [{\"name\": \"flavor\", \"value\": \"anyValue\", \"type\": \"string\"}]}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"dependencies\": {\"parents\": [\"parents\"], \"children\": [\"children\"]}, \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00.000Z\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"cart_id\": \"cartId\", \"project_id\": \"projectId\", \"last_action_name\": \"lastActionName\", \"last_activity_id\": \"lastActivityId\", \"last_job\": {\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"job_status\": \"jobStatus\"}, \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00.000Z\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00.000Z\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}, \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String getWorkspacePath = "/v1/workspaces/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceOptions model
    GetWorkspaceOptions getWorkspaceOptionsModel = new GetWorkspaceOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getWorkspace() with a valid options model and verify the result
    Response<WorkspaceResponse> response = schematicsService.getWorkspace(getWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspacePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspace operation with and without retries enabled
  @Test
  public void testGetWorkspaceWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceWOptions();
  }

  // Test the getWorkspace operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspace(null).execute();
  }

  // Test the replaceWorkspace operation with a valid options model parameter
  @Test
  public void testReplaceWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\", \"service_extensions\": [{\"name\": \"flavor\", \"value\": \"anyValue\", \"type\": \"string\"}]}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"dependencies\": {\"parents\": [\"parents\"], \"children\": [\"children\"]}, \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00.000Z\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"cart_id\": \"cartId\", \"project_id\": \"projectId\", \"last_action_name\": \"lastActionName\", \"last_activity_id\": \"lastActivityId\", \"last_job\": {\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"job_status\": \"jobStatus\"}, \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00.000Z\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00.000Z\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}, \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String replaceWorkspacePath = "/v1/workspaces/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ServiceExtensions model
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .serviceExtensions(java.util.Arrays.asList(serviceExtensionsModel))
      .build();

    // Construct an instance of the Dependencies model
    Dependencies dependenciesModel = new Dependencies.Builder()
      .parents(java.util.Arrays.asList("testString"))
      .children(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

    // Construct an instance of the EnvironmentValuesMetadata model
    EnvironmentValuesMetadata environmentValuesMetadataModel = new EnvironmentValuesMetadata.Builder()
      .hidden(true)
      .name("testString")
      .secure(true)
      .build();

    // Construct an instance of the InjectTerraformTemplateInnerTftParametersItem model
    InjectTerraformTemplateInnerTftParametersItem injectTerraformTemplateInnerTftParametersItemModel = new InjectTerraformTemplateInnerTftParametersItem.Builder()
      .name("testString")
      .value("testString")
      .build();

    // Construct an instance of the InjectTerraformTemplateInner model
    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("testString")
      .tftGitToken("testString")
      .tftPrefix("testString")
      .injectionType("testString")
      .tftName("testString")
      .tftParameters(java.util.Arrays.asList(injectTerraformTemplateInnerTftParametersItemModel))
      .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .envValuesMetadata(java.util.Arrays.asList(environmentValuesMetadataModel))
      .folder("testString")
      .compact(true)
      .initStateFile("testString")
      .injectors(java.util.Arrays.asList(injectTerraformTemplateInnerModel))
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
      .build();

    // Construct an instance of the TemplateRepoUpdateRequest model
    TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

    // Construct an instance of the WorkspaceStatusUpdateRequest model
    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the WorkspaceStatusMessage model
    WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
      .statusCode("testString")
      .statusMsg("testString")
      .build();

    // Construct an instance of the ReplaceWorkspaceOptions model
    ReplaceWorkspaceOptions replaceWorkspaceOptionsModel = new ReplaceWorkspaceOptions.Builder()
      .wId("testString")
      .catalogRef(catalogRefModel)
      .description("testString")
      .dependencies(dependenciesModel)
      .name("testString")
      .sharedData(sharedTargetDataModel)
      .tags(java.util.Arrays.asList("testString"))
      .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
      .templateRepo(templateRepoUpdateRequestModel)
      .type(java.util.Arrays.asList("testString"))
      .workspaceStatus(workspaceStatusUpdateRequestModel)
      .workspaceStatusMsg(workspaceStatusMessageModel)
      .agentId("testString")
      .xGithubToken("testString")
      .build();

    // Invoke replaceWorkspace() with a valid options model and verify the result
    Response<WorkspaceResponse> response = schematicsService.replaceWorkspace(replaceWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWorkspacePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceWorkspace operation with and without retries enabled
  @Test
  public void testReplaceWorkspaceWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testReplaceWorkspaceWOptions();

    schematicsService.disableRetries();
    testReplaceWorkspaceWOptions();
  }

  // Test the replaceWorkspace operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.replaceWorkspace(null).execute();
  }

  // Test the deleteWorkspace operation with a valid options model parameter
  @Test
  public void testDeleteWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "\"operationResponse\"";
    String deleteWorkspacePath = "/v1/workspaces/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteWorkspaceOptions model
    DeleteWorkspaceOptions deleteWorkspaceOptionsModel = new DeleteWorkspaceOptions.Builder()
      .refreshToken("testString")
      .wId("testString")
      .destroyResources("testString")
      .build();

    // Invoke deleteWorkspace() with a valid options model and verify the result
    Response<String> response = schematicsService.deleteWorkspace(deleteWorkspaceOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkspacePath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("destroy_resources"), "testString");
  }

  // Test the deleteWorkspace operation with and without retries enabled
  @Test
  public void testDeleteWorkspaceWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteWorkspaceWOptions();

    schematicsService.disableRetries();
    testDeleteWorkspaceWOptions();
  }

  // Test the deleteWorkspace operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkspaceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteWorkspace(null).execute();
  }

  // Test the updateWorkspace operation with a valid options model parameter
  @Test
  public void testUpdateWorkspaceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\", \"service_extensions\": [{\"name\": \"flavor\", \"value\": \"anyValue\", \"type\": \"string\"}]}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"dependencies\": {\"parents\": [\"parents\"], \"children\": [\"children\"]}, \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00.000Z\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"cart_id\": \"cartId\", \"project_id\": \"projectId\", \"last_action_name\": \"lastActionName\", \"last_activity_id\": \"lastActivityId\", \"last_job\": {\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"job_status\": \"jobStatus\"}, \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00.000Z\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00.000Z\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}, \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String updateWorkspacePath = "/v1/workspaces/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ServiceExtensions model
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .serviceExtensions(java.util.Arrays.asList(serviceExtensionsModel))
      .build();

    // Construct an instance of the Dependencies model
    Dependencies dependenciesModel = new Dependencies.Builder()
      .parents(java.util.Arrays.asList("testString"))
      .children(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

    // Construct an instance of the EnvironmentValuesMetadata model
    EnvironmentValuesMetadata environmentValuesMetadataModel = new EnvironmentValuesMetadata.Builder()
      .hidden(true)
      .name("testString")
      .secure(true)
      .build();

    // Construct an instance of the InjectTerraformTemplateInnerTftParametersItem model
    InjectTerraformTemplateInnerTftParametersItem injectTerraformTemplateInnerTftParametersItemModel = new InjectTerraformTemplateInnerTftParametersItem.Builder()
      .name("testString")
      .value("testString")
      .build();

    // Construct an instance of the InjectTerraformTemplateInner model
    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("testString")
      .tftGitToken("testString")
      .tftPrefix("testString")
      .injectionType("testString")
      .tftName("testString")
      .tftParameters(java.util.Arrays.asList(injectTerraformTemplateInnerTftParametersItemModel))
      .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .envValuesMetadata(java.util.Arrays.asList(environmentValuesMetadataModel))
      .folder("testString")
      .compact(true)
      .initStateFile("testString")
      .injectors(java.util.Arrays.asList(injectTerraformTemplateInnerModel))
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
      .build();

    // Construct an instance of the TemplateRepoUpdateRequest model
    TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

    // Construct an instance of the WorkspaceStatusUpdateRequest model
    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the WorkspaceStatusMessage model
    WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
      .statusCode("testString")
      .statusMsg("testString")
      .build();

    // Construct an instance of the UpdateWorkspaceOptions model
    UpdateWorkspaceOptions updateWorkspaceOptionsModel = new UpdateWorkspaceOptions.Builder()
      .wId("testString")
      .catalogRef(catalogRefModel)
      .description("testString")
      .dependencies(dependenciesModel)
      .name("testString")
      .sharedData(sharedTargetDataModel)
      .tags(java.util.Arrays.asList("testString"))
      .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
      .templateRepo(templateRepoUpdateRequestModel)
      .type(java.util.Arrays.asList("testString"))
      .workspaceStatus(workspaceStatusUpdateRequestModel)
      .workspaceStatusMsg(workspaceStatusMessageModel)
      .agentId("testString")
      .build();

    // Invoke updateWorkspace() with a valid options model and verify the result
    Response<WorkspaceResponse> response = schematicsService.updateWorkspace(updateWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWorkspacePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateWorkspace operation with and without retries enabled
  @Test
  public void testUpdateWorkspaceWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateWorkspaceWOptions();

    schematicsService.disableRetries();
    testUpdateWorkspaceWOptions();
  }

  // Test the updateWorkspace operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWorkspaceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updateWorkspace(null).execute();
  }

  // Test the getWorkspaceReadme operation with a valid options model parameter
  @Test
  public void testGetWorkspaceReadmeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"readme\": \"readme\"}";
    String getWorkspaceReadmePath = "/v1/workspaces/testString/templates/readme";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceReadmeOptions model
    GetWorkspaceReadmeOptions getWorkspaceReadmeOptionsModel = new GetWorkspaceReadmeOptions.Builder()
      .wId("testString")
      .ref("testString")
      .formatted("markdown")
      .build();

    // Invoke getWorkspaceReadme() with a valid options model and verify the result
    Response<TemplateReadme> response = schematicsService.getWorkspaceReadme(getWorkspaceReadmeOptionsModel).execute();
    assertNotNull(response);
    TemplateReadme responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceReadmePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("ref"), "testString");
    assertEquals(query.get("formatted"), "markdown");
  }

  // Test the getWorkspaceReadme operation with and without retries enabled
  @Test
  public void testGetWorkspaceReadmeWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceReadmeWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceReadmeWOptions();
  }

  // Test the getWorkspaceReadme operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceReadmeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceReadme(null).execute();
  }

  // Test the templateRepoUpload operation with a valid options model parameter
  @Test
  public void testTemplateRepoUploadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"file_value\": \"fileValue\", \"has_received_file\": false, \"id\": \"id\"}";
    String templateRepoUploadPath = "/v1/workspaces/testString/template_data/testString/template_repo_upload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateRepoUploadOptions model
    TemplateRepoUploadOptions templateRepoUploadOptionsModel = new TemplateRepoUploadOptions.Builder()
      .wId("testString")
      .tId("testString")
      .file(TestUtilities.createMockStream("This is a mock file."))
      .fileContentType("testString")
      .build();

    // Invoke templateRepoUpload() with a valid options model and verify the result
    Response<TemplateRepoTarUploadResponse> response = schematicsService.templateRepoUpload(templateRepoUploadOptionsModel).execute();
    assertNotNull(response);
    TemplateRepoTarUploadResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, templateRepoUploadPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the templateRepoUpload operation with and without retries enabled
  @Test
  public void testTemplateRepoUploadWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testTemplateRepoUploadWOptions();

    schematicsService.disableRetries();
    testTemplateRepoUploadWOptions();
  }

  // Test the templateRepoUpload operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTemplateRepoUploadNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.templateRepoUpload(null).execute();
  }

  // Test the getWorkspaceInputs operation with a valid options model parameter
  @Test
  public void testGetWorkspaceInputsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"values_metadata\": [{\"anyKey\": \"anyValue\"}]}";
    String getWorkspaceInputsPath = "/v1/workspaces/testString/template_data/testString/values";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceInputsOptions model
    GetWorkspaceInputsOptions getWorkspaceInputsOptionsModel = new GetWorkspaceInputsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

    // Invoke getWorkspaceInputs() with a valid options model and verify the result
    Response<TemplateValues> response = schematicsService.getWorkspaceInputs(getWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    TemplateValues responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceInputsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceInputs operation with and without retries enabled
  @Test
  public void testGetWorkspaceInputsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceInputsWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceInputsWOptions();
  }

  // Test the getWorkspaceInputs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceInputs(null).execute();
  }

  // Test the replaceWorkspaceInputs operation with a valid options model parameter
  @Test
  public void testReplaceWorkspaceInputsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"env_values\": [{\"anyKey\": \"anyValue\"}], \"env_values_map\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"values\": \"values\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}";
    String replaceWorkspaceInputsPath = "/v1/workspaces/testString/template_data/testString/values";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

    // Construct an instance of the ReplaceWorkspaceInputsOptions model
    ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptionsModel = new ReplaceWorkspaceInputsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .values("testString")
      .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
      .build();

    // Invoke replaceWorkspaceInputs() with a valid options model and verify the result
    Response<UserValues> response = schematicsService.replaceWorkspaceInputs(replaceWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    UserValues responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWorkspaceInputsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceWorkspaceInputs operation with and without retries enabled
  @Test
  public void testReplaceWorkspaceInputsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testReplaceWorkspaceInputsWOptions();

    schematicsService.disableRetries();
    testReplaceWorkspaceInputsWOptions();
  }

  // Test the replaceWorkspaceInputs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceInputsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.replaceWorkspaceInputs(null).execute();
  }

  // Test the getAllWorkspaceInputs operation with a valid options model parameter
  @Test
  public void testGetAllWorkspaceInputsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"resources\": [[{\"anyKey\": \"anyValue\"}]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_created_on\": \"clusterCreatedOn\", \"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"cluster_type\": \"clusterType\", \"entitlement_keys\": [{\"anyKey\": \"anyValue\"}], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\", \"worker_count\": 11, \"worker_machine_type\": \"workerMachineType\"}, \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"compact\": false, \"has_githubtoken\": true, \"id\": \"id\", \"type\": \"type\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [{\"anyKey\": \"anyValue\"}], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}]}";
    String getAllWorkspaceInputsPath = "/v1/workspaces/testString/templates/values";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllWorkspaceInputsOptions model
    GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptionsModel = new GetAllWorkspaceInputsOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getAllWorkspaceInputs() with a valid options model and verify the result
    Response<WorkspaceTemplateValuesResponse> response = schematicsService.getAllWorkspaceInputs(getAllWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    WorkspaceTemplateValuesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllWorkspaceInputsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAllWorkspaceInputs operation with and without retries enabled
  @Test
  public void testGetAllWorkspaceInputsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetAllWorkspaceInputsWOptions();

    schematicsService.disableRetries();
    testGetAllWorkspaceInputsWOptions();
  }

  // Test the getAllWorkspaceInputs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllWorkspaceInputsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getAllWorkspaceInputs(null).execute();
  }

  // Test the getWorkspaceInputMetadata operation with a valid options model parameter
  @Test
  public void testGetWorkspaceInputMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "[{\"anyKey\": \"anyValue\"}]";
    String getWorkspaceInputMetadataPath = "/v1/workspaces/testString/template_data/testString/values_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceInputMetadataOptions model
    GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptionsModel = new GetWorkspaceInputMetadataOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

    // Invoke getWorkspaceInputMetadata() with a valid options model and verify the result
    Response<List<Map<String, Object>>> response = schematicsService.getWorkspaceInputMetadata(getWorkspaceInputMetadataOptionsModel).execute();
    assertNotNull(response);
    List<Map<String, Object>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceInputMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceInputMetadata operation with and without retries enabled
  @Test
  public void testGetWorkspaceInputMetadataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceInputMetadataWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceInputMetadataWOptions();
  }

  // Test the getWorkspaceInputMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceInputMetadata(null).execute();
  }

  // Test the getWorkspaceOutputs operation with a valid options model parameter
  @Test
  public void testGetWorkspaceOutputsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "[{\"folder\": \"folder\", \"id\": \"id\", \"output_values\": [{\"anyKey\": \"anyValue\"}], \"value_type\": \"valueType\"}]";
    String getWorkspaceOutputsPath = "/v1/workspaces/testString/output_values";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceOutputsOptions model
    GetWorkspaceOutputsOptions getWorkspaceOutputsOptionsModel = new GetWorkspaceOutputsOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getWorkspaceOutputs() with a valid options model and verify the result
    Response<List<OutputValuesInner>> response = schematicsService.getWorkspaceOutputs(getWorkspaceOutputsOptionsModel).execute();
    assertNotNull(response);
    List<OutputValuesInner> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceOutputsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceOutputs operation with and without retries enabled
  @Test
  public void testGetWorkspaceOutputsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceOutputsWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceOutputsWOptions();
  }

  // Test the getWorkspaceOutputs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceOutputsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceOutputs(null).execute();
  }

  // Test the getWorkspaceResources operation with a valid options model parameter
  @Test
  public void testGetWorkspaceResourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "[{\"folder\": \"folder\", \"id\": \"id\", \"generated_at\": \"2019-01-01T12:00:00.000Z\", \"null_resources\": [{\"anyKey\": \"anyValue\"}], \"related_resources\": [{\"anyKey\": \"anyValue\"}], \"resources\": [{\"anyKey\": \"anyValue\"}], \"resources_count\": 14, \"type\": \"type\"}]";
    String getWorkspaceResourcesPath = "/v1/workspaces/testString/resources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceResourcesOptions model
    GetWorkspaceResourcesOptions getWorkspaceResourcesOptionsModel = new GetWorkspaceResourcesOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getWorkspaceResources() with a valid options model and verify the result
    Response<List<TemplateResources>> response = schematicsService.getWorkspaceResources(getWorkspaceResourcesOptionsModel).execute();
    assertNotNull(response);
    List<TemplateResources> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceResourcesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceResources operation with and without retries enabled
  @Test
  public void testGetWorkspaceResourcesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceResourcesWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceResourcesWOptions();
  }

  // Test the getWorkspaceResources operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceResourcesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceResources(null).execute();
  }

  // Test the getWorkspaceState operation with a valid options model parameter
  @Test
  public void testGetWorkspaceStateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"runtime_data\": [{\"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"state_store_url\": \"stateStoreUrl\"}]}";
    String getWorkspaceStatePath = "/v1/workspaces/testString/state_stores";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceStateOptions model
    GetWorkspaceStateOptions getWorkspaceStateOptionsModel = new GetWorkspaceStateOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getWorkspaceState() with a valid options model and verify the result
    Response<StateStoreResponseList> response = schematicsService.getWorkspaceState(getWorkspaceStateOptionsModel).execute();
    assertNotNull(response);
    StateStoreResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceStatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceState operation with and without retries enabled
  @Test
  public void testGetWorkspaceStateWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceStateWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceStateWOptions();
  }

  // Test the getWorkspaceState operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceStateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceState(null).execute();
  }

  // Test the getWorkspaceTemplateState operation with a valid options model parameter
  @Test
  public void testGetWorkspaceTemplateStateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": 7, \"terraform_version\": \"terraformVersion\", \"serial\": 6, \"lineage\": \"lineage\", \"modules\": [{\"anyKey\": \"anyValue\"}]}";
    String getWorkspaceTemplateStatePath = "/v1/workspaces/testString/runtime_data/testString/state_store";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceTemplateStateOptions model
    GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptionsModel = new GetWorkspaceTemplateStateOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

    // Invoke getWorkspaceTemplateState() with a valid options model and verify the result
    Response<TemplateStateStore> response = schematicsService.getWorkspaceTemplateState(getWorkspaceTemplateStateOptionsModel).execute();
    assertNotNull(response);
    TemplateStateStore responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceTemplateStatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceTemplateState operation with and without retries enabled
  @Test
  public void testGetWorkspaceTemplateStateWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceTemplateStateWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceTemplateStateWOptions();
  }

  // Test the getWorkspaceTemplateState operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceTemplateStateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceTemplateState(null).execute();
  }

  // Test the getWorkspaceActivityLogs operation with a valid options model parameter
  @Test
  public void testGetWorkspaceActivityLogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action_id\": \"actionId\", \"name\": \"name\", \"templates\": [{\"log_url\": \"logUrl\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}";
    String getWorkspaceActivityLogsPath = "/v1/workspaces/testString/actions/testString/logs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceActivityLogsOptions model
    GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptionsModel = new GetWorkspaceActivityLogsOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

    // Invoke getWorkspaceActivityLogs() with a valid options model and verify the result
    Response<WorkspaceActivityLogs> response = schematicsService.getWorkspaceActivityLogs(getWorkspaceActivityLogsOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityLogs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceActivityLogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceActivityLogs operation with and without retries enabled
  @Test
  public void testGetWorkspaceActivityLogsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceActivityLogsWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceActivityLogsWOptions();
  }

  // Test the getWorkspaceActivityLogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceActivityLogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceActivityLogs(null).execute();
  }

  // Test the getWorkspaceLogUrls operation with a valid options model parameter
  @Test
  public void testGetWorkspaceLogUrlsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"runtime_data\": [{\"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\"}]}";
    String getWorkspaceLogUrlsPath = "/v1/workspaces/testString/log_stores";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceLogUrlsOptions model
    GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptionsModel = new GetWorkspaceLogUrlsOptions.Builder()
      .wId("testString")
      .build();

    // Invoke getWorkspaceLogUrls() with a valid options model and verify the result
    Response<LogStoreResponseList> response = schematicsService.getWorkspaceLogUrls(getWorkspaceLogUrlsOptionsModel).execute();
    assertNotNull(response);
    LogStoreResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceLogUrlsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceLogUrls operation with and without retries enabled
  @Test
  public void testGetWorkspaceLogUrlsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceLogUrlsWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceLogUrlsWOptions();
  }

  // Test the getWorkspaceLogUrls operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceLogUrlsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceLogUrls(null).execute();
  }

  // Test the getTemplateLogs operation with a valid options model parameter
  @Test
  public void testGetTemplateLogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "\"operationResponse\"";
    String getTemplateLogsPath = "/v1/workspaces/testString/runtime_data/testString/log_store";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTemplateLogsOptions model
    GetTemplateLogsOptions getTemplateLogsOptionsModel = new GetTemplateLogsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .logTfCmd(true)
      .logTfPrefix(true)
      .logTfNullResource(true)
      .logTfAnsible(true)
      .build();

    // Invoke getTemplateLogs() with a valid options model and verify the result
    Response<String> response = schematicsService.getTemplateLogs(getTemplateLogsOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateLogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("log_tf_cmd")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_prefix")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_null_resource")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_ansible")), Boolean.valueOf(true));
  }

  // Test the getTemplateLogs operation with and without retries enabled
  @Test
  public void testGetTemplateLogsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetTemplateLogsWOptions();

    schematicsService.disableRetries();
    testGetTemplateLogsWOptions();
  }

  // Test the getTemplateLogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateLogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getTemplateLogs(null).execute();
  }

  // Test the getTemplateActivityLog operation with a valid options model parameter
  @Test
  public void testGetTemplateActivityLogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "\"operationResponse\"";
    String getTemplateActivityLogPath = "/v1/workspaces/testString/runtime_data/testString/log_store/actions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTemplateActivityLogOptions model
    GetTemplateActivityLogOptions getTemplateActivityLogOptionsModel = new GetTemplateActivityLogOptions.Builder()
      .wId("testString")
      .tId("testString")
      .activityId("testString")
      .logTfCmd(true)
      .logTfPrefix(true)
      .logTfNullResource(true)
      .logTfAnsible(true)
      .build();

    // Invoke getTemplateActivityLog() with a valid options model and verify the result
    Response<String> response = schematicsService.getTemplateActivityLog(getTemplateActivityLogOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateActivityLogPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("log_tf_cmd")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_prefix")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_null_resource")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_ansible")), Boolean.valueOf(true));
  }

  // Test the getTemplateActivityLog operation with and without retries enabled
  @Test
  public void testGetTemplateActivityLogWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetTemplateActivityLogWOptions();

    schematicsService.disableRetries();
    testGetTemplateActivityLogWOptions();
  }

  // Test the getTemplateActivityLog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateActivityLogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getTemplateActivityLog(null).execute();
  }

  // Test the listActions operation with a valid options model parameter
  @Test
  public void testListActionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"actions\": [{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"namespace\": \"namespace\", \"tags\": [\"tags\"], \"playbook_name\": \"playbookName\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}]}";
    String listActionsPath = "/v2/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListActionsOptions model
    ListActionsOptions listActionsOptionsModel = new ListActionsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .sort("testString")
      .profile("ids")
      .build();

    // Invoke listActions() with a valid options model and verify the result
    Response<ActionList> response = schematicsService.listActions(listActionsOptionsModel).execute();
    assertNotNull(response);
    ActionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
  }

  // Test the listActions operation with and without retries enabled
  @Test
  public void testListActionsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListActionsWOptions();

    schematicsService.disableRetries();
    testListActionsWOptions();
  }

  // Test the createAction operation with a valid options model parameter
  @Test
  public void testCreateActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"bastion_connection_type\": \"ssh\", \"inventory_connection_type\": \"ssh\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String createActionPath = "/v2/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the GitSource model
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

    // Construct an instance of the CatalogSource model
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();

    // Construct an instance of the CredentialVariableMetadata model
    CredentialVariableMetadata credentialVariableMetadataModel = new CredentialVariableMetadata.Builder()
      .type("string")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .immutable(true)
      .hidden(true)
      .required(true)
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the CredentialVariableData model
    CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(credentialVariableMetadataModel)
      .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the CreateActionOptions model
    CreateActionOptions createActionOptionsModel = new CreateActionOptions.Builder()
      .name("Stop Action")
      .description("The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.")
      .location("us-south")
      .resourceGroup("testString")
      .bastionConnectionType("ssh")
      .inventoryConnectionType("ssh")
      .tags(java.util.Arrays.asList("testString"))
      .userState(userStateModel)
      .sourceReadmeUrl("testString")
      .source(externalSourceModel)
      .sourceType("local")
      .commandParameter("testString")
      .inventory("testString")
      .credentials(java.util.Arrays.asList(credentialVariableDataModel))
      .bastion(bastionResourceDefinitionModel)
      .bastionCredential(credentialVariableDataModel)
      .targetsIni("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .xGithubToken("testString")
      .build();

    // Invoke createAction() with a valid options model and verify the result
    Response<Action> response = schematicsService.createAction(createActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAction operation with and without retries enabled
  @Test
  public void testCreateActionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateActionWOptions();

    schematicsService.disableRetries();
    testCreateActionWOptions();
  }

  // Test the getAction operation with a valid options model parameter
  @Test
  public void testGetActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"bastion_connection_type\": \"ssh\", \"inventory_connection_type\": \"ssh\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String getActionPath = "/v2/actions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetActionOptions model
    GetActionOptions getActionOptionsModel = new GetActionOptions.Builder()
      .actionId("testString")
      .profile("summary")
      .build();

    // Invoke getAction() with a valid options model and verify the result
    Response<Action> response = schematicsService.getAction(getActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getAction operation with and without retries enabled
  @Test
  public void testGetActionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetActionWOptions();

    schematicsService.disableRetries();
    testGetActionWOptions();
  }

  // Test the getAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getAction(null).execute();
  }

  // Test the deleteAction operation with a valid options model parameter
  @Test
  public void testDeleteActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteActionPath = "/v2/actions/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteActionOptions model
    DeleteActionOptions deleteActionOptionsModel = new DeleteActionOptions.Builder()
      .actionId("testString")
      .force(true)
      .propagate(true)
      .build();

    // Invoke deleteAction() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteAction(deleteActionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAction operation with and without retries enabled
  @Test
  public void testDeleteActionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteActionWOptions();

    schematicsService.disableRetries();
    testDeleteActionWOptions();
  }

  // Test the deleteAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteAction(null).execute();
  }

  // Test the updateAction operation with a valid options model parameter
  @Test
  public void testUpdateActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"bastion_connection_type\": \"ssh\", \"inventory_connection_type\": \"ssh\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"string\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"immutable\": false, \"hidden\": true, \"required\": true, \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String updateActionPath = "/v2/actions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the GitSource model
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

    // Construct an instance of the CatalogSource model
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();

    // Construct an instance of the CredentialVariableMetadata model
    CredentialVariableMetadata credentialVariableMetadataModel = new CredentialVariableMetadata.Builder()
      .type("string")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .immutable(true)
      .hidden(true)
      .required(true)
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the CredentialVariableData model
    CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(credentialVariableMetadataModel)
      .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the UpdateActionOptions model
    UpdateActionOptions updateActionOptionsModel = new UpdateActionOptions.Builder()
      .actionId("testString")
      .name("Stop Action")
      .description("The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.")
      .location("us-south")
      .resourceGroup("testString")
      .bastionConnectionType("ssh")
      .inventoryConnectionType("ssh")
      .tags(java.util.Arrays.asList("testString"))
      .userState(userStateModel)
      .sourceReadmeUrl("testString")
      .source(externalSourceModel)
      .sourceType("local")
      .commandParameter("testString")
      .inventory("testString")
      .credentials(java.util.Arrays.asList(credentialVariableDataModel))
      .bastion(bastionResourceDefinitionModel)
      .bastionCredential(credentialVariableDataModel)
      .targetsIni("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .xGithubToken("testString")
      .build();

    // Invoke updateAction() with a valid options model and verify the result
    Response<Action> response = schematicsService.updateAction(updateActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAction operation with and without retries enabled
  @Test
  public void testUpdateActionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateActionWOptions();

    schematicsService.disableRetries();
    testUpdateActionWOptions();
  }

  // Test the updateAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updateAction(null).execute();
  }

  // Test the uploadTemplateTarAction operation with a valid options model parameter
  @Test
  public void testUploadTemplateTarActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"file_value\": \"fileValue\", \"has_received_file\": false, \"id\": \"id\"}";
    String uploadTemplateTarActionPath = "/v2/actions/testString/template_repo_upload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UploadTemplateTarActionOptions model
    UploadTemplateTarActionOptions uploadTemplateTarActionOptionsModel = new UploadTemplateTarActionOptions.Builder()
      .actionId("testString")
      .file(TestUtilities.createMockStream("This is a mock file."))
      .fileContentType("testString")
      .build();

    // Invoke uploadTemplateTarAction() with a valid options model and verify the result
    Response<TemplateRepoTarUploadResponse> response = schematicsService.uploadTemplateTarAction(uploadTemplateTarActionOptionsModel).execute();
    assertNotNull(response);
    TemplateRepoTarUploadResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uploadTemplateTarActionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the uploadTemplateTarAction operation with and without retries enabled
  @Test
  public void testUploadTemplateTarActionWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUploadTemplateTarActionWOptions();

    schematicsService.disableRetries();
    testUploadTemplateTarActionWOptions();
  }

  // Test the uploadTemplateTarAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUploadTemplateTarActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.uploadTemplateTarAction(null).execute();
  }

  // Test the listWorkspaceActivities operation with a valid options model parameter
  @Test
  public void testListWorkspaceActivitiesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [{\"action_id\": \"actionId\", \"message\": [\"message\"], \"name\": \"name\", \"performed_at\": \"2019-01-01T12:00:00.000Z\", \"performed_by\": \"performedBy\", \"status\": \"status\", \"templates\": [{\"end_time\": \"2019-01-01T12:00:00.000Z\", \"log_summary\": {\"activity_status\": \"activityStatus\", \"detected_template_type\": \"detectedTemplateType\", \"discarded_files\": 14, \"error\": \"error\", \"resources_added\": 14, \"resources_destroyed\": 18, \"resources_modified\": 17, \"scanned_files\": 12, \"template_variable_count\": 21, \"time_taken\": 9}, \"log_url\": \"logUrl\", \"message\": \"message\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"status\": \"status\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}], \"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\"}";
    String listWorkspaceActivitiesPath = "/v1/workspaces/testString/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListWorkspaceActivitiesOptions model
    ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptionsModel = new ListWorkspaceActivitiesOptions.Builder()
      .wId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .build();

    // Invoke listWorkspaceActivities() with a valid options model and verify the result
    Response<WorkspaceActivities> response = schematicsService.listWorkspaceActivities(listWorkspaceActivitiesOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivities responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspaceActivitiesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
  }

  // Test the listWorkspaceActivities operation with and without retries enabled
  @Test
  public void testListWorkspaceActivitiesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListWorkspaceActivitiesWOptions();

    schematicsService.disableRetries();
    testListWorkspaceActivitiesWOptions();
  }

  // Test the listWorkspaceActivities operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWorkspaceActivitiesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.listWorkspaceActivities(null).execute();
  }

  // Test the getWorkspaceActivity operation with a valid options model parameter
  @Test
  public void testGetWorkspaceActivityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action_id\": \"actionId\", \"message\": [\"message\"], \"name\": \"name\", \"performed_at\": \"2019-01-01T12:00:00.000Z\", \"performed_by\": \"performedBy\", \"status\": \"status\", \"templates\": [{\"end_time\": \"2019-01-01T12:00:00.000Z\", \"log_summary\": {\"activity_status\": \"activityStatus\", \"detected_template_type\": \"detectedTemplateType\", \"discarded_files\": 14, \"error\": \"error\", \"resources_added\": 14, \"resources_destroyed\": 18, \"resources_modified\": 17, \"scanned_files\": 12, \"template_variable_count\": 21, \"time_taken\": 9}, \"log_url\": \"logUrl\", \"message\": \"message\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"status\": \"status\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}";
    String getWorkspaceActivityPath = "/v1/workspaces/testString/actions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceActivityOptions model
    GetWorkspaceActivityOptions getWorkspaceActivityOptionsModel = new GetWorkspaceActivityOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

    // Invoke getWorkspaceActivity() with a valid options model and verify the result
    Response<WorkspaceActivity> response = schematicsService.getWorkspaceActivity(getWorkspaceActivityOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivity responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceActivityPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceActivity operation with and without retries enabled
  @Test
  public void testGetWorkspaceActivityWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceActivityWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceActivityWOptions();
  }

  // Test the getWorkspaceActivity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceActivityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceActivity(null).execute();
  }

  // Test the deleteWorkspaceActivity operation with a valid options model parameter
  @Test
  public void testDeleteWorkspaceActivityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String deleteWorkspaceActivityPath = "/v1/workspaces/testString/actions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteWorkspaceActivityOptions model
    DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptionsModel = new DeleteWorkspaceActivityOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

    // Invoke deleteWorkspaceActivity() with a valid options model and verify the result
    Response<WorkspaceActivityApplyResult> response = schematicsService.deleteWorkspaceActivity(deleteWorkspaceActivityOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityApplyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkspaceActivityPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteWorkspaceActivity operation with and without retries enabled
  @Test
  public void testDeleteWorkspaceActivityWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteWorkspaceActivityWOptions();

    schematicsService.disableRetries();
    testDeleteWorkspaceActivityWOptions();
  }

  // Test the deleteWorkspaceActivity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkspaceActivityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteWorkspaceActivity(null).execute();
  }

  // Test the runWorkspaceCommands operation with a valid options model parameter
  @Test
  public void testRunWorkspaceCommandsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String runWorkspaceCommandsPath = "/v1/workspaces/testString/commands";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TerraformCommand model
    TerraformCommand terraformCommandModel = new TerraformCommand.Builder()
      .command("testString")
      .commandParams("testString")
      .commandName("testString")
      .commandDesc("testString")
      .commandOnError("testString")
      .commandDependsOn("testString")
      .commandStatus("testString")
      .build();

    // Construct an instance of the RunWorkspaceCommandsOptions model
    RunWorkspaceCommandsOptions runWorkspaceCommandsOptionsModel = new RunWorkspaceCommandsOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .commands(java.util.Arrays.asList(terraformCommandModel))
      .operationName("testString")
      .description("testString")
      .build();

    // Invoke runWorkspaceCommands() with a valid options model and verify the result
    Response<WorkspaceActivityCommandResult> response = schematicsService.runWorkspaceCommands(runWorkspaceCommandsOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityCommandResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runWorkspaceCommandsPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runWorkspaceCommands operation with and without retries enabled
  @Test
  public void testRunWorkspaceCommandsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testRunWorkspaceCommandsWOptions();

    schematicsService.disableRetries();
    testRunWorkspaceCommandsWOptions();
  }

  // Test the runWorkspaceCommands operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunWorkspaceCommandsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.runWorkspaceCommands(null).execute();
  }

  // Test the applyWorkspaceCommand operation with a valid options model parameter
  @Test
  public void testApplyWorkspaceCommandWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String applyWorkspaceCommandPath = "/v1/workspaces/testString/apply";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the WorkspaceActivityOptionsTemplate model
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(java.util.Arrays.asList("testString"))
      .tfVars(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ApplyWorkspaceCommandOptions model
    ApplyWorkspaceCommandOptions applyWorkspaceCommandOptionsModel = new ApplyWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .delegatedToken("testString")
      .build();

    // Invoke applyWorkspaceCommand() with a valid options model and verify the result
    Response<WorkspaceActivityApplyResult> response = schematicsService.applyWorkspaceCommand(applyWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityApplyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, applyWorkspaceCommandPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the applyWorkspaceCommand operation with and without retries enabled
  @Test
  public void testApplyWorkspaceCommandWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testApplyWorkspaceCommandWOptions();

    schematicsService.disableRetries();
    testApplyWorkspaceCommandWOptions();
  }

  // Test the applyWorkspaceCommand operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testApplyWorkspaceCommandNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.applyWorkspaceCommand(null).execute();
  }

  // Test the destroyWorkspaceCommand operation with a valid options model parameter
  @Test
  public void testDestroyWorkspaceCommandWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String destroyWorkspaceCommandPath = "/v1/workspaces/testString/destroy";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the WorkspaceActivityOptionsTemplate model
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(java.util.Arrays.asList("testString"))
      .tfVars(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DestroyWorkspaceCommandOptions model
    DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptionsModel = new DestroyWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .delegatedToken("testString")
      .build();

    // Invoke destroyWorkspaceCommand() with a valid options model and verify the result
    Response<WorkspaceActivityDestroyResult> response = schematicsService.destroyWorkspaceCommand(destroyWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityDestroyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, destroyWorkspaceCommandPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the destroyWorkspaceCommand operation with and without retries enabled
  @Test
  public void testDestroyWorkspaceCommandWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDestroyWorkspaceCommandWOptions();

    schematicsService.disableRetries();
    testDestroyWorkspaceCommandWOptions();
  }

  // Test the destroyWorkspaceCommand operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestroyWorkspaceCommandNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.destroyWorkspaceCommand(null).execute();
  }

  // Test the planWorkspaceCommand operation with a valid options model parameter
  @Test
  public void testPlanWorkspaceCommandWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String planWorkspaceCommandPath = "/v1/workspaces/testString/plan";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the WorkspaceActivityOptionsTemplate model
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(java.util.Arrays.asList("testString"))
      .tfVars(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the PlanWorkspaceCommandOptions model
    PlanWorkspaceCommandOptions planWorkspaceCommandOptionsModel = new PlanWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .delegatedToken("testString")
      .build();

    // Invoke planWorkspaceCommand() with a valid options model and verify the result
    Response<WorkspaceActivityPlanResult> response = schematicsService.planWorkspaceCommand(planWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityPlanResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, planWorkspaceCommandPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the planWorkspaceCommand operation with and without retries enabled
  @Test
  public void testPlanWorkspaceCommandWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testPlanWorkspaceCommandWOptions();

    schematicsService.disableRetries();
    testPlanWorkspaceCommandWOptions();
  }

  // Test the planWorkspaceCommand operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPlanWorkspaceCommandNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.planWorkspaceCommand(null).execute();
  }

  // Test the refreshWorkspaceCommand operation with a valid options model parameter
  @Test
  public void testRefreshWorkspaceCommandWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String refreshWorkspaceCommandPath = "/v1/workspaces/testString/refresh";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the RefreshWorkspaceCommandOptions model
    RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptionsModel = new RefreshWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .delegatedToken("testString")
      .build();

    // Invoke refreshWorkspaceCommand() with a valid options model and verify the result
    Response<WorkspaceActivityRefreshResult> response = schematicsService.refreshWorkspaceCommand(refreshWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityRefreshResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, refreshWorkspaceCommandPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the refreshWorkspaceCommand operation with and without retries enabled
  @Test
  public void testRefreshWorkspaceCommandWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testRefreshWorkspaceCommandWOptions();

    schematicsService.disableRetries();
    testRefreshWorkspaceCommandWOptions();
  }

  // Test the refreshWorkspaceCommand operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRefreshWorkspaceCommandNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.refreshWorkspaceCommand(null).execute();
  }

  // Test the listJobs operation with a valid options model parameter
  @Test
  public void testListJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"jobs\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"duration\": \"duration\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"status\": {\"position_in_queue\": 15, \"total_in_queue\": 12, \"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"commands\": [{\"name\": \"name\", \"outcome\": \"outcome\"}]}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"job_runner_id\": \"jobRunnerId\", \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}]}";
    String listJobsPath = "/v2/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListJobsOptions model
    ListJobsOptions listJobsOptionsModel = new ListJobsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .sort("testString")
      .profile("ids")
      .resource("workspaces")
      .resourceId("testString")
      .actionId("testString")
      .workspaceId("testString")
      .list("all")
      .build();

    // Invoke listJobs() with a valid options model and verify the result
    Response<JobList> response = schematicsService.listJobs(listJobsOptionsModel).execute();
    assertNotNull(response);
    JobList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    assertEquals(query.get("resource"), "workspaces");
    assertEquals(query.get("resource_id"), "testString");
    assertEquals(query.get("action_id"), "testString");
    assertEquals(query.get("workspace_id"), "testString");
    assertEquals(query.get("list"), "all");
  }

  // Test the listJobs operation with and without retries enabled
  @Test
  public void testListJobsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListJobsWOptions();

    schematicsService.disableRetries();
    testListJobsWOptions();
  }

  // Test the createJob operation with a valid options model parameter
  @Test
  public void testCreateJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"position_in_queue\": 15, \"total_in_queue\": 12, \"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"commands\": [{\"name\": \"name\", \"outcome\": \"outcome\"}]}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"cart_order_data\": [{\"name\": \"name\", \"value\": \"value\", \"type\": \"type\", \"usage_kind\": [\"servicetags\"]}], \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"job_runner_id\": \"jobRunnerId\", \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String createJobPath = "/v2/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("testString")
      .workspaceName("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .targetsStatusCode("none")
      .targetsStatusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(java.util.Arrays.asList(jobStatusSchematicsResourcesModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
      .positionInQueue(Double.valueOf("72.5"))
      .totalInQueue(Double.valueOf("72.5"))
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .build();

    // Construct an instance of the CartOrderData model
    CartOrderData cartOrderDataModel = new CartOrderData.Builder()
      .name("testString")
      .value("testString")
      .type("testString")
      .usageKind(java.util.Arrays.asList("servicetags"))
      .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
      .workspaceName("testString")
      .flowId("testString")
      .flowName("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .templateData(java.util.Arrays.asList(jobDataTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("testString")
      .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(java.util.Arrays.asList("testString"))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the GitSource model
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

    // Construct an instance of the CatalogSource model
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobId("testString")
      .jobStatus("job_pending")
      .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
      .commandObjectId("testString")
      .commandObjectName("testString")
      .layers("testString")
      .sourceType("local")
      .source(externalSourceModel)
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .lastJob(jobDataWorkItemLastJobModel)
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .workitems(java.util.Arrays.asList(jobDataWorkItemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .workspaceJobData(jobDataWorkspaceModel)
      .actionJobData(jobDataActionModel)
      .systemJobData(jobDataSystemModel)
      .flowJobData(jobDataFlowModel)
      .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("testString")
      .jobId("testString")
      .logUrl("testString")
      .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(java.util.Arrays.asList(jobLogSummaryWorkitemsModel))
      .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(java.util.Arrays.asList("testString"))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .build();

    // Construct an instance of the AgentInfo model
    AgentInfo agentInfoModel = new AgentInfo.Builder()
      .id("testString")
      .name("testString")
      .assignmentPolicyId("testString")
      .build();

    // Construct an instance of the CreateJobOptions model
    CreateJobOptions createJobOptionsModel = new CreateJobOptions.Builder()
      .refreshToken("testString")
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .commandParameter("testString")
      .commandOptions(java.util.Arrays.asList("testString"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .tags(java.util.Arrays.asList("testString"))
      .location("us-south")
      .status(jobStatusModel)
      .cartOrderData(java.util.Arrays.asList(cartOrderDataModel))
      .data(jobDataModel)
      .bastion(bastionResourceDefinitionModel)
      .logSummary(jobLogSummaryModel)
      .agent(agentInfoModel)
      .build();

    // Invoke createJob() with a valid options model and verify the result
    Response<Job> response = schematicsService.createJob(createJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createJob operation with and without retries enabled
  @Test
  public void testCreateJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateJobWOptions();

    schematicsService.disableRetries();
    testCreateJobWOptions();
  }

  // Test the createJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.createJob(null).execute();
  }

  // Test the getJob operation with a valid options model parameter
  @Test
  public void testGetJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"position_in_queue\": 15, \"total_in_queue\": 12, \"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"commands\": [{\"name\": \"name\", \"outcome\": \"outcome\"}]}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"cart_order_data\": [{\"name\": \"name\", \"value\": \"value\", \"type\": \"type\", \"usage_kind\": [\"servicetags\"]}], \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"job_runner_id\": \"jobRunnerId\", \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String getJobPath = "/v2/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetJobOptions model
    GetJobOptions getJobOptionsModel = new GetJobOptions.Builder()
      .jobId("testString")
      .profile("summary")
      .build();

    // Invoke getJob() with a valid options model and verify the result
    Response<Job> response = schematicsService.getJob(getJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getJob operation with and without retries enabled
  @Test
  public void testGetJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetJobWOptions();

    schematicsService.disableRetries();
    testGetJobWOptions();
  }

  // Test the getJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getJob(null).execute();
  }

  // Test the updateJob operation with a valid options model parameter
  @Test
  public void testUpdateJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"position_in_queue\": 15, \"total_in_queue\": 12, \"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"commands\": [{\"name\": \"name\", \"outcome\": \"outcome\"}]}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"cart_order_data\": [{\"name\": \"name\", \"value\": \"value\", \"type\": \"type\", \"usage_kind\": [\"servicetags\"]}], \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\", \"git_commit\": \"gitCommit\", \"git_commit_timestamp\": \"gitCommitTimestamp\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"catalog_id\": \"catalogId\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_version_flavour_name\": \"offeringVersionFlavourName\", \"offering_repo_url\": \"offeringRepoUrl\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"dry_run\": true, \"owning_account\": \"owningAccount\", \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"job_runner_id\": \"jobRunnerId\", \"agent\": {\"id\": \"id\", \"name\": \"name\", \"assignment_policy_id\": \"assignmentPolicyId\"}}";
    String updateJobPath = "/v2/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("testString")
      .workspaceName("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .targetsStatusCode("none")
      .targetsStatusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(java.util.Arrays.asList(jobStatusSchematicsResourcesModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
      .positionInQueue(Double.valueOf("72.5"))
      .totalInQueue(Double.valueOf("72.5"))
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .build();

    // Construct an instance of the CartOrderData model
    CartOrderData cartOrderDataModel = new CartOrderData.Builder()
      .name("testString")
      .value("testString")
      .type("testString")
      .usageKind(java.util.Arrays.asList("servicetags"))
      .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
      .workspaceName("testString")
      .flowId("testString")
      .flowName("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .templateData(java.util.Arrays.asList(jobDataTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("testString")
      .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(java.util.Arrays.asList("testString"))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the GitSource model
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

    // Construct an instance of the CatalogSource model
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobId("testString")
      .jobStatus("job_pending")
      .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
      .commandObjectId("testString")
      .commandObjectName("testString")
      .layers("testString")
      .sourceType("local")
      .source(externalSourceModel)
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .lastJob(jobDataWorkItemLastJobModel)
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .workitems(java.util.Arrays.asList(jobDataWorkItemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .workspaceJobData(jobDataWorkspaceModel)
      .actionJobData(jobDataActionModel)
      .systemJobData(jobDataSystemModel)
      .flowJobData(jobDataFlowModel)
      .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("testString")
      .jobId("testString")
      .logUrl("testString")
      .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(java.util.Arrays.asList(jobLogSummaryWorkitemsModel))
      .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(java.util.Arrays.asList("testString"))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .build();

    // Construct an instance of the AgentInfo model
    AgentInfo agentInfoModel = new AgentInfo.Builder()
      .id("testString")
      .name("testString")
      .assignmentPolicyId("testString")
      .build();

    // Construct an instance of the UpdateJobOptions model
    UpdateJobOptions updateJobOptionsModel = new UpdateJobOptions.Builder()
      .jobId("testString")
      .refreshToken("testString")
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .commandParameter("testString")
      .commandOptions(java.util.Arrays.asList("testString"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .tags(java.util.Arrays.asList("testString"))
      .location("us-south")
      .status(jobStatusModel)
      .cartOrderData(java.util.Arrays.asList(cartOrderDataModel))
      .data(jobDataModel)
      .bastion(bastionResourceDefinitionModel)
      .logSummary(jobLogSummaryModel)
      .agent(agentInfoModel)
      .build();

    // Invoke updateJob() with a valid options model and verify the result
    Response<Job> response = schematicsService.updateJob(updateJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateJob operation with and without retries enabled
  @Test
  public void testUpdateJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateJobWOptions();

    schematicsService.disableRetries();
    testUpdateJobWOptions();
  }

  // Test the updateJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updateJob(null).execute();
  }

  // Test the deleteJob operation with a valid options model parameter
  @Test
  public void testDeleteJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteJobPath = "/v2/jobs/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteJobOptions model
    DeleteJobOptions deleteJobOptionsModel = new DeleteJobOptions.Builder()
      .jobId("testString")
      .refreshToken("testString")
      .force(true)
      .propagate(true)
      .build();

    // Invoke deleteJob() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteJob(deleteJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteJob operation with and without retries enabled
  @Test
  public void testDeleteJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteJobWOptions();

    schematicsService.disableRetries();
    testDeleteJobWOptions();
  }

  // Test the deleteJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteJob(null).execute();
  }

  // Test the listJobLogs operation with a valid options model parameter
  @Test
  public void testListJobLogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"format\": \"json\", \"details\": \"VGhpcyBpcyBhIG1vY2sgYnl0ZSBhcnJheSB2YWx1ZS4=\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String listJobLogsPath = "/v2/jobs/testString/logs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListJobLogsOptions model
    ListJobLogsOptions listJobLogsOptionsModel = new ListJobLogsOptions.Builder()
      .jobId("testString")
      .build();

    // Invoke listJobLogs() with a valid options model and verify the result
    Response<JobLog> response = schematicsService.listJobLogs(listJobLogsOptionsModel).execute();
    assertNotNull(response);
    JobLog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobLogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listJobLogs operation with and without retries enabled
  @Test
  public void testListJobLogsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListJobLogsWOptions();

    schematicsService.disableRetries();
    testListJobLogsWOptions();
  }

  // Test the listJobLogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobLogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.listJobLogs(null).execute();
  }

  // Test the getJobFiles operation with a valid options model parameter
  @Test
  public void testGetJobFilesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"summary\": [{\"name\": \"name\", \"type\": \"number\", \"value\": \"value\"}], \"file_type\": \"state_file\", \"file_content\": \"fileContent\", \"additional_files\": [{\"file_name\": \"fileName\", \"file_content\": \"fileContent\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getJobFilesPath = "/v2/jobs/testString/files";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetJobFilesOptions model
    GetJobFilesOptions getJobFilesOptionsModel = new GetJobFilesOptions.Builder()
      .jobId("testString")
      .fileType("template_repo")
      .build();

    // Invoke getJobFiles() with a valid options model and verify the result
    Response<JobFileData> response = schematicsService.getJobFiles(getJobFilesOptionsModel).execute();
    assertNotNull(response);
    JobFileData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobFilesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("file_type"), "template_repo");
  }

  // Test the getJobFiles operation with and without retries enabled
  @Test
  public void testGetJobFilesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetJobFilesWOptions();

    schematicsService.disableRetries();
    testGetJobFilesWOptions();
  }

  // Test the getJobFiles operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobFilesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getJobFiles(null).execute();
  }

  // Test the createWorkspaceDeletionJob operation with a valid options model parameter
  @Test
  public void testCreateWorkspaceDeletionJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job\": \"job\", \"job_id\": \"jobId\"}";
    String createWorkspaceDeletionJobPath = "/v1/workspace_jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateWorkspaceDeletionJobOptions model
    CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptionsModel = new CreateWorkspaceDeletionJobOptions.Builder()
      .refreshToken("testString")
      .job("testString")
      .version("testString")
      .workspaces(java.util.Arrays.asList("testString"))
      .build();

    // Invoke createWorkspaceDeletionJob() with a valid options model and verify the result
    Response<WorkspaceBulkDeleteResponse> response = schematicsService.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptionsModel).execute();
    assertNotNull(response);
    WorkspaceBulkDeleteResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspaceDeletionJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createWorkspaceDeletionJob operation with and without retries enabled
  @Test
  public void testCreateWorkspaceDeletionJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateWorkspaceDeletionJobWOptions();

    schematicsService.disableRetries();
    testCreateWorkspaceDeletionJobWOptions();
  }

  // Test the createWorkspaceDeletionJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWorkspaceDeletionJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.createWorkspaceDeletionJob(null).execute();
  }

  // Test the getWorkspaceDeletionJobStatus operation with a valid options model parameter
  @Test
  public void testGetWorkspaceDeletionJobStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_status\": {\"failed\": [\"failed\"], \"in_progress\": [\"inProgress\"], \"success\": [\"success\"], \"last_updated_on\": \"2019-01-01T12:00:00.000Z\"}}";
    String getWorkspaceDeletionJobStatusPath = "/v1/workspace_jobs/testString/status";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkspaceDeletionJobStatusOptions model
    GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptionsModel = new GetWorkspaceDeletionJobStatusOptions.Builder()
      .wjId("testString")
      .build();

    // Invoke getWorkspaceDeletionJobStatus() with a valid options model and verify the result
    Response<WorkspaceJobResponse> response = schematicsService.getWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptionsModel).execute();
    assertNotNull(response);
    WorkspaceJobResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceDeletionJobStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWorkspaceDeletionJobStatus operation with and without retries enabled
  @Test
  public void testGetWorkspaceDeletionJobStatusWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetWorkspaceDeletionJobStatusWOptions();

    schematicsService.disableRetries();
    testGetWorkspaceDeletionJobStatusWOptions();
  }

  // Test the getWorkspaceDeletionJobStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceDeletionJobStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getWorkspaceDeletionJobStatus(null).execute();
  }

  // Test the listInventories operation with a valid options model parameter
  @Test
  public void testListInventoriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"inventories\": [{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}]}";
    String listInventoriesPath = "/v2/inventories";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInventoriesOptions model
    ListInventoriesOptions listInventoriesOptionsModel = new ListInventoriesOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .sort("testString")
      .profile("ids")
      .build();

    // Invoke listInventories() with a valid options model and verify the result
    Response<InventoryResourceRecordList> response = schematicsService.listInventories(listInventoriesOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecordList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInventoriesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
  }

  // Test the listInventories operation with and without retries enabled
  @Test
  public void testListInventoriesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListInventoriesWOptions();

    schematicsService.disableRetries();
    testListInventoriesWOptions();
  }

  // Test the createInventory operation with a valid options model parameter
  @Test
  public void testCreateInventoryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String createInventoryPath = "/v2/inventories";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInventoryOptions model
    CreateInventoryOptions createInventoryOptionsModel = new CreateInventoryOptions.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .build();

    // Invoke createInventory() with a valid options model and verify the result
    Response<InventoryResourceRecord> response = schematicsService.createInventory(createInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInventoryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInventory operation with and without retries enabled
  @Test
  public void testCreateInventoryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateInventoryWOptions();

    schematicsService.disableRetries();
    testCreateInventoryWOptions();
  }

  // Test the getInventory operation with a valid options model parameter
  @Test
  public void testGetInventoryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String getInventoryPath = "/v2/inventories/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInventoryOptions model
    GetInventoryOptions getInventoryOptionsModel = new GetInventoryOptions.Builder()
      .inventoryId("testString")
      .profile("summary")
      .build();

    // Invoke getInventory() with a valid options model and verify the result
    Response<InventoryResourceRecord> response = schematicsService.getInventory(getInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInventoryPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getInventory operation with and without retries enabled
  @Test
  public void testGetInventoryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetInventoryWOptions();

    schematicsService.disableRetries();
    testGetInventoryWOptions();
  }

  // Test the getInventory operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInventoryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getInventory(null).execute();
  }

  // Test the replaceInventory operation with a valid options model parameter
  @Test
  public void testReplaceInventoryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String replaceInventoryPath = "/v2/inventories/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceInventoryOptions model
    ReplaceInventoryOptions replaceInventoryOptionsModel = new ReplaceInventoryOptions.Builder()
      .inventoryId("testString")
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .build();

    // Invoke replaceInventory() with a valid options model and verify the result
    Response<InventoryResourceRecord> response = schematicsService.replaceInventory(replaceInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceInventoryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceInventory operation with and without retries enabled
  @Test
  public void testReplaceInventoryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testReplaceInventoryWOptions();

    schematicsService.disableRetries();
    testReplaceInventoryWOptions();
  }

  // Test the replaceInventory operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceInventoryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.replaceInventory(null).execute();
  }

  // Test the deleteInventory operation with a valid options model parameter
  @Test
  public void testDeleteInventoryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInventoryPath = "/v2/inventories/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInventoryOptions model
    DeleteInventoryOptions deleteInventoryOptionsModel = new DeleteInventoryOptions.Builder()
      .inventoryId("testString")
      .force(true)
      .propagate(true)
      .build();

    // Invoke deleteInventory() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteInventory(deleteInventoryOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInventoryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInventory operation with and without retries enabled
  @Test
  public void testDeleteInventoryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteInventoryWOptions();

    schematicsService.disableRetries();
    testDeleteInventoryWOptions();
  }

  // Test the deleteInventory operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInventoryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteInventory(null).execute();
  }

  // Test the listResourceQuery operation with a valid options model parameter
  @Test
  public void testListResourceQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"resource_queries\": [{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}]}";
    String listResourceQueryPath = "/v2/resources_query";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListResourceQueryOptions model
    ListResourceQueryOptions listResourceQueryOptionsModel = new ListResourceQueryOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .sort("testString")
      .profile("ids")
      .build();

    // Invoke listResourceQuery() with a valid options model and verify the result
    Response<ResourceQueryRecordList> response = schematicsService.listResourceQuery(listResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecordList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceQueryPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
  }

  // Test the listResourceQuery operation with and without retries enabled
  @Test
  public void testListResourceQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListResourceQueryWOptions();

    schematicsService.disableRetries();
    testListResourceQueryWOptions();
  }

  // Test the createResourceQuery operation with a valid options model parameter
  @Test
  public void testCreateResourceQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String createResourceQueryPath = "/v2/resources_query";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourceQueryParam model
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
      .name("testString")
      .value("testString")
      .description("testString")
      .build();

    // Construct an instance of the ResourceQuery model
    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
      .queryType("workspaces")
      .queryCondition(java.util.Arrays.asList(resourceQueryParamModel))
      .querySelect(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CreateResourceQueryOptions model
    CreateResourceQueryOptions createResourceQueryOptionsModel = new CreateResourceQueryOptions.Builder()
      .type("vsi")
      .name("testString")
      .queries(java.util.Arrays.asList(resourceQueryModel))
      .build();

    // Invoke createResourceQuery() with a valid options model and verify the result
    Response<ResourceQueryRecord> response = schematicsService.createResourceQuery(createResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createResourceQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createResourceQuery operation with and without retries enabled
  @Test
  public void testCreateResourceQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateResourceQueryWOptions();

    schematicsService.disableRetries();
    testCreateResourceQueryWOptions();
  }

  // Test the getResourcesQuery operation with a valid options model parameter
  @Test
  public void testGetResourcesQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String getResourcesQueryPath = "/v2/resources_query/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetResourcesQueryOptions model
    GetResourcesQueryOptions getResourcesQueryOptionsModel = new GetResourcesQueryOptions.Builder()
      .queryId("testString")
      .build();

    // Invoke getResourcesQuery() with a valid options model and verify the result
    Response<ResourceQueryRecord> response = schematicsService.getResourcesQuery(getResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getResourcesQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getResourcesQuery operation with and without retries enabled
  @Test
  public void testGetResourcesQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetResourcesQueryWOptions();

    schematicsService.disableRetries();
    testGetResourcesQueryWOptions();
  }

  // Test the getResourcesQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetResourcesQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getResourcesQuery(null).execute();
  }

  // Test the replaceResourcesQuery operation with a valid options model parameter
  @Test
  public void testReplaceResourcesQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String replaceResourcesQueryPath = "/v2/resources_query/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourceQueryParam model
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
      .name("testString")
      .value("testString")
      .description("testString")
      .build();

    // Construct an instance of the ResourceQuery model
    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
      .queryType("workspaces")
      .queryCondition(java.util.Arrays.asList(resourceQueryParamModel))
      .querySelect(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ReplaceResourcesQueryOptions model
    ReplaceResourcesQueryOptions replaceResourcesQueryOptionsModel = new ReplaceResourcesQueryOptions.Builder()
      .queryId("testString")
      .type("vsi")
      .name("testString")
      .queries(java.util.Arrays.asList(resourceQueryModel))
      .build();

    // Invoke replaceResourcesQuery() with a valid options model and verify the result
    Response<ResourceQueryRecord> response = schematicsService.replaceResourcesQuery(replaceResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceResourcesQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceResourcesQuery operation with and without retries enabled
  @Test
  public void testReplaceResourcesQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testReplaceResourcesQueryWOptions();

    schematicsService.disableRetries();
    testReplaceResourcesQueryWOptions();
  }

  // Test the replaceResourcesQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceResourcesQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.replaceResourcesQuery(null).execute();
  }

  // Test the executeResourceQuery operation with a valid options model parameter
  @Test
  public void testExecuteResourceQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"], \"query_output\": [{\"name\": \"name\", \"value\": \"value\"}]}]}";
    String executeResourceQueryPath = "/v2/resources_query/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ExecuteResourceQueryOptions model
    ExecuteResourceQueryOptions executeResourceQueryOptionsModel = new ExecuteResourceQueryOptions.Builder()
      .queryId("testString")
      .build();

    // Invoke executeResourceQuery() with a valid options model and verify the result
    Response<ResourceQueryResponseRecord> response = schematicsService.executeResourceQuery(executeResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryResponseRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, executeResourceQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the executeResourceQuery operation with and without retries enabled
  @Test
  public void testExecuteResourceQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testExecuteResourceQueryWOptions();

    schematicsService.disableRetries();
    testExecuteResourceQueryWOptions();
  }

  // Test the executeResourceQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExecuteResourceQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.executeResourceQuery(null).execute();
  }

  // Test the deleteResourcesQuery operation with a valid options model parameter
  @Test
  public void testDeleteResourcesQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteResourcesQueryPath = "/v2/resources_query/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteResourcesQueryOptions model
    DeleteResourcesQueryOptions deleteResourcesQueryOptionsModel = new DeleteResourcesQueryOptions.Builder()
      .queryId("testString")
      .force(true)
      .propagate(true)
      .build();

    // Invoke deleteResourcesQuery() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteResourcesQuery(deleteResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteResourcesQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteResourcesQuery operation with and without retries enabled
  @Test
  public void testDeleteResourcesQueryWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteResourcesQueryWOptions();

    schematicsService.disableRetries();
    testDeleteResourcesQueryWOptions();
  }

  // Test the deleteResourcesQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteResourcesQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteResourcesQuery(null).execute();
  }

  // Test the listAgent operation with a valid options model parameter
  @Test
  public void testListAgentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"agents\": [{\"name\": \"MyDevAgent\", \"description\": \"Register agent\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"agent_location\": \"us-south\", \"location\": \"us-south\", \"profile_id\": \"profileId\", \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"registered_by\": \"registeredBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"connection_state\": {\"state\": \"Connected\", \"checked_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_state\": {\"state\": \"error\", \"message\": \"message\"}}]}";
    String listAgentPath = "/v2/settings/agents";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAgentOptions model
    ListAgentOptions listAgentOptionsModel = new ListAgentOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .profile("summary")
      .filter("all")
      .build();

    // Invoke listAgent() with a valid options model and verify the result
    Response<AgentList> response = schematicsService.listAgent(listAgentOptionsModel).execute();
    assertNotNull(response);
    AgentList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAgentPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("profile"), "summary");
    assertEquals(query.get("filter"), "all");
  }

  // Test the listAgent operation with and without retries enabled
  @Test
  public void testListAgentWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListAgentWOptions();

    schematicsService.disableRetries();
    testListAgentWOptions();
  }

  // Test the registerAgent operation with a valid options model parameter
  @Test
  public void testRegisterAgentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Register agent\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"agent_location\": \"us-south\", \"location\": \"us-south\", \"profile_id\": \"profileId\", \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"registered_by\": \"registeredBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"connection_state\": {\"state\": \"Connected\", \"checked_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_state\": {\"state\": \"error\", \"message\": \"message\"}}";
    String registerAgentPath = "/v2/settings/agents";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AgentUserState model
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();

    // Construct an instance of the RegisterAgentOptions model
    RegisterAgentOptions registerAgentOptionsModel = new RegisterAgentOptions.Builder()
      .name("MyDevAgent")
      .agentLocation("us-south")
      .location("us-south")
      .profileId("testString")
      .description("Register agent")
      .resourceGroup("testString")
      .tags(java.util.Arrays.asList("testString"))
      .userState(agentUserStateModel)
      .build();

    // Invoke registerAgent() with a valid options model and verify the result
    Response<Agent> response = schematicsService.registerAgent(registerAgentOptionsModel).execute();
    assertNotNull(response);
    Agent responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, registerAgentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the registerAgent operation with and without retries enabled
  @Test
  public void testRegisterAgentWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testRegisterAgentWOptions();

    schematicsService.disableRetries();
    testRegisterAgentWOptions();
  }

  // Test the registerAgent operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterAgentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.registerAgent(null).execute();
  }

  // Test the getAgent operation with a valid options model parameter
  @Test
  public void testGetAgentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Register agent\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"agent_location\": \"us-south\", \"location\": \"us-south\", \"profile_id\": \"profileId\", \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"registered_by\": \"registeredBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"connection_state\": {\"state\": \"Connected\", \"checked_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_state\": {\"state\": \"error\", \"message\": \"message\"}}";
    String getAgentPath = "/v2/settings/agents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAgentOptions model
    GetAgentOptions getAgentOptionsModel = new GetAgentOptions.Builder()
      .agentId("testString")
      .profile("summary")
      .build();

    // Invoke getAgent() with a valid options model and verify the result
    Response<Agent> response = schematicsService.getAgent(getAgentOptionsModel).execute();
    assertNotNull(response);
    Agent responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAgentPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getAgent operation with and without retries enabled
  @Test
  public void testGetAgentWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetAgentWOptions();

    schematicsService.disableRetries();
    testGetAgentWOptions();
  }

  // Test the getAgent operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAgentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getAgent(null).execute();
  }

  // Test the deleteAgent operation with a valid options model parameter
  @Test
  public void testDeleteAgentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAgentPath = "/v2/settings/agents/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAgentOptions model
    DeleteAgentOptions deleteAgentOptionsModel = new DeleteAgentOptions.Builder()
      .agentId("testString")
      .build();

    // Invoke deleteAgent() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteAgent(deleteAgentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAgentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAgent operation with and without retries enabled
  @Test
  public void testDeleteAgentWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteAgentWOptions();

    schematicsService.disableRetries();
    testDeleteAgentWOptions();
  }

  // Test the deleteAgent operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAgentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteAgent(null).execute();
  }

  // Test the updateAgentRegistration operation with a valid options model parameter
  @Test
  public void testUpdateAgentRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Register agent\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"agent_location\": \"us-south\", \"location\": \"us-south\", \"profile_id\": \"profileId\", \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"registered_by\": \"registeredBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"connection_state\": {\"state\": \"Connected\", \"checked_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_state\": {\"state\": \"error\", \"message\": \"message\"}}";
    String updateAgentRegistrationPath = "/v2/settings/agents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AgentUserState model
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();

    // Construct an instance of the UpdateAgentRegistrationOptions model
    UpdateAgentRegistrationOptions updateAgentRegistrationOptionsModel = new UpdateAgentRegistrationOptions.Builder()
      .agentId("testString")
      .name("MyDevAgent")
      .agentLocation("us-south")
      .location("us-south")
      .profileId("testString")
      .description("Register agent")
      .resourceGroup("testString")
      .tags(java.util.Arrays.asList("testString"))
      .userState(agentUserStateModel)
      .build();

    // Invoke updateAgentRegistration() with a valid options model and verify the result
    Response<Agent> response = schematicsService.updateAgentRegistration(updateAgentRegistrationOptionsModel).execute();
    assertNotNull(response);
    Agent responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAgentRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAgentRegistration operation with and without retries enabled
  @Test
  public void testUpdateAgentRegistrationWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateAgentRegistrationWOptions();

    schematicsService.disableRetries();
    testUpdateAgentRegistrationWOptions();
  }

  // Test the updateAgentRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAgentRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updateAgentRegistration(null).execute();
  }

  // Test the listAgentData operation with a valid options model parameter
  @Test
  public void testListAgentDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"agents\": [{\"name\": \"MyDevAgent\", \"description\": \"Register agent\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"version\": \"v1.0.0\", \"schematics_location\": \"us-south\", \"agent_location\": \"us-south\", \"agent_metadata\": [{\"name\": \"purpose\", \"value\": [\"value\"]}], \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"creation_by\": \"creationBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"system_state\": {\"status_code\": \"error\", \"status_message\": \"statusMessage\"}, \"agent_kpi\": {\"availability_indicator\": \"available\", \"lifecycle_indicator\": \"consistent\", \"percent_usage_indicator\": \"percentUsageIndicator\"}}]}";
    String listAgentDataPath = "/v2/agents";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAgentDataOptions model
    ListAgentDataOptions listAgentDataOptionsModel = new ListAgentDataOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .profile("summary")
      .filter("all")
      .build();

    // Invoke listAgentData() with a valid options model and verify the result
    Response<AgentDataList> response = schematicsService.listAgentData(listAgentDataOptionsModel).execute();
    assertNotNull(response);
    AgentDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAgentDataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("profile"), "summary");
    assertEquals(query.get("filter"), "all");
  }

  // Test the listAgentData operation with and without retries enabled
  @Test
  public void testListAgentDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListAgentDataWOptions();

    schematicsService.disableRetries();
    testListAgentDataWOptions();
  }

  // Test the createAgentData operation with a valid options model parameter
  @Test
  public void testCreateAgentDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Create Agent\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"version\": \"v1.0.0\", \"schematics_location\": \"us-south\", \"agent_location\": \"us-south\", \"agent_infrastructure\": {\"infra_type\": \"ibm_kubernetes\", \"cluster_id\": \"clusterId\", \"cluster_resource_group\": \"clusterResourceGroup\", \"cos_instance_name\": \"cosInstanceName\", \"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_region\": \"cosBucketRegion\"}, \"agent_metadata\": [{\"name\": \"purpose\", \"value\": [\"value\"]}], \"agent_inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"creation_by\": \"creationBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"system_state\": {\"status_code\": \"error\", \"status_message\": \"statusMessage\"}, \"agent_kpi\": {\"availability_indicator\": \"available\", \"lifecycle_indicator\": \"consistent\", \"percent_usage_indicator\": \"percentUsageIndicator\", \"application_indicators\": [\"anyValue\"], \"infra_indicators\": [\"anyValue\"]}, \"recent_prs_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_deploy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"is_redeployed\": false, \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_health_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_destroy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}}";
    String createAgentDataPath = "/v2/agents";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AgentInfrastructure model
    AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
      .infraType("ibm_kubernetes")
      .clusterId("testString")
      .clusterResourceGroup("testString")
      .cosInstanceName("testString")
      .cosBucketName("testString")
      .cosBucketRegion("testString")
      .build();

    // Construct an instance of the AgentMetadataInfo model
    AgentMetadataInfo agentMetadataInfoModel = new AgentMetadataInfo.Builder()
      .name("purpose")
      .value(java.util.Arrays.asList("git", "terraform", "ansible"))
      .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the AgentUserState model
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();

    // Construct an instance of the AgentKPIData model
    AgentKPIData agentKpiDataModel = new AgentKPIData.Builder()
      .availabilityIndicator("available")
      .lifecycleIndicator("consistent")
      .percentUsageIndicator("testString")
      .applicationIndicators(java.util.Arrays.asList("testString"))
      .infraIndicators(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CreateAgentDataOptions model
    CreateAgentDataOptions createAgentDataOptionsModel = new CreateAgentDataOptions.Builder()
      .name("MyDevAgent")
      .resourceGroup("Default")
      .version("v1.0.0")
      .schematicsLocation("us-south")
      .agentLocation("us-south")
      .agentInfrastructure(agentInfrastructureModel)
      .description("Create Agent")
      .tags(java.util.Arrays.asList("testString"))
      .agentMetadata(java.util.Arrays.asList(agentMetadataInfoModel))
      .agentInputs(java.util.Arrays.asList(variableDataModel))
      .userState(agentUserStateModel)
      .agentKpi(agentKpiDataModel)
      .build();

    // Invoke createAgentData() with a valid options model and verify the result
    Response<AgentData> response = schematicsService.createAgentData(createAgentDataOptionsModel).execute();
    assertNotNull(response);
    AgentData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAgentDataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createAgentData operation with and without retries enabled
  @Test
  public void testCreateAgentDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreateAgentDataWOptions();

    schematicsService.disableRetries();
    testCreateAgentDataWOptions();
  }

  // Test the createAgentData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAgentDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.createAgentData(null).execute();
  }

  // Test the getAgentData operation with a valid options model parameter
  @Test
  public void testGetAgentDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Create Agent\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"version\": \"v1.0.0\", \"schematics_location\": \"us-south\", \"agent_location\": \"us-south\", \"agent_infrastructure\": {\"infra_type\": \"ibm_kubernetes\", \"cluster_id\": \"clusterId\", \"cluster_resource_group\": \"clusterResourceGroup\", \"cos_instance_name\": \"cosInstanceName\", \"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_region\": \"cosBucketRegion\"}, \"agent_metadata\": [{\"name\": \"purpose\", \"value\": [\"value\"]}], \"agent_inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"creation_by\": \"creationBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"system_state\": {\"status_code\": \"error\", \"status_message\": \"statusMessage\"}, \"agent_kpi\": {\"availability_indicator\": \"available\", \"lifecycle_indicator\": \"consistent\", \"percent_usage_indicator\": \"percentUsageIndicator\", \"application_indicators\": [\"anyValue\"], \"infra_indicators\": [\"anyValue\"]}, \"recent_prs_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_deploy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"is_redeployed\": false, \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_health_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_destroy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}}";
    String getAgentDataPath = "/v2/agents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAgentDataOptions model
    GetAgentDataOptions getAgentDataOptionsModel = new GetAgentDataOptions.Builder()
      .agentId("testString")
      .profile("summary")
      .build();

    // Invoke getAgentData() with a valid options model and verify the result
    Response<AgentData> response = schematicsService.getAgentData(getAgentDataOptionsModel).execute();
    assertNotNull(response);
    AgentData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAgentDataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getAgentData operation with and without retries enabled
  @Test
  public void testGetAgentDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetAgentDataWOptions();

    schematicsService.disableRetries();
    testGetAgentDataWOptions();
  }

  // Test the getAgentData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAgentDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getAgentData(null).execute();
  }

  // Test the updateAgentData operation with a valid options model parameter
  @Test
  public void testUpdateAgentDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"MyDevAgent\", \"description\": \"Create Agent\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"version\": \"v1.0.0\", \"schematics_location\": \"us-south\", \"agent_location\": \"us-south\", \"agent_infrastructure\": {\"infra_type\": \"ibm_kubernetes\", \"cluster_id\": \"clusterId\", \"cluster_resource_group\": \"clusterResourceGroup\", \"cos_instance_name\": \"cosInstanceName\", \"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_region\": \"cosBucketRegion\"}, \"agent_metadata\": [{\"name\": \"purpose\", \"value\": [\"value\"]}], \"agent_inputs\": [{\"name\": \"name\", \"value\": \"value\", \"use_default\": true, \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"cloud_data_type\": \"cloudDataType\", \"default_value\": \"defaultValue\", \"link_status\": \"normal\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"required\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"enable\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"agent_crn\": \"agentCrn\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"creation_by\": \"creationBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"system_state\": {\"status_code\": \"error\", \"status_message\": \"statusMessage\"}, \"agent_kpi\": {\"availability_indicator\": \"available\", \"lifecycle_indicator\": \"consistent\", \"percent_usage_indicator\": \"percentUsageIndicator\", \"application_indicators\": [\"anyValue\"], \"infra_indicators\": [\"anyValue\"]}, \"recent_prs_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_deploy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"is_redeployed\": false, \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_health_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}, \"recent_destroy_job\": {\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}}";
    String updateAgentDataPath = "/v2/agents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AgentInfrastructure model
    AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
      .infraType("ibm_kubernetes")
      .clusterId("testString")
      .clusterResourceGroup("testString")
      .cosInstanceName("testString")
      .cosBucketName("testString")
      .cosBucketRegion("testString")
      .build();

    // Construct an instance of the AgentMetadataInfo model
    AgentMetadataInfo agentMetadataInfoModel = new AgentMetadataInfo.Builder()
      .name("purpose")
      .value(java.util.Arrays.asList("git", "terraform", "ansible"))
      .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();

    // Construct an instance of the AgentUserState model
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();

    // Construct an instance of the AgentKPIData model
    AgentKPIData agentKpiDataModel = new AgentKPIData.Builder()
      .availabilityIndicator("available")
      .lifecycleIndicator("consistent")
      .percentUsageIndicator("testString")
      .applicationIndicators(java.util.Arrays.asList("testString"))
      .infraIndicators(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the UpdateAgentDataOptions model
    UpdateAgentDataOptions updateAgentDataOptionsModel = new UpdateAgentDataOptions.Builder()
      .agentId("testString")
      .name("MyDevAgent")
      .resourceGroup("Default")
      .version("v1.0.0")
      .schematicsLocation("us-south")
      .agentLocation("us-south")
      .agentInfrastructure(agentInfrastructureModel)
      .description("Create Agent")
      .tags(java.util.Arrays.asList("testString"))
      .agentMetadata(java.util.Arrays.asList(agentMetadataInfoModel))
      .agentInputs(java.util.Arrays.asList(variableDataModel))
      .userState(agentUserStateModel)
      .agentKpi(agentKpiDataModel)
      .refreshToken("testString")
      .build();

    // Invoke updateAgentData() with a valid options model and verify the result
    Response<AgentData> response = schematicsService.updateAgentData(updateAgentDataOptionsModel).execute();
    assertNotNull(response);
    AgentData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAgentDataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAgentData operation with and without retries enabled
  @Test
  public void testUpdateAgentDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateAgentDataWOptions();

    schematicsService.disableRetries();
    testUpdateAgentDataWOptions();
  }

  // Test the updateAgentData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAgentDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updateAgentData(null).execute();
  }

  // Test the deleteAgentData operation with a valid options model parameter
  @Test
  public void testDeleteAgentDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAgentDataPath = "/v2/agents/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAgentDataOptions model
    DeleteAgentDataOptions deleteAgentDataOptionsModel = new DeleteAgentDataOptions.Builder()
      .agentId("testString")
      .build();

    // Invoke deleteAgentData() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteAgentData(deleteAgentDataOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAgentDataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAgentData operation with and without retries enabled
  @Test
  public void testDeleteAgentDataWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteAgentDataWOptions();

    schematicsService.disableRetries();
    testDeleteAgentDataWOptions();
  }

  // Test the deleteAgentData operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAgentDataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteAgentData(null).execute();
  }

  // Test the getAgentVersions operation with a valid options model parameter
  @Test
  public void testGetAgentVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"supported_agent_versions\": [{\"display_name\": \"displayName\", \"agent_version\": \"agentVersion\"}]}";
    String getAgentVersionsPath = "/v2/agents/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAgentVersionsOptions model
    GetAgentVersionsOptions getAgentVersionsOptionsModel = new GetAgentVersionsOptions();

    // Invoke getAgentVersions() with a valid options model and verify the result
    Response<AgentVersions> response = schematicsService.getAgentVersions(getAgentVersionsOptionsModel).execute();
    assertNotNull(response);
    AgentVersions responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAgentVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAgentVersions operation with and without retries enabled
  @Test
  public void testGetAgentVersionsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetAgentVersionsWOptions();

    schematicsService.disableRetries();
    testGetAgentVersionsWOptions();
  }

  // Test the getPrsAgentJob operation with a valid options model parameter
  @Test
  public void testGetPrsAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String getPrsAgentJobPath = "/v2/agents/testString/prs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrsAgentJobOptions model
    GetPrsAgentJobOptions getPrsAgentJobOptionsModel = new GetPrsAgentJobOptions.Builder()
      .agentId("testString")
      .build();

    // Invoke getPrsAgentJob() with a valid options model and verify the result
    Response<AgentPRSJob> response = schematicsService.getPrsAgentJob(getPrsAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentPRSJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrsAgentJobPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrsAgentJob operation with and without retries enabled
  @Test
  public void testGetPrsAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetPrsAgentJobWOptions();

    schematicsService.disableRetries();
    testGetPrsAgentJobWOptions();
  }

  // Test the getPrsAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrsAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getPrsAgentJob(null).execute();
  }

  // Test the prsAgentJob operation with a valid options model parameter
  @Test
  public void testPrsAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String prsAgentJobPath = "/v2/agents/testString/prs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the PrsAgentJobOptions model
    PrsAgentJobOptions prsAgentJobOptionsModel = new PrsAgentJobOptions.Builder()
      .agentId("testString")
      .force(true)
      .build();

    // Invoke prsAgentJob() with a valid options model and verify the result
    Response<AgentPRSJob> response = schematicsService.prsAgentJob(prsAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentPRSJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, prsAgentJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("force")), Boolean.valueOf(true));
  }

  // Test the prsAgentJob operation with and without retries enabled
  @Test
  public void testPrsAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testPrsAgentJobWOptions();

    schematicsService.disableRetries();
    testPrsAgentJobWOptions();
  }

  // Test the prsAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrsAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.prsAgentJob(null).execute();
  }

  // Test the getHealthCheckAgentJob operation with a valid options model parameter
  @Test
  public void testGetHealthCheckAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String getHealthCheckAgentJobPath = "/v2/agents/testString/health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHealthCheckAgentJobOptions model
    GetHealthCheckAgentJobOptions getHealthCheckAgentJobOptionsModel = new GetHealthCheckAgentJobOptions.Builder()
      .agentId("testString")
      .build();

    // Invoke getHealthCheckAgentJob() with a valid options model and verify the result
    Response<AgentHealthJob> response = schematicsService.getHealthCheckAgentJob(getHealthCheckAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentHealthJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHealthCheckAgentJobPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHealthCheckAgentJob operation with and without retries enabled
  @Test
  public void testGetHealthCheckAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetHealthCheckAgentJobWOptions();

    schematicsService.disableRetries();
    testGetHealthCheckAgentJobWOptions();
  }

  // Test the getHealthCheckAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHealthCheckAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getHealthCheckAgentJob(null).execute();
  }

  // Test the healthCheckAgentJob operation with a valid options model parameter
  @Test
  public void testHealthCheckAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String healthCheckAgentJobPath = "/v2/agents/testString/health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the HealthCheckAgentJobOptions model
    HealthCheckAgentJobOptions healthCheckAgentJobOptionsModel = new HealthCheckAgentJobOptions.Builder()
      .agentId("testString")
      .force(true)
      .build();

    // Invoke healthCheckAgentJob() with a valid options model and verify the result
    Response<AgentHealthJob> response = schematicsService.healthCheckAgentJob(healthCheckAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentHealthJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, healthCheckAgentJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("force")), Boolean.valueOf(true));
  }

  // Test the healthCheckAgentJob operation with and without retries enabled
  @Test
  public void testHealthCheckAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testHealthCheckAgentJobWOptions();

    schematicsService.disableRetries();
    testHealthCheckAgentJobWOptions();
  }

  // Test the healthCheckAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHealthCheckAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.healthCheckAgentJob(null).execute();
  }

  // Test the getDeployAgentJob operation with a valid options model parameter
  @Test
  public void testGetDeployAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"is_redeployed\": false, \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String getDeployAgentJobPath = "/v2/agents/testString/deploy";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDeployAgentJobOptions model
    GetDeployAgentJobOptions getDeployAgentJobOptionsModel = new GetDeployAgentJobOptions.Builder()
      .agentId("testString")
      .build();

    // Invoke getDeployAgentJob() with a valid options model and verify the result
    Response<AgentDeployJob> response = schematicsService.getDeployAgentJob(getDeployAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentDeployJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDeployAgentJobPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDeployAgentJob operation with and without retries enabled
  @Test
  public void testGetDeployAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetDeployAgentJobWOptions();

    schematicsService.disableRetries();
    testGetDeployAgentJobWOptions();
  }

  // Test the getDeployAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDeployAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getDeployAgentJob(null).execute();
  }

  // Test the deployAgentJob operation with a valid options model parameter
  @Test
  public void testDeployAgentJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"agent_id\": \"agentId\", \"job_id\": \"jobId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"is_redeployed\": false, \"agent_version\": \"v1.0.0\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"log_url\": \"logUrl\"}";
    String deployAgentJobPath = "/v2/agents/testString/deploy";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeployAgentJobOptions model
    DeployAgentJobOptions deployAgentJobOptionsModel = new DeployAgentJobOptions.Builder()
      .agentId("testString")
      .force(true)
      .build();

    // Invoke deployAgentJob() with a valid options model and verify the result
    Response<AgentDeployJob> response = schematicsService.deployAgentJob(deployAgentJobOptionsModel).execute();
    assertNotNull(response);
    AgentDeployJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deployAgentJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("force")), Boolean.valueOf(true));
  }

  // Test the deployAgentJob operation with and without retries enabled
  @Test
  public void testDeployAgentJobWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeployAgentJobWOptions();

    schematicsService.disableRetries();
    testDeployAgentJobWOptions();
  }

  // Test the deployAgentJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeployAgentJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deployAgentJob(null).execute();
  }

  // Test the deleteAgentResources operation with a valid options model parameter
  @Test
  public void testDeleteAgentResourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAgentResourcesPath = "/v2/agents/testString/resources";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAgentResourcesOptions model
    DeleteAgentResourcesOptions deleteAgentResourcesOptionsModel = new DeleteAgentResourcesOptions.Builder()
      .agentId("testString")
      .refreshToken("testString")
      .build();

    // Invoke deleteAgentResources() with a valid options model and verify the result
    Response<Void> response = schematicsService.deleteAgentResources(deleteAgentResourcesOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAgentResourcesPath);
    // Verify header parameters
    assertEquals(request.getHeader("Refresh_token"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteAgentResources operation with and without retries enabled
  @Test
  public void testDeleteAgentResourcesWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeleteAgentResourcesWOptions();

    schematicsService.disableRetries();
    testDeleteAgentResourcesWOptions();
  }

  // Test the deleteAgentResources operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAgentResourcesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deleteAgentResources(null).execute();
  }

  // Test the getKmsSettings operation with a valid options model parameter
  @Test
  public void testGetKmsSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String getKmsSettingsPath = "/v2/settings/kms";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetKmsSettingsOptions model
    GetKmsSettingsOptions getKmsSettingsOptionsModel = new GetKmsSettingsOptions.Builder()
      .location("testString")
      .build();

    // Invoke getKmsSettings() with a valid options model and verify the result
    Response<KMSSettings> response = schematicsService.getKmsSettings(getKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getKmsSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("location"), "testString");
  }

  // Test the getKmsSettings operation with and without retries enabled
  @Test
  public void testGetKmsSettingsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetKmsSettingsWOptions();

    schematicsService.disableRetries();
    testGetKmsSettingsWOptions();
  }

  // Test the getKmsSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetKmsSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getKmsSettings(null).execute();
  }

  // Test the updateKmsSettings operation with a valid options model parameter
  @Test
  public void testUpdateKmsSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String updateKmsSettingsPath = "/v2/settings/kms";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the KMSSettingsPrimaryCrk model
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();

    // Construct an instance of the KMSSettingsSecondaryCrk model
    KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();

    // Construct an instance of the UpdateKmsSettingsOptions model
    UpdateKmsSettingsOptions updateKmsSettingsOptionsModel = new UpdateKmsSettingsOptions.Builder()
      .location("testString")
      .encryptionScheme("testString")
      .resourceGroup("testString")
      .primaryCrk(kmsSettingsPrimaryCrkModel)
      .secondaryCrk(kmsSettingsSecondaryCrkModel)
      .build();

    // Invoke updateKmsSettings() with a valid options model and verify the result
    Response<KMSSettings> response = schematicsService.updateKmsSettings(updateKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateKmsSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateKmsSettings operation with and without retries enabled
  @Test
  public void testUpdateKmsSettingsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdateKmsSettingsWOptions();

    schematicsService.disableRetries();
    testUpdateKmsSettingsWOptions();
  }

  // Test the listKms operation with a valid options model parameter
  @Test
  public void testListKmsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"kms_instances\": [{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"kms_crn\": \"kmsCrn\", \"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"kms_public_endpoint\": \"kmsPublicEndpoint\", \"keys\": [{\"name\": \"name\", \"crn\": \"crn\", \"error\": \"error\"}]}]}";
    String listKmsPath = "/v2/settings/kms_instances";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListKmsOptions model
    ListKmsOptions listKmsOptionsModel = new ListKmsOptions.Builder()
      .encryptionScheme("testString")
      .location("testString")
      .resourceGroup("testString")
      .limit(Long.valueOf("100"))
      .sort("testString")
      .build();

    // Invoke listKms() with a valid options model and verify the result
    Response<KMSDiscovery> response = schematicsService.listKms(listKmsOptionsModel).execute();
    assertNotNull(response);
    KMSDiscovery responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listKmsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("encryption_scheme"), "testString");
    assertEquals(query.get("location"), "testString");
    assertEquals(query.get("resource_group"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("sort"), "testString");
  }

  // Test the listKms operation with and without retries enabled
  @Test
  public void testListKmsWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListKmsWOptions();

    schematicsService.disableRetries();
    testListKmsWOptions();
  }

  // Test the listKms operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListKmsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.listKms(null).execute();
  }

  // Test the listPolicy operation with a valid options model parameter
  @Test
  public void testListPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"policies\": [{\"name\": \"Agent1-DevWS\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"description\": \"Policy for job execution of secured workspaces on agent1\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"policy_kind\": \"agent_assignment_policy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listPolicyPath = "/v2/settings/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPolicyOptions model
    ListPolicyOptions listPolicyOptionsModel = new ListPolicyOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .profile("summary")
      .build();

    // Invoke listPolicy() with a valid options model and verify the result
    Response<PolicyList> response = schematicsService.listPolicy(listPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPolicyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("100"));
    assertEquals(query.get("profile"), "summary");
  }

  // Test the listPolicy operation with and without retries enabled
  @Test
  public void testListPolicyWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testListPolicyWOptions();

    schematicsService.disableRetries();
    testListPolicyWOptions();
  }

  // Test the createPolicy operation with a valid options model parameter
  @Test
  public void testCreatePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Agent1-DevWS\", \"description\": \"Policy for job execution of secured workspaces on agent1\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"kind\": \"agent_assignment_policy\", \"target\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}, \"parameter\": {\"agent_assignment_policy_parameter\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}}, \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"scoped_resources\": [{\"kind\": \"workspace\", \"id\": \"id\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createPolicyPath = "/v2/settings/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the PolicyObjectSelector model
    PolicyObjectSelector policyObjectSelectorModel = new PolicyObjectSelector.Builder()
      .kind("workspace")
      .tags(java.util.Arrays.asList("testString"))
      .resourceGroups(java.util.Arrays.asList("testString"))
      .locations(java.util.Arrays.asList("us-south"))
      .build();

    // Construct an instance of the PolicyObjects model
    PolicyObjects policyObjectsModel = new PolicyObjects.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();

    // Construct an instance of the AgentAssignmentPolicyParameter model
    AgentAssignmentPolicyParameter agentAssignmentPolicyParameterModel = new AgentAssignmentPolicyParameter.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();

    // Construct an instance of the PolicyParameter model
    PolicyParameter policyParameterModel = new PolicyParameter.Builder()
      .agentAssignmentPolicyParameter(agentAssignmentPolicyParameterModel)
      .build();

    // Construct an instance of the ScopedResource model
    ScopedResource scopedResourceModel = new ScopedResource.Builder()
      .kind("workspace")
      .id("testString")
      .build();

    // Construct an instance of the CreatePolicyOptions model
    CreatePolicyOptions createPolicyOptionsModel = new CreatePolicyOptions.Builder()
      .name("Agent1-DevWS")
      .description("Policy for job execution of secured workspaces on agent1")
      .resourceGroup("Default")
      .tags(java.util.Arrays.asList("policy:secured-job"))
      .location("us-south")
      .state(userStateModel)
      .kind("agent_assignment_policy")
      .target(policyObjectsModel)
      .parameter(policyParameterModel)
      .scopedResources(java.util.Arrays.asList(scopedResourceModel))
      .build();

    // Invoke createPolicy() with a valid options model and verify the result
    Response<Policy> response = schematicsService.createPolicy(createPolicyOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPolicy operation with and without retries enabled
  @Test
  public void testCreatePolicyWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testCreatePolicyWOptions();

    schematicsService.disableRetries();
    testCreatePolicyWOptions();
  }

  // Test the getPolicy operation with a valid options model parameter
  @Test
  public void testGetPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Agent1-DevWS\", \"description\": \"Policy for job execution of secured workspaces on agent1\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"kind\": \"agent_assignment_policy\", \"target\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}, \"parameter\": {\"agent_assignment_policy_parameter\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}}, \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"scoped_resources\": [{\"kind\": \"workspace\", \"id\": \"id\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getPolicyPath = "/v2/settings/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyOptions model
    GetPolicyOptions getPolicyOptionsModel = new GetPolicyOptions.Builder()
      .policyId("testString")
      .profile("summary")
      .build();

    // Invoke getPolicy() with a valid options model and verify the result
    Response<Policy> response = schematicsService.getPolicy(getPolicyOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("profile"), "summary");
  }

  // Test the getPolicy operation with and without retries enabled
  @Test
  public void testGetPolicyWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testGetPolicyWOptions();

    schematicsService.disableRetries();
    testGetPolicyWOptions();
  }

  // Test the getPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.getPolicy(null).execute();
  }

  // Test the deletePolicy operation with a valid options model parameter
  @Test
  public void testDeletePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePolicyPath = "/v2/settings/policies/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePolicyOptions model
    DeletePolicyOptions deletePolicyOptionsModel = new DeletePolicyOptions.Builder()
      .policyId("testString")
      .build();

    // Invoke deletePolicy() with a valid options model and verify the result
    Response<Void> response = schematicsService.deletePolicy(deletePolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePolicy operation with and without retries enabled
  @Test
  public void testDeletePolicyWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testDeletePolicyWOptions();

    schematicsService.disableRetries();
    testDeletePolicyWOptions();
  }

  // Test the deletePolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.deletePolicy(null).execute();
  }

  // Test the updatePolicy operation with a valid options model parameter
  @Test
  public void testUpdatePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Agent1-DevWS\", \"description\": \"Policy for job execution of secured workspaces on agent1\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"kind\": \"agent_assignment_policy\", \"target\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}, \"parameter\": {\"agent_assignment_policy_parameter\": {\"selector_kind\": \"ids\", \"selector_ids\": [\"selectorIds\"], \"selector_scope\": [{\"kind\": \"workspace\", \"tags\": [\"tags\"], \"resource_groups\": [\"resourceGroups\"], \"locations\": [\"us-south\"]}]}}, \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"scoped_resources\": [{\"kind\": \"workspace\", \"id\": \"id\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updatePolicyPath = "/v2/settings/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    // Construct an instance of the PolicyObjectSelector model
    PolicyObjectSelector policyObjectSelectorModel = new PolicyObjectSelector.Builder()
      .kind("workspace")
      .tags(java.util.Arrays.asList("testString"))
      .resourceGroups(java.util.Arrays.asList("testString"))
      .locations(java.util.Arrays.asList("us-south"))
      .build();

    // Construct an instance of the PolicyObjects model
    PolicyObjects policyObjectsModel = new PolicyObjects.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();

    // Construct an instance of the AgentAssignmentPolicyParameter model
    AgentAssignmentPolicyParameter agentAssignmentPolicyParameterModel = new AgentAssignmentPolicyParameter.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();

    // Construct an instance of the PolicyParameter model
    PolicyParameter policyParameterModel = new PolicyParameter.Builder()
      .agentAssignmentPolicyParameter(agentAssignmentPolicyParameterModel)
      .build();

    // Construct an instance of the ScopedResource model
    ScopedResource scopedResourceModel = new ScopedResource.Builder()
      .kind("workspace")
      .id("testString")
      .build();

    // Construct an instance of the UpdatePolicyOptions model
    UpdatePolicyOptions updatePolicyOptionsModel = new UpdatePolicyOptions.Builder()
      .policyId("testString")
      .name("Agent1-DevWS")
      .description("Policy for job execution of secured workspaces on agent1")
      .resourceGroup("Default")
      .tags(java.util.Arrays.asList("policy:secured-job"))
      .location("us-south")
      .state(userStateModel)
      .kind("agent_assignment_policy")
      .target(policyObjectsModel)
      .parameter(policyParameterModel)
      .scopedResources(java.util.Arrays.asList(scopedResourceModel))
      .build();

    // Invoke updatePolicy() with a valid options model and verify the result
    Response<Policy> response = schematicsService.updatePolicy(updatePolicyOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePolicy operation with and without retries enabled
  @Test
  public void testUpdatePolicyWRetries() throws Throwable {
    schematicsService.enableRetries(4, 30);
    testUpdatePolicyWOptions();

    schematicsService.disableRetries();
    testUpdatePolicyWOptions();
  }

  // Test the updatePolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    schematicsService.updatePolicy(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    schematicsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    schematicsService = Schematics.newInstance(serviceName);
    String url = server.url("/").toString();
    schematicsService.setServiceUrl(url);
  }
}