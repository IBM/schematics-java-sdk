/*
 * (C) Copyright IBM Corp. 2025.
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
 * The getHealthCheckAgentJob options.
 */
public class GetHealthCheckAgentJobOptions extends GenericModel {

  protected String agentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;

    /**
     * Instantiates a new Builder from an existing GetHealthCheckAgentJobOptions instance.
     *
     * @param getHealthCheckAgentJobOptions the instance to initialize the Builder with
     */
    private Builder(GetHealthCheckAgentJobOptions getHealthCheckAgentJobOptions) {
      this.agentId = getHealthCheckAgentJobOptions.agentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param agentId the agentId
     */
    public Builder(String agentId) {
      this.agentId = agentId;
    }

    /**
     * Builds a GetHealthCheckAgentJobOptions.
     *
     * @return the new GetHealthCheckAgentJobOptions instance
     */
    public GetHealthCheckAgentJobOptions build() {
      return new GetHealthCheckAgentJobOptions(this);
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the GetHealthCheckAgentJobOptions builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }
  }

  protected GetHealthCheckAgentJobOptions() { }

  protected GetHealthCheckAgentJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.agentId,
      "agentId cannot be empty");
    agentId = builder.agentId;
  }

  /**
   * New builder.
   *
   * @return a GetHealthCheckAgentJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the agentId.
   *
   * Agent ID to get the details of agent.
   *
   * @return the agentId
   */
  public String agentId() {
    return agentId;
  }
}

