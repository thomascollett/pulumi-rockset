// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about the Rockset deployment for the specified api server.
 */
export function getAccount(opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rockset:index/getAccount:getAccount", {
    }, opts);
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * The AWS account ID to reference in AWS policies.
     */
    readonly accountId: string;
    /**
     * The Rockset clusters available to this API key.
     */
    readonly clusters: outputs.GetAccountCluster[];
    /**
     * The external ID to use in AWS trust policies.
     */
    readonly externalId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the organization for the API key.
     */
    readonly organization: string;
    /**
     * The name of the Rockset user used for AWS trust policies.
     */
    readonly rocksetUser: string;
}
