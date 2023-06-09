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
    public sealed class RocksetQueryLambdaSql
    {
        public readonly ImmutableArray<Outputs.RocksetQueryLambdaSqlDefaultParameter> DefaultParameters;
        public readonly string Query;

        [OutputConstructor]
        private RocksetQueryLambdaSql(
            ImmutableArray<Outputs.RocksetQueryLambdaSqlDefaultParameter> defaultParameters,

            string query)
        {
            DefaultParameters = defaultParameters;
            Query = query;
        }
    }
}
