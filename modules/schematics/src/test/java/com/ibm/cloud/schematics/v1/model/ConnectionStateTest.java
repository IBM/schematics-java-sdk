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

import com.ibm.cloud.schematics.v1.model.ConnectionState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConnectionState model.
 */
public class ConnectionStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConnectionState() throws Throwable {
    ConnectionState connectionStateModel = new ConnectionState.Builder()
      .state("Connected")
      .checkedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(connectionStateModel.state(), "Connected");
    assertEquals(connectionStateModel.checkedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(connectionStateModel);

    ConnectionState connectionStateModelNew = TestUtilities.deserialize(json, ConnectionState.class);
    assertTrue(connectionStateModelNew instanceof ConnectionState);
    assertEquals(connectionStateModelNew.state(), "Connected");
    assertEquals(connectionStateModelNew.checkedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}