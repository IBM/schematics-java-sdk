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
 * This defines the inventory host.
 */
public class Host extends GenericModel {

  protected String alias;
  protected String name;
  protected CredentialVariableData credential;
  protected List<VariableData> vars;

  /**
   * Builder.
   */
  public static class Builder {
    private String alias;
    private String name;
    private CredentialVariableData credential;
    private List<VariableData> vars;

    /**
     * Instantiates a new Builder from an existing Host instance.
     *
     * @param host the instance to initialize the Builder with
     */
    private Builder(Host host) {
      this.alias = host.alias;
      this.name = host.name;
      this.credential = host.credential;
      this.vars = host.vars;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Host.
     *
     * @return the new Host instance
     */
    public Host build() {
      return new Host(this);
    }

    /**
     * Adds a new element to vars.
     *
     * @param vars the new element to be added
     * @return the Host builder
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
     * Set the alias.
     *
     * @param alias the alias
     * @return the Host builder
     */
    public Builder alias(String alias) {
      this.alias = alias;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Host builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the credential.
     *
     * @param credential the credential
     * @return the Host builder
     */
    public Builder credential(CredentialVariableData credential) {
      this.credential = credential;
      return this;
    }

    /**
     * Set the vars.
     * Existing vars will be replaced.
     *
     * @param vars the vars
     * @return the Host builder
     */
    public Builder vars(List<VariableData> vars) {
      this.vars = vars;
      return this;
    }
  }

  protected Host() { }

  protected Host(Builder builder) {
    alias = builder.alias;
    name = builder.name;
    credential = builder.credential;
    vars = builder.vars;
  }

  /**
   * New builder.
   *
   * @return a Host builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the alias.
   *
   * Host alias name.
   *
   * @return the alias
   */
  public String alias() {
    return alias;
  }

  /**
   * Gets the name.
   *
   * Host name/IP.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the credential.
   *
   * User editable credential variable data and system generated reference to the value.
   *
   * @return the credential
   */
  public CredentialVariableData credential() {
    return credential;
  }

  /**
   * Gets the vars.
   *
   * host level variables.
   *
   * @return the vars
   */
  public List<VariableData> vars() {
    return vars;
  }
}

