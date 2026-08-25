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
 * The replaceInventory options.
 */
public class ReplaceInventoryOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
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

  protected String inventoryId;
  protected String name;
  protected String description;
  protected String location;
  protected String resourceGroup;
  protected String connectionType;
  protected List<CredentialVariableData> credentials;
  protected CredentialVariableData commonCredentials;
  protected String inventoriesIni;
  protected List<String> resourceQueries;
  protected BastionResourceDefinition bastion;
  protected CredentialVariableData bastionCredential;
  protected InventoryView inventoryView;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private String connectionType;
    private List<CredentialVariableData> credentials;
    private CredentialVariableData commonCredentials;
    private String inventoriesIni;
    private List<String> resourceQueries;
    private BastionResourceDefinition bastion;
    private CredentialVariableData bastionCredential;
    private InventoryView inventoryView;

    /**
     * Instantiates a new Builder from an existing ReplaceInventoryOptions instance.
     *
     * @param replaceInventoryOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceInventoryOptions replaceInventoryOptions) {
      this.inventoryId = replaceInventoryOptions.inventoryId;
      this.name = replaceInventoryOptions.name;
      this.description = replaceInventoryOptions.description;
      this.location = replaceInventoryOptions.location;
      this.resourceGroup = replaceInventoryOptions.resourceGroup;
      this.connectionType = replaceInventoryOptions.connectionType;
      this.credentials = replaceInventoryOptions.credentials;
      this.commonCredentials = replaceInventoryOptions.commonCredentials;
      this.inventoriesIni = replaceInventoryOptions.inventoriesIni;
      this.resourceQueries = replaceInventoryOptions.resourceQueries;
      this.bastion = replaceInventoryOptions.bastion;
      this.bastionCredential = replaceInventoryOptions.bastionCredential;
      this.inventoryView = replaceInventoryOptions.inventoryView;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inventoryId the inventoryId
     */
    public Builder(String inventoryId) {
      this.inventoryId = inventoryId;
    }

    /**
     * Builds a ReplaceInventoryOptions.
     *
     * @return the new ReplaceInventoryOptions instance
     */
    public ReplaceInventoryOptions build() {
      return new ReplaceInventoryOptions(this);
    }

    /**
     * Adds a new element to credentials.
     *
     * @param credentials the new element to be added
     * @return the ReplaceInventoryOptions builder
     */
    public Builder addCredentials(CredentialVariableData credentials) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(credentials,
        "credentials cannot be null");
      if (this.credentials == null) {
        this.credentials = new ArrayList<CredentialVariableData>();
      }
      this.credentials.add(credentials);
      return this;
    }

    /**
     * Adds a new element to resourceQueries.
     *
     * @param resourceQueries the new element to be added
     * @return the ReplaceInventoryOptions builder
     */
    public Builder addResourceQueries(String resourceQueries) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceQueries,
        "resourceQueries cannot be null");
      if (this.resourceQueries == null) {
        this.resourceQueries = new ArrayList<String>();
      }
      this.resourceQueries.add(resourceQueries);
      return this;
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the ReplaceInventoryOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceInventoryOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceInventoryOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ReplaceInventoryOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ReplaceInventoryOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the connectionType.
     *
     * @param connectionType the connectionType
     * @return the ReplaceInventoryOptions builder
     */
    public Builder connectionType(String connectionType) {
      this.connectionType = connectionType;
      return this;
    }

    /**
     * Set the credentials.
     * Existing credentials will be replaced.
     *
     * @param credentials the credentials
     * @return the ReplaceInventoryOptions builder
     */
    public Builder credentials(List<CredentialVariableData> credentials) {
      this.credentials = credentials;
      return this;
    }

    /**
     * Set the commonCredentials.
     *
     * @param commonCredentials the commonCredentials
     * @return the ReplaceInventoryOptions builder
     */
    public Builder commonCredentials(CredentialVariableData commonCredentials) {
      this.commonCredentials = commonCredentials;
      return this;
    }

    /**
     * Set the inventoriesIni.
     *
     * @param inventoriesIni the inventoriesIni
     * @return the ReplaceInventoryOptions builder
     */
    public Builder inventoriesIni(String inventoriesIni) {
      this.inventoriesIni = inventoriesIni;
      return this;
    }

    /**
     * Set the resourceQueries.
     * Existing resourceQueries will be replaced.
     *
     * @param resourceQueries the resourceQueries
     * @return the ReplaceInventoryOptions builder
     */
    public Builder resourceQueries(List<String> resourceQueries) {
      this.resourceQueries = resourceQueries;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the ReplaceInventoryOptions builder
     */
    public Builder bastion(BastionResourceDefinition bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the bastionCredential.
     *
     * @param bastionCredential the bastionCredential
     * @return the ReplaceInventoryOptions builder
     */
    public Builder bastionCredential(CredentialVariableData bastionCredential) {
      this.bastionCredential = bastionCredential;
      return this;
    }

    /**
     * Set the inventoryView.
     *
     * @param inventoryView the inventoryView
     * @return the ReplaceInventoryOptions builder
     */
    public Builder inventoryView(InventoryView inventoryView) {
      this.inventoryView = inventoryView;
      return this;
    }
  }

  protected ReplaceInventoryOptions() { }

  protected ReplaceInventoryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    inventoryId = builder.inventoryId;
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    connectionType = builder.connectionType;
    credentials = builder.credentials;
    commonCredentials = builder.commonCredentials;
    inventoriesIni = builder.inventoriesIni;
    resourceQueries = builder.resourceQueries;
    bastion = builder.bastion;
    bastionCredential = builder.bastionCredential;
    inventoryView = builder.inventoryView;
  }

  /**
   * New builder.
   *
   * @return a ReplaceInventoryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inventoryId.
   *
   * Resource Inventory Id.  Use `GET /v2/inventories` API to look up the Resource Inventory definition Ids  in your IBM
   * Cloud account.
   *
   * @return the inventoryId
   */
  public String inventoryId() {
    return inventoryId;
  }

  /**
   * Gets the name.
   *
   * The unique name of your Inventory definition. The name can be up to 128 characters long and can include
   * alphanumeric characters, spaces, dashes, and underscores.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of your Inventory definition. The description can be up to 2048 characters long in size.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group id for the shared dataset.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the connectionType.
   *
   * connection type to be ssh or wirm.
   *
   * @return the connectionType
   */
  public String connectionType() {
    return connectionType;
  }

  /**
   * Gets the credentials.
   *
   * common credentials for the inventory.
   *
   * @return the credentials
   */
  public List<CredentialVariableData> credentials() {
    return credentials;
  }

  /**
   * Gets the commonCredentials.
   *
   * User editable credential variable data and system generated reference to the value.
   *
   * @return the commonCredentials
   */
  public CredentialVariableData commonCredentials() {
    return commonCredentials;
  }

  /**
   * Gets the inventoriesIni.
   *
   * Input inventory of host and host group for the playbook, in the `.ini` file format.
   *
   * @return the inventoriesIni
   */
  public String inventoriesIni() {
    return inventoriesIni;
  }

  /**
   * Gets the resourceQueries.
   *
   * Input resource query definitions that is used to dynamically generate the inventory of host and host group for the
   * playbook.
   *
   * @return the resourceQueries
   */
  public List<String> resourceQueries() {
    return resourceQueries;
  }

  /**
   * Gets the bastion.
   *
   * Describes a bastion resource.
   *
   * @return the bastion
   */
  public BastionResourceDefinition bastion() {
    return bastion;
  }

  /**
   * Gets the bastionCredential.
   *
   * User editable credential variable data and system generated reference to the value.
   *
   * @return the bastionCredential
   */
  public CredentialVariableData bastionCredential() {
    return bastionCredential;
  }

  /**
   * Gets the inventoryView.
   *
   * Inventories' structured view for the provided inventory.
   *
   * @return the inventoryView
   */
  public InventoryView inventoryView() {
    return inventoryView;
  }
}

