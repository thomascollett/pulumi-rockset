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

    public sealed class RocksetQueryLambdaSqlArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultParameters")]
        private InputList<Inputs.RocksetQueryLambdaSqlDefaultParameterArgs>? _defaultParameters;
        public InputList<Inputs.RocksetQueryLambdaSqlDefaultParameterArgs> DefaultParameters
        {
            get => _defaultParameters ?? (_defaultParameters = new InputList<Inputs.RocksetQueryLambdaSqlDefaultParameterArgs>());
            set => _defaultParameters = value;
        }

        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public RocksetQueryLambdaSqlArgs()
        {
        }
        public static new RocksetQueryLambdaSqlArgs Empty => new RocksetQueryLambdaSqlArgs();
    }
}
