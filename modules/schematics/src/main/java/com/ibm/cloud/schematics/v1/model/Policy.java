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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Detailed information about the Schematics customization policy.  This policy can be used to customize the behaviour
 * or the core Schematics service.
 */
public class Policy extends GenericModel {

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

  /**
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   */
  public interface Kind {
    /** agent_assignment_policy. */
    String AGENT_ASSIGNMENT_POLICY = "agent_assignment_policy";
  }

  protected String name;
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected UserState state;
  protected String kind;
  protected PolicyObjects target;
  protected PolicyParameter parameter;
  protected String id;
  protected String crn;
  protected String account;
  @SerializedName("scoped_resources")
  protected List<ScopedResource> scopedResources;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String location;
    private UserState state;
    private String kind;
    private PolicyObjects target;
    private PolicyParameter parameter;
    private List<ScopedResource> scopedResources;

    /**
     * Instantiates a new Builder from an existing Policy instance.
     *
     * @param policy the instance to initialize the Builder with
     */
    private Builder(Policy policy) {
      this.name = policy.name;
      this.description = policy.description;
      this.resourceGroup = policy.resourceGroup;
      this.tags = policy.tags;
      this.location = policy.location;
      this.state = policy.state;
      this.kind = policy.kind;
      this.target = policy.target;
      this.parameter = policy.parameter;
      this.scopedResources = policy.scopedResources;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Policy.
     *
     * @return the new Policy instance
     */
    public Policy build() {
      return new Policy(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the Policy builder
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
     * Adds a new element to scopedResources.
     *
     * @param scopedResources the new element to be added
     * @return the Policy builder
     */
    public Builder addScopedResources(ScopedResource scopedResources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(scopedResources,
        "scopedResources cannot be null");
      if (this.scopedResources == null) {
        this.scopedResources = new ArrayList<ScopedResource>();
      }
      this.scopedResources.add(scopedResources);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Policy builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Policy builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Policy builder
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
     * @return the Policy builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Policy builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the Policy builder
     */
    public Builder state(UserState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the Policy builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the Policy builder
     */
    public Builder target(PolicyObjects target) {
      this.target = target;
      return this;
    }

    /**
     * Set the parameter.
     *
     * @param parameter the parameter
     * @return the Policy builder
     */
    public Builder parameter(PolicyParameter parameter) {
      this.parameter = parameter;
      return this;
    }

    /**
     * Set the scopedResources.
     * Existing scopedResources will be replaced.
     *
     * @param scopedResources the scopedResources
     * @return the Policy builder
     */
    public Builder scopedResources(List<ScopedResource> scopedResources) {
      this.scopedResources = scopedResources;
      return this;
    }
  }

  protected Policy() { }

  protected Policy(Builder builder) {
    name = builder.name;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    location = builder.location;
    state = builder.state;
    kind = builder.kind;
    target = builder.target;
    parameter = builder.parameter;
    scopedResources = builder.scopedResources;
  }

  /**
   * New builder.
   *
   * @return a Policy builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of Schematics customization policy.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of Schematics customization policy.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group name for the policy.  By default, Policy will be created in `default` Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Tags for the Schematics customization policy.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
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
   * Gets the state.
   *
   * User defined status of the Schematics object.
   *
   * @return the state
   */
  public UserState state() {
    return state;
  }

  /**
   * Gets the kind.
   *
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the target.
   *
   * The objects for the Schematics policy.
   *
   * @return the target
   */
  public PolicyObjects target() {
    return target;
  }

  /**
   * Gets the parameter.
   *
   * The parameter to tune the Schematics policy.
   *
   * @return the parameter
   */
  public PolicyParameter parameter() {
    return parameter;
  }

  /**
   * Gets the id.
   *
   * The system generated policy Id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The policy CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * The Account id.
   *
   * @return the account
   */
  public String account() {
    return account;
  }

  /**
   * Gets the scopedResources.
   *
   * List of scoped Schematics resources targeted by the policy.
   *
   * @return the scopedResources
   */
  public List<ScopedResource> scopedResources() {
    return scopedResources;
  }

  /**
   * Gets the createdAt.
   *
   * The policy creation time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * The user who created the policy.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * The policy updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

