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
 * The deleteAgentResources options.
 */
public class DeleteAgentResourcesOptions extends GenericModel {

  protected String agentId;
  protected String refreshToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;
    private String refreshToken;

    /**
     * Instantiates a new Builder from an existing DeleteAgentResourcesOptions instance.
     *
     * @param deleteAgentResourcesOptions the instance to initialize the Builder with
     */
    private Builder(DeleteAgentResourcesOptions deleteAgentResourcesOptions) {
      this.agentId = deleteAgentResourcesOptions.agentId;
      this.refreshToken = deleteAgentResourcesOptions.refreshToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param agentId the agentId
     * @param refreshToken the refreshToken
     */
    public Builder(String agentId, String refreshToken) {
      this.agentId = agentId;
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a DeleteAgentResourcesOptions.
     *
     * @return the new DeleteAgentResourcesOptions instance
     */
    public DeleteAgentResourcesOptions build() {
      return new DeleteAgentResourcesOptions(this);
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the DeleteAgentResourcesOptions builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the DeleteAgentResourcesOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }
  }

  protected DeleteAgentResourcesOptions() { }

  protected DeleteAgentResourcesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.agentId,
      "agentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    agentId = builder.agentId;
    refreshToken = builder.refreshToken;
  }

  /**
   * New builder.
   *
   * @return a DeleteAgentResourcesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the agentId.
   *
   * Agent ID to get the details of agent.
   *
   * @return the agentId
   */
  public String agentId() {
    return agentId;
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token for the user or service identity.
   *
   *   **Retrieving refresh token**:
   *   * Use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;`, and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type: application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`.
   *   * For more information, about creating IAM access token and API Docs, refer, [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *
   *   **Limitation**:
   *   * If the token is expired, you can use `refresh token` to get a new IAM access token.
   *   * The `refresh_token` parameter cannot be used to retrieve a new IAM access token.
   *   * When the IAM access token is about to expire, use the API key to create a new access token.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }
}

