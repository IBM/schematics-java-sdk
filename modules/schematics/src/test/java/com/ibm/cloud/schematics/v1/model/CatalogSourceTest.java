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

import com.ibm.cloud.schematics.v1.model.CatalogSource;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogSource model.
 */
public class CatalogSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogSource() throws Throwable {
    CatalogSource catalogSourceModel = new CatalogSource.Builder()
      .catalogName("testString")
      .catalogId("testString")
      .offeringName("testString")
      .offeringVersion("testString")
      .offeringKind("testString")
      .offeringTargetKind("testString")
      .offeringId("testString")
      .offeringVersionId("testString")
      .offeringVersionFlavourName("testString")
      .offeringRepoUrl("testString")
      .offeringProvisionerWorkingDirectory("testString")
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .build();
    assertEquals(catalogSourceModel.catalogName(), "testString");
    assertEquals(catalogSourceModel.catalogId(), "testString");
    assertEquals(catalogSourceModel.offeringName(), "testString");
    assertEquals(catalogSourceModel.offeringVersion(), "testString");
    assertEquals(catalogSourceModel.offeringKind(), "testString");
    assertEquals(catalogSourceModel.offeringTargetKind(), "testString");
    assertEquals(catalogSourceModel.offeringId(), "testString");
    assertEquals(catalogSourceModel.offeringVersionId(), "testString");
    assertEquals(catalogSourceModel.offeringVersionFlavourName(), "testString");
    assertEquals(catalogSourceModel.offeringRepoUrl(), "testString");
    assertEquals(catalogSourceModel.offeringProvisionerWorkingDirectory(), "testString");
    assertEquals(catalogSourceModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogSourceModel.owningAccount(), "testString");
    assertEquals(catalogSourceModel.itemIconUrl(), "testString");
    assertEquals(catalogSourceModel.itemId(), "testString");
    assertEquals(catalogSourceModel.itemName(), "testString");
    assertEquals(catalogSourceModel.itemReadmeUrl(), "testString");
    assertEquals(catalogSourceModel.itemUrl(), "testString");
    assertEquals(catalogSourceModel.launchUrl(), "testString");

    String json = TestUtilities.serialize(catalogSourceModel);

    CatalogSource catalogSourceModelNew = TestUtilities.deserialize(json, CatalogSource.class);
    assertTrue(catalogSourceModelNew instanceof CatalogSource);
    assertEquals(catalogSourceModelNew.catalogName(), "testString");
    assertEquals(catalogSourceModelNew.catalogId(), "testString");
    assertEquals(catalogSourceModelNew.offeringName(), "testString");
    assertEquals(catalogSourceModelNew.offeringVersion(), "testString");
    assertEquals(catalogSourceModelNew.offeringKind(), "testString");
    assertEquals(catalogSourceModelNew.offeringTargetKind(), "testString");
    assertEquals(catalogSourceModelNew.offeringId(), "testString");
    assertEquals(catalogSourceModelNew.offeringVersionId(), "testString");
    assertEquals(catalogSourceModelNew.offeringVersionFlavourName(), "testString");
    assertEquals(catalogSourceModelNew.offeringRepoUrl(), "testString");
    assertEquals(catalogSourceModelNew.offeringProvisionerWorkingDirectory(), "testString");
    assertEquals(catalogSourceModelNew.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogSourceModelNew.owningAccount(), "testString");
    assertEquals(catalogSourceModelNew.itemIconUrl(), "testString");
    assertEquals(catalogSourceModelNew.itemId(), "testString");
    assertEquals(catalogSourceModelNew.itemName(), "testString");
    assertEquals(catalogSourceModelNew.itemReadmeUrl(), "testString");
    assertEquals(catalogSourceModelNew.itemUrl(), "testString");
    assertEquals(catalogSourceModelNew.launchUrl(), "testString");
  }
}