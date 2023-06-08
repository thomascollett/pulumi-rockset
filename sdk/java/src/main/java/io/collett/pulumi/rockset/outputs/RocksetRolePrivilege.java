// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RocksetRolePrivilege {
    /**
     * @return The action allowed by this privilege.
     * 
     */
    private String action;
    /**
     * @return Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
     * 
     */
    private @Nullable String cluster;
    /**
     * @return The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
     * 
     */
    private @Nullable String resourceName;

    private RocksetRolePrivilege() {}
    /**
     * @return The action allowed by this privilege.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use &#39;*ALL*&#39; for actions which apply to all clusters.
     * 
     */
    public Optional<String> cluster() {
        return Optional.ofNullable(this.cluster);
    }
    /**
     * @return The resource on which this action is allowed. Defaults to &#39;All&#39; if not specified.
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocksetRolePrivilege defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String cluster;
        private @Nullable String resourceName;
        public Builder() {}
        public Builder(RocksetRolePrivilege defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cluster = defaults.cluster;
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder cluster(@Nullable String cluster) {
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public RocksetRolePrivilege build() {
            final var o = new RocksetRolePrivilege();
            o.action = action;
            o.cluster = cluster;
            o.resourceName = resourceName;
            return o;
        }
    }
}
