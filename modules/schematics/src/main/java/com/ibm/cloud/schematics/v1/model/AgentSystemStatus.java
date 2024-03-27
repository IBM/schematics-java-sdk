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
 * Computed state of the agent.
 */
public class AgentSystemStatus extends GenericModel {

  /**
   * Agent Status.
   */
  public interface StatusCode {
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

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusMessage;

    /**
     * Instantiates a new Builder from an existing AgentSystemStatus instance.
     *
     * @param agentSystemStatus the instance to initialize the Builder with
     */
    private Builder(AgentSystemStatus agentSystemStatus) {
      this.statusCode = agentSystemStatus.statusCode;
      this.statusMessage = agentSystemStatus.statusMessage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentSystemStatus.
     *
     * @return the new AgentSystemStatus instance
     */
    public AgentSystemStatus build() {
      return new AgentSystemStatus(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the AgentSystemStatus builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the AgentSystemStatus builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }
  }

  protected AgentSystemStatus() { }

  protected AgentSystemStatus(Builder builder) {
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
  }

  /**
   * New builder.
   *
   * @return a AgentSystemStatus builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the statusCode.
   *
   * Agent Status.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * The agent status message.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }
}

