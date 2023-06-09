// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetAliasState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetAliasState Empty = new RocksetAliasState();

    /**
     * List of collections for this alias to refer to.
     * 
     */
    @Import(name="collections")
    private @Nullable Output<String> collections;

    /**
     * @return List of collections for this alias to refer to.
     * 
     */
    public Optional<Output<String>> collections() {
        return Optional.ofNullable(this.collections);
    }

    /**
     * Text describing the alias.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the alias.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier for the alias. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the alias. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the workspace the alias will be in.
     * 
     */
    @Import(name="workspace")
    private @Nullable Output<String> workspace;

    /**
     * @return Name of the workspace the alias will be in.
     * 
     */
    public Optional<Output<String>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private RocksetAliasState() {}

    private RocksetAliasState(RocksetAliasState $) {
        this.collections = $.collections;
        this.description = $.description;
        this.name = $.name;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetAliasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetAliasState $;

        public Builder() {
            $ = new RocksetAliasState();
        }

        public Builder(RocksetAliasState defaults) {
            $ = new RocksetAliasState(Objects.requireNonNull(defaults));
        }

        /**
         * @param collections List of collections for this alias to refer to.
         * 
         * @return builder
         * 
         */
        public Builder collections(@Nullable Output<String> collections) {
            $.collections = collections;
            return this;
        }

        /**
         * @param collections List of collections for this alias to refer to.
         * 
         * @return builder
         * 
         */
        public Builder collections(String collections) {
            return collections(Output.of(collections));
        }

        /**
         * @param description Text describing the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Unique identifier for the alias. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the alias. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param workspace Name of the workspace the alias will be in.
         * 
         * @return builder
         * 
         */
        public Builder workspace(@Nullable Output<String> workspace) {
            $.workspace = workspace;
            return this;
        }

        /**
         * @param workspace Name of the workspace the alias will be in.
         * 
         * @return builder
         * 
         */
        public Builder workspace(String workspace) {
            return workspace(Output.of(workspace));
        }

        public RocksetAliasState build() {
            return $;
        }
    }

}
