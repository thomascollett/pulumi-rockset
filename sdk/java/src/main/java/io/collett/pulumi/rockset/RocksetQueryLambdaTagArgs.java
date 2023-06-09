// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetQueryLambdaTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetQueryLambdaTagArgs Empty = new RocksetQueryLambdaTagArgs();

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
    @Import(name="queryLambda", required=true)
    private Output<String> queryLambda;

    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> queryLambda() {
        return this.queryLambda;
    }

    /**
     * Version of the query lambda this tag should point to.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Version of the query lambda this tag should point to.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     * The name of the workspace the query lambda is in.
     * 
     */
    @Import(name="workspace", required=true)
    private Output<String> workspace;

    /**
     * @return The name of the workspace the query lambda is in.
     * 
     */
    public Output<String> workspace() {
        return this.workspace;
    }

    private RocksetQueryLambdaTagArgs() {}

    private RocksetQueryLambdaTagArgs(RocksetQueryLambdaTagArgs $) {
        this.name = $.name;
        this.queryLambda = $.queryLambda;
        this.version = $.version;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetQueryLambdaTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetQueryLambdaTagArgs $;

        public Builder() {
            $ = new RocksetQueryLambdaTagArgs();
        }

        public Builder(RocksetQueryLambdaTagArgs defaults) {
            $ = new RocksetQueryLambdaTagArgs(Objects.requireNonNull(defaults));
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
        public Builder queryLambda(Output<String> queryLambda) {
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
        public Builder version(Output<String> version) {
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
        public Builder workspace(Output<String> workspace) {
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

        public RocksetQueryLambdaTagArgs build() {
            $.queryLambda = Objects.requireNonNull($.queryLambda, "expected parameter 'queryLambda' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            $.workspace = Objects.requireNonNull($.workspace, "expected parameter 'workspace' to be non-null");
            return $;
        }
    }

}
