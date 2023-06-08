// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Collett.Rockset
{
    /// <summary>
    /// Manages a collection with an Kinesis source attached.
    /// </summary>
    [RocksetResourceType("rockset:index/rocksetKinesisCollection:RocksetKinesisCollection")]
    public partial class RocksetKinesisCollection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// **Deprecated** use ingest_transformation instead
        /// </summary>
        [Output("fieldMappingQuery")]
        public Output<string?> FieldMappingQuery { get; private set; } = null!;

        /// <summary>
        /// Ingest transformation SQL query. Turns the collection into insert_only mode.
        /// </summary>
        [Output("ingestTransformation")]
        public Output<string?> IngestTransformation { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the collection. Can contain alphanumeric or dash characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Number of seconds after which data is purged. Based on event time.
        /// </summary>
        [Output("retentionSecs")]
        public Output<int?> RetentionSecs { get; private set; } = null!;

        /// <summary>
        /// Defines a source for this collection.
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<Outputs.RocksetKinesisCollectionSource>> Sources { get; private set; } = null!;

        /// <summary>
        /// Wait until the collection is ready.
        /// </summary>
        [Output("waitForCollection")]
        public Output<bool?> WaitForCollection { get; private set; } = null!;

        /// <summary>
        /// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
        /// </summary>
        [Output("waitForDocuments")]
        public Output<int?> WaitForDocuments { get; private set; } = null!;

        /// <summary>
        /// The name of the workspace.
        /// </summary>
        [Output("workspace")]
        public Output<string> Workspace { get; private set; } = null!;


        /// <summary>
        /// Create a RocksetKinesisCollection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RocksetKinesisCollection(string name, RocksetKinesisCollectionArgs args, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetKinesisCollection:RocksetKinesisCollection", name, args ?? new RocksetKinesisCollectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RocksetKinesisCollection(string name, Input<string> id, RocksetKinesisCollectionState? state = null, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetKinesisCollection:RocksetKinesisCollection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/thomascollett",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RocksetKinesisCollection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RocksetKinesisCollection Get(string name, Input<string> id, RocksetKinesisCollectionState? state = null, CustomResourceOptions? options = null)
        {
            return new RocksetKinesisCollection(name, id, state, options);
        }
    }

    public sealed class RocksetKinesisCollectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// **Deprecated** use ingest_transformation instead
        /// </summary>
        [Input("fieldMappingQuery")]
        public Input<string>? FieldMappingQuery { get; set; }

        /// <summary>
        /// Ingest transformation SQL query. Turns the collection into insert_only mode.
        /// </summary>
        [Input("ingestTransformation")]
        public Input<string>? IngestTransformation { get; set; }

        /// <summary>
        /// Unique identifier for the collection. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of seconds after which data is purged. Based on event time.
        /// </summary>
        [Input("retentionSecs")]
        public Input<int>? RetentionSecs { get; set; }

        [Input("sources")]
        private InputList<Inputs.RocksetKinesisCollectionSourceArgs>? _sources;

        /// <summary>
        /// Defines a source for this collection.
        /// </summary>
        public InputList<Inputs.RocksetKinesisCollectionSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.RocksetKinesisCollectionSourceArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// Wait until the collection is ready.
        /// </summary>
        [Input("waitForCollection")]
        public Input<bool>? WaitForCollection { get; set; }

        /// <summary>
        /// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
        /// </summary>
        [Input("waitForDocuments")]
        public Input<int>? WaitForDocuments { get; set; }

        /// <summary>
        /// The name of the workspace.
        /// </summary>
        [Input("workspace", required: true)]
        public Input<string> Workspace { get; set; } = null!;

        public RocksetKinesisCollectionArgs()
        {
        }
        public static new RocksetKinesisCollectionArgs Empty => new RocksetKinesisCollectionArgs();
    }

    public sealed class RocksetKinesisCollectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// **Deprecated** use ingest_transformation instead
        /// </summary>
        [Input("fieldMappingQuery")]
        public Input<string>? FieldMappingQuery { get; set; }

        /// <summary>
        /// Ingest transformation SQL query. Turns the collection into insert_only mode.
        /// </summary>
        [Input("ingestTransformation")]
        public Input<string>? IngestTransformation { get; set; }

        /// <summary>
        /// Unique identifier for the collection. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of seconds after which data is purged. Based on event time.
        /// </summary>
        [Input("retentionSecs")]
        public Input<int>? RetentionSecs { get; set; }

        [Input("sources")]
        private InputList<Inputs.RocksetKinesisCollectionSourceGetArgs>? _sources;

        /// <summary>
        /// Defines a source for this collection.
        /// </summary>
        public InputList<Inputs.RocksetKinesisCollectionSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.RocksetKinesisCollectionSourceGetArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// Wait until the collection is ready.
        /// </summary>
        [Input("waitForCollection")]
        public Input<bool>? WaitForCollection { get; set; }

        /// <summary>
        /// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
        /// </summary>
        [Input("waitForDocuments")]
        public Input<int>? WaitForDocuments { get; set; }

        /// <summary>
        /// The name of the workspace.
        /// </summary>
        [Input("workspace")]
        public Input<string>? Workspace { get; set; }

        public RocksetKinesisCollectionState()
        {
        }
        public static new RocksetKinesisCollectionState Empty => new RocksetKinesisCollectionState();
    }
}
