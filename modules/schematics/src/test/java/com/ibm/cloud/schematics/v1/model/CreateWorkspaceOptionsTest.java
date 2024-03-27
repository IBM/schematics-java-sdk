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

import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.Dependencies;
import com.ibm.cloud.schematics.v1.model.EnvironmentValuesMetadata;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInner;
import com.ibm.cloud.schematics.v1.model.InjectTerraformTemplateInnerTftParametersItem;
import com.ibm.cloud.schematics.v1.model.ServiceExtensions;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateWorkspaceOptions model.
 */
public class CreateWorkspaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateWorkspaceOptions() throws Throwable {
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();
    assertEquals(serviceExtensionsModel.name(), "flavor");
    assertEquals(serviceExtensionsModel.value(), "testString");
    assertEquals(serviceExtensionsModel.type(), "string");

    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .serviceExtensions(java.util.Arrays.asList(serviceExtensionsModel))
      .build();
    assertEquals(catalogRefModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogRefModel.owningAccount(), "testString");
    assertEquals(catalogRefModel.itemIconUrl(), "testString");
    assertEquals(catalogRefModel.itemId(), "testString");
    assertEquals(catalogRefModel.itemName(), "testString");
    assertEquals(catalogRefModel.itemReadmeUrl(), "testString");
    assertEquals(catalogRefModel.itemUrl(), "testString");
    assertEquals(catalogRefModel.launchUrl(), "testString");
    assertEquals(catalogRefModel.offeringVersion(), "testString");
    assertEquals(catalogRefModel.serviceExtensions(), java.util.Arrays.asList(serviceExtensionsModel));

    Dependencies dependenciesModel = new Dependencies.Builder()
      .parents(java.util.Arrays.asList("testString"))
      .children(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(dependenciesModel.parents(), java.util.Arrays.asList("testString"));
    assertEquals(dependenciesModel.children(), java.util.Arrays.asList("testString"));

    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();
    assertEquals(sharedTargetDataModel.clusterCreatedOn(), "testString");
    assertEquals(sharedTargetDataModel.clusterId(), "testString");
    assertEquals(sharedTargetDataModel.clusterName(), "testString");
    assertEquals(sharedTargetDataModel.clusterType(), "testString");
    assertEquals(sharedTargetDataModel.entitlementKeys(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(sharedTargetDataModel.namespace(), "testString");
    assertEquals(sharedTargetDataModel.region(), "testString");
    assertEquals(sharedTargetDataModel.resourceGroupId(), "testString");
    assertEquals(sharedTargetDataModel.workerCount(), Long.valueOf("26"));
    assertEquals(sharedTargetDataModel.workerMachineType(), "testString");

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

    TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();
    assertEquals(templateRepoRequestModel.branch(), "testString");
    assertEquals(templateRepoRequestModel.release(), "testString");
    assertEquals(templateRepoRequestModel.repoShaValue(), "testString");
    assertEquals(templateRepoRequestModel.repoUrl(), "testString");
    assertEquals(templateRepoRequestModel.url(), "testString");

    WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
      .frozen(true)
      .frozenAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(workspaceStatusRequestModel.frozen(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.frozenAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(workspaceStatusRequestModel.frozenBy(), "testString");
    assertEquals(workspaceStatusRequestModel.locked(), Boolean.valueOf(true));
    assertEquals(workspaceStatusRequestModel.lockedBy(), "testString");
    assertEquals(workspaceStatusRequestModel.lockedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    CreateWorkspaceOptions createWorkspaceOptionsModel = new CreateWorkspaceOptions.Builder()
      .appliedShareddataIds(java.util.Arrays.asList("testString"))
      .catalogRef(catalogRefModel)
      .dependencies(dependenciesModel)
      .description("testString")
      .location("testString")
      .name("testString")
      .resourceGroup("testString")
      .sharedData(sharedTargetDataModel)
      .tags(java.util.Arrays.asList("testString"))
      .templateData(java.util.Arrays.asList(templateSourceDataRequestModel))
      .templateRef("testString")
      .templateRepo(templateRepoRequestModel)
      .type(java.util.Arrays.asList("testString"))
      .workspaceStatus(workspaceStatusRequestModel)
      .agentId("testString")
      .xGithubToken("testString")
      .build();
    assertEquals(createWorkspaceOptionsModel.appliedShareddataIds(), java.util.Arrays.asList("testString"));
    assertEquals(createWorkspaceOptionsModel.catalogRef(), catalogRefModel);
    assertEquals(createWorkspaceOptionsModel.dependencies(), dependenciesModel);
    assertEquals(createWorkspaceOptionsModel.description(), "testString");
    assertEquals(createWorkspaceOptionsModel.location(), "testString");
    assertEquals(createWorkspaceOptionsModel.name(), "testString");
    assertEquals(createWorkspaceOptionsModel.resourceGroup(), "testString");
    assertEquals(createWorkspaceOptionsModel.sharedData(), sharedTargetDataModel);
    assertEquals(createWorkspaceOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(createWorkspaceOptionsModel.templateData(), java.util.Arrays.asList(templateSourceDataRequestModel));
    assertEquals(createWorkspaceOptionsModel.templateRef(), "testString");
    assertEquals(createWorkspaceOptionsModel.templateRepo(), templateRepoRequestModel);
    assertEquals(createWorkspaceOptionsModel.type(), java.util.Arrays.asList("testString"));
    assertEquals(createWorkspaceOptionsModel.workspaceStatus(), workspaceStatusRequestModel);
    assertEquals(createWorkspaceOptionsModel.agentId(), "testString");
    assertEquals(createWorkspaceOptionsModel.xGithubToken(), "testString");
  }
}