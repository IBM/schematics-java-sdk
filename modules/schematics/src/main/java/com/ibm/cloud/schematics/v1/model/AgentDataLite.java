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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The agent details for a list view.
 */
public class AgentDataLite extends GenericModel {

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
  @SerializedName("agent_metadata")
  protected List<AgentMetadataInfo> agentMetadata;
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
  protected AgentKPIDataLite agentKpi;

  protected AgentDataLite() { }

  /**
   * Gets the name.
   *
   * The name of the agent (must be unique, for an account).
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Agent description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource-group name for the agent.  By default, agent will be registered in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Tags for the agent.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the version.
   *
   * The agent version.
   *
   * @return the version
   */
  public String getVersion() {
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
  public String getSchematicsLocation() {
    return schematicsLocation;
  }

  /**
   * Gets the agentLocation.
   *
   * The location where agent is deployed in the user environment.
   *
   * @return the agentLocation
   */
  public String getAgentLocation() {
    return agentLocation;
  }

  /**
   * Gets the agentMetadata.
   *
   * The metadata of an agent.
   *
   * @return the agentMetadata
   */
  public List<AgentMetadataInfo> getAgentMetadata() {
    return agentMetadata;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the agent.
   *
   * @return the userState
   */
  public AgentUserState getUserState() {
    return userState;
  }

  /**
   * Gets the agentCrn.
   *
   * The agent crn, obtained from the Schematics agent deployment configuration.
   *
   * @return the agentCrn
   */
  public String getAgentCrn() {
    return agentCrn;
  }

  /**
   * Gets the id.
   *
   * The agent resource id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdAt.
   *
   * The agent creation date-time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the creationBy.
   *
   * The email address of an user who created the agent.
   *
   * @return the creationBy
   */
  public String getCreationBy() {
    return creationBy;
  }

  /**
   * Gets the updatedAt.
   *
   * The agent registration updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the agent registration.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the systemState.
   *
   * Computed state of the agent.
   *
   * @return the systemState
   */
  public AgentSystemStatus getSystemState() {
    return systemState;
  }

  /**
   * Gets the agentKpi.
   *
   * Schematics Agent key performance indicators' summary.
   *
   * @return the agentKpi
   */
  public AgentKPIDataLite getAgentKpi() {
    return agentKpi;
  }
}

