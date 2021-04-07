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

import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusAction model.
 */
public class JobStatusActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusAction() throws Throwable {
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

    String json = TestUtilities.serialize(jobStatusActionModel);

    JobStatusAction jobStatusActionModelNew = TestUtilities.deserialize(json, JobStatusAction.class);
    assertTrue(jobStatusActionModelNew instanceof JobStatusAction);
    assertEquals(jobStatusActionModelNew.actionName(), "testString");
    assertEquals(jobStatusActionModelNew.statusCode(), "job_pending");
    assertEquals(jobStatusActionModelNew.statusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModelNew.bastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.inventoryStatusCode(), "none");
    assertEquals(jobStatusActionModelNew.inventoryStatusMessage(), "testString");
    assertEquals(jobStatusActionModelNew.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
  }
}