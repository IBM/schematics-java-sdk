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

import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.model.UserState;
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
 * Unit test class for the Action model.
 */
public class ActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAction() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("set_by")
      .setAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(userStateModel.state(), "draft");
    assertEquals(userStateModel.setBy(), "set_by");
    assertEquals(userStateModel.setAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

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

    Action actionModel = new Action.Builder()
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
      .build();
    assertEquals(actionModel.name(), "Stop Action");
    assertEquals(actionModel.description(), "The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.");
    assertEquals(actionModel.location(), "us-south");
    assertEquals(actionModel.resourceGroup(), "testString");
    assertEquals(actionModel.bastionConnectionType(), "ssh");
    assertEquals(actionModel.inventoryConnectionType(), "ssh");
    assertEquals(actionModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(actionModel.userState(), userStateModel);
    assertEquals(actionModel.sourceReadmeUrl(), "testString");
    assertEquals(actionModel.source(), externalSourceModel);
    assertEquals(actionModel.sourceType(), "local");
    assertEquals(actionModel.commandParameter(), "testString");
    assertEquals(actionModel.inventory(), "testString");
    assertEquals(actionModel.credentials(), java.util.Arrays.asList(credentialVariableDataModel));
    assertEquals(actionModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(actionModel.bastionCredential(), credentialVariableDataModel);
    assertEquals(actionModel.targetsIni(), "testString");
    assertEquals(actionModel.inputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(actionModel.outputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(actionModel.settings(), java.util.Arrays.asList(variableDataModel));

    String json = TestUtilities.serialize(actionModel);

    Action actionModelNew = TestUtilities.deserialize(json, Action.class);
    assertTrue(actionModelNew instanceof Action);
    assertEquals(actionModelNew.name(), "Stop Action");
    assertEquals(actionModelNew.description(), "The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.");
    assertEquals(actionModelNew.location(), "us-south");
    assertEquals(actionModelNew.resourceGroup(), "testString");
    assertEquals(actionModelNew.bastionConnectionType(), "ssh");
    assertEquals(actionModelNew.inventoryConnectionType(), "ssh");
    assertEquals(actionModelNew.userState().toString(), userStateModel.toString());
    assertEquals(actionModelNew.sourceReadmeUrl(), "testString");
    assertEquals(actionModelNew.source().toString(), externalSourceModel.toString());
    assertEquals(actionModelNew.sourceType(), "local");
    assertEquals(actionModelNew.commandParameter(), "testString");
    assertEquals(actionModelNew.inventory(), "testString");
    assertEquals(actionModelNew.bastion().toString(), bastionResourceDefinitionModel.toString());
    assertEquals(actionModelNew.bastionCredential().toString(), credentialVariableDataModel.toString());
    assertEquals(actionModelNew.targetsIni(), "testString");
  }
}