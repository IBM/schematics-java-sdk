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
 * Parameters for the `agent_assignment_policy`.
 */
public class AgentAssignmentPolicyParameter extends GenericModel {

  /**
   * Types of schematics object selector.
   */
  public interface SelectorKind {
    /** ids. */
    String IDS = "ids";
    /** scoped. */
    String SCOPED = "scoped";
  }

  @SerializedName("selector_kind")
  protected String selectorKind;
  @SerializedName("selector_ids")
  protected List<String> selectorIds;
  @SerializedName("selector_scope")
  protected List<PolicyObjectSelector> selectorScope;

  /**
   * Builder.
   */
  public static class Builder {
    private String selectorKind;
    private List<String> selectorIds;
    private List<PolicyObjectSelector> selectorScope;

    /**
     * Instantiates a new Builder from an existing AgentAssignmentPolicyParameter instance.
     *
     * @param agentAssignmentPolicyParameter the instance to initialize the Builder with
     */
    private Builder(AgentAssignmentPolicyParameter agentAssignmentPolicyParameter) {
      this.selectorKind = agentAssignmentPolicyParameter.selectorKind;
      this.selectorIds = agentAssignmentPolicyParameter.selectorIds;
      this.selectorScope = agentAssignmentPolicyParameter.selectorScope;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentAssignmentPolicyParameter.
     *
     * @return the new AgentAssignmentPolicyParameter instance
     */
    public AgentAssignmentPolicyParameter build() {
      return new AgentAssignmentPolicyParameter(this);
    }

    /**
     * Adds a new element to selectorIds.
     *
     * @param selectorIds the new element to be added
     * @return the AgentAssignmentPolicyParameter builder
     */
    public Builder addSelectorIds(String selectorIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(selectorIds,
        "selectorIds cannot be null");
      if (this.selectorIds == null) {
        this.selectorIds = new ArrayList<String>();
      }
      this.selectorIds.add(selectorIds);
      return this;
    }

    /**
     * Adds a new element to selectorScope.
     *
     * @param selectorScope the new element to be added
     * @return the AgentAssignmentPolicyParameter builder
     */
    public Builder addSelectorScope(PolicyObjectSelector selectorScope) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(selectorScope,
        "selectorScope cannot be null");
      if (this.selectorScope == null) {
        this.selectorScope = new ArrayList<PolicyObjectSelector>();
      }
      this.selectorScope.add(selectorScope);
      return this;
    }

    /**
     * Set the selectorKind.
     *
     * @param selectorKind the selectorKind
     * @return the AgentAssignmentPolicyParameter builder
     */
    public Builder selectorKind(String selectorKind) {
      this.selectorKind = selectorKind;
      return this;
    }

    /**
     * Set the selectorIds.
     * Existing selectorIds will be replaced.
     *
     * @param selectorIds the selectorIds
     * @return the AgentAssignmentPolicyParameter builder
     */
    public Builder selectorIds(List<String> selectorIds) {
      this.selectorIds = selectorIds;
      return this;
    }

    /**
     * Set the selectorScope.
     * Existing selectorScope will be replaced.
     *
     * @param selectorScope the selectorScope
     * @return the AgentAssignmentPolicyParameter builder
     */
    public Builder selectorScope(List<PolicyObjectSelector> selectorScope) {
      this.selectorScope = selectorScope;
      return this;
    }
  }

  protected AgentAssignmentPolicyParameter() { }

  protected AgentAssignmentPolicyParameter(Builder builder) {
    selectorKind = builder.selectorKind;
    selectorIds = builder.selectorIds;
    selectorScope = builder.selectorScope;
  }

  /**
   * New builder.
   *
   * @return a AgentAssignmentPolicyParameter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the selectorKind.
   *
   * Types of schematics object selector.
   *
   * @return the selectorKind
   */
  public String selectorKind() {
    return selectorKind;
  }

  /**
   * Gets the selectorIds.
   *
   * The static selectors of schematics object ids (workspace or action) for the Schematics policy.
   *
   * @return the selectorIds
   */
  public List<String> selectorIds() {
    return selectorIds;
  }

  /**
   * Gets the selectorScope.
   *
   * The selectors to dynamically list of schematics object ids (workspace or action) for the Schematics policy.
   *
   * @return the selectorScope
   */
  public List<PolicyObjectSelector> selectorScope() {
    return selectorScope;
  }
}

