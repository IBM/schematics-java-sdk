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

import com.ibm.cloud.schematics.v1.model.AgentKPIData;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AgentKPIData model.
 */
public class AgentKPIDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgentKPIData() throws Throwable {
    AgentKPIData agentKpiDataModel = new AgentKPIData.Builder()
      .availabilityIndicator("available")
      .lifecycleIndicator("consistent")
      .percentUsageIndicator("testString")
      .applicationIndicators(java.util.Arrays.asList("testString"))
      .infraIndicators(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(agentKpiDataModel.availabilityIndicator(), "available");
    assertEquals(agentKpiDataModel.lifecycleIndicator(), "consistent");
    assertEquals(agentKpiDataModel.percentUsageIndicator(), "testString");
    assertEquals(agentKpiDataModel.applicationIndicators(), java.util.Arrays.asList("testString"));
    assertEquals(agentKpiDataModel.infraIndicators(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(agentKpiDataModel);

    AgentKPIData agentKpiDataModelNew = TestUtilities.deserialize(json, AgentKPIData.class);
    assertTrue(agentKpiDataModelNew instanceof AgentKPIData);
    assertEquals(agentKpiDataModelNew.availabilityIndicator(), "available");
    assertEquals(agentKpiDataModelNew.lifecycleIndicator(), "consistent");
    assertEquals(agentKpiDataModelNew.percentUsageIndicator(), "testString");
  }
}