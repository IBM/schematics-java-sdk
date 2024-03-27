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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An item in list of all the versions available.
 */
public class AgentVersionInfo extends GenericModel {

  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("agent_version")
  protected String agentVersion;

  protected AgentVersionInfo() { }

  /**
   * Gets the displayName.
   *
   * The display name of the agent version.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the agentVersion.
   *
   * The version of the agent.
   *
   * @return the agentVersion
   */
  public String getAgentVersion() {
    return agentVersion;
  }
}

