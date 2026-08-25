/*
 * (C) Copyright IBM Corp. 2026.
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
 * Inventories' structured view for the provided inventory.
 */
public class InventoryView extends GenericModel {

  protected List<Group> groups;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Group> groups;

    /**
     * Instantiates a new Builder from an existing InventoryView instance.
     *
     * @param inventoryView the instance to initialize the Builder with
     */
    private Builder(InventoryView inventoryView) {
      this.groups = inventoryView.groups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InventoryView.
     *
     * @return the new InventoryView instance
     */
    public InventoryView build() {
      return new InventoryView(this);
    }

    /**
     * Adds a new element to groups.
     *
     * @param groups the new element to be added
     * @return the InventoryView builder
     */
    public Builder addGroups(Group groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<Group>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the InventoryView builder
     */
    public Builder groups(List<Group> groups) {
      this.groups = groups;
      return this;
    }
  }

  protected InventoryView() { }

  protected InventoryView(Builder builder) {
    groups = builder.groups;
  }

  /**
   * New builder.
   *
   * @return a InventoryView builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the groups.
   *
   * List of inventory groups.
   *
   * @return the groups
   */
  public List<Group> groups() {
    return groups;
  }
}

