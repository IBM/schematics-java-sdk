/*
 * (C) Copyright IBM Corp. 2021.
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

  @SerializedName("action_job_status")
  protected JobStatusAction actionJobStatus;
  @SerializedName("system_job_status")
  protected JobStatusSystem systemJobStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private JobStatusAction actionJobStatus;
    private JobStatusSystem systemJobStatus;

    private Builder(JobStatus jobStatus) {
      this.actionJobStatus = jobStatus.actionJobStatus;
      this.systemJobStatus = jobStatus.systemJobStatus;
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
  }

  protected JobStatus(Builder builder) {
    actionJobStatus = builder.actionJobStatus;
    systemJobStatus = builder.systemJobStatus;
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
}

