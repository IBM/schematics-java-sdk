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
 * Selector rule to dynamically select Schematics object based on the following metadata attributes.  The rule can be
 * defined as follows ((tags in ["policy:secured-job", "policy:dept_id:A00132"]) AND (resource_grous in ["default",
 * "sales_rg"])).
 */
public class PolicyObjectSelector extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface Kind {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
  }

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Locations {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String kind;
  protected List<String> tags;
  @SerializedName("resource_groups")
  protected List<String> resourceGroups;
  protected List<String> locations;

  /**
   * Builder.
   */
  public static class Builder {
    private String kind;
    private List<String> tags;
    private List<String> resourceGroups;
    private List<String> locations;

    /**
     * Instantiates a new Builder from an existing PolicyObjectSelector instance.
     *
     * @param policyObjectSelector the instance to initialize the Builder with
     */
    private Builder(PolicyObjectSelector policyObjectSelector) {
      this.kind = policyObjectSelector.kind;
      this.tags = policyObjectSelector.tags;
      this.resourceGroups = policyObjectSelector.resourceGroups;
      this.locations = policyObjectSelector.locations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PolicyObjectSelector.
     *
     * @return the new PolicyObjectSelector instance
     */
    public PolicyObjectSelector build() {
      return new PolicyObjectSelector(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the PolicyObjectSelector builder
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
     * Adds a new element to resourceGroups.
     *
     * @param resourceGroups the new element to be added
     * @return the PolicyObjectSelector builder
     */
    public Builder addResourceGroups(String resourceGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceGroups,
        "resourceGroups cannot be null");
      if (this.resourceGroups == null) {
        this.resourceGroups = new ArrayList<String>();
      }
      this.resourceGroups.add(resourceGroups);
      return this;
    }

    /**
     * Adds a new element to locations.
     *
     * @param locations the new element to be added
     * @return the PolicyObjectSelector builder
     */
    public Builder addLocations(String locations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locations,
        "locations cannot be null");
      if (this.locations == null) {
        this.locations = new ArrayList<String>();
      }
      this.locations.add(locations);
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the PolicyObjectSelector builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the PolicyObjectSelector builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the resourceGroups.
     * Existing resourceGroups will be replaced.
     *
     * @param resourceGroups the resourceGroups
     * @return the PolicyObjectSelector builder
     */
    public Builder resourceGroups(List<String> resourceGroups) {
      this.resourceGroups = resourceGroups;
      return this;
    }

    /**
     * Set the locations.
     * Existing locations will be replaced.
     *
     * @param locations the locations
     * @return the PolicyObjectSelector builder
     */
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }
  }

  protected PolicyObjectSelector() { }

  protected PolicyObjectSelector(Builder builder) {
    kind = builder.kind;
    tags = builder.tags;
    resourceGroups = builder.resourceGroups;
    locations = builder.locations;
  }

  /**
   * New builder.
   *
   * @return a PolicyObjectSelector builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the kind.
   *
   * Name of the Schematics automation resource.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the tags.
   *
   * The tag based selector.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the resourceGroups.
   *
   * The resource group based selector.
   *
   * @return the resourceGroups
   */
  public List<String> resourceGroups() {
    return resourceGroups;
  }

  /**
   * Gets the locations.
   *
   * The location based selector.
   *
   * @return the locations
   */
  public List<String> locations() {
    return locations;
  }
}

