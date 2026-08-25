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

import com.ibm.cloud.schematics.v1.model.AgentData;
import com.ibm.cloud.schematics.v1.model.AgentInfrastructure;
import com.ibm.cloud.schematics.v1.model.AgentKPIData;
import com.ibm.cloud.schematics.v1.model.AgentMetadataInfo;
import com.ibm.cloud.schematics.v1.model.AgentUserState;
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
 * Unit test class for the AgentData model.
 */
public class AgentDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAgentData() throws Throwable {
    AgentInfrastructure agentInfrastructureModel = new AgentInfrastructure.Builder()
      .infraType("ibm_kubernetes")
      .clusterId("cluster_id")
      .clusterResourceGroup("cluster_resource_group")
      .cosInstanceName("cos_instance_name")
      .cosBucketName("cos_bucket_name")
      .cosBucketRegion("cos_bucket_region")
      .build();
    assertEquals(agentInfrastructureModel.infraType(), "ibm_kubernetes");
    assertEquals(agentInfrastructureModel.clusterId(), "cluster_id");
    assertEquals(agentInfrastructureModel.clusterResourceGroup(), "cluster_resource_group");
    assertEquals(agentInfrastructureModel.cosInstanceName(), "cos_instance_name");
    assertEquals(agentInfrastructureModel.cosBucketName(), "cos_bucket_name");
    assertEquals(agentInfrastructureModel.cosBucketRegion(), "cos_bucket_region");

    AgentMetadataInfo agentMetadataInfoModel = new AgentMetadataInfo.Builder()
      .name("purpose")
      .value(java.util.Arrays.asList("git", "terraform", "ansible"))
      .build();
    assertEquals(agentMetadataInfoModel.name(), "purpose");
    assertEquals(agentMetadataInfoModel.value(), java.util.Arrays.asList("git", "terraform", "ansible"));

    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"))
      .description("description")
      .cloudDataType("cloud_data_type")
      .defaultValue("default_value")
      .linkStatus("normal")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .required(true)
      .options(java.util.Arrays.asList("options", "options", "options", "options", "options"))
      .minValue(Long.valueOf("5962"))
      .maxValue(Long.valueOf("5637"))
      .minLength(Long.valueOf("2302"))
      .maxLength(Long.valueOf("7061"))
      .matches("matches")
      .position(Long.valueOf("9301"))
      .groupBy("group_by")
      .source("source")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), java.util.Arrays.asList("aliases", "aliases", "aliases", "aliases", "aliases"));
    assertEquals(variableMetadataModel.description(), "description");
    assertEquals(variableMetadataModel.cloudDataType(), "cloud_data_type");
    assertEquals(variableMetadataModel.defaultValue(), "default_value");
    assertEquals(variableMetadataModel.linkStatus(), "normal");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.required(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), java.util.Arrays.asList("options", "options", "options", "options", "options"));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("5962"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("5637"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("2302"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("7061"));
    assertEquals(variableMetadataModel.matches(), "matches");
    assertEquals(variableMetadataModel.position(), Long.valueOf("9301"));
    assertEquals(variableMetadataModel.groupBy(), "group_by");
    assertEquals(variableMetadataModel.source(), "source");

    VariableData variableDataModel = new VariableData.Builder()
      .name("name")
      .value("value")
      .useDefault(true)
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "name");
    assertEquals(variableDataModel.value(), "value");
    assertEquals(variableDataModel.useDefault(), Boolean.valueOf(true));
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    AgentUserState agentUserStateModel = new AgentUserState.Builder()
      .state("enable")
      .build();
    assertEquals(agentUserStateModel.state(), "enable");

    AgentKPIData agentKpiDataModel = new AgentKPIData.Builder()
      .availabilityIndicator("available")
      .lifecycleIndicator("consistent")
      .percentUsageIndicator("percent_usage_indicator")
      .applicationIndicators(java.util.Arrays.asList("", "", "", "", ""))
      .infraIndicators(java.util.Arrays.asList("", "", "", "", ""))
      .build();
    assertEquals(agentKpiDataModel.availabilityIndicator(), "available");
    assertEquals(agentKpiDataModel.lifecycleIndicator(), "consistent");
    assertEquals(agentKpiDataModel.percentUsageIndicator(), "percent_usage_indicator");
    assertEquals(agentKpiDataModel.applicationIndicators(), java.util.Arrays.asList("", "", "", "", ""));
    assertEquals(agentKpiDataModel.infraIndicators(), java.util.Arrays.asList("", "", "", "", ""));

    AgentData agentDataModel = new AgentData.Builder()
      .name("MyDevAgent")
      .description("Create Agent")
      .resourceGroup("Default")
      .tags(java.util.Arrays.asList("testString"))
      .version("v1.0.0")
      .schematicsLocation("us-south")
      .agentLocation("us-south")
      .agentInfrastructure(agentInfrastructureModel)
      .agentMetadata(java.util.Arrays.asList(agentMetadataInfoModel))
      .agentInputs(java.util.Arrays.asList(variableDataModel))
      .userState(agentUserStateModel)
      .agentKpi(agentKpiDataModel)
      .build();
    assertEquals(agentDataModel.name(), "MyDevAgent");
    assertEquals(agentDataModel.description(), "Create Agent");
    assertEquals(agentDataModel.resourceGroup(), "Default");
    assertEquals(agentDataModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(agentDataModel.version(), "v1.0.0");
    assertEquals(agentDataModel.schematicsLocation(), "us-south");
    assertEquals(agentDataModel.agentLocation(), "us-south");
    assertEquals(agentDataModel.agentInfrastructure(), agentInfrastructureModel);
    assertEquals(agentDataModel.agentMetadata(), java.util.Arrays.asList(agentMetadataInfoModel));
    assertEquals(agentDataModel.agentInputs(), java.util.Arrays.asList(variableDataModel));
    assertEquals(agentDataModel.userState(), agentUserStateModel);
    assertEquals(agentDataModel.agentKpi(), agentKpiDataModel);

    String json = TestUtilities.serialize(agentDataModel);

    AgentData agentDataModelNew = TestUtilities.deserialize(json, AgentData.class);
    assertTrue(agentDataModelNew instanceof AgentData);
    assertEquals(agentDataModelNew.name(), "MyDevAgent");
    assertEquals(agentDataModelNew.description(), "Create Agent");
    assertEquals(agentDataModelNew.resourceGroup(), "Default");
    assertEquals(agentDataModelNew.version(), "v1.0.0");
    assertEquals(agentDataModelNew.schematicsLocation(), "us-south");
    assertEquals(agentDataModelNew.agentLocation(), "us-south");
    assertEquals(agentDataModelNew.agentInfrastructure().toString(), agentInfrastructureModel.toString());
    assertEquals(agentDataModelNew.userState().toString(), agentUserStateModel.toString());
    assertEquals(agentDataModelNew.agentKpi().toString(), agentKpiDataModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAgentDataError() throws Throwable {
    new AgentData.Builder().build();
  }

}