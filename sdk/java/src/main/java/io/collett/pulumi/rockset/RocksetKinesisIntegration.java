// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetKinesisIntegrationArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetKinesisIntegrationState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset Kinesis Integration.
 * 
 */
@ResourceType(type="rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration")
public class RocksetKinesisIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The AWS Role Arn to use for this integration.
     * 
     */
    @Export(name="awsRoleArn", refs={String.class}, tree="[0]")
    private Output<String> awsRoleArn;

    /**
     * @return The AWS Role Arn to use for this integration.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }
    /**
     * Text describing the integration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Text describing the integration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetKinesisIntegration(String name) {
        this(name, RocksetKinesisIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetKinesisIntegration(String name, RocksetKinesisIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetKinesisIntegration(String name, RocksetKinesisIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, args == null ? RocksetKinesisIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetKinesisIntegration(String name, Output<String> id, @Nullable RocksetKinesisIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, state, makeResourceOptions(options, id));
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
    public static RocksetKinesisIntegration get(String name, Output<String> id, @Nullable RocksetKinesisIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetKinesisIntegration(name, id, state, options);
    }
}