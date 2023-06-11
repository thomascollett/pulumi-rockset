// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetWorkspaceArgs Empty = new RocksetWorkspaceArgs();

    /**
     * Text describing the collection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the collection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier for workspace. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for workspace. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RocksetWorkspaceArgs() {}

    private RocksetWorkspaceArgs(RocksetWorkspaceArgs $) {
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetWorkspaceArgs $;

        public Builder() {
            $ = new RocksetWorkspaceArgs();
        }

        public Builder(RocksetWorkspaceArgs defaults) {
            $ = new RocksetWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Text describing the collection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the collection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Unique identifier for workspace. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for workspace. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RocksetWorkspaceArgs build() {
            return $;
        }
    }

}