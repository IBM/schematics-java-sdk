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

import com.ibm.cloud.schematics.v1.model.TemplateMetadataObject;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateMetadataObject model.
 */
public class TemplateMetadataObjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateMetadataObject() throws Throwable {
    TemplateMetadataObject templateMetadataObjectModel = new TemplateMetadataObject();
    assertNull(templateMetadataObjectModel.getName());
    assertNull(templateMetadataObjectModel.getType());
    assertNull(templateMetadataObjectModel.getSource());
    assertNull(templateMetadataObjectModel.getXDefault());
    assertNull(templateMetadataObjectModel.getOverrideValue());
    assertNull(templateMetadataObjectModel.getVarAliases());
    assertNull(templateMetadataObjectModel.getVarRef());
    assertNull(templateMetadataObjectModel.getOptions());
    assertNull(templateMetadataObjectModel.getMatches());
    assertNull(templateMetadataObjectModel.isSecure());
    assertNull(templateMetadataObjectModel.isHidden());
    assertNull(templateMetadataObjectModel.isImmutable());
    assertNull(templateMetadataObjectModel.getMinValue());
    assertNull(templateMetadataObjectModel.getMaxValue());
    assertNull(templateMetadataObjectModel.getMinValueLen());
    assertNull(templateMetadataObjectModel.getMaxValueLen());
    assertNull(templateMetadataObjectModel.getDescription());
    assertNull(templateMetadataObjectModel.getSortOrder());
    assertNull(templateMetadataObjectModel.getGroupBy());
    assertNull(templateMetadataObjectModel.isForceNew());
    assertNull(templateMetadataObjectModel.getMetadataValueKey());
  }
}