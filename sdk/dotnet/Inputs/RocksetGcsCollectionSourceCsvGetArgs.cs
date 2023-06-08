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

    public sealed class RocksetGcsCollectionSourceCsvGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("columnNames")]
        private InputList<string>? _columnNames;
        public InputList<string> ColumnNames
        {
            get => _columnNames ?? (_columnNames = new InputList<string>());
            set => _columnNames = value;
        }

        [Input("columnTypes")]
        private InputList<string>? _columnTypes;
        public InputList<string> ColumnTypes
        {
            get => _columnTypes ?? (_columnTypes = new InputList<string>());
            set => _columnTypes = value;
        }

        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("escapeChar")]
        public Input<string>? EscapeChar { get; set; }

        [Input("firstLineAsColumnNames")]
        public Input<bool>? FirstLineAsColumnNames { get; set; }

        [Input("quoteChar")]
        public Input<string>? QuoteChar { get; set; }

        [Input("separator")]
        public Input<string>? Separator { get; set; }

        public RocksetGcsCollectionSourceCsvGetArgs()
        {
        }
        public static new RocksetGcsCollectionSourceCsvGetArgs Empty => new RocksetGcsCollectionSourceCsvGetArgs();
    }
}
