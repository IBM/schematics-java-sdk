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

import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.Group;
import com.ibm.cloud.schematics.v1.model.Host;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryView;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobDataFlow;
import com.ibm.cloud.schematics.v1.model.JobDataSystem;
import com.ibm.cloud.schematics.v1.model.JobDataTemplate;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItem;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics.v1.model.JobDataWorkspace;
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
 * Unit test class for the JobData model.
 */
public class JobDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobData() throws Throwable {
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

    String json = TestUtilities.serialize(jobDataModel);

    JobData jobDataModelNew = TestUtilities.deserialize(json, JobData.class);
    assertTrue(jobDataModelNew instanceof JobData);
    assertEquals(jobDataModelNew.jobType(), "repo_download_job");
    assertEquals(jobDataModelNew.workspaceJobData().toString(), jobDataWorkspaceModel.toString());
    assertEquals(jobDataModelNew.actionJobData().toString(), jobDataActionModel.toString());
    assertEquals(jobDataModelNew.systemJobData().toString(), jobDataSystemModel.toString());
    assertEquals(jobDataModelNew.flowJobData().toString(), jobDataFlowModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testJobDataError() throws Throwable {
    new JobData.Builder().build();
  }

}