/*
 * (C) Copyright IBM Corp. 2020.
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
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
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
 * Unit test class for the JobLogSummary model.
 */
public class JobLogSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummary() throws Throwable {
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("72.5"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .build();
    assertEquals(jobLogSummaryModel.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.repoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.actionJob(), jobLogSummaryActionJobModel);

    String json = TestUtilities.serialize(jobLogSummaryModel);

    JobLogSummary jobLogSummaryModelNew = TestUtilities.deserialize(json, JobLogSummary.class);
    assertTrue(jobLogSummaryModelNew instanceof JobLogSummary);
    assertEquals(jobLogSummaryModelNew.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModelNew.repoDownloadJob().toString(), jobLogSummaryRepoDownloadJobModel.toString());
    assertEquals(jobLogSummaryModelNew.actionJob().toString(), jobLogSummaryActionJobModel.toString());
  }
}