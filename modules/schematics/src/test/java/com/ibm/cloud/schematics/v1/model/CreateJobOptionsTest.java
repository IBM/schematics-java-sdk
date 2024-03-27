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

package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.schematics.v1.model.AgentInfo;
import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.CartOrderData;
import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobDataFlow;
import com.ibm.cloud.schematics.v1.model.JobDataSystem;
import com.ibm.cloud.schematics.v1.model.JobDataTemplate;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItem;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics.v1.model.JobDataWorkspace;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryFlowJob;
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
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateJobOptions model.
 */
public class CreateJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateJobOptions() throws Throwable {
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
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), java.util.Arrays.asList("testString"));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.cloudDataType(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.linkStatus(), "normal");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), java.util.Arrays.asList("testString"));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("testString")
      .workspaceName("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusWorkitemModel.workspaceId(), "testString");
    assertEquals(jobStatusWorkitemModel.workspaceName(), "testString");
    assertEquals(jobStatusWorkitemModel.jobId(), "testString");
    assertEquals(jobStatusWorkitemModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkitemModel.statusMessage(), "testString");
    assertEquals(jobStatusWorkitemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusFlowModel.flowId(), "testString");
    assertEquals(jobStatusFlowModel.flowName(), "testString");
    assertEquals(jobStatusFlowModel.statusCode(), "job_pending");
    assertEquals(jobStatusFlowModel.statusMessage(), "testString");
    assertEquals(jobStatusFlowModel.workitems(), java.util.Arrays.asList(jobStatusWorkitemModel));
    assertEquals(jobStatusFlowModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusTemplateModel.templateId(), "testString");
    assertEquals(jobStatusTemplateModel.templateName(), "testString");
    assertEquals(jobStatusTemplateModel.flowIndex(), Long.valueOf("26"));
    assertEquals(jobStatusTemplateModel.statusCode(), "job_pending");
    assertEquals(jobStatusTemplateModel.statusMessage(), "testString");
    assertEquals(jobStatusTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusWorkspaceModel.workspaceName(), "testString");
    assertEquals(jobStatusWorkspaceModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModel.statusMessage(), "testString");
    assertEquals(jobStatusWorkspaceModel.flowStatus(), jobStatusFlowModel);
    assertEquals(jobStatusWorkspaceModel.templateStatus(), java.util.Arrays.asList(jobStatusTemplateModel));
    assertEquals(jobStatusWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

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
    assertEquals(jobStatusActionModel.actionName(), "testString");
    assertEquals(jobStatusActionModel.statusCode(), "job_pending");
    assertEquals(jobStatusActionModel.statusMessage(), "testString");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.targetsStatusCode(), "none");
    assertEquals(jobStatusActionModel.targetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.statusCode(), "job_pending");
    assertEquals(jobStatusSchematicsResourcesModel.statusMessage(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.schematicsResourceId(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(java.util.Arrays.asList(jobStatusSchematicsResourcesModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusSystemModel.systemStatusMessage(), "testString");
    assertEquals(jobStatusSystemModel.systemStatusCode(), "job_pending");
    assertEquals(jobStatusSystemModel.schematicsResourceStatus(), java.util.Arrays.asList(jobStatusSchematicsResourcesModel));
    assertEquals(jobStatusSystemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .positionInQueue(Double.valueOf("72.5"))
      .totalInQueue(Double.valueOf("72.5"))
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .build();
    assertEquals(jobStatusModel.positionInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModel.totalInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModel.workspaceJobStatus(), jobStatusWorkspaceModel);
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);
    assertEquals(jobStatusModel.systemJobStatus(), jobStatusSystemModel);
    assertEquals(jobStatusModel.flowJobStatus(), jobStatusFlowModel);

    CartOrderData cartOrderDataModel = new CartOrderData.Builder()
      .name("testString")
      .value("testString")
      .type("testString")
      .usageKind(java.util.Arrays.asList("servicetags"))
      .build();
    assertEquals(cartOrderDataModel.name(), "testString");
    assertEquals(cartOrderDataModel.value(), "testString");
    assertEquals(cartOrderDataModel.type(), "testString");
    assertEquals(cartOrderDataModel.usageKind(), java.util.Arrays.asList("servicetags"));

    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
      .templateId("testString")
      .templateName("testString")
      .flowIndex(Long.valueOf("26"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobDataTemplateModel.templateId(), "testString");
    assertEquals(jobDataTemplateModel.templateName(), "testString");
    assertEquals(jobDataTemplateModel.flowIndex(), Long.valueOf("26"));
    assertEquals(jobDataTemplateModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

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
    assertEquals(jobDataWorkspaceModel.workspaceName(), "testString");
    assertEquals(jobDataWorkspaceModel.flowId(), "testString");
    assertEquals(jobDataWorkspaceModel.flowName(), "testString");
    assertEquals(jobDataWorkspaceModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.templateData(), java.util.Arrays.asList(jobDataTemplateModel));
    assertEquals(jobDataWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(inventoryResourceRecordModel.name(), "testString");
    assertEquals(inventoryResourceRecordModel.description(), "testString");
    assertEquals(inventoryResourceRecordModel.location(), "us-south");
    assertEquals(inventoryResourceRecordModel.resourceGroup(), "testString");
    assertEquals(inventoryResourceRecordModel.inventoriesIni(), "testString");
    assertEquals(inventoryResourceRecordModel.resourceQueries(), java.util.Arrays.asList("testString"));

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("testString")
      .build();
    assertEquals(jobDataActionModel.actionName(), "testString");
    assertEquals(jobDataActionModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataActionModel.inventoryRecord(), inventoryResourceRecordModel);
    assertEquals(jobDataActionModel.materializedInventory(), "testString");

    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(java.util.Arrays.asList("testString"))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobDataSystemModel.keyId(), "testString");
    assertEquals(jobDataSystemModel.schematicsResourceId(), java.util.Arrays.asList("testString"));
    assertEquals(jobDataSystemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();
    assertEquals(gitSourceModel.computedGitRepoUrl(), "testString");
    assertEquals(gitSourceModel.gitRepoUrl(), "testString");
    assertEquals(gitSourceModel.gitToken(), "testString");
    assertEquals(gitSourceModel.gitRepoFolder(), "testString");
    assertEquals(gitSourceModel.gitRelease(), "testString");
    assertEquals(gitSourceModel.gitBranch(), "testString");

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
    assertEquals(catalogSourceModel.catalogName(), "testString");
    assertEquals(catalogSourceModel.catalogId(), "testString");
    assertEquals(catalogSourceModel.offeringName(), "testString");
    assertEquals(catalogSourceModel.offeringVersion(), "testString");
    assertEquals(catalogSourceModel.offeringKind(), "testString");
    assertEquals(catalogSourceModel.offeringTargetKind(), "testString");
    assertEquals(catalogSourceModel.offeringId(), "testString");
    assertEquals(catalogSourceModel.offeringVersionId(), "testString");
    assertEquals(catalogSourceModel.offeringVersionFlavourName(), "testString");
    assertEquals(catalogSourceModel.offeringRepoUrl(), "testString");
    assertEquals(catalogSourceModel.offeringProvisionerWorkingDirectory(), "testString");
    assertEquals(catalogSourceModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogSourceModel.owningAccount(), "testString");
    assertEquals(catalogSourceModel.itemIconUrl(), "testString");
    assertEquals(catalogSourceModel.itemId(), "testString");
    assertEquals(catalogSourceModel.itemName(), "testString");
    assertEquals(catalogSourceModel.itemReadmeUrl(), "testString");
    assertEquals(catalogSourceModel.itemUrl(), "testString");
    assertEquals(catalogSourceModel.launchUrl(), "testString");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();
    assertEquals(externalSourceModel.sourceType(), "local");
    assertEquals(externalSourceModel.git(), gitSourceModel);
    assertEquals(externalSourceModel.catalog(), catalogSourceModel);

    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobId("testString")
      .jobStatus("job_pending")
      .build();
    assertEquals(jobDataWorkItemLastJobModel.commandObject(), "workspace");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectName(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.commandName(), "workspace_plan");
    assertEquals(jobDataWorkItemLastJobModel.jobId(), "testString");
    assertEquals(jobDataWorkItemLastJobModel.jobStatus(), "job_pending");

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
    assertEquals(jobDataWorkItemModel.commandObjectId(), "testString");
    assertEquals(jobDataWorkItemModel.commandObjectName(), "testString");
    assertEquals(jobDataWorkItemModel.layers(), "testString");
    assertEquals(jobDataWorkItemModel.sourceType(), "local");
    assertEquals(jobDataWorkItemModel.source(), externalSourceModel);
    assertEquals(jobDataWorkItemModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.lastJob(), jobDataWorkItemLastJobModel);
    assertEquals(jobDataWorkItemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .workitems(java.util.Arrays.asList(jobDataWorkItemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobDataFlowModel.flowId(), "testString");
    assertEquals(jobDataFlowModel.flowName(), "testString");
    assertEquals(jobDataFlowModel.workitems(), java.util.Arrays.asList(jobDataWorkItemModel));
    assertEquals(jobDataFlowModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .workspaceJobData(jobDataWorkspaceModel)
      .actionJobData(jobDataActionModel)
      .systemJobData(jobDataSystemModel)
      .flowJobData(jobDataFlowModel)
      .build();
    assertEquals(jobDataModel.jobType(), "repo_download_job");
    assertEquals(jobDataModel.workspaceJobData(), jobDataWorkspaceModel);
    assertEquals(jobDataModel.actionJobData(), jobDataActionModel);
    assertEquals(jobDataModel.systemJobData(), jobDataSystemModel);
    assertEquals(jobDataModel.flowJobData(), jobDataFlowModel);

    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();
    assertEquals(bastionResourceDefinitionModel.name(), "testString");
    assertEquals(bastionResourceDefinitionModel.host(), "testString");

    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .build();

    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("testString")
      .jobId("testString")
      .logUrl("testString")
      .build();
    assertEquals(jobLogSummaryWorkitemsModel.workspaceId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.jobId(), "testString");
    assertEquals(jobLogSummaryWorkitemsModel.logUrl(), "testString");

    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(java.util.Arrays.asList(jobLogSummaryWorkitemsModel))
      .build();
    assertEquals(jobLogSummaryFlowJobModel.workitems(), java.util.Arrays.asList(jobLogSummaryWorkitemsModel));

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(java.util.Arrays.asList("testString"))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), java.util.Arrays.asList("testString"));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("72.5"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummarySystemJobModel.success(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.failed(), Double.valueOf("72.5"));

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .build();
    assertEquals(jobLogSummaryModel.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.repoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.workspaceJob(), jobLogSummaryWorkspaceJobModel);
    assertEquals(jobLogSummaryModel.flowJob(), jobLogSummaryFlowJobModel);
    assertEquals(jobLogSummaryModel.actionJob(), jobLogSummaryActionJobModel);
    assertEquals(jobLogSummaryModel.systemJob(), jobLogSummarySystemJobModel);

    AgentInfo agentInfoModel = new AgentInfo.Builder()
      .id("testString")
      .name("testString")
      .assignmentPolicyId("testString")
      .build();
    assertEquals(agentInfoModel.id(), "testString");
    assertEquals(agentInfoModel.name(), "testString");
    assertEquals(agentInfoModel.assignmentPolicyId(), "testString");

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
    assertEquals(createJobOptionsModel.refreshToken(), "testString");
    assertEquals(createJobOptionsModel.commandObject(), "workspace");
    assertEquals(createJobOptionsModel.commandObjectId(), "testString");
    assertEquals(createJobOptionsModel.commandName(), "workspace_plan");
    assertEquals(createJobOptionsModel.commandParameter(), "testString");
    assertEquals(createJobOptionsModel.commandOptions(), java.util.Arrays.asList("testString"));
    assertEquals(createJobOptionsModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(createJobOptionsModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(createJobOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(createJobOptionsModel.location(), "us-south");
    assertEquals(createJobOptionsModel.status(), jobStatusModel);
    assertEquals(createJobOptionsModel.cartOrderData(), java.util.Arrays.asList(cartOrderDataModel));
    assertEquals(createJobOptionsModel.data(), jobDataModel);
    assertEquals(createJobOptionsModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(createJobOptionsModel.logSummary(), jobLogSummaryModel);
    assertEquals(createJobOptionsModel.agent(), agentInfoModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobOptionsError() throws Throwable {
    new CreateJobOptions.Builder().build();
  }

}