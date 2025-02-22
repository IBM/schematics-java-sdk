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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status of the last job executed by the workitem.
 */
public class JobDataWorkItemLastJob extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface CommandObject {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
    /** terraform_commands. */
    String TERRAFORM_COMMANDS = "terraform_commands";
  }

  /**
   * Status of Jobs.
   */
  public interface JobStatus {
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

  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_name")
  protected String commandObjectName;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_status")
  protected String jobStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private String commandObject;
    private String commandObjectName;
    private String commandObjectId;
    private String commandName;
    private String jobId;
    private String jobStatus;

    /**
     * Instantiates a new Builder from an existing JobDataWorkItemLastJob instance.
     *
     * @param jobDataWorkItemLastJob the instance to initialize the Builder with
     */
    private Builder(JobDataWorkItemLastJob jobDataWorkItemLastJob) {
      this.commandObject = jobDataWorkItemLastJob.commandObject;
      this.commandObjectName = jobDataWorkItemLastJob.commandObjectName;
      this.commandObjectId = jobDataWorkItemLastJob.commandObjectId;
      this.commandName = jobDataWorkItemLastJob.commandName;
      this.jobId = jobDataWorkItemLastJob.jobId;
      this.jobStatus = jobDataWorkItemLastJob.jobStatus;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobDataWorkItemLastJob.
     *
     * @return the new JobDataWorkItemLastJob instance
     */
    public JobDataWorkItemLastJob build() {
      return new JobDataWorkItemLastJob(this);
    }

    /**
     * Set the commandObject.
     *
     * @param commandObject the commandObject
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder commandObject(String commandObject) {
      this.commandObject = commandObject;
      return this;
    }

    /**
     * Set the commandObjectName.
     *
     * @param commandObjectName the commandObjectName
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder commandObjectName(String commandObjectName) {
      this.commandObjectName = commandObjectName;
      return this;
    }

    /**
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the jobStatus.
     *
     * @param jobStatus the jobStatus
     * @return the JobDataWorkItemLastJob builder
     */
    public Builder jobStatus(String jobStatus) {
      this.jobStatus = jobStatus;
      return this;
    }
  }

  protected JobDataWorkItemLastJob() { }

  protected JobDataWorkItemLastJob(Builder builder) {
    commandObject = builder.commandObject;
    commandObjectName = builder.commandObjectName;
    commandObjectId = builder.commandObjectId;
    commandName = builder.commandName;
    jobId = builder.jobId;
    jobStatus = builder.jobStatus;
  }

  /**
   * New builder.
   *
   * @return a JobDataWorkItemLastJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String commandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectName.
   *
   * command object name (workspace_name/action_name).
   *
   * @return the commandObjectName
   */
  public String commandObjectName() {
    return commandObjectName;
  }

  /**
   * Gets the commandObjectId.
   *
   * Workitem command object id, maps to workspace_id or action_id.
   *
   * @return the commandObjectId
   */
  public String commandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String commandName() {
    return commandName;
  }

  /**
   * Gets the jobId.
   *
   * Workspace job id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the jobStatus.
   *
   * Status of Jobs.
   *
   * @return the jobStatus
   */
  public String jobStatus() {
    return jobStatus;
  }
}

