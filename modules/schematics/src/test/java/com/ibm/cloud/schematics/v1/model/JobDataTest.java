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

import com.ibm.cloud.schematics.v1.model.CatalogSource;
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