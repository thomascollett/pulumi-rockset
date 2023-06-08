// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.collett.pulumi.rockset.inputs.RocksetRolePrivilegeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetRoleState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetRoleState Empty = new RocksetRoleState();

    /**
     * When the role was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return When the role was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Who created the role.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return Who created the role.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Role description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Role description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Role name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Role name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The email of the user who currently owns the role.
     * 
     */
    @Import(name="ownerEmail")
    private @Nullable Output<String> ownerEmail;

    /**
     * @return The email of the user who currently owns the role.
     * 
     */
    public Optional<Output<String>> ownerEmail() {
        return Optional.ofNullable(this.ownerEmail);
    }

    /**
     * Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     * 
     */
    @Import(name="privileges")
    private @Nullable Output<List<RocksetRolePrivilegeArgs>> privileges;

    /**
     * @return Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     * 
     */
    public Optional<Output<List<RocksetRolePrivilegeArgs>>> privileges() {
        return Optional.ofNullable(this.privileges);
    }

    private RocksetRoleState() {}

    private RocksetRoleState(RocksetRoleState $) {
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.name = $.name;
        this.ownerEmail = $.ownerEmail;
        this.privileges = $.privileges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetRoleState $;

        public Builder() {
            $ = new RocksetRoleState();
        }

        public Builder(RocksetRoleState defaults) {
            $ = new RocksetRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt When the role was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt When the role was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy Who created the role.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy Who created the role.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param description Role description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Role description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Role name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Role name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerEmail The email of the user who currently owns the role.
         * 
         * @return builder
         * 
         */
        public Builder ownerEmail(@Nullable Output<String> ownerEmail) {
            $.ownerEmail = ownerEmail;
            return this;
        }

        /**
         * @param ownerEmail The email of the user who currently owns the role.
         * 
         * @return builder
         * 
         */
        public Builder ownerEmail(String ownerEmail) {
            return ownerEmail(Output.of(ownerEmail));
        }

        /**
         * @param privileges Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
         * 
         * @return builder
         * 
         */
        public Builder privileges(@Nullable Output<List<RocksetRolePrivilegeArgs>> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
         * 
         * @return builder
         * 
         */
        public Builder privileges(List<RocksetRolePrivilegeArgs> privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param privileges Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
         * 
         * @return builder
         * 
         */
        public Builder privileges(RocksetRolePrivilegeArgs... privileges) {
            return privileges(List.of(privileges));
        }

        public RocksetRoleState build() {
            return $;
        }
    }

}
