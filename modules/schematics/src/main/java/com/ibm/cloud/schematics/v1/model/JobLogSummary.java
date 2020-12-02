/*
 * (C) Copyright IBM Corp. 2020.
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
 * Job log summary record.
 */
public class JobLogSummary extends GenericModel {

  /**
   * Type of Job.
   */
  public interface JobType {
    /** repo_download_job. */
    String REPO_DOWNLOAD_JOB = "repo_download_job";
    /** workspace_job. */
    String WORKSPACE_JOB = "workspace_job";
    /** action_job. */
    String ACTION_JOB = "action_job";
    /** controls_job. */
    String CONTROLS_JOB = "controls_job";
    /** capsule_job. */
    String CAPSULE_JOB = "capsule_job";
  }

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_type")
  protected String jobType;
  @SerializedName("log_start_at")
  protected Date logStartAt;
  @SerializedName("log_analyzed_till")
  protected Date logAnalyzedTill;
  @SerializedName("elapsed_time")
  protected Double elapsedTime;
  @SerializedName("log_errors")
  protected List<JobLogSummaryLogErrorsItem> logErrors;
  @SerializedName("repo_download_job")
  protected JobLogSummaryRepoDownloadJob repoDownloadJob;
  @SerializedName("action_job")
  protected JobLogSummaryActionJob actionJob;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobType;
    private JobLogSummaryRepoDownloadJob repoDownloadJob;
    private JobLogSummaryActionJob actionJob;

    private Builder(JobLogSummary jobLogSummary) {
      this.jobType = jobLogSummary.jobType;
      this.repoDownloadJob = jobLogSummary.repoDownloadJob;
      this.actionJob = jobLogSummary.actionJob;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummary.
     *
     * @return the new JobLogSummary instance
     */
    public JobLogSummary build() {
      return new JobLogSummary(this);
    }

    /**
     * Set the jobType.
     *
     * @param jobType the jobType
     * @return the JobLogSummary builder
     */
    public Builder jobType(String jobType) {
      this.jobType = jobType;
      return this;
    }

    /**
     * Set the repoDownloadJob.
     *
     * @param repoDownloadJob the repoDownloadJob
     * @return the JobLogSummary builder
     */
    public Builder repoDownloadJob(JobLogSummaryRepoDownloadJob repoDownloadJob) {
      this.repoDownloadJob = repoDownloadJob;
      return this;
    }

    /**
     * Set the actionJob.
     *
     * @param actionJob the actionJob
     * @return the JobLogSummary builder
     */
    public Builder actionJob(JobLogSummaryActionJob actionJob) {
      this.actionJob = actionJob;
      return this;
    }
  }

  protected JobLogSummary(Builder builder) {
    jobType = builder.jobType;
    repoDownloadJob = builder.repoDownloadJob;
    actionJob = builder.actionJob;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Workspace Id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the jobType.
   *
   * Type of Job.
   *
   * @return the jobType
   */
  public String jobType() {
    return jobType;
  }

  /**
   * Gets the logStartAt.
   *
   * Job log start timestamp.
   *
   * @return the logStartAt
   */
  public Date logStartAt() {
    return logStartAt;
  }

  /**
   * Gets the logAnalyzedTill.
   *
   * Job log update timestamp.
   *
   * @return the logAnalyzedTill
   */
  public Date logAnalyzedTill() {
    return logAnalyzedTill;
  }

  /**
   * Gets the elapsedTime.
   *
   * Job log elapsed time (log_analyzed_till - log_start_at).
   *
   * @return the elapsedTime
   */
  public Double elapsedTime() {
    return elapsedTime;
  }

  /**
   * Gets the logErrors.
   *
   * Job log errors.
   *
   * @return the logErrors
   */
  public List<JobLogSummaryLogErrorsItem> logErrors() {
    return logErrors;
  }

  /**
   * Gets the repoDownloadJob.
   *
   * Repo download Job log summary.
   *
   * @return the repoDownloadJob
   */
  public JobLogSummaryRepoDownloadJob repoDownloadJob() {
    return repoDownloadJob;
  }

  /**
   * Gets the actionJob.
   *
   * Flow Job log summary.
   *
   * @return the actionJob
   */
  public JobLogSummaryActionJob actionJob() {
    return actionJob;
  }
}

