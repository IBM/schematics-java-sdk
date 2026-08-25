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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the resources provisioned by the workspace template.
 */
public class TemplateResourcesObject extends GenericModel {

  protected String id;
  protected String folder;
  protected String type;
  @SerializedName("generated_at")
  protected String generatedAt;
  protected List<TemplateResourceItem> resources;
  @SerializedName("null_resources")
  protected List<TemplateResourceItem> nullResources;
  @SerializedName("resources_count")
  protected Long resourcesCount;

  protected TemplateResourcesObject() { }

  /**
   * Gets the id.
   *
   * The ID that was assigned to your Terraform template or IBM Cloud catalog software template.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the folder.
   *
   * The subfolder in GitHub or GitLab where your Terraform templates are stored. If your template is stored in the root
   * directory, `.` is returned.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

  /**
   * Gets the type.
   *
   * The Terraform version that was used to apply your template.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the generatedAt.
   *
   * Timestamp when the terraform resource information was last generated.
   *
   * @return the generatedAt
   */
  public String getGeneratedAt() {
    return generatedAt;
  }

  /**
   * Gets the resources.
   *
   * Information about the IBM Cloud resources that are associated with your workspace.
   *
   * @return the resources
   */
  public List<TemplateResourceItem> getResources() {
    return resources;
  }

  /**
   * Gets the nullResources.
   *
   * List of null resources.
   *
   * @return the nullResources
   */
  public List<TemplateResourceItem> getNullResources() {
    return nullResources;
  }

  /**
   * Gets the resourcesCount.
   *
   * Total count of resources provisioned.
   *
   * @return the resourcesCount
   */
  public Long getResourcesCount() {
    return resourcesCount;
  }
}

