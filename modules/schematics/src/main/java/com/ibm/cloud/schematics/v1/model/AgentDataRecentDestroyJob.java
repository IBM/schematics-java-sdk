/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * destroy resource provisoned by agent deploy method.
 */
public class AgentDataRecentDestroyJob extends GenericModel {

  /**
   * Status of Jobs.
   */
  public interface StatusCode {
    /** job_pending. */
    String JOB_PENDING = "job_pending";
    /** job_in_progress. */
    String JOB_IN_PROGRESS = "job_in_progress";
    /** job_finished. */
    String JOB_FINISHED = "job_finished";
    /** job_failed. */
    String JOB_FAILED = "job_failed";
    /** job_cancelled. */
    String JOB_CANCELLED = "job_cancelled";
    /** job_stopped. */
    String JOB_STOPPED = "job_stopped";
    /** job_stop_in_progress. */
    String JOB_STOP_IN_PROGRESS = "job_stop_in_progress";
    /** job_ready_to_execute. */
    String JOB_READY_TO_EXECUTE = "job_ready_to_execute";
  }

  @SerializedName("agent_id")
  protected String agentId;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("agent_version")
  protected String agentVersion;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("log_url")
  protected String logUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;
    private String jobId;
    private String statusCode;
    private String statusMessage;
    private String logUrl;

    /**
     * Instantiates a new Builder from an existing AgentDataRecentDestroyJob instance.
     *
     * @param agentDataRecentDestroyJob the instance to initialize the Builder with
     */
    private Builder(AgentDataRecentDestroyJob agentDataRecentDestroyJob) {
      this.agentId = agentDataRecentDestroyJob.agentId;
      this.jobId = agentDataRecentDestroyJob.jobId;
      this.statusCode = agentDataRecentDestroyJob.statusCode;
      this.statusMessage = agentDataRecentDestroyJob.statusMessage;
      this.logUrl = agentDataRecentDestroyJob.logUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AgentDataRecentDestroyJob.
     *
     * @return the new AgentDataRecentDestroyJob instance
     */
    public AgentDataRecentDestroyJob build() {
      return new AgentDataRecentDestroyJob(this);
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the AgentDataRecentDestroyJob builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the AgentDataRecentDestroyJob builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the AgentDataRecentDestroyJob builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the AgentDataRecentDestroyJob builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the logUrl.
     *
     * @param logUrl the logUrl
     * @return the AgentDataRecentDestroyJob builder
     */
    public Builder logUrl(String logUrl) {
      this.logUrl = logUrl;
      return this;
    }
  }

  protected AgentDataRecentDestroyJob() { }

  protected AgentDataRecentDestroyJob(Builder builder) {
    agentId = builder.agentId;
    jobId = builder.jobId;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    logUrl = builder.logUrl;
  }

  /**
   * New builder.
   *
   * @return a AgentDataRecentDestroyJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the agentId.
   *
   * Id of the agent.
   *
   * @return the agentId
   */
  public String agentId() {
    return agentId;
  }

  /**
   * Gets the jobId.
   *
   * Job Id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the updatedAt.
   *
   * The agent resources destroy job updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who ran the agent resources destroy job.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the agentVersion.
   *
   * Agent version.
   *
   * @return the agentVersion
   */
  public String agentVersion() {
    return agentVersion;
  }

  /**
   * Gets the statusCode.
   *
   * Status of Jobs.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * The outcome of the agent resources destroy job, in a formatted log string.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * Gets the logUrl.
   *
   * URL to the full agent resources destroy job logs.
   *
   * @return the logUrl
   */
  public String logUrl() {
    return logUrl;
  }
}

