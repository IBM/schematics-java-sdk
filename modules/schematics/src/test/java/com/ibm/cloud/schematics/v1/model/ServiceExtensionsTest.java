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

import com.ibm.cloud.schematics.v1.model.ServiceExtensions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServiceExtensions model.
 */
public class ServiceExtensionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServiceExtensions() throws Throwable {
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();
    assertEquals(serviceExtensionsModel.name(), "flavor");
    assertEquals(serviceExtensionsModel.value(), "testString");
    assertEquals(serviceExtensionsModel.type(), "string");

    String json = TestUtilities.serialize(serviceExtensionsModel);

    ServiceExtensions serviceExtensionsModelNew = TestUtilities.deserialize(json, ServiceExtensions.class);
    assertTrue(serviceExtensionsModelNew instanceof ServiceExtensions);
    assertEquals(serviceExtensionsModelNew.name(), "flavor");
    assertEquals(serviceExtensionsModelNew.value(), "testString");
    assertEquals(serviceExtensionsModelNew.type(), "string");
  }
}