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

import com.ibm.cloud.schematics.v1.model.EnvironmentValuesMetadata;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInner;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInnerTftParametersItem;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
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
      .name("testString")
      .secure(true)
      .build();
    assertEquals(environmentValuesMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(environmentValuesMetadataModel.name(), "testString");
    assertEquals(environmentValuesMetadataModel.secure(), Boolean.valueOf(true));

    InjectTerraformTemplateInnerTftParametersItem injectTerraformTemplateInnerTftParametersItemModel = new InjectTerraformTemplateInnerTftParametersItem.Builder()
      .name("testString")
      .value("testString")
      .build();
    assertEquals(injectTerraformTemplateInnerTftParametersItemModel.name(), "testString");
    assertEquals(injectTerraformTemplateInnerTftParametersItemModel.value(), "testString");

    InjectTerraformTemplateInner injectTerraformTemplateInnerModel = new InjectTerraformTemplateInner.Builder()
      .tftGitUrl("testString")
      .tftGitToken("testString")
      .tftPrefix("testString")
      .injectionType("testString")
      .tftName("testString")
      .tftParameters(java.util.Arrays.asList(injectTerraformTemplateInnerTftParametersItemModel))
      .build();
    assertEquals(injectTerraformTemplateInnerModel.tftGitUrl(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftGitToken(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftPrefix(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.injectionType(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftName(), "testString");
    assertEquals(injectTerraformTemplateInnerModel.tftParameters(), java.util.Arrays.asList(injectTerraformTemplateInnerTftParametersItemModel));

    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();
    assertEquals(workspaceVariableRequestModel.description(), "testString");
    assertEquals(workspaceVariableRequestModel.name(), "testString");
    assertEquals(workspaceVariableRequestModel.secure(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.type(), "testString");
    assertEquals(workspaceVariableRequestModel.useDefault(), Boolean.valueOf(true));
    assertEquals(workspaceVariableRequestModel.value(), "testString");

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