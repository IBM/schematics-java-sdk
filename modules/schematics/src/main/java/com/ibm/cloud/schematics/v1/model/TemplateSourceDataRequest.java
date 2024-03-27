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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Input parameters to define input variables for your Terraform template.
 */
public class TemplateSourceDataRequest extends GenericModel {

  @SerializedName("env_values")
  protected List<Map<String, Object>> envValues;
  @SerializedName("env_values_metadata")
  protected List<EnvironmentValuesMetadata> envValuesMetadata;
  protected String folder;
  protected Boolean compact;
  @SerializedName("init_state_file")
  protected String initStateFile;
  protected List<InjectTerraformTemplateInner> injectors;
  protected String type;
  @SerializedName("uninstall_script_name")
  protected String uninstallScriptName;
  protected String values;
  @SerializedName("values_metadata")
  protected List<Map<String, Object>> valuesMetadata;
  protected List<WorkspaceVariableRequest> variablestore;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Map<String, Object>> envValues;
    private List<EnvironmentValuesMetadata> envValuesMetadata;
    private String folder;
    private Boolean compact;
    private String initStateFile;
    private List<InjectTerraformTemplateInner> injectors;
    private String type;
    private String uninstallScriptName;
    private String values;
    private List<Map<String, Object>> valuesMetadata;
    private List<WorkspaceVariableRequest> variablestore;

    /**
     * Instantiates a new Builder from an existing TemplateSourceDataRequest instance.
     *
     * @param templateSourceDataRequest the instance to initialize the Builder with
     */
    private Builder(TemplateSourceDataRequest templateSourceDataRequest) {
      this.envValues = templateSourceDataRequest.envValues;
      this.envValuesMetadata = templateSourceDataRequest.envValuesMetadata;
      this.folder = templateSourceDataRequest.folder;
      this.compact = templateSourceDataRequest.compact;
      this.initStateFile = templateSourceDataRequest.initStateFile;
      this.injectors = templateSourceDataRequest.injectors;
      this.type = templateSourceDataRequest.type;
      this.uninstallScriptName = templateSourceDataRequest.uninstallScriptName;
      this.values = templateSourceDataRequest.values;
      this.valuesMetadata = templateSourceDataRequest.valuesMetadata;
      this.variablestore = templateSourceDataRequest.variablestore;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateSourceDataRequest.
     *
     * @return the new TemplateSourceDataRequest instance
     */
    public TemplateSourceDataRequest build() {
      return new TemplateSourceDataRequest(this);
    }

    /**
     * Adds a new element to envValues.
     *
     * @param envValues the new element to be added
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addEnvValues(Map<String, Object> envValues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(envValues,
        "envValues cannot be null");
      if (this.envValues == null) {
        this.envValues = new ArrayList<Map<String, Object>>();
      }
      this.envValues.add(envValues);
      return this;
    }

    /**
     * Adds a new element to envValuesMetadata.
     *
     * @param envValuesMetadata the new element to be added
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addEnvValuesMetadata(EnvironmentValuesMetadata envValuesMetadata) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(envValuesMetadata,
        "envValuesMetadata cannot be null");
      if (this.envValuesMetadata == null) {
        this.envValuesMetadata = new ArrayList<EnvironmentValuesMetadata>();
      }
      this.envValuesMetadata.add(envValuesMetadata);
      return this;
    }

    /**
     * Adds a new element to injectors.
     *
     * @param injectors the new element to be added
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addInjectors(InjectTerraformTemplateInner injectors) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(injectors,
        "injectors cannot be null");
      if (this.injectors == null) {
        this.injectors = new ArrayList<InjectTerraformTemplateInner>();
      }
      this.injectors.add(injectors);
      return this;
    }

    /**
     * Adds a new element to valuesMetadata.
     *
     * @param valuesMetadata the new element to be added
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addValuesMetadata(Map<String, Object> valuesMetadata) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(valuesMetadata,
        "valuesMetadata cannot be null");
      if (this.valuesMetadata == null) {
        this.valuesMetadata = new ArrayList<Map<String, Object>>();
      }
      this.valuesMetadata.add(valuesMetadata);
      return this;
    }

    /**
     * Adds a new element to variablestore.
     *
     * @param variablestore the new element to be added
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addVariablestore(WorkspaceVariableRequest variablestore) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(variablestore,
        "variablestore cannot be null");
      if (this.variablestore == null) {
        this.variablestore = new ArrayList<WorkspaceVariableRequest>();
      }
      this.variablestore.add(variablestore);
      return this;
    }

    /**
     * Set the envValues.
     * Existing envValues will be replaced.
     *
     * @param envValues the envValues
     * @return the TemplateSourceDataRequest builder
     */
    public Builder envValues(List<Map<String, Object>> envValues) {
      this.envValues = envValues;
      return this;
    }

    /**
     * Set the envValuesMetadata.
     * Existing envValuesMetadata will be replaced.
     *
     * @param envValuesMetadata the envValuesMetadata
     * @return the TemplateSourceDataRequest builder
     */
    public Builder envValuesMetadata(List<EnvironmentValuesMetadata> envValuesMetadata) {
      this.envValuesMetadata = envValuesMetadata;
      return this;
    }

    /**
     * Set the folder.
     *
     * @param folder the folder
     * @return the TemplateSourceDataRequest builder
     */
    public Builder folder(String folder) {
      this.folder = folder;
      return this;
    }

    /**
     * Set the compact.
     *
     * @param compact the compact
     * @return the TemplateSourceDataRequest builder
     */
    public Builder compact(Boolean compact) {
      this.compact = compact;
      return this;
    }

    /**
     * Set the initStateFile.
     *
     * @param initStateFile the initStateFile
     * @return the TemplateSourceDataRequest builder
     */
    public Builder initStateFile(String initStateFile) {
      this.initStateFile = initStateFile;
      return this;
    }

    /**
     * Set the injectors.
     * Existing injectors will be replaced.
     *
     * @param injectors the injectors
     * @return the TemplateSourceDataRequest builder
     */
    public Builder injectors(List<InjectTerraformTemplateInner> injectors) {
      this.injectors = injectors;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TemplateSourceDataRequest builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the uninstallScriptName.
     *
     * @param uninstallScriptName the uninstallScriptName
     * @return the TemplateSourceDataRequest builder
     */
    public Builder uninstallScriptName(String uninstallScriptName) {
      this.uninstallScriptName = uninstallScriptName;
      return this;
    }

    /**
     * Set the values.
     *
     * @param values the values
     * @return the TemplateSourceDataRequest builder
     */
    public Builder values(String values) {
      this.values = values;
      return this;
    }

    /**
     * Set the valuesMetadata.
     * Existing valuesMetadata will be replaced.
     *
     * @param valuesMetadata the valuesMetadata
     * @return the TemplateSourceDataRequest builder
     */
    public Builder valuesMetadata(List<Map<String, Object>> valuesMetadata) {
      this.valuesMetadata = valuesMetadata;
      return this;
    }

    /**
     * Set the variablestore.
     * Existing variablestore will be replaced.
     *
     * @param variablestore the variablestore
     * @return the TemplateSourceDataRequest builder
     */
    public Builder variablestore(List<WorkspaceVariableRequest> variablestore) {
      this.variablestore = variablestore;
      return this;
    }
  }

  protected TemplateSourceDataRequest() { }

  protected TemplateSourceDataRequest(Builder builder) {
    envValues = builder.envValues;
    envValuesMetadata = builder.envValuesMetadata;
    folder = builder.folder;
    compact = builder.compact;
    initStateFile = builder.initStateFile;
    injectors = builder.injectors;
    type = builder.type;
    uninstallScriptName = builder.uninstallScriptName;
    values = builder.values;
    valuesMetadata = builder.valuesMetadata;
    variablestore = builder.variablestore;
  }

  /**
   * New builder.
   *
   * @return a TemplateSourceDataRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the envValues.
   *
   * A list of environment variables that you want to apply during the execution of a bash script or Terraform job. This
   * field must be provided as a list of key-value pairs, for example, **TF_LOG=debug**. Each entry will be a map with
   * one entry where `key is the environment variable name and value is value`. You can define environment variables for
   * IBM Cloud catalog offerings that are provisioned by using a bash script. See [example to use special environment
   * variable](https://cloud.ibm.com/docs/schematics?topic=schematics-set-parallelism#parallelism-example)  that are
   * supported by Schematics.
   *
   * @return the envValues
   */
  public List<Map<String, Object>> envValues() {
    return envValues;
  }

  /**
   * Gets the envValuesMetadata.
   *
   * Environment variables metadata.
   *
   * @return the envValuesMetadata
   */
  public List<EnvironmentValuesMetadata> envValuesMetadata() {
    return envValuesMetadata;
  }

  /**
   * Gets the folder.
   *
   * The subfolder in your GitHub or GitLab repository where your Terraform template is stored.
   *
   * @return the folder
   */
  public String folder() {
    return folder;
  }

  /**
   * Gets the compact.
   *
   * True, to use the files from the specified folder &amp; subfolder in your GitHub or GitLab repository and ignore the
   * other folders in the repository. For more information, see [Compact download for Schematics
   * workspace](https://cloud.ibm.com/docs/schematics?topic=schematics-compact-download&amp;interface=ui).
   *
   * @return the compact
   */
  public Boolean compact() {
    return compact;
  }

  /**
   * Gets the initStateFile.
   *
   * The content of an existing Terraform statefile that you want to import in to your workspace. To get the content of
   * a Terraform statefile for a specific Terraform template in an existing workspace, run `ibmcloud terraform state
   * pull --id &lt;workspace_id&gt; --template &lt;template_id&gt;`.
   *
   * @return the initStateFile
   */
  public String initStateFile() {
    return initStateFile;
  }

  /**
   * Gets the injectors.
   *
   * Array of injectable terraform blocks.
   *
   * @return the injectors
   */
  public List<InjectTerraformTemplateInner> injectors() {
    return injectors;
  }

  /**
   * Gets the type.
   *
   * The Terraform version that you want to use to run your Terraform code. Enter `terraform_v1.1` to use Terraform
   * version 1.1, and `terraform_v1.0` to use Terraform version 1.0. This is a required variable. If the Terraform
   * version is not specified, By default, Schematics selects the version from your template. For more information,
   * refer to [Terraform
   * version](https://cloud.ibm.com/docs/schematics?topic=schematics-workspace-setup&amp;interface=ui#create-workspace_ui).
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the uninstallScriptName.
   *
   * Uninstall script name.
   *
   * @return the uninstallScriptName
   */
  public String uninstallScriptName() {
    return uninstallScriptName;
  }

  /**
   * Gets the values.
   *
   * A list of variable values that you want to apply during the Helm chart installation. The list must be provided in
   * JSON format, such as `"autoscaling: enabled: true minReplicas: 2"`. The values that you define here override the
   * default Helm chart values. This field is supported only for IBM Cloud catalog offerings that are provisioned by
   * using the Terraform Helm provider.
   *
   * @return the values
   */
  public String values() {
    return values;
  }

  /**
   * Gets the valuesMetadata.
   *
   * List of values metadata.
   *
   * @return the valuesMetadata
   */
  public List<Map<String, Object>> valuesMetadata() {
    return valuesMetadata;
  }

  /**
   * Gets the variablestore.
   *
   * VariablesRequest -.
   *
   * @return the variablestore
   */
  public List<WorkspaceVariableRequest> variablestore() {
    return variablestore;
  }
}

