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
 * Workspace commands run as part of the job.
 */
public class CommandsInfo extends GenericModel {

  protected String name;
  protected String outcome;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String outcome;

    /**
     * Instantiates a new Builder from an existing CommandsInfo instance.
     *
     * @param commandsInfo the instance to initialize the Builder with
     */
    private Builder(CommandsInfo commandsInfo) {
      this.name = commandsInfo.name;
      this.outcome = commandsInfo.outcome;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CommandsInfo.
     *
     * @return the new CommandsInfo instance
     */
    public CommandsInfo build() {
      return new CommandsInfo(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CommandsInfo builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the outcome.
     *
     * @param outcome the outcome
     * @return the CommandsInfo builder
     */
    public Builder outcome(String outcome) {
      this.outcome = outcome;
      return this;
    }
  }

  protected CommandsInfo() { }

  protected CommandsInfo(Builder builder) {
    name = builder.name;
    outcome = builder.outcome;
  }

  /**
   * New builder.
   *
   * @return a CommandsInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the command.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the outcome.
   *
   * outcome of the command.
   *
   * @return the outcome
   */
  public String outcome() {
    return outcome;
  }
}

