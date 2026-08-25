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

import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusFlow;
import com.ibm.cloud.schematics.v1.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics.v1.model.JobStatusSystem;
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
 * Unit test class for the JobStatus model.
 */
public class JobStatusTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatus() throws Throwable {
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
      .workspaceName("workspace_name")
      .statusCode("job_pending")
      .statusMessage("status_message")
      .flowStatus(jobStatusFlowModel)
      .templateStatus(java.util.Arrays.asList(jobStatusTemplateModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusWorkspaceModel.workspaceName(), "workspace_name");
    assertEquals(jobStatusWorkspaceModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkspaceModel.statusMessage(), "status_message");
    assertEquals(jobStatusWorkspaceModel.flowStatus(), jobStatusFlowModel);
    assertEquals(jobStatusWorkspaceModel.templateStatus(), java.util.Arrays.asList(jobStatusTemplateModel));
    assertEquals(jobStatusWorkspaceModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("action_name")
      .statusCode("null")
      .statusMessage("status_message")
      .bastionStatusCode("none")
      .bastionStatusMessage("bastion_status_message")
      .targetsStatusCode("null")
      .targetsStatusMessage("targets_status_message")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusActionModel.actionName(), "action_name");
    assertEquals(jobStatusActionModel.statusCode(), "null");
    assertEquals(jobStatusActionModel.statusMessage(), "status_message");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "bastion_status_message");
    assertEquals(jobStatusActionModel.targetsStatusCode(), "null");
    assertEquals(jobStatusActionModel.targetsStatusMessage(), "targets_status_message");
    assertEquals(jobStatusActionModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("null")
      .statusMessage("status_message")
      .schematicsResourceId("schematics_resource_id")
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.statusCode(), "null");
    assertEquals(jobStatusSchematicsResourcesModel.statusMessage(), "status_message");
    assertEquals(jobStatusSchematicsResourcesModel.schematicsResourceId(), "schematics_resource_id");
    assertEquals(jobStatusSchematicsResourcesModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("system_status_message")
      .systemStatusCode("null")
      .schematicsResourceStatus(java.util.Arrays.asList(jobStatusSchematicsResourcesModel))
      .updatedAt(DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"))
      .build();
    assertEquals(jobStatusSystemModel.systemStatusMessage(), "system_status_message");
    assertEquals(jobStatusSystemModel.systemStatusCode(), "null");
    assertEquals(jobStatusSystemModel.schematicsResourceStatus(), java.util.Arrays.asList(jobStatusSchematicsResourcesModel));
    assertEquals(jobStatusSystemModel.updatedAt(), DateUtils.parseAsDateTime("2000-01-23T04:56:07.000+00:00"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .positionInQueue(Double.valueOf("72.5"))
      .totalInQueue(Double.valueOf("72.5"))
      .workspaceJobStatus(jobStatusWorkspaceModel)
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .flowJobStatus(jobStatusFlowModel)
      .build();
    assertEquals(jobStatusModel.positionInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModel.totalInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModel.workspaceJobStatus(), jobStatusWorkspaceModel);
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);
    assertEquals(jobStatusModel.systemJobStatus(), jobStatusSystemModel);
    assertEquals(jobStatusModel.flowJobStatus(), jobStatusFlowModel);

    String json = TestUtilities.serialize(jobStatusModel);

    JobStatus jobStatusModelNew = TestUtilities.deserialize(json, JobStatus.class);
    assertTrue(jobStatusModelNew instanceof JobStatus);
    assertEquals(jobStatusModelNew.positionInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModelNew.totalInQueue(), Double.valueOf("72.5"));
    assertEquals(jobStatusModelNew.workspaceJobStatus().toString(), jobStatusWorkspaceModel.toString());
    assertEquals(jobStatusModelNew.actionJobStatus().toString(), jobStatusActionModel.toString());
    assertEquals(jobStatusModelNew.systemJobStatus().toString(), jobStatusSystemModel.toString());
    assertEquals(jobStatusModelNew.flowJobStatus().toString(), jobStatusFlowModel.toString());
  }
}