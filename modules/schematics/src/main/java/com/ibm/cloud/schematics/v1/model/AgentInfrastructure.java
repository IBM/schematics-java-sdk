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
 * The infrastructure parameters used by the agent.
 */
public class AgentInfrastructure extends GenericModel {

  /**
   * Type of target agent infrastructure.
   */
  public interface InfraType {
    /** ibm_kubernetes. */
    String IBM_KUBERNETES = "ibm_kubernetes";
    /** ibm_openshift. */
    String IBM_OPENSHIFT = "ibm_openshift";
    /** ibm_satellite. */
    String IBM_SATELLITE = "ibm_satellite";
  }

  @SerializedName("infra_type")
  protected String infraType;
  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_resource_group")
  protected String clusterResourceGroup;
  @SerializedName("cos_instance_name")
  protected String cosInstanceName;
  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_bucket_region")
  protected String cosBucketRegion;

  /**
   * Builder.
   */
  public static class Builder {
    private String infraType;
    private String clusterId;
    private String clusterResourceGroup;
    private String cosInstanceName;
    private String cosBucketName;
    private String cosBucketRegion;

    /**
     * Instantiates a new Builder from an existing AgentInfrastructure instance.
     *
     * @param agentInfrastructure the instance to initialize the Builder with
     */
    private Builder(AgentInfrastructure agentInfrastructure) {
      this.infraType = agentInfrastructure.infraType;
      this.clusterId = agentInfrastructure.clusterId;
      this.clusterResourceGroup = agentInfrastructure.clusterResourceGroup;
      this.cosInstanceName = agentInfrastructure.cosInstanceName;
      this.cosBucketName = agentInfrastructure.cosBucketName;
      this.cosBucketRegion = agentInfrastructure.cosBucketRegion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentInfrastructure.
     *
     * @return the new AgentInfrastructure instance
     */
    public AgentInfrastructure build() {
      return new AgentInfrastructure(this);
    }

    /**
     * Set the infraType.
     *
     * @param infraType the infraType
     * @return the AgentInfrastructure builder
     */
    public Builder infraType(String infraType) {
      this.infraType = infraType;
      return this;
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the AgentInfrastructure builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the clusterResourceGroup.
     *
     * @param clusterResourceGroup the clusterResourceGroup
     * @return the AgentInfrastructure builder
     */
    public Builder clusterResourceGroup(String clusterResourceGroup) {
      this.clusterResourceGroup = clusterResourceGroup;
      return this;
    }

    /**
     * Set the cosInstanceName.
     *
     * @param cosInstanceName the cosInstanceName
     * @return the AgentInfrastructure builder
     */
    public Builder cosInstanceName(String cosInstanceName) {
      this.cosInstanceName = cosInstanceName;
      return this;
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the AgentInfrastructure builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }

    /**
     * Set the cosBucketRegion.
     *
     * @param cosBucketRegion the cosBucketRegion
     * @return the AgentInfrastructure builder
     */
    public Builder cosBucketRegion(String cosBucketRegion) {
      this.cosBucketRegion = cosBucketRegion;
      return this;
    }
  }

  protected AgentInfrastructure() { }

  protected AgentInfrastructure(Builder builder) {
    infraType = builder.infraType;
    clusterId = builder.clusterId;
    clusterResourceGroup = builder.clusterResourceGroup;
    cosInstanceName = builder.cosInstanceName;
    cosBucketName = builder.cosBucketName;
    cosBucketRegion = builder.cosBucketRegion;
  }

  /**
   * New builder.
   *
   * @return a AgentInfrastructure builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the infraType.
   *
   * Type of target agent infrastructure.
   *
   * @return the infraType
   */
  public String infraType() {
    return infraType;
  }

  /**
   * Gets the clusterId.
   *
   * The cluster ID where agent services will be running.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the clusterResourceGroup.
   *
   * The resource group of the cluster (is it required?).
   *
   * @return the clusterResourceGroup
   */
  public String clusterResourceGroup() {
    return clusterResourceGroup;
  }

  /**
   * Gets the cosInstanceName.
   *
   * The COS instance name to store the agent logs.
   *
   * @return the cosInstanceName
   */
  public String cosInstanceName() {
    return cosInstanceName;
  }

  /**
   * Gets the cosBucketName.
   *
   * The COS bucket name used to store the logs.
   *
   * @return the cosBucketName
   */
  public String cosBucketName() {
    return cosBucketName;
  }

  /**
   * Gets the cosBucketRegion.
   *
   * The COS bucket region.
   *
   * @return the cosBucketRegion
   */
  public String cosBucketRegion() {
    return cosBucketRegion;
  }
}

