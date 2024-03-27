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

import com.ibm.cloud.schematics.v1.model.Agent;
import com.ibm.cloud.schematics.v1.model.AgentUserState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Agent model.
 */
public class AgentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgent() throws Throwable {
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();
    assertEquals(agentUserStateModel.state(), "enable");

    Agent agentModel = new Agent.Builder()
      .name("MyDevAgent")
      .description("Register agent")
      .resourceGroup("testString")
      .tags(java.util.Arrays.asList("testString"))
      .agentLocation("us-south")
      .location("us-south")
      .profileId("testString")
      .userState(agentUserStateModel)
      .build();
    assertEquals(agentModel.name(), "MyDevAgent");
    assertEquals(agentModel.description(), "Register agent");
    assertEquals(agentModel.resourceGroup(), "testString");
    assertEquals(agentModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(agentModel.agentLocation(), "us-south");
    assertEquals(agentModel.location(), "us-south");
    assertEquals(agentModel.profileId(), "testString");
    assertEquals(agentModel.userState(), agentUserStateModel);

    String json = TestUtilities.serialize(agentModel);

    Agent agentModelNew = TestUtilities.deserialize(json, Agent.class);
    assertTrue(agentModelNew instanceof Agent);
    assertEquals(agentModelNew.name(), "MyDevAgent");
    assertEquals(agentModelNew.description(), "Register agent");
    assertEquals(agentModelNew.resourceGroup(), "testString");
    assertEquals(agentModelNew.agentLocation(), "us-south");
    assertEquals(agentModelNew.location(), "us-south");
    assertEquals(agentModelNew.profileId(), "testString");
    assertEquals(agentModelNew.userState().toString(), agentUserStateModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAgentError() throws Throwable {
    new Agent.Builder().build();
  }

}