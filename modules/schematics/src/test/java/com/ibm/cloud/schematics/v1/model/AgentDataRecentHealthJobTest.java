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

import com.ibm.cloud.schematics.v1.model.AgentDataRecentHealthJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AgentDataRecentHealthJob model.
 */
public class AgentDataRecentHealthJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgentDataRecentHealthJob() throws Throwable {
    AgentDataRecentHealthJob agentDataRecentHealthJobModel = new AgentDataRecentHealthJob.Builder()
      .agentId("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .logUrl("testString")
      .build();
    assertEquals(agentDataRecentHealthJobModel.agentId(), "testString");
    assertEquals(agentDataRecentHealthJobModel.jobId(), "testString");
    assertEquals(agentDataRecentHealthJobModel.statusCode(), "job_pending");
    assertEquals(agentDataRecentHealthJobModel.statusMessage(), "testString");
    assertEquals(agentDataRecentHealthJobModel.logUrl(), "testString");

    String json = TestUtilities.serialize(agentDataRecentHealthJobModel);

    AgentDataRecentHealthJob agentDataRecentHealthJobModelNew = TestUtilities.deserialize(json, AgentDataRecentHealthJob.class);
    assertTrue(agentDataRecentHealthJobModelNew instanceof AgentDataRecentHealthJob);
    assertEquals(agentDataRecentHealthJobModelNew.agentId(), "testString");
    assertEquals(agentDataRecentHealthJobModelNew.jobId(), "testString");
    assertEquals(agentDataRecentHealthJobModelNew.statusCode(), "job_pending");
    assertEquals(agentDataRecentHealthJobModelNew.statusMessage(), "testString");
    assertEquals(agentDataRecentHealthJobModelNew.logUrl(), "testString");
  }
}