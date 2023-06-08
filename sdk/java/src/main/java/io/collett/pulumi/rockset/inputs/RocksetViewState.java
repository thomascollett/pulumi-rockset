// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetViewState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetViewState Empty = new RocksetViewState();

    /**
     * The user who created the view.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The user who created the view.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

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
     * Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SQL query used for thw view.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return SQL query used for thw view.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Workspace name.
     * 
     */
    @Import(name="workspace")
    private @Nullable Output<String> workspace;

    /**
     * @return Workspace name.
     * 
     */
    public Optional<Output<String>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private RocksetViewState() {}

    private RocksetViewState(RocksetViewState $) {
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.name = $.name;
        this.query = $.query;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetViewState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetViewState $;

        public Builder() {
            $ = new RocksetViewState();
        }

        public Builder(RocksetViewState defaults) {
            $ = new RocksetViewState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdBy The user who created the view.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The user who created the view.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
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
         * @param name Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param query SQL query used for thw view.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query SQL query used for thw view.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param workspace Workspace name.
         * 
         * @return builder
         * 
         */
        public Builder workspace(@Nullable Output<String> workspace) {
            $.workspace = workspace;
            return this;
        }

        /**
         * @param workspace Workspace name.
         * 
         * @return builder
         * 
         */
        public Builder workspace(String workspace) {
            return workspace(Output.of(workspace));
        }

        public RocksetViewState build() {
            return $;
        }
    }

}
