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
 * Schematics Agent key performance indicators.
 */
public class AgentKPIData extends GenericModel {

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
  @SerializedName("application_indicators")
  protected List<Object> applicationIndicators;
  @SerializedName("infra_indicators")
  protected List<Object> infraIndicators;

  /**
   * Builder.
   */
  public static class Builder {
    private String availabilityIndicator;
    private String lifecycleIndicator;
    private String percentUsageIndicator;
    private List<Object> applicationIndicators;
    private List<Object> infraIndicators;

    /**
     * Instantiates a new Builder from an existing AgentKPIData instance.
     *
     * @param agentKpiData the instance to initialize the Builder with
     */
    private Builder(AgentKPIData agentKpiData) {
      this.availabilityIndicator = agentKpiData.availabilityIndicator;
      this.lifecycleIndicator = agentKpiData.lifecycleIndicator;
      this.percentUsageIndicator = agentKpiData.percentUsageIndicator;
      this.applicationIndicators = agentKpiData.applicationIndicators;
      this.infraIndicators = agentKpiData.infraIndicators;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentKPIData.
     *
     * @return the new AgentKPIData instance
     */
    public AgentKPIData build() {
      return new AgentKPIData(this);
    }

    /**
     * Adds a new element to applicationIndicators.
     *
     * @param applicationIndicators the new element to be added
     * @return the AgentKPIData builder
     */
    public Builder addApplicationIndicators(Object applicationIndicators) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(applicationIndicators,
        "applicationIndicators cannot be null");
      if (this.applicationIndicators == null) {
        this.applicationIndicators = new ArrayList<Object>();
      }
      this.applicationIndicators.add(applicationIndicators);
      return this;
    }

    /**
     * Adds a new element to infraIndicators.
     *
     * @param infraIndicators the new element to be added
     * @return the AgentKPIData builder
     */
    public Builder addInfraIndicators(Object infraIndicators) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(infraIndicators,
        "infraIndicators cannot be null");
      if (this.infraIndicators == null) {
        this.infraIndicators = new ArrayList<Object>();
      }
      this.infraIndicators.add(infraIndicators);
      return this;
    }

    /**
     * Set the availabilityIndicator.
     *
     * @param availabilityIndicator the availabilityIndicator
     * @return the AgentKPIData builder
     */
    public Builder availabilityIndicator(String availabilityIndicator) {
      this.availabilityIndicator = availabilityIndicator;
      return this;
    }

    /**
     * Set the lifecycleIndicator.
     *
     * @param lifecycleIndicator the lifecycleIndicator
     * @return the AgentKPIData builder
     */
    public Builder lifecycleIndicator(String lifecycleIndicator) {
      this.lifecycleIndicator = lifecycleIndicator;
      return this;
    }

    /**
     * Set the percentUsageIndicator.
     *
     * @param percentUsageIndicator the percentUsageIndicator
     * @return the AgentKPIData builder
     */
    public Builder percentUsageIndicator(String percentUsageIndicator) {
      this.percentUsageIndicator = percentUsageIndicator;
      return this;
    }

    /**
     * Set the applicationIndicators.
     * Existing applicationIndicators will be replaced.
     *
     * @param applicationIndicators the applicationIndicators
     * @return the AgentKPIData builder
     */
    public Builder applicationIndicators(List<Object> applicationIndicators) {
      this.applicationIndicators = applicationIndicators;
      return this;
    }

    /**
     * Set the infraIndicators.
     * Existing infraIndicators will be replaced.
     *
     * @param infraIndicators the infraIndicators
     * @return the AgentKPIData builder
     */
    public Builder infraIndicators(List<Object> infraIndicators) {
      this.infraIndicators = infraIndicators;
      return this;
    }
  }

  protected AgentKPIData() { }

  protected AgentKPIData(Builder builder) {
    availabilityIndicator = builder.availabilityIndicator;
    lifecycleIndicator = builder.lifecycleIndicator;
    percentUsageIndicator = builder.percentUsageIndicator;
    applicationIndicators = builder.applicationIndicators;
    infraIndicators = builder.infraIndicators;
  }

  /**
   * New builder.
   *
   * @return a AgentKPIData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the availabilityIndicator.
   *
   * Overall availability indicator reported by the agent.
   *
   * @return the availabilityIndicator
   */
  public String availabilityIndicator() {
    return availabilityIndicator;
  }

  /**
   * Gets the lifecycleIndicator.
   *
   * Overall lifecycle indicator reported by the agents.
   *
   * @return the lifecycleIndicator
   */
  public String lifecycleIndicator() {
    return lifecycleIndicator;
  }

  /**
   * Gets the percentUsageIndicator.
   *
   * Percentage usage of the agent resources.
   *
   * @return the percentUsageIndicator
   */
  public String percentUsageIndicator() {
    return percentUsageIndicator;
  }

  /**
   * Gets the applicationIndicators.
   *
   * Agent application key performance indicators.
   *
   * @return the applicationIndicators
   */
  public List<Object> applicationIndicators() {
    return applicationIndicators;
  }

  /**
   * Gets the infraIndicators.
   *
   * Agent infrastructure key performance indicators.
   *
   * @return the infraIndicators
   */
  public List<Object> infraIndicators() {
    return infraIndicators;
  }
}

