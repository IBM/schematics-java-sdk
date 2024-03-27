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

import com.ibm.cloud.schematics.v1.model.CredentialVariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CredentialVariableMetadata model.
 */
public class CredentialVariableMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCredentialVariableMetadata() throws Throwable {
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

    String json = TestUtilities.serialize(credentialVariableMetadataModel);

    CredentialVariableMetadata credentialVariableMetadataModelNew = TestUtilities.deserialize(json, CredentialVariableMetadata.class);
    assertTrue(credentialVariableMetadataModelNew instanceof CredentialVariableMetadata);
    assertEquals(credentialVariableMetadataModelNew.type(), "string");
    assertEquals(credentialVariableMetadataModelNew.description(), "testString");
    assertEquals(credentialVariableMetadataModelNew.cloudDataType(), "testString");
    assertEquals(credentialVariableMetadataModelNew.defaultValue(), "testString");
    assertEquals(credentialVariableMetadataModelNew.linkStatus(), "normal");
    assertEquals(credentialVariableMetadataModelNew.immutable(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModelNew.hidden(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModelNew.required(), Boolean.valueOf(true));
    assertEquals(credentialVariableMetadataModelNew.position(), Long.valueOf("26"));
    assertEquals(credentialVariableMetadataModelNew.groupBy(), "testString");
    assertEquals(credentialVariableMetadataModelNew.source(), "testString");
  }
}