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
 * Computed state of the agent.
 */
public class AgentSystemState extends GenericModel {

  /**
   * Agent Status.
   */
  public interface State {
    /** error. */
    String ERROR = "error";
    /** normal. */
    String NORMAL = "normal";
    /** in_progress. */
    String IN_PROGRESS = "in_progress";
    /** pending. */
    String PENDING = "pending";
    /** draft. */
    String DRAFT = "draft";
  }

  protected String state;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String state;
    private String message;

    /**
     * Instantiates a new Builder from an existing AgentSystemState instance.
     *
     * @param agentSystemState the instance to initialize the Builder with
     */
    private Builder(AgentSystemState agentSystemState) {
      this.state = agentSystemState.state;
      this.message = agentSystemState.message;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentSystemState.
     *
     * @return the new AgentSystemState instance
     */
    public AgentSystemState build() {
      return new AgentSystemState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the AgentSystemState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the message.
     *
     * @param message the message
     * @return the AgentSystemState builder
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }

  protected AgentSystemState() { }

  protected AgentSystemState(Builder builder) {
    state = builder.state;
    message = builder.message;
  }

  /**
   * New builder.
   *
   * @return a AgentSystemState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * Agent Status.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the message.
   *
   * The Agent status message.
   *
   * @return the message
   */
  public String message() {
    return message;
  }
}

