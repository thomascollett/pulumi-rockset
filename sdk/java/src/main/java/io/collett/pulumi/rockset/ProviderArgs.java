// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The API key used to access Rockset
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return The API key used to access Rockset
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * The API server for accessing Rockset
     * 
     */
    @Import(name="apiServer")
    private @Nullable Output<String> apiServer;

    /**
     * @return The API server for accessing Rockset
     * 
     */
    public Optional<Output<String>> apiServer() {
        return Optional.ofNullable(this.apiServer);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.apiKey = $.apiKey;
        this.apiServer = $.apiServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The API key used to access Rockset
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key used to access Rockset
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiServer The API server for accessing Rockset
         * 
         * @return builder
         * 
         */
        public Builder apiServer(@Nullable Output<String> apiServer) {
            $.apiServer = apiServer;
            return this;
        }

        /**
         * @param apiServer The API server for accessing Rockset
         * 
         * @return builder
         * 
         */
        public Builder apiServer(String apiServer) {
            return apiServer(Output.of(apiServer));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}