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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * User defined status of the agent.
 */
public class AgentUserState extends GenericModel {

  /**
   * User-defined states
   *   * `enable`  Agent is enabled by the user.
   *   * `disable` Agent is disbaled by the user.
   */
  public interface State {
    /** enable. */
    String ENABLE = "enable";
    /** disable. */
    String DISABLE = "disable";
  }

  protected String state;
  @SerializedName("set_by")
  protected String setBy;
  @SerializedName("set_at")
  protected Date setAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String state;

    /**
     * Instantiates a new Builder from an existing AgentUserState instance.
     *
     * @param agentUserState the instance to initialize the Builder with
     */
    private Builder(AgentUserState agentUserState) {
      this.state = agentUserState.state;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentUserState.
     *
     * @return the new AgentUserState instance
     */
    public AgentUserState build() {
      return new AgentUserState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the AgentUserState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }
  }

  protected AgentUserState() { }

  protected AgentUserState(Builder builder) {
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a AgentUserState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * User-defined states
   *   * `enable`  Agent is enabled by the user.
   *   * `disable` Agent is disbaled by the user.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the setBy.
   *
   * Name of the User who set the state of the Object.
   *
   * @return the setBy
   */
  public String setBy() {
    return setBy;
  }

  /**
   * Gets the setAt.
   *
   * When the User who set the state of the Object.
   *
   * @return the setAt
   */
  public Date setAt() {
    return setAt;
  }
}

