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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Job summary profile with system generated data.
 */
public class JobLite extends GenericModel {

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
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** sytem_key_delete. */
    String SYTEM_KEY_DELETE = "sytem_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
  }

  /**
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  protected List<String> tags;
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("submitted_at")
  protected Date submittedAt;
  @SerializedName("submitted_by")
  protected String submittedBy;
  protected String duration;
  @SerializedName("start_at")
  protected Date startAt;
  @SerializedName("end_at")
  protected Date endAt;
  protected JobStatus status;
  @SerializedName("log_summary")
  protected JobLogSummary logSummary;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the id.
   *
   * Job ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Job name, uniquely derived from the related Action.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Job description derived from the related Action.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String getCommandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectId.
   *
   * Job command object id (action-id).
   *
   * @return the commandObjectId
   */
  public String getCommandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String getCommandName() {
    return commandName;
  }

  /**
   * Gets the tags.
   *
   * User defined tags, while running the job.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name derived from the related Action,.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the submittedAt.
   *
   * Job submission time.
   *
   * @return the submittedAt
   */
  public Date getSubmittedAt() {
    return submittedAt;
  }

  /**
   * Gets the submittedBy.
   *
   * Email address of user who submitted the job.
   *
   * @return the submittedBy
   */
  public String getSubmittedBy() {
    return submittedBy;
  }

  /**
   * Gets the duration.
   *
   * Duration of job execution; example 40 sec.
   *
   * @return the duration
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Gets the startAt.
   *
   * Job start time.
   *
   * @return the startAt
   */
  public Date getStartAt() {
    return startAt;
  }

  /**
   * Gets the endAt.
   *
   * Job end time.
   *
   * @return the endAt
   */
  public Date getEndAt() {
    return endAt;
  }

  /**
   * Gets the status.
   *
   * Job Status.
   *
   * @return the status
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * Gets the logSummary.
   *
   * Job log summary record.
   *
   * @return the logSummary
   */
  public JobLogSummary getLogSummary() {
    return logSummary;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

