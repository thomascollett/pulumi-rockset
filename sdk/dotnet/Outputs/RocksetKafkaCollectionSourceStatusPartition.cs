// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Collett.Rockset.Outputs
{

    [OutputType]
    public sealed class RocksetKafkaCollectionSourceStatusPartition
    {
        public readonly int? OffsetLag;
        public readonly int? PartitionNumber;
        public readonly int? PartitionOffset;

        [OutputConstructor]
        private RocksetKafkaCollectionSourceStatusPartition(
            int? offsetLag,

            int? partitionNumber,

            int? partitionOffset)
        {
            OffsetLag = offsetLag;
            PartitionNumber = partitionNumber;
            PartitionOffset = partitionOffset;
        }
    }
}