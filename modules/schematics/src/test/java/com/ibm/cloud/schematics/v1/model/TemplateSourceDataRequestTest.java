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

import com.ibm.cloud.schematics.v1.model.EnvironmentValuesMetadata;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInner;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TftParametersObject;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateSourceDataRequest model.
 */
public class TemplateSourceDataRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateSourceDataRequest() throws Throwable {
    EnvironmentValuesMetadata environmentValuesMetadataModel = new EnvironmentValuesMetadata.Builder()
      .hidden(true)
      .name("name")
      .secure(true)
      .build();
    assertEquals(environmentValuesMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(environmentValuesMetadataModel.name(), "name");
    assertEquals(environmentValuesMetadataModel.secure(), Boolean.valueOf(true));

    TftParametersObject tftParametersObjectModel = new TftParametersObject.Builder()
      .name("name")
      .value("value")
      .build();
    assertEquals(tftParametersObjectModel.name(), "name");
    assertEquals(tftParametersObjectModel.value(), "value");

    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("tft_git_url")
      .tftGitToken("tft_git_token")
      .tftPrefix("tft_prefix")
      .injectionType("injection_type")
      .tftName("tft_name")
      .tftParameters(java.util.Arrays.asList(tftParametersObjectModel))
      .build();
    assertEquals(injectTerraformTemplateInnerModel.tftGitUrl(), "tft_git_url");
    assertEquals(injectTerraformTemplateInnerModel.tftGitToken(), "tft_git_token");
    assertEquals(injectTerraformTemplateInnerModel.tftPrefix(), "tft_prefix");
    assertEquals(injectTerraformTemplateInnerModel.injectionType(), "injection_type");
    assertEquals(injectTerraformTemplateInnerModel.tftName(), "tft_name");
    assertEquals(injectTerraformTemplateInnerModel.tftParameters(), java.util.Arrays.asList(tftParametersObjectModel));

    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("description")
      .name("name")
      .secure(true)
      .type("type")
      .useDefault(true)
      .value("value")
      .build();
    assertEquals(workspaceVariableRequestModel.description(), "description");
    assertEquals(workspaceVariableRequestModel.name(), "name");
    assertEquals(workspaceVariableRequestModel.secure(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.type(), "type");
    assertEquals(workspaceVariableRequestModel.useDefault(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.value(), "value");

    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .envValuesMetadata(java.util.Arrays.asList(environmentValuesMetadataModel))
      .folder("testString")
      .compact(true)
      .initStateFile("testString")
      .injectors(java.util.Arrays.asList(injectTerraformTemplateInnerModel))
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .variablestore(java.util.Arrays.asList(workspaceVariableRequestModel))
      .build();
    assertEquals(templateSourceDataRequestModel.envValues(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(templateSourceDataRequestModel.envValuesMetadata(), java.util.Arrays.asList(environmentValuesMetadataModel));
    assertEquals(templateSourceDataRequestModel.folder(), "testString");
    assertEquals(templateSourceDataRequestModel.compact(), Boolean.valueOf(true));
    assertEquals(templateSourceDataRequestModel.initStateFile(), "testString");
    assertEquals(templateSourceDataRequestModel.injectors(), java.util.Arrays.asList(injectTerraformTemplateInnerModel));
    assertEquals(templateSourceDataRequestModel.type(), "testString");
    assertEquals(templateSourceDataRequestModel.uninstallScriptName(), "testString");
    assertEquals(templateSourceDataRequestModel.values(), "testString");
    assertEquals(templateSourceDataRequestModel.valuesMetadata(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(templateSourceDataRequestModel.variablestore(), java.util.Arrays.asList(workspaceVariableRequestModel));

    String json = TestUtilities.serialize(templateSourceDataRequestModel);

    TemplateSourceDataRequest templateSourceDataRequestModelNew = TestUtilities.deserialize(json, TemplateSourceDataRequest.class);
    assertTrue(templateSourceDataRequestModelNew instanceof TemplateSourceDataRequest);
    assertEquals(templateSourceDataRequestModelNew.folder(), "testString");
    assertEquals(templateSourceDataRequestModelNew.compact(), Boolean.valueOf(true));
    assertEquals(templateSourceDataRequestModelNew.initStateFile(), "testString");
    assertEquals(templateSourceDataRequestModelNew.type(), "testString");
    assertEquals(templateSourceDataRequestModelNew.uninstallScriptName(), "testString");
    assertEquals(templateSourceDataRequestModelNew.values(), "testString");
  }
}