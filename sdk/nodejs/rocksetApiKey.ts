// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manage a Rockset Api Key.
 *
 * Can be used together with roles to scope the actions the api key can take.
 */
export class RocksetApiKey extends pulumi.CustomResource {
    /**
     * Get an existing RocksetApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RocksetApiKeyState, opts?: pulumi.CustomResourceOptions): RocksetApiKey {
        return new RocksetApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rockset:index/rocksetApiKey:RocksetApiKey';

    /**
     * Returns true if the given object is an instance of RocksetApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RocksetApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RocksetApiKey.__pulumiType;
    }

    /**
     * The resulting Rockset api key.
     */
    public /*out*/ readonly key!: pulumi.Output<string>;
    /**
     * Name of the api key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The role the api key will use. If not specified, "All User Assigned Roles" will be used.
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * The user the key is created for.
     */
    public /*out*/ readonly user!: pulumi.Output<string>;

    /**
     * Create a RocksetApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RocksetApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RocksetApiKeyArgs | RocksetApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RocksetApiKeyState | undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as RocksetApiKeyArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["key"] = undefined /*out*/;
            resourceInputs["user"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["key"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(RocksetApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RocksetApiKey resources.
 */
export interface RocksetApiKeyState {
    /**
     * The resulting Rockset api key.
     */
    key?: pulumi.Input<string>;
    /**
     * Name of the api key.
     */
    name?: pulumi.Input<string>;
    /**
     * The role the api key will use. If not specified, "All User Assigned Roles" will be used.
     */
    role?: pulumi.Input<string>;
    /**
     * The user the key is created for.
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RocksetApiKey resource.
 */
export interface RocksetApiKeyArgs {
    /**
     * Name of the api key.
     */
    name?: pulumi.Input<string>;
    /**
     * The role the api key will use. If not specified, "All User Assigned Roles" will be used.
     */
    role?: pulumi.Input<string>;
}
