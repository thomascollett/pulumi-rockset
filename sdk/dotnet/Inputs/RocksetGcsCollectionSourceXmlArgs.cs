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

    public sealed class RocksetGcsCollectionSourceXmlArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributePrefix")]
        public Input<string>? AttributePrefix { get; set; }

        [Input("docTag")]
        public Input<string>? DocTag { get; set; }

        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("rootTag")]
        public Input<string>? RootTag { get; set; }

        [Input("valueTag")]
        public Input<string>? ValueTag { get; set; }

        public RocksetGcsCollectionSourceXmlArgs()
        {
        }
        public static new RocksetGcsCollectionSourceXmlArgs Empty => new RocksetGcsCollectionSourceXmlArgs();
    }
}
