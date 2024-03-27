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

import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GitSource model.
 */
public class GitSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGitSource() throws Throwable {
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("testString")
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();
    assertEquals(gitSourceModel.computedGitRepoUrl(), "testString");
    assertEquals(gitSourceModel.gitRepoUrl(), "testString");
    assertEquals(gitSourceModel.gitToken(), "testString");
    assertEquals(gitSourceModel.gitRepoFolder(), "testString");
    assertEquals(gitSourceModel.gitRelease(), "testString");
    assertEquals(gitSourceModel.gitBranch(), "testString");

    String json = TestUtilities.serialize(gitSourceModel);

    GitSource gitSourceModelNew = TestUtilities.deserialize(json, GitSource.class);
    assertTrue(gitSourceModelNew instanceof GitSource);
    assertEquals(gitSourceModelNew.computedGitRepoUrl(), "testString");
    assertEquals(gitSourceModelNew.gitRepoUrl(), "testString");
    assertEquals(gitSourceModelNew.gitToken(), "testString");
    assertEquals(gitSourceModelNew.gitRepoFolder(), "testString");
    assertEquals(gitSourceModelNew.gitRelease(), "testString");
    assertEquals(gitSourceModelNew.gitBranch(), "testString");
  }
}