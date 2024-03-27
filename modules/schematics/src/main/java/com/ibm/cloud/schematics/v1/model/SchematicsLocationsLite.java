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
 * An individual location details.
 */
public class SchematicsLocationsLite extends GenericModel {

  protected String region;
  protected String metro;
  @SerializedName("geography_code")
  protected String geographyCode;
  protected String geography;
  protected String country;
  protected String kind;
  @SerializedName("paired_region")
  protected List<String> pairedRegion;
  protected Boolean restricted;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("schematics_regional_public_endpoint")
  protected String schematicsRegionalPublicEndpoint;
  @SerializedName("schematics_regional_private_endpoint")
  protected String schematicsRegionalPrivateEndpoint;

  protected SchematicsLocationsLite() { }

  /**
   * Gets the region.
   *
   * The Geographical region code having the data centres of the IBM Cloud Schematics service.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the metro.
   *
   * The Geographical city locations having the data centres of the IBM Cloud Schematics service.
   *
   * @return the metro
   */
  public String getMetro() {
    return metro;
  }

  /**
   * Gets the geographyCode.
   *
   * The Geographical continent locations code having the data centres of the IBM Cloud Schematics service.
   *
   * @return the geographyCode
   */
  public String getGeographyCode() {
    return geographyCode;
  }

  /**
   * Gets the geography.
   *
   * The Geographical continent locations having the data centres of the IBM Cloud Schematics service.
   *
   * @return the geography
   */
  public String getGeography() {
    return geography;
  }

  /**
   * Gets the country.
   *
   * The Country locations having the data centres of the IBM Cloud Schematics service.
   *
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Gets the kind.
   *
   * The kind of location.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the pairedRegion.
   *
   * The list of paired regions used by the Schematics.
   *
   * @return the pairedRegion
   */
  public List<String> getPairedRegion() {
    return pairedRegion;
  }

  /**
   * Gets the restricted.
   *
   * The restricted region.
   *
   * @return the restricted
   */
  public Boolean isRestricted() {
    return restricted;
  }

  /**
   * Gets the displayName.
   *
   * Display name for the region.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the schematicsRegionalPublicEndpoint.
   *
   * Schematics public endpoint for the region.
   *
   * @return the schematicsRegionalPublicEndpoint
   */
  public String getSchematicsRegionalPublicEndpoint() {
    return schematicsRegionalPublicEndpoint;
  }

  /**
   * Gets the schematicsRegionalPrivateEndpoint.
   *
   * Schematics private endpoint for the region.
   *
   * @return the schematicsRegionalPrivateEndpoint
   */
  public String getSchematicsRegionalPrivateEndpoint() {
    return schematicsRegionalPrivateEndpoint;
  }
}

