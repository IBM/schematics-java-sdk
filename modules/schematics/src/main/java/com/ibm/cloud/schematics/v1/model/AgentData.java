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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The agent details, with user inputs and system generated data.
 */
public class AgentData extends GenericModel {

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

  protected String name;
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  protected String version;
  @SerializedName("schematics_location")
  protected String schematicsLocation;
  @SerializedName("agent_location")
  protected String agentLocation;
  @SerializedName("agent_infrastructure")
  protected AgentInfrastructure agentInfrastructure;
  @SerializedName("agent_metadata")
  protected List<AgentMetadataInfo> agentMetadata;
  @SerializedName("agent_inputs")
  protected List<VariableData> agentInputs;
  @SerializedName("user_state")
  protected AgentUserState userState;
  @SerializedName("agent_crn")
  protected String agentCrn;
  protected String id;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("creation_by")
  protected String creationBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("system_state")
  protected AgentSystemStatus systemState;
  @SerializedName("agent_kpi")
  protected AgentKPIData agentKpi;
  @SerializedName("recent_prs_job")
  protected AgentDataRecentPrsJob recentPrsJob;
  @SerializedName("recent_deploy_job")
  protected AgentDataRecentDeployJob recentDeployJob;
  @SerializedName("recent_health_job")
  protected AgentDataRecentHealthJob recentHealthJob;
  @SerializedName("recent_destroy_job")
  protected AgentDataRecentDestroyJob recentDestroyJob;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String version;
    private String schematicsLocation;
    private String agentLocation;
    private AgentInfrastructure agentInfrastructure;
    private List<AgentMetadataInfo> agentMetadata;
    private List<VariableData> agentInputs;
    private AgentUserState userState;
    private AgentKPIData agentKpi;

    /**
     * Instantiates a new Builder from an existing AgentData instance.
     *
     * @param agentData the instance to initialize the Builder with
     */
    private Builder(AgentData agentData) {
      this.name = agentData.name;
      this.description = agentData.description;
      this.resourceGroup = agentData.resourceGroup;
      this.tags = agentData.tags;
      this.version = agentData.version;
      this.schematicsLocation = agentData.schematicsLocation;
      this.agentLocation = agentData.agentLocation;
      this.agentInfrastructure = agentData.agentInfrastructure;
      this.agentMetadata = agentData.agentMetadata;
      this.agentInputs = agentData.agentInputs;
      this.userState = agentData.userState;
      this.agentKpi = agentData.agentKpi;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param resourceGroup the resourceGroup
     * @param version the version
     * @param schematicsLocation the schematicsLocation
     * @param agentLocation the agentLocation
     * @param agentInfrastructure the agentInfrastructure
     */
    public Builder(String name, String resourceGroup, String version, String schematicsLocation, String agentLocation, AgentInfrastructure agentInfrastructure) {
      this.name = name;
      this.resourceGroup = resourceGroup;
      this.version = version;
      this.schematicsLocation = schematicsLocation;
      this.agentLocation = agentLocation;
      this.agentInfrastructure = agentInfrastructure;
    }

    /**
     * Builds a AgentData.
     *
     * @return the new AgentData instance
     */
    public AgentData build() {
      return new AgentData(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the AgentData builder
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
     * @return the AgentData builder
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
     * @return the AgentData builder
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
     * Set the name.
     *
     * @param name the name
     * @return the AgentData builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the AgentData builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the AgentData builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the AgentData builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the AgentData builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the schematicsLocation.
     *
     * @param schematicsLocation the schematicsLocation
     * @return the AgentData builder
     */
    public Builder schematicsLocation(String schematicsLocation) {
      this.schematicsLocation = schematicsLocation;
      return this;
    }

    /**
     * Set the agentLocation.
     *
     * @param agentLocation the agentLocation
     * @return the AgentData builder
     */
    public Builder agentLocation(String agentLocation) {
      this.agentLocation = agentLocation;
      return this;
    }

    /**
     * Set the agentInfrastructure.
     *
     * @param agentInfrastructure the agentInfrastructure
     * @return the AgentData builder
     */
    public Builder agentInfrastructure(AgentInfrastructure agentInfrastructure) {
      this.agentInfrastructure = agentInfrastructure;
      return this;
    }

    /**
     * Set the agentMetadata.
     * Existing agentMetadata will be replaced.
     *
     * @param agentMetadata the agentMetadata
     * @return the AgentData builder
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
     * @return the AgentData builder
     */
    public Builder agentInputs(List<VariableData> agentInputs) {
      this.agentInputs = agentInputs;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the AgentData builder
     */
    public Builder userState(AgentUserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the agentKpi.
     *
     * @param agentKpi the agentKpi
     * @return the AgentData builder
     */
    public Builder agentKpi(AgentKPIData agentKpi) {
      this.agentKpi = agentKpi;
      return this;
    }
  }

  protected AgentData() { }

  protected AgentData(Builder builder) {
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
    name = builder.name;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    version = builder.version;
    schematicsLocation = builder.schematicsLocation;
    agentLocation = builder.agentLocation;
    agentInfrastructure = builder.agentInfrastructure;
    agentMetadata = builder.agentMetadata;
    agentInputs = builder.agentInputs;
    userState = builder.userState;
    agentKpi = builder.agentKpi;
  }

  /**
   * New builder.
   *
   * @return a AgentData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the agentCrn.
   *
   * The agent crn, obtained from the Schematics agent deployment configuration.
   *
   * @return the agentCrn
   */
  public String agentCrn() {
    return agentCrn;
  }

  /**
   * Gets the id.
   *
   * The agent resource id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the createdAt.
   *
   * The agent creation date-time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the creationBy.
   *
   * The email address of an user who created the agent.
   *
   * @return the creationBy
   */
  public String creationBy() {
    return creationBy;
  }

  /**
   * Gets the updatedAt.
   *
   * The agent registration updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the agent registration.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the systemState.
   *
   * Computed state of the agent.
   *
   * @return the systemState
   */
  public AgentSystemStatus systemState() {
    return systemState;
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
   * Gets the recentPrsJob.
   *
   * Run a pre-requisite scanner for deploying agent.
   *
   * @return the recentPrsJob
   */
  public AgentDataRecentPrsJob recentPrsJob() {
    return recentPrsJob;
  }

  /**
   * Gets the recentDeployJob.
   *
   * Post-installations checks for Agent health.
   *
   * @return the recentDeployJob
   */
  public AgentDataRecentDeployJob recentDeployJob() {
    return recentDeployJob;
  }

  /**
   * Gets the recentHealthJob.
   *
   * Agent health check.
   *
   * @return the recentHealthJob
   */
  public AgentDataRecentHealthJob recentHealthJob() {
    return recentHealthJob;
  }

  /**
   * Gets the recentDestroyJob.
   *
   * destroy resource provisoned by agent deploy method.
   *
   * @return the recentDestroyJob
   */
  public AgentDataRecentDestroyJob recentDestroyJob() {
    return recentDestroyJob;
  }
}

