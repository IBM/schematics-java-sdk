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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Action Job Status.
 */
public class JobStatusAction extends GenericModel {

  /**
   * Status of Jobs.
   */
  public interface StatusCode {
    /** job_pending. */
    String JOB_PENDING = "job_pending";
    /** job_in_progress. */
    String JOB_IN_PROGRESS = "job_in_progress";
    /** iob_finished. */
    String IOB_FINISHED = "iob_finished";
    /** job_failed. */
    String JOB_FAILED = "job_failed";
    /** job_cancelled. */
    String JOB_CANCELLED = "job_cancelled";
  }

  /**
   * Status of Resources.
   */
  public interface BastionStatusCode {
    /** none. */
    String NONE = "none";
    /** ready. */
    String READY = "ready";
    /** processing. */
    String PROCESSING = "processing";
    /** error. */
    String ERROR = "error";
  }

  /**
   * Status of Resources.
   */
  public interface InventoryStatusCode {
    /** none. */
    String NONE = "none";
    /** ready. */
    String READY = "ready";
    /** processing. */
    String PROCESSING = "processing";
    /** error. */
    String ERROR = "error";
  }

  @SerializedName("action_name")
  protected String actionName;
  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("bastion_status_code")
  protected String bastionStatusCode;
  @SerializedName("bastion_status_message")
  protected String bastionStatusMessage;
  @SerializedName("inventory_status_code")
  protected String inventoryStatusCode;
  @SerializedName("inventory_status_message")
  protected String inventoryStatusMessage;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionName;
    private String statusCode;
    private String statusMessage;
    private String bastionStatusCode;
    private String bastionStatusMessage;
    private String inventoryStatusCode;
    private String inventoryStatusMessage;
    private Date updatedAt;

    private Builder(JobStatusAction jobStatusAction) {
      this.actionName = jobStatusAction.actionName;
      this.statusCode = jobStatusAction.statusCode;
      this.statusMessage = jobStatusAction.statusMessage;
      this.bastionStatusCode = jobStatusAction.bastionStatusCode;
      this.bastionStatusMessage = jobStatusAction.bastionStatusMessage;
      this.inventoryStatusCode = jobStatusAction.inventoryStatusCode;
      this.inventoryStatusMessage = jobStatusAction.inventoryStatusMessage;
      this.updatedAt = jobStatusAction.updatedAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobStatusAction.
     *
     * @return the new JobStatusAction instance
     */
    public JobStatusAction build() {
      return new JobStatusAction(this);
    }

    /**
     * Set the actionName.
     *
     * @param actionName the actionName
     * @return the JobStatusAction builder
     */
    public Builder actionName(String actionName) {
      this.actionName = actionName;
      return this;
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the JobStatusAction builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the JobStatusAction builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the bastionStatusCode.
     *
     * @param bastionStatusCode the bastionStatusCode
     * @return the JobStatusAction builder
     */
    public Builder bastionStatusCode(String bastionStatusCode) {
      this.bastionStatusCode = bastionStatusCode;
      return this;
    }

    /**
     * Set the bastionStatusMessage.
     *
     * @param bastionStatusMessage the bastionStatusMessage
     * @return the JobStatusAction builder
     */
    public Builder bastionStatusMessage(String bastionStatusMessage) {
      this.bastionStatusMessage = bastionStatusMessage;
      return this;
    }

    /**
     * Set the inventoryStatusCode.
     *
     * @param inventoryStatusCode the inventoryStatusCode
     * @return the JobStatusAction builder
     */
    public Builder inventoryStatusCode(String inventoryStatusCode) {
      this.inventoryStatusCode = inventoryStatusCode;
      return this;
    }

    /**
     * Set the inventoryStatusMessage.
     *
     * @param inventoryStatusMessage the inventoryStatusMessage
     * @return the JobStatusAction builder
     */
    public Builder inventoryStatusMessage(String inventoryStatusMessage) {
      this.inventoryStatusMessage = inventoryStatusMessage;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the JobStatusAction builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }

  protected JobStatusAction(Builder builder) {
    actionName = builder.actionName;
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    bastionStatusCode = builder.bastionStatusCode;
    bastionStatusMessage = builder.bastionStatusMessage;
    inventoryStatusCode = builder.inventoryStatusCode;
    inventoryStatusMessage = builder.inventoryStatusMessage;
    updatedAt = builder.updatedAt;
  }

  /**
   * New builder.
   *
   * @return a JobStatusAction builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionName.
   *
   * Action name.
   *
   * @return the actionName
   */
  public String actionName() {
    return actionName;
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
   * Action Job status message - to be displayed along with the action_status_code.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * Gets the bastionStatusCode.
   *
   * Status of Resources.
   *
   * @return the bastionStatusCode
   */
  public String bastionStatusCode() {
    return bastionStatusCode;
  }

  /**
   * Gets the bastionStatusMessage.
   *
   * Bastion status message - to be displayed along with the bastion_status_code;.
   *
   * @return the bastionStatusMessage
   */
  public String bastionStatusMessage() {
    return bastionStatusMessage;
  }

  /**
   * Gets the inventoryStatusCode.
   *
   * Status of Resources.
   *
   * @return the inventoryStatusCode
   */
  public String inventoryStatusCode() {
    return inventoryStatusCode;
  }

  /**
   * Gets the inventoryStatusMessage.
   *
   * Aggregated status message for all inventory resources,  to be displayed along with the inventory_status_code;.
   *
   * @return the inventoryStatusMessage
   */
  public String inventoryStatusMessage() {
    return inventoryStatusMessage;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }
}

