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

import com.ibm.cloud.schematics.v1.model.JobFileContent;
import com.ibm.cloud.schematics.v1.model.JobFileData;
import com.ibm.cloud.schematics.v1.model.JobFileDataSummary;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobFileData model.
 */
public class JobFileDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobFileData() throws Throwable {
    JobFileData jobFileDataModel = new JobFileData();
    assertNull(jobFileDataModel.getJobId());
    assertNull(jobFileDataModel.getJobName());
    assertNull(jobFileDataModel.getSummary());
    assertNull(jobFileDataModel.getFileType());
    assertNull(jobFileDataModel.getFileContent());
    assertNull(jobFileDataModel.getAdditionalFiles());
    assertNull(jobFileDataModel.getUpdatedAt());
  }
}