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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Agent name, Agent id and associated policy ID information.
 */
public class AgentInfo extends GenericModel {

  protected String id;
  protected String name;
  @SerializedName("assignment_policy_id")
  protected String assignmentPolicyId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String assignmentPolicyId;

    /**
     * Instantiates a new Builder from an existing AgentInfo instance.
     *
     * @param agentInfo the instance to initialize the Builder with
     */
    private Builder(AgentInfo agentInfo) {
      this.id = agentInfo.id;
      this.name = agentInfo.name;
      this.assignmentPolicyId = agentInfo.assignmentPolicyId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentInfo.
     *
     * @return the new AgentInfo instance
     */
    public AgentInfo build() {
      return new AgentInfo(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AgentInfo builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the AgentInfo builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the assignmentPolicyId.
     *
     * @param assignmentPolicyId the assignmentPolicyId
     * @return the AgentInfo builder
     */
    public Builder assignmentPolicyId(String assignmentPolicyId) {
      this.assignmentPolicyId = assignmentPolicyId;
      return this;
    }
  }

  protected AgentInfo() { }

  protected AgentInfo(Builder builder) {
    id = builder.id;
    name = builder.name;
    assignmentPolicyId = builder.assignmentPolicyId;
  }

  /**
   * New builder.
   *
   * @return a AgentInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of the Agent bound to the schematics object (workspace, action).
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the Agent bound to the schematics object.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the assignmentPolicyId.
   *
   * ID of the agent assignment policy, that is used to bind the Agent to schematics object.
   *
   * @return the assignmentPolicyId
   */
  public String assignmentPolicyId() {
    return assignmentPolicyId;
  }
}

