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

import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItem;
import com.ibm.cloud.schematics.v1.model.JobDataWorkItemLastJob;
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
 * Unit test class for the JobDataWorkItem model.
 */
public class JobDataWorkItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobDataWorkItem() throws Throwable {
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

    String json = TestUtilities.serialize(jobDataWorkItemModel);

    JobDataWorkItem jobDataWorkItemModelNew = TestUtilities.deserialize(json, JobDataWorkItem.class);
    assertTrue(jobDataWorkItemModelNew instanceof JobDataWorkItem);
    assertEquals(jobDataWorkItemModelNew.commandObjectId(), "testString");
    assertEquals(jobDataWorkItemModelNew.commandObjectName(), "testString");
    assertEquals(jobDataWorkItemModelNew.layers(), "testString");
    assertEquals(jobDataWorkItemModelNew.sourceType(), "local");
    assertEquals(jobDataWorkItemModelNew.source().toString(), externalSourceModel.toString());
    assertEquals(jobDataWorkItemModelNew.lastJob().toString(), jobDataWorkItemLastJobModel.toString());
    assertEquals(jobDataWorkItemModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}