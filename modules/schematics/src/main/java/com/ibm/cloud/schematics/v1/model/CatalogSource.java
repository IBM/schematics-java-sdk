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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The connection details to the IBM Cloud Catalog source.
 */
public class CatalogSource extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("offering_name")
  protected String offeringName;
  @SerializedName("offering_version")
  protected String offeringVersion;
  @SerializedName("offering_kind")
  protected String offeringKind;
  @SerializedName("offering_target_kind")
  protected String offeringTargetKind;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("offering_version_id")
  protected String offeringVersionId;
  @SerializedName("offering_version_flavour_name")
  protected String offeringVersionFlavourName;
  @SerializedName("offering_repo_url")
  protected String offeringRepoUrl;
  @SerializedName("offering_provisioner_working_directory")
  protected String offeringProvisionerWorkingDirectory;
  @SerializedName("dry_run")
  protected Boolean dryRun;
  @SerializedName("owning_account")
  protected String owningAccount;
  @SerializedName("item_icon_url")
  protected String itemIconUrl;
  @SerializedName("item_id")
  protected String itemId;
  @SerializedName("item_name")
  protected String itemName;
  @SerializedName("item_readme_url")
  protected String itemReadmeUrl;
  @SerializedName("item_url")
  protected String itemUrl;
  @SerializedName("launch_url")
  protected String launchUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String catalogId;
    private String offeringName;
    private String offeringVersion;
    private String offeringKind;
    private String offeringTargetKind;
    private String offeringId;
    private String offeringVersionId;
    private String offeringVersionFlavourName;
    private String offeringRepoUrl;
    private String offeringProvisionerWorkingDirectory;
    private Boolean dryRun;
    private String owningAccount;
    private String itemIconUrl;
    private String itemId;
    private String itemName;
    private String itemReadmeUrl;
    private String itemUrl;
    private String launchUrl;

    /**
     * Instantiates a new Builder from an existing CatalogSource instance.
     *
     * @param catalogSource the instance to initialize the Builder with
     */
    private Builder(CatalogSource catalogSource) {
      this.catalogName = catalogSource.catalogName;
      this.catalogId = catalogSource.catalogId;
      this.offeringName = catalogSource.offeringName;
      this.offeringVersion = catalogSource.offeringVersion;
      this.offeringKind = catalogSource.offeringKind;
      this.offeringTargetKind = catalogSource.offeringTargetKind;
      this.offeringId = catalogSource.offeringId;
      this.offeringVersionId = catalogSource.offeringVersionId;
      this.offeringVersionFlavourName = catalogSource.offeringVersionFlavourName;
      this.offeringRepoUrl = catalogSource.offeringRepoUrl;
      this.offeringProvisionerWorkingDirectory = catalogSource.offeringProvisionerWorkingDirectory;
      this.dryRun = catalogSource.dryRun;
      this.owningAccount = catalogSource.owningAccount;
      this.itemIconUrl = catalogSource.itemIconUrl;
      this.itemId = catalogSource.itemId;
      this.itemName = catalogSource.itemName;
      this.itemReadmeUrl = catalogSource.itemReadmeUrl;
      this.itemUrl = catalogSource.itemUrl;
      this.launchUrl = catalogSource.launchUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CatalogSource.
     *
     * @return the new CatalogSource instance
     */
    public CatalogSource build() {
      return new CatalogSource(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CatalogSource builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the CatalogSource builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the offeringName.
     *
     * @param offeringName the offeringName
     * @return the CatalogSource builder
     */
    public Builder offeringName(String offeringName) {
      this.offeringName = offeringName;
      return this;
    }

    /**
     * Set the offeringVersion.
     *
     * @param offeringVersion the offeringVersion
     * @return the CatalogSource builder
     */
    public Builder offeringVersion(String offeringVersion) {
      this.offeringVersion = offeringVersion;
      return this;
    }

    /**
     * Set the offeringKind.
     *
     * @param offeringKind the offeringKind
     * @return the CatalogSource builder
     */
    public Builder offeringKind(String offeringKind) {
      this.offeringKind = offeringKind;
      return this;
    }

    /**
     * Set the offeringTargetKind.
     *
     * @param offeringTargetKind the offeringTargetKind
     * @return the CatalogSource builder
     */
    public Builder offeringTargetKind(String offeringTargetKind) {
      this.offeringTargetKind = offeringTargetKind;
      return this;
    }

    /**
     * Set the offeringId.
     *
     * @param offeringId the offeringId
     * @return the CatalogSource builder
     */
    public Builder offeringId(String offeringId) {
      this.offeringId = offeringId;
      return this;
    }

    /**
     * Set the offeringVersionId.
     *
     * @param offeringVersionId the offeringVersionId
     * @return the CatalogSource builder
     */
    public Builder offeringVersionId(String offeringVersionId) {
      this.offeringVersionId = offeringVersionId;
      return this;
    }

    /**
     * Set the offeringVersionFlavourName.
     *
     * @param offeringVersionFlavourName the offeringVersionFlavourName
     * @return the CatalogSource builder
     */
    public Builder offeringVersionFlavourName(String offeringVersionFlavourName) {
      this.offeringVersionFlavourName = offeringVersionFlavourName;
      return this;
    }

    /**
     * Set the offeringRepoUrl.
     *
     * @param offeringRepoUrl the offeringRepoUrl
     * @return the CatalogSource builder
     */
    public Builder offeringRepoUrl(String offeringRepoUrl) {
      this.offeringRepoUrl = offeringRepoUrl;
      return this;
    }

    /**
     * Set the offeringProvisionerWorkingDirectory.
     *
     * @param offeringProvisionerWorkingDirectory the offeringProvisionerWorkingDirectory
     * @return the CatalogSource builder
     */
    public Builder offeringProvisionerWorkingDirectory(String offeringProvisionerWorkingDirectory) {
      this.offeringProvisionerWorkingDirectory = offeringProvisionerWorkingDirectory;
      return this;
    }

    /**
     * Set the dryRun.
     *
     * @param dryRun the dryRun
     * @return the CatalogSource builder
     */
    public Builder dryRun(Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
    }

    /**
     * Set the owningAccount.
     *
     * @param owningAccount the owningAccount
     * @return the CatalogSource builder
     */
    public Builder owningAccount(String owningAccount) {
      this.owningAccount = owningAccount;
      return this;
    }

    /**
     * Set the itemIconUrl.
     *
     * @param itemIconUrl the itemIconUrl
     * @return the CatalogSource builder
     */
    public Builder itemIconUrl(String itemIconUrl) {
      this.itemIconUrl = itemIconUrl;
      return this;
    }

    /**
     * Set the itemId.
     *
     * @param itemId the itemId
     * @return the CatalogSource builder
     */
    public Builder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     * Set the itemName.
     *
     * @param itemName the itemName
     * @return the CatalogSource builder
     */
    public Builder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     * Set the itemReadmeUrl.
     *
     * @param itemReadmeUrl the itemReadmeUrl
     * @return the CatalogSource builder
     */
    public Builder itemReadmeUrl(String itemReadmeUrl) {
      this.itemReadmeUrl = itemReadmeUrl;
      return this;
    }

    /**
     * Set the itemUrl.
     *
     * @param itemUrl the itemUrl
     * @return the CatalogSource builder
     */
    public Builder itemUrl(String itemUrl) {
      this.itemUrl = itemUrl;
      return this;
    }

    /**
     * Set the launchUrl.
     *
     * @param launchUrl the launchUrl
     * @return the CatalogSource builder
     */
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }
  }

  protected CatalogSource() { }

  protected CatalogSource(Builder builder) {
    catalogName = builder.catalogName;
    catalogId = builder.catalogId;
    offeringName = builder.offeringName;
    offeringVersion = builder.offeringVersion;
    offeringKind = builder.offeringKind;
    offeringTargetKind = builder.offeringTargetKind;
    offeringId = builder.offeringId;
    offeringVersionId = builder.offeringVersionId;
    offeringVersionFlavourName = builder.offeringVersionFlavourName;
    offeringRepoUrl = builder.offeringRepoUrl;
    offeringProvisionerWorkingDirectory = builder.offeringProvisionerWorkingDirectory;
    dryRun = builder.dryRun;
    owningAccount = builder.owningAccount;
    itemIconUrl = builder.itemIconUrl;
    itemId = builder.itemId;
    itemName = builder.itemName;
    itemReadmeUrl = builder.itemReadmeUrl;
    itemUrl = builder.itemUrl;
    launchUrl = builder.launchUrl;
  }

  /**
   * New builder.
   *
   * @return a CatalogSource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * The name of the private catalog.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogId.
   *
   * The ID of a private catalog.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the offeringName.
   *
   * The name of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringName
   */
  public String offeringName() {
    return offeringName;
  }

  /**
   * Gets the offeringVersion.
   *
   * The version of the software template that you chose to install from the IBM Cloud catalog.
   *
   * @return the offeringVersion
   */
  public String offeringVersion() {
    return offeringVersion;
  }

  /**
   * Gets the offeringKind.
   *
   * The type of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringKind
   */
  public String offeringKind() {
    return offeringKind;
  }

  /**
   * Gets the offeringTargetKind.
   *
   * Offering Target Kind.
   *
   * @return the offeringTargetKind
   */
  public String offeringTargetKind() {
    return offeringTargetKind;
  }

  /**
   * Gets the offeringId.
   *
   * The ID of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringId
   */
  public String offeringId() {
    return offeringId;
  }

  /**
   * Gets the offeringVersionId.
   *
   * The ID of an offering version the IBM Cloud Catalog.
   *
   * @return the offeringVersionId
   */
  public String offeringVersionId() {
    return offeringVersionId;
  }

  /**
   * Gets the offeringVersionFlavourName.
   *
   * Offering version flavour name.
   *
   * @return the offeringVersionFlavourName
   */
  public String offeringVersionFlavourName() {
    return offeringVersionFlavourName;
  }

  /**
   * Gets the offeringRepoUrl.
   *
   * The repository URL of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringRepoUrl
   */
  public String offeringRepoUrl() {
    return offeringRepoUrl;
  }

  /**
   * Gets the offeringProvisionerWorkingDirectory.
   *
   * Root folder name in .tgz file.
   *
   * @return the offeringProvisionerWorkingDirectory
   */
  public String offeringProvisionerWorkingDirectory() {
    return offeringProvisionerWorkingDirectory;
  }

  /**
   * Gets the dryRun.
   *
   * Dry run.
   *
   * @return the dryRun
   */
  public Boolean dryRun() {
    return dryRun;
  }

  /**
   * Gets the owningAccount.
   *
   * Owning account ID of the catalog.
   *
   * @return the owningAccount
   */
  public String owningAccount() {
    return owningAccount;
  }

  /**
   * Gets the itemIconUrl.
   *
   * The URL to the icon of the software template in the IBM Cloud catalog.
   *
   * @return the itemIconUrl
   */
  public String itemIconUrl() {
    return itemIconUrl;
  }

  /**
   * Gets the itemId.
   *
   * The ID of the software template that you chose to install from the IBM Cloud catalog. This software is provisioned
   * with Schematics.
   *
   * @return the itemId
   */
  public String itemId() {
    return itemId;
  }

  /**
   * Gets the itemName.
   *
   * The name of the software that you chose to install from the IBM Cloud catalog.
   *
   * @return the itemName
   */
  public String itemName() {
    return itemName;
  }

  /**
   * Gets the itemReadmeUrl.
   *
   * The URL to the readme file of the software template in the IBM Cloud catalog.
   *
   * @return the itemReadmeUrl
   */
  public String itemReadmeUrl() {
    return itemReadmeUrl;
  }

  /**
   * Gets the itemUrl.
   *
   * The URL to the software template in the IBM Cloud catalog.
   *
   * @return the itemUrl
   */
  public String itemUrl() {
    return itemUrl;
  }

  /**
   * Gets the launchUrl.
   *
   * The URL to the dashboard to access your software.
   *
   * @return the launchUrl
   */
  public String launchUrl() {
    return launchUrl;
  }
}

