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

    public sealed class RocksetKafkaCollectionSourceStatusGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("documentsProcessed")]
        public Input<int>? DocumentsProcessed { get; set; }

        [Input("lastConsumedTime")]
        public Input<string>? LastConsumedTime { get; set; }

        [Input("partitions")]
        private InputList<Inputs.RocksetKafkaCollectionSourceStatusPartitionGetArgs>? _partitions;
        public InputList<Inputs.RocksetKafkaCollectionSourceStatusPartitionGetArgs> Partitions
        {
            get => _partitions ?? (_partitions = new InputList<Inputs.RocksetKafkaCollectionSourceStatusPartitionGetArgs>());
            set => _partitions = value;
        }

        [Input("state")]
        public Input<string>? State { get; set; }

        public RocksetKafkaCollectionSourceStatusGetArgs()
        {
        }
        public static new RocksetKafkaCollectionSourceStatusGetArgs Empty => new RocksetKafkaCollectionSourceStatusGetArgs();
    }
}
