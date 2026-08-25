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
 * Information about input variables and its metadata for the workspace.
 */
public class TemplateMetadataObject extends GenericModel {

  protected String name;
  protected String type;
  protected String source;
  @SerializedName("default")
  protected String xDefault;
  @SerializedName("override_value")
  protected String overrideValue;
  @SerializedName("var_aliases")
  protected List<String> varAliases;
  @SerializedName("var_ref")
  protected String varRef;
  protected List<String> options;
  protected String matches;
  protected Boolean secure;
  protected Boolean hidden;
  protected Boolean immutable;
  @SerializedName("min_value")
  protected String minValue;
  @SerializedName("max_value")
  protected String maxValue;
  @SerializedName("min_value_len")
  protected String minValueLen;
  @SerializedName("max_value_len")
  protected String maxValueLen;
  protected String description;
  @SerializedName("sort_order")
  protected Long sortOrder;
  @SerializedName("group_by")
  protected String groupBy;
  @SerializedName("force_new")
  protected Boolean forceNew;
  @SerializedName("metadata_value_key")
  protected String metadataValueKey;

  protected TemplateMetadataObject() { }

  /**
   * Gets the name.
   *
   * Name of the variable.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Type of the variable.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the source.
   *
   * Source of variable.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the xDefault.
   *
   * The variable's default value.
   *
   * @return the xDefault
   */
  public String getXDefault() {
    return xDefault;
  }

  /**
   * Gets the overrideValue.
   *
   * The variable's override value.
   *
   * @return the overrideValue
   */
  public String getOverrideValue() {
    return overrideValue;
  }

  /**
   * Gets the varAliases.
   *
   * Alias names for the variable.
   *
   * @return the varAliases
   */
  public List<String> getVarAliases() {
    return varAliases;
  }

  /**
   * Gets the varRef.
   *
   * Reference to the value for the variable.
   *
   * @return the varRef
   */
  public String getVarRef() {
    return varRef;
  }

  /**
   * Gets the options.
   *
   * List of possible string values for the variable.
   *
   * @return the options
   */
  public List<String> getOptions() {
    return options;
  }

  /**
   * Gets the matches.
   *
   * The Regex for the variable value.
   *
   * @return the matches
   */
  public String getMatches() {
    return matches;
  }

  /**
   * Gets the secure.
   *
   * Is the Variable is sensitive.
   *
   * @return the secure
   */
  public Boolean isSecure() {
    return secure;
  }

  /**
   * Gets the hidden.
   *
   * Is the Variable is hidden.
   *
   * @return the hidden
   */
  public Boolean isHidden() {
    return hidden;
  }

  /**
   * Gets the immutable.
   *
   * Is the Variable is readonly.
   *
   * @return the immutable
   */
  public Boolean isImmutable() {
    return immutable;
  }

  /**
   * Gets the minValue.
   *
   * Minimum value of variable.
   *
   * @return the minValue
   */
  public String getMinValue() {
    return minValue;
  }

  /**
   * Gets the maxValue.
   *
   * Maximum value of variable.
   *
   * @return the maxValue
   */
  public String getMaxValue() {
    return maxValue;
  }

  /**
   * Gets the minValueLen.
   *
   * Minimum length of variable value.
   *
   * @return the minValueLen
   */
  public String getMinValueLen() {
    return minValueLen;
  }

  /**
   * Gets the maxValueLen.
   *
   * Maximum length of variable value.
   *
   * @return the maxValueLen
   */
  public String getMaxValueLen() {
    return maxValueLen;
  }

  /**
   * Gets the description.
   *
   * Description of the variable.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the sortOrder.
   *
   * Display sort order for variables.
   *
   * @return the sortOrder
   */
  public Long getSortOrder() {
    return sortOrder;
  }

  /**
   * Gets the groupBy.
   *
   * Display group name for the variables.
   *
   * @return the groupBy
   */
  public String getGroupBy() {
    return groupBy;
  }

  /**
   * Gets the forceNew.
   *
   * Indicate resources will be recreated if the value is changed.
   *
   * @return the forceNew
   */
  public Boolean isForceNew() {
    return forceNew;
  }

  /**
   * Gets the metadataValueKey.
   *
   * The object storage ID for values in options &amp; default_value in MetadataValue.
   *
   * @return the metadataValueKey
   */
  public String getMetadataValueKey() {
    return metadataValueKey;
  }
}

