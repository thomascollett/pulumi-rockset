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
    /// Manages a Rockset Kinesis Integration.
    /// </summary>
    [RocksetResourceType("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration")]
    public partial class RocksetKinesisIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AWS Role Arn to use for this integration.
        /// </summary>
        [Output("awsRoleArn")]
        public Output<string> AwsRoleArn { get; private set; } = null!;

        /// <summary>
        /// Text describing the integration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the integration. Can contain alphanumeric or dash characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a RocksetKinesisIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RocksetKinesisIntegration(string name, RocksetKinesisIntegrationArgs args, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, args ?? new RocksetKinesisIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RocksetKinesisIntegration(string name, Input<string> id, RocksetKinesisIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RocksetKinesisIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RocksetKinesisIntegration Get(string name, Input<string> id, RocksetKinesisIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new RocksetKinesisIntegration(name, id, state, options);
        }
    }

    public sealed class RocksetKinesisIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Role Arn to use for this integration.
        /// </summary>
        [Input("awsRoleArn", required: true)]
        public Input<string> AwsRoleArn { get; set; } = null!;

        /// <summary>
        /// Text describing the integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier for the integration. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RocksetKinesisIntegrationArgs()
        {
        }
        public static new RocksetKinesisIntegrationArgs Empty => new RocksetKinesisIntegrationArgs();
    }

    public sealed class RocksetKinesisIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Role Arn to use for this integration.
        /// </summary>
        [Input("awsRoleArn")]
        public Input<string>? AwsRoleArn { get; set; }

        /// <summary>
        /// Text describing the integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier for the integration. Can contain alphanumeric or dash characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RocksetKinesisIntegrationState()
        {
        }
        public static new RocksetKinesisIntegrationState Empty => new RocksetKinesisIntegrationState();
    }
}
