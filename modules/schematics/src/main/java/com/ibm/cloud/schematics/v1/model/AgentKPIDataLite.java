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
 * Schematics Agent key performance indicators' summary.
 */
public class AgentKPIDataLite extends GenericModel {

  /**
   * Overall availability indicator reported by the agent.
   */
  public interface AvailabilityIndicator {
    /** available. */
    String AVAILABLE = "available";
    /** unavailable. */
    String UNAVAILABLE = "unavailable";
    /** error. */
    String ERROR = "error";
  }

  /**
   * Overall lifecycle indicator reported by the agents.
   */
  public interface LifecycleIndicator {
    /** consistent. */
    String CONSISTENT = "consistent";
    /** inconsistent. */
    String INCONSISTENT = "inconsistent";
    /** obselete. */
    String OBSELETE = "obselete";
  }

  @SerializedName("availability_indicator")
  protected String availabilityIndicator;
  @SerializedName("lifecycle_indicator")
  protected String lifecycleIndicator;
  @SerializedName("percent_usage_indicator")
  protected String percentUsageIndicator;

  protected AgentKPIDataLite() { }

  /**
   * Gets the availabilityIndicator.
   *
   * Overall availability indicator reported by the agent.
   *
   * @return the availabilityIndicator
   */
  public String getAvailabilityIndicator() {
    return availabilityIndicator;
  }

  /**
   * Gets the lifecycleIndicator.
   *
   * Overall lifecycle indicator reported by the agents.
   *
   * @return the lifecycleIndicator
   */
  public String getLifecycleIndicator() {
    return lifecycleIndicator;
  }

  /**
   * Gets the percentUsageIndicator.
   *
   * Percentage usage of the agent resources.
   *
   * @return the percentUsageIndicator
   */
  public String getPercentUsageIndicator() {
    return percentUsageIndicator;
  }
}

