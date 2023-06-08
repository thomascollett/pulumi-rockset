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
    /// Manages a Rockset view.
    /// </summary>
    [RocksetResourceType("rockset:index/rocksetView:RocksetView")]
    public partial class RocksetView : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The user who created the view.
        /// </summary>
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// SQL query used for thw view.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// Workspace name.
        /// </summary>
        [Output("workspace")]
        public Output<string> Workspace { get; private set; } = null!;


        /// <summary>
        /// Create a RocksetView resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RocksetView(string name, RocksetViewArgs args, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetView:RocksetView", name, args ?? new RocksetViewArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RocksetView(string name, Input<string> id, RocksetViewState? state = null, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetView:RocksetView", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RocksetView resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RocksetView Get(string name, Input<string> id, RocksetViewState? state = null, CustomResourceOptions? options = null)
        {
            return new RocksetView(name, id, state, options);
        }
    }

    public sealed class RocksetViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// SQL query used for thw view.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// Workspace name.
        /// </summary>
        [Input("workspace", required: true)]
        public Input<string> Workspace { get; set; } = null!;

        public RocksetViewArgs()
        {
        }
        public static new RocksetViewArgs Empty => new RocksetViewArgs();
    }

    public sealed class RocksetViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user who created the view.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// Text describing the collection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// SQL query used for thw view.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// Workspace name.
        /// </summary>
        [Input("workspace")]
        public Input<string>? Workspace { get; set; }

        public RocksetViewState()
        {
        }
        public static new RocksetViewState Empty => new RocksetViewState();
    }
}
