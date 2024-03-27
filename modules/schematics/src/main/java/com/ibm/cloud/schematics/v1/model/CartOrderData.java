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
 * Schematics Cart Order Data.
 */
public class CartOrderData extends GenericModel {

  /**
   * Options how the cart order data can be used.
   */
  public interface UsageKind {
    /** servicetags. */
    String SERVICETAGS = "servicetags";
  }

  protected String name;
  protected String value;
  protected String type;
  @SerializedName("usage_kind")
  protected List<String> usageKind;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private String type;
    private List<String> usageKind;

    /**
     * Instantiates a new Builder from an existing CartOrderData instance.
     *
     * @param cartOrderData the instance to initialize the Builder with
     */
    private Builder(CartOrderData cartOrderData) {
      this.name = cartOrderData.name;
      this.value = cartOrderData.value;
      this.type = cartOrderData.type;
      this.usageKind = cartOrderData.usageKind;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CartOrderData.
     *
     * @return the new CartOrderData instance
     */
    public CartOrderData build() {
      return new CartOrderData(this);
    }

    /**
     * Adds a new element to usageKind.
     *
     * @param usageKind the new element to be added
     * @return the CartOrderData builder
     */
    public Builder addUsageKind(String usageKind) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(usageKind,
        "usageKind cannot be null");
      if (this.usageKind == null) {
        this.usageKind = new ArrayList<String>();
      }
      this.usageKind.add(usageKind);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CartOrderData builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the CartOrderData builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CartOrderData builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the usageKind.
     * Existing usageKind will be replaced.
     *
     * @param usageKind the usageKind
     * @return the CartOrderData builder
     */
    public Builder usageKind(List<String> usageKind) {
      this.usageKind = usageKind;
      return this;
    }
  }

  protected CartOrderData() { }

  protected CartOrderData(Builder builder) {
    name = builder.name;
    value = builder.value;
    type = builder.type;
    usageKind = builder.usageKind;
  }

  /**
   * New builder.
   *
   * @return a CartOrderData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the property.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value of the property.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the type.
   *
   * Type of the values(string, int etc).
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the usageKind.
   *
   * List of usage kind how the cart data can be used.
   *
   * @return the usageKind
   */
  public List<String> usageKind() {
    return usageKind;
  }
}

