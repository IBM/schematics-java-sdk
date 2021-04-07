/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.schematics.v1.model.BastionResourceDefinition;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobDataSystem;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics.v1.model.JobStatusSystem;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Job model.
 */
public class JobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJob() throws Throwable {
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .inventoryStatusCode("none")
      .inventoryStatusMessage("testString")
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobStatusActionModel.actionName(), "testString");
    assertEquals(jobStatusActionModel.statusCode(), "job_pending");
    assertEquals(jobStatusActionModel.statusMessage(), "testString");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.inventoryStatusCode(), "none");
    assertEquals(jobStatusActionModel.inventoryStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
      .statusCode("job_pending")
      .statusMessage("testString")
      .schematicsResourceId("testString")
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobStatusSchematicsResourcesModel.statusCode(), "job_pending");
    assertEquals(jobStatusSchematicsResourcesModel.statusMessage(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.schematicsResourceId(), "testString");
    assertEquals(jobStatusSchematicsResourcesModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
      .systemStatusMessage("testString")
      .systemStatusCode("job_pending")
      .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobStatusSystemModel.systemStatusMessage(), "testString");
    assertEquals(jobStatusSystemModel.systemStatusCode(), "job_pending");
    assertEquals(jobStatusSystemModel.schematicsResourceStatus(), new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)));
    assertEquals(jobStatusSystemModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .actionJobStatus(jobStatusActionModel)
      .systemJobStatus(jobStatusSystemModel)
      .build();
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);
    assertEquals(jobStatusModel.systemJobStatus(), jobStatusSystemModel);

    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
      .name("testString")
      .description("testString")
      .location("us-south")
      .resourceGroup("testString")
      .inventoriesIni("testString")
      .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(inventoryResourceRecordModel.name(), "testString");
    assertEquals(inventoryResourceRecordModel.description(), "testString");
    assertEquals(inventoryResourceRecordModel.location(), "us-south");
    assertEquals(inventoryResourceRecordModel.resourceGroup(), "testString");
    assertEquals(inventoryResourceRecordModel.inventoriesIni(), "testString");
    assertEquals(inventoryResourceRecordModel.resourceQueries(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .inventoryRecord(inventoryResourceRecordModel)
      .materializedInventory("testString")
      .build();
    assertEquals(jobDataActionModel.actionName(), "testString");
    assertEquals(jobDataActionModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(jobDataActionModel.inventoryRecord(), inventoryResourceRecordModel);
    assertEquals(jobDataActionModel.materializedInventory(), "testString");

    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
      .keyId("testString")
      .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobDataSystemModel.keyId(), "testString");
    assertEquals(jobDataSystemModel.schematicsResourceId(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobDataSystemModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .actionJobData(jobDataActionModel)
      .systemJobData(jobDataSystemModel)
      .build();
    assertEquals(jobDataModel.jobType(), "repo_download_job");
    assertEquals(jobDataModel.actionJobData(), jobDataActionModel);
    assertEquals(jobDataModel.systemJobData(), jobDataSystemModel);

    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
      .name("testString")
      .host("testString")
      .build();
    assertEquals(bastionResourceDefinitionModel.name(), "testString");
    assertEquals(bastionResourceDefinitionModel.host(), "testString");

    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.hosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("72.5"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummarySystemJobModel.success(), Double.valueOf("72.5"));
    assertEquals(jobLogSummarySystemJobModel.failed(), Double.valueOf("72.5"));

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .build();
    assertEquals(jobLogSummaryModel.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.repoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.actionJob(), jobLogSummaryActionJobModel);
    assertEquals(jobLogSummaryModel.systemJob(), jobLogSummarySystemJobModel);

    Job jobModel = new Job.Builder()
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("ansible_playbook_run")
      .commandParameter("testString")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .location("us-south")
      .status(jobStatusModel)
      .data(jobDataModel)
      .bastion(bastionResourceDefinitionModel)
      .logSummary(jobLogSummaryModel)
      .build();
    assertEquals(jobModel.commandObject(), "workspace");
    assertEquals(jobModel.commandObjectId(), "testString");
    assertEquals(jobModel.commandName(), "ansible_playbook_run");
    assertEquals(jobModel.commandParameter(), "testString");
    assertEquals(jobModel.commandOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobModel.location(), "us-south");
    assertEquals(jobModel.status(), jobStatusModel);
    assertEquals(jobModel.data(), jobDataModel);
    assertEquals(jobModel.bastion(), bastionResourceDefinitionModel);
    assertEquals(jobModel.logSummary(), jobLogSummaryModel);

    String json = TestUtilities.serialize(jobModel);

    Job jobModelNew = TestUtilities.deserialize(json, Job.class);
    assertTrue(jobModelNew instanceof Job);
    assertEquals(jobModelNew.commandObject(), "workspace");
    assertEquals(jobModelNew.commandObjectId(), "testString");
    assertEquals(jobModelNew.commandName(), "ansible_playbook_run");
    assertEquals(jobModelNew.commandParameter(), "testString");
    assertEquals(jobModelNew.location(), "us-south");
    assertEquals(jobModelNew.status().toString(), jobStatusModel.toString());
    assertEquals(jobModelNew.data().toString(), jobDataModel.toString());
    assertEquals(jobModelNew.bastion().toString(), bastionResourceDefinitionModel.toString());
    assertEquals(jobModelNew.logSummary().toString(), jobLogSummaryModel.toString());
  }
}