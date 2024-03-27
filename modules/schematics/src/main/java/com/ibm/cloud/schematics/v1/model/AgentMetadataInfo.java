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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AgentMetadataInfo.
 */
public class AgentMetadataInfo extends GenericModel {

  protected String name;
  protected List<String> value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> value;

    /**
     * Instantiates a new Builder from an existing AgentMetadataInfo instance.
     *
     * @param agentMetadataInfo the instance to initialize the Builder with
     */
    private Builder(AgentMetadataInfo agentMetadataInfo) {
      this.name = agentMetadataInfo.name;
      this.value = agentMetadataInfo.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentMetadataInfo.
     *
     * @return the new AgentMetadataInfo instance
     */
    public AgentMetadataInfo build() {
      return new AgentMetadataInfo(this);
    }

    /**
     * Adds a new element to value.
     *
     * @param value the new element to be added
     * @return the AgentMetadataInfo builder
     */
    public Builder addValue(String value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(value,
        "value cannot be null");
      if (this.value == null) {
        this.value = new ArrayList<String>();
      }
      this.value.add(value);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the AgentMetadataInfo builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     * Existing value will be replaced.
     *
     * @param value the value
     * @return the AgentMetadataInfo builder
     */
    public Builder value(List<String> value) {
      this.value = value;
      return this;
    }
  }

  protected AgentMetadataInfo() { }

  protected AgentMetadataInfo(Builder builder) {
    name = builder.name;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a AgentMetadataInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the metadata.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value of the metadata name.
   *
   * @return the value
   */
  public List<String> value() {
    return value;
  }
}

