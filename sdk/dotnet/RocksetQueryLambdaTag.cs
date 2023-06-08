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
    /// Manages a Rockset Query Lambda Tag.
    /// </summary>
    [RocksetResourceType("rockset:index/rocksetQueryLambdaTag:RocksetQueryLambdaTag")]
    public partial class RocksetQueryLambdaTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique identifier for the tag. Can contain alphanumeric or dash characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        /// </summary>
        [Output("queryLambda")]
        public Output<string> QueryLambda { get; private set; } = null!;

        /// <summary>
        /// Version of the query lambda this tag should point to.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// The name of the workspace the query lambda is in.
        /// </summary>
        [Output("workspace")]
        public Output<string> Workspace { get; private set; } = null!;


        /// <summary>
        /// Create a RocksetQueryLambdaTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RocksetQueryLambdaTag(string name, RocksetQueryLambdaTagArgs args, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetQueryLambdaTag:RocksetQueryLambdaTag", name, args ?? new RocksetQueryLambdaTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RocksetQueryLambdaTag(string name, Input<string> id, RocksetQueryLambdaTagState? state = null, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetQueryLambdaTag:RocksetQueryLambdaTag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RocksetQueryLambdaTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RocksetQueryLambdaTag Get(string name, Input<string> id, RocksetQueryLambdaTagState? state = null, CustomResourceOptions? options = null)
        {
            return new RocksetQueryLambdaTag(name, id, state, options);
        }
    }

    public sealed class RocksetQueryLambdaTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier for the tag. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("queryLambda", required: true)]
        public Input<string> QueryLambda { get; set; } = null!;

        /// <summary>
        /// Version of the query lambda this tag should point to.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        /// <summary>
        /// The name of the workspace the query lambda is in.
        /// </summary>
        [Input("workspace", required: true)]
        public Input<string> Workspace { get; set; } = null!;

        public RocksetQueryLambdaTagArgs()
        {
        }
        public static new RocksetQueryLambdaTagArgs Empty => new RocksetQueryLambdaTagArgs();
    }

    public sealed class RocksetQueryLambdaTagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier for the tag. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("queryLambda")]
        public Input<string>? QueryLambda { get; set; }

        /// <summary>
        /// Version of the query lambda this tag should point to.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The name of the workspace the query lambda is in.
        /// </summary>
        [Input("workspace")]
        public Input<string>? Workspace { get; set; }

        public RocksetQueryLambdaTagState()
        {
        }
        public static new RocksetQueryLambdaTagState Empty => new RocksetQueryLambdaTagState();
    }
}
