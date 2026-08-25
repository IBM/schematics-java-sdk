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

import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GitSource;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExternalSource model.
 */
public class ExternalSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExternalSource() throws Throwable {
    GitSource gitSourceModel = new GitSource.Builder()
      .computedGitRepoUrl("computed_git_repo_url")
      .gitRepoUrl("git_repo_url")
      .gitToken("git_token")
      .gitRepoFolder("git_repo_folder")
      .gitRelease("git_release")
      .gitBranch("git_branch")
      .build();
    assertEquals(gitSourceModel.computedGitRepoUrl(), "computed_git_repo_url");
    assertEquals(gitSourceModel.gitRepoUrl(), "git_repo_url");
    assertEquals(gitSourceModel.gitToken(), "git_token");
    assertEquals(gitSourceModel.gitRepoFolder(), "git_repo_folder");
    assertEquals(gitSourceModel.gitRelease(), "git_release");
    assertEquals(gitSourceModel.gitBranch(), "git_branch");

    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("catalog_name")
      .catalogId("catalog_id")
      .offeringName("offering_name")
      .offeringVersion("offering_version")
      .offeringKind("offering_kind")
      .offeringTargetKind("offering_target_kind")
      .offeringId("offering_id")
      .offeringVersionId("offering_version_id")
      .offeringVersionFlavourName("offering_version_flavour_name")
      .offeringRepoUrl("offering_repo_url")
      .offeringProvisionerWorkingDirectory("offering_provisioner_working_directory")
      .dryRun(true)
      .owningAccount("owning_account")
      .itemIconUrl("item_icon_url")
      .itemId("item_id")
      .itemName("item_name")
      .itemReadmeUrl("item_readme_url")
      .itemUrl("item_url")
      .launchUrl("launch_url")
      .build();
    assertEquals(catalogSourceModel.catalogName(), "catalog_name");
    assertEquals(catalogSourceModel.catalogId(), "catalog_id");
    assertEquals(catalogSourceModel.offeringName(), "offering_name");
    assertEquals(catalogSourceModel.offeringVersion(), "offering_version");
    assertEquals(catalogSourceModel.offeringKind(), "offering_kind");
    assertEquals(catalogSourceModel.offeringTargetKind(), "offering_target_kind");
    assertEquals(catalogSourceModel.offeringId(), "offering_id");
    assertEquals(catalogSourceModel.offeringVersionId(), "offering_version_id");
    assertEquals(catalogSourceModel.offeringVersionFlavourName(), "offering_version_flavour_name");
    assertEquals(catalogSourceModel.offeringRepoUrl(), "offering_repo_url");
    assertEquals(catalogSourceModel.offeringProvisionerWorkingDirectory(), "offering_provisioner_working_directory");
    assertEquals(catalogSourceModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogSourceModel.owningAccount(), "owning_account");
    assertEquals(catalogSourceModel.itemIconUrl(), "item_icon_url");
    assertEquals(catalogSourceModel.itemId(), "item_id");
    assertEquals(catalogSourceModel.itemName(), "item_name");
    assertEquals(catalogSourceModel.itemReadmeUrl(), "item_readme_url");
    assertEquals(catalogSourceModel.itemUrl(), "item_url");
    assertEquals(catalogSourceModel.launchUrl(), "launch_url");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(gitSourceModel)
      .catalog(catalogSourceModel)
      .build();
    assertEquals(externalSourceModel.sourceType(), "local");
    assertEquals(externalSourceModel.git(), gitSourceModel);
    assertEquals(externalSourceModel.catalog(), catalogSourceModel);

    String json = TestUtilities.serialize(externalSourceModel);

    ExternalSource externalSourceModelNew = TestUtilities.deserialize(json, ExternalSource.class);
    assertTrue(externalSourceModelNew instanceof ExternalSource);
    assertEquals(externalSourceModelNew.sourceType(), "local");
    assertEquals(externalSourceModelNew.git().toString(), gitSourceModel.toString());
    assertEquals(externalSourceModelNew.catalog().toString(), catalogSourceModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExternalSourceError() throws Throwable {
    new ExternalSource.Builder().build();
  }

}