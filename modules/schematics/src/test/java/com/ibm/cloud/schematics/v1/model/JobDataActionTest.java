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

import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
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
 * Unit test class for the JobDataAction model.
 */
public class JobDataActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobDataAction() throws Throwable {
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

    String json = TestUtilities.serialize(jobDataActionModel);

    JobDataAction jobDataActionModelNew = TestUtilities.deserialize(json, JobDataAction.class);
    assertTrue(jobDataActionModelNew instanceof JobDataAction);
    assertEquals(jobDataActionModelNew.actionName(), "testString");
    assertEquals(jobDataActionModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(jobDataActionModelNew.inventoryRecord().toString(), inventoryResourceRecordModel.toString());
    assertEquals(jobDataActionModelNew.materializedInventory(), "testString");
  }
}