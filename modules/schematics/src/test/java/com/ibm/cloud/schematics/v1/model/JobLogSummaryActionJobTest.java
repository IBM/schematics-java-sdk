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

import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobLogSummaryActionJob model.
 */
public class JobLogSummaryActionJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobLogSummaryActionJob() throws Throwable {
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

    String json = TestUtilities.serialize(jobLogSummaryActionJobModel);

    JobLogSummaryActionJob jobLogSummaryActionJobModelNew = TestUtilities.deserialize(json, JobLogSummaryActionJob.class);
    assertTrue(jobLogSummaryActionJobModelNew instanceof JobLogSummaryActionJob);
    assertEquals(jobLogSummaryActionJobModelNew.recap().toString(), jobLogSummaryActionJobRecapModel.toString());
  }
}