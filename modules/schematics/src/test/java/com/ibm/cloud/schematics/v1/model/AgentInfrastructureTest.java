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

import com.ibm.cloud.schematics.v1.model.AgentInfrastructure;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AgentInfrastructure model.
 */
public class AgentInfrastructureTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgentInfrastructure() throws Throwable {
    AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
      .infraType("ibm_kubernetes")
      .clusterId("testString")
      .clusterResourceGroup("testString")
      .cosInstanceName("testString")
      .cosBucketName("testString")
      .cosBucketRegion("testString")
      .build();
    assertEquals(agentInfrastructureModel.infraType(), "ibm_kubernetes");
    assertEquals(agentInfrastructureModel.clusterId(), "testString");
    assertEquals(agentInfrastructureModel.clusterResourceGroup(), "testString");
    assertEquals(agentInfrastructureModel.cosInstanceName(), "testString");
    assertEquals(agentInfrastructureModel.cosBucketName(), "testString");
    assertEquals(agentInfrastructureModel.cosBucketRegion(), "testString");

    String json = TestUtilities.serialize(agentInfrastructureModel);

    AgentInfrastructure agentInfrastructureModelNew = TestUtilities.deserialize(json, AgentInfrastructure.class);
    assertTrue(agentInfrastructureModelNew instanceof AgentInfrastructure);
    assertEquals(agentInfrastructureModelNew.infraType(), "ibm_kubernetes");
    assertEquals(agentInfrastructureModelNew.clusterId(), "testString");
    assertEquals(agentInfrastructureModelNew.clusterResourceGroup(), "testString");
    assertEquals(agentInfrastructureModelNew.cosInstanceName(), "testString");
    assertEquals(agentInfrastructureModelNew.cosBucketName(), "testString");
    assertEquals(agentInfrastructureModelNew.cosBucketRegion(), "testString");
  }
}