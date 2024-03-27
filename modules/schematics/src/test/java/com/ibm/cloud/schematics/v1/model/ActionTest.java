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
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(userStateModel.state(), "draft");
    assertEquals(userStateModel.setBy(), "testString");
    assertEquals(userStateModel.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

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
    assertEquals(credentialVariableMetadataModel.type(), "string");
    assertEquals(credentialVariableMetadataModel.aliases(), java.util.Arrays.asList("testString"));
    assertEquals(credentialVariableMetadataModel.description(), "testString");
    assertEquals(credentialVariableMetadataModel.cloudDataType(), "testString");
    assertEquals(credentialVariableMetadataModel.defaultValue(), "testString");
    assertEquals(credentialVariableMetadataModel.linkStatus(), "normal");
    assertEquals(credentialVariableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(credentialVariableMetadataModel.groupBy(), "testString");
    assertEquals(credentialVariableMetadataModel.source(), "testString");

    CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(credentialVariableMetadataModel)
      .build();
    assertEquals(credentialVariableDataModel.name(), "testString");
    assertEquals(credentialVariableDataModel.value(), "testString");
    assertEquals(credentialVariableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(credentialVariableDataModel.metadata(), credentialVariableMetadataModel);

    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();
    assertEquals(bastionResourceDefinitionModel.name(), "testString");
    assertEquals(bastionResourceDefinitionModel.host(), "testString");

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