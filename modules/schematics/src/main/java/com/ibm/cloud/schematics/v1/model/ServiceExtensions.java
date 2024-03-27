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
 * Service Extensions.
 */
public class ServiceExtensions extends GenericModel {

  protected String name;
  protected Object value;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Object value;
    private String type;

    /**
     * Instantiates a new Builder from an existing ServiceExtensions instance.
     *
     * @param serviceExtensions the instance to initialize the Builder with
     */
    private Builder(ServiceExtensions serviceExtensions) {
      this.name = serviceExtensions.name;
      this.value = serviceExtensions.value;
      this.type = serviceExtensions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ServiceExtensions.
     *
     * @return the new ServiceExtensions instance
     */
    public ServiceExtensions build() {
      return new ServiceExtensions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ServiceExtensions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ServiceExtensions builder
     */
    public Builder value(Object value) {
      this.value = value;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ServiceExtensions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected ServiceExtensions() { }

  protected ServiceExtensions(Builder builder) {
    name = builder.name;
    value = builder.value;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a ServiceExtensions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the Service Data.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Values of service data.
   *
   * @return the value
   */
  public Object value() {
    return value;
  }

  /**
   * Gets the type.
   *
   * Type of the value string, int, bool.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

