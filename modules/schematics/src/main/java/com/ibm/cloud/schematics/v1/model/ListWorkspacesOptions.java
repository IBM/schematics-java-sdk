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
 * The listWorkspaces options.
 */
public class ListWorkspacesOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected Long offset;
  protected Long limit;
  protected String profile;
  protected String resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String profile;
    private String resourceGroup;

    /**
     * Instantiates a new Builder from an existing ListWorkspacesOptions instance.
     *
     * @param listWorkspacesOptions the instance to initialize the Builder with
     */
    private Builder(ListWorkspacesOptions listWorkspacesOptions) {
      this.offset = listWorkspacesOptions.offset;
      this.limit = listWorkspacesOptions.limit;
      this.profile = listWorkspacesOptions.profile;
      this.resourceGroup = listWorkspacesOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListWorkspacesOptions.
     *
     * @return the new ListWorkspacesOptions instance
     */
    public ListWorkspacesOptions build() {
      return new ListWorkspacesOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListWorkspacesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListWorkspacesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ListWorkspacesOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ListWorkspacesOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected ListWorkspacesOptions() { }

  protected ListWorkspacesOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a ListWorkspacesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The starting position of the item in the list of items. For example, if you have three workspaces in your account,
   * the first workspace is assigned position number 0, the second workspace is assigned position number 1, and so
   * forth. If you have 6 workspaces and you want to list the details for workspaces `2-6`, enter 1. To limit the number
   * of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative numbers are not
   * supported and are ignored.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000. If no
   * value is provided, 100 is used by default.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group (by default, fetch from all resource groups) name or ID.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }
}

