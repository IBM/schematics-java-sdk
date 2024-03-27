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

import com.ibm.cloud.schematics.v1.model.AgentInfrastructure;
import com.ibm.cloud.schematics.v1.model.AgentKPIData;
import com.ibm.cloud.schematics.v1.model.AgentMetadataInfo;
import com.ibm.cloud.schematics.v1.model.AgentUserState;
import com.ibm.cloud.schematics.v1.model.UpdateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAgentDataOptions model.
 */
public class UpdateAgentDataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAgentDataOptions() throws Throwable {
    AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
      .infraType("ibm_kubernetes")
      .clusterId("testString")
      .clusterResourceGroup("testString")
      .cosInstanceName("testString")
      .cosBucketName("testString")
      .cosBucketRegion("testString")
      .build();
    assertEquals(agentInfrastructureModel.infraType(), "ibm_kubernetes");
    assertEquals(agentInfrastructureModel.clusterId(), "testString");
    assertEquals(agentInfrastructureModel.clusterResourceGroup(), "testString");
    assertEquals(agentInfrastructureModel.cosInstanceName(), "testString");
    assertEquals(agentInfrastructureModel.cosBucketName(), "testString");
    assertEquals(agentInfrastructureModel.cosBucketRegion(), "testString");

    AgentMetadataInfo agentMetadataInfoModel = new AgentMetadataInfo.Builder()
      .name("purpose")
      .value(java.util.Arrays.asList("git", "terraform", "ansible"))
      .build();
    assertEquals(agentMetadataInfoModel.name(), "purpose");
    assertEquals(agentMetadataInfoModel.value(), java.util.Arrays.asList("git", "terraform", "ansible"));

    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("testString"))
      .description("testString")
      .cloudDataType("testString")
      .defaultValue("testString")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("testString"))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), java.util.Arrays.asList("testString"));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.cloudDataType(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.linkStatus(), "normal");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), java.util.Arrays.asList("testString"));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();
    assertEquals(agentUserStateModel.state(), "enable");

    AgentKPIData agentKpiDataModel = new AgentKPIData.Builder()
      .availabilityIndicator("available")
      .lifecycleIndicator("consistent")
      .percentUsageIndicator("testString")
      .applicationIndicators(java.util.Arrays.asList("testString"))
      .infraIndicators(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(agentKpiDataModel.availabilityIndicator(), "available");
    assertEquals(agentKpiDataModel.lifecycleIndicator(), "consistent");
    assertEquals(agentKpiDataModel.percentUsageIndicator(), "testString");
    assertEquals(agentKpiDataModel.applicationIndicators(), java.util.Arrays.asList("testString"));
    assertEquals(agentKpiDataModel.infraIndicators(), java.util.Arrays.asList("testString"));

    UpdateAgentDataOptions updateAgentDataOptionsModel = new UpdateAgentDataOptions.Builder()
      .agentId("testString")
      .name("MyDevAgent")
      .resourceGroup("Default")
      .version("v1.0.0")
      .schematicsLocation("us-south")
      .agentLocation("us-south")
      .agentInfrastructure(agentInfrastructureModel)
      .description("Create Agent")
      .tags(java.util.Arrays.asList("testString"))
      .agentMetadata(java.util.Arrays.asList(agentMetadataInfoModel))
      .agentInputs(java.util.Arrays.asList(variableDataModel))
      .userState(agentUserStateModel)
      .agentKpi(agentKpiDataModel)
      .refreshToken("testString")
      .build();
    assertEquals(updateAgentDataOptionsModel.agentId(), "testString");
    assertEquals(updateAgentDataOptionsModel.name(), "MyDevAgent");
    assertEquals(updateAgentDataOptionsModel.resourceGroup(), "Default");
    assertEquals(updateAgentDataOptionsModel.version(), "v1.0.0");
    assertEquals(updateAgentDataOptionsModel.schematicsLocation(), "us-south");
    assertEquals(updateAgentDataOptionsModel.agentLocation(), "us-south");
    assertEquals(updateAgentDataOptionsModel.agentInfrastructure(), agentInfrastructureModel);
    assertEquals(updateAgentDataOptionsModel.description(), "Create Agent");
    assertEquals(updateAgentDataOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(updateAgentDataOptionsModel.agentMetadata(), java.util.Arrays.asList(agentMetadataInfoModel));
    assertEquals(updateAgentDataOptionsModel.agentInputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(updateAgentDataOptionsModel.userState(), agentUserStateModel);
    assertEquals(updateAgentDataOptionsModel.agentKpi(), agentKpiDataModel);
    assertEquals(updateAgentDataOptionsModel.refreshToken(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAgentDataOptionsError() throws Throwable {
    new UpdateAgentDataOptions.Builder().build();
  }

}