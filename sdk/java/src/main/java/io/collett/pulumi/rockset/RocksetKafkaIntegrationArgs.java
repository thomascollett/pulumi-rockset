// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetKafkaIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetKafkaIntegrationArgs Empty = new RocksetKafkaIntegrationArgs();

    /**
     * The Kafka bootstrap server url(s). Required only for V3 integration.
     * 
     */
    @Import(name="bootstrapServers")
    private @Nullable Output<String> bootstrapServers;

    /**
     * @return The Kafka bootstrap server url(s). Required only for V3 integration.
     * 
     */
    public Optional<Output<String>> bootstrapServers() {
        return Optional.ofNullable(this.bootstrapServers);
    }

    /**
     * Kafka connection string.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return Kafka connection string.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
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
     * The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
     * 
     */
    @Import(name="kafkaDataFormat")
    private @Nullable Output<String> kafkaDataFormat;

    /**
     * @return The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
     * 
     */
    public Optional<Output<String>> kafkaDataFormat() {
        return Optional.ofNullable(this.kafkaDataFormat);
    }

    /**
     * Kafka topics to tail.
     * 
     */
    @Import(name="kafkaTopicNames")
    private @Nullable Output<List<String>> kafkaTopicNames;

    /**
     * @return Kafka topics to tail.
     * 
     */
    public Optional<Output<List<String>>> kafkaTopicNames() {
        return Optional.ofNullable(this.kafkaTopicNames);
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

    /**
     * Kafka configuration for schema registry. Required only for V3 integration.
     * 
     */
    @Import(name="schemaRegistryConfig")
    private @Nullable Output<Map<String,String>> schemaRegistryConfig;

    /**
     * @return Kafka configuration for schema registry. Required only for V3 integration.
     * 
     */
    public Optional<Output<Map<String,String>>> schemaRegistryConfig() {
        return Optional.ofNullable(this.schemaRegistryConfig);
    }

    /**
     * Kafka security configurations. Required only for V3 integration.
     * 
     */
    @Import(name="securityConfig")
    private @Nullable Output<Map<String,String>> securityConfig;

    /**
     * @return Kafka security configurations. Required only for V3 integration.
     * 
     */
    public Optional<Output<Map<String,String>>> securityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }

    /**
     * Use v3 for Confluent Cloud.
     * 
     */
    @Import(name="useV3")
    private @Nullable Output<Boolean> useV3;

    /**
     * @return Use v3 for Confluent Cloud.
     * 
     */
    public Optional<Output<Boolean>> useV3() {
        return Optional.ofNullable(this.useV3);
    }

    /**
     * Wait until the integration is active.
     * 
     */
    @Import(name="waitForIntegration")
    private @Nullable Output<Boolean> waitForIntegration;

    /**
     * @return Wait until the integration is active.
     * 
     */
    public Optional<Output<Boolean>> waitForIntegration() {
        return Optional.ofNullable(this.waitForIntegration);
    }

    private RocksetKafkaIntegrationArgs() {}

    private RocksetKafkaIntegrationArgs(RocksetKafkaIntegrationArgs $) {
        this.bootstrapServers = $.bootstrapServers;
        this.connectionString = $.connectionString;
        this.description = $.description;
        this.kafkaDataFormat = $.kafkaDataFormat;
        this.kafkaTopicNames = $.kafkaTopicNames;
        this.name = $.name;
        this.schemaRegistryConfig = $.schemaRegistryConfig;
        this.securityConfig = $.securityConfig;
        this.useV3 = $.useV3;
        this.waitForIntegration = $.waitForIntegration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetKafkaIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetKafkaIntegrationArgs $;

        public Builder() {
            $ = new RocksetKafkaIntegrationArgs();
        }

        public Builder(RocksetKafkaIntegrationArgs defaults) {
            $ = new RocksetKafkaIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootstrapServers The Kafka bootstrap server url(s). Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder bootstrapServers(@Nullable Output<String> bootstrapServers) {
            $.bootstrapServers = bootstrapServers;
            return this;
        }

        /**
         * @param bootstrapServers The Kafka bootstrap server url(s). Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder bootstrapServers(String bootstrapServers) {
            return bootstrapServers(Output.of(bootstrapServers));
        }

        /**
         * @param connectionString Kafka connection string.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString Kafka connection string.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
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
         * @param kafkaDataFormat The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
         * 
         * @return builder
         * 
         */
        public Builder kafkaDataFormat(@Nullable Output<String> kafkaDataFormat) {
            $.kafkaDataFormat = kafkaDataFormat;
            return this;
        }

        /**
         * @param kafkaDataFormat The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
         * 
         * @return builder
         * 
         */
        public Builder kafkaDataFormat(String kafkaDataFormat) {
            return kafkaDataFormat(Output.of(kafkaDataFormat));
        }

        /**
         * @param kafkaTopicNames Kafka topics to tail.
         * 
         * @return builder
         * 
         */
        public Builder kafkaTopicNames(@Nullable Output<List<String>> kafkaTopicNames) {
            $.kafkaTopicNames = kafkaTopicNames;
            return this;
        }

        /**
         * @param kafkaTopicNames Kafka topics to tail.
         * 
         * @return builder
         * 
         */
        public Builder kafkaTopicNames(List<String> kafkaTopicNames) {
            return kafkaTopicNames(Output.of(kafkaTopicNames));
        }

        /**
         * @param kafkaTopicNames Kafka topics to tail.
         * 
         * @return builder
         * 
         */
        public Builder kafkaTopicNames(String... kafkaTopicNames) {
            return kafkaTopicNames(List.of(kafkaTopicNames));
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

        /**
         * @param schemaRegistryConfig Kafka configuration for schema registry. Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryConfig(@Nullable Output<Map<String,String>> schemaRegistryConfig) {
            $.schemaRegistryConfig = schemaRegistryConfig;
            return this;
        }

        /**
         * @param schemaRegistryConfig Kafka configuration for schema registry. Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryConfig(Map<String,String> schemaRegistryConfig) {
            return schemaRegistryConfig(Output.of(schemaRegistryConfig));
        }

        /**
         * @param securityConfig Kafka security configurations. Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder securityConfig(@Nullable Output<Map<String,String>> securityConfig) {
            $.securityConfig = securityConfig;
            return this;
        }

        /**
         * @param securityConfig Kafka security configurations. Required only for V3 integration.
         * 
         * @return builder
         * 
         */
        public Builder securityConfig(Map<String,String> securityConfig) {
            return securityConfig(Output.of(securityConfig));
        }

        /**
         * @param useV3 Use v3 for Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder useV3(@Nullable Output<Boolean> useV3) {
            $.useV3 = useV3;
            return this;
        }

        /**
         * @param useV3 Use v3 for Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder useV3(Boolean useV3) {
            return useV3(Output.of(useV3));
        }

        /**
         * @param waitForIntegration Wait until the integration is active.
         * 
         * @return builder
         * 
         */
        public Builder waitForIntegration(@Nullable Output<Boolean> waitForIntegration) {
            $.waitForIntegration = waitForIntegration;
            return this;
        }

        /**
         * @param waitForIntegration Wait until the integration is active.
         * 
         * @return builder
         * 
         */
        public Builder waitForIntegration(Boolean waitForIntegration) {
            return waitForIntegration(Output.of(waitForIntegration));
        }

        public RocksetKafkaIntegrationArgs build() {
            return $;
        }
    }

}
