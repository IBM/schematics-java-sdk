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
 * scoped Schematics resource.
 */
public class ScopedResource extends GenericModel {

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

  protected String kind;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String kind;
    private String id;

    /**
     * Instantiates a new Builder from an existing ScopedResource instance.
     *
     * @param scopedResource the instance to initialize the Builder with
     */
    private Builder(ScopedResource scopedResource) {
      this.kind = scopedResource.kind;
      this.id = scopedResource.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ScopedResource.
     *
     * @return the new ScopedResource instance
     */
    public ScopedResource build() {
      return new ScopedResource(this);
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the ScopedResource builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ScopedResource builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ScopedResource() { }

  protected ScopedResource(Builder builder) {
    kind = builder.kind;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ScopedResource builder
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
   * Gets the id.
   *
   * Schematics resource Id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

