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
import com.ibm.cloud.schematics.v1.model.CreateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.Group;
import com.ibm.cloud.schematics.v1.model.Host;
import com.ibm.cloud.schematics.v1.model.InventoryView;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInventoryOptions model.
 */
public class CreateInventoryOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInventoryOptions() throws Throwable {
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
      .position(Long.valueOf("0"))
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
    assertEquals(credentialVariableMetadataModel.position(), Long.valueOf("0"));
    assertEquals(credentialVariableMetadataModel.groupBy(), "testString");
    assertEquals(credentialVariableMetadataModel.source(), "testString");

    CredentialVariableData credentialVariableDataModel = new CredentialVariableData.Builder()
      .name("testString")
      .value("-----BEGIN OPENSSH PRIVATE KEY-----\\nXXXXXXXXXXXXX\\n-----END OPENSSH PRIVATE KEY-----\\n")
      .redacted("testString")
      .useDefault(true)
      .metadata(credentialVariableMetadataModel)
      .build();
    assertEquals(credentialVariableDataModel.name(), "testString");
    assertEquals(credentialVariableDataModel.value(), "-----BEGIN OPENSSH PRIVATE KEY-----\\nXXXXXXXXXXXXX\\n-----END OPENSSH PRIVATE KEY-----\\n");
    assertEquals(credentialVariableDataModel.redacted(), "testString");
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
      .minValue(Long.valueOf("0"))
      .maxValue(Long.valueOf("0"))
      .minLength(Long.valueOf("0"))
      .maxLength(Long.valueOf("0"))
      .matches("testString")
      .position(Long.valueOf("0"))
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
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("0"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("0"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("0"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("0"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("0"));
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

    Host hostModel = new Host.Builder()
      .alias("testString")
      .name("testString")
      .credential(credentialVariableDataModel)
      .vars(java.util.Arrays.asList(variableDataModel))
      .build();
    assertEquals(hostModel.alias(), "testString");
    assertEquals(hostModel.name(), "testString");
    assertEquals(hostModel.credential(), credentialVariableDataModel);
    assertEquals(hostModel.vars(), java.util.Arrays.asList(variableDataModel));

    Group groupModel = new Group.Builder()
      .name("testString")
      .vars(java.util.Arrays.asList(variableDataModel))
      .credentials(credentialVariableDataModel)
      .hosts(java.util.Arrays.asList(hostModel))
      .build();
    assertEquals(groupModel.name(), "testString");
    assertEquals(groupModel.vars(), java.util.Arrays.asList(variableDataModel));
    assertEquals(groupModel.credentials(), credentialVariableDataModel);
    assertEquals(groupModel.hosts(), java.util.Arrays.asList(hostModel));

    InventoryView inventoryViewModel = new InventoryView.Builder()
      .groups(java.util.Arrays.asList(groupModel))
      .build();
    assertEquals(inventoryViewModel.groups(), java.util.Arrays.asList(groupModel));

    CreateInventoryOptions createInventoryOptionsModel = new CreateInventoryOptions.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .connectionType("testString")
      .credentials(java.util.Arrays.asList(credentialVariableDataModel))
      .commonCredentials(credentialVariableDataModel)
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .bastion(bastionResourceDefinitionModel)
      .bastionCredential(credentialVariableDataModel)
      .inventoryView(inventoryViewModel)
      .build();
    assertEquals(createInventoryOptionsModel.name(), "testString");
    assertEquals(createInventoryOptionsModel.description(), "testString");
    assertEquals(createInventoryOptionsModel.location(), "us-south");
    assertEquals(createInventoryOptionsModel.resourceGroup(), "testString");
    assertEquals(createInventoryOptionsModel.connectionType(), "testString");
    assertEquals(createInventoryOptionsModel.credentials(), java.util.Arrays.asList(credentialVariableDataModel));
    assertEquals(createInventoryOptionsModel.commonCredentials(), credentialVariableDataModel);
    assertEquals(createInventoryOptionsModel.inventoriesIni(), "testString");
    assertEquals(createInventoryOptionsModel.resourceQueries(), java.util.Arrays.asList("testString"));
    assertEquals(createInventoryOptionsModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(createInventoryOptionsModel.bastionCredential(), credentialVariableDataModel);
    assertEquals(createInventoryOptionsModel.inventoryView(), inventoryViewModel);
  }
}