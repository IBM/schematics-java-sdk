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
 * The updateAgentData options.
 */
public class UpdateAgentDataOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface SchematicsLocation {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String agentId;
  protected String name;
  protected String resourceGroup;
  protected String version;
  protected String schematicsLocation;
  protected String agentLocation;
  protected AgentInfrastructure agentInfrastructure;
  protected String description;
  protected List<String> tags;
  protected List<AgentMetadataInfo> agentMetadata;
  protected List<VariableData> agentInputs;
  protected AgentUserState userState;
  protected AgentKPIData agentKpi;
  protected String refreshToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;
    private String name;
    private String resourceGroup;
    private String version;
    private String schematicsLocation;
    private String agentLocation;
    private AgentInfrastructure agentInfrastructure;
    private String description;
    private List<String> tags;
    private List<AgentMetadataInfo> agentMetadata;
    private List<VariableData> agentInputs;
    private AgentUserState userState;
    private AgentKPIData agentKpi;
    private String refreshToken;

    /**
     * Instantiates a new Builder from an existing UpdateAgentDataOptions instance.
     *
     * @param updateAgentDataOptions the instance to initialize the Builder with
     */
    private Builder(UpdateAgentDataOptions updateAgentDataOptions) {
      this.agentId = updateAgentDataOptions.agentId;
      this.name = updateAgentDataOptions.name;
      this.resourceGroup = updateAgentDataOptions.resourceGroup;
      this.version = updateAgentDataOptions.version;
      this.schematicsLocation = updateAgentDataOptions.schematicsLocation;
      this.agentLocation = updateAgentDataOptions.agentLocation;
      this.agentInfrastructure = updateAgentDataOptions.agentInfrastructure;
      this.description = updateAgentDataOptions.description;
      this.tags = updateAgentDataOptions.tags;
      this.agentMetadata = updateAgentDataOptions.agentMetadata;
      this.agentInputs = updateAgentDataOptions.agentInputs;
      this.userState = updateAgentDataOptions.userState;
      this.agentKpi = updateAgentDataOptions.agentKpi;
      this.refreshToken = updateAgentDataOptions.refreshToken;
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
     * @param name the name
     * @param resourceGroup the resourceGroup
     * @param version the version
     * @param schematicsLocation the schematicsLocation
     * @param agentLocation the agentLocation
     * @param agentInfrastructure the agentInfrastructure
     */
    public Builder(String agentId, String name, String resourceGroup, String version, String schematicsLocation, String agentLocation, AgentInfrastructure agentInfrastructure) {
      this.agentId = agentId;
      this.name = name;
      this.resourceGroup = resourceGroup;
      this.version = version;
      this.schematicsLocation = schematicsLocation;
      this.agentLocation = agentLocation;
      this.agentInfrastructure = agentInfrastructure;
    }

    /**
     * Builds a UpdateAgentDataOptions.
     *
     * @return the new UpdateAgentDataOptions instance
     */
    public UpdateAgentDataOptions build() {
      return new UpdateAgentDataOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the UpdateAgentDataOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds a new element to agentMetadata.
     *
     * @param agentMetadata the new element to be added
     * @return the UpdateAgentDataOptions builder
     */
    public Builder addAgentMetadata(AgentMetadataInfo agentMetadata) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(agentMetadata,
        "agentMetadata cannot be null");
      if (this.agentMetadata == null) {
        this.agentMetadata = new ArrayList<AgentMetadataInfo>();
      }
      this.agentMetadata.add(agentMetadata);
      return this;
    }

    /**
     * Adds a new element to agentInputs.
     *
     * @param agentInputs the new element to be added
     * @return the UpdateAgentDataOptions builder
     */
    public Builder addAgentInputs(VariableData agentInputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(agentInputs,
        "agentInputs cannot be null");
      if (this.agentInputs == null) {
        this.agentInputs = new ArrayList<VariableData>();
      }
      this.agentInputs.add(agentInputs);
      return this;
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAgentDataOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the UpdateAgentDataOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the UpdateAgentDataOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the schematicsLocation.
     *
     * @param schematicsLocation the schematicsLocation
     * @return the UpdateAgentDataOptions builder
     */
    public Builder schematicsLocation(String schematicsLocation) {
      this.schematicsLocation = schematicsLocation;
      return this;
    }

    /**
     * Set the agentLocation.
     *
     * @param agentLocation the agentLocation
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentLocation(String agentLocation) {
      this.agentLocation = agentLocation;
      return this;
    }

    /**
     * Set the agentInfrastructure.
     *
     * @param agentInfrastructure the agentInfrastructure
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentInfrastructure(AgentInfrastructure agentInfrastructure) {
      this.agentInfrastructure = agentInfrastructure;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateAgentDataOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateAgentDataOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the agentMetadata.
     * Existing agentMetadata will be replaced.
     *
     * @param agentMetadata the agentMetadata
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentMetadata(List<AgentMetadataInfo> agentMetadata) {
      this.agentMetadata = agentMetadata;
      return this;
    }

    /**
     * Set the agentInputs.
     * Existing agentInputs will be replaced.
     *
     * @param agentInputs the agentInputs
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentInputs(List<VariableData> agentInputs) {
      this.agentInputs = agentInputs;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the UpdateAgentDataOptions builder
     */
    public Builder userState(AgentUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the agentKpi.
     *
     * @param agentKpi the agentKpi
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentKpi(AgentKPIData agentKpi) {
      this.agentKpi = agentKpi;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the UpdateAgentDataOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the agentData.
     *
     * @param agentData the agentData
     * @return the UpdateAgentDataOptions builder
     */
    public Builder agentData(AgentData agentData) {
      this.name = agentData.name();
      this.resourceGroup = agentData.resourceGroup();
      this.version = agentData.version();
      this.schematicsLocation = agentData.schematicsLocation();
      this.agentLocation = agentData.agentLocation();
      this.agentInfrastructure = agentData.agentInfrastructure();
      this.description = agentData.description();
      this.tags = agentData.tags();
      this.agentMetadata = agentData.agentMetadata();
      this.agentInputs = agentData.agentInputs();
      this.userState = agentData.userState();
      this.agentKpi = agentData.agentKpi();
      return this;
    }
  }

  protected UpdateAgentDataOptions() { }

  protected UpdateAgentDataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.agentId,
      "agentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceGroup,
      "resourceGroup cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.version,
      "version cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schematicsLocation,
      "schematicsLocation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.agentLocation,
      "agentLocation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.agentInfrastructure,
      "agentInfrastructure cannot be null");
    agentId = builder.agentId;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    version = builder.version;
    schematicsLocation = builder.schematicsLocation;
    agentLocation = builder.agentLocation;
    agentInfrastructure = builder.agentInfrastructure;
    description = builder.description;
    tags = builder.tags;
    agentMetadata = builder.agentMetadata;
    agentInputs = builder.agentInputs;
    userState = builder.userState;
    agentKpi = builder.agentKpi;
    refreshToken = builder.refreshToken;
  }

  /**
   * New builder.
   *
   * @return a UpdateAgentDataOptions builder
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
   * Gets the name.
   *
   * The name of the agent (must be unique, for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource-group name for the agent.  By default, agent will be registered in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the version.
   *
   * Agent version.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the schematicsLocation.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the schematicsLocation
   */
  public String schematicsLocation() {
    return schematicsLocation;
  }

  /**
   * Gets the agentLocation.
   *
   * The location where agent is deployed in the user environment.
   *
   * @return the agentLocation
   */
  public String agentLocation() {
    return agentLocation;
  }

  /**
   * Gets the agentInfrastructure.
   *
   * The infrastructure parameters used by the agent.
   *
   * @return the agentInfrastructure
   */
  public AgentInfrastructure agentInfrastructure() {
    return agentInfrastructure;
  }

  /**
   * Gets the description.
   *
   * Agent description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tags.
   *
   * Tags for the agent.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the agentMetadata.
   *
   * The metadata of an agent.
   *
   * @return the agentMetadata
   */
  public List<AgentMetadataInfo> agentMetadata() {
    return agentMetadata;
  }

  /**
   * Gets the agentInputs.
   *
   * Additional input variables for the agent.
   *
   * @return the agentInputs
   */
  public List<VariableData> agentInputs() {
    return agentInputs;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the agent.
   *
   * @return the userState
   */
  public AgentUserState userState() {
    return userState;
  }

  /**
   * Gets the agentKpi.
   *
   * Schematics Agent key performance indicators.
   *
   * @return the agentKpi
   */
  public AgentKPIData agentKpi() {
    return agentKpi;
  }

  /**
   * Gets the refreshToken.
   *
   * This IAM token is required only when trying to update an agent from one version to other.
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

