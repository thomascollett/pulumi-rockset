// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetKafkaIntegrationArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetKafkaIntegrationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="rockset:index/rocksetKafkaIntegration:RocksetKafkaIntegration")
public class RocksetKafkaIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The Kafka bootstrap server url(s). Required only for V3 integration.
     * 
     */
    @Export(name="bootstrapServers", type=String.class, parameters={})
    private Output</* @Nullable */ String> bootstrapServers;

    /**
     * @return The Kafka bootstrap server url(s). Required only for V3 integration.
     * 
     */
    public Output<Optional<String>> bootstrapServers() {
        return Codegen.optional(this.bootstrapServers);
    }
    /**
     * Kafka connection string.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return Kafka connection string.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * Text describing the integration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Text describing the integration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
     * 
     */
    @Export(name="kafkaDataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> kafkaDataFormat;

    /**
     * @return The format of the Kafka topics being tailed. Possible values: JSON, AVRO.
     * 
     */
    public Output<Optional<String>> kafkaDataFormat() {
        return Codegen.optional(this.kafkaDataFormat);
    }
    /**
     * Kafka topics to tail.
     * 
     */
    @Export(name="kafkaTopicNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> kafkaTopicNames;

    /**
     * @return Kafka topics to tail.
     * 
     */
    public Output<Optional<List<String>>> kafkaTopicNames() {
        return Codegen.optional(this.kafkaTopicNames);
    }
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Kafka configuration for schema registry. Required only for V3 integration.
     * 
     */
    @Export(name="schemaRegistryConfig", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> schemaRegistryConfig;

    /**
     * @return Kafka configuration for schema registry. Required only for V3 integration.
     * 
     */
    public Output<Optional<Map<String,String>>> schemaRegistryConfig() {
        return Codegen.optional(this.schemaRegistryConfig);
    }
    /**
     * Kafka security configurations. Required only for V3 integration.
     * 
     */
    @Export(name="securityConfig", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> securityConfig;

    /**
     * @return Kafka security configurations. Required only for V3 integration.
     * 
     */
    public Output<Optional<Map<String,String>>> securityConfig() {
        return Codegen.optional(this.securityConfig);
    }
    /**
     * Use v3 for Confluent Cloud.
     * 
     */
    @Export(name="useV3", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useV3;

    /**
     * @return Use v3 for Confluent Cloud.
     * 
     */
    public Output<Optional<Boolean>> useV3() {
        return Codegen.optional(this.useV3);
    }
    /**
     * Wait until the integration is active.
     * 
     */
    @Export(name="waitForIntegration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForIntegration;

    /**
     * @return Wait until the integration is active.
     * 
     */
    public Output<Optional<Boolean>> waitForIntegration() {
        return Codegen.optional(this.waitForIntegration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetKafkaIntegration(String name) {
        this(name, RocksetKafkaIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetKafkaIntegration(String name, @Nullable RocksetKafkaIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetKafkaIntegration(String name, @Nullable RocksetKafkaIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetKafkaIntegration:RocksetKafkaIntegration", name, args == null ? RocksetKafkaIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetKafkaIntegration(String name, Output<String> id, @Nullable RocksetKafkaIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetKafkaIntegration:RocksetKafkaIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RocksetKafkaIntegration get(String name, Output<String> id, @Nullable RocksetKafkaIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetKafkaIntegration(name, id, state, options);
    }
}
