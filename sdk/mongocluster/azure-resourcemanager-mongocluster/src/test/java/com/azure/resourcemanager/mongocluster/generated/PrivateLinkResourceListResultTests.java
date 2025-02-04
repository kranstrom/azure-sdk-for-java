// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.implementation.models.PrivateLinkResourceListResult;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"gmaajrm\",\"requiredMembers\":[\"wzrlovmclwhij\",\"oejctbzaqsqsy\"],\"requiredZoneNames\":[\"bfkgukdkex\",\"ppofmxaxcfjpgdd\"]},\"id\":\"c\",\"name\":\"j\",\"type\":\"hvpmoue\"}],\"nextLink\":\"dzxibqeojnxqbzvd\"}")
            .toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("bfkgukdkex", model.value().get(0).properties().requiredZoneNames().get(0));
        Assertions.assertEquals("dzxibqeojnxqbzvd", model.nextLink());
    }
}
