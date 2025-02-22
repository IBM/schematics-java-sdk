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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The registerAgent options.
 */
public class RegisterAgentOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String name;
  protected String agentLocation;
  protected String location;
  protected String profileId;
  protected String description;
  protected String resourceGroup;
  protected List<String> tags;
  protected AgentUserState userState;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String agentLocation;
    private String location;
    private String profileId;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private AgentUserState userState;

    /**
     * Instantiates a new Builder from an existing RegisterAgentOptions instance.
     *
     * @param registerAgentOptions the instance to initialize the Builder with
     */
    private Builder(RegisterAgentOptions registerAgentOptions) {
      this.name = registerAgentOptions.name;
      this.agentLocation = registerAgentOptions.agentLocation;
      this.location = registerAgentOptions.location;
      this.profileId = registerAgentOptions.profileId;
      this.description = registerAgentOptions.description;
      this.resourceGroup = registerAgentOptions.resourceGroup;
      this.tags = registerAgentOptions.tags;
      this.userState = registerAgentOptions.userState;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param agentLocation the agentLocation
     * @param location the location
     * @param profileId the profileId
     */
    public Builder(String name, String agentLocation, String location, String profileId) {
      this.name = name;
      this.agentLocation = agentLocation;
      this.location = location;
      this.profileId = profileId;
    }

    /**
     * Builds a RegisterAgentOptions.
     *
     * @return the new RegisterAgentOptions instance
     */
    public RegisterAgentOptions build() {
      return new RegisterAgentOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the RegisterAgentOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RegisterAgentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the agentLocation.
     *
     * @param agentLocation the agentLocation
     * @return the RegisterAgentOptions builder
     */
    public Builder agentLocation(String agentLocation) {
      this.agentLocation = agentLocation;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the RegisterAgentOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the profileId.
     *
     * @param profileId the profileId
     * @return the RegisterAgentOptions builder
     */
    public Builder profileId(String profileId) {
      this.profileId = profileId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RegisterAgentOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the RegisterAgentOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the RegisterAgentOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the RegisterAgentOptions builder
     */
    public Builder userState(AgentUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the agent.
     *
     * @param agent the agent
     * @return the RegisterAgentOptions builder
     */
    public Builder agent(Agent agent) {
      this.name = agent.name();
      this.agentLocation = agent.agentLocation();
      this.location = agent.location();
      this.profileId = agent.profileId();
      this.description = agent.description();
      this.resourceGroup = agent.resourceGroup();
      this.tags = agent.tags();
      this.userState = agent.userState();
      return this;
    }
  }

  protected RegisterAgentOptions() { }

  protected RegisterAgentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.agentLocation,
      "agentLocation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.location,
      "location cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profileId,
      "profileId cannot be null");
    name = builder.name;
    agentLocation = builder.agentLocation;
    location = builder.location;
    profileId = builder.profileId;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    userState = builder.userState;
  }

  /**
   * New builder.
   *
   * @return a RegisterAgentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the agent (must be unique, for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the agentLocation.
   *
   * The location where agent is deployed in the user environment.
   *
   * @return the agentLocation
   */
  public String agentLocation() {
    return agentLocation;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the profileId.
   *
   * The IAM trusted profile id, used by the Agent instance.
   *
   * @return the profileId
   */
  public String profileId() {
    return profileId;
  }

  /**
   * Gets the description.
   *
   * Agent description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource-group name for the agent.  By default, Agent will be registered in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Tags for the agent.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the agent.
   *
   * @return the userState
   */
  public AgentUserState userState() {
    return userState;
  }
}

