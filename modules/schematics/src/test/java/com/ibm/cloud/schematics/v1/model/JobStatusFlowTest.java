/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.schematics.v1.model.JobStatusFlow;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkitem;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusFlow model.
 */
public class JobStatusFlowTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusFlow() throws Throwable {
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("workspace_id")
      .workspaceName("workspace_name")
      .jobId("job_id")
      .statusCode("null")
      .statusMessage("status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusWorkitemModel.workspaceId(), "workspace_id");
    assertEquals(jobStatusWorkitemModel.workspaceName(), "workspace_name");
    assertEquals(jobStatusWorkitemModel.jobId(), "job_id");
    assertEquals(jobStatusWorkitemModel.statusCode(), "null");
    assertEquals(jobStatusWorkitemModel.statusMessage(), "status_message");
    assertEquals(jobStatusWorkitemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
      .flowId("testString")
      .flowName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusFlowModel.flowId(), "testString");
    assertEquals(jobStatusFlowModel.flowName(), "testString");
    assertEquals(jobStatusFlowModel.statusCode(), "job_pending");
    assertEquals(jobStatusFlowModel.statusMessage(), "testString");
    assertEquals(jobStatusFlowModel.workitems(), java.util.Arrays.asList(jobStatusWorkitemModel));
    assertEquals(jobStatusFlowModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(jobStatusFlowModel);

    JobStatusFlow jobStatusFlowModelNew = TestUtilities.deserialize(json, JobStatusFlow.class);
    assertTrue(jobStatusFlowModelNew instanceof JobStatusFlow);
    assertEquals(jobStatusFlowModelNew.flowId(), "testString");
    assertEquals(jobStatusFlowModelNew.flowName(), "testString");
    assertEquals(jobStatusFlowModelNew.statusCode(), "job_pending");
    assertEquals(jobStatusFlowModelNew.statusMessage(), "testString");
    assertEquals(jobStatusFlowModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}