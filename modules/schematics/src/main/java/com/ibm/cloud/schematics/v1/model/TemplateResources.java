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

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the resources provisioned by the Terraform template.
 */
public class TemplateResources extends GenericModel {

  protected String folder;
  protected String id;
  @SerializedName("generated_at")
  protected Date generatedAt;
  @SerializedName("null_resources")
  protected List<Map<String, Object>> nullResources;
  @SerializedName("related_resources")
  protected List<Map<String, Object>> relatedResources;
  protected List<Map<String, Object>> resources;
  @SerializedName("resources_count")
  protected Long resourcesCount;
  protected String type;

  protected TemplateResources() { }

  /**
   * Gets the folder.
   *
   * The subfolder in GitHub or GitLab where your Terraform templates are stored.  If your template is stored in the
   * root directory, `.` is returned.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

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
   * Gets the generatedAt.
   *
   * Last refreshed timestamp of the terraform resource.
   *
   * @return the generatedAt
   */
  public Date getGeneratedAt() {
    return generatedAt;
  }

  /**
   * Gets the nullResources.
   *
   * List of null resources.
   *
   * @return the nullResources
   */
  public List<Map<String, Object>> getNullResources() {
    return nullResources;
  }

  /**
   * Gets the relatedResources.
   *
   * Information about the IBM Cloud resources that are associated with your workspace.
   *
   * @return the relatedResources
   */
  public List<Map<String, Object>> getRelatedResources() {
    return relatedResources;
  }

  /**
   * Gets the resources.
   *
   * Information about the IBM Cloud resources that are associated with your workspace. **Note** The `resource_tainted`
   * flag marks `true` when an instance is times out after few hours, if your resource provisioning takes longer
   * duration. When you rerun the apply plan, based on the `resource_taint` flag result the provisioning continues from
   * the state where the provisioning has stopped.
   *
   * @return the resources
   */
  public List<Map<String, Object>> getResources() {
    return resources;
  }

  /**
   * Gets the resourcesCount.
   *
   * Number of resources.
   *
   * @return the resourcesCount
   */
  public Long getResourcesCount() {
    return resourcesCount;
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
}

