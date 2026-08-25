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
import com.ibm.cloud.schematics.v1.model.CredentialVariableData;
import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.model.Group;
import com.ibm.cloud.schematics.v1.model.Host;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
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
 * Unit test class for the InventoryResourceRecord model.
 */
public class InventoryResourceRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInventoryResourceRecord() throws Throwable {
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
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(java.util.Arrays.asList("testString"))
      .connectionType("testString")
      .credentials(java.util.Arrays.asList(credentialVariableDataModel))
      .commonCredentials(credentialVariableDataModel)
      .bastion(bastionResourceDefinitionModel)
      .bastionCredential(credentialVariableDataModel)
      .inventoryView(inventoryViewModel)
      .build();
    assertEquals(inventoryResourceRecordModel.name(), "testString");
    assertEquals(inventoryResourceRecordModel.description(), "testString");
    assertEquals(inventoryResourceRecordModel.location(), "us-south");
    assertEquals(inventoryResourceRecordModel.resourceGroup(), "testString");
    assertEquals(inventoryResourceRecordModel.inventoriesIni(), "testString");
    assertEquals(inventoryResourceRecordModel.resourceQueries(), java.util.Arrays.asList("testString"));
    assertEquals(inventoryResourceRecordModel.connectionType(), "testString");
    assertEquals(inventoryResourceRecordModel.credentials(), java.util.Arrays.asList(credentialVariableDataModel));
    assertEquals(inventoryResourceRecordModel.commonCredentials(), credentialVariableDataModel);
    assertEquals(inventoryResourceRecordModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(inventoryResourceRecordModel.bastionCredential(), credentialVariableDataModel);
    assertEquals(inventoryResourceRecordModel.inventoryView(), inventoryViewModel);

    String json = TestUtilities.serialize(inventoryResourceRecordModel);

    InventoryResourceRecord inventoryResourceRecordModelNew = TestUtilities.deserialize(json, InventoryResourceRecord.class);
    assertTrue(inventoryResourceRecordModelNew instanceof InventoryResourceRecord);
    assertEquals(inventoryResourceRecordModelNew.name(), "testString");
    assertEquals(inventoryResourceRecordModelNew.description(), "testString");
    assertEquals(inventoryResourceRecordModelNew.location(), "us-south");
    assertEquals(inventoryResourceRecordModelNew.resourceGroup(), "testString");
    assertEquals(inventoryResourceRecordModelNew.inventoriesIni(), "testString");
    assertEquals(inventoryResourceRecordModelNew.connectionType(), "testString");
    assertEquals(inventoryResourceRecordModelNew.commonCredentials().toString(), credentialVariableDataModel.toString());
    assertEquals(inventoryResourceRecordModelNew.bastion().toString(), bastionResourceDefinitionModel.toString());
    assertEquals(inventoryResourceRecordModelNew.bastionCredential().toString(), credentialVariableDataModel.toString());
    assertEquals(inventoryResourceRecordModelNew.inventoryView().toString(), inventoryViewModel.toString());
  }
}