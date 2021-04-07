/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VersionResponse -.
 */
public class VersionResponse extends GenericModel {

  protected String builddate;
  protected String buildno;
  protected String commitsha;
  @SerializedName("helm_provider_version")
  protected String helmProviderVersion;
  @SerializedName("helm_version")
  protected String helmVersion;
  @SerializedName("supported_template_types")
  protected Map<String, Object> supportedTemplateTypes;
  @SerializedName("terraform_provider_version")
  protected String terraformProviderVersion;
  @SerializedName("terraform_version")
  protected String terraformVersion;

  /**
   * Gets the builddate.
   *
   * Build data.
   *
   * @return the builddate
   */
  public String getBuilddate() {
    return builddate;
  }

  /**
   * Gets the buildno.
   *
   * Build number.
   *
   * @return the buildno
   */
  public String getBuildno() {
    return buildno;
  }

  /**
   * Gets the commitsha.
   *
   * Commit SHA.
   *
   * @return the commitsha
   */
  public String getCommitsha() {
    return commitsha;
  }

  /**
   * Gets the helmProviderVersion.
   *
   * Version number of 'Helm provider for Terraform'.
   *
   * @return the helmProviderVersion
   */
  public String getHelmProviderVersion() {
    return helmProviderVersion;
  }

  /**
   * Gets the helmVersion.
   *
   * Helm Version.
   *
   * @return the helmVersion
   */
  public String getHelmVersion() {
    return helmVersion;
  }

  /**
   * Gets the supportedTemplateTypes.
   *
   * Supported template types.
   *
   * @return the supportedTemplateTypes
   */
  public Map<String, Object> getSupportedTemplateTypes() {
    return supportedTemplateTypes;
  }

  /**
   * Gets the terraformProviderVersion.
   *
   * Terraform provider versions.
   *
   * @return the terraformProviderVersion
   */
  public String getTerraformProviderVersion() {
    return terraformProviderVersion;
  }

  /**
   * Gets the terraformVersion.
   *
   * Terraform versions.
   *
   * @return the terraformVersion
   */
  public String getTerraformVersion() {
    return terraformVersion;
  }
}

