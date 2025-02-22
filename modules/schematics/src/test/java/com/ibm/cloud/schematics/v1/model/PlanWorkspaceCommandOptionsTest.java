/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityOptionsTemplate;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PlanWorkspaceCommandOptions model.
 */
public class PlanWorkspaceCommandOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPlanWorkspaceCommandOptions() throws Throwable {
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(java.util.Arrays.asList("testString"))
      .tfVars(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(workspaceActivityOptionsTemplateModel.target(), java.util.Arrays.asList("testString"));
    assertEquals(workspaceActivityOptionsTemplateModel.tfVars(), java.util.Arrays.asList("testString"));

    PlanWorkspaceCommandOptions planWorkspaceCommandOptionsModel = new PlanWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .delegatedToken("testString")
      .build();
    assertEquals(planWorkspaceCommandOptionsModel.wId(), "testString");
    assertEquals(planWorkspaceCommandOptionsModel.refreshToken(), "testString");
    assertEquals(planWorkspaceCommandOptionsModel.actionOptions(), workspaceActivityOptionsTemplateModel);
    assertEquals(planWorkspaceCommandOptionsModel.delegatedToken(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPlanWorkspaceCommandOptionsError() throws Throwable {
    new PlanWorkspaceCommandOptions.Builder().build();
  }

}