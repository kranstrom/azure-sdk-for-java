// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.PrivateLinkResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model = BinaryData.fromString(
            "{\"groupId\":\"uhrzayvvt\",\"requiredMembers\":[\"dfgiot\",\"ftutqxlngxlefgu\"],\"requiredZoneNames\":[\"krxd\",\"mi\"]}")
            .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("krxd", model.requiredZoneNames().get(0));
    }
}
