// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.collett.pulumi.rockset.inputs.RocksetQueryLambdaSqlArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetQueryLambdaState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetQueryLambdaState Empty = new RocksetQueryLambdaState();

    /**
     * Text describing the query lambda.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the query lambda.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="sqls")
    private @Nullable Output<List<RocksetQueryLambdaSqlArgs>> sqls;

    public Optional<Output<List<RocksetQueryLambdaSqlArgs>>> sqls() {
        return Optional.ofNullable(this.sqls);
    }

    /**
     * The latest state of this query lambda.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The latest state of this query lambda.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The latest version string of this query lambda.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The latest version string of this query lambda.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspace")
    private @Nullable Output<String> workspace;

    /**
     * @return The name of the workspace.
     * 
     */
    public Optional<Output<String>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private RocksetQueryLambdaState() {}

    private RocksetQueryLambdaState(RocksetQueryLambdaState $) {
        this.description = $.description;
        this.name = $.name;
        this.sqls = $.sqls;
        this.state = $.state;
        this.version = $.version;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetQueryLambdaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetQueryLambdaState $;

        public Builder() {
            $ = new RocksetQueryLambdaState();
        }

        public Builder(RocksetQueryLambdaState defaults) {
            $ = new RocksetQueryLambdaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Text describing the query lambda.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the query lambda.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sqls(@Nullable Output<List<RocksetQueryLambdaSqlArgs>> sqls) {
            $.sqls = sqls;
            return this;
        }

        public Builder sqls(List<RocksetQueryLambdaSqlArgs> sqls) {
            return sqls(Output.of(sqls));
        }

        public Builder sqls(RocksetQueryLambdaSqlArgs... sqls) {
            return sqls(List.of(sqls));
        }

        /**
         * @param state The latest state of this query lambda.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The latest state of this query lambda.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param version The latest version string of this query lambda.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The latest version string of this query lambda.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param workspace The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspace(@Nullable Output<String> workspace) {
            $.workspace = workspace;
            return this;
        }

        /**
         * @param workspace The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspace(String workspace) {
            return workspace(Output.of(workspace));
        }

        public RocksetQueryLambdaState build() {
            return $;
        }
    }

}
