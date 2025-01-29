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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Encryption details about the workspace such as scheme (byok/kyok) and key CRN.
 */
public class EncryptionInfo extends GenericModel {

  protected String crn;
  protected String scheme;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String scheme;

    /**
     * Instantiates a new Builder from an existing EncryptionInfo instance.
     *
     * @param encryptionInfo the instance to initialize the Builder with
     */
    private Builder(EncryptionInfo encryptionInfo) {
      this.crn = encryptionInfo.crn;
      this.scheme = encryptionInfo.scheme;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EncryptionInfo.
     *
     * @return the new EncryptionInfo instance
     */
    public EncryptionInfo build() {
      return new EncryptionInfo(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the EncryptionInfo builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the scheme.
     *
     * @param scheme the scheme
     * @return the EncryptionInfo builder
     */
    public Builder scheme(String scheme) {
      this.scheme = scheme;
      return this;
    }
  }

  protected EncryptionInfo() { }

  protected EncryptionInfo(Builder builder) {
    crn = builder.crn;
    scheme = builder.scheme;
  }

  /**
   * New builder.
   *
   * @return a EncryptionInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * Key CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the scheme.
   *
   * Encryption scheme.
   *
   * @return the scheme
   */
  public String scheme() {
    return scheme;
  }
}

