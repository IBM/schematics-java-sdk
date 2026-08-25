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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a Terraform output value with name, description, sensitivity, type, and value information.
 */
public class OutputValueDetail extends GenericModel {

  protected String name;
  protected String description;
  protected Boolean sensitive;
  protected Object type;
  protected Object value;

  protected OutputValueDetail() { }

  /**
   * Gets the name.
   *
   * The name of the output variable.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the output value.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the sensitive.
   *
   * Indicates whether the output value is sensitive.
   *
   * @return the sensitive
   */
  public Boolean isSensitive() {
    return sensitive;
  }

  /**
   * Gets the type.
   *
   * The data type of the output value (e.g., string, number, list, map).
   *
   * @return the type
   */
  public Object getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The actual output value (can be any type - string, number, object, array, etc.).
   *
   * @return the value
   */
  public Object getValue() {
    return value;
  }
}

