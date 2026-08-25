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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Resource extension information.
 */
public class TemplateResourceExtension extends GenericModel {

  @SerializedName("resource_name")
  protected String resourceName;
  @SerializedName("resource_data_array")
  protected List<Map<String, Object>> resourceDataArray;
  @SerializedName("resource_type")
  protected String resourceType;

  protected TemplateResourceExtension() { }

  /**
   * Gets the resourceName.
   *
   * Name of the resource extension.
   *
   * @return the resourceName
   */
  public String getResourceName() {
    return resourceName;
  }

  /**
   * Gets the resourceDataArray.
   *
   * Array of resource data.
   *
   * @return the resourceDataArray
   */
  public List<Map<String, Object>> getResourceDataArray() {
    return resourceDataArray;
  }

  /**
   * Gets the resourceType.
   *
   * Type of the resource extension.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

