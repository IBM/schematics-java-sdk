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
 * Connection status of the agent.
 */
public class ConnectionState extends GenericModel {

  /**
   * Agent Connection Status
   *   * `Connected` When Schematics is able to connect to the agent.
   *   * `Disconnected` When Schematics is able not connect to the agent.
   */
  public interface State {
    /** Connected. */
    String CONNECTED = "Connected";
    /** Disconnected. */
    String DISCONNECTED = "Disconnected";
  }

  protected String state;
  @SerializedName("checked_at")
  protected Date checkedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String state;
    private Date checkedAt;

    /**
     * Instantiates a new Builder from an existing ConnectionState instance.
     *
     * @param connectionState the instance to initialize the Builder with
     */
    private Builder(ConnectionState connectionState) {
      this.state = connectionState.state;
      this.checkedAt = connectionState.checkedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConnectionState.
     *
     * @return the new ConnectionState instance
     */
    public ConnectionState build() {
      return new ConnectionState(this);
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ConnectionState builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the checkedAt.
     *
     * @param checkedAt the checkedAt
     * @return the ConnectionState builder
     */
    public Builder checkedAt(Date checkedAt) {
      this.checkedAt = checkedAt;
      return this;
    }
  }

  protected ConnectionState() { }

  protected ConnectionState(Builder builder) {
    state = builder.state;
    checkedAt = builder.checkedAt;
  }

  /**
   * New builder.
   *
   * @return a ConnectionState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the state.
   *
   * Agent Connection Status
   *   * `Connected` When Schematics is able to connect to the agent.
   *   * `Disconnected` When Schematics is able not connect to the agent.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the checkedAt.
   *
   * When the connection state is modified.
   *
   * @return the checkedAt
   */
  public Date checkedAt() {
    return checkedAt;
  }
}

