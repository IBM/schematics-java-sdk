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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * User defined kms instances.
 */
public class KMSInstances extends GenericModel {

  protected String location;
  @SerializedName("encryption_scheme")
  protected String encryptionScheme;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("kms_crn")
  protected String kmsCrn;
  @SerializedName("kms_name")
  protected String kmsName;
  @SerializedName("kms_private_endpoint")
  protected String kmsPrivateEndpoint;
  @SerializedName("kms_public_endpoint")
  protected String kmsPublicEndpoint;
  protected List<KMSInstancesKeys> keys;

  protected KMSInstances() { }

  /**
   * Gets the location.
   *
   * The location to integrate kms instance. For example, location can be `US` and `EU`.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the encryptionScheme.
   *
   * The encryption scheme values. **Allowable values** [`byok`,`kyok`].
   *
   * @return the encryptionScheme
   */
  public String getEncryptionScheme() {
    return encryptionScheme;
  }

  /**
   * Gets the resourceGroup.
   *
   * The kms instance resource group to integrate.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the kmsCrn.
   *
   * The primary kms CRN information.
   *
   * @return the kmsCrn
   */
  public String getKmsCrn() {
    return kmsCrn;
  }

  /**
   * Gets the kmsName.
   *
   * The kms instance name.
   *
   * @return the kmsName
   */
  public String getKmsName() {
    return kmsName;
  }

  /**
   * Gets the kmsPrivateEndpoint.
   *
   * The kms instance private endpoints.
   *
   * @return the kmsPrivateEndpoint
   */
  public String getKmsPrivateEndpoint() {
    return kmsPrivateEndpoint;
  }

  /**
   * Gets the kmsPublicEndpoint.
   *
   * The kms instance public endpoints.
   *
   * @return the kmsPublicEndpoint
   */
  public String getKmsPublicEndpoint() {
    return kmsPublicEndpoint;
  }

  /**
   * Gets the keys.
   *
   * Detailed list of keys.
   *
   * @return the keys
   */
  public List<KMSInstancesKeys> getKeys() {
    return keys;
  }
}

