// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetMongodbIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetMongodbIntegrationState Empty = new RocksetMongodbIntegrationState();

    /**
     * MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
     * 
     */
    @Import(name="connectionUri")
    private @Nullable Output<String> connectionUri;

    /**
     * @return MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
     * 
     */
    public Optional<Output<String>> connectionUri() {
        return Optional.ofNullable(this.connectionUri);
    }

    /**
     * Text describing the integration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the integration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RocksetMongodbIntegrationState() {}

    private RocksetMongodbIntegrationState(RocksetMongodbIntegrationState $) {
        this.connectionUri = $.connectionUri;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetMongodbIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetMongodbIntegrationState $;

        public Builder() {
            $ = new RocksetMongodbIntegrationState();
        }

        public Builder(RocksetMongodbIntegrationState defaults) {
            $ = new RocksetMongodbIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionUri MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
         * 
         * @return builder
         * 
         */
        public Builder connectionUri(@Nullable Output<String> connectionUri) {
            $.connectionUri = connectionUri;
            return this;
        }

        /**
         * @param connectionUri MongoDB connection URI string. The password is scrubbed from the URI when fetched by the API so this field is NOT set on imports and reads.
         * 
         * @return builder
         * 
         */
        public Builder connectionUri(String connectionUri) {
            return connectionUri(Output.of(connectionUri));
        }

        /**
         * @param description Text describing the integration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the integration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Unique identifier for the integration. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the integration. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RocksetMongodbIntegrationState build() {
            return $;
        }
    }

}