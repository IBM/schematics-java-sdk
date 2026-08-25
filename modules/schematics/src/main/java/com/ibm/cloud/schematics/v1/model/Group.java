/*
 * (C) Copyright IBM Corp. 2026.
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
 * Inventory host group.
 */
public class Group extends GenericModel {

  protected String name;
  protected List<VariableData> vars;
  protected CredentialVariableData credentials;
  protected List<Host> hosts;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<VariableData> vars;
    private CredentialVariableData credentials;
    private List<Host> hosts;

    /**
     * Instantiates a new Builder from an existing Group instance.
     *
     * @param group the instance to initialize the Builder with
     */
    private Builder(Group group) {
      this.name = group.name;
      this.vars = group.vars;
      this.credentials = group.credentials;
      this.hosts = group.hosts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Group.
     *
     * @return the new Group instance
     */
    public Group build() {
      return new Group(this);
    }

    /**
     * Adds a new element to vars.
     *
     * @param vars the new element to be added
     * @return the Group builder
     */
    public Builder addVars(VariableData vars) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(vars,
        "vars cannot be null");
      if (this.vars == null) {
        this.vars = new ArrayList<VariableData>();
      }
      this.vars.add(vars);
      return this;
    }

    /**
     * Adds a new element to hosts.
     *
     * @param hosts the new element to be added
     * @return the Group builder
     */
    public Builder addHosts(Host hosts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hosts,
        "hosts cannot be null");
      if (this.hosts == null) {
        this.hosts = new ArrayList<Host>();
      }
      this.hosts.add(hosts);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Group builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the vars.
     * Existing vars will be replaced.
     *
     * @param vars the vars
     * @return the Group builder
     */
    public Builder vars(List<VariableData> vars) {
      this.vars = vars;
      return this;
    }

    /**
     * Set the credentials.
     *
     * @param credentials the credentials
     * @return the Group builder
     */
    public Builder credentials(CredentialVariableData credentials) {
      this.credentials = credentials;
      return this;
    }

    /**
     * Set the hosts.
     * Existing hosts will be replaced.
     *
     * @param hosts the hosts
     * @return the Group builder
     */
    public Builder hosts(List<Host> hosts) {
      this.hosts = hosts;
      return this;
    }
  }

  protected Group() { }

  protected Group(Builder builder) {
    name = builder.name;
    vars = builder.vars;
    credentials = builder.credentials;
    hosts = builder.hosts;
  }

  /**
   * New builder.
   *
   * @return a Group builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the group.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the vars.
   *
   * group level variables.
   *
   * @return the vars
   */
  public List<VariableData> vars() {
    return vars;
  }

  /**
   * Gets the credentials.
   *
   * User editable credential variable data and system generated reference to the value.
   *
   * @return the credentials
   */
  public CredentialVariableData credentials() {
    return credentials;
  }

  /**
   * Gets the hosts.
   *
   * List of hosts in the group.
   *
   * @return the hosts
   */
  public List<Host> hosts() {
    return hosts;
  }
}

