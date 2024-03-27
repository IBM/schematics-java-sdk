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

import com.ibm.cloud.schematics.v1.model.AgentUserState;
import com.ibm.cloud.schematics.v1.model.RegisterAgentOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RegisterAgentOptions model.
 */
public class RegisterAgentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRegisterAgentOptions() throws Throwable {
    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();
    assertEquals(agentUserStateModel.state(), "enable");

    RegisterAgentOptions registerAgentOptionsModel = new RegisterAgentOptions.Builder()
      .name("MyDevAgent")
      .agentLocation("us-south")
      .location("us-south")
      .profileId("testString")
      .description("Register agent")
      .resourceGroup("testString")
      .tags(java.util.Arrays.asList("testString"))
      .userState(agentUserStateModel)
      .build();
    assertEquals(registerAgentOptionsModel.name(), "MyDevAgent");
    assertEquals(registerAgentOptionsModel.agentLocation(), "us-south");
    assertEquals(registerAgentOptionsModel.location(), "us-south");
    assertEquals(registerAgentOptionsModel.profileId(), "testString");
    assertEquals(registerAgentOptionsModel.description(), "Register agent");
    assertEquals(registerAgentOptionsModel.resourceGroup(), "testString");
    assertEquals(registerAgentOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(registerAgentOptionsModel.userState(), agentUserStateModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterAgentOptionsError() throws Throwable {
    new RegisterAgentOptions.Builder().build();
  }

}