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

package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.schematics.v1.model.AgentInfo;
import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.CartOrderData;
import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.Group;
import com.ibm.cloud.schematics.v1.model.Host;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryView;
import com.ibm.cloud.schematics.v1.model.Job;
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
 * Unit test class for the Job model.
 */
public class JobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJob() throws Throwable {
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"))
      .description("description")
      .cloudDataType("cloud_data_type")
      .defaultValue("default_value")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("options", "options", "options", "options", "options"))
      .minValue(Long.valueOf("5962"))
      .maxValue(Long.valueOf("5637"))
      .minLength(Long.valueOf("2302"))
      .maxLength(Long.valueOf("7061"))
      .matches("matches")
      .position(Long.valueOf("9301"))
      .groupBy("group_by")
      .source("source")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"));
    assertEquals(variableMetadataModel.description(), "description");
    assertEquals(variableMetadataModel.cloudDataType(), "cloud_data_type");
    assertEquals(variableMetadataModel.defaultValue(), "default_value");
    assertEquals(variableMetadataModel.linkStatus(), "normal");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), java.util.Arrays.asList("options", "options", "options", "options", "options"));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("5962"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("5637"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("2302"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("7061"));
    assertEquals(variableMetadataModel.matches(), "matches");
    assertEquals(variableMetadataModel.position(), Long.valueOf("9301"));
    assertEquals(variableMetadataModel.groupBy(), "group_by");
    assertEquals(variableMetadataModel.source(), "source");

    VariableData variableDataModel = new VariableData.Builder()
      .name("name")
      .value("value")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "name");
    assertEquals(variableDataModel.value(), "value");
    assertEquals(variableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("workspace_id")
      .workspaceName("workspace_name")
      .jobId("job_id")
      .statusCode("null")
      .statusMessage("status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusWorkitemModel.workspaceId(), "workspace_id");
    assertEquals(jobStatusWorkitemModel.workspaceName(), "workspace_name");
    assertEquals(jobStatusWorkitemModel.jobId(), "job_id");
    assertEquals(jobStatusWorkitemModel.statusCode(), "null");
    assertEquals(jobStatusWorkitemModel.statusMessage(), "status_message");
    assertEquals(jobStatusWorkitemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("flow_id")
      .flowName("flow_name")
      .statusCode("null")
      .statusMessage("status_message")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusFlowModel.flowId(), "flow_id");
    assertEquals(jobStatusFlowModel.flowName(), "flow_name");
    assertEquals(jobStatusFlowModel.statusCode(), "null");
    assertEquals(jobStatusFlowModel.statusMessage(), "status_message");
    assertEquals(jobStatusFlowModel.workitems(), java.util.Arrays.asList(jobStatusWorkitemModel));
    assertEquals(jobStatusFlowModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("template_id")
      .templateName("template_name")
      .flowIndex(Long.valueOf("2302"))
      .statusCode("null")
      .statusMessage("status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusTemplateModel.templateId(), "template_id");
    assertEquals(jobStatusTemplateModel.templateName(), "template_name");
    assertEquals(jobStatusTemplateModel.flowIndex(), Long.valueOf("2302"));
    assertEquals(jobStatusTemplateModel.statusCode(), "null");
    assertEquals(jobStatusTemplateModel.statusMessage(), "status_message");
    assertEquals(jobStatusTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("workspace_name")
      .statusCode("job_pending")
      .statusMessage("status_message")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusWorkspaceModel.workspaceName(), "workspace_name");
    assertEquals(jobStatusWorkspaceModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModel.statusMessage(), "status_message");
    assertEquals(jobStatusWorkspaceModel.flowStatus(), jobStatusFlowModel);
    assertEquals(jobStatusWorkspaceModel.templateStatus(), java.util.Arrays.asList(jobStatusTemplateModel));
    assertEquals(jobStatusWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("action_name")
      .statusCode("null")
      .statusMessage("status_message")
      .bastionStatusCode("none")
      .bastionStatusMessage("bastion_status_message")
      .targetsStatusCode("null")
      .targetsStatusMessage("targets_status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusActionModel.actionName(), "action_name");
    assertEquals(jobStatusActionModel.statusCode(), "null");
    assertEquals(jobStatusActionModel.statusMessage(), "status_message");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "bastion_status_message");
    assertEquals(jobStatusActionModel.targetsStatusCode(), "null");
    assertEquals(jobStatusActionModel.targetsStatusMessage(), "targets_status_message");
    assertEquals(jobStatusActionModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("null")
      .statusMessage("status_message")
      .schematicsResourceId("schematics_resource_id")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.statusCode(), "null");
    assertEquals(jobStatusSchematicsResourcesModel.statusMessage(), "status_message");
    assertEquals(jobStatusSchematicsResourcesModel.schematicsResourceId(), "schematics_resource_id");
    assertEquals(jobStatusSchematicsResourcesModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("system_status_message")
      .systemStatusCode("null")
      .schematicsResourceStatus(java.util.Arrays.asList(jobStatusSchematicsResourcesModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusSystemModel.systemStatusMessage(), "system_status_message");
    assertEquals(jobStatusSystemModel.systemStatusCode(), "null");
    assertEquals(jobStatusSystemModel.schematicsResourceStatus(), java.util.Arrays.asList(jobStatusSchematicsResourcesModel));
    assertEquals(jobStatusSystemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .positionInQueue(Double.valueOf("5.962133916683182"))
      .totalInQueue(Double.valueOf("5.637376656633329"))
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .build();
    assertEquals(jobStatusModel.positionInQueue(), Double.valueOf("5.962133916683182"));
    assertEquals(jobStatusModel.totalInQueue(), Double.valueOf("5.637376656633329"));
    assertEquals(jobStatusModel.workspaceJobStatus(), jobStatusWorkspaceModel);
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);
    assertEquals(jobStatusModel.systemJobStatus(), jobStatusSystemModel);
    assertEquals(jobStatusModel.flowJobStatus(), jobStatusFlowModel);

    CartOrderData cartOrderDataModel = new CartOrderData.Builder()
      .name("name")
      .value("value")
      .type("type")
      .usageKind(java.util.Arrays.asList("servicetags", "servicetags", "servicetags", "servicetags", "servicetags"))
      .build();
    assertEquals(cartOrderDataModel.name(), "name");
    assertEquals(cartOrderDataModel.value(), "value");
    assertEquals(cartOrderDataModel.type(), "type");
    assertEquals(cartOrderDataModel.usageKind(), java.util.Arrays.asList("servicetags", "servicetags", "servicetags", "servicetags", "servicetags"));

    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
      .templateId("template_id")
      .templateName("template_name")
      .flowIndex(Long.valueOf("800"))
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobDataTemplateModel.templateId(), "template_id");
    assertEquals(jobDataTemplateModel.templateName(), "template_name");
    assertEquals(jobDataTemplateModel.flowIndex(), Long.valueOf("800"));
    assertEquals(jobDataTemplateModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
      .workspaceName("workspace_name")
      .flowId("flow_id")
      .flowName("flow_name")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .templateData(java.util.Arrays.asList(jobDataTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobDataWorkspaceModel.workspaceName(), "workspace_name");
    assertEquals(jobDataWorkspaceModel.flowId(), "flow_id");
    assertEquals(jobDataWorkspaceModel.flowName(), "flow_name");
    assertEquals(jobDataWorkspaceModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkspaceModel.templateData(), java.util.Arrays.asList(jobDataTemplateModel));
    assertEquals(jobDataWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    CredentialVariableMetadata credentialVariableMetadataModel = new CredentialVariableMetadata.Builder()
      .type("string")
      .aliases(java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"))
      .description("description")
      .cloudDataType("cloud_data_type")
      .defaultValue("default_value")
      .linkStatus("normal")
      .immutable(true)
      .hidden(true)
      .required(true)
      .position(Long.valueOf("800"))
      .groupBy("group_by")
      .source("source")
      .build();
    assertEquals(credentialVariableMetadataModel.type(), "string");
    assertEquals(credentialVariableMetadataModel.aliases(), java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"));
    assertEquals(credentialVariableMetadataModel.description(), "description");
    assertEquals(credentialVariableMetadataModel.cloudDataType(), "cloud_data_type");
    assertEquals(credentialVariableMetadataModel.defaultValue(), "default_value");
    assertEquals(credentialVariableMetadataModel.linkStatus(), "normal");
    assertEquals(credentialVariableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.position(), Long.valueOf("800"));
    assertEquals(credentialVariableMetadataModel.groupBy(), "group_by");
    assertEquals(credentialVariableMetadataModel.source(), "source");

    CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
      .name("name")
      .value("-----BEGIN OPENSSH PRIVATE KEY-----\\nXXXXXXXXXXXXX\\n-----END OPENSSH PRIVATE KEY-----\\n")
      .redacted("redacted")
      .useDefault(true)
      .metadata(credentialVariableMetadataModel)
      .build();
    assertEquals(credentialVariableDataModel.name(), "name");
    assertEquals(credentialVariableDataModel.value(), "-----BEGIN OPENSSH PRIVATE KEY-----\\nXXXXXXXXXXXXX\\n-----END OPENSSH PRIVATE KEY-----\\n");
    assertEquals(credentialVariableDataModel.redacted(), "redacted");
    assertEquals(credentialVariableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(credentialVariableDataModel.metadata(), credentialVariableMetadataModel);

    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("name")
      .host("host")
      .build();
    assertEquals(bastionResourceDefinitionModel.name(), "name");
    assertEquals(bastionResourceDefinitionModel.host(), "host");

    Host hostModel = new Host.Builder()
      .alias("alias")
      .name("name")
      .credential(credentialVariableDataModel)
      .vars(java.util.Arrays.asList(variableDataModel))
      .build();
    assertEquals(hostModel.alias(), "alias");
    assertEquals(hostModel.name(), "name");
    assertEquals(hostModel.credential(), credentialVariableDataModel);
    assertEquals(hostModel.vars(), java.util.Arrays.asList(variableDataModel));

    Group groupModel = new Group.Builder()
      .name("name")
      .vars(java.util.Arrays.asList(variableDataModel))
      .credentials(credentialVariableDataModel)
      .hosts(java.util.Arrays.asList(hostModel))
      .build();
    assertEquals(groupModel.name(), "name");
    assertEquals(groupModel.vars(), java.util.Arrays.asList(variableDataModel));
    assertEquals(groupModel.credentials(), credentialVariableDataModel);
    assertEquals(groupModel.hosts(), java.util.Arrays.asList(hostModel));

    InventoryView inventoryViewModel = new InventoryView.Builder()
      .groups(java.util.Arrays.asList(groupModel))
      .build();
    assertEquals(inventoryViewModel.groups(), java.util.Arrays.asList(groupModel));

    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("name")
      .description("description")
      .location("null")
      .resourceGroup("resource_group")
      .inventoriesIni("inventories_ini")
      .resourceQueries(java.util.Arrays.asList("resource_queries", "resource_queries", "resource_queries", "resource_queries", "resource_queries"))
      .connectionType("connection_type")
      .credentials(java.util.Arrays.asList(credentialVariableDataModel))
      .commonCredentials(credentialVariableDataModel)
      .bastion(bastionResourceDefinitionModel)
      .bastionCredential(credentialVariableDataModel)
      .inventoryView(inventoryViewModel)
      .build();
    assertEquals(inventoryResourceRecordModel.name(), "name");
    assertEquals(inventoryResourceRecordModel.description(), "description");
    assertEquals(inventoryResourceRecordModel.location(), "null");
    assertEquals(inventoryResourceRecordModel.resourceGroup(), "resource_group");
    assertEquals(inventoryResourceRecordModel.inventoriesIni(), "inventories_ini");
    assertEquals(inventoryResourceRecordModel.resourceQueries(), java.util.Arrays.asList("resource_queries", "resource_queries", "resource_queries", "resource_queries", "resource_queries"));
    assertEquals(inventoryResourceRecordModel.connectionType(), "connection_type");
    assertEquals(inventoryResourceRecordModel.credentials(), java.util.Arrays.asList(credentialVariableDataModel));
    assertEquals(inventoryResourceRecordModel.commonCredentials(), credentialVariableDataModel);
    assertEquals(inventoryResourceRecordModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(inventoryResourceRecordModel.bastionCredential(), credentialVariableDataModel);
    assertEquals(inventoryResourceRecordModel.inventoryView(), inventoryViewModel);

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("action_name")
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("materialized_inventory")
      .build();
    assertEquals(jobDataActionModel.actionName(), "action_name");
    assertEquals(jobDataActionModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataActionModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));
    assertEquals(jobDataActionModel.inventoryRecord(), inventoryResourceRecordModel);
    assertEquals(jobDataActionModel.materializedInventory(), "materialized_inventory");

    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("key_id")
      .schematicsResourceId(java.util.Arrays.asList("schematics_resource_id", "schematics_resource_id", "schematics_resource_id", "schematics_resource_id", "schematics_resource_id"))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobDataSystemModel.keyId(), "key_id");
    assertEquals(jobDataSystemModel.schematicsResourceId(), java.util.Arrays.asList("schematics_resource_id", "schematics_resource_id", "schematics_resource_id", "schematics_resource_id", "schematics_resource_id"));
    assertEquals(jobDataSystemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("computed_git_repo_url")
      .gitRepoUrl("git_repo_url")
      .gitToken("git_token")
      .gitRepoFolder("git_repo_folder")
      .gitRelease("git_release")
      .gitBranch("git_branch")
      .build();
    assertEquals(gitSourceModel.computedGitRepoUrl(), "computed_git_repo_url");
    assertEquals(gitSourceModel.gitRepoUrl(), "git_repo_url");
    assertEquals(gitSourceModel.gitToken(), "git_token");
    assertEquals(gitSourceModel.gitRepoFolder(), "git_repo_folder");
    assertEquals(gitSourceModel.gitRelease(), "git_release");
    assertEquals(gitSourceModel.gitBranch(), "git_branch");

    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("catalog_name")
      .catalogId("catalog_id")
      .offeringName("offering_name")
      .offeringVersion("offering_version")
      .offeringKind("offering_kind")
      .offeringTargetKind("offering_target_kind")
      .offeringId("offering_id")
      .offeringVersionId("offering_version_id")
      .offeringVersionFlavourName("offering_version_flavour_name")
      .offeringRepoUrl("offering_repo_url")
      .offeringProvisionerWorkingDirectory("offering_provisioner_working_directory")
      .dryRun(true)
      .owningAccount("owning_account")
      .itemIconUrl("item_icon_url")
      .itemId("item_id")
      .itemName("item_name")
      .itemReadmeUrl("item_readme_url")
      .itemUrl("item_url")
      .launchUrl("launch_url")
      .build();
    assertEquals(catalogSourceModel.catalogName(), "catalog_name");
    assertEquals(catalogSourceModel.catalogId(), "catalog_id");
    assertEquals(catalogSourceModel.offeringName(), "offering_name");
    assertEquals(catalogSourceModel.offeringVersion(), "offering_version");
    assertEquals(catalogSourceModel.offeringKind(), "offering_kind");
    assertEquals(catalogSourceModel.offeringTargetKind(), "offering_target_kind");
    assertEquals(catalogSourceModel.offeringId(), "offering_id");
    assertEquals(catalogSourceModel.offeringVersionId(), "offering_version_id");
    assertEquals(catalogSourceModel.offeringVersionFlavourName(), "offering_version_flavour_name");
    assertEquals(catalogSourceModel.offeringRepoUrl(), "offering_repo_url");
    assertEquals(catalogSourceModel.offeringProvisionerWorkingDirectory(), "offering_provisioner_working_directory");
    assertEquals(catalogSourceModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogSourceModel.owningAccount(), "owning_account");
    assertEquals(catalogSourceModel.itemIconUrl(), "item_icon_url");
    assertEquals(catalogSourceModel.itemId(), "item_id");
    assertEquals(catalogSourceModel.itemName(), "item_name");
    assertEquals(catalogSourceModel.itemReadmeUrl(), "item_readme_url");
    assertEquals(catalogSourceModel.itemUrl(), "item_url");
    assertEquals(catalogSourceModel.launchUrl(), "launch_url");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();
    assertEquals(externalSourceModel.sourceType(), "local");
    assertEquals(externalSourceModel.git(), gitSourceModel);
    assertEquals(externalSourceModel.catalog(), catalogSourceModel);

    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
      .commandObject("null")
      .commandObjectName("command_object_name")
      .commandObjectId("command_object_id")
      .commandName("null")
      .jobId("job_id")
      .jobStatus("job_pending")
      .build();
    assertEquals(jobDataWorkItemLastJobModel.commandObject(), "null");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectName(), "command_object_name");
    assertEquals(jobDataWorkItemLastJobModel.commandObjectId(), "command_object_id");
    assertEquals(jobDataWorkItemLastJobModel.commandName(), "null");
    assertEquals(jobDataWorkItemLastJobModel.jobId(), "job_id");
    assertEquals(jobDataWorkItemLastJobModel.jobStatus(), "job_pending");

    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
      .commandObjectId("command_object_id")
      .commandObjectName("command_object_name")
      .layers("layers")
      .sourceType("local")
      .source(externalSourceModel)
      .inputs(java.util.Arrays.asList(variableDataModel))
      .outputs(java.util.Arrays.asList(variableDataModel))
      .settings(java.util.Arrays.asList(variableDataModel))
      .lastJob(jobDataWorkItemLastJobModel)
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobDataWorkItemModel.commandObjectId(), "command_object_id");
    assertEquals(jobDataWorkItemModel.commandObjectName(), "command_object_name");
    assertEquals(jobDataWorkItemModel.layers(), "layers");
    assertEquals(jobDataWorkItemModel.sourceType(), "local");
    assertEquals(jobDataWorkItemModel.source(), externalSourceModel);
    assertEquals(jobDataWorkItemModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobDataWorkItemModel.lastJob(), jobDataWorkItemLastJobModel);
    assertEquals(jobDataWorkItemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
      .flowId("flow_id")
      .flowName("flow_name")
      .workitems(java.util.Arrays.asList(jobDataWorkItemModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobDataFlowModel.flowId(), "flow_id");
    assertEquals(jobDataFlowModel.flowName(), "flow_name");
    assertEquals(jobDataFlowModel.workitems(), java.util.Arrays.asList(jobDataWorkItemModel));
    assertEquals(jobDataFlowModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

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

    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .build();

    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("workspace_id")
      .jobId("job_id")
      .logUrl("log_url")
      .build();
    assertEquals(jobLogSummaryWorkitemsModel.workspaceId(), "workspace_id");
    assertEquals(jobLogSummaryWorkitemsModel.jobId(), "job_id");
    assertEquals(jobLogSummaryWorkitemsModel.logUrl(), "log_url");

    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(java.util.Arrays.asList(jobLogSummaryWorkitemsModel))
      .build();
    assertEquals(jobLogSummaryFlowJobModel.workitems(), java.util.Arrays.asList(jobLogSummaryWorkitemsModel));

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(java.util.Arrays.asList("target", "target", "target", "target", "target"))
      .ok(Double.valueOf("6.683562403749608"))
      .changed(Double.valueOf("8.762042012749001"))
      .failed(Double.valueOf("9.018348186070783"))
      .skipped(Double.valueOf("6.438423552598547"))
      .unreachable(Double.valueOf("3.5571952270680973"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), java.util.Arrays.asList("target", "target", "target", "target", "target"));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("6.683562403749608"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("8.762042012749001"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("9.018348186070783"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("6.438423552598547"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("3.5571952270680973"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("1.284659006116532"))
      .failed(Double.valueOf("2.8841621266687802"))
      .build();
    assertEquals(jobLogSummarySystemJobModel.success(), Double.valueOf("1.284659006116532"));
    assertEquals(jobLogSummarySystemJobModel.failed(), Double.valueOf("2.8841621266687802"));

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
      .id("id")
      .name("name")
      .assignmentPolicyId("assignment_policy_id")
      .build();
    assertEquals(agentInfoModel.id(), "id");
    assertEquals(agentInfoModel.name(), "name");
    assertEquals(agentInfoModel.assignmentPolicyId(), "assignment_policy_id");

    Job jobModel = new Job.Builder()
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
    assertEquals(jobModel.commandObject(), "workspace");
    assertEquals(jobModel.commandObjectId(), "testString");
    assertEquals(jobModel.commandName(), "workspace_plan");
    assertEquals(jobModel.commandParameter(), "testString");
    assertEquals(jobModel.commandOptions(), java.util.Arrays.asList("testString"));
    assertEquals(jobModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobModel.settings(), java.util.Arrays.asList(variableDataModel));
    assertEquals(jobModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(jobModel.location(), "us-south");
    assertEquals(jobModel.status(), jobStatusModel);
    assertEquals(jobModel.cartOrderData(), java.util.Arrays.asList(cartOrderDataModel));
    assertEquals(jobModel.data(), jobDataModel);
    assertEquals(jobModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(jobModel.logSummary(), jobLogSummaryModel);
    assertEquals(jobModel.agent(), agentInfoModel);

    String json = TestUtilities.serialize(jobModel);

    Job jobModelNew = TestUtilities.deserialize(json, Job.class);
    assertTrue(jobModelNew instanceof Job);
    assertEquals(jobModelNew.commandObject(), "workspace");
    assertEquals(jobModelNew.commandObjectId(), "testString");
    assertEquals(jobModelNew.commandName(), "workspace_plan");
    assertEquals(jobModelNew.commandParameter(), "testString");
    assertEquals(jobModelNew.location(), "us-south");
    assertEquals(jobModelNew.status().toString(), jobStatusModel.toString());
    assertEquals(jobModelNew.data().toString(), jobDataModel.toString());
    assertEquals(jobModelNew.bastion().toString(), bastionResourceDefinitionModel.toString());
    assertEquals(jobModelNew.logSummary().toString(), jobLogSummaryModel.toString());
    assertEquals(jobModelNew.agent().toString(), agentInfoModel.toString());
  }
}