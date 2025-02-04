// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An associated tenant.
 */
@Fluent
public final class AssociatedTenantProperties implements JsonSerializable<AssociatedTenantProperties> {
    /*
     * The provisioning state of the resource during a long-running operation.
     */
    private ProvisioningState provisioningState;

    /*
     * The name of the associated tenant.
     */
    private String displayName;

    /*
     * The ID that uniquely identifies a tenant.
     */
    private String tenantId;

    /*
     * The state determines whether users from the associated tenant can be assigned roles for commerce activities like
     * viewing and downloading invoices, managing payments, and making purchases.
     */
    private BillingManagementTenantState billingManagementState;

    /*
     * The state determines whether subscriptions and licenses can be provisioned in the associated tenant. It can be
     * set to 'Pending' to initiate a billing request.
     */
    private ProvisioningTenantState provisioningManagementState;

    /*
     * The unique identifier for the billing request that is created when enabling provisioning for an associated
     * tenant.
     */
    private String provisioningBillingRequestId;

    /**
     * Creates an instance of AssociatedTenantProperties class.
     */
    public AssociatedTenantProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource during a long-running operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: The name of the associated tenant.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the associated tenant.
     * 
     * @param displayName the displayName value to set.
     * @return the AssociatedTenantProperties object itself.
     */
    public AssociatedTenantProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the tenantId property: The ID that uniquely identifies a tenant.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The ID that uniquely identifies a tenant.
     * 
     * @param tenantId the tenantId value to set.
     * @return the AssociatedTenantProperties object itself.
     */
    public AssociatedTenantProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the billingManagementState property: The state determines whether users from the associated tenant can be
     * assigned roles for commerce activities like viewing and downloading invoices, managing payments, and making
     * purchases.
     * 
     * @return the billingManagementState value.
     */
    public BillingManagementTenantState billingManagementState() {
        return this.billingManagementState;
    }

    /**
     * Set the billingManagementState property: The state determines whether users from the associated tenant can be
     * assigned roles for commerce activities like viewing and downloading invoices, managing payments, and making
     * purchases.
     * 
     * @param billingManagementState the billingManagementState value to set.
     * @return the AssociatedTenantProperties object itself.
     */
    public AssociatedTenantProperties withBillingManagementState(BillingManagementTenantState billingManagementState) {
        this.billingManagementState = billingManagementState;
        return this;
    }

    /**
     * Get the provisioningManagementState property: The state determines whether subscriptions and licenses can be
     * provisioned in the associated tenant. It can be set to 'Pending' to initiate a billing request.
     * 
     * @return the provisioningManagementState value.
     */
    public ProvisioningTenantState provisioningManagementState() {
        return this.provisioningManagementState;
    }

    /**
     * Set the provisioningManagementState property: The state determines whether subscriptions and licenses can be
     * provisioned in the associated tenant. It can be set to 'Pending' to initiate a billing request.
     * 
     * @param provisioningManagementState the provisioningManagementState value to set.
     * @return the AssociatedTenantProperties object itself.
     */
    public AssociatedTenantProperties
        withProvisioningManagementState(ProvisioningTenantState provisioningManagementState) {
        this.provisioningManagementState = provisioningManagementState;
        return this;
    }

    /**
     * Get the provisioningBillingRequestId property: The unique identifier for the billing request that is created when
     * enabling provisioning for an associated tenant.
     * 
     * @return the provisioningBillingRequestId value.
     */
    public String provisioningBillingRequestId() {
        return this.provisioningBillingRequestId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        jsonWriter.writeStringField("billingManagementState",
            this.billingManagementState == null ? null : this.billingManagementState.toString());
        jsonWriter.writeStringField("provisioningManagementState",
            this.provisioningManagementState == null ? null : this.provisioningManagementState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssociatedTenantProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssociatedTenantProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssociatedTenantProperties.
     */
    public static AssociatedTenantProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssociatedTenantProperties deserializedAssociatedTenantProperties = new AssociatedTenantProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.displayName = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.tenantId = reader.getString();
                } else if ("billingManagementState".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.billingManagementState
                        = BillingManagementTenantState.fromString(reader.getString());
                } else if ("provisioningManagementState".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.provisioningManagementState
                        = ProvisioningTenantState.fromString(reader.getString());
                } else if ("provisioningBillingRequestId".equals(fieldName)) {
                    deserializedAssociatedTenantProperties.provisioningBillingRequestId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssociatedTenantProperties;
        });
    }
}
