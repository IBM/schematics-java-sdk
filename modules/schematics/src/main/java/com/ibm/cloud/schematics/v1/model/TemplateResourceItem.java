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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a single resource provisioned by Terraform.
 */
public class TemplateResourceItem extends GenericModel {

  @SerializedName("resource_id")
  protected String resourceId;
  @SerializedName("resource_name")
  protected String resourceName;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("resource_crn")
  protected String resourceCrn;
  @SerializedName("resource_icon_url")
  protected String resourceIconUrl;
  @SerializedName("resource_controller_url")
  protected String resourceControllerUrl;
  @SerializedName("resource_group_name")
  protected String resourceGroupName;
  @SerializedName("resource_status")
  protected String resourceStatus;
  @SerializedName("resource_tainted")
  protected Boolean resourceTainted;
  @SerializedName("resource_extension")
  protected TemplateResourceExtension resourceExtension;

  protected TemplateResourceItem() { }

  /**
   * Gets the resourceId.
   *
   * Unique identifier of the resource.
   *
   * @return the resourceId
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Gets the resourceName.
   *
   * Name of the resource.
   *
   * @return the resourceName
   */
  public String getResourceName() {
    return resourceName;
  }

  /**
   * Gets the resourceType.
   *
   * Type of the resource (e.g., ibm_compute_vm_instance).
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the resourceCrn.
   *
   * Cloud Resource Name (CRN) of the resource.
   *
   * @return the resourceCrn
   */
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Gets the resourceIconUrl.
   *
   * URL to the resource icon.
   *
   * @return the resourceIconUrl
   */
  public String getResourceIconUrl() {
    return resourceIconUrl;
  }

  /**
   * Gets the resourceControllerUrl.
   *
   * URL to the resource controller in IBM Cloud console.
   *
   * @return the resourceControllerUrl
   */
  public String getResourceControllerUrl() {
    return resourceControllerUrl;
  }

  /**
   * Gets the resourceGroupName.
   *
   * Name of the resource group.
   *
   * @return the resourceGroupName
   */
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  /**
   * Gets the resourceStatus.
   *
   * Current status of the resource.
   *
   * @return the resourceStatus
   */
  public String getResourceStatus() {
    return resourceStatus;
  }

  /**
   * Gets the resourceTainted.
   *
   * Flag indicating if the resource is tainted. The `resource_tainted` flag marks `true` when an instance times out
   * after few hours, if your resource provisioning takes longer duration. When you rerun the apply plan, based on the
   * `resource_taint` flag result the provisioning continues from the state where the provisioning has stopped.
   *
   * @return the resourceTainted
   */
  public Boolean isResourceTainted() {
    return resourceTainted;
  }

  /**
   * Gets the resourceExtension.
   *
   * Resource extension information.
   *
   * @return the resourceExtension
   */
  public TemplateResourceExtension getResourceExtension() {
    return resourceExtension;
  }
}

