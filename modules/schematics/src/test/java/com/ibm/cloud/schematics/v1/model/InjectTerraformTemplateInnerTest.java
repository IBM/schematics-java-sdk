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

import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInner;
import com.ibm.cloud.schematics.v1.model.TftParametersObject;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InjectTerraformTemplateInner model.
 */
public class InjectTerraformTemplateInnerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInjectTerraformTemplateInner() throws Throwable {
    TftParametersObject tftParametersObjectModel = new TftParametersObject.Builder()
      .name("name")
      .value("value")
      .build();
    assertEquals(tftParametersObjectModel.name(), "name");
    assertEquals(tftParametersObjectModel.value(), "value");

    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("testString")
      .tftGitToken("testString")
      .tftPrefix("testString")
      .injectionType("testString")
      .tftName("testString")
      .tftParameters(java.util.Arrays.asList(tftParametersObjectModel))
      .build();
    assertEquals(injectTerraformTemplateInnerModel.tftGitUrl(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftGitToken(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftPrefix(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.injectionType(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftName(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftParameters(), java.util.Arrays.asList(tftParametersObjectModel));

    String json = TestUtilities.serialize(injectTerraformTemplateInnerModel);

    InjectTerraformTemplateInner injectTerraformTemplateInnerModelNew = TestUtilities.deserialize(json, InjectTerraformTemplateInner.class);
    assertTrue(injectTerraformTemplateInnerModelNew instanceof InjectTerraformTemplateInner);
    assertEquals(injectTerraformTemplateInnerModelNew.tftGitUrl(), "testString");
    assertEquals(injectTerraformTemplateInnerModelNew.tftGitToken(), "testString");
    assertEquals(injectTerraformTemplateInnerModelNew.tftPrefix(), "testString");
    assertEquals(injectTerraformTemplateInnerModelNew.injectionType(), "testString");
    assertEquals(injectTerraformTemplateInnerModelNew.tftName(), "testString");
  }
}