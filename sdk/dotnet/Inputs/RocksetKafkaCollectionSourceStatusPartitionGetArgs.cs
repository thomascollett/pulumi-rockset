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

    public sealed class RocksetKafkaCollectionSourceStatusPartitionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("offsetLag")]
        public Input<int>? OffsetLag { get; set; }

        [Input("partitionNumber")]
        public Input<int>? PartitionNumber { get; set; }

        [Input("partitionOffset")]
        public Input<int>? PartitionOffset { get; set; }

        public RocksetKafkaCollectionSourceStatusPartitionGetArgs()
        {
        }
        public static new RocksetKafkaCollectionSourceStatusPartitionGetArgs Empty => new RocksetKafkaCollectionSourceStatusPartitionGetArgs();
    }
}
