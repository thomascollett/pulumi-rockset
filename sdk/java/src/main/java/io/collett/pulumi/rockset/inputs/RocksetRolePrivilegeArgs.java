// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetRolePrivilegeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetRolePrivilegeArgs Empty = new RocksetRolePrivilegeArgs();

    /**
     * The action allowed by this privilege.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action allowed by this privilege.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    private RocksetRolePrivilegeArgs() {}

    private RocksetRolePrivilegeArgs(RocksetRolePrivilegeArgs $) {
        this.action = $.action;
        this.cluster = $.cluster;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetRolePrivilegeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetRolePrivilegeArgs $;

        public Builder() {
            $ = new RocksetRolePrivilegeArgs();
        }

        public Builder(RocksetRolePrivilegeArgs defaults) {
            $ = new RocksetRolePrivilegeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action allowed by this privilege.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action allowed by this privilege.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param cluster Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param resourceName The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public RocksetRolePrivilegeArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}