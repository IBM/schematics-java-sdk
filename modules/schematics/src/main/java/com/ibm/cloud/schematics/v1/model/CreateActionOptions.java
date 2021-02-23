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
 * The createAction options.
 */
public class CreateActionOptions extends GenericModel {

  /**
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   */
  public interface Location {
    /** us_south. */
    String US_SOUTH = "us_south";
    /** us_east. */
    String US_EAST = "us_east";
    /** eu_gb. */
    String EU_GB = "eu_gb";
    /** eu_de. */
    String EU_DE = "eu_de";
  }

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
  }

  protected String name;
  protected String description;
  protected String location;
  protected String resourceGroup;
  protected List<String> tags;
  protected UserState userState;
  protected String sourceReadmeUrl;
  protected ExternalSource source;
  protected String sourceType;
  protected String commandParameter;
  protected TargetResourceset bastion;
  protected String targetsIni;
  protected List<VariableData> credentials;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  protected String triggerRecordId;
  protected ActionState state;
  protected SystemLock sysLock;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private List<String> tags;
    private UserState userState;
    private String sourceReadmeUrl;
    private ExternalSource source;
    private String sourceType;
    private String commandParameter;
    private TargetResourceset bastion;
    private String targetsIni;
    private List<VariableData> credentials;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private String triggerRecordId;
    private ActionState state;
    private SystemLock sysLock;
    private String xGithubToken;

    private Builder(CreateActionOptions createActionOptions) {
      this.name = createActionOptions.name;
      this.description = createActionOptions.description;
      this.location = createActionOptions.location;
      this.resourceGroup = createActionOptions.resourceGroup;
      this.tags = createActionOptions.tags;
      this.userState = createActionOptions.userState;
      this.sourceReadmeUrl = createActionOptions.sourceReadmeUrl;
      this.source = createActionOptions.source;
      this.sourceType = createActionOptions.sourceType;
      this.commandParameter = createActionOptions.commandParameter;
      this.bastion = createActionOptions.bastion;
      this.targetsIni = createActionOptions.targetsIni;
      this.credentials = createActionOptions.credentials;
      this.inputs = createActionOptions.inputs;
      this.outputs = createActionOptions.outputs;
      this.settings = createActionOptions.settings;
      this.triggerRecordId = createActionOptions.triggerRecordId;
      this.state = createActionOptions.state;
      this.sysLock = createActionOptions.sysLock;
      this.xGithubToken = createActionOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateActionOptions.
     *
     * @return the new CreateActionOptions instance
     */
    public CreateActionOptions build() {
      return new CreateActionOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateActionOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an credentials to credentials.
     *
     * @param credentials the new credentials
     * @return the CreateActionOptions builder
     */
    public Builder addCredentials(VariableData credentials) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(credentials,
        "credentials cannot be null");
      if (this.credentials == null) {
        this.credentials = new ArrayList<VariableData>();
      }
      this.credentials.add(credentials);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the CreateActionOptions builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the CreateActionOptions builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the CreateActionOptions builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateActionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateActionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateActionOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateActionOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateActionOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the CreateActionOptions builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the CreateActionOptions builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateActionOptions builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the CreateActionOptions builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the CreateActionOptions builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the CreateActionOptions builder
     */
    public Builder bastion(TargetResourceset bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the targetsIni.
     *
     * @param targetsIni the targetsIni
     * @return the CreateActionOptions builder
     */
    public Builder targetsIni(String targetsIni) {
      this.targetsIni = targetsIni;
      return this;
    }

    /**
     * Set the credentials.
     * Existing credentials will be replaced.
     *
     * @param credentials the credentials
     * @return the CreateActionOptions builder
     */
    public Builder credentials(List<VariableData> credentials) {
      this.credentials = credentials;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the CreateActionOptions builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the CreateActionOptions builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the CreateActionOptions builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the triggerRecordId.
     *
     * @param triggerRecordId the triggerRecordId
     * @return the CreateActionOptions builder
     */
    public Builder triggerRecordId(String triggerRecordId) {
      this.triggerRecordId = triggerRecordId;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CreateActionOptions builder
     */
    public Builder state(ActionState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the CreateActionOptions builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the CreateActionOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateActionOptions builder
     */
    public Builder action(Action action) {
      this.name = action.name();
      this.description = action.description();
      this.location = action.location();
      this.resourceGroup = action.resourceGroup();
      this.tags = action.tags();
      this.userState = action.userState();
      this.sourceReadmeUrl = action.sourceReadmeUrl();
      this.source = action.source();
      this.sourceType = action.sourceType();
      this.commandParameter = action.commandParameter();
      this.bastion = action.bastion();
      this.targetsIni = action.targetsIni();
      this.credentials = action.credentials();
      this.inputs = action.inputs();
      this.outputs = action.outputs();
      this.settings = action.settings();
      this.triggerRecordId = action.triggerRecordId();
      this.state = action.state();
      this.sysLock = action.sysLock();
      return this;
    }
  }

  protected CreateActionOptions(Builder builder) {
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    userState = builder.userState;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    source = builder.source;
    sourceType = builder.sourceType;
    commandParameter = builder.commandParameter;
    bastion = builder.bastion;
    targetsIni = builder.targetsIni;
    credentials = builder.credentials;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    triggerRecordId = builder.triggerRecordId;
    state = builder.state;
    sysLock = builder.sysLock;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a CreateActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Action name (unique for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Action description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the location.
   *
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Action.  By default, Action will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Action tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState userState() {
    return userState;
  }

  /**
   * Gets the sourceReadmeUrl.
   *
   * URL of the README file, for the source.
   *
   * @return the sourceReadmeUrl
   */
  public String sourceReadmeUrl() {
    return sourceReadmeUrl;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name, capsule-name or flow-name).
   *
   * @return the commandParameter
   */
  public String commandParameter() {
    return commandParameter;
  }

  /**
   * Gets the bastion.
   *
   * Complete Target details with user inputs and system generated data.
   *
   * @return the bastion
   */
  public TargetResourceset bastion() {
    return bastion;
  }

  /**
   * Gets the targetsIni.
   *
   * Inventory of host and host group for the playbook, in .ini file format.
   *
   * @return the targetsIni
   */
  public String targetsIni() {
    return targetsIni;
  }

  /**
   * Gets the credentials.
   *
   * credentials of the Action.
   *
   * @return the credentials
   */
  public List<VariableData> credentials() {
    return credentials;
  }

  /**
   * Gets the inputs.
   *
   * Input variables for the Action.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the Action.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the Action.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the triggerRecordId.
   *
   * Id to the Trigger.
   *
   * @return the triggerRecordId
   */
  public String triggerRecordId() {
    return triggerRecordId;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Action.
   *
   * @return the state
   */
  public ActionState state() {
    return state;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock sysLock() {
    return sysLock;
  }

  /**
   * Gets the xGithubToken.
   *
   * The github token associated with the GIT. Required for cloning of repo.
   *
   * @return the xGithubToken
   */
  public String xGithubToken() {
    return xGithubToken;
  }
}

