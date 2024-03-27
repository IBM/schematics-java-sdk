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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workspace dependencies.
 */
public class Dependencies extends GenericModel {

  protected List<String> parents;
  protected List<String> children;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> parents;
    private List<String> children;

    /**
     * Instantiates a new Builder from an existing Dependencies instance.
     *
     * @param dependencies the instance to initialize the Builder with
     */
    private Builder(Dependencies dependencies) {
      this.parents = dependencies.parents;
      this.children = dependencies.children;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Dependencies.
     *
     * @return the new Dependencies instance
     */
    public Dependencies build() {
      return new Dependencies(this);
    }

    /**
     * Adds a new element to parents.
     *
     * @param parents the new element to be added
     * @return the Dependencies builder
     */
    public Builder addParents(String parents) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(parents,
        "parents cannot be null");
      if (this.parents == null) {
        this.parents = new ArrayList<String>();
      }
      this.parents.add(parents);
      return this;
    }

    /**
     * Adds a new element to children.
     *
     * @param children the new element to be added
     * @return the Dependencies builder
     */
    public Builder addChildren(String children) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(children,
        "children cannot be null");
      if (this.children == null) {
        this.children = new ArrayList<String>();
      }
      this.children.add(children);
      return this;
    }

    /**
     * Set the parents.
     * Existing parents will be replaced.
     *
     * @param parents the parents
     * @return the Dependencies builder
     */
    public Builder parents(List<String> parents) {
      this.parents = parents;
      return this;
    }

    /**
     * Set the children.
     * Existing children will be replaced.
     *
     * @param children the children
     * @return the Dependencies builder
     */
    public Builder children(List<String> children) {
      this.children = children;
      return this;
    }
  }

  protected Dependencies() { }

  protected Dependencies(Builder builder) {
    parents = builder.parents;
    children = builder.children;
  }

  /**
   * New builder.
   *
   * @return a Dependencies builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the parents.
   *
   * List of workspace parents CRN identifiers.
   *
   * @return the parents
   */
  public List<String> parents() {
    return parents;
  }

  /**
   * Gets the children.
   *
   * List of workspace children CRN identifiers.
   *
   * @return the children
   */
  public List<String> children() {
    return children;
  }
}

