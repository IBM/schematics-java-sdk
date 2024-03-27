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

import com.ibm.cloud.schematics.v1.model.EnvironmentValuesMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EnvironmentValuesMetadata model.
 */
public class EnvironmentValuesMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEnvironmentValuesMetadata() throws Throwable {
    EnvironmentValuesMetadata environmentValuesMetadataModel = new EnvironmentValuesMetadata.Builder()
      .hidden(true)
      .name("testString")
      .secure(true)
      .build();
    assertEquals(environmentValuesMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(environmentValuesMetadataModel.name(), "testString");
    assertEquals(environmentValuesMetadataModel.secure(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(environmentValuesMetadataModel);

    EnvironmentValuesMetadata environmentValuesMetadataModelNew = TestUtilities.deserialize(json, EnvironmentValuesMetadata.class);
    assertTrue(environmentValuesMetadataModelNew instanceof EnvironmentValuesMetadata);
    assertEquals(environmentValuesMetadataModelNew.hidden(), Boolean.valueOf(true));
    assertEquals(environmentValuesMetadataModelNew.name(), "testString");
    assertEquals(environmentValuesMetadataModelNew.secure(), Boolean.valueOf(true));
  }
}