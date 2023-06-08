// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetS3IntegrationArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetS3IntegrationState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset S3 Integration.
 * 
 */
@ResourceType(type="rockset:index/rocksetS3Integration:RocksetS3Integration")
public class RocksetS3Integration extends com.pulumi.resources.CustomResource {
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
    public RocksetS3Integration(String name) {
        this(name, RocksetS3IntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetS3Integration(String name, RocksetS3IntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetS3Integration(String name, RocksetS3IntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetS3Integration:RocksetS3Integration", name, args == null ? RocksetS3IntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetS3Integration(String name, Output<String> id, @Nullable RocksetS3IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetS3Integration:RocksetS3Integration", name, state, makeResourceOptions(options, id));
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
    public static RocksetS3Integration get(String name, Output<String> id, @Nullable RocksetS3IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetS3Integration(name, id, state, options);
    }
}
