/*
 * (C) Copyright IBM Corp. 2021.
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
 * The listResourceQuery options.
 */
public class ListResourceQueryOptions extends GenericModel {

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
  protected String sort;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String sort;
    private String profile;

    private Builder(ListResourceQueryOptions listResourceQueryOptions) {
      this.offset = listResourceQueryOptions.offset;
      this.limit = listResourceQueryOptions.limit;
      this.sort = listResourceQueryOptions.sort;
      this.profile = listResourceQueryOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListResourceQueryOptions.
     *
     * @return the new ListResourceQueryOptions instance
     */
    public ListResourceQueryOptions build() {
      return new ListResourceQueryOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListResourceQueryOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListResourceQueryOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListResourceQueryOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ListResourceQueryOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ListResourceQueryOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    sort = builder.sort;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ListResourceQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of items to skip before starting to collect the result set.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The numbers of items to return.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the sort.
   *
   * Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
   * owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is ascending)
   *  Ignore unrecognized or unsupported sort field.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
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
}

