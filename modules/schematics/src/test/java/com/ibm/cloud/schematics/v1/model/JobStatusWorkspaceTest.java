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
import com.ibm.cloud.schematics.v1.model.JobStatusTemplate;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkitem;
import com.ibm.cloud.schematics.v1.model.JobStatusWorkspace;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusWorkspace model.
 */
public class JobStatusWorkspaceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusWorkspace() throws Throwable {
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
      .flowId("flow_id")
      .flowName("flow_name")
      .statusCode("null")
      .statusMessage("status_message")
      .workitems(java.util.Arrays.asList(jobStatusWorkitemModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusFlowModel.flowId(), "flow_id");
    assertEquals(jobStatusFlowModel.flowName(), "flow_name");
    assertEquals(jobStatusFlowModel.statusCode(), "null");
    assertEquals(jobStatusFlowModel.statusMessage(), "status_message");
    assertEquals(jobStatusFlowModel.workitems(), java.util.Arrays.asList(jobStatusWorkitemModel));
    assertEquals(jobStatusFlowModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
      .templateId("template_id")
      .templateName("template_name")
      .flowIndex(Long.valueOf("2302"))
      .statusCode("null")
      .statusMessage("status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusTemplateModel.templateId(), "template_id");
    assertEquals(jobStatusTemplateModel.templateName(), "template_name");
    assertEquals(jobStatusTemplateModel.flowIndex(), Long.valueOf("2302"));
    assertEquals(jobStatusTemplateModel.statusCode(), "null");
    assertEquals(jobStatusTemplateModel.statusMessage(), "status_message");
    assertEquals(jobStatusTemplateModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
      .workspaceName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusWorkspaceModel.workspaceName(), "testString");
    assertEquals(jobStatusWorkspaceModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModel.statusMessage(), "testString");
    assertEquals(jobStatusWorkspaceModel.flowStatus(), jobStatusFlowModel);
    assertEquals(jobStatusWorkspaceModel.templateStatus(), java.util.Arrays.asList(jobStatusTemplateModel));
    assertEquals(jobStatusWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(jobStatusWorkspaceModel);

    JobStatusWorkspace jobStatusWorkspaceModelNew = TestUtilities.deserialize(json, JobStatusWorkspace.class);
    assertTrue(jobStatusWorkspaceModelNew instanceof JobStatusWorkspace);
    assertEquals(jobStatusWorkspaceModelNew.workspaceName(), "testString");
    assertEquals(jobStatusWorkspaceModelNew.statusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModelNew.statusMessage(), "testString");
    assertEquals(jobStatusWorkspaceModelNew.flowStatus().toString(), jobStatusFlowModel.toString());
    assertEquals(jobStatusWorkspaceModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}