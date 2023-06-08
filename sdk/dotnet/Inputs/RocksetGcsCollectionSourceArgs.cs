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

    public sealed class RocksetGcsCollectionSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// GCS bucket containing the target data.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("csv")]
        public Input<Inputs.RocksetGcsCollectionSourceCsvArgs>? Csv { get; set; }

        /// <summary>
        /// Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        /// <summary>
        /// The name of the Rockset GCS integration.
        /// </summary>
        [Input("integrationName", required: true)]
        public Input<string> IntegrationName { get; set; } = null!;

        /// <summary>
        /// Simple path prefix to GCS key.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("xml")]
        public Input<Inputs.RocksetGcsCollectionSourceXmlArgs>? Xml { get; set; }

        public RocksetGcsCollectionSourceArgs()
        {
        }
        public static new RocksetGcsCollectionSourceArgs Empty => new RocksetGcsCollectionSourceArgs();
    }
}
