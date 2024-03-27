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

import com.ibm.cloud.schematics.v1.model.AgentDataRecentDestroyJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AgentDataRecentDestroyJob model.
 */
public class AgentDataRecentDestroyJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgentDataRecentDestroyJob() throws Throwable {
    AgentDataRecentDestroyJob agentDataRecentDestroyJobModel = new AgentDataRecentDestroyJob.Builder()
      .agentId("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .logUrl("testString")
      .build();
    assertEquals(agentDataRecentDestroyJobModel.agentId(), "testString");
    assertEquals(agentDataRecentDestroyJobModel.jobId(), "testString");
    assertEquals(agentDataRecentDestroyJobModel.statusCode(), "job_pending");
    assertEquals(agentDataRecentDestroyJobModel.statusMessage(), "testString");
    assertEquals(agentDataRecentDestroyJobModel.logUrl(), "testString");

    String json = TestUtilities.serialize(agentDataRecentDestroyJobModel);

    AgentDataRecentDestroyJob agentDataRecentDestroyJobModelNew = TestUtilities.deserialize(json, AgentDataRecentDestroyJob.class);
    assertTrue(agentDataRecentDestroyJobModelNew instanceof AgentDataRecentDestroyJob);
    assertEquals(agentDataRecentDestroyJobModelNew.agentId(), "testString");
    assertEquals(agentDataRecentDestroyJobModelNew.jobId(), "testString");
    assertEquals(agentDataRecentDestroyJobModelNew.statusCode(), "job_pending");
    assertEquals(agentDataRecentDestroyJobModelNew.statusMessage(), "testString");
    assertEquals(agentDataRecentDestroyJobModelNew.logUrl(), "testString");
  }
}