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

import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobLogSummary model.
 */
public class JobLogSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummary() throws Throwable {
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
      .build();

    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
      .workspaceId("workspace_id")
      .jobId("job_id")
      .logUrl("log_url")
      .build();
    assertEquals(jobLogSummaryWorkitemsModel.workspaceId(), "workspace_id");
    assertEquals(jobLogSummaryWorkitemsModel.jobId(), "job_id");
    assertEquals(jobLogSummaryWorkitemsModel.logUrl(), "log_url");

    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
      .workitems(java.util.Arrays.asList(jobLogSummaryWorkitemsModel))
      .build();
    assertEquals(jobLogSummaryFlowJobModel.workitems(), java.util.Arrays.asList(jobLogSummaryWorkitemsModel));

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(java.util.Arrays.asList("target", "target", "target", "target", "target"))
      .ok(Double.valueOf("6.683562403749608"))
      .changed(Double.valueOf("8.762042012749001"))
      .failed(Double.valueOf("9.018348186070783"))
      .skipped(Double.valueOf("6.438423552598547"))
      .unreachable(Double.valueOf("3.5571952270680973"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), java.util.Arrays.asList("target", "target", "target", "target", "target"));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("6.683562403749608"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("8.762042012749001"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("9.018348186070783"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("6.438423552598547"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("3.5571952270680973"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
      .success(Double.valueOf("1.284659006116532"))
      .failed(Double.valueOf("2.8841621266687802"))
      .build();
    assertEquals(jobLogSummarySystemJobModel.success(), Double.valueOf("1.284659006116532"));
    assertEquals(jobLogSummarySystemJobModel.failed(), Double.valueOf("2.8841621266687802"));

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .workspaceJob(jobLogSummaryWorkspaceJobModel)
      .flowJob(jobLogSummaryFlowJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .systemJob(jobLogSummarySystemJobModel)
      .build();
    assertEquals(jobLogSummaryModel.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.repoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.workspaceJob(), jobLogSummaryWorkspaceJobModel);
    assertEquals(jobLogSummaryModel.flowJob(), jobLogSummaryFlowJobModel);
    assertEquals(jobLogSummaryModel.actionJob(), jobLogSummaryActionJobModel);
    assertEquals(jobLogSummaryModel.systemJob(), jobLogSummarySystemJobModel);

    String json = TestUtilities.serialize(jobLogSummaryModel);

    JobLogSummary jobLogSummaryModelNew = TestUtilities.deserialize(json, JobLogSummary.class);
    assertTrue(jobLogSummaryModelNew instanceof JobLogSummary);
    assertEquals(jobLogSummaryModelNew.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModelNew.repoDownloadJob().toString(), jobLogSummaryRepoDownloadJobModel.toString());
    assertEquals(jobLogSummaryModelNew.workspaceJob().toString(), jobLogSummaryWorkspaceJobModel.toString());
    assertEquals(jobLogSummaryModelNew.flowJob().toString(), jobLogSummaryFlowJobModel.toString());
    assertEquals(jobLogSummaryModelNew.actionJob().toString(), jobLogSummaryActionJobModel.toString());
    assertEquals(jobLogSummaryModelNew.systemJob().toString(), jobLogSummarySystemJobModel.toString());
  }
}