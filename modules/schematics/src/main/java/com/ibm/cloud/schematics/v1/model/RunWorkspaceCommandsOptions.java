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
 * The runWorkspaceCommands options.
 */
public class RunWorkspaceCommandsOptions extends GenericModel {

  protected String wId;
  protected String refreshToken;
  protected List<TerraformCommand> commands;
  protected String operationName;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String refreshToken;
    private List<TerraformCommand> commands;
    private String operationName;
    private String description;

    /**
     * Instantiates a new Builder from an existing RunWorkspaceCommandsOptions instance.
     *
     * @param runWorkspaceCommandsOptions the instance to initialize the Builder with
     */
    private Builder(RunWorkspaceCommandsOptions runWorkspaceCommandsOptions) {
      this.wId = runWorkspaceCommandsOptions.wId;
      this.refreshToken = runWorkspaceCommandsOptions.refreshToken;
      this.commands = runWorkspaceCommandsOptions.commands;
      this.operationName = runWorkspaceCommandsOptions.operationName;
      this.description = runWorkspaceCommandsOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param refreshToken the refreshToken
     */
    public Builder(String wId, String refreshToken) {
      this.wId = wId;
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a RunWorkspaceCommandsOptions.
     *
     * @return the new RunWorkspaceCommandsOptions instance
     */
    public RunWorkspaceCommandsOptions build() {
      return new RunWorkspaceCommandsOptions(this);
    }

    /**
     * Adds a new element to commands.
     *
     * @param commands the new element to be added
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder addCommands(TerraformCommand commands) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(commands,
        "commands cannot be null");
      if (this.commands == null) {
        this.commands = new ArrayList<TerraformCommand>();
      }
      this.commands.add(commands);
      return this;
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the commands.
     * Existing commands will be replaced.
     *
     * @param commands the commands
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder commands(List<TerraformCommand> commands) {
      this.commands = commands;
      return this;
    }

    /**
     * Set the operationName.
     *
     * @param operationName the operationName
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder operationName(String operationName) {
      this.operationName = operationName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RunWorkspaceCommandsOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected RunWorkspaceCommandsOptions() { }

  protected RunWorkspaceCommandsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    wId = builder.wId;
    refreshToken = builder.refreshToken;
    commands = builder.commands;
    operationName = builder.operationName;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a RunWorkspaceCommandsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace.  To find the workspace ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
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
   * Gets the commands.
   *
   * List of commands.  You can execute single set of commands or multiple commands.  For more information, about the
   * payload of the multiple commands,  refer to
   * [Commands](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#commands).
   *
   * @return the commands
   */
  public List<TerraformCommand> commands() {
    return commands;
  }

  /**
   * Gets the operationName.
   *
   * Command name.
   *
   * @return the operationName
   */
  public String operationName() {
    return operationName;
  }

  /**
   * Gets the description.
   *
   * Command description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

