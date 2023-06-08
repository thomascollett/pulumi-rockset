// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Collett.Rockset.Inputs
{

    public sealed class RocksetS3CollectionSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 bucket containing the target data.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("csv")]
        public Input<Inputs.RocksetS3CollectionSourceCsvArgs>? Csv { get; set; }

        /// <summary>
        /// Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        /// <summary>
        /// The name of the Rockset S3 integration. If no S3 integration is provided only data in public S3 buckets are accessible.
        /// </summary>
        [Input("integrationName", required: true)]
        public Input<string> IntegrationName { get; set; } = null!;

        /// <summary>
        /// Regex path pattern to S3 keys.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Simple path prefix to S3 keys.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("xml")]
        public Input<Inputs.RocksetS3CollectionSourceXmlArgs>? Xml { get; set; }

        public RocksetS3CollectionSourceArgs()
        {
        }
        public static new RocksetS3CollectionSourceArgs Empty => new RocksetS3CollectionSourceArgs();
    }
}
