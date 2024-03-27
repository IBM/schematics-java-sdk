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
 * InjectTerraformTemplateInner.
 */
public class InjectTerraformTemplateInner extends GenericModel {

  @SerializedName("tft_git_url")
  protected String tftGitUrl;
  @SerializedName("tft_git_token")
  protected String tftGitToken;
  @SerializedName("tft_prefix")
  protected String tftPrefix;
  @SerializedName("injection_type")
  protected String injectionType;
  @SerializedName("tft_name")
  protected String tftName;
  @SerializedName("tft_parameters")
  protected List<InjectTerraformTemplateInnerTftParametersItem> tftParameters;

  /**
   * Builder.
   */
  public static class Builder {
    private String tftGitUrl;
    private String tftGitToken;
    private String tftPrefix;
    private String injectionType;
    private String tftName;
    private List<InjectTerraformTemplateInnerTftParametersItem> tftParameters;

    /**
     * Instantiates a new Builder from an existing InjectTerraformTemplateInner instance.
     *
     * @param injectTerraformTemplateInner the instance to initialize the Builder with
     */
    private Builder(InjectTerraformTemplateInner injectTerraformTemplateInner) {
      this.tftGitUrl = injectTerraformTemplateInner.tftGitUrl;
      this.tftGitToken = injectTerraformTemplateInner.tftGitToken;
      this.tftPrefix = injectTerraformTemplateInner.tftPrefix;
      this.injectionType = injectTerraformTemplateInner.injectionType;
      this.tftName = injectTerraformTemplateInner.tftName;
      this.tftParameters = injectTerraformTemplateInner.tftParameters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InjectTerraformTemplateInner.
     *
     * @return the new InjectTerraformTemplateInner instance
     */
    public InjectTerraformTemplateInner build() {
      return new InjectTerraformTemplateInner(this);
    }

    /**
     * Adds a new element to tftParameters.
     *
     * @param tftParameters the new element to be added
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder addTftParameters(InjectTerraformTemplateInnerTftParametersItem tftParameters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tftParameters,
        "tftParameters cannot be null");
      if (this.tftParameters == null) {
        this.tftParameters = new ArrayList<InjectTerraformTemplateInnerTftParametersItem>();
      }
      this.tftParameters.add(tftParameters);
      return this;
    }

    /**
     * Set the tftGitUrl.
     *
     * @param tftGitUrl the tftGitUrl
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder tftGitUrl(String tftGitUrl) {
      this.tftGitUrl = tftGitUrl;
      return this;
    }

    /**
     * Set the tftGitToken.
     *
     * @param tftGitToken the tftGitToken
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder tftGitToken(String tftGitToken) {
      this.tftGitToken = tftGitToken;
      return this;
    }

    /**
     * Set the tftPrefix.
     *
     * @param tftPrefix the tftPrefix
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder tftPrefix(String tftPrefix) {
      this.tftPrefix = tftPrefix;
      return this;
    }

    /**
     * Set the injectionType.
     *
     * @param injectionType the injectionType
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder injectionType(String injectionType) {
      this.injectionType = injectionType;
      return this;
    }

    /**
     * Set the tftName.
     *
     * @param tftName the tftName
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder tftName(String tftName) {
      this.tftName = tftName;
      return this;
    }

    /**
     * Set the tftParameters.
     * Existing tftParameters will be replaced.
     *
     * @param tftParameters the tftParameters
     * @return the InjectTerraformTemplateInner builder
     */
    public Builder tftParameters(List<InjectTerraformTemplateInnerTftParametersItem> tftParameters) {
      this.tftParameters = tftParameters;
      return this;
    }
  }

  protected InjectTerraformTemplateInner() { }

  protected InjectTerraformTemplateInner(Builder builder) {
    tftGitUrl = builder.tftGitUrl;
    tftGitToken = builder.tftGitToken;
    tftPrefix = builder.tftPrefix;
    injectionType = builder.injectionType;
    tftName = builder.tftName;
    tftParameters = builder.tftParameters;
  }

  /**
   * New builder.
   *
   * @return a InjectTerraformTemplateInner builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tftGitUrl.
   *
   * Git repo url hosting terraform template files.
   *
   * @return the tftGitUrl
   */
  public String tftGitUrl() {
    return tftGitUrl;
  }

  /**
   * Gets the tftGitToken.
   *
   * Token to access the git repository (Optional).
   *
   * @return the tftGitToken
   */
  public String tftGitToken() {
    return tftGitToken;
  }

  /**
   * Gets the tftPrefix.
   *
   * Optional prefix word to append to files (Optional).
   *
   * @return the tftPrefix
   */
  public String tftPrefix() {
    return tftPrefix;
  }

  /**
   * Gets the injectionType.
   *
   * Injection type. Default is 'override'.
   *
   * @return the injectionType
   */
  public String injectionType() {
    return injectionType;
  }

  /**
   * Gets the tftName.
   *
   * Terraform template name. Maps to folder name in git repo.
   *
   * @return the tftName
   */
  public String tftName() {
    return tftName;
  }

  /**
   * Gets the tftParameters.
   *
   * @return the tftParameters
   */
  public List<InjectTerraformTemplateInnerTftParametersItem> tftParameters() {
    return tftParameters;
  }
}

