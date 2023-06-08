// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetQueryLambdaTagState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetQueryLambdaTagState Empty = new RocksetQueryLambdaTagState();

    /**
     * Unique identifier for the tag. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the tag. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="queryLambda")
    private @Nullable Output<String> queryLambda;

    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> queryLambda() {
        return Optional.ofNullable(this.queryLambda);
    }

    /**
     * Version of the query lambda this tag should point to.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the query lambda this tag should point to.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The name of the workspace the query lambda is in.
     * 
     */
    @Import(name="workspace")
    private @Nullable Output<String> workspace;

    /**
     * @return The name of the workspace the query lambda is in.
     * 
     */
    public Optional<Output<String>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private RocksetQueryLambdaTagState() {}

    private RocksetQueryLambdaTagState(RocksetQueryLambdaTagState $) {
        this.name = $.name;
        this.queryLambda = $.queryLambda;
        this.version = $.version;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetQueryLambdaTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetQueryLambdaTagState $;

        public Builder() {
            $ = new RocksetQueryLambdaTagState();
        }

        public Builder(RocksetQueryLambdaTagState defaults) {
            $ = new RocksetQueryLambdaTagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique identifier for the tag. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the tag. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryLambda Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder queryLambda(@Nullable Output<String> queryLambda) {
            $.queryLambda = queryLambda;
            return this;
        }

        /**
         * @param queryLambda Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder queryLambda(String queryLambda) {
            return queryLambda(Output.of(queryLambda));
        }

        /**
         * @param version Version of the query lambda this tag should point to.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the query lambda this tag should point to.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param workspace The name of the workspace the query lambda is in.
         * 
         * @return builder
         * 
         */
        public Builder workspace(@Nullable Output<String> workspace) {
            $.workspace = workspace;
            return this;
        }

        /**
         * @param workspace The name of the workspace the query lambda is in.
         * 
         * @return builder
         * 
         */
        public Builder workspace(String workspace) {
            return workspace(Output.of(workspace));
        }

        public RocksetQueryLambdaTagState build() {
            return $;
        }
    }

}
