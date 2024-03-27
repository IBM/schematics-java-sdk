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
 * Job Status.
 */
public class JobStatus extends GenericModel {

  @SerializedName("position_in_queue")
  protected Double positionInQueue;
  @SerializedName("total_in_queue")
  protected Double totalInQueue;
  @SerializedName("workspace_job_status")
  protected JobStatusWorkspace workspaceJobStatus;
  @SerializedName("action_job_status")
  protected JobStatusAction actionJobStatus;
  @SerializedName("system_job_status")
  protected JobStatusSystem systemJobStatus;
  @SerializedName("flow_job_status")
  protected JobStatusFlow flowJobStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private Double positionInQueue;
    private Double totalInQueue;
    private JobStatusWorkspace workspaceJobStatus;
    private JobStatusAction actionJobStatus;
    private JobStatusSystem systemJobStatus;
    private JobStatusFlow flowJobStatus;

    /**
     * Instantiates a new Builder from an existing JobStatus instance.
     *
     * @param jobStatus the instance to initialize the Builder with
     */
    private Builder(JobStatus jobStatus) {
      this.positionInQueue = jobStatus.positionInQueue;
      this.totalInQueue = jobStatus.totalInQueue;
      this.workspaceJobStatus = jobStatus.workspaceJobStatus;
      this.actionJobStatus = jobStatus.actionJobStatus;
      this.systemJobStatus = jobStatus.systemJobStatus;
      this.flowJobStatus = jobStatus.flowJobStatus;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatus.
     *
     * @return the new JobStatus instance
     */
    public JobStatus build() {
      return new JobStatus(this);
    }

    /**
     * Set the positionInQueue.
     *
     * @param positionInQueue the positionInQueue
     * @return the JobStatus builder
     */
    public Builder positionInQueue(Double positionInQueue) {
      this.positionInQueue = positionInQueue;
      return this;
    }

    /**
     * Set the totalInQueue.
     *
     * @param totalInQueue the totalInQueue
     * @return the JobStatus builder
     */
    public Builder totalInQueue(Double totalInQueue) {
      this.totalInQueue = totalInQueue;
      return this;
    }

    /**
     * Set the workspaceJobStatus.
     *
     * @param workspaceJobStatus the workspaceJobStatus
     * @return the JobStatus builder
     */
    public Builder workspaceJobStatus(JobStatusWorkspace workspaceJobStatus) {
      this.workspaceJobStatus = workspaceJobStatus;
      return this;
    }

    /**
     * Set the actionJobStatus.
     *
     * @param actionJobStatus the actionJobStatus
     * @return the JobStatus builder
     */
    public Builder actionJobStatus(JobStatusAction actionJobStatus) {
      this.actionJobStatus = actionJobStatus;
      return this;
    }

    /**
     * Set the systemJobStatus.
     *
     * @param systemJobStatus the systemJobStatus
     * @return the JobStatus builder
     */
    public Builder systemJobStatus(JobStatusSystem systemJobStatus) {
      this.systemJobStatus = systemJobStatus;
      return this;
    }

    /**
     * Set the flowJobStatus.
     *
     * @param flowJobStatus the flowJobStatus
     * @return the JobStatus builder
     */
    public Builder flowJobStatus(JobStatusFlow flowJobStatus) {
      this.flowJobStatus = flowJobStatus;
      return this;
    }
  }

  protected JobStatus() { }

  protected JobStatus(Builder builder) {
    positionInQueue = builder.positionInQueue;
    totalInQueue = builder.totalInQueue;
    workspaceJobStatus = builder.workspaceJobStatus;
    actionJobStatus = builder.actionJobStatus;
    systemJobStatus = builder.systemJobStatus;
    flowJobStatus = builder.flowJobStatus;
  }

  /**
   * New builder.
   *
   * @return a JobStatus builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the positionInQueue.
   *
   * Position of job in pending queue.
   *
   * @return the positionInQueue
   */
  public Double positionInQueue() {
    return positionInQueue;
  }

  /**
   * Gets the totalInQueue.
   *
   * Total no. of jobs in pending queue.
   *
   * @return the totalInQueue
   */
  public Double totalInQueue() {
    return totalInQueue;
  }

  /**
   * Gets the workspaceJobStatus.
   *
   * Workspace Job Status.
   *
   * @return the workspaceJobStatus
   */
  public JobStatusWorkspace workspaceJobStatus() {
    return workspaceJobStatus;
  }

  /**
   * Gets the actionJobStatus.
   *
   * Action Job Status.
   *
   * @return the actionJobStatus
   */
  public JobStatusAction actionJobStatus() {
    return actionJobStatus;
  }

  /**
   * Gets the systemJobStatus.
   *
   * System Job Status.
   *
   * @return the systemJobStatus
   */
  public JobStatusSystem systemJobStatus() {
    return systemJobStatus;
  }

  /**
   * Gets the flowJobStatus.
   *
   * Environment Flow JOB Status.
   *
   * @return the flowJobStatus
   */
  public JobStatusFlow flowJobStatus() {
    return flowJobStatus;
  }
}

