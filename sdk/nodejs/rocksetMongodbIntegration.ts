// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a Rockset MongoDB Integration.
 */
export class RocksetMongodbIntegration extends pulumi.CustomResource {
    /**
     * Get an existing RocksetMongodbIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RocksetMongodbIntegrationState, opts?: pulumi.CustomResourceOptions): RocksetMongodbIntegration {
        return new RocksetMongodbIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rockset:index/rocksetMongodbIntegration:RocksetMongodbIntegration';

    /**
     * Returns true if the given object is an instance of RocksetMongodbIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RocksetMongodbIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RocksetMongodbIntegration.__pulumiType;
    }

    /**
     * MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
     */
    public readonly connectionUri!: pulumi.Output<string>;
    /**
     * Text describing the integration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a RocksetMongodbIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RocksetMongodbIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RocksetMongodbIntegrationArgs | RocksetMongodbIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RocksetMongodbIntegrationState | undefined;
            resourceInputs["connectionUri"] = state ? state.connectionUri : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as RocksetMongodbIntegrationArgs | undefined;
            if ((!args || args.connectionUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionUri'");
            }
            resourceInputs["connectionUri"] = args ? args.connectionUri : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RocksetMongodbIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RocksetMongodbIntegration resources.
 */
export interface RocksetMongodbIntegrationState {
    /**
     * MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
     */
    connectionUri?: pulumi.Input<string>;
    /**
     * Text describing the integration.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RocksetMongodbIntegration resource.
 */
export interface RocksetMongodbIntegrationArgs {
    /**
     * MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
     */
    connectionUri: pulumi.Input<string>;
    /**
     * Text describing the integration.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     */
    name?: pulumi.Input<string>;
}
