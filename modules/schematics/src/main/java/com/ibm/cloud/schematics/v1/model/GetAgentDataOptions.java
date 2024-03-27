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
 * The getAgentData options.
 */
public class GetAgentDataOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
    /** ids. */
    String IDS = "ids";
  }

  protected String agentId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;
    private String profile;

    /**
     * Instantiates a new Builder from an existing GetAgentDataOptions instance.
     *
     * @param getAgentDataOptions the instance to initialize the Builder with
     */
    private Builder(GetAgentDataOptions getAgentDataOptions) {
      this.agentId = getAgentDataOptions.agentId;
      this.profile = getAgentDataOptions.profile;
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
     * Builds a GetAgentDataOptions.
     *
     * @return the new GetAgentDataOptions instance
     */
    public GetAgentDataOptions build() {
      return new GetAgentDataOptions(this);
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the GetAgentDataOptions builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetAgentDataOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetAgentDataOptions() { }

  protected GetAgentDataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.agentId,
      "agentId cannot be empty");
    agentId = builder.agentId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetAgentDataOptions builder
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

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

