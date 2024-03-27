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
 * The createWorkspaceDeletionJob options.
 */
public class CreateWorkspaceDeletionJobOptions extends GenericModel {

  protected String refreshToken;
  protected String job;
  protected String version;
  protected List<String> workspaces;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private String job;
    private String version;
    private List<String> workspaces;

    /**
     * Instantiates a new Builder from an existing CreateWorkspaceDeletionJobOptions instance.
     *
     * @param createWorkspaceDeletionJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions) {
      this.refreshToken = createWorkspaceDeletionJobOptions.refreshToken;
      this.job = createWorkspaceDeletionJobOptions.job;
      this.version = createWorkspaceDeletionJobOptions.version;
      this.workspaces = createWorkspaceDeletionJobOptions.workspaces;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param refreshToken the refreshToken
     */
    public Builder(String refreshToken) {
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a CreateWorkspaceDeletionJobOptions.
     *
     * @return the new CreateWorkspaceDeletionJobOptions instance
     */
    public CreateWorkspaceDeletionJobOptions build() {
      return new CreateWorkspaceDeletionJobOptions(this);
    }

    /**
     * Adds a new element to workspaces.
     *
     * @param workspaces the new element to be added
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder addWorkspaces(String workspaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workspaces,
        "workspaces cannot be null");
      if (this.workspaces == null) {
        this.workspaces = new ArrayList<String>();
      }
      this.workspaces.add(workspaces);
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder job(String job) {
      this.job = job;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the workspaces.
     * Existing workspaces will be replaced.
     *
     * @param workspaces the workspaces
     * @return the CreateWorkspaceDeletionJobOptions builder
     */
    public Builder workspaces(List<String> workspaces) {
      this.workspaces = workspaces;
      return this;
    }
  }

  protected CreateWorkspaceDeletionJobOptions() { }

  protected CreateWorkspaceDeletionJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    refreshToken = builder.refreshToken;
    job = builder.job;
    version = builder.version;
    workspaces = builder.workspaces;
  }

  /**
   * New builder.
   *
   * @return a CreateWorkspaceDeletionJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the job.
   *
   * Job type such as delete of a batch operation.
   *
   * @return the job
   */
  public String job() {
    return job;
  }

  /**
   * Gets the version.
   *
   * A version of the terraform template.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the workspaces.
   *
   * The List of workspaces to be deleted.
   *
   * @return the workspaces
   */
  public List<String> workspaces() {
    return workspaces;
  }
}

