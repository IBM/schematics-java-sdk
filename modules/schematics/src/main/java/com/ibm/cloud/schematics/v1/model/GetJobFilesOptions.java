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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getJobFiles options.
 */
public class GetJobFilesOptions extends GenericModel {

  /**
   * The type of file you want to download eg.state_file, plan_json.
   */
  public interface FileType {
    /** template_repo. */
    String TEMPLATE_REPO = "template_repo";
    /** readme_file. */
    String README_FILE = "readme_file";
    /** log_file. */
    String LOG_FILE = "log_file";
    /** state_file. */
    String STATE_FILE = "state_file";
    /** plan_json. */
    String PLAN_JSON = "plan_json";
  }

  protected String jobId;
  protected String fileType;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String fileType;

    /**
     * Instantiates a new Builder from an existing GetJobFilesOptions instance.
     *
     * @param getJobFilesOptions the instance to initialize the Builder with
     */
    private Builder(GetJobFilesOptions getJobFilesOptions) {
      this.jobId = getJobFilesOptions.jobId;
      this.fileType = getJobFilesOptions.fileType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     * @param fileType the fileType
     */
    public Builder(String jobId, String fileType) {
      this.jobId = jobId;
      this.fileType = fileType;
    }

    /**
     * Builds a GetJobFilesOptions.
     *
     * @return the new GetJobFilesOptions instance
     */
    public GetJobFilesOptions build() {
      return new GetJobFilesOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetJobFilesOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the fileType.
     *
     * @param fileType the fileType
     * @return the GetJobFilesOptions builder
     */
    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }
  }

  protected GetJobFilesOptions() { }

  protected GetJobFilesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fileType,
      "fileType cannot be null");
    jobId = builder.jobId;
    fileType = builder.fileType;
  }

  /**
   * New builder.
   *
   * @return a GetJobFilesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job Id. Use `GET /v2/jobs` API to look up the Job Ids in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the fileType.
   *
   * The type of file you want to download eg.state_file, plan_json.
   *
   * @return the fileType
   */
  public String fileType() {
    return fileType;
  }
}

