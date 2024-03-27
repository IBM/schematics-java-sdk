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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An user editable metadata for the credential variables.
 */
public class CredentialVariableMetadata extends GenericModel {

  /**
   * Type of the variable.
   */
  public interface Type {
    /** string. */
    String STRING = "string";
    /** link. */
    String LINK = "link";
  }

  /**
   * The status of the link.
   */
  public interface LinkStatus {
    /** normal. */
    String NORMAL = "normal";
    /** broken. */
    String BROKEN = "broken";
  }

  protected String type;
  protected List<String> aliases;
  protected String description;
  @SerializedName("cloud_data_type")
  protected String cloudDataType;
  @SerializedName("default_value")
  protected String defaultValue;
  @SerializedName("link_status")
  protected String linkStatus;
  protected Boolean immutable;
  protected Boolean hidden;
  protected Boolean required;
  protected Long position;
  @SerializedName("group_by")
  protected String groupBy;
  protected String source;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> aliases;
    private String description;
    private String cloudDataType;
    private String defaultValue;
    private String linkStatus;
    private Boolean immutable;
    private Boolean hidden;
    private Boolean required;
    private Long position;
    private String groupBy;
    private String source;

    /**
     * Instantiates a new Builder from an existing CredentialVariableMetadata instance.
     *
     * @param credentialVariableMetadata the instance to initialize the Builder with
     */
    private Builder(CredentialVariableMetadata credentialVariableMetadata) {
      this.type = credentialVariableMetadata.type;
      this.aliases = credentialVariableMetadata.aliases;
      this.description = credentialVariableMetadata.description;
      this.cloudDataType = credentialVariableMetadata.cloudDataType;
      this.defaultValue = credentialVariableMetadata.defaultValue;
      this.linkStatus = credentialVariableMetadata.linkStatus;
      this.immutable = credentialVariableMetadata.immutable;
      this.hidden = credentialVariableMetadata.hidden;
      this.required = credentialVariableMetadata.required;
      this.position = credentialVariableMetadata.position;
      this.groupBy = credentialVariableMetadata.groupBy;
      this.source = credentialVariableMetadata.source;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CredentialVariableMetadata.
     *
     * @return the new CredentialVariableMetadata instance
     */
    public CredentialVariableMetadata build() {
      return new CredentialVariableMetadata(this);
    }

    /**
     * Adds a new element to aliases.
     *
     * @param aliases the new element to be added
     * @return the CredentialVariableMetadata builder
     */
    public Builder addAliases(String aliases) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(aliases,
        "aliases cannot be null");
      if (this.aliases == null) {
        this.aliases = new ArrayList<String>();
      }
      this.aliases.add(aliases);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CredentialVariableMetadata builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the aliases.
     * Existing aliases will be replaced.
     *
     * @param aliases the aliases
     * @return the CredentialVariableMetadata builder
     */
    public Builder aliases(List<String> aliases) {
      this.aliases = aliases;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CredentialVariableMetadata builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the cloudDataType.
     *
     * @param cloudDataType the cloudDataType
     * @return the CredentialVariableMetadata builder
     */
    public Builder cloudDataType(String cloudDataType) {
      this.cloudDataType = cloudDataType;
      return this;
    }

    /**
     * Set the defaultValue.
     *
     * @param defaultValue the defaultValue
     * @return the CredentialVariableMetadata builder
     */
    public Builder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     * Set the linkStatus.
     *
     * @param linkStatus the linkStatus
     * @return the CredentialVariableMetadata builder
     */
    public Builder linkStatus(String linkStatus) {
      this.linkStatus = linkStatus;
      return this;
    }

    /**
     * Set the immutable.
     *
     * @param immutable the immutable
     * @return the CredentialVariableMetadata builder
     */
    public Builder immutable(Boolean immutable) {
      this.immutable = immutable;
      return this;
    }

    /**
     * Set the hidden.
     *
     * @param hidden the hidden
     * @return the CredentialVariableMetadata builder
     */
    public Builder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    /**
     * Set the required.
     *
     * @param required the required
     * @return the CredentialVariableMetadata builder
     */
    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    /**
     * Set the position.
     *
     * @param position the position
     * @return the CredentialVariableMetadata builder
     */
    public Builder position(long position) {
      this.position = position;
      return this;
    }

    /**
     * Set the groupBy.
     *
     * @param groupBy the groupBy
     * @return the CredentialVariableMetadata builder
     */
    public Builder groupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CredentialVariableMetadata builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }
  }

  protected CredentialVariableMetadata() { }

  protected CredentialVariableMetadata(Builder builder) {
    type = builder.type;
    aliases = builder.aliases;
    description = builder.description;
    cloudDataType = builder.cloudDataType;
    defaultValue = builder.defaultValue;
    linkStatus = builder.linkStatus;
    immutable = builder.immutable;
    hidden = builder.hidden;
    required = builder.required;
    position = builder.position;
    groupBy = builder.groupBy;
    source = builder.source;
  }

  /**
   * New builder.
   *
   * @return a CredentialVariableMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of the variable.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the aliases.
   *
   * The list of aliases for the variable name.
   *
   * @return the aliases
   */
  public List<String> aliases() {
    return aliases;
  }

  /**
   * Gets the description.
   *
   * The description of the meta data.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the cloudDataType.
   *
   * Cloud data type of the credential variable. eg. api_key, iam_token, profile_id.
   *
   * @return the cloudDataType
   */
  public String cloudDataType() {
    return cloudDataType;
  }

  /**
   * Gets the defaultValue.
   *
   * Default value for the variable only if the override value is not specified.
   *
   * @return the defaultValue
   */
  public String defaultValue() {
    return defaultValue;
  }

  /**
   * Gets the linkStatus.
   *
   * The status of the link.
   *
   * @return the linkStatus
   */
  public String linkStatus() {
    return linkStatus;
  }

  /**
   * Gets the immutable.
   *
   * Is the variable readonly ?.
   *
   * @return the immutable
   */
  public Boolean immutable() {
    return immutable;
  }

  /**
   * Gets the hidden.
   *
   * If **true**, the variable is not displayed on UI or Command line.
   *
   * @return the hidden
   */
  public Boolean hidden() {
    return hidden;
  }

  /**
   * Gets the required.
   *
   * If the variable required?.
   *
   * @return the required
   */
  public Boolean required() {
    return required;
  }

  /**
   * Gets the position.
   *
   * The relative position of this variable in a list.
   *
   * @return the position
   */
  public Long position() {
    return position;
  }

  /**
   * Gets the groupBy.
   *
   * The display name of the group this variable belongs to.
   *
   * @return the groupBy
   */
  public String groupBy() {
    return groupBy;
  }

  /**
   * Gets the source.
   *
   * The source of this meta-data.
   *
   * @return the source
   */
  public String source() {
    return source;
  }
}

