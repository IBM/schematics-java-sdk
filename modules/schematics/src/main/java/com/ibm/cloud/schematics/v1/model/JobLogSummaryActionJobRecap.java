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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Recap records.
 */
public class JobLogSummaryActionJobRecap extends GenericModel {

  protected List<String> hosts;
  protected Double ok;
  protected Double changed;
  protected Double failed;
  protected Double skipped;
  protected Double unreachable;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> hosts;
    private Double ok;
    private Double changed;
    private Double failed;
    private Double skipped;
    private Double unreachable;

    private Builder(JobLogSummaryActionJobRecap jobLogSummaryActionJobRecap) {
      this.hosts = jobLogSummaryActionJobRecap.hosts;
      this.ok = jobLogSummaryActionJobRecap.ok;
      this.changed = jobLogSummaryActionJobRecap.changed;
      this.failed = jobLogSummaryActionJobRecap.failed;
      this.skipped = jobLogSummaryActionJobRecap.skipped;
      this.unreachable = jobLogSummaryActionJobRecap.unreachable;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JobLogSummaryActionJobRecap.
     *
     * @return the new JobLogSummaryActionJobRecap instance
     */
    public JobLogSummaryActionJobRecap build() {
      return new JobLogSummaryActionJobRecap(this);
    }

    /**
     * Adds an hosts to hosts.
     *
     * @param hosts the new hosts
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder addHosts(String hosts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hosts,
        "hosts cannot be null");
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hosts);
      return this;
    }

    /**
     * Set the hosts.
     * Existing hosts will be replaced.
     *
     * @param hosts the hosts
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder hosts(List<String> hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the ok.
     *
     * @param ok the ok
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder ok(Double ok) {
      this.ok = ok;
      return this;
    }

    /**
     * Set the changed.
     *
     * @param changed the changed
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder changed(Double changed) {
      this.changed = changed;
      return this;
    }

    /**
     * Set the failed.
     *
     * @param failed the failed
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder failed(Double failed) {
      this.failed = failed;
      return this;
    }

    /**
     * Set the skipped.
     *
     * @param skipped the skipped
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder skipped(Double skipped) {
      this.skipped = skipped;
      return this;
    }

    /**
     * Set the unreachable.
     *
     * @param unreachable the unreachable
     * @return the JobLogSummaryActionJobRecap builder
     */
    public Builder unreachable(Double unreachable) {
      this.unreachable = unreachable;
      return this;
    }
  }

  protected JobLogSummaryActionJobRecap(Builder builder) {
    hosts = builder.hosts;
    ok = builder.ok;
    changed = builder.changed;
    failed = builder.failed;
    skipped = builder.skipped;
    unreachable = builder.unreachable;
  }

  /**
   * New builder.
   *
   * @return a JobLogSummaryActionJobRecap builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hosts.
   *
   * List of host name.
   *
   * @return the hosts
   */
  public List<String> hosts() {
    return hosts;
  }

  /**
   * Gets the ok.
   *
   * Number of OK.
   *
   * @return the ok
   */
  public Double ok() {
    return ok;
  }

  /**
   * Gets the changed.
   *
   * Number of changed.
   *
   * @return the changed
   */
  public Double changed() {
    return changed;
  }

  /**
   * Gets the failed.
   *
   * Number of failed.
   *
   * @return the failed
   */
  public Double failed() {
    return failed;
  }

  /**
   * Gets the skipped.
   *
   * Number of skipped.
   *
   * @return the skipped
   */
  public Double skipped() {
    return skipped;
  }

  /**
   * Gets the unreachable.
   *
   * Number of unreachable.
   *
   * @return the unreachable
   */
  public Double unreachable() {
    return unreachable;
  }
}

