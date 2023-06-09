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

    public sealed class RocksetRolePrivilegeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action allowed by this privilege.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use '*ALL*' for actions which apply to all clusters.
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// The resource on which this action is allowed. Defaults to 'All' if not specified.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        public RocksetRolePrivilegeGetArgs()
        {
        }
        public static new RocksetRolePrivilegeGetArgs Empty => new RocksetRolePrivilegeGetArgs();
    }
}
