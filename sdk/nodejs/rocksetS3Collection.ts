// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a collection with on or more S3 sources attached. Uses an S3 integration to access the S3 bucket. If no integration is provided, only data in public buckets are accessible.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rockset from "@collett/pulumi-rockset";
 *
 * const sample = new rockset.RocksetWorkspace("sample", {description: "sample datasets"});
 * const _public = new rockset.RocksetS3Integration("public", {
 *     description: "Integration to access Rockset's public datasets",
 *     awsRoleArn: "arn:aws:iam::469279130686:role/rockset-public-datasets",
 * });
 * const cities = new rockset.RocksetS3Collection("cities", {
 *     workspace: sample.name,
 *     sources: [{
 *         bucket: "rockset-public-datasets",
 *         integrationName: _public.name,
 *         pattern: "cities/*.json",
 *         format: "json",
 *     }],
 * });
 * ```
 */
export class RocksetS3Collection extends pulumi.CustomResource {
    /**
     * Get an existing RocksetS3Collection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RocksetS3CollectionState, opts?: pulumi.CustomResourceOptions): RocksetS3Collection {
        return new RocksetS3Collection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rockset:index/rocksetS3Collection:RocksetS3Collection';

    /**
     * Returns true if the given object is an instance of RocksetS3Collection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RocksetS3Collection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RocksetS3Collection.__pulumiType;
    }

    /**
     * Text describing the collection.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * **Deprecated** use ingestTransformation instead
     *
     * @deprecated Use ingest_transformation instead
     */
    public readonly fieldMappingQuery!: pulumi.Output<string | undefined>;
    /**
     * Ingest transformation SQL query. Turns the collection into insertOnly mode.
     */
    public readonly ingestTransformation!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier for the collection. Can contain alphanumeric or dash characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Number of seconds after which data is purged. Based on event time.
     */
    public readonly retentionSecs!: pulumi.Output<number | undefined>;
    /**
     * Defines a source for this collection.
     */
    public readonly sources!: pulumi.Output<outputs.RocksetS3CollectionSource[] | undefined>;
    /**
     * Wait until the collection is ready.
     */
    public readonly waitForCollection!: pulumi.Output<boolean | undefined>;
    /**
     * Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
     */
    public readonly waitForDocuments!: pulumi.Output<number | undefined>;
    /**
     * The name of the workspace.
     */
    public readonly workspace!: pulumi.Output<string>;

    /**
     * Create a RocksetS3Collection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RocksetS3CollectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RocksetS3CollectionArgs | RocksetS3CollectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RocksetS3CollectionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fieldMappingQuery"] = state ? state.fieldMappingQuery : undefined;
            resourceInputs["ingestTransformation"] = state ? state.ingestTransformation : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["retentionSecs"] = state ? state.retentionSecs : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["waitForCollection"] = state ? state.waitForCollection : undefined;
            resourceInputs["waitForDocuments"] = state ? state.waitForDocuments : undefined;
            resourceInputs["workspace"] = state ? state.workspace : undefined;
        } else {
            const args = argsOrState as RocksetS3CollectionArgs | undefined;
            if ((!args || args.workspace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspace'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fieldMappingQuery"] = args ? args.fieldMappingQuery : undefined;
            resourceInputs["ingestTransformation"] = args ? args.ingestTransformation : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["retentionSecs"] = args ? args.retentionSecs : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["waitForCollection"] = args ? args.waitForCollection : undefined;
            resourceInputs["waitForDocuments"] = args ? args.waitForDocuments : undefined;
            resourceInputs["workspace"] = args ? args.workspace : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RocksetS3Collection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RocksetS3Collection resources.
 */
export interface RocksetS3CollectionState {
    /**
     * Text describing the collection.
     */
    description?: pulumi.Input<string>;
    /**
     * **Deprecated** use ingestTransformation instead
     *
     * @deprecated Use ingest_transformation instead
     */
    fieldMappingQuery?: pulumi.Input<string>;
    /**
     * Ingest transformation SQL query. Turns the collection into insertOnly mode.
     */
    ingestTransformation?: pulumi.Input<string>;
    /**
     * Unique identifier for the collection. Can contain alphanumeric or dash characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Number of seconds after which data is purged. Based on event time.
     */
    retentionSecs?: pulumi.Input<number>;
    /**
     * Defines a source for this collection.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.RocksetS3CollectionSource>[]>;
    /**
     * Wait until the collection is ready.
     */
    waitForCollection?: pulumi.Input<boolean>;
    /**
     * Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
     */
    waitForDocuments?: pulumi.Input<number>;
    /**
     * The name of the workspace.
     */
    workspace?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RocksetS3Collection resource.
 */
export interface RocksetS3CollectionArgs {
    /**
     * Text describing the collection.
     */
    description?: pulumi.Input<string>;
    /**
     * **Deprecated** use ingestTransformation instead
     *
     * @deprecated Use ingest_transformation instead
     */
    fieldMappingQuery?: pulumi.Input<string>;
    /**
     * Ingest transformation SQL query. Turns the collection into insertOnly mode.
     */
    ingestTransformation?: pulumi.Input<string>;
    /**
     * Unique identifier for the collection. Can contain alphanumeric or dash characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Number of seconds after which data is purged. Based on event time.
     */
    retentionSecs?: pulumi.Input<number>;
    /**
     * Defines a source for this collection.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.RocksetS3CollectionSource>[]>;
    /**
     * Wait until the collection is ready.
     */
    waitForCollection?: pulumi.Input<boolean>;
    /**
     * Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
     */
    waitForDocuments?: pulumi.Input<number>;
    /**
     * The name of the workspace.
     */
    workspace: pulumi.Input<string>;
}
