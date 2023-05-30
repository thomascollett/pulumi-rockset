// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Rockset [Role](https://rockset.com/docs/iam/).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rockset from "@collett/pulumi-rockset";
 *
 * const query_onlyRocksetRole = new rockset.RocksetRole("query-onlyRocksetRole", {
 *     description: "This role can only query collections in the prod workspace in the usw2a1 cluster",
 *     privileges: [
 *         {
 *             action: "QUERY_DATA_WS",
 *             resourceName: "prod",
 *             cluster: "usw2a1",
 *         },
 *         {
 *             action: "EXECUTE_QUERY_LAMBDA_WS",
 *             resourceName: "prod",
 *             cluster: "usw2a1",
 *         },
 *     ],
 * });
 * const query_onlyRocksetApiKey = new rockset.RocksetApiKey("query-onlyRocksetApiKey", {role: query_onlyRocksetRole.name});
 * ```
 */
export class RocksetRole extends pulumi.CustomResource {
    /**
     * Get an existing RocksetRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RocksetRoleState, opts?: pulumi.CustomResourceOptions): RocksetRole {
        return new RocksetRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rockset:index/rocksetRole:RocksetRole';

    /**
     * Returns true if the given object is an instance of RocksetRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RocksetRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RocksetRole.__pulumiType;
    }

    /**
     * When the role was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Who created the role.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * Role description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Role name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The email of the user who currently owns the role.
     */
    public /*out*/ readonly ownerEmail!: pulumi.Output<string>;
    /**
     * Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     */
    public readonly privileges!: pulumi.Output<outputs.RocksetRolePrivilege[] | undefined>;

    /**
     * Create a RocksetRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RocksetRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RocksetRoleArgs | RocksetRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RocksetRoleState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerEmail"] = state ? state.ownerEmail : undefined;
            resourceInputs["privileges"] = state ? state.privileges : undefined;
        } else {
            const args = argsOrState as RocksetRoleArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["privileges"] = args ? args.privileges : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["ownerEmail"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RocksetRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RocksetRole resources.
 */
export interface RocksetRoleState {
    /**
     * When the role was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Who created the role.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * Role description.
     */
    description?: pulumi.Input<string>;
    /**
     * Role name.
     */
    name?: pulumi.Input<string>;
    /**
     * The email of the user who currently owns the role.
     */
    ownerEmail?: pulumi.Input<string>;
    /**
     * Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     */
    privileges?: pulumi.Input<pulumi.Input<inputs.RocksetRolePrivilege>[]>;
}

/**
 * The set of arguments for constructing a RocksetRole resource.
 */
export interface RocksetRoleArgs {
    /**
     * Role description.
     */
    description?: pulumi.Input<string>;
    /**
     * Role name.
     */
    name?: pulumi.Input<string>;
    /**
     * Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     */
    privileges?: pulumi.Input<pulumi.Input<inputs.RocksetRolePrivilege>[]>;
}
