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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Environment variables metadata.
 */
public class EnvironmentValuesMetadata extends GenericModel {

  protected Boolean hidden;
  protected String name;
  protected Boolean secure;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean hidden;
    private String name;
    private Boolean secure;

    /**
     * Instantiates a new Builder from an existing EnvironmentValuesMetadata instance.
     *
     * @param environmentValuesMetadata the instance to initialize the Builder with
     */
    private Builder(EnvironmentValuesMetadata environmentValuesMetadata) {
      this.hidden = environmentValuesMetadata.hidden;
      this.name = environmentValuesMetadata.name;
      this.secure = environmentValuesMetadata.secure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnvironmentValuesMetadata.
     *
     * @return the new EnvironmentValuesMetadata instance
     */
    public EnvironmentValuesMetadata build() {
      return new EnvironmentValuesMetadata(this);
    }

    /**
     * Set the hidden.
     *
     * @param hidden the hidden
     * @return the EnvironmentValuesMetadata builder
     */
    public Builder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EnvironmentValuesMetadata builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the secure.
     *
     * @param secure the secure
     * @return the EnvironmentValuesMetadata builder
     */
    public Builder secure(Boolean secure) {
      this.secure = secure;
      return this;
    }
  }

  protected EnvironmentValuesMetadata() { }

  protected EnvironmentValuesMetadata(Builder builder) {
    hidden = builder.hidden;
    name = builder.name;
    secure = builder.secure;
  }

  /**
   * New builder.
   *
   * @return a EnvironmentValuesMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hidden.
   *
   * Environment variable is hidden.
   *
   * @return the hidden
   */
  public Boolean hidden() {
    return hidden;
  }

  /**
   * Gets the name.
   *
   * Environment variable name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the secure.
   *
   * Environment variable is secure.
   *
   * @return the secure
   */
  public Boolean secure() {
    return secure;
  }
}

