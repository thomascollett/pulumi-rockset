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
    public sealed class RocksetS3CollectionSourceXml
    {
        public readonly string? AttributePrefix;
        public readonly string? DocTag;
        public readonly string? Encoding;
        public readonly string? RootTag;
        public readonly string? ValueTag;

        [OutputConstructor]
        private RocksetS3CollectionSourceXml(
            string? attributePrefix,

            string? docTag,

            string? encoding,

            string? rootTag,

            string? valueTag)
        {
            AttributePrefix = attributePrefix;
            DocTag = docTag;
            Encoding = encoding;
            RootTag = rootTag;
            ValueTag = valueTag;
        }
    }
}
