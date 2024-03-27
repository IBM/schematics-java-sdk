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
 * The parameter to tune the Schematics policy.
 */
public class PolicyParameter extends GenericModel {

  @SerializedName("agent_assignment_policy_parameter")
  protected AgentAssignmentPolicyParameter agentAssignmentPolicyParameter;

  /**
   * Builder.
   */
  public static class Builder {
    private AgentAssignmentPolicyParameter agentAssignmentPolicyParameter;

    /**
     * Instantiates a new Builder from an existing PolicyParameter instance.
     *
     * @param policyParameter the instance to initialize the Builder with
     */
    private Builder(PolicyParameter policyParameter) {
      this.agentAssignmentPolicyParameter = policyParameter.agentAssignmentPolicyParameter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PolicyParameter.
     *
     * @return the new PolicyParameter instance
     */
    public PolicyParameter build() {
      return new PolicyParameter(this);
    }

    /**
     * Set the agentAssignmentPolicyParameter.
     *
     * @param agentAssignmentPolicyParameter the agentAssignmentPolicyParameter
     * @return the PolicyParameter builder
     */
    public Builder agentAssignmentPolicyParameter(AgentAssignmentPolicyParameter agentAssignmentPolicyParameter) {
      this.agentAssignmentPolicyParameter = agentAssignmentPolicyParameter;
      return this;
    }
  }

  protected PolicyParameter() { }

  protected PolicyParameter(Builder builder) {
    agentAssignmentPolicyParameter = builder.agentAssignmentPolicyParameter;
  }

  /**
   * New builder.
   *
   * @return a PolicyParameter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the agentAssignmentPolicyParameter.
   *
   * Parameters for the `agent_assignment_policy`.
   *
   * @return the agentAssignmentPolicyParameter
   */
  public AgentAssignmentPolicyParameter agentAssignmentPolicyParameter() {
    return agentAssignmentPolicyParameter;
  }
}

